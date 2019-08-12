'use strict'
userSite.controller('BasicGrammarController',function($http,$scope,serviceBasicGrammar){
	serviceBasicGrammar.getBasicGrammar().then(function(res){
		$scope.listBasicGrammar = res.data;
		console.log(res.data);
	},function(error){
		console.log(error);
	});
});