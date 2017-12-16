package pl.edu.utp.dvdrental2.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile CollectionAttribute<Customer, Rental> rentalCollection;
	public static volatile CollectionAttribute<Customer, Regive> regiveCollection;
	public static volatile SingularAttribute<Customer, String> firstname;
	public static volatile SingularAttribute<Customer, String> password;
	public static volatile CollectionAttribute<Customer, Reservation> reservationCollection;
	public static volatile SingularAttribute<Customer, Integer> id;
	public static volatile SingularAttribute<Customer, Date> dateOfCreateAccount;
	public static volatile SingularAttribute<Customer, String> login;
	public static volatile CollectionAttribute<Customer, PhoneNumbers> phoneNumbersCollection;
	public static volatile SingularAttribute<Customer, String> lastname;

}

