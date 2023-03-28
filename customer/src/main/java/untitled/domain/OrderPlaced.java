package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private String id;
    private String customerid;
    private String foodid;
    private String address;
    private Integer price;
    private Integer quantity;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
