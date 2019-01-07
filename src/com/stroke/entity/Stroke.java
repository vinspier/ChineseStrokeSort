package com.stroke.entity;

import java.io.Serializable;
/*****************存储汉字 对应的Unicode编码 相应的排列序号*********************
 *  排列序号可按照笔画的多少 或者 利用excel对生成的chinese.csv进行排序
 */
public class Stroke implements Serializable{
	
	private static final long serialVersionUID = 7691169042497195748L;

	/**
	 * 汉字
	 */
	private String name;
	
	/**
	 * 编码
	 */
	private Integer code;
	
	/**
	 * 序号
	 */
	private Integer order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Stroke{" +
				"name='" + name + '\'' +
				", code=" + code +
				", order=" + order +
				'}';
	}
}
