package in.sina.project.runner;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import in.sina.project.entity.Employee;
import in.sina.project.repo.EmployeeRepo;

@Component
public class FetchDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo erepo;
	@Override
	public void run(String... args) throws Exception {
		//Pageable pagable = PageRequest.of(0, 4);
		Pageable pageble = PageRequest.of(0, 4);
		
		Page<Employee>page = erepo.findAll(pageble);
		
		List<Employee> list = page.getContent();
		list.forEach(System.out::println);
		
		System.out.println("First? : " +page.isFirst());
		System.out.println("Last? : " +page.isLast());
		System.out.println("Next? : " +page.hasNext());
		System.out.println("Previous?:" +page.hasPrevious());
		System.out.println("Page size? :" + page.getSize());
		System.out.println("Page Number? :" + page.getNumber());
		System.out.println("Totle Pages? " +page.getTotalPages());
		System.out.println("Total Rows? :" +page.getTotalElements());
		System.out.println("Empty? :" +page.isEmpty());
	}

}
