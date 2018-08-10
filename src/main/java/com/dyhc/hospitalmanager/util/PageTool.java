package com.dyhc.hospitalmanager.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页工具
 * @author duxiaoyu
 * @param <T>
 */
public class PageTool<T> {

    //当前页码
    private Integer pageIndex;

    //每页显示的数据量
    private Integer pageSize;

    //总页码数
    private Integer pageCount;

    //数据总记录数
    private Integer dataCount;

    //每页数据信息集合
    private List<T> datalist=new ArrayList<T>();

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
        this.pageCount=this.dataCount%this.pageSize==0?(this.dataCount/this.pageSize):(this.dataCount/this.pageSize+1);
    }

    public List<T> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<T> datalist) {
        this.datalist = datalist;
    }
}
