package postalApp.dictionaryController;

import postalApp.models.responseModels.PostalApiResponse;
import postalApp.services.PostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostalServiceController {

    @Autowired
    PostalService postalServiceImpl;


    @GetMapping("/postOffice/test")
    public String testmethod(){
        System.out.println("Test Executed!");
        return "Test successfull!";
    }
    @PostMapping("/postOffice/getDetails/")
    @ResponseBody
    public PostalApiResponse getDefinition(@RequestBody String word){
        System.out.println("Requested Postal Address is: "+ word);
        return postalServiceImpl.fetchPostalResponse(word);
    }
}
