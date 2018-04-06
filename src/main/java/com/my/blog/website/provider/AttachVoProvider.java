package com.my.blog.website.provider;

import org.apache.ibatis.jdbc.SQL;

public class AttachVoProvider {

	public String countByExample() {
		return new SQL()
				.SELECT("count(*)")
				.FROM("t_attach")
				.toString();
	}
}
