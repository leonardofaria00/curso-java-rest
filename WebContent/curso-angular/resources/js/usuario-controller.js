moduloPrincipal.controller("UsuarioController", UsuarioController);

UsuarioController.$inject = ["$scope", "$rootScope"];

function UsuarioController($scope, $rootScope) {
  const self = this;
  self.usuario = {
    nome: "",
    cpf: "",
    email: "",
    senha: ""
  };

  self.add = function(usuario) {
    console.log("adicionando...");
    console.log(usuario);
    $rootScope.usuario = usuario;
    console.log($rootScope.usuario.nome);
  };
}
