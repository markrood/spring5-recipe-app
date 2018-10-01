package rood.mark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rood.mark.domain.Catagory;
import rood.mark.domain.UnitOfMeasure;
import rood.mark.repository.CategoryRepository;
import rood.mark.repository.UnitOfMeasureRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }



    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(){
        Optional<Catagory> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> uomOtional = unitOfMeasureRepository.findByDescription("Tablespoon");
        System.out.println("Cat id = "+categoryOptional.get().getId());
        System.out.println("UOM id = "+uomOtional.get().getId());

        return "index";
    }
}
