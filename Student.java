class Student {
    String index;
    String firstName;
    String lastName;
    int [] grades;
    //TODO constructor

    Student(String i, String name, String surname, int [] grade){

    }
    //TODO seters & getters


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double getAverage() {
        //TODO
        double sum = 0.0;
        for(int i = 0; i < getGrades().length; i++)
            sum += grades[i];

           return sum / grades.length;
    }

    public int ECTSCredits() {
        //TODO
        int credits = 0;

        for(int i = 0; i < grades.length; i++){
            credits += 6;
        }

        return credits;
    }
}

