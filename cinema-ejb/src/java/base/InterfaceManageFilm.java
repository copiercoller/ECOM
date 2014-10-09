/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import javax.ejb.Remote;

/**
 *
 * @author moi
 */
@Remote
public interface InterfaceManageFilm {
    
    public String addFilm(Long id, float prix);
    public void delFilm(Long id);
}
