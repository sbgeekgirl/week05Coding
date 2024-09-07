public class App {

        public static void main(String[] args) {
            
            Logger starLogger = new AsteriskLogger();
            starLogger.log("Your server's on fire");
            starLogger.error("All of your Server's are on fire");

            Logger spaceLogger = new SpacedLogger();
            spaceLogger.log("Dumpster fire");
            spaceLogger.error("Really big dumpster fire");
        }
}
