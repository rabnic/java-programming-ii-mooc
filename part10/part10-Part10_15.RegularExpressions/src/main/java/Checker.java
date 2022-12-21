

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        String format = "mon|tue|wed|thu|fri|sat|sun";
        return string.matches(format);
    }
    
    public boolean allVowels(String string){
        String format = "[aeiou]*";
        return string.matches(format);
    }
    
    public boolean timeOfDay(String string){
        String format = "([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
        return string.matches(format);
    }

}
