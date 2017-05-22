var app = angular.module("laba3", []);
app.controller("ClientController", function ($scope,$http) {
    $scope.clients = [];
    $http.get('http://localhost:8080/api/client').then(function (response){
        $scope.clients=response.data;
        console.log(response);
    });
});