package md.ceiti.service;

import java.util.List;
import java.util.Set;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import md.ceiti.dao.DepartmentRepository;
import md.ceiti.domain.Department;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    @Override
    public Department save(final Department department) {
        log.info("Save new Department: {}", department);
        return repository.save(department);
    }

    @Override
    public Department findByName(final String name) {
        log.info("Find Department by name: {}", name);
        return repository.findByName(name).orElseThrow(() -> new IllegalArgumentException("Department not found"));
    }

    @Override
    public List<Department> findAll() {
        log.info("Find all Departments");
        return repository.findAll();
    }
}
