export class Employee{

    private firstName:String;
    private lastName:String;
    private salary:Number;
    private gender:String;
    private email:String;
    constructor(f:String,l:String,s:Number,g:String,e:String){
        this.firstName=f;
        this.lastName=l;
        this.email=e;
        this.gender=g;
        this.salary=s;

    }
    getAllNames(){
        console.log(this.firstName+" "+this.lastName)
    }
}
//var obj=new Employee("Saurav","Sharma",1000,"male","srv@srv");
//obj.getAllNames();