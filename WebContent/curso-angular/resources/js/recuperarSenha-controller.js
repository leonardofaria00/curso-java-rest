moduloPrincipal.controller("RecuperarSenhaController",
    RecuperarSenhaController);

RecuperarSenhaController.$inject = ["$scope", "$rootScope"];

function RecuperarSenhaController($scope, $rootScope) {
    const self = this;

    self.recuperarSenha = function (email) {
        console.log(email);
        $rootScope.telaSelecionada = $rootScope.telas[0];
    };

    self.voltar = function () {
        $rootScope.telaSelecionada = $rootScope.telas[0];
    };

}