package salif.backend.plainte.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import salif.backend.plainte.Entity.Utilisateur;

public interface UtilisateurRepository<Long> extends JpaRepository<Utilisateur, Long> {
    
}
