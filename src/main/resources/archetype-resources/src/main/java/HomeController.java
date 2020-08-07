package $package;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    /**
     * Muestra la Página de Inicio
     *
     * @param nombre nombre de la persona (opcional)
     * @param modelo objeto {@link Model} con el modelo de la vista
     *
     * @return un objeto {@link String} con la respuesta a la solicitud
     */
    @GetMapping
    public String paginaInicio(@PathVariable Optional<String> nombre, Model modelo) {
        // Verificar si el parámetro ingresado por url está presente
        if (nombre.isPresent()) {
            // Agregar nombre al modelo
            modelo.addAttribute("nombre", nombre.get()/ ) ;
        }

        // Mostrar página
        return "home";
    }

}