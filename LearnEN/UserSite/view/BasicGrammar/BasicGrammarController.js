'use strict'
userSite.controller('BasicGrammarController',function($http,$scope,serviceBasicGrammar){
	serviceBasicGrammar.getBasicGrammar().then(function(res){
		$scope.listBasicGrammar = res.data;
	},function(error){
		console.log(error);
	});

});
userSite.controller('basicGrammarDetailController',function($http,$scope,serviceBasicGrammar,$routeParams){
	serviceBasicGrammar.getBasicGrammarDetail($routeParams.idbasicgramardetail).then(function(res){
		$scope.listBasicGrammarDetail = res.data;
	},function(error){
		console.log(error);
	});

});