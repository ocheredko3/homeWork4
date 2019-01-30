package serviceCenter;

import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketOfServiceCenter {
    public ArrayList ticketOfServiceCenter(String term) {
        String ticketID;
        String adminOfServiceCenter;
        String engineerOfServiceCenter;
        String customerOfServiceCenter;
        String dateOfIncomeDevice;
        String dateOfOutDevice;
        String deviceOfServiceCenter;
        double priceOfRepair;
        List<String> TicketOfService = new ArrayList<>();
        TicketOfService.add(ticketID);
        TicketOfService.add(adminOfServiceCenter);
        TicketOfService.add(engineerOfServiceCenter);
        TicketOfService.add(customerOfServiceCenter);
        TicketOfService.add(dateOfIncomeDevice);
        TicketOfService.add(dateOfOutDevice);
        TicketOfService.add(deviceOfServiceCenter);
        TicketOfService.add(String.valueOf(priceOfRepair));
        List<TicketOfService> =new ArrayList<>();


    }
}