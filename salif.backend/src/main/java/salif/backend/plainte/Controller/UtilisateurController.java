package salif.backend.plainte.Controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import salif.backend.plainte.Service.UtilisateurService;


@AllArgsConstructor
@RestController
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    

}
