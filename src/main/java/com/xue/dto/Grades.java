package com.xue.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import sun.reflect.Reflection;

import java.io.Serializable;

/**
 * <pre>类名: Grades</pre>
 * <pre>描述: 班级</pre>
 * <pre>日期: 2019/1/9 13:31</pre>
 * <pre>作者: xueshun</pre>
 */
public class Grades implements Serializable {
    private static final long serialVersionUID = -107669718135296814L;
    private int id;
    private String name;
    private String address;

    /**
     * 获取id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address
     *
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
