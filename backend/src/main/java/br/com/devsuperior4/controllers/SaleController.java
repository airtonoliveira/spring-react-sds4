package br.com.devsuperior4.controllers;

import br.com.devsuperior4.dto.SaleDTO;
import br.com.devsuperior4.dto.SaleSuccessDTO;
import br.com.devsuperior4.dto.SaleSumDTO;
import br.com.devsuperior4.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> sales = saleService.findAll(pageable);
        return ResponseEntity.ok(sales);
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> sales = saleService.amountGroupedBySeller();
        return ResponseEntity.ok(sales);
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
        List<SaleSuccessDTO> sales = saleService.successGroupedBySeller();
        return ResponseEntity.ok(sales);
    }

}
