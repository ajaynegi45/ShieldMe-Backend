package com.shieldme.authentication.repository;

import com.shieldme.authentication.entity.Role;
import com.shieldme.authentication.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByUserIdAndRole(ObjectId userId, Role role);
}

