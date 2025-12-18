package orderApp.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderRequest {
	@NotNull
	private List<OrderItemRequest> orderItems;
	@NotNull(message="Restaurant ID Cannot be Null")
	private Integer restaurantId;
}
 