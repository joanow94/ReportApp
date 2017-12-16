package pl.edu.utp.dvdrental2.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reservation.class)
public abstract class Reservation_ {

	public static volatile SingularAttribute<Reservation, Movie> idMovie;
	public static volatile SingularAttribute<Reservation, Date> dateOfReservation;
	public static volatile SingularAttribute<Reservation, Integer> id;
	public static volatile SingularAttribute<Reservation, Customer> idCustomer;

}

