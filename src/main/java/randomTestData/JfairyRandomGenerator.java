package randomTestData;

import java.text.ParseException;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.text.TextProducer;

public class JfairyRandomGenerator {

	public static void main(String[] args) throws ParseException {
		
		Fairy fairy = Fairy.create();	
		Person person = fairy.person();
		TextProducer text = Fairy.create().textProducer();
		
		System.out.println(text.word(1));
		System.out.println(text.sentence(3));
		
		
		String dateString = person.dateOfBirth().toString();
		
		System.out.println(person.dateOfBirth());
		System.out.println();
		
		System.out.println(person.dateOfBirth().getDayOfMonth());
		System.out.println(person.dateOfBirth().getMonthOfYear());
		System.out.println(person.dateOfBirth().getYear());
		
		System.out.println(person.getAddress().apartmentNumber()+person.getAddress().street());
		
		//DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		//DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
		//Date date = originalFormat.parse(dateString);
		

		
		
		

		System.out.println(person.fullName());
		System.out.println(person.firstName());
		System.out.println(person.lastName());
		System.out.println(person.getCompany().name());
		System.out.println(person.getAddress().getCity());
		System.out.println(person.getAddress().getPostalCode());
		System.out.println(person.getAddress());
		
		
		
		

	}

}
