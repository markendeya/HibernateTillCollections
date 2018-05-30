package com.app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@Column(name="eid")
	private int empid;
	@Column(name="ename")
	private String empname;
	@Column(name="esal")
	private double empsal;
	@Temporal(TemporalType.TIMESTAMP)
	private Date d1;
	@Temporal(TemporalType.DATE)
    private Date d2;
	@Temporal(TemporalType.TIME)
	private Date d3;
	@Lob
	private byte[] dte;
	@Lob
	private char[] dte1;
	@ElementCollection
	@CollectionTable(name="empprjs",joinColumns=@JoinColumn(name="eid"))
	private Set<String> prjs=new HashSet<String>(0);
	@ElementCollection
	@OrderColumn
	@CollectionTable(name="oprjs",joinColumns=@JoinColumn(name="eid"))
	@Column(name="data")
	private List<String> ls=new ArrayList<String>(0);
	@ElementCollection
	//@OrderColumn(name="pos")
	@MapKeyColumn(name="pos")
	@CollectionTable(name="mapprjs",joinColumns=@JoinColumn(name="eid"))
	private Map<Integer,String> map=new TreeMap<Integer,String>();
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public Date getD1() {
		return d1;
	}
	public void setD1(Date d1) {
		this.d1 = d1;
	}
	public Date getD2() {
		return d2;
	}
	public void setD2(Date d2) {
		this.d2 = d2;
	}
	public Date getD3() {
		return d3;
	}
	public void setD3(Date d3) {
		this.d3 = d3;
	}
	public byte[] getDte() {
		return dte;
	}
	public void setDte(byte[] dte) {
		this.dte = dte;
	}
	public char[] getDte1() {
		return dte1;
	}
	public void setDte1(char[] dte1) {
		this.dte1 = dte1;
	}
	public Set<String> getPrjs() {
		return prjs;
	}
	public void setPrjs(Set<String> prjs) {
		this.prjs = prjs;
	}
	public List<String> getLs() {
		return ls;
	}
	public void setLs(List<String> ls) {
		this.ls = ls;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname
				+ ", empsal=" + empsal + ", d1=" + d1 + ", d2=" + d2 + ", d3="
				+ d3 + ", dte=" + Arrays.toString(dte) + ", dte1="
				+ Arrays.toString(dte1) + ", prjs=" + prjs + ", ls=" + ls
				+ ", map=" + map + "]";
	}



	

}
