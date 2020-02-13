class Employee1{

  
    constructor(public firstName:String,public lastName:String,public salary:Number,public gender:String,public email:String){
      

    }
    getAllNames(){
        console.log(this.firstName+" "+this.lastName)
    }
}
var obj1=new Employee1("Saurav","Sharma",1000,"male","srv@srv");
obj1.getAllNames();