package pl.edu.utp.dvdrental2.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rental.class)
public abstract class Rental_ {

	public static volatile CollectionAttribute<Rental, Extension> extensionCollection;
	public static volatile SingularAttribute<Rental, Date> dateOfRental;
	public static volatile SingularAttribute<Rental, Piece> idPiece;
	public static volatile SingularAttribute<Rental, Integer> id;
	public static volatile SingularAttribute<Rental, Customer> idCustomer;

}

