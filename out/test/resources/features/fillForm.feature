#language: es
Característica: Test Formulario de pago y envio zonaFit.co
 Esquema del escenario: : Diligenciar el formulario de pago y envio de forma exitosa
    Dado a que el usuario ya agrego productos al carrito de compras
    Cuando diligencia el formulario de pago y envio
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


    Entonces el usuario que su informacion de pago y envio se guardo
   Ejemplos:
     |documento |email|nombre|apellido|departamento|municipio|direccion|complemento|celular|notas|
    |1234567890|prueba@mail.com|Prueba|Serenity|Antioquia|Medellin - 050001| Cra 101 # 24-78|Castilla|3004784358|Zonabit.co es lo mejor|