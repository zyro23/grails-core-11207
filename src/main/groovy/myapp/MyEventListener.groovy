package myapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class MyEventListener {

	@Autowired
	MyService myService

	@EventListener(ContextRefreshedEvent)
	void contextRefreshed() {
		println "context refreshed"
		myService.hello()
	}

}
