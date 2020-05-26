package helloworld

import it.prova.Autore
import java.text.SimpleDateFormat

class BootStrap {

    def init = { servletContext ->
        new Autore(nome:'Steve',cognome:'Palos',nazionalita:'USA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/09/1965"),inAttivita:true).save()
        new Autore(nome:'Marc',cognome:'Kilstren',nazionalita:'USA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("16/09/1975"),inAttivita:true).save()
        new Autore(nome:'Karlen',cognome:'Milteau',nazionalita:'FRA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/12/1959"),inAttivita:true).save()
        new Autore(nome:'Morlan',cognome:'Kostner',nazionalita:'ITA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("08/12/1969"),inAttivita:true).save()
        new Autore(nome:'Paul',cognome:'Kopp',nazionalita:'FRA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/12/1979"),inAttivita:true).save()
        new Autore(nome:'Karlot',cognome:'Anten',nazionalita:'USA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/12/1987"),inAttivita:true).save()
        new Autore(nome:'Josh',cognome:'Jool',nazionalita:'FRA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/02/1991"),inAttivita:false).save()
        new Autore(nome:'Karl',cognome:'Grey',nazionalita:'ITA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/12/1989"),inAttivita:true).save()
        new Autore(nome:'Antal',cognome:'Astur',nazionalita:'ITA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("28/01/1959"),inAttivita:true).save()
        new Autore(nome:'Karlan',cognome:'Swill',nazionalita:'USA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("08/04/1973"),inAttivita:true).save()
        new Autore(nome:'Jimmy',cognome:'Bing',nazionalita:'FRA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("08/07/1991"),inAttivita:false).save()
        new Autore(nome:'Franco',cognome:'Rentene',nazionalita:'ITA',dataNascita:new SimpleDateFormat("dd/MM/yyyy").parse("14/12/1973"),inAttivita:true).save()
    }
    def destroy = {
    }
}
