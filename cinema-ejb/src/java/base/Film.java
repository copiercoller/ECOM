/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import UtilsJson.JsonReader;
import java.io.InputStream;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import sun.misc.IOUtils;

/**
 *
 * @author moi
 */
@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String titre;
    private String affiche;
    private int runtime;
    private String release;
    private float prix ;

    public Film(Long id, float prix) {
        setId(id);
        this.prix=prix;
        
    }

    public Film() {
    }

public float getPrix()
{
    return prix;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAffiche(String s) {
        return "http://image.tmdb.org/t/p/" + s + affiche + "?api_key=63d250a5b71c307f7592228c79b729cf";
    }
    
        public String getTitre() {
        return titre;
    }



    public String getRelease() {
        return release;
    }

    public int getRuntime() {
        return runtime;
    }

    public boolean load() {
        String urlString = "https://api.themoviedb.org/3/movie/" + id + "?api_key=63d250a5b71c307f7592228c79b729cf";
        try {
            JSONObject json = JsonReader.readJsonFromUrl(urlString);
            titre = (String) json.get("title");
            affiche = (String) json.get("poster_path");
            runtime = (int) json.get("runtime");
            release = (String) json.get("release_date");
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Film.Film[ id=" + id + " ]";
    }

}
