SMS-Service sender Twilio API

# server-port: 8083


POST:

curl -H "Content-Type: application/json" -X POST -d '{"phoneNumber":"<Target Number>","message":"<Your message>"}' http://localhost:8083/api/v1/sms
