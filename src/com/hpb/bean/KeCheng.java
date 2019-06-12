package com.hpb.bean;

public class KeCheng {
	 private Integer id; 
	 private String  bianhao;     
	 private String  mingcheng;
	 private String  keshi;
	 private String del;
	 
	public KeCheng() {
		super();
	}
	public KeCheng(Integer id, String bianhao, String mingcheng, String keshi,
			String del) {
		super();
		this.id = id;
		this.bianhao = bianhao;
		this.mingcheng = mingcheng;
		this.keshi = keshi;
		this.del = del;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBianhao() {
		return bianhao;
	}
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingchneg(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getKeshi() {
		return keshi;
	}
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "KeCheng [Id=" + id + ", bianhao=" + bianhao + ", mingchneg="
				+ mingcheng + ", keshi=" + keshi + ", del=" + del + "]";
	}
	 
}
