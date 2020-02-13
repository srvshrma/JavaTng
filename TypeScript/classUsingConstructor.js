var Rectangle1 = /** @class */ (function () {
    function Rectangle1(l, h) {
        this.length = l;
        this.height = h;
    }
    Rectangle1.prototype.getArea = function () {
        var area = Number(this.length) * Number(this.height);
        return area;
    };
    Rectangle1.prototype.getParameter = function () {
        return 2 * (Number(this.length) + Number(this.height));
    };
    return Rectangle1;
}());
var rect = new Rectangle1(10, 20);
var area1 = rect.getArea();
console.log(area1);
var param1 = rect.getParameter();
console.log(param1);
console.log("Using class constructor");
