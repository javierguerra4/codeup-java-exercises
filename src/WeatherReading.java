//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Date;
//
//public class WeatherReading {
//    private double latitude;
//    private double longitude;
//    private Date recordedAt;
//        private double tempInCelsius;
//
//
//        public static void kelToCel(){double celsius, fahrenhiet, kelvin;
//            BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
//            System.out.println ("Enter temperature in Kelvin");
//            kelvin = Double.parseDouble ( br.readLine() );
//            celsius = kelvin - 273.0;
//            System.out.println ("\n" + kelvin + "K = "+ celsius + "C");
//            fahrenhiet = (celsius * 9.0/5.0) + 32.0;
//            System.out.println ("\n" + kelvin + "K = " + fahrenhiet +"F");}
//}


//================================= WARM UP
//
//        Create a class called, WeatherReading, with the following members:
//
//private instance variables:
//
//        double latitude
//        double longitude
//        Date (from java.util.Date) recordedAt
//        double tempInCelsius
//
//public static method:
//
//        kelvinToCelsius - takes in a double and returns a double, converting temp from Kelvin to Celsius
//
//public instance methods:
//
//        getters and setters
//
//        for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
//        add a constructor that sets all fields
//
//        when setting the tempInCelsius pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
//        Add the following main method to test it out:
//
//public static void main(String[] args) {
//
//        double latitude = -98.4936;
//        double longitude = 29.4241;
//        Date recordedAt = new Date();
//        double tempInKelvin = 300;
//        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
//        System.out.println(wr.getTempInCelsius());
//
//        }
