/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller;

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
        resources.add(br.com.spin.spintest.controller.v1.BaselinePlanejadoControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.CasoTesteControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.CentralCompanyControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.CidadeControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.EmpresaControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.EstadoControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.FornecedorControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.FuncionalidadeControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.PaisControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.PassoTesteControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.PessoaFisicaControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.PlanoTesteControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.ProdutoControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.ProjetoTesteControllerV1.class);
        resources.add(br.com.spin.spintest.controller.v1.SuiteTesteControllerV1.class);
        resources.add(br.com.spin.spintest.filters.CORSFilter.class);
    }
    
}
