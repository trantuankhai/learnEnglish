'use strict'
loginApp.controller('registerController', function($scope,$http,serviceRegister,$window,$interval){
	$scope.register = function (){
		serviceRegister.register($scope.email,$scope.fullName,$scope.passWord,$scope.userName).then(function(res){
			console.log(res.data);
			if(res.data == -1){
				swal({
					title: "Đăng ký thất bại!",
					text: "Vui lòng liên hệ với quản trị viên!",
					icon: "error",
					button: "Xác nhận!",
				});
			}else if(res.data == -2){
					swal({
					title: "Tài khoản đã tồn tại!",
					text: "Mời bạn nhập tài khoản khác!",
					icon: "warning",
					button: "Xác nhận!",
				});
			$scope.email= null;
			$scope.fullName = null;
			$scope.passWord = null ;
			$scope.userName = null;
				
			}else{
				swal({
					title: "Đăng ký thành công!",
					text: "Kiểm tra email để kích hoạt!",
					icon: "success",
					button: "Xác nhận!",
				});
				var nextStep = setInterval(function()
				{
				$window.location.href='../Login';
				},3000);

			}
		}, function(error){
			console.log(error);

		});
	}
	
})
