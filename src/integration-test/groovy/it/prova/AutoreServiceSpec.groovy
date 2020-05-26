package it.prova

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AutoreServiceSpec extends Specification {

    AutoreService autoreService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Autore(...).save(flush: true, failOnError: true)
        //new Autore(...).save(flush: true, failOnError: true)
        //Autore autore = new Autore(...).save(flush: true, failOnError: true)
        //new Autore(...).save(flush: true, failOnError: true)
        //new Autore(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //autore.id
    }

    void "test get"() {
        setupData()

        expect:
        autoreService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Autore> autoreList = autoreService.list(max: 2, offset: 2)

        then:
        autoreList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        autoreService.count() == 5
    }

    void "test delete"() {
        Long autoreId = setupData()

        expect:
        autoreService.count() == 5

        when:
        autoreService.delete(autoreId)
        sessionFactory.currentSession.flush()

        then:
        autoreService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Autore autore = new Autore()
        autoreService.save(autore)

        then:
        autore.id != null
    }
}
