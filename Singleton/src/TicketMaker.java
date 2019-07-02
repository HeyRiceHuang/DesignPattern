public class TicketMaker {

    private static volatile TicketMaker tickerMaker;
    private int ticket = 1000;

    public int GetNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker GetTickerMaker() {
        if (tickerMaker == null) {
            synchronized (TicketMaker.class) {
                if (tickerMaker == null) {
                    tickerMaker = new TicketMaker();
                }
                return  tickerMaker;
            }
        }
        return tickerMaker;
    }

    private TicketMaker(){};

}
