package com.marcosviniciusdev.exerciciossb.model.repository;

import com.marcosviniciusdev.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface ProdutoRepository extends ListPagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);

}
