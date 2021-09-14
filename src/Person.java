public class Person {
    private String name;

    public Person (String name){
        this.name = name;
    }

        public String getName(){
//TODO: return the person's name
            return name;
        }

        public void setName(String name){
             this.name = name;
//TODO: change the name property to the passed value
        }
        public void sayHello(){


            System.out.printf("%s says hello!",name);
//TODO: print a message to the console using the person's name
        }

//    public static void main(String[] args) {
//        Person person1 = new Person("Tony");
//        System.out.println(person1.name);
//    }

}


//    Create Person class inside of src that has a private name property that is a string,
//    and the following methods