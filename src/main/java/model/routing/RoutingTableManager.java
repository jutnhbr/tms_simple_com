package model.routing;

import java.util.ArrayList;
import java.util.List;

public class RoutingTableManager {
    private final List<RoutingEntry> routingTable = new ArrayList<>();
    private final List<ReverseRoutingEntry> reverseRoutingTable = new ArrayList<>();


//    public void addRoutingEntry(String destAddr, String destSeqNum, String nextHop, String hopCount, String prev) {
//        routingTable.add(new RoutingEntry(destAddr, destSeqNum, nextHop, hopCount, prev));
//    }

    public void addRoutingEntry(RoutingEntry routingEntry){
        routingTable.add(routingEntry);
    }
    public void addReverseRoutingEntry(String destAddr, String sourceAddr, String hopCount, String prev) {
        reverseRoutingTable.add(new ReverseRoutingEntry(destAddr, sourceAddr, hopCount, prev));
    }

    public List<RoutingEntry> getRoutingTable() {
        return routingTable;
    }
    public List<ReverseRoutingEntry> getReverseRoutingTable() {
        return reverseRoutingTable;
    }
}
