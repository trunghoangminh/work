(function () {
    'use strict'
    angular.module(['WorkApp']).controller('HomeController', HomeController);

    HomeController.$inject = ['$scope', '$http'];

    function HomeController($scope, $http) {
        $scope.message = "Spring MVC + angular demo";
        console.log("123123123123123");
        console.log("123");
        $http({
            method: 'GET',
            url: './'
        }).success(function (res) {
            console.log(res);
        }).error(function (err) {
            console.log(err);
        });
    }
})();