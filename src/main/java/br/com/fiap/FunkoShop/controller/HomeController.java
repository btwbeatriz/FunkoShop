package br.com.fiap.FunkoShop.controller;

import br.com.fiap.FunkoShop.model.Pedido;
import br.com.fiap.FunkoShop.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ModelAndView home(){
        List<Pedido> pedidos = pedidoRepository.findAll();
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("pedidos", pedidos);
        return mv;
    }
}
