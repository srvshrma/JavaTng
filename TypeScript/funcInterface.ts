//First Way
function draw(a:Number,b:Number){
    console.log(a,b);
}

draw(10,20)

//Second way i.e. convinient
interface Dimension{
    a:Number;
    b:Number;
}
function draw1(dimension:Dimension){
    console.log(dimension);
}

draw1({
    a:10,b:20
})
