
public class Person
{
    private String name;
    private int age;
    public Job job;
    private long highestSalary;

    public Person(String name, int age, Job job)
    {
        this.name = name;
        this.age = age;
        this.hire(job);
        this.highestSalary = this.job.getSalary();
    }

    public Person(String name, int age, String roleName, int salary)
    {
        this(name, age, new Job(roleName, salary));
    }

    public Person(String name, int age)
    {
        this(name, age, new Job());
    }

    public void fire()
    {
        if (job != null)
        {
            System.out.println(this.name + " has been let go from their " +
                               this.job.getRole() + " position");
            Job.decrement();
            this.job = null;
        }
        else
        {
            System.out.println("Sorry " + this.name + " does not have a job");
        }
    }

    public boolean hire(Job job)
    {
        if ((this.job == null) && (job.getSalary() >= this.highestSalary))
        {
            this.highestSalary = job.getSalary();
            this.job = job;
            System.out.println("Congratulations, " + this.name +
                               " has just been hired for the " + this.job.getRole() + " position");
            Job.increment();
            return true;
        }
        else if (this.job != null)
        {
            System.out.println(this.name + " already has a job!");
        }
        else
        {
            System.out.println("Sorry this job didn't meet your expectations");
        }

        return false;
    }
}
