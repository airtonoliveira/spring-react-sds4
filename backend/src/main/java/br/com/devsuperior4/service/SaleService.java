package br.com.devsuperior4.service;

import br.com.devsuperior4.dto.SaleDTO;
import br.com.devsuperior4.entity.sale.Sale;
import br.com.devsuperior4.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Page<SaleDTO> findAll(Pageable pageable){
        Page<Sale> sale = Optional.of(saleRepository.findAll(pageable)).orElse(Page.empty());
        return sale.map(x -> new SaleDTO(x));
    }

}
