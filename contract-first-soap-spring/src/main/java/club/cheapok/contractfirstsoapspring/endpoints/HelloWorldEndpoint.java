package club.cheapok.contractfirstsoapspring.endpoints;

import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.helloworld.Person;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloWorldEndpoint {

    @PayloadRoot(namespace = "http://codenotfound.com/types/helloworld", localPart = "person")
    @ResponsePayload
    public Greeting sayHelloIgor(@RequestPayload Person request) {
        ObjectFactory factory = new ObjectFactory();
        String message = "Hello " + request.getFirstName() + ", " + request.getLastName();
        Greeting response = factory.createGreeting();
        response.setGreeting(message);
        return response;
    }
}
