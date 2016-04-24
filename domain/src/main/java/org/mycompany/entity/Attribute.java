package org.mycompany.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ALEX on 15.04.2016.
 */
public class Attribute {
	private Long id;
	private AttributeType attributeType;
	private String name;
	private String labelImage;
	private Set<ObjectAttribute> objectAttributes=new HashSet<>();
}
