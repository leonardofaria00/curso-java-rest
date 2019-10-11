const moduloPrincipal =
    angular.module("appPrincipal", []);

moduloPrincipal.
controller("homeApp", HomeController);

HomeController.$inject = ["$scope"];

function HomeController($scope) {
    $scope.nome = "Leonardo Faria";
}