userSite.controller('typeController', function($rootScope,$scope,$routeParams,$http){
	$http.get($rootScope.link+"lession/type/"+$routeParams.idLesionDetail).then(function(res){
		$scope.listQuestion = res.data;
		console.log(res.data);
		$scope.nameLesion = res.data[0].basicGrammarDetail.title;
	}, function(error){
		console.log(error);
	});
});