package com.example.service;

public class TestService {

    /*private TestApi computeClient;

    private static final String SERVER_NAME = "microservice-provider-user";

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/gethello/{name}", method = RequestMethod.GET)
    public String getHello(@PathVariable("name") String name) {

        Feign.Builder feignBuilder= Feign.builder().decoder(new ResponseEntityDecoder(new SpringDecoder(new ObjectFactory<HttpMessageConverters>(){
            public HttpMessageConverters getObject() throws BeansException {
                return new HttpMessageConverters();
            }
        }))).client(new ApacheHttpClient()).contract(new SpringMvcContract());
        computeClient = feignBuilder.target(TestApi.class,discoveryClient.getInstances(SERVER_NAME).get(0).getUri().toString());
        return computeClient.testHello(name);
    }*/
}
