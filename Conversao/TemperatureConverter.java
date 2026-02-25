public class TemperatureConverter {

    

     static float fc (float f) {

        float c = 0;
       c = ((f-30)/2);
        return c;
        
    }

     static float cf (float c) {

        float f = 0;
        f = (c*2) + 30;
         return f;
         
     }

    
}
