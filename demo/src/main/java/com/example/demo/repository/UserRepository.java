package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
public interface UserRepository: This declares an interface named UserRepository. In Spring Data JPA, repository interfaces are used to define data access methods.
extends JpaRepository<User, Long>: This is the key part. It indicates that UserRepository extends the JpaRepository interface.
JpaRepository<User, Long>: This is a generic interface that takes two type parameters:
User: The entity type that this repository will manage.
Long: The type of the entity's primary key (in this case, the id field of the User entity).

Spring Data JPA Magic: By extending JpaRepository, the UserRepository interface automatically inherits a set of pre-defined methods for performing common database operations on User entities. These methods include:
save(User entity): Saves a User entity to the database.
delete(User entity): Deletes a User entity from the database.
findById(Long id): Finds a User entity by its id.
findAll(): Retrieves all User entities from the database.
And many more.
No Implementation Needed: You don't need to provide an implementation for the UserRepository interface. Spring Data JPA automatically generates the implementation at runtime. */
public interface UserRepository  extends JpaRepository<User, Long>{

    
}