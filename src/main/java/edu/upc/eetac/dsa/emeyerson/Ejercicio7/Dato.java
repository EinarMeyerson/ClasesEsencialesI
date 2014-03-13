/*
 * Copyright [13/03/2014] [Einar Meyerson Uriarte]
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.upc.eetac.dsa.emeyerson.Ejercicio7;

import java.io.Serializable;

public class Dato implements Serializable {

	public int a;
	public String b;
	public char c;

	public int getInt() {
		return a;
	}

	public void setInt(int a) {
		this.a = a;
	}

	public String getString() {
		return b;
	}

	public void setString(String b) {
		this.b = b;
	}

	public char getChar() {
		return c;
	}

	public void setChar(char c) {
		this.c = c;
	}

	public Dato(int a, String b, char c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String toString() {
		return (getInt() + " " + getString() + " " + getChar());
	}
}