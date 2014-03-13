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
package edu.upc.eetac.dsa.emeyerson.Ejercicio1;

import java.io.*;

public class LeerNumeros {

	public static void main(String[] arg) throws BigNumberException {

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		

		try {
			String fichero = System.getProperty("user.dir")
					+ "/Resources/numeros.txt";
			archivo = new File(fichero);
			fr = new FileReader(archivo);
		}

		catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}

		try {
			br = new BufferedReader(fr);

			String linea;
			int numero;
			linea = br.readLine();
			while (linea != null) {

				try {
					numero = Integer.parseInt(linea);
				}

				catch (NumberFormatException e) {
					throw new RuntimeException(e);
				}

				if (numero > 1000)
					throw new BigNumberException();

				System.out.println(linea);
				linea = br.readLine();
			}
		}

		catch (IOException e)

		{
			throw new RuntimeException(e);
		}

		finally {

			try {

				if (fr != null)
					fr.close();
			}

			catch (Exception e2) {
				throw new RuntimeException(e2);
			}

		}

	}
}
