/*
   Copyright 2007-2010 Rustici Software, LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

   Author(s):

   Kevin Glynn (kevin.glynn@scorm.com)
*/

package CS2JNet.System.IO;

public class FileNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5653568996987933925L;
	/**
	 * 
	 */

	private String fileName = null;
	
	/**
	 * @param arg0
	 */
	public FileNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public FileNotFoundException(String message, String fileName) {
		super(message);
		this.fileName = fileName;
	}

	/**
	 * @param arg0
	 */
	public FileNotFoundException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public FileNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}