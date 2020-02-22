import {Calculator} from './calculator'
import { Rectangle } from './rectangle'
describe('testing calculator class',function(){
    it('test add function',function(){

        //Arrange -> creating a object of class which function we want to test
        let cal=new Calculator();

        //Act  -> calling the fucntion which we want to test
        let actualResult = cal.addNumbers(10,20);

        //Assert -> compare the actual reslt withexpected result
        let expectedResult = 30;
        expect(actualResult).toBe(expectedResult)
    })

    it('test sub function',function(){

        let cal=new Calculator;
        let actualResult = cal.subNumbers(40,20);

        let expectedResult = 20;
        expect(actualResult).toBe(expectedResult);

    })

    it('test area function',function(){

        let rect=new Rectangle;
        let actualResult = rect.getArea(2,2);
        let expectedResult = 4
        expect(actualResult).toBe(expectedResult);

    })
    it('test perimeter function',function(){

        let rect = new Rectangle;
        let actualResult = rect.getPerimeter(2,2);
        let expectedResult = 8;
        expect(actualResult).toBe(expectedResult);
    })
})