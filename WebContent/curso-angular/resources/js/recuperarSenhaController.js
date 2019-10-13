moduloPrincipal.controller("recuperarSenhaController", RecuperarSenhaController);
    RecuperarSenhaController.$inject = [$scope];
function RecuperarSenhaController(){
const self = this;

self.recuperarSenha = function(email){
console.log(email);
};
};
