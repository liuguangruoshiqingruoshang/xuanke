package com.hpb.bean;
public class Admin {
	    private Integer userId;           // id
	    private String  userName;         // ĞÕÃû
	    private String    userPw;     // ÃÜÂë
		public Admin() {
			super();
		}
		public Admin(Integer userId, String userName, String userPw) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userPw = userPw;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPw() {
			return userPw;
		}
		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}
		@Override
		public String toString() {
			return "Admin [userId=" + userId + ", userName=" + userName
					+ ", userPw=" + userPw + "]";
		}
		
}
