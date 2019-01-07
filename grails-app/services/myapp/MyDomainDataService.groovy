package myapp

import grails.gorm.services.Service

@Service
interface MyDomainDataService {

	MyDomain get(Long id)

}
