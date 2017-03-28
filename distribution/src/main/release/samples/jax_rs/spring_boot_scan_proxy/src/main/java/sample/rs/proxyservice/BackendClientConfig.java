package sample.rs.proxyservice;

import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BackendClientConfig {

   @Bean
   public sample.rs.service.HelloService helloBackendClient() {
      JAXRSClientFactoryBean jaxrsClientFactoryBean = new JAXRSClientFactoryBean();
      jaxrsClientFactoryBean.setServiceClass(sample.rs.service.HelloService.class);
      jaxrsClientFactoryBean.setAddress("http://someotherserver/someotherpath");
      return (sample.rs.service.HelloService) jaxrsClientFactoryBean.create();
   }
}
