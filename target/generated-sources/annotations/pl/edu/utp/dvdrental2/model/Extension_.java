package pl.edu.utp.dvdrental2.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Extension.class)
public abstract class Extension_ {

	public static volatile SingularAttribute<Extension, Date> dateOfExtension;
	public static volatile SingularAttribute<Extension, Rental> idRental;
	public static volatile SingularAttribute<Extension, Integer> days;
	public static volatile SingularAttribute<Extension, Integer> id;

}

