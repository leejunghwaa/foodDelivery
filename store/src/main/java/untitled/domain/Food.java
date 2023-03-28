package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.StoreApplication;
import untitled.domain.Accepted;
import untitled.domain.CookFinished;
import untitled.domain.CookStarted;
import untitled.domain.Rejected;

@Entity
@Table(name = "Food_table")
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderid;

    private String foodid;

    private String option;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();

        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();

        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static FoodRepository repository() {
        FoodRepository foodRepository = StoreApplication.applicationContext.getBean(
            FoodRepository.class
        );
        return foodRepository;
    }

    public static void loadOrderInfo(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Food food = new Food();
        repository().save(food);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(food->{
            
            food // do something
            repository().save(food);


         });
        */

    }

    public static void loadOrderInfo(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Food food = new Food();
        repository().save(food);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(food->{
            
            food // do something
            repository().save(food);


         });
        */

    }
}
