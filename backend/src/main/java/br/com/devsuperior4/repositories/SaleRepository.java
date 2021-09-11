package br.com.devsuperior4.repositories;

import br.com.devsuperior4.dto.SaleSuccessDTO;
import br.com.devsuperior4.dto.SaleSumDTO;
import br.com.devsuperior4.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new br.com.devsuperior4.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT  new br.com.devsuperior4.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> sucessGroupedBySeller();

}
