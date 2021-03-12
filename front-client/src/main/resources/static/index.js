angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/cloud/front';
    $scope.authorized = false;

    $scope.fillTable = function () {
        $http({
            url: contextPath,
            method: 'GET'
        }).then(function (response) {
            $scope.Products = response.data;
        });
    };

    $scope.fillTable();
});