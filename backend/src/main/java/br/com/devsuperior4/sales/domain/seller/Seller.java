package br.com.devsuperior4.sales.domain.seller;

import br.com.devsuperior4.sales.domain.sale.Sale;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = " tb_sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales = new ArrayList<>();

}
