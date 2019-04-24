/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author adm
 */
@javax.ws.rs.ApplicationPath("rs")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.lgrapp.banco.CORSFilter.class);
        resources.add(br.com.lgrapp.banco.base.exception.AlertExceptionMapper.class);
        resources.add(br.com.lgrapp.banco.base.exception.ConsistenceExceptionMapper.class);
        resources.add(br.com.lgrapp.banco.controller.v1.AgenciaControllerV1.class);
        resources.add(br.com.lgrapp.banco.controller.v1.ContaControllerV1.class);
        resources.add(br.com.lgrapp.banco.controller.v1.ContaEntradaControllerV1.class);
        resources.add(br.com.lgrapp.banco.controller.v1.ContaSaidaControllerV1.class);
        resources.add(br.com.lgrapp.banco.controller.v1.PessoaFisicaControllerV1.class);
        resources.add(br.com.lgrapp.banco.controller.v1.PessoaJuridicaControllerV1.class);
    }
    
}
