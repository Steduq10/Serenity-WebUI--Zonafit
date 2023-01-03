#language: es
Característica: Test Detalle pedido  zonaFit.co
  Esquema del escenario: escenario: : El detalle del pedido realizado se muestra de forma exitosa
    Dado a que el usuario ya agrego productos al carrito de compras y diligencio el formulario de pago y envio
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
    Cuando ingresa a la zona de pedido completado
    Entonces el usuario ve el detalle del pedido realizado de forma exitosa
    Ejemplos:
      | documento | email | nombre | apellido | departamento | municipio | direccion | complemento | celular | notas |
      |1234567890|prueba@mail.com|Prueba|Serenity|Antioquia|Medellin - 050001| Cra 101 # 24-78|Castilla|3004784358|Zonabit.co es lo mejor|