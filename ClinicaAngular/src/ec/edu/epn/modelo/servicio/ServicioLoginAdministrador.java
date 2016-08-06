package ec.edu.epn.modelo.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.RequestWrapper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ec.edu.epn.modelo.jpa.Administrador;
import ec.edu.epn.modelo.jpa.Horario;
import ec.edu.epn.modelo.jpa.Odontologo;
import ec.edu.epn.modelo.jpa.Paciente;

@Path("ServicioLogin")
public class ServicioLoginAdministrador {
	@GET
	@Path("iniciarSesionAdministrador")
	@Produces(MediaType.APPLICATION_JSON)
	public Administrador iniciarSesion(
			@QueryParam("nomreUsr")
			String nomreUsr,
			@QueryParam("passwordUsr")
			Integer passwordUsr) {
		Administrador administrador = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaAngularJPA");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Administrador as a where a.nomreUsr like :nomreUsr and a.passwordUsr like:passwordUsr", Administrador.class);
		q.setParameter("nomreUsr", nomreUsr+"%");
		q.setParameter("passwordUsr", passwordUsr);
		administrador = (Administrador)q.getSingleResult();
		return administrador;
	}
	
}
