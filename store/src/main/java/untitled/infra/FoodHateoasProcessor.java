package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class FoodHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Food>> {

    @Override
    public EntityModel<Food> process(EntityModel<Food> model) {
        return model;
    }
}
