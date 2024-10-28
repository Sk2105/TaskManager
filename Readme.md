# Task Manager Application

## Table of Contents

- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)

## Description

This application is used to manage tasks. It provides the following features:

- Create tasks
- Update tasks
- Delete tasks
- Get all tasks
- Get task by ID

## Installation

```bash
mvn install


```

## Usage

```bash
mvn spring-boot:run
```

## API Documentation

You can access the API documentation at https://localhost:8080.

### Get All Tasks

```bash
curl -X GET "http://localhost:8080/tasks"
```

### Get Task By ID

```bash
curl -X GET "http://localhost:8080/tasks/1"
```

### Create Task

```bash
curl -X POST "http://localhost:8080/tasks" \
    -H "Content-Type: application/json" \
    -d '{
        "id": 1,
        "title": "Task 1",
        "description": "Description of Task 1"
    }'
```

### Update Task

```bash
curl -X PUT "http://localhost:8080/tasks/1" \
    -H "Content-Type: application/json" \
    -d '{
        "id": 1,
        "title": "Updated Task 1",
        "description": "Updated Description of Task 1"
    }'
```

### Delete Task

```bash
curl -X DELETE "http://localhost:8080/tasks/1"
```
