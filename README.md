# OOP-project-java - Stage I

## Topic: Beauty Salon

- This app is meant for the owner to keep track of the most important things his/her beauty salon.

## Entities:

- Employee: this is the entity that has the details of an employee (name, rating, salary, specialization). Most of the employees are hairstylists or manicurists in a real-life salon.
- Hairstylist: it extends Employee (+ if the hairstylist can do braids, coloring and styling).
- Manicurist: it also extends Employee (+ the colors available for the nail polish).
- Client: this is the entity that has the details of a client (name, age, sex, mail).
- LoyalClient: it extends Client (+ the number of years since this person is a client, the discount they get for being a LoyalClient).
- Appointment: this is the entity that keeps together the Client, the Employee, the Service (e.g. massage, haircut) and the date together in order to be easier to manage.
- Service: this is the entity that has price and name for each service the beauty salon has to offer.
- Supplier: this entity keeps track of the suppliers' name, start and finish dates of the contract and the materials they provide to the salon (hair-dye, nail polish etc).

## Repositories:

- I created a GenericRepository and a separate repository for each of this  classes, even though at this stage of the project I don't use them all.

## Services:

- AppointmentService: I created this service in order to be able to manage the appointments, but I haven't implemented it for this stage.
- ClientService: this service helps to add, delete, edit, get clients.
- EmployeeService: this service helps to add, delete, edit, get the list of employees, get their details and also filter them a rating over something.

## View:
- ConsoleApp: the menu allows you to:
  + 0. Exit
  + 1. See all employees
  + 2. See more about an employee
  + 3. Add an employee
  + 4. Delete an employee
  + 5. Filter employees by rating
  + 6. Edit employee
  + 7. See all clients
  + 8. Add a client
  + 9. Edit client
  + 10. Delete client

