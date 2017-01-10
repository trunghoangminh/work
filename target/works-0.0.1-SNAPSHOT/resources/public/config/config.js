(function() {
	'use strict';
	angular.module('WorkApp').config(config).run(run);

	config.$inject = [ '$locationProvider', '$routeProvider' ];

	run.$inject = [ '$rootScope', '$location' ];

	function config($locationProvider, $routeProvider) {

		$routeProvider.when('/', {
			templateUrl : 'views/home.html',
			cache : false
		}).when('/products', {
			templateUrl : 'views/product.html',
			cache : false
		}).when('/home', {
			redirectTo : "/"
		}).otherwise({
			redirectTo : "/404-not-found",
			templateUrl : 'views/404.html',
			cache : false
		});

		// $locationProvider.html5Mode(true);
		$locationProvider.html5Mode({
			enabled : true,
			requireBase : false
		});
	}

	function run($rootScope, $location) {

	}

})();