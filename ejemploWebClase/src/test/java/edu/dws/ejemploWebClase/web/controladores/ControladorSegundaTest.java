package edu.dws.ejemploWebClase.web.controladores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWebClase.aplicacion.AplicacionConfiguracionContexto;
import edu.dws.ejemploWebClase.web.WebConfiguracionContexto;
import edu.dws.ejemploWebClase.web.controladores.ControladorSegunda;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AplicacionConfiguracionContexto.class, WebConfiguracionContexto.class})
@WebAppConfiguration
public class ControladorSegundaTest {
    @Autowired
    private ControladorSegunda controladorSegunda;

    @Test
    public void testHandleRequestView() {	
        ModelAndView modelAndView = controladorSegunda.gestionSolicitud();	
        //Vamos a asegurarnos de que la vista guardada en el modelAndView será la que queremos.
        //Se comparan los nombres.
        assertEquals("/vistas/segunda.jsp", modelAndView.getViewName());
    }
}
