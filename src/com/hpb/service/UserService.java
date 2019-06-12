package com.hpb.service;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hpb.bean.Admin;
import com.hpb.bean.KeBiao;
import com.hpb.bean.KeCheng;
import com.hpb.bean.LaoShi;
import com.hpb.bean.XueSheng;

public interface UserService {
	public Admin user_log0(@Param("name")String userName,@Param("pwd")String userPw);//����Ա��¼
	public LaoShi user_log1(@Param("loginname")String loginname,@Param("loginpwd")String loginpw);//��ʦ��¼
	public XueSheng user_log2(@Param("loginname")String loginname,@Param("loginpwd")String loginpw);//ѧ����¼
	public boolean update(@Param("name")String userName,@Param("pwd")String userPw);//�޸�����
	public List<Admin> getAllAdmin();//������й���Ա��Ϣ
	public boolean delAdmin(@Param("id")Integer userId);//ɾ������Ա�˻�
	public int insertAdmin(Admin admin);//��ӹ���Ա�˻�
	public List<KeCheng> getAllKeCheng();//������пγ���Ϣ
	public boolean delKeCheng(@Param("bianhao")String bianhao);//ɾ���γ�
	public int insertKeCheng(KeCheng kecheng);//��ӿγ�
	public List<LaoShi> getAllLaoShi();//���������ʦ��Ϣ
	public LaoShi getLS(int id);//����id��ȡ��ʦ��Ϣ
	public boolean delLaoShi(@Param("bianhao")String bianhao);//ɾ����ʦ�˻�
	public int insertLaoShi(LaoShi laoshi);//�����ʦ�˻�
	public List<KeBiao> getAllKeBiao();//������пα���Ϣ
	public boolean delKeBiao(@Param("id")Integer id);//ɾ���α�
	public int insertKeBiao(KeBiao kebiao);//��ӿα�
	public List<XueSheng> getAllXueSheng();//�������ѧ����Ϣ
	public boolean delXueSheng(@Param("id")Integer id);//ɾ��ѧ���˻�
	public int insertXueSheng(XueSheng xuesheng);//���ѧ���˻�
}
