public class Student {

    String name;
    int  age;

    public void student(String name, int age){

        this.name=name;
        this.age=age;

    }

    public String GetName() {
        return name;
    }

    public void SetName(String name){
        this.name=name;
    }

    public int GetAge(){
        return age;
    }

    public void SetAge(int age){
        this.age=age;
    }

}
