package com.hpb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hpb.bean.Admin;
import com.hpb.bean.KeBiao;
import com.hpb.bean.KeCheng;
import com.hpb.bean.LaoShi;
import com.hpb.bean.XueSheng;
import com.hpb.service.UserService;
@Controller
public class AdminServlet {
	
	@Test
	@RequestMapping("/admin_login")
	public void findUserLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String user=request.getParameter("user");//��ȡ�����֤
		String userName=request.getParameter("userName");//��ȡ�û���
		String userPw=request.getParameter("userPw");//��ȡ����
		Admin ad=us.user_log0(userName, userPw);
		LaoShi ls=us.user_log1(userName, userPw);
		XueSheng xs=us.user_log2(userName, userPw);
		if (xs!=null&&xs.getLoginname().equals(userName)&&xs.getLoginpw().equals(userPw)&&user.equals("student")) {
			HttpSession session=request.getSession();
			session.setAttribute("student",xs);
			request.getRequestDispatcher("admin/studentMain.jsp").forward(request, response);
			}
		else if (ls!=null&&ls.getLoginname().equals(userName)&&ls.getLoginpw().equals(userPw)&&user.equals("teacher")){
				HttpSession session=request.getSession();
				session.setAttribute("teacher",ls);
				request.getRequestDispatcher("admin/teacherMain.jsp").forward(request, response);
			}
		else if (ad!=null&&ad.getUserName().equals(userName)&&ad.getUserPw().equals(userPw)&&user.equals("admin")) {
				HttpSession session=request.getSession();
				session.setAttribute("admin",ad);
				request.getRequestDispatcher("admin/main.jsp").forward(request, response);
			}
	}

	@Test
	@RequestMapping("/update")
	public void getUserByIdTest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String userName=request.getParameter("userName");//��ȡ�û���
		String userPw=request.getParameter("newPw");//��ȡnew����
		boolean ad=us.update(userName, userPw);
		if(ad==true){
			response.sendRedirect("login.jsp");
		}
		else{
			response.sendRedirect("update.jsp");
		}
		
  }
	@Test
	@RequestMapping("/xiTongGuanLi")
	public String getAllAdmin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		List<Admin> ad=us.getAllAdmin();
		if(ad!=null){
			HttpSession session=request.getSession();
			session.setAttribute("list",ad);
		}else{
			response.sendRedirect("main.jsp");
		}
		return "xiTongGuanLi";
  }
	@Test
	@RequestMapping("/del")
	public void getDelAdmin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String id=request.getParameter("id");//��ȡǰ̨id
		int ids=Integer.parseInt(id);
		boolean ad=us.delAdmin(ids);
		if(ad==true){
			response.sendRedirect("xiTongGuanLi");
		}
  }
	@Test
	@RequestMapping("/insert")
	public void getInsertAdmin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String userName=request.getParameter("userName");//��ȡ�û���
		String userPw=request.getParameter("userPw");//��ȡ����
		Admin a=new Admin();
		a.setUserName(userName);
		a.setUserPw(userPw);
		int b=us.insertAdmin(a);
		if(b>0){
			 response.sendRedirect("xiTongGuanLi");
		}else{
			response.sendRedirect("insertAdmin.jsp");
		}
		
  }
	@Test
	@RequestMapping("/keChengGuanLi")
	public String getAllKeCheng(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		List<KeCheng> kc=us.getAllKeCheng();
		if(kc!=null){
			HttpSession session=request.getSession();
			session.setAttribute("list",kc);
		}else{
			response.sendRedirect("main.jsp");
		}
		return "keChengGuanLi";
  }
	@Test
	@RequestMapping("/delKeCheng")
	public void getDelKeCheng(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String id=request.getParameter("bianhao");//��ȡǰ̨id
		boolean kc=us.delKeCheng(id);
		if(kc==true){
			response.sendRedirect("keChengGuanLi");
		}
  }
	@Test
	@RequestMapping("/insertKeCheng")
	public void getInsertKeCheng(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String id=request.getParameter("id");//��ȡ�γ����
		String bianhao=request.getParameter("bianhao");//��ȡ�γ̱��
		String mingcheng=request.getParameter("mingcheng");//��ȡ�γ�����
		String keshi=request.getParameter("keshi");//��ȡ�γ̿�ʱ
		KeCheng kc=new KeCheng();
		kc.setBianhao(bianhao);
		kc.setMingchneg(mingcheng);
		kc.setKeshi(keshi);
		int k=us.insertKeCheng(kc);
		if(k>0){
			 response.sendRedirect("keChengGuanLi");
		}else{
			response.sendRedirect("insertKeCheng.jsp");
		}
}
	@Test
	@RequestMapping("/laoShiGuanLi")
	public String getAllLaoShi(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		List<LaoShi> ls=us.getAllLaoShi();
		if(ls!=null){
			HttpSession session=request.getSession();
			session.setAttribute("list",ls);
		}else{
			response.sendRedirect("main.jsp");
		}
		return "laoShiGuanLi";
  }
	@Test
	@RequestMapping("/delLaoShi")
	public void getDelLaoShi(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String id=request.getParameter("bianhao");//��ȡǰ̨id
		boolean kc=us.delLaoShi(id);
		if(kc==true){
			response.sendRedirect("laoShiGuanLi");
		}
  }
	@Test
	@RequestMapping("/insertLaoShi")
	public void getInsertLaoShi(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html:charset=utf-8");
		String bianhao=request.getParameter("bianhao");//��ȡ��ʦ���
		String xingming=request.getParameter("xingming");//��ȡ��ʦ����
		String xingbie=request.getParameter("xingbie");//��ȡ��ʦ�Ա�
		String nianling=request.getParameter("nianling");//��ȡ��ʦ����
		String zhicheng=request.getParameter("zhicheng");//��ȡ��ʦְ��
		String loginname=request.getParameter("loginname");//��ȡ��ʦ��¼�˺�
		String loginpw=request.getParameter("loginpw");//��ȡ��ʦ�˺�����
		LaoShi ls=new LaoShi();
		ls.setBianhao(bianhao);
		ls.setXingming(xingming);
		ls.setXingbie(xingbie);
		ls.setNianling(nianling);
		ls.setZhicheng(zhicheng);
		ls.setLoginname(loginname);
		ls.setLoginpw(loginpw);
		int k=us.insertLaoShi(ls);
		if(k>0){
			 response.sendRedirect("laoShiGuanLi");
		}else{
			response.sendRedirect("insertLaoShi.jsp");
		}
}
	@Test
	@RequestMapping("/keBiaoGuanLi")
	public String getAllKeBiao(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		List<KeBiao> kb=us.getAllKeBiao();
		if(kb!=null){
			System.out.println(kb);
			HttpSession session=request.getSession();
			session.setAttribute("list",kb);
		}else{
			response.sendRedirect("main.jsp");
		}
		return "keBiaoGuanLi";
  }
	@Test
	@RequestMapping("/delKeBiao")
	public void getDelKeBiao(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String id=request.getParameter("id");//��ȡǰ̨id
		int ids=Integer.parseInt(id);
		boolean kb=us.delKeBiao(ids);
		if(kb==true){
			response.sendRedirect("keBiaoGuanLi");
		}
  }
	@Test
	@RequestMapping("/insertKeBiao")
	public void getInsertKeBiao(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html:charset=utf-8");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String mingcheng=request.getParameter("mingcheng");//��ȡ�α�γ�����
		String shijian=request.getParameter("shijian");//��ȡ�α�ʱ��
		String jieci=request.getParameter("jieci");//��ȡ�α�ڴ�
		String jiaoshi=request.getParameter("jiaoshi");//��ȡ�α����
		String xingming=request.getParameter("xingming");//��ȡ�α��ڿ���ʦ
		
		KeCheng kc=new KeCheng();
		kc.setMingchneg(mingcheng);
		LaoShi ls=new LaoShi();
		ls.setXingming(xingming);
		KeBiao kb=new KeBiao();
		kb.setKecheng(kc);
		kb.setShijian(shijian);
		kb.setJieci(jieci);
		kb.setJiaoshi(jiaoshi);
		kb.setLaoshi(ls);
		int k=us.insertKeBiao(kb);
		if(k>0){
			 response.sendRedirect("keBiaoGuanLi");
		}else{
			response.sendRedirect("insertKeBiao.jsp");
		}
}
	@Test
	@RequestMapping("/xueShengGuanLi")
	public String getAllXueSheng(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		List<XueSheng> xs=us.getAllXueSheng();
		if(xs!=null){
			HttpSession session=request.getSession();
			session.setAttribute("list",xs);
		}else{
			response.sendRedirect("main.jsp");
		}
		return "xueShengGuanLi";
  }
	@Test
	@RequestMapping("/delXueSheng")
	public void getDelXueSheng(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		String id=request.getParameter("id");//��ȡǰ̨id
		int ids=Integer.parseInt(id);
		boolean xs=us.delXueSheng(ids);
		if(xs==true){
			response.sendRedirect("xueShengGuanLi");
		}
  }
	@Test
	@RequestMapping("/insertXueSheng")
	public void getInsertXueSheng(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html:charset=utf-8");
		String xuehao=request.getParameter("xuehao");//��ȡ��ʦ���
		String xingming=request.getParameter("xingming");//��ȡ��ʦ����
		String xingbie=request.getParameter("xingbie");//��ȡ��ʦ�Ա�
		String nianling=request.getParameter("nianling");//��ȡ��ʦ����
		String banji=request.getParameter("banji");//��ȡ��ʦְ��
		String loginname=request.getParameter("loginname");//��ȡ��ʦ��¼�˺�
		String loginpw=request.getParameter("loginpw");//��ȡ��ʦ�˺�����
		XueSheng xs=new XueSheng();
		xs.setXuehao(xuehao);
		xs.setXingming(xingming);
		xs.setXingbie(xingbie);
		xs.setNianling(nianling);
		xs.setBanji(banji);
		xs.setLoginname(loginname);
		xs.setLoginpw(loginpw);
		int k=us.insertXueSheng(xs);
		if(k>0){
			 response.sendRedirect("xueShengGuanLi");
		}else{
			response.sendRedirect("insertXueSheng.jsp");
		}
}
	@Test
	@RequestMapping("/laoShiXinXi")
	public String getListLaoShi(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us=context.getBean("userServiceImpl",UserService.class);
		
		HttpSession session=request.getSession();
		LaoShi ls1=(LaoShi) session.getAttribute("teacher");
		
		int id=ls1.getId();//��ȡ��session�õ���id
		LaoShi ls=us.getLS(id);
		if(ls!=null){
			session.setAttribute("teacher",ls);
		}else{
			response.sendRedirect("teacherMain.jsp");
		}
		return "laoShiXinXi";
  }
}