package architecture_microservices.tp1;

import org.springframework.data.repository.CrudRepository;

import architecture_microservices.tp1.Utilisateur;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

}