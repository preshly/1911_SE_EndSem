package second_question;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE")
public class Candidate {
	
	@Id
	private Integer id;
	
	private String name;
	
	private Integer total;
	
	public Candidate(Integer id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	public void calculateTotal(Boolean isMasters, Boolean isGrduation, Boolean isHSSC,
			Boolean hasRepresentedGoaInSports) {
		
		Integer points = 0;
		
		if(Boolean.TRUE.equals(isMasters)) //whether completed masters
			points += 5;
		if(Boolean.TRUE.equals(isGrduation)) //whether completed graduation
			points += 3;
		if(Boolean.TRUE.equals(isHSSC)) //whether completed HSSC
			points += 1;
		if(Boolean.TRUE.equals(hasRepresentedGoaInSports)) //whether Represented Goa In Sports
			points += 3;
		
		this.total = points;
	}
	
	//getters and setters
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
