package myapp

import grails.core.GrailsApplication
import org.grails.orm.hibernate.HibernateDatastore


class MyService {

	GrailsApplication grailsApplication

	HibernateDatastore hibernateDatastore

	/**
	 * adding @Autowired gives "Field myDomainDataService in myapp.MyService required a bean of type 'myapp.MyDomainDataService' that could not be found."
	 */
	MyDomainDataService myDomainDataService

	void hello() {
		// myDomainDataService autowired: null
		println "myDomainDataService autowired: ${myDomainDataService}"
		// myDomainDataService from context: myapp.$MyDomainDataServiceImplementation@5151accb
		println "myDomainDataService from context: ${grailsApplication.mainContext.getBean("myDomainDataService")}"
		// myDomainDataService from context: myapp.$MyDomainDataServiceImplementation@5151accb
		println "myDomainDataService from datastore: ${hibernateDatastore.getService(MyDomainDataService)}"
	}

}
