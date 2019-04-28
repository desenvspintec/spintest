/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spinteste.controller.v1;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author adm
 */
@javax.ws.rs.ApplicationPath("webresources")
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
        resources.add(br.com.spin.spinteste.controller.v1.BaselinePlanejadoFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.CasoTesteFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.CentralCompanyFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.CidadeFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.EmpresaFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.EstadoFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.FornecedorFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.FuncionalidadeFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.PaisFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.PassoTesteFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.PessoaFisicaFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.PlanoTesteFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.ProdutoFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.ProjetoTesteFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.SuiteTesteFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.UserCompanyFacadeREST.class);
        resources.add(br.com.spin.spinteste.controller.v1.UsersFacadeREST.class);
    }
    
}
