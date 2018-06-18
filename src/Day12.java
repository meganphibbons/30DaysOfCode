class Day12 extends Day12Support {
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	public Day12(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		testScores = scores;
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	
	public char calculate() {
		double sum = 0;
		for(int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		double avg = sum / testScores.length;
		if(avg <= 100 && avg >= 90) {
			return 'O';
		} else if(avg >= 80) {
			return 'E';
		} else if(avg >= 70) {
			return 'A';
		} else if(avg >= 55) {
			return 'P';
		} else if(avg >= 40) {
			return 'D';
		} else {
			return 'T';
		}
	}
}