package pac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.HashSet;
import java.util.Set;


public class Main {


    public Configuration cfg;
    public SessionFactory sessionFactory;
    public Session session;


    public static void main(String[] args) throws Exception {

        System.out.println("INICIO DEL PROGRAMA...");

        Configuration cfg =new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        Transaction transaccion = session.beginTransaction();
        System.out.println("CONFIGURACIÓN REALIZADA");

        Profesor profesor=new Profesor();
        profesor.datosprofesores("Alvaro", "Hombre");
        session.save(profesor);
        transaccion.commit();
        System.out.println(profesor.toString());


        transaccion = session.beginTransaction();
        Modulo modulo= new Modulo();
        modulo.datosmodulos("Programacion B", "M03B");
        session.save(modulo);
        transaccion.commit();
        System.out.println(modulo.toString());


        transaccion = session.beginTransaction();
        Modulo modulodos= new Modulo();
        modulodos.datosmodulos("Acceso a datos", "M06");
        session.save(modulodos);
        transaccion.commit();
        System.out.println(modulodos.toString());


        transaccion = session.beginTransaction();
        Modulo modulotres= new Modulo();
        modulotres.datosmodulos("Desarrollo de aplicaciones moviles", "M08");
        session.save(modulotres);
        transaccion.commit();
        System.out.println(modulotres.toString());


        transaccion = session.beginTransaction();
        Modulo modulocuatro= new Modulo();
        modulocuatro.datosmodulos("Servicios y procesos", "M09");
        session.save(modulocuatro);
        transaccion.commit();
        System.out.println(modulocuatro.toString());

        Set<Modulo> ModulosAll = new HashSet<Modulo>();
        ModulosAll.add(modulo);
        ModulosAll.add(modulodos);
        ModulosAll.add(modulotres);
        ModulosAll.add(modulocuatro);


        transaccion = session.beginTransaction();
        Alumno alumno= new Alumno();
        alumno.datosAlumnos("Juan", "Espaniola", 26, "Hombre", ModulosAll);
        session.save(alumno);
        transaccion.commit();
        System.out.println(alumno.toString());

        Set<Modulo> ModulosUnDoCu = new HashSet<Modulo>();
        ModulosUnDoCu.add(modulo);
        ModulosUnDoCu.add(modulodos);
        ModulosUnDoCu.add(modulocuatro);

        transaccion = session.beginTransaction();
        Alumno alumnodos= new Alumno();
        alumnodos.datosAlumnos("Pedro", "Andorrana", 21, "Hombre", ModulosUnDoCu);
        session.save(alumnodos);
        transaccion.commit();
        System.out.println(alumnodos.toString());

        Set<Modulo> ModulosTreCua = new HashSet<Modulo>();
        ModulosTreCua.add(modulotres);
        ModulosTreCua.add(modulocuatro);

        transaccion = session.beginTransaction();
        Alumno alumnotres= new Alumno();
        alumnotres.datosAlumnos("Marta", "Espaniola", 19, "Mujer", ModulosTreCua);
        session.save(alumnotres);
        transaccion.commit();
        System.out.println(alumnotres.toString());

        Set<Modulo> ModulosDoTrCu = new HashSet<Modulo>();
        ModulosDoTrCu.add(modulodos);
        ModulosDoTrCu.add(modulotres);
        ModulosDoTrCu.add(modulocuatro);


        transaccion = session.beginTransaction();
        Alumno alumnocuatro= new Alumno();
        alumnocuatro.datosAlumnos("Carla", "Francesa", 35, "Mujer", ModulosDoTrCu);

        session.save(alumnocuatro);
        transaccion.commit();
        System.out.println(alumnocuatro.toString());


        session.close();
        sessionFactory.close();

    }

}







