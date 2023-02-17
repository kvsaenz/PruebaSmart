package co.com.pruebatecnica.jpa.service;

import co.com.pruebatecnica.jpa.help.DetailFactory;
import co.com.pruebatecnica.jpa.modelJPA.DetailPKData;
import co.com.pruebatecnica.jpa.repository.JPADetailRepository;
import co.com.pruebatecnica.model.detail.Detail;
import co.com.pruebatecnica.model.detail.gateways.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DetailServiceJPA implements DetailRepository {

    @Autowired
    JPADetailRepository jpaDetailRepository;

    DetailFactory detailFactory = new DetailFactory();

    private DetailFactory fact = new DetailFactory();


    @Override
    public boolean saveDetail(Detail detail) {
        jpaDetailRepository.save(detailFactory.billToData(detail));
        return true;
    }

    @Override
    public List<Detail> retrieveDetails(Long numFactura) {
        List<Detail> resp = new ArrayList<>();
        DetailPKData pk = new DetailPKData().builder().build();
        //jpaDetailRepository.findById(pk);
        return  null;
    }
}
