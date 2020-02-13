var Employee1 = /** @class */ (function () {
    function Employee1(firstName, lastName, salary, gender, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
        this.email = email;
    }
    Employee1.prototype.getAllNames = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return Employee1;
}());
var obj1 = new Employee1("Saurav", "Sharma", 1000, "male", "srv@srv");
obj1.getAllNames();
