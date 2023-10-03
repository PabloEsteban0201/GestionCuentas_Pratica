package com.ejercicioBanco.app.dto;

import java.io.Serializable;

public class PruebaDto implements Serializable{

	Long id;
	
	String desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public PruebaDto(Long id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public PruebaDto() {

	}

	@Override
	public String toString() {
		return "PruebaDto [id=" + id + ", desc=" + desc + "]";
	}
	
	
}
