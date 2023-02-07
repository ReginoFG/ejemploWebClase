package edu.dws.ejemploWebClase;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.dws.ejemploWebClase.aplicacion.AplicacionConfiguracionContexto;
import edu.dws.ejemploWebClase.web.WebConfiguracionContexto;

public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer{
    
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AplicacionConfiguracionContexto.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguracionContexto.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
}
