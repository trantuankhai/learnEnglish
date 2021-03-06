'use strict'
loginApp.controller('loginController', function($scope,$http,serviceLogin,$window,$interval){
	$scope.login = function (){
		serviceLogin.login($scope.passWord,$scope.userName).then(function(res){
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
					title: "Đăng nhập thành công!",
					text: "Vui lòng chờ trong ít phút để vào hệ thống",
					icon: "success",
					button: "Xác nhận!",
				});
			$window.localStorage.setItem('token',res.data);
			$http.defaults.headers.common.Authorization = 'Bearer ' +res.data;
			serviceLogin.resolveToken().then(function(res){
				if(res.data.role == "USER"){
				var nextStep = setInterval(function()
				{
				$window.location.href="../UserSite";
				},2000);
				}else{
				console.log('chuyen den trang admin');
				var nextStep = setInterval(function()
				{
				$window.location.href="../AdminSite";
				},2000);
				}
			},function(error){
				console.log(error);
			})
			}
		}, function(error){
			console.log(error);

		});
	}
	
})
