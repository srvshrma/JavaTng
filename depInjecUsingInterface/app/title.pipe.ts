import { Pipe, PipeTransform } from '@angular/core';


@Pipe({
    name:'link'
})
export class TitlePipe implements PipeTransform{
    transform(value: String,gender:String):String {
        if(gender=="M"){
            return "Mr. "+value;
        }
        else{
            return "Mrs. "+value;
        }
       
    }


}