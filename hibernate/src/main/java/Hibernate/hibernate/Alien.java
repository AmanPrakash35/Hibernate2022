package Hibernate.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int aid;
	private String aname;
	private String city;
	
	
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alien(int aid, String aname, String city) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.city = city;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
