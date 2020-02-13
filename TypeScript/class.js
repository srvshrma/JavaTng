var Rectangle = /** @class */ (function () {
    function Rectangle() {
    }
    Rectangle.prototype.getArea = function () {
        var area = Number(this.length) * Number(this.height);
        return area;
    };
    Rectangle.prototype.getParameter = function () {
        return 2 * (Number(this.length) + Number(this.height));
    };
    return Rectangle;
}());
var rec = new Rectangle();
rec.height = 10;
rec.length = 20;
var area = rec.getArea();
console.log(area);
var param = rec.getParameter();
console.log(param);
console.log("Using class");
