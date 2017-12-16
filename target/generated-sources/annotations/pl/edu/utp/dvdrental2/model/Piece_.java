package pl.edu.utp.dvdrental2.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Piece.class)
public abstract class Piece_ {

	public static volatile SingularAttribute<Piece, Movie> idMovie;
	public static volatile CollectionAttribute<Piece, Rental> rentalCollection;
	public static volatile CollectionAttribute<Piece, Regive> regiveCollection;
	public static volatile SingularAttribute<Piece, Integer> isRental;
	public static volatile SingularAttribute<Piece, Integer> id;

}

