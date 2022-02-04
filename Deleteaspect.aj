import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.company.Contact;

public aspect Deleteaspect {


	pointcut calldelete(Contact contact) :
	    call(void DeleteEntry()) && within(addressBook ) && target(contact);

	  before(Contact contact) :  delete(contact) {
	    try (PrintWriter writer = new PrintWriter(new FileWriter("deleteLog.txt", true))) {
	      writer.println("Contact removed -> " + contact);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
}
