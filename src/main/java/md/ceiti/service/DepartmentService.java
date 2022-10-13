package md.ceiti.service;

import java.util.List;

import md.ceiti.domain.Department;

/**
 * Service for operations with {@link  md.ceiti.domain.Department  Department}
 */
public interface DepartmentService {

    /**
     * Persist {@link  md.ceiti.domain.Department  Department} into database
     * @param department value for processing
     * @return persisted {@link  md.ceiti.domain.Department  Department}
     */
    Department save(final Department department);

    /**
     * Find {@link  md.ceiti.domain.Department  Department} by name
     * @param name criteria for searching
     * @return founded {@link  md.ceiti.domain.Department  Department}
     */
    Department findByName(final String name);

    /**
     * Find all existent {@link  md.ceiti.domain.Department  Department}
     * @return list of {@link  md.ceiti.domain.Department  Department}
     */
    List<Department> findAll();

}
