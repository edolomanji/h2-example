package md.ceiti.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import md.ceiti.domain.Department;
import md.ceiti.domain.DepartmentDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-13T19:54:14+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
@Component
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public Department mapFrom(DepartmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Department department = new Department();

        department.setName( dto.getName() );
        department.setAddress( dto.getAddress() );

        return department;
    }

    @Override
    public DepartmentDto mapTo(Department domain) {
        if ( domain == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setName( domain.getName() );
        departmentDto.setAddress( domain.getAddress() );

        return departmentDto;
    }

    @Override
    public List<DepartmentDto> mapTo(List<Department> domains) {
        if ( domains == null ) {
            return null;
        }

        List<DepartmentDto> list = new ArrayList<DepartmentDto>( domains.size() );
        for ( Department department : domains ) {
            list.add( mapTo( department ) );
        }

        return list;
    }
}
