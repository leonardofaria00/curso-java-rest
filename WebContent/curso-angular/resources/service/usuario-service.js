moduloPrincipal.service("UsuarioService", UsuarioService);

UsuarioService.$inject = [];

function UsuarioService() {
  const self = this;

  self.getUsuarios = function() {
    return {
      success: {
        message: "Welcome to Awesome JSON Viewer.",
        status_code: 200
      }
    };
    // return "http://localhost.stefanini:8080/curso-java-rest/";
  };
}
