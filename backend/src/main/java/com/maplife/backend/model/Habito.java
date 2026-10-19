package com.maplife.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "habito")
public class Habito {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false)
    private int sequenceOfDays;

    @Column(nullable = false)
    private int dayTarget;

    public Habito() {
    }

    public Habito(String name, String description, int sequenceofdays, int daytarget) {
        this.name = name;
        this.description = description;
        this.sequenceofdays = sequenceofdays;
        this.daytarget = daytarget;
    }

    public Long  getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSequenceofdays() {
        return sequenceofdays;
    }

    public int getDaytarget() {
        return daytarget;
    }

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSequenceofdays(int sequenceofdays) {
		this.sequenceofdays = sequenceofdays;
	}

	public void setDaytarget(int daytarget) {
		this.daytarget = daytarget;
	}


   @Override
public String toString() {
    return "Habito{id=" + id + ", name='" + name + "', description='" + description +
        "', sequenceOfDays=" + sequenceofdays + ", dayTarget=" + daytarget + "}";
}



}   

