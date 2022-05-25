# CS5700 Assn 2 - Shipment Tracker
Implementation - Your system should meet the following requirements (40 pts)

[ ] 1.  As a user I should be able to type in one or more tracking numbers (ids) and get real time updates as the data around each shipment changes. 
> This doesn't mean that a you need allow users to type multiple numbers in the same field, rather they can type in a number and push a "track" button then type in another number and push "track" again and the user should see both shipment information on the screen being updated in real time.

> You are not required to do anything to the UI when a new shipment is created only when an existing shipment is updated, though if you implement that it might make debugging easier.

2. As a user I should be able to stop tracking a shipment at any time.

3. As a user, when I start tracking a shipment I should immediately the following the information about the shipment
* The status
* The location
* The date and time that delivery is expected
* The notes added to the shipment
* The updates
> Should be text read like "Shipment went from {previousStatus} to {newStatus} on {dateOfUpdate}"

> You can define what the status are but will need at least the following statuses: created, shipped, lost, canceled, delivered

4. As a user, if I try to track a shipment that doesn't exist then the UI should notify me in some way (just some text explaining the issue is fine)

5. Your system should read the shipment information from one of the files I have provided below.
> Each line in the file represents an update to shipment and have the following form:

> updateType,shipmentId,timestampOfUpdate, ... other relevant information
There are 8 types of updates, here is an explanation of each of them.
* "created" - a new shipment has been created
Example: "created,1243234,1999283774"
* "shipped" - the shipment has actually shipped
Example: "shipped,1243234,1999437478,19999488398"
The final value is the timestamp of the expected delivery date.
* "location" - the shipment has arrived at a new location
Example: "location,1243234,1983893498,Los Angeles CA
* "delivered" - "the shipment has been delivered to the consumer
Example: "delivered,1243234,1999345988"
* "delayed" - the shipment has been delayed
Example: "delayed,1243234,1999948389,19999387834"
The final value is the new expected delivery date timestamp.
* "lost" - the shipment has been lost
Example "lost,1243234,1999934873"
* "canceled" - the shipment was canceled by the consumer
Example: "canceled,1243234,199993487"
* "noteadded" - a note was added by the shipper to the shipment
Example: "noteadded,1243234,199999495,packaging was damaged slightly during shipping"

> As part of your simulation you should only process one update at most once a second. Kotlin coroutines make this easy, if you are in Java you can use the Timer class to help with this. https://kotlinlang.org/docs/coroutines-guide.html (Links to an external site.)   and https://docs.oracle.com/javase/8/docs/api/javax/swing/Timer.html (Links to an external site.)

6. You should look for opportunities as a developer to use the strategy pattern (I hope it should be pretty obvious where you could use it)

7. You should look for opportunities as a developer to use the observer pattern (again, hopefully pretty obvious...)
