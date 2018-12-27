/**
 * 
 */
package com.mycat.mycat_demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class User implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7394483830865566195L;
	
	private Long id;                                      //主键ID
	
	private String name;                                  //姓名
	
	private Date createTime;							  //创建时间
	
	private Date updateTime;							  //更新时间

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
