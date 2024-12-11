package acc.br.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/teste")
	public String teste(@RequestParam(name="escolha")String aEscolha, Model model){
		String saida = "Empate";
		if (aEscolha.equalsIgnoreCase("Papel")) {
			saida = "Ganhou!";
		}
		if (aEscolha.equalsIgnoreCase("Tesoura")) {
			saida = "Perdeu!";
		}
		model.addAttribute("saida", saida);
		model.addAttribute("aEscolha", aEscolha);
		return "resultado";
	}
}
