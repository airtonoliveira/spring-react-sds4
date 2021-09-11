package br.com.devsuperior4.dto;

import br.com.devsuperior4.entity.Sale;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO seller;


    public SaleDTO(Sale sale){
       this.id = sale.getId();
       this.visited = getVisited();
       this.deals = getDeals();
       this.amount = sale.getAmount();
       this.date = sale.getDate();
       this.seller= new SellerDTO(sale.getSeller());
    }

}
