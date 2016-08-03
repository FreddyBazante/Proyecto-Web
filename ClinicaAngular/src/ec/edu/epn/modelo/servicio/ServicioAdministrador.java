package ec.edu.epn.modelo.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ec.edu.epn.modelo.jpa.Administrador;
import ec.edu.epn.modelo.jpa.Especialidad;
import ec.edu.epn.modelo.jpa.Horario;
import ec.edu.epn.modelo.jpa.Odontologo;
import ec.edu.epn.modelo.jpa.Paciente;



@Path("ServicioAdministrador")
public class ServicioAdministrador {
	
	//HORARIO
	//CREAR
	@POST
	@Path("registarHorario")
	@Consumes("application/json;charset=UTF-8")
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarHorario(Horario horario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(horario);
		em.getTransaction().commit();
		return "Horario registrado exitosamente";
	}
	//BUSCAR
	@GET
	@Path("buscarHorario")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Horario> buscarHorario (
	   @QueryParam ("nombreBusqueda")
	   Integer nombreBusqueda) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
	   EntityManager em = emf.createEntityManager();
	   Query q = em.createQuery("select h from Horario as h where h.idHorario like :nombreBusqueda",Horario.class);
	   q.setParameter("nombreBusqueda", nombreBusqueda);
	   return q.getResultList();
	}
	//ACTUALIZAR
	@POST
	@Path("actualizarHorario")
	@Consumes(MediaType.APPLICATION_JSON)
	public String actualizarHorario(Horario h) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
	   EntityManager em = emf.createEntityManager();
	   em.getTransaction().begin();
	   em.merge(h);
	   em.getTransaction().commit();
	   return "Horario actualizado exitosamente";
	}
	//ELIMINAR
	@DELETE
	@Path("eliminarHorario")
	@Produces(MediaType.APPLICATION_JSON)
	public String eliminarHorario(Horario h){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(h));
		em.getTransaction().commit();
		return "Horario eliminado exitosamente";
	}
	
	//ESPECIALIDAD
	//BUSQUEDA
	@GET
	@Path("buscarEspecialidad")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Especialidad> buscarEspecialidad (
	   @QueryParam ("nombreBusqueda")
	   String nombreBusqueda) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
	   EntityManager em = emf.createEntityManager();
	   Query q = em.createQuery("select e from Especialidad as e where e.nombreEspecialidad like :nombreBusqueda",Especialidad.class);
	   q.setParameter("nombreBusqueda", nombreBusqueda+"%");
	   return q.getResultList();
	}
	
	//ADMINISTRADOR
	//BUSQUEDA	
	@GET
	@Path("buscarAdministrador")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Administrador> buscarAdministrador (
	   @QueryParam ("nombreBusqueda")
	   String nombreBusqueda) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
	   EntityManager em = emf.createEntityManager();
	   Query q = em.createQuery("select a from Administrador as a where a.nombre1Usr like :nombreBusqueda",Administrador.class);
	   q.setParameter("nombreBusqueda", nombreBusqueda+"%");
	   return q.getResultList();
	}
	
	//ODONTOLOGO
	//BUSQUEDA
	@GET
	@Path("buscarOdontologo")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Odontologo> buscarOdontologo (
	   @QueryParam ("nombreBusqueda")
	   String nombreBusqueda) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
	   EntityManager em = emf.createEntityManager();
	   Query q = em.createQuery("select a from Odontologo as a where a.nombre1Usr like :nombreBusqueda",Odontologo.class);
	   q.setParameter("nombreBusqueda", nombreBusqueda+"%");
	   return q.getResultList();
	}
	
	//PACIENTE
	//BUSQUEDA
	@GET
	@Path("buscarPaciente")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Paciente> buscarPaciente (
	   @QueryParam ("nombreBusqueda")
	   String nombreBusqueda) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
	   EntityManager em = emf.createEntityManager();
	   Query q = em.createQuery("select a from Paciente as a where a.nombre1Usr like :nombreBusqueda",Paciente.class);
	   q.setParameter("nombreBusqueda", nombreBusqueda+"%");
	   return q.getResultList();
	}
}
