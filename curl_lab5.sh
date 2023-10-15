#!/bin/sh

# Add Address book 
curl -i -X POST -H "Content-Type:application/json" -d '{"buddies":[]}' http://localhost:8080/addressBooks

# Add Buddy
curl -i -X POST -H "Content-Type:application/json" -d '{"name":"mbappe", "phone":"7"}' http://localhost:8080/buddyInfoes
curl -i -X POST -H "Content-Type:application/json" -d '{"name":"messi", "phone":"10"}' http://localhost:8080/buddyInfoes

# Add 2 Buddy to Address Book
curl -i -X PATCH -H "Content-Type:text/uri-list" -d "http://localhost:8080/buddyInfoes/1" http://localhost:8080/addressBooks/1/buddies
curl -i -X PATCH -H "Content-Type:text/uri-list" -d "http://localhost:8080/buddyInfoes/2" http://localhost:8080/addressBooks/1/buddies

# Delete Address Book
curl -i -X DELETE http://localhost:8080/addressBooks/1

# Delete 2 Buddy
curl -i -X DELETE http://localhost:8080/buddyInfoes/1
curl -i -X DELETE http://localhost:8080/buddyInfoes/2

# Recall that gui is @ http://localhost:8080/display?id=1
