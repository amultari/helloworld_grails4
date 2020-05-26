package it.prova

import grails.gorm.services.Service
import java.text.SimpleDateFormat

@Service(Autore)
abstract class AutoreService {

    abstract Autore get(Serializable id)
 
    abstract List<Autore> list(Map args)
 
    abstract Long count()
 
    abstract void delete(Serializable id)
 
    abstract Autore save(Autore autore)

    List<Autore> search(Map args){
        def autoreResultList = Autore.createCriteria().list (args) {
            if ( args.nome ) {
                ilike("nome", "%${args.nome}%")
            }
            if ( args.cognome ) {
                ilike("cognome", "%${args.cognome}%")
            }
            if ( args.inAttivita ) {
                eq("inAttivita", args.inAttivita.toBoolean())
            }
            if ( args.nazionalita ) {
                ilike("nazionalita", "%${args.nazionalita}%")
            }
            if ( args.dataNascita ) {
                ge 'dataNascita',new SimpleDateFormat("yyyy-MM-dd").parse(args.dataNascita)
            }
        }
    }

}