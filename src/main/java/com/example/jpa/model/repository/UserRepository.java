package com.example.jpa.model.repository;
import com.example.jpa.model.model.Name;
import com.example.jpa.model.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}