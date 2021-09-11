package br.com.devsuperior4.service;

import br.com.devsuperior4.dto.SaleDTO;
import br.com.devsuperior4.dto.SaleSuccessDTO;
import br.com.devsuperior4.dto.SaleSumDTO;
import br.com.devsuperior4.entity.Sale;
import br.com.devsuperior4.repositories.SaleRepository;
import br.com.devsuperior4.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> sale = Optional.of(saleRepository.findAll(pageable)).orElse(Page.empty());
        return sale.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return saleRepository.sucessGroupedBySeller();
    }


}
