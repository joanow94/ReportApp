package pl.edu.utp.dvdrental2.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Regive.class)
public abstract class Regive_ {

	public static volatile SingularAttribute<Regive, Date> dateOfRegive;
	public static volatile SingularAttribute<Regive, Piece> idPiece;
	public static volatile SingularAttribute<Regive, Integer> id;
	public static volatile SingularAttribute<Regive, Customer> idCustomer;

}

