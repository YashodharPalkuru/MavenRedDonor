package com.reddonor.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.reddonor.dao.RedDonorDao;
import com.reddonor.entity.LoginBean;
import com.reddonor.entity.UserBean;


import facebook4j.Facebook;
import facebook4j.FacebookFactory;

public class RedDonorServiceImpl implements RedDonorService{
	
	private RedDonorDao redDonorDao;
	
	public void isAvailable(int drMobile) {
		
	}

	public LoginBean login(String username, String drPswd) throws SQLException {
		
		LoginBean loginBean = new LoginBean();
		loginBean.setStatus(Boolean.FALSE);
		try
		{
		if(redDonorDao.login(username, drPswd)){
			//create a csrf token
			String csrfToken = generateCsrfToken(username, drPswd);
			redDonorDao.insertCsrfToken(username, drPswd,csrfToken );
			loginBean.setCsrfToken(csrfToken);
			loginBean.setStatus(Boolean.TRUE);
		}
		}
		catch(SQLException e)
		{
			throw new SQLException(e);
		}
		return loginBean;
		
	}

	public String generateCsrfToken(String username, String drPswd)
	{
		return (username+drPswd).hashCode()+"";
	}
	
	public RedDonorDao getRedDonorDao() {
		
		return redDonorDao;
	}

	public void setRedDonorDao(RedDonorDao redDonorDao) {
		this.redDonorDao = redDonorDao;
	}

	public void isValidSession(String session) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void register(long drMobile, int drPswd, String drEmail, int drciId,
			int drArId, int drCoId, int drBgId, String drFirstName,
			String drLastName) {
		// TODO Auto-generated method stub
		
	}*/

	public LoginBean loginFB() {
		return null;
		
	}

	
	public UserBean getUserDetails(String userId) {
		// TODO Auto-generated method stub
	
		try{
			
		  return redDonorDao.getUserDetails(userId);
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		
	}

	public LoginBean register(String fname, String lname, String email,
			String password,String fbId) throws Exception {
		// TODO Auto-generated method stub
		
		return redDonorDao.register(fname, lname, email, password,fbId);
	}

	public boolean isEmailAvailable(String email) throws SQLException {
		// TODO Auto-generated method stub
		
		return redDonorDao.isEmailAvailable(email);
	}

	public JSONArray getDonorList(String bloodGroup, String state,
			String district, String subDistrict) throws SQLException {
		JSONArray donorsList;
		donorsList = redDonorDao.getDonorList(bloodGroup,state,district,subDistrict);
		return donorsList;
	}

	public JSONArray getStatesList(String country) throws SQLException {
		// TODO Auto-generated method stub
		return redDonorDao.getStatesList(country);
	}
	
	public JSONArray  getDistrictsList(String state) throws SQLException {
		// TODO Auto-generated method stub
		return redDonorDao.getDistrictsList(state);
	}
	
	public JSONArray  getSubDistrictsList(String district) throws SQLException {
		// TODO Auto-generated method stub
		return redDonorDao.getSubDistrictsList(district);
	}

	public UserBean registerDetails(String bloodGroup, String mobile,
			String state, String district, String subDistrict, String usrID, String facebookId) throws SQLException {
		return redDonorDao.registerDetails(bloodGroup, mobile, state, district, subDistrict,usrID, facebookId);
	}



}
