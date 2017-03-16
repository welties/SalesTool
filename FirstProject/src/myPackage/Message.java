package myPackage;

public class Message {
String	name, email, phone;
public Message(String theName, String theEmail, String thePhone){
	name = theName;
	email = theEmail;
	phone = thePhone;
}

void displayEmail(){
		System.out.println("Email:" + email);
}

void displayPhone(){
	System.out.println("Phone:" + phone);
}
public static void main (String args[]){
	Message Wayne = new Message("Wayne", "Sinclair@thoughtworks.com","0810282323");
	System.out.println(Wayne.name);
	Wayne.displayPhone();
	Wayne.displayEmail();
	
	Message Rabijah = new Message("Rabijah", "Rabijah@gmail.com","0832941428");
	System.out.println(Rabijah.name);
	Rabijah.displayPhone();
	Rabijah.displayEmail();
}
}
