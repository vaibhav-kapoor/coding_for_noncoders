
public class Composition
{
    public static void main(String[] args)
    {
        Job j = new Job("Salesman", 56000);
        System.out.println("Job j has salary: " + j.getSalary() + " for the " +
                           j.getRole() + " job");
        Job clerk = new Job();
        System.out.println("So far there are " + Job.count + " people with jobs.");

        Person bob = new Person("Bob Smith", 34, "Flight Attendant", 38000);
        System.out.println("So far there are " + Job.count + " people with jobs.");
        bob.fire();
        System.out.println("So far there are " + Job.count + " people with jobs.");
        bob.fire();

        Person laurie = new Person("Laurie Hall", 19);
        System.out.println("So far there are " + Job.count + " people with jobs.");
        laurie.fire();
        System.out.println("So far there are " + Job.count + " people with jobs.");

        Person anna = new Person("Anna Ginsberg", 43, "Stock broker", 88000);
        System.out.println("So far there are " + Job.count + " people with jobs.");

        bob.hire(j);
        System.out.println("So far there are " + Job.count + " people with jobs.");

        Job ceoJob = new Job("Chief Executive Officer", 20000000);
        anna.hire(ceoJob);
        System.out.println("So far there are " + Job.count + " people with jobs.");
        bob.hire(ceoJob);

        laurie.hire(ceoJob);
        System.out.println("So far there are " + Job.count + " people with jobs.");
        laurie.fire();
        System.out.println("So far there are " + Job.count + " people with jobs.");
        laurie.hire(clerk);
        System.out.println("So far there are " + Job.count + " people with jobs.");

    }
}

















