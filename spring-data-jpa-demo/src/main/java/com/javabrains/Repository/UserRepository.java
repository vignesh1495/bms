package com.javabrains.Repository;

import com.javabrains.model.Theatre;
import com.javabrains.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u "
            + "WHERE u.firstname=:firstname")
    Optional<User> findByfirstname(@Param("firstname") String firstname);
}
