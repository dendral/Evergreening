# issues a GET request to retrieve tasks with no JWT
# HTTP 403 Forbidden status is expected
curl http://localhost:8080/LeapOriginacion/tasks

# registers a new user
curl http://localhost:8080/LeapOriginacion/users/sign-up -H "Content-Type: application/json" -X POST -d '{ "username": "admin", "password": "password" }' 

# logs into the application (JWT is generated)
curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/LeapOriginacion/login

# issue a POST request, passing the JWT, to create a task
# remember to replace xxx.yyy.zzz with the JWT retrieved above
curl -H "Content-Type: application/json" \
-H "Authorization: Bearer xxx.yyy.zzz" \
-X POST -d '{
    "description": "Buy watermelon"
}'  http://localhost:8080/LeapOriginacion/tasks

# issue a new GET request, passing the JWT
# remember to replace xxx.yyy.zzz with the JWT retrieved above
curl -H "Authorization: Bearer xxx.yyy.zzz" http://localhost:8080/LeapOriginacion/tasks