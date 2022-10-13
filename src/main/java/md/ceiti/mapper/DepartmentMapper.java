package md.ceiti.mapper;

import java.util.List;

import md.ceiti.domain.Department;
import md.ceiti.domain.DepartmentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    Department mapFrom(DepartmentDto dto);

    DepartmentDto mapTo(Department domain);

    List<DepartmentDto> mapTo(List<Department> domains);

}
