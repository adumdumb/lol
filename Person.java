
public class Person extends Chatbot{

    

    private String name = "Person";

    //private String Gender = "Gender";
    
    
    protected final void changeName(String newName){
        this.name = newName;
    }

    public void setAge(int age) {

        //this.age = age;

    }



    public void setName(String name) {

        this.name = name;

    }



    //public int getAge() 
    {

        //return age;

    }



    public String getName() {

        return name;

    }



    //public Boolean getGender()
    {

        //return Gender;

    }



    Person(int age, String name, Boolean isMale){

        //this.age = age;

        this.name = name;

        //this.isMale = isMale;

    }

}