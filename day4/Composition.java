public class Job
{
    private String role;
    private long salary;
    private int id;
    private static int count;

    public Job(String role, long salary)
    {
        this.role = role;
        this.salary = salary;
        this.id = this.count + 1;
    }

    public Job()
    {
        this("Clerk", 460000);
    }

    public String getRole()
    {
        return this.role;
    }
    public void setRole(String role)
    {
        this.role = role;
    }
    public long getSalary()
    {
        return this.salary;
    }
    public void setSalary(long salary)
    {
        this.salary = salary;
    }
}

public class Person
{
    private String name;
    private int age;
    private Job job;

    public Person(String name, int age, Job job)
    {
        this.name = name;
        this.age = age;
        this.job = new Job();
    }
}

public class Composition
{
    public static void main(String[] args)
    {
        int x;
    }
}
