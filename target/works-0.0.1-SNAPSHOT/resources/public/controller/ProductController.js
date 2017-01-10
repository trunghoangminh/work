(function () {
    'use strict'
    angular.module(['WorkApp']).controller('ProductController',
        ProductController);

    ProductController.$inject = ['$scope', '$http'];

    function ProductController($scope, $http) {

        console.log("123123");
        $http({
            method: 'GET',
            url: './products'
        }).success(function (res) {
            console.log(res);
            //$scope.value = res;
        }).error(function (err) {
            console.log(err);
        });
        console.log("----------------------------------");
        $http({
            method: 'GET',
            url: './123'
        }).success(function (res) {
            console.log(res);
        }).error(function (err) {
            console.log(err);
        });
    }
})();