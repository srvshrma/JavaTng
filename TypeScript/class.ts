class Rectangle{

    length:Number;
    height:Number;

    getArea():Number{
        let area=Number(this.length)*Number(this.height)
        return area;
    }
    getParameter():any{
        
        return 2*(Number(this.length)+Number(this.height));
    }

}

var rec=new Rectangle();
rec.height=10;
rec.length=20;

var area=rec.getArea();
console.log(area);

var param=rec.getParameter();
console.log(param);
console.log("Using class")