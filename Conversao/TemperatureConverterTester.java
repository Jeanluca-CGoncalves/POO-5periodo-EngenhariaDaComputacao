public class TemperatureConverterTester {
    
    public static void main(String[] args) {
        float f = 0;
        float c = 0;

       c = TemperatureConverter.fc (80);
       f =  TemperatureConverter.cf (25);

        System.out.println(c);
        System.out.println(f);
    }
}
