package com.senai.aula07api.controllers;

import org.springframework.web.bind.annotation.*; // * permite importar todos os metodos http

import com.senai.aula07api.models.*;
import  java.util.ArrayList;
import  java.util.List;
@RestController // RestController é um metodo que indica que a classe ira receber requisições http

// Rota produtos
@RequestMapping("/produtos") 
public class ProdutoControllers {

    // Lista que simula um banco de dados

    private List<Produto> produtos = new ArrayList<>();


    // Cria um construtor para produtocontrollers

    public ProdutoControllers(){
        produtos.add(new Produto(1,"Notebook" , 3500));

        produtos.add(new Produto(2, "Mouse", 100));

        produtos.add(new Produto(3, "Teclado", 250));

    }




    //==============
    // Cria metodo get para listar todos os produtos
    // ==============

    @GetMapping 
    public List<Produto> listarProdutos(){
        return produtos;
    }


    //======
    // Cria metodo get para listar os produtos por id
    //======

    @GetMapping("/{id}")
    public  Produto buscarProduto(@PathVariable int id){
        for(Produto produto:produtos){
            if(produto.getId()==id){
                return produto;
            }
            
            
        }
        
      return null;
    }



    //===== 
    // Post para cadastrar um produto

    @PostMapping 
    public Produto cadastrarProduto(@RequestBody Produto produto ){
        produtos.add(produto);
        return produto;

    }


    //===== 
    // Put - Atualizar Produto
  
   // =====

   @PutMapping("/{id}")
   public Produto atualizarProduto(@PathVariable int id, @RequestBody Produto produtoatualizado){

    for(Produto produto: produtos){
        if(produto.getId() == id){
            produto.setNome(produtoatualizado.getNome());
            produto.setPreco(produtoatualizado.getPreco());
        }
    }
    return null;



   }


//=====
    // Delete - Deletar Produto pelo id
    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable int id){
        for(Produto produto:produtos){
            if(produto.getId()==id){
                produtos.remove(produto);
                return "Produto deletado com sucesso!";
            }
        }
        return "Produto não encontrado!";
    }

    
}
