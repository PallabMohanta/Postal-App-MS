package postalApp.services;

import postalApp.models.responseModels.PostalApiResponse;

public interface PostalService {

    PostalApiResponse fetchPostalResponse(String postalAddress);
}
