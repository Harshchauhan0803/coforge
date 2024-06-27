package coforge.com.config;







import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebApplicationInitializer extends

 AbstractAnnotationConfigDispatcherServletInitializer {

 @Override

 protected Class<?>[] getRootConfigClasses() {

 // TODO Auto-generated method stub

 //

 return new Class[] {ApplicationSecurityConfiguration.class};

 }

 @Override

 protected Class<?>[] getServletConfigClasses() {

 return new Class[] { MyWebMVCConfig.class };

 }

 @Override

 protected String[] getServletMappings() {

 return new String[] { "/" };

 }

}