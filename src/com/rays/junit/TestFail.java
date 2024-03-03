package com.rays.junit;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

import com.rays.junit.*;
import com.rays.junit.UserDTO;;

public class TestFail {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(4);
		bean.setName("paras");
		bean.setSalary(50000);

		UserModel4.add(bean);

		bean = UserModel4.findByPk(6);

		if (bean == null) {

			fail("Record is not added...!!!");

		} else {
			System.out.println("record is added..!!!");
		}

	}

}