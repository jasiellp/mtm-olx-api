package com.mtm.olx.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtm.olx.model.Eletronico;
import com.mtm.olx.model.Tipo;

@RestController
public class EletronicoResource
{

	private Map<Integer, Eletronico> eletronicos;

	public EletronicoResource()
	{
		this.eletronicos = new HashMap<Integer, Eletronico>();

		List<Tipo> tipo = new ArrayList<Tipo>();
		
		tipo.add(new Tipo("cc____", "sss"));
		
		this.eletronicos.put(1, new Eletronico("LG-G2", "", 110.55,tipo));
		this.eletronicos.put(2, new Eletronico("Iphone 5", "", 210.55,tipo));
		this.eletronicos.put(3, new Eletronico("Hifone 2", "", 320.55,tipo));
		this.eletronicos.put(4, new Eletronico("Moto G3", "", 430.55,tipo));
		this.eletronicos.put(5, new Eletronico("Jasiel lindo", "", 540.55,tipo));
		this.eletronicos.put(6, new Eletronico("P.D.B", "", 650.55,tipo));

	}

	@RequestMapping(value = "/eletronicos", method = RequestMethod.GET)
	public ResponseEntity<List<Eletronico>> listar()
	{
		return new ResponseEntity<List<Eletronico>>(new ArrayList<Eletronico>(this.eletronicos.values()), HttpStatus.OK);

	}

	@RequestMapping(value = "/eletronicos/{id}", method = RequestMethod.GET)
	public ResponseEntity<Eletronico> buscar(@PathVariable("id") Integer id)
	{
		Eletronico eletronic = eletronicos.get(id);

		if (eletronic == null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<Eletronico>(eletronic, HttpStatus.OK);	
		}
	}
}
