import logProcessors.BaseLogProcessor;
import logProcessors.DebugLogProcessor;
import logProcessors.ErrorLogProcessor;
import logProcessors.InfoLogProcessor;

public class Main {

    /*
    This will implement Chain of Responsibility Design Pattern
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BaseLogProcessor logger =
                new InfoLogProcessor(
                        new DebugLogProcessor(
                                new ErrorLogProcessor(null)));

        logger.log("INFO","demo message");

    }
}