package Stereotype.business_calculation_service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

interface DataService{
	int[] retrieveData();
}

@Repository
@Primary
class MongoDbDataService implements DataService{
	public int[] retrieveData() {
		return new int[] { 11, 22, 33, 44, 55};
	}
}

@Repository
class MySQLDbDataService implements DataService{
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5};
	}
}


@ComponentScan
@Service
public class BuisnessCalculationService {
	DataService dataService;
	
	@Autowired
	public BuisnessCalculationService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public String toString() {
		return dataService.getClass().getSimpleName();
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(BuisnessCalculationService.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			BuisnessCalculationService bs = (BuisnessCalculationService) context.getBean("buisnessCalculationService");
			System.out.println(bs.findMax());
		}
	}
}
