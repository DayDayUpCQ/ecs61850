package com.libiec61850.scl.types;

/*
 *  Copyright 2013 Michael Zillgith
 *
 *	This file is part of libIEC61850.
 *
 *	libIEC61850 is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	libIEC61850 is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU General Public License
 *	along with libIEC61850.  If not, see <http://www.gnu.org/licenses/>.
 *
 *	See COPYING file for the complete license text.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TypeDeclarations {
	
	private Map<String,SclType> typeDeclarations;
	
	public TypeDeclarations() {
		this.typeDeclarations = new HashMap<String,SclType>();
		
		List<EnumerationType> defaultEnumTypes = EnumerationType.getDefaultEnumTypes();
		
		for (EnumerationType enumType : defaultEnumTypes) {
			this.typeDeclarations.put(enumType.getId(), enumType);
		}
	}
	
	public void addType(SclType sclType) {
		this.typeDeclarations.put(sclType.getId(), sclType);
	}
	
	public SclType lookupType(String typeId) {
		return this.typeDeclarations.get(typeId);
	}
}
