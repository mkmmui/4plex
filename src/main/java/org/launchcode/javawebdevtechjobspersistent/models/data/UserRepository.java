package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u WHERE u.verificationCode = ?1")
    public User findByVerificationCode(String code);

    public User findByResetPasswordToken(String token);
}