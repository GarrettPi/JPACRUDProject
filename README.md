# JPACRUDProject

### Overview

My JPACRUDProject represents a lightly-themed mock up of transporter system aboard a science fiction starship.  Using MySql Workbench, I created a database to hold the transporter records.  Users of my application can perform CRUD operations on the database using an intuitive web application that utilizes JPA for object-relational mapping, and Spring MVC for dynamic webpages.

### How to Use

Upon importing the project into Spring Tool Suite, you can access it by directing your browser to localhost:8082.

From the home page, you have the option to create a new record or view the records already in the database.

#### New Transport

On the create page, you will see an empty form with a number of text boxes that all need to be filled with appropriate information.  Once you are satisfied with the input data, clicking the 'Energize' button will access the database and persist the entry as a new row.

#### View Logs

Upon clicking 'View Logs', the application will access the database and then populate a table with all of the records.  If you wish to edit or delete a record, select the appropriate radio button and and then select the 'Update or Delete' button.  

##### Update

Upon access a specific record, you are presented with pre-filled text boxes containing all the relevant data.  You can alter the data in the text boxes until you are satisfied with the content and then click the blue 'Update Log' button.  The data will be persisted back into the database and the record will be updated.   

##### Delete

While on the update page, you can instead choose to delete the record by clicking the red 'Delete Log' button.  The record being displayed will then be deleted from the database immediately.  This operation is irreversible so be sure you meant to click that button.

### Technologies

*Java
*MySql
*Apache Tomcat
*Spring Boot MVC
*Gradle
*JPA for ORM

### Lessons Learned

Primary lesson learned: Not to overreach when working against a deadline.  I completed the basics of my project fairly easily and quickly.  I then went back to try and experiment and practice some skills and technologies that I thought might bring a bit more excitement into my project.  Unfortunately, this led me to break my code in a very minor, nearly undetectable way.  This small error caused issues with database communication and took me quite some time to track down.  Luckily I had committed a complete project or I might have been in a tight spot.  
