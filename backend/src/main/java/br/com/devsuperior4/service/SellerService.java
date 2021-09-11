package br.com.devsuperior4.service;

import br.com.devsuperior4.dto.SellerDTO;
import br.com.devsuperior4.entity.seller.Seller;
import br.com.devsuperior4.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        List<Seller> sellers = Optional.of(sellerRepository.findAll()).orElse( new ArrayList<>());
        return sellers.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }


}
