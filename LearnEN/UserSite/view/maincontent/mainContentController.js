'use strict'
userSite.controller('mainContentContrller', function($http,contentServices,$scope){
	contentServices.getAllContent().then(function(res){
		$scope.listContent = res.data;
	}, function(error){

	});
});