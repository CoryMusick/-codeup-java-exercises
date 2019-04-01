import java.util.Arrays;

public class ArraysExercise {


    public static Person[] addPerson(Person[] array, Person personToAdd){
    Person[] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[array.length] = personToAdd;
    return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Cory");
        people[1] = new Person("Carlo");
        people[2] = new Person("Justin");

       Person daniel = new Person("Daniel");

       Person[] newArray = addPerson(people, daniel);

        for(Person person : newArray){
            System.out.println(person.getName());
        }






    }
}
