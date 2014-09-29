/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Film;

import base.Film;
import base.InterfaceGetFilm;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author moi
 */
@Stateless(name="get_film")
public class GetFilm implements InterfaceGetFilm {
@PersistenceContext
public EntityManager em;
    @Override
    public Film getFilm (Long id)
    {
        return em.find(Film.class, id);
    }

@Override
    public List<Film> getAllFilm()
    {
        Query q = em.createQuery("Select Object(f) From Film f");
        return (List<Film>) q.getResultList();
    }
            
}
