package com.vn.tdk.learnenglish.sevices;

import java.util.List;

import com.vn.tdk.learnenglish.entity.ActiveUser;

public interface ActiverUserServices extends services<ActiveUser> {
	public List<ActiveUser> getByUserName(int userName);
}
