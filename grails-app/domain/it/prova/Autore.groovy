package it.prova

class Autore {

    String nome
    String cognome
    Date dataNascita
    String nazionalita
    Boolean inAttivita

    static constraints = {
        nome()
        cognome()
        dataNascita()
        nazionalita inList: ["ITA", "USA", "FRA"]
        inAttivita()
    }
}
