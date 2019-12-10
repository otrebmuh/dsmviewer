/*
MIT License

Copyright (c) 2018-2019 Humberto Cervantes

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package mx.uam.dsmviewer.data.nameprocessing;

import java.util.ArrayList;

import mx.uam.dsmviewer.model.MatrixElement;

/**
 * Processor tha performs character replacements
 * 
 * @author humbertocervantes
 *
 */
public class CharacterSubstituteNameProcessor extends NameProcessor {
	
	char oldChar;
	char newChar;
	
	public CharacterSubstituteNameProcessor(char oldChar, char newChar) {
		this.oldChar = oldChar;
		this.newChar = newChar;
	}
	
	
	/**
	 * Removes the prefixes
	 * 
	 */
	protected ArrayList<MatrixElement> performProcessing(ArrayList<MatrixElement> elements) {
				
		for(MatrixElement element:elements) {
			String currentName = element.getName();
			String newName = currentName.replace(oldChar, newChar);
			element.setName(newName);
			
		}		
		return elements;
		
	}
}
