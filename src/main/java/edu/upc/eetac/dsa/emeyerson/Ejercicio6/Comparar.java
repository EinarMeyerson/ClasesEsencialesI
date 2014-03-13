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
package edu.upc.eetac.dsa.emeyerson.Ejercicio6;

import java.io.*;

public class Comparar {

	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea;
		double mayor = 0;
		String nombre = null;
		
		String fichero = System.getProperty("user.dir")
				+ "/Resources/registro.txt";

		try {
			archivo = new File(fichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
		}

		catch (FileNotFoundException e) {

			System.out.println("Archivo no encontrado");
		}

		try {

			while ((linea = br.readLine()) != null) {
				String[] resultado = linea.split(" ");

				if (mayor < Double.parseDouble(resultado[3])) {
					mayor = Double.parseDouble(resultado[3]);
					nombre = resultado[2];
				}

				linea = br.readLine();
			}
			System.out.println("El archivo de mayor tama�o es: " + nombre);
		}

		catch (IOException e)

		{
			throw new RuntimeException(e);
		}

	}
}
