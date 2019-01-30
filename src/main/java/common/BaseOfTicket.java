package common;

import serviceCenter.TicketOfServiceCenter;

import java.util.ArrayList;
import java.util.List;

public class BaseOfTicket {
    //TicketOfServiceCenter ticketOfService = new TicketOfServiceCenter();

    public List<String> ticketOfServiceCenter(String term) {
        String ticketID="703100";
        String adminOfServiceCenter="Ivanov";
        String engineerOfServiceCenter="sidorov";
        String customerOfServiceCenter= "petrov";
        String dateOfIncomeDevice="2019/12/12";
        String dateOfOutDevice="2019/12/13";
        String deviceOfServiceCenter="Laptpo,Loenovo,B50-80,Sn:ad121223,10000";
        double priceOfRepair = 1000;
        List<String> TicketOfService = new ArrayList<>();
        TicketOfService.add(ticketID);
        TicketOfService.add(adminOfServiceCenter);
        TicketOfService.add(engineerOfServiceCenter);
        TicketOfService.add(customerOfServiceCenter);
        TicketOfService.add(dateOfIncomeDevice);
        TicketOfService.add(dateOfOutDevice);
        TicketOfService.add(deviceOfServiceCenter);
        TicketOfService.add(String.valueOf(priceOfRepair));


        return TicketOfService;
    }
    List<TicketOfServiceCenter> baseOfTicket = new ArrayList<TicketOfServiceCenter>();

}
