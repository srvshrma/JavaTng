function addNumber(a, b) {
    console.log(this.a + this.b);
}
var output = function (name) {
    console.log("heya");
};
var output2 = function () { return console.log("hey there"); };
