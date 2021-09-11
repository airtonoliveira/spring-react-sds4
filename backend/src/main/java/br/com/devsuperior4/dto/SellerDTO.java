package br.com.devsuperior4.dto;

import br.com.devsuperior4.entity.seller.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO(Seller seller){
        this.id = seller.getId();
        this.name = seller.getName();
    }



}
