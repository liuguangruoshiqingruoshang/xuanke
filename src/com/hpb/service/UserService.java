package com.hpb.service;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hpb.bean.Admin;
import com.hpb.bean.KeBiao;
import com.hpb.bean.KeCheng;
import com.hpb.bean.LaoShi;
import com.hpb.bean.XueSheng;

public interface UserService {
	public Admin user_log0(@Param("name")String userName,@Param("pwd")String userPw);//管理员登录
	public LaoShi user_log1(@Param("loginname")String loginname,@Param("loginpwd")String loginpw);//老师登录
	public XueSheng user_log2(@Param("loginname")String loginname,@Param("loginpwd")String loginpw);//学生登录
	public boolean update(@Param("name")String userName,@Param("pwd")String userPw);//修改密码
	public List<Admin> getAllAdmin();//获得所有管理员信息
	public boolean delAdmin(@Param("id")Integer userId);//删除管理员账户
	public int insertAdmin(Admin admin);//添加管理员账户
	public List<KeCheng> getAllKeCheng();//获得所有课程信息
	public boolean delKeCheng(@Param("bianhao")String bianhao);//删除课程
	public int insertKeCheng(KeCheng kecheng);//添加课程
	public List<LaoShi> getAllLaoShi();//获得所有老师信息
	public LaoShi getLS(int id);//根据id获取老师信息
	public boolean delLaoShi(@Param("bianhao")String bianhao);//删除老师账户
	public int insertLaoShi(LaoShi laoshi);//添加老师账户
	public List<KeBiao> getAllKeBiao();//获得所有课表信息
	public boolean delKeBiao(@Param("id")Integer id);//删除课表
	public int insertKeBiao(KeBiao kebiao);//添加课表
	public List<XueSheng> getAllXueSheng();//获得所有学生信息
	public boolean delXueSheng(@Param("id")Integer id);//删除学生账户
	public int insertXueSheng(XueSheng xuesheng);//添加学生账户
}
