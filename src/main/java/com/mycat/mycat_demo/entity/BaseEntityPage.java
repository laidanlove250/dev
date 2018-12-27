/**
 * 
 */
package com.mycat.mycat_demo.entity;

/**
 * 分页Bean
 *
 * @author: 高亚男
 * @date: 2018/7/24 下午3:14
 */
public class BaseEntityPage<T> extends BaseEntity{
     
	/** serialVersionUID */
	private static final long serialVersionUID = -4574632593310250355L;
	
	/** 当前页 */
    private Integer currentPage = 1;
    
    /** 每页显示的总条数 */
    private Integer pageSize = 10;
 
	public BaseEntityPage() {
		super();
	}

	public BaseEntityPage(Integer currentPage, Integer pageSize, Integer totalNum) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
