#language: es
Característica: Test Detalle pedido  zonaFit.co
  Esquema del escenario: El detalle del pedido realizado se muestra de forma exitosa
    Dado a que el usuario esta en el menu principal de la pagina
    Cuando va a la seccion de ofertas y agrega productos al carrito
    Y diligencia el formulario de pago y envio
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

    Entonces el usuario ve el detalle del pedido realizado de forma exitosa
    Ejemplos:
      | documento | email | nombre | apellido | departamento | municipio | direccion | complemento | celular | notas |
      |1234567890|prueba@mail.com|Prueba|Serenity|Antioquia|Medellin - 050001| Cra 101 # 24-78|Castilla|3004784358|Zonabit.co es lo mejor|


