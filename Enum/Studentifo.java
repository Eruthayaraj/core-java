
public enum Studentifo {
    Raj(10000,23315,"google"),surya(20000,43234,"microsoft"),navanee(30000,54321,"tcs");
   private int salary;
   private int roolno;
  private  String Company;
    private Studentifo(int salary, int roolno, String company) {
        this.salary = salary;
        this.roolno = roolno;
        this.Company = company;
    }
    public void getstudata()
    {
        System.out.println("salary:"+salary+'\n'+"roolno:"+roolno+'\n'+"Company:"+Company);
    }
  
}
