"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(f, l, s, g, e) {
        this.firstName = f;
        this.lastName = l;
        this.email = e;
        this.gender = g;
        this.salary = s;
    }
    Employee.prototype.getAllNames = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return Employee;
}());
exports.Employee = Employee;
//var obj=new Employee("Saurav","Sharma",1000,"male","srv@srv");
//obj.getAllNames();
