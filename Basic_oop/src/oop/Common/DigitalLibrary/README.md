# The Scenario: The Metropolitan Library 🏛️
The city library has moved away from paper logs and needs a digital system to track their inventory and calculate fines.

The Business Rules:

Inventory Types: The library stocks Books and DVDs. Every item in the building has a unique ID number and a title.

Item Specifics: * For Books, the library tracks the Author.

For DVDs, the library tracks the total running time (duration).

The Lending Policy:

Items are checked out for a specific period. If they are returned late, a fine is triggered.

Books are cheap to replace, so their fine is $0.50 per day overdue.

DVDs are more expensive/fragile, so their fine is $2.00 per day overdue.

Security Requirements:

Staff members are worried about data integrity. Once an item is entered into the system, its ID number and Title should never be changeable by any part of the program.

However, the system must be able to display this information whenever a librarian looks up an item.

The Challenge
Write a program that simulates a librarian processing a return.

The system should hold a collection of different items (Books and DVDs).

The system should be able to take any item from that collection, input how many days late it is, and output the exact fine and the item's details.