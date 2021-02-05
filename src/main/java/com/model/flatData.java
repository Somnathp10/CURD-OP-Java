package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flatData")
public class flatData {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int flatNo;
		
		@Column(name="Name")
	    private String Name;
	    
	    @Column(name="block")
	    private String block;
	    
	    @Column(name="Status", nullable=false, length=200)
	    private String Status;
	    
	    @Column(name="score")
	    private String score;

	

		public flatData() {
		}



		public int getFlatNo() {
			return flatNo;
		}

		public void setFlatNo(int flatNo) {
			this.flatNo = flatNo;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}



		public String getBlock() {
			return block;
		}



		public void setBlock(String block) {
			this.block = block;
		}



		public String getStatus() {
			return Status;
		}



		public void setStatus(String status) {
			Status = status;
		}



		public String getScore() {
			return score;
		}



		public void setScore(String score) {
			this.score = score;
		}


}
