package com.SpringInMemoryExample.SpringInMemoryExample.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[] {SpringSecurityConfig.class};
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[] {"/"};
    }

}
