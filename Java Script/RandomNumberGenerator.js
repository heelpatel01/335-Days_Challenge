function checkLeapYear(year){
    if(year%4!=0){
        return "Not Leap Year";
    }
    else if(year%100==0){
        return "It's Leap Year";
    }
    else if(year%400==0){
        return "It's Leap Year";
    }
    else{
        return "Not Leap Year";
    }
}

var result=checkLeapYear(2400);
console.log(result);