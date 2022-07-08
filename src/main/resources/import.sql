/* CLIENTES */

INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Juan Pablo',        'MIRTHA'       ,'HEREDIA'   , 'juanpablo@gmail.com     ', '11190' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Alicia Jesús',     	'ARIEL PEDRO'  ,'NINA'      , 'alanjacinto@gmail.com   ', '11191' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Andrea Josefina',  	'MIGUEL SANTOS','GARCIA'    , 'aliciajesús@gmail.com   ', '11192' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Andrés Juan',      	'EDDY'         ,'NINA'      , 'andreajosefina@gmail.com', '11193' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Antonia Juana',     'ABRAHAM'      ,'MOROCHI'   , 'andrésjuan@gmail.com    ', '11194' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Gerardo Marcos',    'FRANZ'        ,'NINACHOQUE', 'antoniajuana@gmail.com  ', '11195' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Gonzalo Mariano',   'OSCAR'        ,'FUENTES'   , 'gonzalomariano@gmail.com', '11196' );
INSERT INTO public.clientes ( nombres, paterno, materno, email, nit_cliente ) VALUES ( 'Gustavo Martín',    'FERNANDO'     ,'MAMANI'    , 'gustavomartin@gmail.com ', '11197' );


/* PRODUCTOS */
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'PAN-001',  'PANTALON',  'AZUL'    , 'PANTALON COLOR AZUL'    );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'BLU-002',  'BLUSA'   ,  'AMARILLO', 'BLUSA    COLOR AMARILLO');
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'CAM-003',  'CAMISA'  ,  'ROJO'    , 'CAMISA   COLOR ROJO'    );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'GOR-004',  'GORRA'   ,  'VERDE'   , 'GORRA    COLOR VERDE'   );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'TEN-005',  'TENIS'   ,  'CELESTE' , 'TENIS    COLOR CELESTE' );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'POL-006',  'POLERA'  ,  'GRIS'    , 'POLERA   COLOR GRIS'    );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'CHA-007',  'CHAMARRA',  'MORADO'  , 'CHAMARRA COLOR MORADO'  );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'VES-008',  'VESTIDO' ,  'ROJO'    , 'VESTIDO  COLOR ROJO'    );
INSERT INTO public.productos ( codigo_producto, nombre_producto, color, descripcion ) VALUES ( 'BUS-009',  'BUSO'    ,  'AZUL'    , 'BUSO     COLOR AZUL'    );

/* PROVEEDORES */

INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22290',  'MAYORISTA-PANTALONES' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22291',  'MAYORISTA-BLUSAS    ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22292',  'MAYORISTA-CAMISAS   ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22293',  'MAYORISTA-GORRAS    ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22294',  'MAYORISTA-TENIS     ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22295',  'MAYORISTA-POLERAS   ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22296',  'MAYORISTA-CHAMARRAS ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22297',  'MAYORISTA-VESTIDOS  ' );
INSERT INTO public.proveedores ( nit_proveedor, nombre_proveedor ) VALUES ( '22298',  'MAYORISTA-BUSOS     ' );


/* DIRECCIONES */
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'VILLA ARMONIA'    , 'CALLE 8'         , '25'  );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'SOPOCACHI'        , 'NIEVES LINARES'  , '14'  );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'MIRAFLORES'       , 'OVANDO'          , '2'   );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'SAN ANTONIO'      , 'EEUU'            , '22'  );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'LA PORTADA'       , 'BRASIL'          , '34'  );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'OBRAJES'          , 'CALLE 16'        , '203' );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'CALACOTO'         , 'JUAN 23'         , '239' );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'VILLA COPACABANA' , 'AV BUENOS AIRES' , '165' );
INSERT INTO public.direcciones ( zona, calle, numero ) VALUES ( 'GARITA'           , 'CARRASCO'        , '102' );

INSERT INTO public.producto_cliente ( cliente_id, producto_id, cantidad, fecha_compra ) VALUES ( 1, 2, 2, '2020-02-23 09:45:00' );
INSERT INTO public.producto_cliente ( cliente_id, producto_id, cantidad, fecha_compra ) VALUES ( 2, 2, 2, '2020-03-23 09:45:00' );
INSERT INTO public.producto_cliente ( cliente_id, producto_id, cantidad, fecha_compra ) VALUES ( 3, 2, 2, '2020-04-23 09:45:00' );
INSERT INTO public.producto_cliente ( cliente_id, producto_id, cantidad, fecha_compra ) VALUES ( 4, 1, 4, '2020-02-22 09:45:00' );
INSERT INTO public.producto_cliente ( cliente_id, producto_id, cantidad, fecha_compra ) VALUES ( 3, 4, 5, '2020-02-22 09:45:00' );
INSERT INTO public.producto_cliente ( cliente_id, producto_id, cantidad, fecha_compra ) VALUES ( 3, 5, 6, '2020-06-21 09:45:00' );



