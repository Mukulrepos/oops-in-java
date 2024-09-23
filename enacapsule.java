class capsule_of_data {
    private String name;
    private int age;
    private String course;

    public String get_name(String names_od_data) {
        return this.name = names_od_data;

    }

    public int get_age(int age_od_data) {
        return this.age = age_od_data;

    }

    public String get_course(String course_od_data) {
        return this.course = course_od_data;

    }

    public void display() {
        System.out.println("name of data " + name);
        System.out.println("data of age " + age);
        System.out.println("data of course " + course);
    }

}

public class enacapsule {
    public static void main(String[] args) {
        capsule_of_data obj = new capsule_of_data();
        obj.get_age(89);
        obj.get_name("mukul");
        obj.get_course("bachlor of arts");
        obj.display();

    }

}