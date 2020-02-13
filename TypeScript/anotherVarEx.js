var fname = "Saurav";
fname = "Sharma";
// We can redeclare with let 
var lname = "Rahul";
lname = "Jindal";
// Cannot redeclare with const 
//First way to declare
var colorRed = 1;
var colorGreen = 2;
var colorYellow = 3;
//Another way to declare
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Yellow"] = 2] = "Yellow";
})(Color || (Color = {}));
console.log(Color.Red);
