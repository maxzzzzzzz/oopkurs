var app = angular.module("laba3", []);
app.controller("TransportationController", function ($scope,$http) {
    $scope.trans = [];
    $http.get('http://localhost:8080/api/trans').then(function (response){
        $scope.trans=response.data;
        console.log(response);
    });
});