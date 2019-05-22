package flightapp.controller;


import flightapp.repositories.CouponRepository;
import flightapp.repositories.TicketRepository;
import flightapp.services.DiscountService;
import flightapp.services.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
public class HelloController {
    //    private BaggageRepository baggageRepository;
//    private CouponRepository couponRepository;
//    private TicketRepository ticketRepository;
    private DiscountService discountService;
    private TicketService ticketService;

    public HelloController() {
        ArrayList<Integer> couponList = new ArrayList<>();
        couponList.add(1);
        CouponRepository couponRepository = new CouponRepository(couponList);
        discountService = new DiscountService(couponRepository);

        ArrayList<Integer> list = getIListOfTickets();
        TicketRepository ticketRepository = new TicketRepository(list);
        ticketService = new TicketService(ticketRepository);
    }


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    public ResponseEntity<Boolean> getTicket(int ticketId) {

        return new ResponseEntity<>(ticketService.isTicketAvailable(ticketId), HttpStatus.OK);
    }

    private ArrayList<Integer> getIListOfTickets() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        return list;
    }
}