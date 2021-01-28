package pl.miloszkajetan.serwisAukcyjny.categories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {


    Optional<Category> findAll (String categoryName);

    default List<Category> getCategories(){

        return findAll();
    }



}
