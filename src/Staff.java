public class Staff {
    private String role;
    private String name;
    private String sex;

//    public Staff() {
//
//    }

    public Staff(String role, String name, String sex) {
        this.role = role;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "staff{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
