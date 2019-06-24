import React from 'react';
class Login extends React.Component {
  render()
  {
  return (
	<div className="register-form form-dang-ky"  data-aos="zoom-in-left"  data-aos-delay="300"  data-aos-easing="ease" data-aos-duration="1500">
		<form className="register-form__inner" id="form-t">
			<div className="register-form__title">ĐĂNG KÝ TÀI KHOẢN</div>
				<input type="text" name="text" placeholder="Tên đăng nhập" id="userName" />
				<input type="password" name="email" placeholder="Mật khẩu" id="form-email-p" />
				<input type="submit" value="Đăng Nhập" id="form-submit-t" />
				<div className="register-form__text">Hotline tư vấn miễn phí: <a href="tel:098 193 7066">098 193 7066</a>
				</div>
		</form>
	</div>
  );
 } 
}
export default Login;