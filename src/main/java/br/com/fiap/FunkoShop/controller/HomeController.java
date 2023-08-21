package br.com.fiap.FunkoShop.controller;

import br.com.fiap.FunkoShop.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Funko POP Animation: Demon Slayer - Tanjiro Kamado");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/71dxjiwBlZL._AC_SX569_.jpg");
        pedido.setUrlImagem2("https://m.media-amazon.com/images/I/61Zcd1gpREL._AC_SX569_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Funko-POP-Animation-Slayer-Multicolor/dp/B083MC39H5/ref=sr_1_1?crid=106WSGV13VVY6&keywords=funko+demon+slayer&qid=1692637812&sprefix=funko+demon+s%2Caps%2C258&sr=8-1&ufe=app_do%3Aamzn1.fos.6d798eae-cadf-45de-946a-f477d47705b9");
        pedido.setDescricao("Funko - Ideal para presentear ou colecionar. Figura colecionável com 10cm, fabricado em vinil de alta qualidade. Fabricante: Funko - Não possui articulação. ESTE PRODUTO É RECOMENDADO PARA MAIORES DE 15 ANOS, NÃO É BRINQUEDO.");
        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
