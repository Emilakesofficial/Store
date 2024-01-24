public class Manager extends Staff {
//    private String name;


    public Manager() {
        super("Manager ", "Harry", "male");
    }

//    public Manager(String role, String sex) {
//        this(role, sex, "Harry");
//    }

//    public Manager(String role, String sex, String name) {
////        super(role, sex, name);
//        this.name = name;
//    }

//    public String getName() {
//        return name;
//    }

//
    @Override
    public String toString() {
        return "Manager{} " + super.toString();
    }
    public void hireStaff(Cashier cashier) {
        System.out.println("Congratulations! " + cashier.getName() + "You have been hired as the new cashier");
    }


}
