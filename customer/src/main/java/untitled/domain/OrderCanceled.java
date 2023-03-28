package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private String id;
    private String customerid;
    private String foodid;
    private String address;
    private Integer price;
    private Integer quantity;

    public OrderCanceled(Order aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
