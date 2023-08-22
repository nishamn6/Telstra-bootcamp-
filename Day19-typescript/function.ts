function addition(num1:number,num2:number) :number
{
 return num1+num2;   
}
addition(3,6);

//default parameter
function sub(num1:number ,num2:number=0):number
{
    return num1+num2;
}

//optional parameter
function add2(num1?:number ,num2?:number,num3?:number)
{
    console.log(num1);
    console.log(num2);
    console.log(num3);

}
console.log(addition(1,1));
console.log(sub(3));
console.log(sub(4,2));
console.log(add2(1));
console.log(add2(3,7));

let calculate = (num1:number,num2:number) :number => num1+num2;