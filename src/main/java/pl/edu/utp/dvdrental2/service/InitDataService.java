/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.dvdrental2.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.utp.dvdrental2.model.Customer;
import pl.edu.utp.dvdrental2.model.Employee;
import pl.edu.utp.dvdrental2.model.Extension;
import pl.edu.utp.dvdrental2.model.Movie;
import pl.edu.utp.dvdrental2.model.PhoneNumbers;
import pl.edu.utp.dvdrental2.model.Piece;
import pl.edu.utp.dvdrental2.model.Regive;
import pl.edu.utp.dvdrental2.model.Rental;
import pl.edu.utp.dvdrental2.model.Reservation;

/**
 *
 * @author nowakowska joanna
 */
@Service
public class InitDataService {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ExtensionService extensionService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private PhoneNumbersService phoneNumbersService;
    @Autowired
    private PieceService pieceService;
    @Autowired
    private RegiveService regiveService;
    @Autowired
    private RentalService rentalService;
    @Autowired
    private ReservationService reservationService;

    @PostConstruct
    public void init() {

        //delete all data
        regiveService.deleteAll();
        extensionService.deleteAll();
        rentalService.deleteAll();
        reservationService.deleteAll();
        phoneNumbersService.deleteAll();
        customerService.deleteAll();
        employeeService.deleteAll();
        pieceService.deleteAll();
        movieService.deleteAll();
        
        
        /**
         * Movies with piecies
         */
        Movie m01 = new Movie(1, "Zielona mila", "Frank Darabont", "dramat", "USA", "1999", 10);
        Piece p01 = new Piece(1, 0);
        Piece p02 = new Piece(2, 0);
        Piece p03 = new Piece(3, 0);
        Piece p04 = new Piece(4, 0);
        Piece p05 = new Piece(5, 0);
        p01.setIdMovie(m01);
        p02.setIdMovie(m01);
        p03.setIdMovie(m01);
        p04.setIdMovie(m01);
        p05.setIdMovie(m01);
        movieService.save(Arrays.asList(m01));
        pieceService.save(Arrays.asList(p01, p02, p03, p04, p05));

        Movie m02 = new Movie(2, "Titanic", "James Cameron", "dramat", "USA", "1997", 10);
        Piece p06 = new Piece(6, 0);
        Piece p07 = new Piece(7, 0);
        Piece p08 = new Piece(8, 0);
        Piece p09 = new Piece(9, 0);
        Piece p10 = new Piece(10, 0);
        p06.setIdMovie(m02);
        p07.setIdMovie(m02);
        p08.setIdMovie(m02);
        p09.setIdMovie(m02);
        p10.setIdMovie(m02);
        movieService.save(Arrays.asList(m02));
        pieceService.save(Arrays.asList(p06, p07, p08, p09, p10));

        Movie m03 = new Movie(3, "Avatar", "James Cameron", "akcja", "USA", "2009", 10);
        Piece p11 = new Piece(11, 0);
        Piece p12 = new Piece(12, 0);
        Piece p13 = new Piece(13, 0);
        Piece p14 = new Piece(14, 0);
        Piece p15 = new Piece(15, 0);
        p11.setIdMovie(m03);
        p12.setIdMovie(m03);
        p13.setIdMovie(m03);
        p14.setIdMovie(m03);
        p15.setIdMovie(m03);
        movieService.save(Arrays.asList(m03));
        pieceService.save(Arrays.asList(p11, p12, p13, p14, p15));

        Movie m04 = new Movie(4, "Obcy", "James Cameron", "Horror", "USA", "1989", 10);
        Piece p16 = new Piece(16, 0);
        Piece p17 = new Piece(17, 0);
        Piece p18 = new Piece(18, 0);
        Piece p19 = new Piece(19, 0);
        Piece p20 = new Piece(10, 0);
        p16.setIdMovie(m04);
        p17.setIdMovie(m04);
        p18.setIdMovie(m04);
        p19.setIdMovie(m04);
        p20.setIdMovie(m04);
        movieService.save(Arrays.asList(m04));
        pieceService.save(Arrays.asList(p16, p17, p18, p19, p20));

        Movie m05 = new Movie(5, "Milczenie owiec", "Jonathan Demme", "horror", "Niemcy", "1998", 10);
        Piece p21 = new Piece(21, 0);
        Piece p22 = new Piece(22, 0);
        Piece p23 = new Piece(23, 0);
        Piece p24 = new Piece(24, 0);
        Piece p25 = new Piece(25, 0);
        p21.setIdMovie(m05);
        p22.setIdMovie(m05);
        p23.setIdMovie(m05);
        p24.setIdMovie(m05);
        p25.setIdMovie(m05);
        movieService.save(Arrays.asList(m05));
        pieceService.save(Arrays.asList(p21, p22, p23, p24, p25));

        Movie m06 = new Movie(6, "Filadelfia", "Jonathan Demme", "dramat", "Anglia", "1998", 10);
        Piece p26 = new Piece(26, 0);
        Piece p27 = new Piece(27, 0);
        Piece p28 = new Piece(28, 0);
        Piece p29 = new Piece(29, 0);
        Piece p30 = new Piece(30, 0);
        p26.setIdMovie(m06);
        p27.setIdMovie(m06);
        p28.setIdMovie(m06);
        p29.setIdMovie(m06);
        p30.setIdMovie(m06);
        movieService.save(Arrays.asList(m06));
        pieceService.save(Arrays.asList(p26, p27, p28, p29, p30));

        Movie m07 = new Movie(7, "Full Metal Jacket", "Stanley Kubrick", "sci-fi", "Anglia", "1978", 10);
        Piece p31 = new Piece(31, 0);
        Piece p32 = new Piece(32, 0);
        Piece p33 = new Piece(33, 0);
        Piece p34 = new Piece(34, 0);
        Piece p35 = new Piece(35, 0);
        p31.setIdMovie(m07);
        p32.setIdMovie(m07);
        p33.setIdMovie(m07);
        p34.setIdMovie(m07);
        p35.setIdMovie(m07);
        movieService.save(Arrays.asList(m07));
        pieceService.save(Arrays.asList(p31, p32, p33, p34, p35));

        Movie m08 = new Movie(8, "Mechaniczna pomarańcza", "Stanley Kubrick", "sci-fi", "USA", "1987", 10);
        Piece p36 = new Piece(36, 0);
        Piece p37 = new Piece(37, 0);
        Piece p38 = new Piece(38, 0);
        Piece p39 = new Piece(39, 0);
        Piece p40 = new Piece(40, 0);
        p36.setIdMovie(m08);
        p37.setIdMovie(m08);
        p38.setIdMovie(m08);
        p39.setIdMovie(m08);
        p40.setIdMovie(m08);
        movieService.save(Arrays.asList(m08));
        pieceService.save(Arrays.asList(p36, p37, p38, p39, p40));

        Movie m09 = new Movie(9, "Lśnienie", "Stanley Kubrick", "horror", "USA", "1991", 10);
        Piece p41 = new Piece(41, 0);
        Piece p42 = new Piece(42, 0);
        Piece p43 = new Piece(43, 0);
        Piece p44 = new Piece(44, 0);
        Piece p45 = new Piece(45, 0);
        p41.setIdMovie(m09);
        p42.setIdMovie(m09);
        p43.setIdMovie(m09);
        p44.setIdMovie(m09);
        p45.setIdMovie(m09);
        movieService.save(Arrays.asList(m09));
        pieceService.save(Arrays.asList(p41, p42, p43, p44, p45));

        Movie m10 = new Movie(10, "Pianista", "Roman Polański", "wojenny", "Polska", "2002", 10);
        Piece p46 = new Piece(46, 0);
        Piece p47 = new Piece(47, 0);
        Piece p48 = new Piece(48, 0);
        Piece p49 = new Piece(49, 0);
        Piece p50 = new Piece(50, 0);
        p46.setIdMovie(m10);
        p47.setIdMovie(m10);
        p48.setIdMovie(m10);
        p49.setIdMovie(m10);
        p50.setIdMovie(m10);
        movieService.save(Arrays.asList(m10));
        pieceService.save(Arrays.asList(p46, p47, p48, p49, p50));

        Movie m11 = new Movie(11, "Park Jurajski", "Steven Spielberg", "sci-fi", "USA", "2014", 10);
        Piece p51 = new Piece(51, 0);
        Piece p52 = new Piece(52, 0);
        Piece p53 = new Piece(53, 0);
        Piece p54 = new Piece(54, 0);
        Piece p55 = new Piece(55, 0);
        p51.setIdMovie(m11);
        p52.setIdMovie(m11);
        p53.setIdMovie(m11);
        p54.setIdMovie(m11);
        p55.setIdMovie(m11);
        movieService.save(Arrays.asList(m11));
        pieceService.save(Arrays.asList(p51, p52, p53, p54, p55));

        Movie m12 = new Movie(12, "Lista Shindlera", "Steven Spielberg", "dramat", "Anglia", "1997", 10);
        Piece p56 = new Piece(56, 0);
        Piece p57 = new Piece(57, 0);
        Piece p58 = new Piece(58, 0);
        Piece p59 = new Piece(59, 0);
        Piece p60 = new Piece(60, 0);
        p56.setIdMovie(m12);
        p57.setIdMovie(m12);
        p58.setIdMovie(m12);
        p59.setIdMovie(m12);
        p60.setIdMovie(m12);
        movieService.save(Arrays.asList(m12));
        pieceService.save(Arrays.asList(p56, p57, p58, p59, p60));

        Movie m13 = new Movie(13, "Pulp Fiction", "Quentin Tarantino", "komedia", "Niemcy", "1994", 10);
        Piece p61 = new Piece(61, 0);
        Piece p62 = new Piece(62, 0);
        Piece p63 = new Piece(63, 0);
        Piece p64 = new Piece(64, 0);
        Piece p65 = new Piece(65, 0);
        p61.setIdMovie(m13);
        p62.setIdMovie(m13);
        p63.setIdMovie(m13);
        p64.setIdMovie(m13);
        p65.setIdMovie(m13);
        movieService.save(Arrays.asList(m13));
        pieceService.save(Arrays.asList(p61, p62, p63, p64, p65));

        Movie m14 = new Movie(14, "Django", "Quentin Tarantino", "komedia", "USA", "2016", 10);
        Piece p66 = new Piece(66, 0);
        Piece p67 = new Piece(67, 0);
        Piece p68 = new Piece(68, 0);
        Piece p69 = new Piece(69, 0);
        Piece p70 = new Piece(70, 0);
        p66.setIdMovie(m14);
        p67.setIdMovie(m14);
        p68.setIdMovie(m14);
        p69.setIdMovie(m14);
        p70.setIdMovie(m14);
        movieService.save(Arrays.asList(m14));
        pieceService.save(Arrays.asList(p66, p67, p68, p69, p70));

        Movie m15 = new Movie(15, "Bękarty wojny", "Quentin Tarantino", "wojenny", "Anglia", "2010", 10);
        Piece p71 = new Piece(71, 0);
        Piece p72 = new Piece(72, 0);
        Piece p73 = new Piece(73, 0);
        Piece p74 = new Piece(74, 0);
        Piece p75 = new Piece(75, 0);
        p71.setIdMovie(m15);
        p72.setIdMovie(m15);
        p73.setIdMovie(m15);
        p74.setIdMovie(m15);
        p75.setIdMovie(m15);
        movieService.save(Arrays.asList(m15));
        pieceService.save(Arrays.asList(p71, p72, p73, p74, p75));

        Movie m16 = new Movie(16, "Strażnicy Galaktyki", "James Gunn", "Sci-Fi", "USA", "2014", 15);
        Piece p76 = new Piece(76, 0);
        Piece p77 = new Piece(77, 0);
        Piece p78 = new Piece(78, 0);
        Piece p79 = new Piece(79, 0);
        Piece p80 = new Piece(80, 0);
        p76.setIdMovie(m16);
        p77.setIdMovie(m16);
        p78.setIdMovie(m16);
        p79.setIdMovie(m16);
        p80.setIdMovie(m16);
        movieService.save(Arrays.asList(m16));
        pieceService.save(Arrays.asList(p76, p77, p78, p79, p80));
        
        Movie m17 = new Movie(17, "Strażnicy Galaktyki vol. 2", "James Gunn", "Sci-Fi", "USA", "2017", 20);
        Piece p81 = new Piece(81, 0);
        Piece p82 = new Piece(82, 0);
        Piece p83 = new Piece(83, 0);
        Piece p84 = new Piece(84, 0);
        Piece p85 = new Piece(85, 0);
        p81.setIdMovie(m17);
        p82.setIdMovie(m17);
        p83.setIdMovie(m17);
        p84.setIdMovie(m17);
        p85.setIdMovie(m17);
        m17.setIdPreviousMovie(m16);
        movieService.save(Arrays.asList(m17));
        pieceService.save(Arrays.asList(p81, p82, p83, p84, p85));

        /**
         * Customers with phone numbers and reservation or rental or regive
         */
        Customer c01 = new Customer(1, "William", "Smith", "smith123", "qwerty123", new Date("12/11/2015"));
        PhoneNumbers tel01 = new PhoneNumbers(1, "794-456-322");
        tel01.setIdCustomer(c01);
        Reservation res01 = new Reservation(1, new Date("12/10/2017"));
        res01.setIdCustomer(c01);
        res01.setIdMovie(m15);
        Rental r06 = new Rental(6, new Date("11/09/2017"));
        r06.setIdCustomer(c01);
        r06.setIdPiece(p76);
        Regive reg01 = new Regive(1, new Date("11/10/2017"));
        reg01.setIdCustomer(c01);
        reg01.setIdPiece(p76);
        customerService.save(Arrays.asList(c01));
        rentalService.save(Arrays.asList(r06));
        regiveService.save(Arrays.asList(reg01));
        reservationService.save(Arrays.asList(res01));
        phoneNumbersService.save(Arrays.asList(tel01));

        Customer c02 = new Customer(2, "John", "Williams", "williams123", "qwerty123", new Date("02/01/2015"));
        PhoneNumbers tel02 = new PhoneNumbers(2, "234-456-322");
        tel02.setIdCustomer(c02);
        //MOVIE 1
        Reservation res06 = new Reservation(6, new Date("04/10/2016"));
        res06.setIdCustomer(c02);
        res06.setIdMovie(m01);
        Rental r16 = new Rental(16, new Date("04/12/2016"));
        r16.setIdCustomer(c02);
        r16.setIdPiece(p01);
        Extension ex06 = new Extension(6, 3, new Date("04/13/2016"));
        ex06.setIdRental(r16);
        Regive reg16 = new Regive(16, new Date("04/16/2016"));
        reg16.setIdCustomer(c02);
        reg16.setIdPiece(p01);
        //MOVIE 2
        Reservation res07 = new Reservation(7, new Date("05/10/2016"));
        res07.setIdCustomer(c02);
        res07.setIdMovie(m02);
        Rental r17 = new Rental(17, new Date("05/12/2016"));
        r17.setIdCustomer(c02);
        r17.setIdPiece(p06);
        Extension ex07 = new Extension(7, 3, new Date("05/13/2016"));
        ex07.setIdRental(r17);
        Regive reg17 = new Regive(17, new Date("05/16/2016"));
        reg17.setIdCustomer(c02);
        reg17.setIdPiece(p06);
        //MOVIE 3
        Reservation res08 = new Reservation(8, new Date("06/10/2016"));
        res08.setIdCustomer(c02);
        res08.setIdMovie(m03);
        Rental r18 = new Rental(18, new Date("06/12/2016"));
        r18.setIdCustomer(c02);
        r18.setIdPiece(p11);
        Extension ex08 = new Extension(8, 3, new Date("06/13/2016"));
        ex08.setIdRental(r18);
        Regive reg18 = new Regive(18, new Date("06/16/2016"));
        reg18.setIdCustomer(c02);
        reg18.setIdPiece(p11);
        //MOVIE 4
        Reservation res09 = new Reservation(9, new Date("07/10/2016"));
        res09.setIdCustomer(c02);
        res09.setIdMovie(m04);
        Rental r19 = new Rental(19, new Date("07/12/2016"));
        r19.setIdCustomer(c02);
        r19.setIdPiece(p20);
        Extension ex09 = new Extension(9, 3, new Date("07/13/2016"));
        ex09.setIdRental(r19);
        Regive reg19 = new Regive(19, new Date("07/16/2016"));
        reg19.setIdCustomer(c02);
        reg19.setIdPiece(p20);
        //MOVIE 15
        Rental r01 = new Rental(1, new Date("11/04/2017"));
        r01.setIdCustomer(c02);
        r01.setIdPiece(p71);
        Regive reg02 = new Regive(2, new Date("11/05/2017"));
        reg02.setIdCustomer(c02);
        reg02.setIdPiece(p71);
        customerService.save(Arrays.asList(c02));
        reservationService.save(Arrays.asList(res06, res07, res08, res09));
        rentalService.save(Arrays.asList(r01, r16, r17, r18, r19));
        extensionService.save(Arrays.asList(ex06, ex07, ex08, ex09));
        regiveService.save(Arrays.asList(reg02, reg16, reg17, reg18, reg19));
        phoneNumbersService.save(Arrays.asList(tel02));

        Customer c03 = new Customer(3, "James", "Brown", "brown123", "qwerty123", new Date("06/12/2015"));
        PhoneNumbers tel03 = new PhoneNumbers(3, "553-868-556");
        tel03.setIdCustomer(c03);
        //MOVIE 5
        Reservation res10 = new Reservation(10, new Date("07/10/2017"));
        res10.setIdCustomer(c03);
        res10.setIdMovie(m05);
        Rental r20 = new Rental(20, new Date("07/12/2017"));
        r20.setIdCustomer(c03);
        r20.setIdPiece(p22);
        Extension ex10 = new Extension(10, 3, new Date("07/13/2017"));
        ex10.setIdRental(r20);
        Regive reg20 = new Regive(20, new Date("07/16/2017"));
        reg20.setIdCustomer(c03);
        reg20.setIdPiece(p22);
        //MOVIE 6
        Reservation res11 = new Reservation(11, new Date("02/10/2016"));
        res11.setIdCustomer(c03);
        res11.setIdMovie(m06);
        Rental r21 = new Rental(21, new Date("02/12/2016"));
        r21.setIdCustomer(c03);
        r21.setIdPiece(p30);
        Extension ex11 = new Extension(11, 3, new Date("02/13/2016"));
        ex11.setIdRental(r21);
        Regive reg21 = new Regive(21, new Date("02/16/2016"));
        reg21.setIdCustomer(c03);
        reg21.setIdPiece(p30);
        //MOVIE 7
        Reservation res12 = new Reservation(12, new Date("08/10/2016"));
        res12.setIdCustomer(c03);
        res12.setIdMovie(m07);
        Rental r22 = new Rental(22, new Date("08/12/2016"));
        r22.setIdCustomer(c03);
        r22.setIdPiece(p33);
        Extension ex12 = new Extension(12, 3, new Date("08/13/2016"));
        ex12.setIdRental(r22);
        Regive reg22 = new Regive(22, new Date("08/16/2016"));
        reg22.setIdCustomer(c03);
        reg22.setIdPiece(p33);
        //MOVIE 8
        Reservation res13 = new Reservation(13, new Date("09/10/2016"));
        res13.setIdCustomer(c03);
        res13.setIdMovie(m08);
        Rental r23 = new Rental(23, new Date("09/12/2016"));
        r23.setIdCustomer(c03);
        r23.setIdPiece(p40);
        Extension ex13 = new Extension(13, 3, new Date("09/13/2016"));
        ex13.setIdRental(r23);
        Regive reg23 = new Regive(23, new Date("09/16/2016"));
        reg23.setIdCustomer(c03);
        reg23.setIdPiece(p40);
        //MOVIE 15
        Rental r02 = new Rental(2, new Date("11/05/2017"));
        r02.setIdCustomer(c03);
        r02.setIdPiece(p72);
        Regive reg03 = new Regive(3, new Date("11/06/2017"));
        reg03.setIdCustomer(c03);
        reg03.setIdPiece(p72);
        customerService.save(Arrays.asList(c03));
        reservationService.save(Arrays.asList(res10, res11, res12, res13));
        rentalService.save(Arrays.asList(r02, r20, r21, r22, r23));
        extensionService.save(Arrays.asList(ex10, ex11, ex12, ex13));
        regiveService.save(Arrays.asList(reg03, reg20, reg21, reg22, reg23));
        phoneNumbersService.save(Arrays.asList(tel03));

        Customer c04 = new Customer(4, "Jacob", "Miller", "miller123", "qwerty123", new Date("12/12/2015"));
        PhoneNumbers tel04 = new PhoneNumbers(4, "232-111-444");
        tel04.setIdCustomer(c04);
        //MOVIE 9
        Reservation res14 = new Reservation(14, new Date("01/10/2016"));
        res14.setIdCustomer(c04);
        res14.setIdMovie(m09);
        Rental r24 = new Rental(24, new Date("01/12/2016"));
        r24.setIdCustomer(c04);
        r24.setIdPiece(p41);
        Extension ex14 = new Extension(14, 3, new Date("01/13/2016"));
        ex14.setIdRental(r24);
        Regive reg24 = new Regive(24, new Date("01/16/2016"));
        reg24.setIdCustomer(c04);
        reg24.setIdPiece(p41);
        //MOVIE 10
        Reservation res15 = new Reservation(15, new Date("02/10/2016"));
        res15.setIdCustomer(c04);
        res15.setIdMovie(m10);
        Rental r25 = new Rental(25, new Date("02/12/2016"));
        r25.setIdCustomer(c04);
        r25.setIdPiece(p46);
        Extension ex15 = new Extension(15, 3, new Date("02/13/2016"));
        ex15.setIdRental(r25);
        Regive reg25 = new Regive(25, new Date("02/16/2016"));
        reg25.setIdCustomer(c04);
        reg25.setIdPiece(p46);
        //MOVIE 17
        Reservation res02 = new Reservation(2, new Date("12/16/2017"));
        res02.setIdCustomer(c04);
        res02.setIdMovie(m17);
        Rental r03 = new Rental(3, new Date("11/06/2017"));
        r03.setIdCustomer(c04);
        r03.setIdPiece(p73);
        Regive reg04 = new Regive(4, new Date("11/08/2017"));
        reg04.setIdCustomer(c04);
        reg04.setIdPiece(p73);
        customerService.save(Arrays.asList(c04));
        rentalService.save(Arrays.asList(r03, r24, r25));
        extensionService.save(Arrays.asList(ex14, ex15));
        regiveService.save(Arrays.asList(reg04, reg24, reg25));
        reservationService.save(Arrays.asList(res02, res14, res15));
        phoneNumbersService.save(Arrays.asList(tel04));

        Customer c05 = new Customer(5, "Robert", "Moore", "moore123", "qwerty123", new Date("01/05/2016"));
        PhoneNumbers tel05 = new PhoneNumbers(5, "553-654-234");
        tel05.setIdCustomer(c05);
        Rental r04 = new Rental(3, new Date("11/07/2017"));
        r04.setIdCustomer(c05);
        r04.setIdPiece(p74);
        Regive reg05 = new Regive(5, new Date("11/09/2017"));
        reg05.setIdCustomer(c05);
        reg05.setIdPiece(p74);
        customerService.save(Arrays.asList(c05));
        rentalService.save(Arrays.asList(r04));
        regiveService.save(Arrays.asList(reg05));
        phoneNumbersService.save(Arrays.asList(tel05));

        Customer c06 = new Customer(6, "Michael", "Jones", "jones123", "qwerty123", new Date("12/07/2016"));
        PhoneNumbers tel06 = new PhoneNumbers(6, "757-445-322");
        tel06.setIdCustomer(c06);
        Rental r05 = new Rental(5, new Date("12/15/2017"));
        r05.setIdCustomer(c06);
        r05.setIdPiece(p75);
        Extension ex01 = new Extension(1, 2, new Date("12/16/2017"));
        ex01.setIdRental(r05);
        Regive reg06 = new Regive(6, new Date("12/18/2017"));
        reg06.setIdCustomer(c06);
        reg06.setIdPiece(p75);
        customerService.save(Arrays.asList(c06));
        rentalService.save(Arrays.asList(r05));
        regiveService.save(Arrays.asList(reg06));
        extensionService.save(Arrays.asList(ex01));
        phoneNumbersService.save(Arrays.asList(tel06));

        Customer c07 = new Customer(7, "David", "Taylor", "taylor123", "qwerty123", new Date("01/07/2016"));
        PhoneNumbers tel07 = new PhoneNumbers(7, "777-433-846");
        tel07.setIdCustomer(c07);
        Reservation res03 = new Reservation(3, new Date("12/09/2017"));
        res03.setIdCustomer(c07);
        res03.setIdMovie(m16);
        Rental r11 = new Rental(11, new Date("11/02/2017"));
        r11.setIdCustomer(c07);
        r11.setIdPiece(p81);
        Regive reg07 = new Regive(7, new Date("11/03/2017"));
        reg07.setIdCustomer(c07);
        reg07.setIdPiece(p81);
        customerService.save(Arrays.asList(c07));
        reservationService.save(Arrays.asList(res03));
        rentalService.save(Arrays.asList(r11));
        regiveService.save(Arrays.asList(reg07));
        phoneNumbersService.save(Arrays.asList(tel07));

        Customer c08 = new Customer(8, "Thomas", "Jackson", "jackson123", "qwerty123", new Date("10/04/2016"));
        PhoneNumbers tel08 = new PhoneNumbers(8, "888-567-120");
        tel08.setIdCustomer(c08);
        Rental r07 = new Rental(7, new Date("11/01/2017"));
        r07.setIdCustomer(c08);
        r07.setIdPiece(p77);
        Regive reg08 = new Regive(8, new Date("11/03/2017"));
        reg08.setIdCustomer(c08);
        reg08.setIdPiece(p77);
        customerService.save(Arrays.asList(c08));
        rentalService.save(Arrays.asList(r07));
        regiveService.save(Arrays.asList(reg08));
        phoneNumbersService.save(Arrays.asList(tel08));

        Customer c09 = new Customer(9, "Christopher", "King", "king123", "qwerty123", new Date("06/10/2015"));
        PhoneNumbers tel09 = new PhoneNumbers(9, "999-455-678");
        tel09.setIdCustomer(c09);
        Rental r08 = new Rental(8, new Date("10/20/2017"));
        r08.setIdCustomer(c09);
        r08.setIdPiece(p78);
        Regive reg09 = new Regive(9, new Date("11/23/2017"));
        reg09.setIdCustomer(c09);
        reg09.setIdPiece(p78);
        customerService.save(Arrays.asList(c09));
        rentalService.save(Arrays.asList(r08));
        regiveService.save(Arrays.asList(reg09));
        phoneNumbersService.save(Arrays.asList(tel09));

        Customer c10 = new Customer(10, "Mary", "Green", "green123", "qwerty123", new Date("01/10/2017"));
        PhoneNumbers tel10 = new PhoneNumbers(10, "568-000-678");
        tel10.setIdCustomer(c10);
        Reservation res05 = new Reservation(5, new Date("10/27/2017"));
        res05.setIdCustomer(c10);
        res05.setIdMovie(m16);
        Rental r09 = new Rental(9, new Date("10/30/2017"));
        r09.setIdCustomer(c10);
        r09.setIdPiece(p79);
        Regive reg10 = new Regive(10, new Date("11/03/2017"));
        reg10.setIdCustomer(c10);
        reg10.setIdPiece(p79);
        customerService.save(Arrays.asList(c10));
        reservationService.save(Arrays.asList(res05));
        rentalService.save(Arrays.asList(r09));
        regiveService.save(Arrays.asList(reg10));
        phoneNumbersService.save(Arrays.asList(tel10));

        Customer c11 = new Customer(11, "Jennifer", "Baker", "baker123", "qwerty123", new Date("02/01/2017"));
        PhoneNumbers tel11 = new PhoneNumbers(11, "564-678-346");
        tel11.setIdCustomer(c11);
        Reservation res04 = new Reservation(4, new Date("10/20/2017"));
        res04.setIdCustomer(c11);
        res04.setIdMovie(m16);
        Rental r10 = new Rental(10, new Date("10/26/2017"));
        r10.setIdCustomer(c11);
        r10.setIdPiece(p80);
        Regive reg11 = new Regive(11, new Date("10/28/2017"));
        reg11.setIdCustomer(c11);
        reg11.setIdPiece(p80);
        customerService.save(Arrays.asList(c11));
        reservationService.save(Arrays.asList(res04));
        rentalService.save(Arrays.asList(r10));
        regiveService.save(Arrays.asList(reg11));
        phoneNumbersService.save(Arrays.asList(tel11));

        Customer c12 = new Customer(12, "Elizabeth", "Nelson", "nelson123", "qwerty123", new Date("02/02/2017"));
        PhoneNumbers tel12 = new PhoneNumbers(12, "523-564-342");
        tel12.setIdCustomer(c12);
        Rental r12 = new Rental(12, new Date("11/02/2017"));
        r12.setIdCustomer(c12);
        r12.setIdPiece(p82);
        Extension ex05 = new Extension(5, 2, new Date("11/03/2017"));
        ex05.setIdRental(r12);
        Regive reg12 = new Regive(12, new Date("11/05/2017"));
        reg12.setIdCustomer(c12);
        reg12.setIdPiece(p82);
        customerService.save(Arrays.asList(c12));
        rentalService.save(Arrays.asList(r12));
        extensionService.save(Arrays.asList(ex05));
        regiveService.save(Arrays.asList(reg12));
        phoneNumbersService.save(Arrays.asList(tel12));

        Customer c13 = new Customer(13, "Jessica", "Perez", "perez123", "qwerty123", new Date("09/03/2017"));
        PhoneNumbers tel13 = new PhoneNumbers(13, "341-966-457");
        PhoneNumbers tel16 = new PhoneNumbers(16, "345-237-986");
        PhoneNumbers tel17 = new PhoneNumbers(17, "125-467-387");
        tel13.setIdCustomer(c13);
        tel16.setIdCustomer(c13);
        tel17.setIdCustomer(c13);
        Rental r13 = new Rental(13, new Date("11/07/2017"));
        r13.setIdCustomer(c13);
        r13.setIdPiece(p83);
        Extension ex04 = new Extension(4, 1, new Date("11/08/2017"));
        ex04.setIdRental(r13);
        Regive reg13 = new Regive(13, new Date("11/09/2017"));
        reg13.setIdCustomer(c13);
        reg13.setIdPiece(p83);
        customerService.save(Arrays.asList(c13));
        rentalService.save(Arrays.asList(r13));
        extensionService.save(Arrays.asList(ex04));
        regiveService.save(Arrays.asList(reg13));
        phoneNumbersService.save(Arrays.asList(tel13, tel16, tel17));

        Customer c14 = new Customer(14, "Sarah", "Turner", "turner123", "qwerty123", new Date("07/08/2017"));
        PhoneNumbers tel14 = new PhoneNumbers(14, "411-525-666");
        PhoneNumbers tel18 = new PhoneNumbers(18, "345-975-157");
        PhoneNumbers tel19 = new PhoneNumbers(19, "632-287-578");
        tel14.setIdCustomer(c14);
        tel18.setIdCustomer(c14);
        tel19.setIdCustomer(c14);
        Rental r14 = new Rental(14, new Date("11/10/2017"));
        r14.setIdCustomer(c14);
        r14.setIdPiece(p84);
        Extension ex03 = new Extension(3, 1, new Date("11/11/2017"));
        ex03.setIdRental(r14);
        Regive reg14 = new Regive(14, new Date("11/12/2017"));
        reg14.setIdCustomer(c14);
        reg14.setIdPiece(p84);
        customerService.save(Arrays.asList(c14));
        rentalService.save(Arrays.asList(r14));
        extensionService.save(Arrays.asList(ex03));
        regiveService.save(Arrays.asList(reg14));
        phoneNumbersService.save(Arrays.asList(tel14, tel18, tel19));

        Customer c15 = new Customer(15, "Nancy", "Campbell", "campbell123", "qwerty123", new Date("09/10/2015"));
        PhoneNumbers tel15 = new PhoneNumbers(15, "542-086-421");
        PhoneNumbers tel20 = new PhoneNumbers(20, "457-678-123");
        tel15.setIdCustomer(c15);
        tel20.setIdCustomer(c15);
        Rental r15 = new Rental(15, new Date("11/15/2017"));
        r15.setIdCustomer(c15);
        r15.setIdPiece(p85);
        Extension ex02 = new Extension(2, 1, new Date("11/16/2017"));
        ex02.setIdRental(r15);
        Regive reg15 = new Regive(15, new Date("11/17/2017"));
        reg15.setIdCustomer(c15);
        reg15.setIdPiece(p85);
        customerService.save(Arrays.asList(c15));
        rentalService.save(Arrays.asList(r15));
        extensionService.save(Arrays.asList(ex02));
        regiveService.save(Arrays.asList(reg15));
        phoneNumbersService.save(Arrays.asList(tel15, tel20));

        /**
         * Employees
         */
        Employee e01 = new Employee(1, "admin", "admin", "admin", "12345", "administrator");
        Employee e02 = new Employee(2, "David", "Smith", "smith1234", "12345", "salesman");
        Employee e03 = new Employee(3, "Robert", "Campbell", "campbell1234", "12345", "salesman");
        Employee e04 = new Employee(4, "Nancy", "Brown", "brown1234", "12345", "salesman");
        Employee e05 = new Employee(5, "Elizabeth", "Miller", "miller1234", "12345", "salesman");
        Employee e06 = new Employee(6, "Jessica", "Green", "green1234", "12345", "salesman");
        Employee e07 = new Employee(7, "Mary", "Moore", "moore1234", "12345", "salesman");
        Employee e08 = new Employee(8, "David", "Turner", "turner1234", "12345", "salesman");
        Employee e09 = new Employee(9, "William", "King", "king1234", "12345", "salesman");
        Employee e10 = new Employee(10, "Elizabeth", "Gunn", "gunn1234", "12345", "salesman");
        Employee e11 = new Employee(11, "Sarah", "Tarantino", "tarantino1234", "12345", "salesman");
        Employee e12 = new Employee(12, "Thomas", "Kubrick", "kubrick1234", "12345", "salesman");
        Employee e13 = new Employee(13, "David", "Demme", "demme1234", "12345", "salesman");
        Employee e14 = new Employee(14, "Robert", "Darabont", "darabont1234", "12345", "salesman");
        Employee e15 = new Employee(15, "William", "Cameron", "cameron1234", "12345", "salesman");

        employeeService.save(Arrays.asList(e01, e02, e03, e04, e05, e06, e07, e08, e09, e10, e11, e12, e13, e14, e15));
        
    }

}
