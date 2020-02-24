# CS-102-Course-Project
Android Application for In-Campus Navigation

The application is an all in all solution to make the academic and social life in Bilkent easier and more managable. It allows the user to user real time navigation to find their way through the campus, look for ongoing social events and courses, with the option to pick the ones they would like to interact with. They can add reminders, gain further information about the campus and access varis tools to optimize their experience.

This is a group project of which I was a part of, my personal contributions are as follows:

I implemented the central activity (Navigation Drawer Activity), helper methods such as getting the name, building, time of Courses/Events, also interractions with markers such as drawing directions to them, displaying them on command using the filters, and gaining further information by accessing a customized information window according to the type of the marker. I have designed these customized windows, added the menus/pictures/eligibilities/opening and closing hours of buildings in the campus, placed them on the initial screen and the drawer so that the user can access them. I have also helped integrate the parts of code that Mert and Zeynep have provided and worked together with them to implement the interactions in the application. Further methods to access other views, set the schedule information of courses and display the building of events and courses on the map have also been provided, coupled with algorithms such as determining if a date is past( to delete outdated events ) and determining the classrooms of courses. Other than the bits of code I have on the other member's classes and the work we have done together to integrate them, the files that I have written on my own are: Building/Cafe/Park/Gym WindowFragment, InitialScreenFragment, MainActivity, MyFragment, SwitchFragment, MapTypeSetter and their corresponding layouts. Also I imported the DirectionsParser class externally and tweaked small details in the way it is used. 

Note: This project has not been updated since 2018 June and gradle works differently in todays Android Studio.
