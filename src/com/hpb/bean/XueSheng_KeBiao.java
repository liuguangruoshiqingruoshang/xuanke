package com.hpb.bean;

public class XueSheng_KeBiao {
	 private Integer id; 
	 private Integer xuesheng_id;     
	 private Integer kebiao_id;
	 
	public XueSheng_KeBiao() {
		super();
	}
	public XueSheng_KeBiao(Integer id, Integer xuesheng_id, Integer kebiao_id) {
		super();
		this.id = id;
		this.xuesheng_id = xuesheng_id;
		this.kebiao_id = kebiao_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getXuesheng_id() {
		return xuesheng_id;
	}
	public void setXuesheng_id(Integer xuesheng_id) {
		this.xuesheng_id = xuesheng_id;
	}
	public Integer getKebiao_id() {
		return kebiao_id;
	}
	public void setKebiao_id(Integer kebiao_id) {
		this.kebiao_id = kebiao_id;
	}
	@Override
	public String toString() {
		return "XueSheng_KeBiao [Id=" + id + ", xuesheng_id=" + xuesheng_id
				+ ", kebiao_id=" + kebiao_id + "]";
	}
	 
	 
}
