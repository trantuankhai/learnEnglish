'use strict'
loginApp.controller('loginController', function($scope,$http,serviceLogin,$window,$interval){
	$scope.login = function (){
		serviceLogin.login($scope.passWord,$scope.userName).then(function(res){
			console.log(res.data);
			if(res.data == 'NONE_ACTIVE'){
				swal({
					title: "Tài khoản chưa được kích hoạt!",
					text: "Vui lòng kiểm tra email để kích hoạt!",
					icon: "warning",
					button: "Xác nhận!",
				});
			}else if(res.data == 'ACOUNT_NOT_AVALABLE'){
					swal({
					title: "Tài khoản hoặc mật khẩu chưa chính sác!",
					text: "Vui lòng kiểm tra lại hoặc đăng ký mới!",
					icon: "error",
					button: "Xác nhận!",
				});
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
