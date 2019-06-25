'use strict'
loginApp.controller('registerController', function($scope,$http,serviceSregister){
	$scope.register = function (){
		serviceSregister.register($scope.email,$scope.fullName,$scope.passWord,$scope.userName).then(function(res){
			console.log(res.data);
			if(res.data != -1){
				swal("Đăng ký thành công", "Kiểm tra email để kích hoạt", "success");
			}
		}, function(error){
			console.log(error);

		});
	}
	
})
 