import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.company.Contact;

public aspect Updateaspect {

	pointcut callentryToUpdate(Contact contact) :
	    call(void updateContact()) && within(addressBook ) && target(contact);

	  before(Contact contact) : entryToUpdate(contact) {
	    try (PrintWriter writer = new PrintWriter(new FileWriter("UpdatesLog.txt", true))) {
	      writer.println("Contact updated  " + contact);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	
}
