abstract class Employee {

    protected String name;
    protected String department;
    public  Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public abstract String work();
}

    class Developer extends Employee {

    Developer(String name, String department){
           super(name, department);

       }
        public String work() {
            return "writing code";
        }
    }

     class Manager extends Employee {
        Manager(String name, String department){
            super(name, department);
        }
        public String work() {
            return "holding meetings";
        }
    }

