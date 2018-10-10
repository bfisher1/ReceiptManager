package manager;


import java.time.LocalDateTime;
import java.util.List;

import receipt.Purchase;
import receipt.Receipt;

import IO.*;

public class ReceiptManager {
    private static String recFile;
    private List<Receipt> receipts;
    private static ReceiptManager instance = null;

    private ReceiptManager(String recFile) {
        instance.receipts = ReceiptReader.loadReceipts(recFile);
    }

    public static ReceiptManager getInstance() {
        if(instance == null) {
            instance = new ReceiptManager(recFile);
        }
        return instance;
    }

    public boolean saveReceipts() {
        return ReceiptWriter.saveReceipts(instance.receipts, recFile);
    }

    public void addReceipt(Receipt receipt) {
        return;
    }

    public boolean removeReceipt(Receipt receipt) {
        return false;
    }

    public void sortByData() {
        return;
    }

    public void sortReceiptsByPrice() {
        return;
    }

    public List<Purchase> getPricesSortedByCost() {
        return null;
    }

    /**
     * Return the purchases within the given time frame.
     *
     * @param start start of window of requested purchases
     * @param end end of window of requested purchases
     * @return list of purchases within the given time range
     */
    public List<Purchase> purchasesWithinTimeFrame(LocalDateTime start, LocalDateTime end) {
        return null;
    }

    public double totalSpendingInTimeRange(LocalDateTime start, LocalDateTime end) {
        return 0;
    }

    /**
     * Get a list of all the purchases that contain the target in their names.
     *
     * @param target string being searched for
     * @return list of purchases with the target string in the name
     */
    public List<Purchase> search(String target) {
        return null;
    }



}
