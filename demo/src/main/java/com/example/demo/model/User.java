package com.example.demo.model;

/*This imports the necessary classes from the jakarta.persistence package,
 which is part of the Java Persistence API (JPA). These classes provide 
 annotations and interfaces for mapping Java objects to database tables. */
import jakarta.persistence.*;

@Entity
@Table(name= "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    public User() {}
    public User(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
}
