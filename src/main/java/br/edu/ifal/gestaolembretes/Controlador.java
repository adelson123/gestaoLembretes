package br.edu.ifal.gestaolembretes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping("/")
    public ModelAndView index(){

         return new ModelAndView ("index.html");

}

    @RequestMapping("/lembretes/cadastro")

    public ModelAndView telaCadastro(){
        return new ModelAndView("cadastro.html");


    }

    @RequestMapping("/lembretes/lista")
    
    public ModelAndView telaLista(){
        return new ModelAndView("lista.html");


    }



}