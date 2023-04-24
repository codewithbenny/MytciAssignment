# Employee Bonus Eligibility API

This project implements a Spring API that determines which employees are eligible for a bonus. It receives a list of bonus elements in the JSON format and returns a list of eligible employee elements in the response JSON format.

## Installation

1. Clone the repository:

```bash
git clone https://github.com/codewithbenny/MytciAssignment.git
```

2. Build the project with Gradle:

```bash
./gradlew build
```

## Usage

Start the Spring application:

```bash
./gradlew bootRun
```

Send a POST request to the `/tci/bonus/eligibility` endpoint with the bonus information in the request body:

```bash
curl -X POST \
  http://localhost:8080/tci/bonus/eligibility \
  -H 'Content-Type: application/json' \
  -d '{
        "bonus": [
            {
                "empName": "raj singh",
                "amount": 5000,
                "currency": "INR",
                "joiningDate": "may-20-2022",
                "exitDate": "may-20-2023"
            },
            {
                "empName": "pratap m",
                "amount": 3000,
                "currency": "INR",
                "joiningDate": "jan-01-2021",
                "exitDate": "may-20-2023"
            },
            {
                "empName": "sushmita lal",
                "amount": 4000,
                "currency": "INR",
                "joiningDate": "jan-01-2021",
                "exitDate": "dec-31-2021"
            },
            {
                "empName": "sam",
                "amount": 2500,
                "currency": "USD",
                "joiningDate": "may-20-2022",
                "exitDate": "may-20-2023"
            },
            {
                "empName": "john",
                "amount": 2500,
                "currency": "USD",
                "joiningDate": "jan-20-2023",
                "exitDate": "dec-30-2024"
            },
            {
                "empName": "susan",
                "amount": 700,
                "currency": "USD",
                "joiningDate": "jan-01-2022",
                "exitDate": "dec-31-2022"
            }
        ]
    }'
```

The API will respond with the eligible employee information in the response body:

```json
{
    "errorMessage": "",
    "data": [
        {
            "currency": "INR",
            "employees": [
                {
                    "empName": "pratap m",
                    "amount": 3000
                },
                {
                    "empName": "raj singh",
                    "amount": 5000
                }
            ]
        },
        {
            "currency": "USD",
            "employees": [
                {
                    "empName": "sam",
                    "amount": 2500
                },
                {
                    "empName": "susan",
                    "amount": 700
                }
            ]
        }
    ]
}
```

## API Specification

### Endpoints

#### POST /tci/bonus/eligibility

Determine which employees are eligible for a bonus.

##### Request Body

```json
{
    "bonus": [
        {
            "empName": "string",
            "amount": 0,
            "currency": "string",
            "joiningDate": "string",
            "exitDate": "string"
        }
   
