#language: es
Característica: Test Detalle pedido  zonaFit.co

Esquema del escenario: Pedido no completado
Dado a que el usuario esta en el menu principal de la pagina
Cuando va a la seccion de ofertas y agrega productos al carrito
Y diligencio el formulario de pago y envio con un formato de email no valido
|documento|<documento>|
|email|<email>|
|nombre|<nombre>|
|apellido|<apellido>|
|departamento|<departamento>|
|municipio|<municipio>|
|direccion|<direccion>|
|complemento|<complemento>|
|celular|<celular>|
|notas|<notas>|
Entonces el usuario ve que su pedido no se completa hasta que corriga el error
Ejemplos:
| documento | email | nombre | apellido | departamento | municipio | direccion | complemento | celular | notas |
|1234567890||Prueba|Serenity|Antioquia|Medellin - 050001| Cra 101 # 24-78|Castilla|3004784358|Zonabit.co es lo mejor|