public class AsteriskLogger implements Logger {

    @Override
    public void log(String log) {
        System.out.println("***" + log + "***");

    }

    @Override
    public void error(String log) {
        for (int i = 1; i <= log.length() +12; i++){
            System.out.print("*");
        }
        System.out.println("*");
        System.out.println("***Error: " + log + "***");
        for (int i = 1; i <= log.length() +12; i++){
            System.out.print("*");
        }
        System.out.println("*");


    }




}
