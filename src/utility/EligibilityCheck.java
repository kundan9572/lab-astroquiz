package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{
		public boolean basicEligibilityCheck (User user){
		boolean check = checkUser(user);
		return check;
				
	}
	
	public boolean checkUser(User user){
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		
		if((age >=18 && age <=35) && (height >= 155 && height <=170 ) && ( weight >=55 && weight <=90)  && country=="India") {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public boolean checkQuiz(String points) {
		int point= Integer.parseInt(points);
		if(point > 80) {
			return true;
		}
		else 
			return false;
		
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}








