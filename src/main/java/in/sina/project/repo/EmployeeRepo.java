package in.sina.project.repo;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import in.sina.project.entity.Employee;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {

}
