class Rectangle1{

    private length:Number;
    private height:Number;

    constructor(l,h){
        this.length=l;
        this.height=h;
        }
    getArea():Number{
        let area=Number(this.length)*Number(this.height)
        return area;
    }
    getParameter():any{
        
        return 2*(Number(this.length)+Number(this.height));
    }

}
var rect=new Rectangle1(10,20);

var area1=rect.getArea();
console.log(area1);


var param1=rect.getParameter();
console.log(param1);
console.log("Using class constructor")