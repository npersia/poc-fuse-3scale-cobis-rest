package com.semperti.hipotecario.poc.fuse.api;

import java.util.List;
import java.util.ArrayList;

import com.semperti.hipotecario.poc.fuse.model.Persona;
import com.semperti.hipotecario.poc.fuse.model.Personas;
import com.semperti.hipotecario.poc.fuse.model.Telefono;
import com.semperti.hipotecario.poc.fuse.model.Telefonos;
import com.semperti.hipotecario.poc.fuse.model.PrestamoPatrimonial;
import com.semperti.hipotecario.poc.fuse.model.PrestamosPatrimoniales;
import com.semperti.hipotecario.poc.fuse.model.TarjetaCreditoPatrimonial;
import com.semperti.hipotecario.poc.fuse.model.TarjetasCreditoPatrimoniales;

public class WsdlToModelConverter {
	public static Persona transformPersona(com.semperti.hipotecario.poc.fuse.cobis.Persona input){
		Persona p = new Persona();
		p.setApellidos(input.getApellidos());
		p.setEsPersonaFisica(input.isEsPersonaFisica());
		p.setEsPersonaJuridica(input.isEsPersonaJuridica());
		p.setId(input.getId());
		p.setIdNumeroDocumento(input.getIdNumeroDocumento());
		p.setIdSexo(input.getIdSexo());
		p.setNombres(input.getNombres());
		p.setNumeroDocumento(input.getNumeroDocumento());
		p.setPrestamosPatrimoniales(transformPrestamosPatrimoniales(input.getPrestamosPatrimoniales()));
		p.setTarjetasCreditoPatrimoniales(transformTarjetasCreditoPatrimoniales(input.getTarjetasCreditoPatrimoniales()));
		return p;
	}

	public static Personas transformPersonas(com.semperti.hipotecario.poc.fuse.cobis.Personas input){
		Personas p = new Personas();
		List<Persona> arrayAux = new ArrayList<Persona>();
		for (com.semperti.hipotecario.poc.fuse.cobis.Persona aux : input.getPersonas() ){
			arrayAux.add(transformPersona(aux));
		}
		p.setPersonas(arrayAux);
		return p;
	}

	public static PrestamosPatrimoniales transformPrestamosPatrimoniales(com.semperti.hipotecario.poc.fuse.cobis.PrestamosPatrimoniales input){
		PrestamosPatrimoniales result = new PrestamosPatrimoniales();
		result.setPrestamosPatrimoniales(transformPrestamosPatrimoniales(input.getPrestamosPatrimoniales()));
		return result;
	}

	public static List<PrestamoPatrimonial> transformPrestamosPatrimoniales(List<com.semperti.hipotecario.poc.fuse.cobis.PrestamoPatrimonial> input){
		List<PrestamoPatrimonial> result = new ArrayList<PrestamoPatrimonial>();
		for (com.semperti.hipotecario.poc.fuse.cobis.PrestamoPatrimonial  aux : input){
			result.add(transformPrestamoPatrimonial(aux));
		}
		return result;
	}

	public static PrestamoPatrimonial transformPrestamoPatrimonial(com.semperti.hipotecario.poc.fuse.cobis.PrestamoPatrimonial input){
		PrestamoPatrimonial pp = new PrestamoPatrimonial();
		pp.setDeuda(input.getDeuda());
		pp.setEsACancelar(input.isEsACancelar());
		pp.setId(input.getId());
		pp.setIdEntidad(input.getIdEntidad());
		pp.setIdPersona(input.getIdPersona());
		pp.setIdTipoPrestamo(input.getIdTipoPrestamo());
		pp.setPlazoRestante(input.getPlazoRestante());
		pp.setValorCuota(input.getValorCuota());
		return pp;
	}

	public static TarjetasCreditoPatrimoniales transformTarjetasCreditoPatrimoniales(com.semperti.hipotecario.poc.fuse.cobis.TarjetasCreditoPatrimoniales input){
		TarjetasCreditoPatrimoniales result = new TarjetasCreditoPatrimoniales();
		result.setTarjetasCreditoPatrimoniales(transformTarjetasCreditoPatrimoniales(input.getTarjetasCreditoPatrimoniales()));
		return result;
	}

	public static List<TarjetaCreditoPatrimonial> transformTarjetasCreditoPatrimoniales(List<com.semperti.hipotecario.poc.fuse.cobis.TarjetaCreditoPatrimonial> input){
		List<TarjetaCreditoPatrimonial> result = new ArrayList<TarjetaCreditoPatrimonial>();
		for (com.semperti.hipotecario.poc.fuse.cobis.TarjetaCreditoPatrimonial  aux : input){
			result.add(transformTarjetaCreditoPatrimonial(aux));
		}
		return result;
	}

	public static TarjetaCreditoPatrimonial transformTarjetaCreditoPatrimonial(com.semperti.hipotecario.poc.fuse.cobis.TarjetaCreditoPatrimonial input){
		TarjetaCreditoPatrimonial tarjeta = new TarjetaCreditoPatrimonial();
		tarjeta.setDeuda(input.getDeuda());
		tarjeta.setId(input.getId());
		tarjeta.setIdEntidad(input.getIdEntidad());
		tarjeta.setIdMarcaTCPatrimonial(input.getIdMarcaTCPatrimonial());
		tarjeta.setIdPersona(input.getIdPersona());
		tarjeta.setLimiteCompra(input.getLimiteCompra());
		tarjeta.setPagoPromedio(input.getPagoPromedio());
		return tarjeta;
	}

	public static Telefono transformTelefono(com.semperti.hipotecario.poc.fuse.cobis.Telefono input){
		Telefono t = new Telefono();
		t.setCaracteristica(input.getCaracteristica());
		t.setCodigoArea(input.getCodigoArea());
		t.setCodigoPais(input.getCodigoPais());
		t.setId(input.getId());
		t.setIdPersona(input.getIdPersona());
		t.setIdTipoTelefono(input.getIdTipoTelefono());
		t.setInterno(input.getInterno());
		t.setNumero(input.getNumero());
		t.setNumeroNormalizado(input.getNumeroNormalizado());
		t.setPrefijo(input.getPrefijo());
		return t;
	}

	public static Telefonos transformTelefonos(com.semperti.hipotecario.poc.fuse.cobis.Telefonos input){
		Telefonos result = new Telefonos();
		List<Telefono> arrayAux = new ArrayList<Telefono>();
		for (com.semperti.hipotecario.poc.fuse.cobis.Telefono aux : input.getTelefonos()){
			arrayAux.add(transformTelefono(aux));
		}
		result.setTelefonos(arrayAux);
		return result;
	}
}
