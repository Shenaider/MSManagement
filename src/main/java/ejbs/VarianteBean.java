package ejbs;

import entities.Product;
import entities.Variante;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VarianteBean {

    @PersistenceContext
    EntityManager em;

    public void create(int codigo, String nomeProduto, String name, double weff_p, double weff_n, double ar, double sigmaC){
        Product product = em.find(Product.class, nomeProduto);
        Variante p = new Variante(codigo, product, name, weff_p, weff_n, ar, sigmaC);
        em.persist(p);
    }

    public Variante getVariante(int codigo){
        return em.find(Variante.class, codigo);
    }


}
