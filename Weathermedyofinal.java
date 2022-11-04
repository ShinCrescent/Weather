/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathermedyofinal;
  import java.util.Scanner;
  import java.time.LocalDateTime; //use to display the current date an time
  import java.time.format.DateTimeFormatter; // import date and time formatter to separate the date from time 

/**
 *
 * @author 63905
 */
public class Weathermedyofinal {

public static String location,cities;
public static boolean status = true ; // boolean a logical data type that checks or represen if the statement is true 
public static Scanner input = new Scanner(System.in);
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       mainfunct();
      }
   
    public static void mainfunct(){
       
        {
            System.out.print("WELCOME TO JSR WEATHER APPLICATION");
            LocalDateTime myDateObj = LocalDateTime.now(); // using the now() method this data type will display the current date and time
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");// by putting the ofPattern() in the same package you can remove the nanoseconds from date-time method and can arrange it in your choose format.
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.print("\n\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n");
            System.out.println("Date And Time Of Forecast Viewing: " + formattedDate); 
            System.out.print("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
            
           
        }
    }
    
   public static void locationfunct() {
        while(status) // use to continually execute a block of statement until it is true 
        {
            System.out.print("\n___________________________________________________\n");
            System.out.println("\n Choose Location:   \n[]Cdo \n[]Malaybalay  \n[]Iligan  \n[]Davao \n[]Ozamiz \n[]Gingoog \n[]Jasaan \n");
            System.out.print("___________________________________________________\n");

            cities = input.next();
              
            switch (cities) {
                case "Cdo":
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n          3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:77%\n" +
                                      "Precipitation Chance: 69%\n" +
                                      "Sunrise :05:29\n" +
                                      "Sunset:17:22\n" +
                                      "Wind:9 km/h");
                   System.out.print("\n__________________________________\n");
                   System.out.print( "\nSat, 22 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Isolated tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:77%\n" +
                                      "Precipitation Chance: 60%\n" +
                                      "Sunrise :05:29\n" +
                                      "Sunset:17:22\n" +
                                      "Wind:9 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "A few tstorms. Overcast.\n" +
                                      "Feels Like:34 °C\n" +
                                      "Humidity:78%\n" +
                                      "Precipitation Chance: 63%\n" +
                                      "Sunrise :05:29\n" +
                                      "Sunset:17:22\n" +
                                      "Wind:9 km/h");  
                    System.out.print("\n__________________________________\n");
                    status = false;
                    break; // this break the switch statement if the condition is true 
                    
                case "Malaybalay":                 
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n          3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:77%\n" +
                                      "Precipitation Chance: 69%\n" +
                                      "Sunrise :05:26\n" +
                                      "Sunset:17:21\n" +
                                      "Wind:9 km/h");
                     System.out.print("\n__________________________________\n");
                     System.out.print( "\nSat, 22 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Isolated tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:77%\n" +
                                      "Precipitation Chance: 60%\n" +
                                      "Sunrise :05:26\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:9 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "A few tstorms. Overcast.\n" +
                                      "Feels Like:34 °C\n" +
                                      "Humidity:78%\n" +
                                      "Precipitation Chance: 63%\n" +
                                      "Sunrise :05:26\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:9 km/h");                  
                    System.out.print("\n__________________________________\n");
                    
                    status = false;
                    break;
                    
                case "Iligan":       
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n           3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "28 / 21 °C\n" +
                                      "Tstorms late. Overcast.\n" +
                                      "Feels Like:28 °C\n" +
                                      "Humidity:79%\n" +
                                      "Precipitation Chance: 77%\n" +
                                      "Sunrise :05:30\n" +
                                      "Sunset:17:24\n" +
                                      "Wind:9 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSat, 22 Oct\n" +
                                      "28 / 21 °C\n" +
                                      "Thunderstorms. Overcast.\n" +
                                      "Feels Like:27 °C\n" +
                                      "Humidity:83%\n" +
                                      "Precipitation Chance: 75%\n" +
                                      "Sunrise :05:30\n" +
                                      "Sunset:17:24\n" +
                                      "Wind:8 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "6 / 21 °C\n" +
                                      "A few tstorms. Overcast.\n" +
                                      "Feels Like:26 °C\n" +
                                      "Humidity:85%\n" +
                                      "Precipitation Chance: 70%\n" +
                                      "Sunrise :05:30\n" +
                                      "Sunset:17:24\n" +
                                      "Wind:9 km/h");                 
                   System.out.print("\n__________________________________\n");

                    status = false;
                    break;
                    
                case "Davao":        
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n           3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "31 / 24 °C\n" +
                                      "Isolated tstorms. Overcast.\n" +
                                      "Feels Like:34 °C\n" +
                                      "Humidity:73%\n" +
                                      "Precipitation Chance: 68%\n" +
                                      "Sunrise :05:24\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:10 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSat, 22 Oct\n" +
                                      "31 / 24 °C\n" +
                                      "Scattered tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:75%\n" +
                                      "Precipitation Chance: 59%\n" +
                                      "Sunrise :05:24\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:10 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Thunderstorms. Overcast.\n" +
                                      "Feels Like:33 °C\n" +
                                      "Humidity:79%\n" +
                                      "Precipitation Chance: 67%\n" +
                                      "Sunrise :05:24\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:10 km/h");             
                    System.out.print("\n__________________________________\n");
                    status = false;
                    break;
                    
                case "Ozamiz" :
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n           3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "28 / 21 °C\n" +
                                      "Tstorms late. Overcast.\n" +
                                      "Feels Like:27 °C\n" +
                                      "Humidity:81%\n" +
                                      "Precipitation Chance: 83%\n" +
                                      "Sunrise :05:32\n" +
                                      "Sunset:17:26\n" +
                                      "Wind:8 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSat, 22 Oct\n" +
                                      "28 / 21 °C\n" +
                                      "Thunderstorms. Overcast.\n" +
                                      "Feels Like:27 °C\n" +
                                      "Humidity:82%\n" +
                                      "Precipitation Chance: 66%\n" +
                                      "Sunrise :05:32\n" +
                                      "Sunset:17:26\n" +
                                      "Wind:9 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "26 / 21 °C\n" +
                                      "Thunderstorms. Overcast.\n" +
                                      "Feels Like:25 °C\n" +
                                      "Humidity:85%\n" +
                                      "Precipitation Chance: 77%\n" +
                                      "Sunrise :05:32\n" +
                                      "Sunset:17:26\n" +
                                      "Wind:7 km/h");             
                    System.out.print("\n__________________________________\n");
                    status = false;
                    break;
                    
                case "Gingoog" :
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n           3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "31 / 24 °C\n" +
                                      "Scattered tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:75%\n" +
                                      "Precipitation Chance: 60%\n" +
                                      "Sunrise :05:27\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:9 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSat, 22 Oct\n" +
                                      "31 / 24 °C\n" +
                                      "Isolated tstorms. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:72%\n" +
                                      "Precipitation Chance: 41%\n" +
                                      "Sunrise :05:27\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:10 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Thunderstorms. Overcast.\n" +
                                      "Feels Like:33 °C\n" +
                                      "Humidity:79%\n" +
                                      "Precipitation Chance: 81%\n" +
                                      "Sunrise :05:27\n" +
                                      "Sunset:17:20\n" +
                                      "Wind:9 km/h");             
                    System.out.print("\n__________________________________\n");
                    status = false;
                    break;
                    
                case "Jasaan" :
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n           3 DAYS WEATHER FORECAST\n");
                    System.out.print("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nFri, 21 Oct\n" +
                                      "31 / 24 °C\n" +
                                      "Scattered tstorms late. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:75%\n" +
                                      "Precipitation Chance: 60%\n" +
                                      "Sunrise :05:28\n" +
                                      "Sunset:17:22\n" +
                                      "Wind:9 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSat, 22 Oct\n" +
                                      "31 / 24 °C\n" +
                                      "Isolated tstorms. Overcast.\n" +
                                      "Feels Like:35 °C\n" +
                                      "Humidity:72%\n" +
                                      "Precipitation Chance: 41%\n" +
                                      "Sunrise :05:28\n" +
                                      "Sunset:17:22\n" +
                                      "Wind:10 km/h");
                    System.out.print("\n__________________________________\n");
                    System.out.print( "\nSun, 23 Oct\n" +
                                      "30 / 24 °C\n" +
                                      "Thunderstorms. Overcast.\n" +
                                      "Feels Like:33 °C\n" +
                                      "Humidity:79%\n" +
                                      "Precipitation Chance: 81%\n" +
                                      "Sunrise :05:28\n" +
                                      "Sunset:17:21\n" +
                                      "Wind:9 km/h");             
                    System.out.print("\n__________________________________\n");
                    status = false;
                    break;
                    
                default: // the default statement will appear if none of the cases is true
                    System.out.println("City Not Included \n");
                    status = true;
                    break;
            }
    }
   
        }
    }