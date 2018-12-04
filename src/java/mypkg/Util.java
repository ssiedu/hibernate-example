package mypkg;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
public static SessionFactory getSF(){
    Configuration config=new Configuration().configure("hdata.cfg.xml");
    SessionFactory factory=config.buildSessionFactory();
    return factory;
}    
}
