package com.example.taxiapp.service;

import java.util.ArrayList;
import java.util.List;

import com.example.taxiapp.model.Suburb;
import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

public class SuburbService {
		
	public List<Suburb> getSuburbs(){
		Suburb suburb1 = new Suburb("Suburb1","Zone1");
		Suburb suburb2 = new Suburb("Suburb2","Zone2");
		List<Suburb> suburbs = new ArrayList<Suburb>();
		suburbs.add(suburb1);
		suburbs.add(suburb2);
		return suburbs;
	}
}
