package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		String pet = JOptionPane.showInputDialog("What kind og pet would you like to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 3; i++) {
			
	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How are you going to make your pet happy?", "happypet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Take them for a walk", "Give them food" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	Cuddle ();
}
if (task ==1) {
	Walk ();
}
if (task == 2)
	Food ();
	}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	else {
		JOptionPane.showMessageDialog(null, "You really love your bet!");
		break;
}
	}}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void Cuddle () {
		JOptionPane.showMessageDialog(null, "Your pet loves to cuddle! He/She fall asleep in your lap.");
		happinessLevel++ ; 
	}
	
	public static void Walk () {
		JOptionPane.showMessageDialog(null, "Your pet loves to walk. He/She's been stuck outside all day.");
		happinessLevel++ ; 
	}
	
	public static void Food () {
		JOptionPane.showMessageDialog(null, "Yummy! Your pet loves a nice meal.");
		happinessLevel++ ; 
	}
	
	
	
}