moduloPrincipal.controller("LoginController", LoginController);

LoginController.$inject = ["$scope", "$rootScope"];

function LoginController($scope, $rootScope) {
  const self = this;

  self.usuario = {
    email: null,
    senha: null
  };

  self.login = function(usuario) {
    $rootScope.usuario = usuario;
    $rootScope.telaSelecionada = $rootScope.telas[2];
  };
}
