moduloPrincipal.controller("UsuarioController", UsuarioController);

UsuarioController.$inject = ["$scope", "$rootScope", "UsuarioService"];

function UsuarioController($scope, $rootScope, UsuarioService) {
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

  self.buscar = function(){
    $scope.usarios = UsuarioService.getUsuarios;
    console.log(UsuarioService.getUsuarios);
  }
}
