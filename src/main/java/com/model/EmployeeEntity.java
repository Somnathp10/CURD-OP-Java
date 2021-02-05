package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tr_user")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Row_id;
	
	@Column(name="First_name")
    private String First_name;
    
    @Column(name="Last_name")
    private String Last_name;
    
    @Column(name="Primary_Email", nullable=false, length=200)
    private String Primary_Email;

	public int getRow_id() {
		return Row_id;
	}

	public EmployeeEntity(int Row_id, String First_name, String Last_name, String Primary_Email) {
		this.Row_id = Row_id;
		this.First_name = First_name;
		this.Last_name = Last_name;
		this.Primary_Email = Primary_Email;
	}

	public void setRow_id(int row_id) {
		Row_id = row_id;
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

	@Override
    public String toString() {
        return "EmployeeEntity [Row_id=" + Row_id + ", firstName=" + Last_name + 
                ", lastName=" + Last_name + ", email=" + Primary_Email   + "]";
    }




}
