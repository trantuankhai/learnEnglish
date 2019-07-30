'use strict'
userSite.controller('verbController',  function($http,serviceVerb,$scope){

	serviceVerb.getVerb(1).then(function(res) {
		$scope.listLesson = res.data;
	},function(error){
		console.log(error);
	})
});