package commandwindow;

import java.util.Scanner;

public class CommandWindow {
    
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("Greeting Sir, how may I be of assistance?");
    
            String command;
            System.out.print("Please type a command: ");
            command = user_input.nextLine();
                    
            if ("weather".equals(command)) {
                weather weatherObject = new weather();
                weatherObject.weatherResult();
                
                System.out.print("Input command: ");
                command = user_input.nextLine();
            }
            if ("news".equals(command)){
                news newsObject = new news();
                newsObject.newsResult();
            }
            if ("alarm".equals(command)){
                alarm alarmObject = new alarm();
                alarmObject.alarmResult();
            }
            if ("date".equals(command)){
                date dateObject = new date();
                dateObject.dateResult();
            }
            if ("forecast".equals(command)){
                forecast forecastObject = new forecast();
                forecastObject.forecastResult();
            }
            if ("jarvis".equals(command)){
                jarvis jarvisObject = new jarvis();
                jarvisObject.jarvisResult();
            }
            if ("killradio".equals(command)){
                killradio killradioObject = new killradio();
                killradioObject.killRadioResult();
            }
            if ("mute".equals(command)){
                mute muteObject = new mute();
                muteObject.muteResult();
            }
            if ("radio".equals(command)){
                radio radioObject = new radio();
                radioObject.radioResult();
            }
            if ("speak".equals(command)){
                speak speakObject = new speak();
                speakObject.speakResult();
            }
            if ("time".equals(command)){
                time timeObject = new time();
                timeObject.timeResult();
            }
            if ("unmute".equals(command)){
                unmute unmuteObject = new unmute();
                unmuteObject.unmuteResult();
            }
        
    }
    
}
