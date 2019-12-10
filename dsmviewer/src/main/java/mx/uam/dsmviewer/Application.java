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
package mx.uam.dsmviewer;


import mx.uam.dsmviewer.business.dsmservice.DesignStructureMatrixService;
import mx.uam.dsmviewer.data.dsmloader.DesignStructureMatrixLoader;
import mx.uam.dsmviewer.presentation.mainview.MainWindow;
import mx.uam.dsmviewer.presentation.mainview.MainWindowController;

/**
 * The application launcher
 * 
 * @author humbertocervantes
 *
 */
public class Application {
	public static void main(String args[]) {
		Application app = new Application();
		app.createAndConnectComponents();
	}
	
	/**
	 * We are using IoC so this method instantiates the modules
	 * and connects the resulting components. It also initiates
	 * the application.
	 * 
	 */
	public void createAndConnectComponents() {
		

		DesignStructureMatrixLoader dataLoader = new DesignStructureMatrixLoader();
		DesignStructureMatrixService dsmService = new DesignStructureMatrixService(dataLoader);

		MainWindow view = new MainWindow();
		MainWindowController mainController = new MainWindowController(view, dsmService);
		view.setController(mainController);
		
		mainController.start();
		
	}
}
