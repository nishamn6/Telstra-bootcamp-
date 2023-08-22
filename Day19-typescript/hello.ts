let age:number=45;

console.log("age is "+ age);

let employeeName:string ="virat";
console.log("name "+employeeName);

// let available:boolean =true;
// console.log("availability : " + available);

let fruits:string[] =['apple','mango','banana'];
console.log(fruits.length)
console.log(fruits)

let arr:(string|number)[] = ['sachin','ravi',45,90,'virat'];
console.log(arr.length)
console.log(arr)

let msg:(string|boolean|number);

let msg2:string

msg="hello";
msg=45;
msg=true;

//msg2=true;
//msg=45;
msg="hii";

let marks:number[]=[67,87,67]
let item:[number,string][];

item =[[1,'laptop'],[2,'mobile']]

item.push([3,'toy']);
marks.push(34);

console.log(marks);

console.log(item)

var sum="virat";//it identifies the variable type

var month='january';

enum months
{
    january ="jan",
    february ="feb",
    march ="mar",
    april="april"

}
var months2 = months.january;
var months3 = months.february;
var months4 = months.march;
console.log(months2)
console.log(months3)
console.log(months4)





