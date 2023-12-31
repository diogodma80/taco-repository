package com.dma.taco.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dma.taco.dao.IngredientRepository;
import com.dma.taco.entity.Taco;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	@Autowired
	IngredientRepository ingredientRepository;

	@GetMapping
	public String showDesignForm(Model model) {

		/*List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
				new Ingredient("COTO", "Corn Tortilla", Type.WRAP), 
				new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
				new Ingredient("CARN", "Carnitas", Type.PROTEIN),
				new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES), 
				new Ingredient("LETC", "Lettuce", Type.VEGGIES),
				new Ingredient("CHED", "Cheddar", Type.CHEESE), 
				new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
				new Ingredient("SLSA", "Salsa", Type.SAUCE), 
				new Ingredient("SRCR", "Sour Cream", Type.SAUCE));*/
		
//		List<Ingredient> ingredients = new ArrayList<>();
//		ingredientRepository.findAll().forEach(i -> ingredients.add(i));
//		
//		Kind[] types = Ingredient.Kind.values();
//		
//		for(Kind type : types) {
//			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
//		}
		
		model.addAttribute("design", new Taco());

		return "design";
	}

//	private List<Ingredient> filterByType(List<Ingredient> ingredients, Kind type) {
//		
//		return ingredients.stream().filter(x -> x.getKind().equals(type)).collect(Collectors.toList());
//	}
	
	@PostMapping
	public String processDesign(@Valid Taco taco, Errors errors) {
		
		if(errors.hasErrors()) {
			return "design";
		}

		// Save the taco design...
		
		log.info("Processing taco: " + taco);
		
		return "redirect:/orders/current";
	}
}
