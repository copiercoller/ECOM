/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Film;

import base.Film;
import base.InterfaceManageFilm;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author moi
 */
@Stateless(name="manage_film")
public class ManageFilm implements InterfaceManageFilm{
@PersistenceContext
public EntityManager em;
    public boolean addFilm(Long id)
    {
        Film f = new Film(id);
        f.load();
        if (f.getTitre()!=null)
        {
        em.persist(f);
        return true;
        }
        else
        {
        return false;
        }
    }

}
