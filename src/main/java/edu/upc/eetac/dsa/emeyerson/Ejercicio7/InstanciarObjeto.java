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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.upc.eetac.dsa.emeyerson.Ejercicio7.Dato;

public class InstanciarObjeto {
	public static void main(String[] arg) {

		Dato dato1 = new Dato(1, "dato1", 'c');
		Dato dato2 = new Dato(2, "dato2", 'c');
		Dato dato3 = new Dato(3, "dato3", 'c');

		try {
			FileOutputStream ficheroSalida = new FileOutputStream(
					System.getProperty("user.dir") + "/Resources/registro.txt");

			ObjectOutputStream objetoSalida = new ObjectOutputStream(
					ficheroSalida);

			objetoSalida.writeObject(dato1);
			objetoSalida.writeObject(dato2);
			objetoSalida.writeObject(dato3);

			objetoSalida.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			FileInputStream ficheroEntrada = new FileInputStream(
					System.getProperty("user.dir") + "/Resources/registro.txt");
			ObjectInputStream objetoEntrada = new ObjectInputStream(
					ficheroEntrada);

			dato1 = (Dato) objetoEntrada.readObject();
			dato2 = (Dato) objetoEntrada.readObject();
			dato3 = (Dato) objetoEntrada.readObject();

			objetoEntrada.close();

		}

		catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(dato1);
		System.out.println(dato2);
		System.out.println(dato3);

	}
}