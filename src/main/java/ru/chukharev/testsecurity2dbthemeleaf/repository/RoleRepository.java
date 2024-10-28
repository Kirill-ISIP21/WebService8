package ru.chukharev.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chukharev.testsecurity2dbthemeleaf.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
