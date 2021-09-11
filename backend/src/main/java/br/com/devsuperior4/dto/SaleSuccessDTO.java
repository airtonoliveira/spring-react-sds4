package br.com.devsuperior4.dto;

import br.com.devsuperior4.entity.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleSuccessDTO {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals){
        this.sellerName=seller.getName();
        this.visited=visited;
        this.deals=deals;

    }
}
