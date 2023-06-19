package postalApp.services.serviceImpls;

import postalApp.models.responseModels.PostalApiResponse;
import postalApp.services.PostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PostalServiceImpl implements PostalService {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public PostalApiResponse fetchPostalResponse(String postalAddress) {
        String serviceUrl = "https://api.postalpincode.in/postoffice/"+postalAddress;
        return restTemplate.getForObject(serviceUrl, PostalApiResponse.class);
    }
}
