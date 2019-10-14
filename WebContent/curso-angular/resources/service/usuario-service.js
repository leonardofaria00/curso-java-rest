moduloPrincipal.service("UsuarioService", UsuarioService);

UsuarioService.$inject = ["$http"];

function UsuarioService($http) {
  const self = this;

  self.getUsuarios = function() {
    $http
      .get("http://localhost.stefanini:8080/curso-java-rest/pessoa")
      .success(callback);
  };
}
