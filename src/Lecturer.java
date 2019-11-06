public class Lecturer {

    String LName;
    int  LAge;

    public void lecturer(String LName, int LAge){

        this.LName=LName;
        this.LAge=LAge;

    }

    public String GetLName(){
        return LName;
    }

    public void SetLName(String LName){
        this.LName=LName;
    }

    public int GetLAge(){
        return LAge;
    }

    public void SetLAge(int LAge){
        this.LAge=LAge;
    }
}
