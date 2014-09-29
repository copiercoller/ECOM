/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author moi
 */
@Remote
public interface InterfaceGetFilm {
   public Film getFilm(Long id);
public List<Film> getAllFilm();
}
