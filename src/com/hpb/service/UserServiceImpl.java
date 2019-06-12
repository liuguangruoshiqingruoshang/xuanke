package com.hpb.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hpb.bean.Admin;
import com.hpb.bean.KeBiao;
import com.hpb.bean.KeCheng;
import com.hpb.bean.LaoShi;
import com.hpb.bean.XueSheng;
import com.hpb.dao.UserMapper;
@Transactional
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
 
	@Autowired
	private UserMapper um;

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public Admin user_log0(String userName, String userPw) {
		// TODO Auto-generated method stub
		return um.user_log0(userName, userPw);
	}

	@Override
	public boolean update(String userName,String userPw) {
		// TODO Auto-generated method stub
		return um.update(userName, userPw);
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return um.getAllAdmin();
	}

	@Override
	public boolean delAdmin(Integer userId) {
		// TODO Auto-generated method stub
		return um.delAdmin(userId);
	}

	@Override
	public int insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return um.insertAdmin(admin);
	}
	
	@Override
	public int insertKeCheng(KeCheng kecheng) {
		// TODO Auto-generated method stub
		return um.insertKeCheng(kecheng);
	}

	@Override
	public List<KeCheng> getAllKeCheng() {
		// TODO Auto-generated method stub
		return um.getAllKeCheng();
	}

	@Override
	public boolean delKeCheng(String bianhao) {
		// TODO Auto-generated method stub
		return um.delKeCheng(bianhao);
	}

	@Override
	public List<LaoShi> getAllLaoShi() {
		// TODO Auto-generated method stub
		return um.getAllLaoShi();
	}

	@Override
	public boolean delLaoShi(String bianhao) {
		// TODO Auto-generated method stub
		return um.delLaoShi(bianhao);
	}

	@Override
	public int insertLaoShi(LaoShi laoshi) {
		// TODO Auto-generated method stub
		return um.insertLaoShi(laoshi);
	}

	@Override
	public List<KeBiao> getAllKeBiao() {
		// TODO Auto-generated method stub
		return um.getAllKeBiao();
	}

	@Override
	public boolean delKeBiao(Integer id) {
		// TODO Auto-generated method stub
		return um.delKeBiao(id);
	}

	@Override
	public int insertKeBiao(KeBiao kebiao) {
		// TODO Auto-generated method stub
		return um.insertKeBiao(kebiao);
	}

	@Override
	public List<XueSheng> getAllXueSheng() {
		// TODO Auto-generated method stub
		return um.getAllXueSheng();
	}

	@Override
	public boolean delXueSheng(Integer id) {
		// TODO Auto-generated method stub
		return um.delXueSheng(id);
	}

	@Override
	public int insertXueSheng(XueSheng xuesheng) {
		// TODO Auto-generated method stub
		return um.insertXueSheng(xuesheng);
	}

	@Override
	public LaoShi user_log1(String loginname, String loginpw) {
		// TODO Auto-generated method stub
		return um.user_log1(loginname, loginpw);
	}

	@Override
	public XueSheng user_log2(String loginname, String loginpw) {
		// TODO Auto-generated method stub
		return um.user_log2(loginname, loginpw);
	}

	@Override
	public LaoShi getLS(int id) {
		// TODO Auto-generated method stub
		return um.getLS(id);
	}
	
}
