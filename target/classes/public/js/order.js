
var app = angular.module("laba3", []);
app.controller("OrderController", function ($scope,$http) {
    $scope.orders = [];
    $http.get('http://localhost:8080/api/order').then(function (response){
        $scope.orders=response.data;
        console.log(response);
    });
});