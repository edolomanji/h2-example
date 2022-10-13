package md.ceiti.api;

import java.util.List;

import lombok.RequiredArgsConstructor;
import md.ceiti.domain.DepartmentDto;
import md.ceiti.mapper.DepartmentMapper;
import md.ceiti.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ceiti/api")
public class DepartmentController {

    private final DepartmentMapper mapper;

    private final DepartmentService service;

    @GetMapping("/departments/{name}")
    @ResponseStatus(HttpStatus.OK)
    public DepartmentDto findDepartmentByName(@PathVariable("name") final String name){
        return mapper.mapTo(service.findByName(name));
    }

    @GetMapping("/departments")
    @ResponseStatus(HttpStatus.OK)
    public List<DepartmentDto> findDepartments(){
        return mapper.mapTo(service.findAll());
    }

    @PostMapping("/departments")
    @ResponseStatus(HttpStatus.CREATED)
    public DepartmentDto saveDepartment(@RequestBody final DepartmentDto departmentDto){
        return mapper.mapTo(service.save(mapper.mapFrom(departmentDto)));
    }
}
