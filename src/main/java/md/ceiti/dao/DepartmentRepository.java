package md.ceiti.dao;

import java.util.Optional;

import md.ceiti.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for operations with {@link  md.ceiti.domain.Department  Department}
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    /**
     * Find {@link  md.ceiti.domain.Department  Department} by name
     * @param name criteria for searching
     * @return {@link  java.util.Optional<md.ceiti.domain.Department>  Department}
     */
    Optional<Department> findByName(String name);

}
