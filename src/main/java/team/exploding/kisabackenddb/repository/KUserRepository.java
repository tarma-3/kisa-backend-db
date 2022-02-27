package team.exploding.kisabackenddb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.exploding.kisabackenddb.model.KUser;

@Repository
public interface KUserRepository extends JpaRepository<KUser, Long> {
}