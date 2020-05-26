package it.prova

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AutoreController {

    AutoreService autoreService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 5, 100)
        respond autoreService.list(params), model:[autoreCount: autoreService.count()]
    }

    def show(Long id) {
        respond autoreService.get(id)
    }

    def create() {
        respond new Autore(params)
    }

    def save(Autore autore) {
        if (autore == null) {
            notFound()
            return
        }

        try {
            autoreService.save(autore)
        } catch (ValidationException e) {
            respond autore.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'autore.label', default: 'Autore'), autore.id])
                redirect autore
            }
            '*' { respond autore, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond autoreService.get(id)
    }

    def update(Autore autore) {
        if (autore == null) {
            notFound()
            return
        }

        try {
            autoreService.save(autore)
        } catch (ValidationException e) {
            respond autore.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'autore.label', default: 'Autore'), autore.id])
                redirect autore
            }
            '*'{ respond autore, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        autoreService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'autore.label', default: 'Autore'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'autore.label', default: 'Autore'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
