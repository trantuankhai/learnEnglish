userSite.controller('learnController', function($http,$scope,$rootScope,$routeParams){
$http.get($rootScope.link+"question/"+$routeParams.idLesionDetail+"/"+$routeParams.idType+"/"+$routeParams.order).then(function(res){
	$scope.listLearn = res.data;
	console.log(res.data);
}, function(error){

});
$scope.nextBaiHoc = function(order){
		var orderLearn = Number(order)+1;
	$http.get($rootScope.link+"question/"+$routeParams.idLesionDetail+"/"+$routeParams.idType+"/"+orderLearn).then(function(res){
	$scope.listLearn = res.data;
	console.log(res.data);
	}, function(error){

	})
};
$scope.prevBaiHoc = function(order){
		var orderLearn = Number(order)-1;
		if(orderLearn <=0){
			$scope.isDisable = true;
		}else{
		$scope.isDisable = false;
	$http.get($rootScope.link+"question/"+$routeParams.idLesionDetail+"/"+$routeParams.idType+"/"+orderLearn).then(function(res){
	$scope.listLearn = res.data;
	console.log(res.data);
	}, function(error){

	})
		}
	
};
	
});