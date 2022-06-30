package in.sina.project.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.sina.project.entity.Employee;
import in.sina.project.repo.EmployeeRepo;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo erepo;
	@Override
	public void run(String... args) throws Exception {
		erepo.save(new Employee (101,"AA",100.0));
		erepo.save(new Employee (102,"BB",200.0));
		erepo.save(new Employee (103,"CA",250.0));
		erepo.save(new Employee (104,"AB",400.0));
		erepo.save(new Employee (105,"CC",350.0));
		erepo.save(new Employee (106,"TT",800.0));
		erepo.save(new Employee (107,"PH",950.0));
		erepo.save(new Employee (108,"SH",780.0));
		erepo.save(new Employee (109,"GH",560.0));
		erepo.save(new Employee (110,"KY",720.0));

	}

}
