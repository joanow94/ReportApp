package pl.edu.utp.dvdrental2.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Movie.class)
public abstract class Movie_ {

	public static volatile CollectionAttribute<Movie, Piece> pieceCollection;
	public static volatile SingularAttribute<Movie, String> country;
	public static volatile SingularAttribute<Movie, Movie> idPreviousMovie;
	public static volatile CollectionAttribute<Movie, Movie> movieCollection;
	public static volatile SingularAttribute<Movie, String> director;
	public static volatile SingularAttribute<Movie, String> yearOfPremiere;
	public static volatile SingularAttribute<Movie, String> genre;
	public static volatile CollectionAttribute<Movie, Reservation> reservationCollection;
	public static volatile SingularAttribute<Movie, Integer> id;
	public static volatile SingularAttribute<Movie, String> title;
	public static volatile SingularAttribute<Movie, Integer> priceForDay;

}

