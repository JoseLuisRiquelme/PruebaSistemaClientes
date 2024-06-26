# 🛸 Test Validation

In this test, we will validate our knowledge covered in the module.
Read the entire document before starting individual development to ensure you maximize your score and properly focus your efforts.

 # 🚀 Description
Recently, significant changes have occurred in our lives due to technology. Small businesses have had to adapt to this new need and start shifting their operations to electronic means. Thus, the bakery “Bon Bon Jovi” has contacted you to create software to manage their customers, preventing them from visiting their rival “Dominic Completto.” For this, we need to consider the following functionalities:

# 📱 Menu
To navigate through the different functions of the application, an initial menu must exist. The menu will allow listing, adding, editing, loading, exporting customer data, and exiting the section.

List Customers
Add Customer
Edit Customer
Load Data
Export Data
Exit
Enter an option:
_ 2

# 👾 Add Customer
It should be possible to add new customers and include them in the list. By default, the "Active" option should be preselected in the Customer category when adding a new one.

plaintext
Copiar código
-------------Create Customer-------------
Enter Customer's RUN:
Enter Customer's First Name:
Enter Customer's Last Name:
Enter years as a Customer:
-----------------------------------------
# 📟 List Customer
All existing customers of the business should be listed with their respective categories. For example, the list for 2 customers is shown.

plaintext
Copiar código
-------------Customer Data-------------
Customer's RUN: 12.123.412-2
Customer's First Name: Nicolas
Customer's Last Name: Cake
Years as a Customer: 7 years
Customer Category: Active
---------------------------------------
-------------Customer Data-------------
Customer's RUN: 25.673.022-2
Customer's First Name: Taylor
Customer's Last Name: Shift S.
Years as a Customer: 1 day
Customer Category: Active
---------------------------------------
_ 3

# 🛸 Edit Customer
A customer can be edited in case there is an error in their data. To do this, the option of what to do should be entered.

plaintext
Copiar código
-------------Edit Customer-------------
Select what you want to do:
1.-Change Customer's Status
2.-Edit Customer's entered data
Enter option:
----------------------------------------
Enter the RUN of the Customer to edit:
In this case, the customer’s status will be changed.

plaintext
Copiar código
Enter the RUN of the Customer to edit:
-----Updating Customer Status-----
The current status is: Active
1.-To change the Customer's status to Inactive
2.-To keep the Customer's status Active
Enter option:
----------------------------------------
In this case, the entered data of a customer will be changed by searching via the RUN.

plaintext
Copiar código
Enter the RUN of the Customer to edit:
----Updating Customer Data-----
1.-The Customer's RUN is: 12.123.412-2
2.-The Customer's First Name is: Nicolas
3.-The Customer's Last Name is: Cake
4.-The years as a Customer are: 7 years
Enter the option to edit the customer's data:
----------------------------------------
Finally, based on the choice of the data to edit, the screen will show the following as an example.

plaintext
Copiar código
Enter the option to edit the customer's data:
1
----------------------------------------
1.-Enter new RUN of the Customer:
24.157.163-K
----------------------------------------
Data changed successfully
# 🌌 Load Data
By selecting the menu, you should load previous customer information from a file called “DBClientes.csv”.

plaintext
Copiar código
---------Load Data on Linux or Mac-----------
Enter the path where the file DBClientes.csv is located:
home/user/Desktop
-----------------------------------------------
Data successfully loaded into the list
---------Load Data on Windows---------------
Enter the path where the file DBClientes.csv is located:
C:\\user\device\Desktop
-----------------------------------------------
Data successfully loaded into the list
The file “DBClientes.csv” contains this format:

plaintext
Copiar código
17.162.856-5,Iron,Manjar,1 year,Active
10.513.821-6,Thor,Tita ,4 years,Active
17.151.677-8,Captain,Marraqueta,9 years,Inactive
_ 5

# 🛰 Export Data
By selecting the menu, customer information and their respective categories should be exported. The file should be “clientes.txt” or “clientes.csv” depending on the chosen format.

plaintext
Copiar código
---------Export Data-----------
Select the format to export:
1.-CSV format
2.-TXT format
Enter an option to export:
----------------------------------
Depending on the format and device, the paths will be as follows:

plaintext
Copiar código
---------Export Data on Linux or Mac-----------
Enter the path where you want to export the file clientes.csv:
home/user/Desktop
-----------------------------------------------
Customer data successfully exported in CSV format.
---------Export Data on Windows---------------
Enter the path where you want to export the file clientes.txt:
C:\\user\device\Desktop
-----------------------------------------------
Customer data successfully exported in TXT format.
_ 6

# 🚀 Requirements
Create a Java Project.
(1 Point)
1.1. Create a new project through Eclipse as a Java project.
New Project → Java Project → Enter project name → Finish
1.2. Create 6 packages where we will work:
● Package main
● Package model
● Package service
● Package test
● Package utilities
● Package view
1.3. Create the enum CategoriaEnum in the model package, which will contain 2 possible values: Active and Inactive.
1.4. Create the Cliente class in the model package with the following requirements:
● String runCliente
● String nombreCliente
● String apellidoCliente
● String aniosCliente (can be changed to int if desired)
● CategoriaEnum nombreCategoria
● Generate a constructor with parameters
● Generate the corresponding getters and setters
● Generate a toString for the parameters

1.5. Create the Main class with a public static void method in the main package, which will use an instance to start the menu.

# 🚀 7

Use Loops and Methods.
(2 Points)
2.1. Create a Menu class in the view package that should contain the following attributes:
● clienteServicio, an instance of ClienteServicio.
● archivoServicio, an instance of ArchivoServicio.
● exportadorCsv, an instance of ExportarCsv.
● exportarTxt, an instance of ExportarTxt.
● Define a String fileName = "Clientes" (for exporting the file)
● Define a String fileName1 = "DBClientes.csv" (for importing the file)
● scanner, an instance of Scanner to receive input via the keyboard.
● iniciarMenu, displays the main menu and receives keyboard input through the scanner. It contains the logic to call other methods based on keyboard input.

2.2. The Menu class should contain the following methods for constructing and selecting the menu:
● listarCliente
● agregarCliente
● editarCliente
● importarDatos
● exportarDatos
● terminarPrograma

2.3. The methods mentioned above should be overridden within the Menu class as follows:
● listarClientes, displays a list of added customers, either by import or manually.
● agregarCliente, prompts for input and fills in a Cliente object.
● editarCliente, allows editing of a customer if needed or changing the customer’s status.
● cargarDatos, loads data from the “DBClientes.csv” file.
● exportarDatos, calls a method to export customers in ".txt" or ".csv" format.
● terminarPrograma, which terminates the system's execution.
Hint: The only method that should not be overridden is iniciarMenu, as it contains its implementation at the beginning of the class to form the menu.

# 🚀 8

Use Arrays and Files.
(2 Points)
3.1. Create the ClienteServicio class in the service package with the following requirements:
● Create an attribute called List<Cliente> listaClientes
● Generate a constructor for ClienteServicio that initializes listaClientes as a new ArrayList.
● Generate a public method without a return value listarClientes and implement the most suitable loop to iterate over each customer.
● Generate a public void method agregarCliente and pass the parameters of the Cliente class. Use this method to save customers in a customer instance.
● Generate a public void method editarCliente and pass the parameters of the Cliente class.
● Create a getter for listaClientes that can return a listaClientes.

Apply Polymorphism and Inheritance according to the Object-Oriented Paradigm (OOP).
(2 Points)
4.1. Create an abstract class named Exportador in the service package that contains an abstract method for export, whose parameters will be String fileName and List<Cliente> listaClientes.
4.2. Create a ExportadorCsv class in the service package that contains an export method, whose parameters will be String fileName and a List<Cliente> listaClientes. Implement the corresponding implementations within the method using PrintWriter and FileWriter for file export.
4.3. Create a ExportadorTxt class in the service package that contains an export method, whose parameters will be String fileName and a List<Cliente> listaClientes. Implement the corresponding implementations within the method using PrintWriter and FileWriter for file export.
Hint: Steps 8, 9, and 10 aim to have an abstract class (Exportador) with a single export method, whose classes ExportadorCsv and ExportadorTxt extend from this class and implement its method. Thus, the declared methods will belong to each Exportador under the concept of inheritance. When using it, one of the exporters is instantiated in the menu class using polymorphism.

# 🚀 9

Apply Object-Oriented Paradigm (OOP) Instances.
(2 Points)
5.1. Create the ArchivoServicio class in the service package that extends the Exportador class. This class contains the following requirements:
● Create a method cargarDatos that receives a String fileName parameter, indicating the name of the file to load. Implement the corresponding implementations within the method using FileReader and BufferedReader (for reading files).
● Create the exportar method inherited from the Exportador class, with the same parameters to be implemented in step 8.
5.2. Create a Utilidad class in the utilities package that contains reusable methods for the menu, such as clearing the screen, showing messages, etc.

Apply Unit Testing.
(1 Point)
6.1. Add dependencies for Unit Testing, see the example in the annex at the end of the document.
6.2. Write unit tests for ClienteServicio.
● agregarClienteTest method to verify the functionality of adding a customer (a customer must be added for the test to run correctly).
● agregarClienteNullTest method to verify the functionality of adding a customer in case there are null cases (a null customer must be added for the test to run correctly).

# 🛰 Good luck!
