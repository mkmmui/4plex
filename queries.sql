## Part 1: Test it with SQL

## Columns and types: int id; employer varchar(255); name varchar(255); skills varchar(255);

## Part 2: Test it with SQL

## Select name
## From employer
## where location = "St. Louis City"

## Part 3: Test it with SQL

## DROP TABLE job;

## Part 4: Test it with SQL

## SELECT distinct skill.name,skill.description,job.name FROM job
## job_skills on job.id= job_skills.jobs_id
## skill on skill.id = job_skills.skills_id