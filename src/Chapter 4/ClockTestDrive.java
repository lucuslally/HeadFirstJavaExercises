class Clock{
    String time;

    void setTime(String t){
        time = t;
    }
    String getTime(){
        return time;
    }
}



public class ClockTestDrive {
    public static void main (String[] args){

        Clock c = new Clock();

        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}

/*
Instance variable, argument, return, getter, setter,
encapsulation, public, private, pass by value, method

A class can have any number of these        = Instance variable, getter, setter, method
A method can have only one of these         = return
This can be implicitly promoted             = return, argument
I prefer my instance variables private      = encapsulation
It really means 'make a copy'               = pass by value
Only setters should update these            = Instance variable
A method can have many of these             = argument
I return something by definition            = getter
I shouldn't be used with instance variables = public
I can have many arguments                   = method
By definition, I take one argument          = setter
These help create encapsulation             = getter, setter, public, private
I always fly solo                           = return

 */