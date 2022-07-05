package sn.isi.mykspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.mykspace.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
