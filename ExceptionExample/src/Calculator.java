public class Calculator {
    double caldouble(int number) throws MyArithException{
        if(number ==0)
            throw new MyArithException("Zero not allowed");
        if(number <0)
            throw new MyArithException("Negative not allowed");
        return (double)number;
    }
}
