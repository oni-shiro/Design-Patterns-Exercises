package logProcessors;

public abstract class BaseLogProcessor {


    BaseLogProcessor nextLogProcessor;

    public BaseLogProcessor(BaseLogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(String logLevel,String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(logLevel,message);
        }
    }


}
