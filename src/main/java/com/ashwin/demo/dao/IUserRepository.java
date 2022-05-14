package com.ashwin.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.demo.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
  
  //Custom Method using JPQL in Repository
  @Query("From User WHERE userName=?1 AND password=?2 AND isActive=true")
  public User findUserByUsernameAndPassword(String userName, String password);

}