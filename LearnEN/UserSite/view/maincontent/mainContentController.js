'use strict'
userSite.controller('mainContentContrller', function($http,contentServices,$scope){
	contentServices.getAllContent().then(function(res){
		$scope.listContent = res.data;
	}, function(error){

	});
$('.theme').attr('data-aos','zoom-in-right');
});
// $(document).ready(function(){

// 	
// });
