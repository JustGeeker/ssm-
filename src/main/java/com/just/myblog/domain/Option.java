package com.just.myblog.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Option implements Serializable {
	private String optionname;

	private String optionvalue;

	public String getOptionname() {
		return optionname;
	}

	public void setOptionname(String optionname) {
		this.optionname = optionname == null ? null : optionname.trim();
	}

	public String getOptionvalue() {
		return optionvalue;
	}

	public void setOptionvalue(String optionvalue) {
		this.optionvalue = optionvalue == null ? null : optionvalue.trim();
	}
}