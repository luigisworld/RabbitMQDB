package org.luigisworld.util;

import org.luigisworld.pojo.Museum;
import org.springframework.integration.annotation.Transformer;


public class POJOTransformer {
	
	@Transformer
	public Museum toMuseum(String s){
		Museum museum = new Museum();
		String[] attr = s.split("::");
		
		museum.setName(attr[0]);
		museum.setCountry(attr[1]);
		museum.setDescription(attr[2]);
				
		return museum;
	}
}
