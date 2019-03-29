public class PlayingAround {
    public static void main(String[] args) {
        Developer cory = new Developer("Cory","UX/UI");

        System.out.println(cory.work());

        Manager tim = new Manager("Tim","Pool nonsense");

        System.out.println(tim.work());

        System.out.println(cory.getDepartment());

        Employee mike = new Developer("mike", "java");

        System.out.println(mike.work());
    }
}
