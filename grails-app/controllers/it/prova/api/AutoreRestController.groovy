package it.prova.api

import grails.rest.RestfulController
import it.prova.Autore
import it.prova.AutoreService
import static org.springframework.http.HttpStatus.*

class AutoreRestController extends RestfulController<Autore>{

    AutoreService autoreService

    static responseFormats = ['json', 'xml']
    AutoreRestController() {
        super(Autore)
    }

    def search(params){ 
        params.max = Math.min(params.max?params.max as int:'0' as int ?: 10, 100)
        def autoreSearchList = autoreService.search(params)
        respond autoreList:autoreSearchList,autoreCount: autoreSearchList.totalCount
    }

    // def index(){
    //     try{
    //         throw new RuntimeException('Bel problema...')
    //     }catch(RuntimeException ex){
    //         render(contentType: "application/json") {
    //             error 'HSV Maloo'
    //             message 'Holden'
    //             status NOT_FOUND.value
    //         }
    //     }
    // }

    // def save(Autore input){
    //     throw new RuntimeException('brutta storia...')
    // }

}
