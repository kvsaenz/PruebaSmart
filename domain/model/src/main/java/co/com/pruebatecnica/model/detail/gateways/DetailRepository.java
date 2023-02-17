package co.com.pruebatecnica.model.detail.gateways;

import co.com.pruebatecnica.model.detail.Detail;

import java.util.List;

public interface DetailRepository {

    boolean saveDetail(Detail product);

    List<Detail> retrieveDetails(Long numFactura);
}
