var Employee = /** @class */ (function () {
    function Employee(id, name, salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee.prototype.displayEmployeeInfo = function () {
        console.log(this.id);
        console.log(this.name);
        console.log(this.salary);
    };
    Employee.prototype.calculatePerDay = function () {
        return this.salary / 30;
    };
    return Employee;
}());
var emp = new Employee(1, "virat", 78000);
emp.displayEmployeeInfo();
console.log(emp.calculatePerDay());
