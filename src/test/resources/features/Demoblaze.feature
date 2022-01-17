#language: es

  Característica: Crear cuenta de usuario en demoblaze.com
    Como nuevo cliente
    Quiero ingresar a la pagina demoblaze.com
    Para crear una nueva cuenta de usuario

  @Test01
  Esquema del escenario: : Crear cuenta de usuario correctamente
    Dado Que un cliente no existente accede a la web
    Cuando Ingresa a la opcion de registro de usuario completar el formulario de registro de manera correcta
      | <username> | <password> |
    Entonces Se crea la cuenta correctamente
    Ejemplos:
    | username | password |
    | user001  | pass001  |
