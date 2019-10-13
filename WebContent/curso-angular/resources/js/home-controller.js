moduloPrincipal.controller("HomeController", HomeController);

HomeController.$inject = [
  "$scope",
  "$rootScope"
];

function HomeController($scope, $rootScope) {
  const self = this;

  self.idade = "24";
  self.nome = "Leonardo Faria";

  // self.service = LoginService;

  $rootScope.telas = ["LOGIN", "RECUPERAR_SENHA", "HOME"];
  $rootScope.telaSelecionada = $rootScope.telas[0];

  self.abrirTelaRecuperarSenha = function() {
    $rootScope.telaSelecionada = $rootScope.telas[1];
    console.log("Tela Recuperar senha");
  };
}
