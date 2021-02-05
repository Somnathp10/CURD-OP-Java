package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tr_book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="First_name")
    private String First_name;
    
    @Column(name="Last_name")
    private String Last_name;
    
    @Column(name="Primary_Email", nullable=false, length=200)
    private String Primary_Email;
    
    @ManyToOne
    @JoinColumn(name = "Row_id")
    private EmployeeEntity Emp;

    
    Book(){
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}



	public String getLast_name() {
		return Last_name;
	}



	public void setLast_name(String last_name) {
		Last_name = last_name;
	}



	public String getPrimary_Email() {
		return Primary_Email;
	}
	

	public void setPrimary_Email(String primary_Email) {
		Primary_Email = primary_Email;
	}
	

	public EmployeeEntity getEmp() {
		return Emp;
	}

	public void setEmp(EmployeeEntity emp) {
		Emp = emp;
	}

	@Override
    public String toString() {
        return "EmployeeEntity [id=" + id + ", firstName=" + Last_name + 
                ", lastName=" + Last_name + ", email=" + Primary_Email   + "]";
    }





}
