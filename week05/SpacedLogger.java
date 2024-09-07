public class SpacedLogger implements Logger {

    @Override
    public void log(String log) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < log.length(); i++){
            sb.append(log.charAt(i));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    @Override
    public void error(String log) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < log.length(); i++){
            sb.append(log.charAt(i));
            sb.append(" ");

    }
    System.out.println("ERROR: " + sb.toString());
    }

}
