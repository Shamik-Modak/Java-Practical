class employee {

    int id;
    String name;
    double salary;

    employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Employee Id: "+ id + " Name: "+name+" Salary: "+salary);
    }
}

public class employeeclass{
    
    public static void main(String [] args){
        employee emp=new employee(67,"Shamik",150000);
        emp.display();
    }
}
