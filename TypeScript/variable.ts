function hello(){
    for(let i=0;i<5;i++){
        console.log(i)
    }
    console.log("outside: "+i)
}

hello();

//use var or let 
//let will not allow variables usage outside loop 