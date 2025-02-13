package emcast.subject.dto.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItemInfo {
    private String itemName;
    private Long price;
    private Integer count;
}
