public class Job
{
    private String role;
    private long salary;
    private int id;
    static int count = 0;

    public Job(String role, long salary)
    {
        this.role = role;
        this.salary = salary;
        this.id = this.count;
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

    public static void increment()
    {
        Job.count++;
    }
    public static void decrement()
    {
        Job.count--;
    }
}
