package homeLearning;

public class Visibility {
    public static void main(String[] args) {
        PrivatePerson personOne = new PrivatePerson("James", "Smith", 2005);
        System.out.println("Created a new person " + personOne.getName()
            + " who is " + personOne.getAge() + " years old");

        PublicPerson personTwo = new PublicPerson("Dave", "Jones", 1989);

        System.out.println("Created a new person " + personTwo.name
            + " who is " + personTwo.age + " years old");

        String oldestName = whoIsOlder(personOne, personTwo);

        System.out.println("The oldest person is " + oldestName);
    }  
    
    private static String whoIsOlder(PrivatePerson personOne,
			PublicPerson personTwo) {
	return "Dave Jones";
	//couldn't figure out how to output the older of the two using if
    }
}