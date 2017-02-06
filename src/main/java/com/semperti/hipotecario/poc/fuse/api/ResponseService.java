package com.semperti.hipotecario.poc.fuse.api;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.semperti.hipotecario.poc.fuse.model.Personas;
import com.semperti.hipotecario.poc.fuse.model.Telefono;
import com.semperti.hipotecario.poc.fuse.model.Telefonos;
import com.semperti.hipotecario.poc.fuse.model.CobisRestService;
import com.semperti.hipotecario.poc.fuse.model.PrestamoPatrimonial;
import com.semperti.hipotecario.poc.fuse.model.PrestamosPatrimoniales;
import com.semperti.hipotecario.poc.fuse.model.TarjetaCreditoPatrimonial;
import com.semperti.hipotecario.poc.fuse.model.TarjetasCreditoPatrimoniales;

public class ResponseService {
	private static final Logger logger = LoggerFactory.getLogger(ResponseService.class);

	public Response obtenerPersonas(com.semperti.hipotecario.poc.fuse.cobis.Personas personas) {
		return Response.ok(WsdlToModelConverter.transformPersonas(personas)).build();
	}

	public Response obtenerPersona(com.semperti.hipotecario.poc.fuse.cobis.Persona persona) {
		return Response.ok(WsdlToModelConverter.transformPersona(persona)).build();
	}

	public Response obtenerTelefonosDePersona(com.semperti.hipotecario.poc.fuse.cobis.Telefonos telefonos) {
		return Response.ok(WsdlToModelConverter.transformTelefonos(telefonos)).build();
	}

	public Response obtenerPrestamosPatrimonialesDePersona(com.semperti.hipotecario.poc.fuse.cobis.PrestamosPatrimoniales prestamos) {
		return Response.ok(WsdlToModelConverter.transformPrestamosPatrimoniales(prestamos)).build();
	}

	public Response obtenerTarjetasCreditoPatrimonialesDePersona(com.semperti.hipotecario.poc.fuse.cobis.TarjetasCreditoPatrimoniales tarjetasCredito) {
		return Response.ok(WsdlToModelConverter.transformTarjetasCreditoPatrimoniales(tarjetasCredito)).build();
	}

	public Response obtenerTelefonos(com.semperti.hipotecario.poc.fuse.cobis.Telefonos telefonos) {
		return Response.ok(WsdlToModelConverter.transformTelefonos(telefonos)).build();
	}

	public Response obtenerTelefono(com.semperti.hipotecario.poc.fuse.cobis.Telefono telefono) {
		return Response.ok(WsdlToModelConverter.transformTelefono(telefono)).build();
	}

	public Response obtenerTarjetasCreditoPatrimoniales(com.semperti.hipotecario.poc.fuse.cobis.TarjetasCreditoPatrimoniales tarjetasCredito) {
		return Response.ok(WsdlToModelConverter.transformTarjetasCreditoPatrimoniales(tarjetasCredito)).build();
	}

	public Response obtenerTarjetaCreditoPatrimonial(com.semperti.hipotecario.poc.fuse.cobis.TarjetaCreditoPatrimonial tarjetaCredito) {
		return Response.ok(WsdlToModelConverter.transformTarjetaCreditoPatrimonial(tarjetaCredito)).build();
	}

	public Response obtenerPrestamosPatrimoniales(com.semperti.hipotecario.poc.fuse.cobis.PrestamosPatrimoniales prestamos) {
		return Response.ok(WsdlToModelConverter.transformPrestamosPatrimoniales(prestamos)).build();
	}

	public Response obtenerPrestamoPatrimonial(com.semperti.hipotecario.poc.fuse.cobis.PrestamoPatrimonial prestamo) {
		return Response.ok(WsdlToModelConverter.transformPrestamoPatrimonial(prestamo)).build();
	}
}
