# springboot-pedidos

############## Muchos a Muchos Bidireccional ###########

    @ManyToMany // relacion de muchos a muchos en el mismo objeto
    
    @ManyToMany                         @ManyToMany
    Objeto1                 -------->   Objeto2

    Set<Objeto2> objeto2    -------->   Set<Objeto1> objeto1 












    @JoinTable(
            name = "nombre_tabla_relacion",
            joinColumns = @JoinColumn( name = "id_propio_objeto"),
            inverseJoinColumns = @JoinColumn(name = "id_del_otro_objeto")
    )

    @JsonIgnore // sobre el objeto relacion, sobre el campo propio

    @JsonIgnoreProperties( "objeto_relacion" ) //ignora objetos, campos del objeto relacion

    @JsonIgnoreProperties( { "objeto_relacion", "campos_del_objeto_relacion", ... } )

    // PROBLEMA : que pasa si quisieramos agregar campos a la relacion?

    ############## Muchos a Muchos Unidireccional ###########    

    // Se debe crear un nuevo objeto (objeto_relacion) como una entidad comun @Entity, 
    con un id propio mas los id de las tablas relacionadas. Estos ids se deben anotar con @ManyToOne desde el objeto_relacion hacia los objetos relacionados

    @ManyToOne                  (muchos a uno)
    objeto_relacion ------->    objeto1

    private Objeto1 objeto1

    @OneToMany
    objeto1         ------->    objeto_relacion

    Set<objeto_relacion> objeto_relacion;

*****************************************************

    @ManyToOne                  (muchos a uno)
    objeto_relacion ------->    objeto2

    private Objeto2 objeto2

    @OneToMany
    objeto2         ------->    objeto_relacion
    
    Set<objeto_relacion> objeto_relacion;

    a esto podemos anadir tambien atributos nuevo como cualquier objeto




    /*

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @JsonIgnoreProperties("compras" )
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    Cliente cliente;

    @JsonIgnoreProperties( { "compras", "nombreProducto"} )
    @ManyToOne
    @JoinColumn(name = "producto_id")
    Producto producto;

    @Column( name = "fecha_compra", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCompra;

    private int cantidad;

    private double precio;

    */
    


###################### UNO A UNO ########################

Tenga en cuenta que colocamos la  anotación @OneToOne  en el campo de la entidad relacionada,  Dirección .

Además, debemos colocar la  anotación @JoinColumn  para configurar el nombre de la columna en la  tabla de usuarios que se asigna a la clave principal en la  tabla de direcciones . Si no proporcionamos un nombre, Hibernate seguirá algunas reglas para seleccionar uno predeterminado.

Finalmente, tenga en cuenta en la siguiente entidad que no usaremos la anotación @JoinColumn  allí. Esto se debe a que solo lo necesitamos en el lado propietario de la relación de clave externa. En pocas palabras, el propietario de la columna de clave externa obtiene la  anotación @JoinColumn .

############## @OneToOne

Objeto propietario( User )


@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id", referencedColumnName = "id")
private Address address;

Objeto relacion ( Address )
@OneToOne(mappedBy = "address")
private User user;