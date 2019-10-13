moduloPrincipal.service("UsuarioService", UsuarioService);

UsuarioService.$inject = [];

function UsuarioService() {
  const self = this;

  self.getUsuario = function() {
    return "http://localhost.stefanini:8080/curso-java-rest/";
  };
}
