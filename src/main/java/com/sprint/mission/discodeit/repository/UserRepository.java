package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, UUID> {

  User save(User user);

  Optional<User> findById(UUID id);

  Optional<User> findByUsername(String username);

  @Query("SELECT u FROM User u JOIN FETCH u.profile WHERE u.id = :id")
  Optional<User> findWithProfileById(@Param("id") UUID id);


  List<User> findAll();

  boolean existsById(UUID id);

  void deleteById(UUID id);

  boolean existsByEmail(String email);

  boolean existsByUsername(String username);
}
