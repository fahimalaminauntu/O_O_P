public class App {
    public static void main(String[] args) {

        Professor E1 = new Professor(221, "K. Benzema", 10000, "Computer Science");
        System.out.println(E1.toString());
        Administrator E2 = new Administrator(222, "S. Mane", 500, "GED");
        System.out.println(E2.toString());
        SupportStaff E3 = new SupportStaff(223, "V. van Dijk", 1000, "Suppoter");
        System.out.println(E3.toString());

        System.out.println();
        Employee[] employees = { E1, E2, E3 };
        double total = Employee.totalSalary(employees);
        System.out.println("Total salary: " + total);

    }

}