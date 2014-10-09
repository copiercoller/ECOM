/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function addFilm()
{
    var id = document.getElementById("add_film_id").value;
    var prix = document.getElementById("add_film_prix").value;
        xhr = new XMLHttpRequest();
    xhr.onload = function() {
        document.getElementById("add_result").innerHTML= xhr.responseText;
    };
    xhr.open("get", "Add?id=" + id + "&prix=" + prix, true);
    xhr.send();
}