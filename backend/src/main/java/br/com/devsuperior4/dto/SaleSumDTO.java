package br.com.devsuperior4.dto;

import br.com.devsuperior4.entity.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleSumDTO {

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum){
        this.sellerName=seller.getName();
        this.sum=sum;
    }
}
