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
import pl.edu.utp.dvdrental2.model.Movie;
import pl.edu.utp.dvdrental2.model.PhoneNumbers;
import pl.edu.utp.dvdrental2.model.Piece;

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

    private Random random = new Random();

    @PostConstruct
    public void init() {
        phoneNumbersService.deleteAll();
        customerService.deleteAll();
        employeeService.deleteAll();

        Customer c01 = new Customer(1, "William", "Smith", "smith123", "qwerty123", new Date("12/11/2015"));
        PhoneNumbers tel01 = new PhoneNumbers(1, "794-456-322");
        tel01.setIdCustomer(c01);
        customerService.save(Arrays.asList(c01));
        phoneNumbersService.save(Arrays.asList(tel01));

        Customer c02 = new Customer(2, "John", "Williams", "williams123", "qwerty123", new Date("02/01/2015"));
        PhoneNumbers tel02 = new PhoneNumbers(2, "234-456-322");
        tel02.setIdCustomer(c02);
        customerService.save(Arrays.asList(c02));
        phoneNumbersService.save(Arrays.asList(tel02));

        Customer c03 = new Customer(3, "James", "Brown", "brown123", "qwerty123", new Date("06/12/2015"));
        PhoneNumbers tel03 = new PhoneNumbers(3, "553-868-556");
        tel03.setIdCustomer(c03);
        customerService.save(Arrays.asList(c03));
        phoneNumbersService.save(Arrays.asList(tel03));

        Customer c04 = new Customer(4, "Jacob", "Miller", "miller123", "qwerty123", new Date("12/12/2015"));
        PhoneNumbers tel04 = new PhoneNumbers(4, "232-111-444");
        tel04.setIdCustomer(c04);
        customerService.save(Arrays.asList(c04));
        phoneNumbersService.save(Arrays.asList(tel04));

        Customer c05 = new Customer(5, "Robert", "Moore", "moore123", "qwerty123", new Date("01/05/2016"));
        PhoneNumbers tel05 = new PhoneNumbers(5, "553-654-234");
        tel05.setIdCustomer(c05);
        customerService.save(Arrays.asList(c05));
        phoneNumbersService.save(Arrays.asList(tel05));

        Customer c06 = new Customer(6, "Michael", "Jones", "jones123", "qwerty123", new Date("12/07/2016"));
        PhoneNumbers tel06 = new PhoneNumbers(6, "757-445-322");
        tel06.setIdCustomer(c06);
        customerService.save(Arrays.asList(c06));
        phoneNumbersService.save(Arrays.asList(tel06));

        Customer c07 = new Customer(7, "David", "Taylor", "taylor123", "qwerty123", new Date("01/07/2016"));
        PhoneNumbers tel07 = new PhoneNumbers(7, "777-433-846");
        tel07.setIdCustomer(c07);
        customerService.save(Arrays.asList(c07));
        phoneNumbersService.save(Arrays.asList(tel07));

        Customer c08 = new Customer(8, "Thomas", "Jackson", "jackson123", "qwerty123", new Date("10/04/2016"));
        PhoneNumbers tel08 = new PhoneNumbers(8, "888-567-120");
        tel08.setIdCustomer(c08);
        customerService.save(Arrays.asList(c08));
        phoneNumbersService.save(Arrays.asList(tel08));

        Customer c09 = new Customer(9, "Christopher", "King", "king123", "qwerty123", new Date("06/10/2015"));
        PhoneNumbers tel09 = new PhoneNumbers(9, "999-455-678");
        tel09.setIdCustomer(c09);
        customerService.save(Arrays.asList(c09));
        phoneNumbersService.save(Arrays.asList(tel09));

        Customer c10 = new Customer(10, "Mary", "Green", "green123", "qwerty123", new Date("01/10/2017"));
        PhoneNumbers tel10 = new PhoneNumbers(10, "568-000-678");
        tel10.setIdCustomer(c10);
        customerService.save(Arrays.asList(c10));
        phoneNumbersService.save(Arrays.asList(tel10));

        Customer c11 = new Customer(11, "Jennifer", "Baker", "baker123", "qwerty123", new Date("02/01/2017"));
        PhoneNumbers tel11 = new PhoneNumbers(11, "564-678-346");
        tel11.setIdCustomer(c11);
        customerService.save(Arrays.asList(c11));
        phoneNumbersService.save(Arrays.asList(tel11));

        Customer c12 = new Customer(12, "Elizabeth", "Nelson", "nelson123", "qwerty123", new Date("02/02/2017"));
        PhoneNumbers tel12 = new PhoneNumbers(12, "523-564-342");
        tel12.setIdCustomer(c12);
        customerService.save(Arrays.asList(c12));
        phoneNumbersService.save(Arrays.asList(tel12));

        Customer c13 = new Customer(13, "Jessica", "Perez", "perez123", "qwerty123", new Date("09/03/2017"));
        PhoneNumbers tel13 = new PhoneNumbers(13, "341-966-457");
        PhoneNumbers tel16 = new PhoneNumbers(16, "345-237-986");
        PhoneNumbers tel17 = new PhoneNumbers(17, "125-467-387");
        tel13.setIdCustomer(c13);
        tel16.setIdCustomer(c13);
        tel17.setIdCustomer(c13);
        customerService.save(Arrays.asList(c13));
        phoneNumbersService.save(Arrays.asList(tel13, tel16, tel17));

        Customer c14 = new Customer(14, "Sarah", "Turner", "turner123", "qwerty123", new Date("07/08/2017"));
        PhoneNumbers tel14 = new PhoneNumbers(14, "411-525-666");
        PhoneNumbers tel18 = new PhoneNumbers(18, "345-975-157");
        PhoneNumbers tel19 = new PhoneNumbers(19, "632-287-578");
        tel14.setIdCustomer(c14);
        tel18.setIdCustomer(c14);
        tel19.setIdCustomer(c14);
        customerService.save(Arrays.asList(c14));
        phoneNumbersService.save(Arrays.asList(tel14, tel18, tel19));

        Customer c15 = new Customer(15, "Nancy", "Campbell", "campbell123", "qwerty123", new Date("09/10/2015"));
        PhoneNumbers tel15 = new PhoneNumbers(15, "542-086-421");
        PhoneNumbers tel20 = new PhoneNumbers(20, "457-678-123");
        tel15.setIdCustomer(c15);
        tel20.setIdCustomer(c15);
        customerService.save(Arrays.asList(c15));
        phoneNumbersService.save(Arrays.asList(tel15, tel20));

        Employee e01 = new Employee(1, "admin", "admin", "admin", "12345", "administrator");
        Employee e02 = new Employee(2, "David", "Smith", "smith1234", "12345", "salesman");
        Employee e03 = new Employee(3, "Robert", "Campbell", "campbell1234", "12345", "salesman");
        Employee e04 = new Employee(4, "Nancy", "Brown", "brown1234", "12345", "salesman");
        Employee e05 = new Employee(5, "Elizabeth", "Miller", "miller1234", "12345", "salesman");
        Employee e06 = new Employee(6, "Jessica", "Green", "green1234", "12345", "salesman");
        Employee e07 = new Employee(7, "Mary", "Moore", "moore1234", "12345", "salesman");
        Employee e08 = new Employee(8, "William", "Turner", "turner1234", "12345", "salesman");

        employeeService.save(Arrays.asList(e01, e02, e03, e04, e05, e06, e07, e08));

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

//        Movie m16 = new Movie(15, "Nietykalni", "Olivier Nakache", "komedia", "Francja", "2011", 10);
//        Movie m17 = new Movie(15, "Lot nad kukułczym gniazdem", "Milos Forman", "dramat", "Anglia", "1979", 10);
//        Movie m18 = new Movie(15, "Forrest Gump", "Robert Zemeckis", "komedia", "USA", "2000", 10);
//        Movie m19 = new Movie(15, "Powrót do przeszłości", "Robert Zemeckis", "przygodowy", "USA", "1998", 10);
//        Movie m20 = new Movie(15, "Kontakt", "Robert Zemeckis", "sci-fi", "USA", "1997", 10);
    }

}
