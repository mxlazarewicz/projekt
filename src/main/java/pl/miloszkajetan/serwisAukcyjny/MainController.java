package pl.miloszkajetan.serwisAukcyjny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.miloszkajetan.serwisAukcyjny.user.UserRegistrationService;

@Controller
public class MainController {

    @Autowired
    private UserRegistrationService userRegistrationService;



}