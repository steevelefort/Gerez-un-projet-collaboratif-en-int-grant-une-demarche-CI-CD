# BobApp

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=coverage)](https://sonarcloud.io/summary/new_code?id=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=bugs)](https://sonarcloud.io/summary/new_code?id=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD)

A simple joke application with Spring Boot backend and Angular frontend, featuring a complete CI/CD pipeline with automated testing, code quality analysis, and deployment to Docker Hub.

## CI/CD Pipeline & Code Quality

### Quality Gate & KPIs
This project enforces strict quality standards through SonarCloud Quality Gate:
- **KPI 1 - Coverage on New Code**: ≥ 80% (enforced - PRs failing this check cannot be merged)
- **KPI 2 - Bugs**: 0 new bugs on new code (Reliability Rating A required)
- **Overall Coverage**: ~55% (baseline code provided as-is)

**Important**: The Quality Gate focuses on **New Code** metrics to ensure all new contributions meet quality standards while accepting the baseline code as-is.

### Reports & Metrics
- **SonarCloud Dashboard**: [View detailed analysis](https://sonarcloud.io/summary/new_code?id=steevelefort_Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD)
- **Coverage Reports**: Generated for each workflow run and available as [GitHub Actions Artifacts](https://github.com/steevelefort/Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD/actions)
  - Backend: JaCoCo HTML report
  - Frontend: Karma/Istanbul HTML report

### CI/CD Workflow
Every pull request triggers:
1. ✅ Automated testing (JUnit + Karma/Jasmine)
2. ✅ Code coverage analysis (JaCoCo + Istanbul)
3. ✅ Code quality scan (SonarCloud)
4. ✅ Quality Gate validation
5. ✅ Docker image build and push to Docker Hub (on merge to main)

See the complete workflow: [.github/workflows/ci-cd.yml](.github/workflows/ci-cd.yml)

## Getting Started

Clone project:

> git clone https://github.com/steevelefort/Gerez-un-projet-collaboratif-en-int-grant-une-demarche-CI-CD.git

## Front-end 

Go inside folder the front folder:

> cd front

Install dependencies:

> npm install

Launch Front-end:

> npm run start;

### Docker

Build the container:

> docker build -t bobapp-front .  

Start the container:

> docker run -p 8080:8080 --name bobapp-front -d bobapp-front

## Back-end

Go inside folder the back folder:

> cd back

Install dependencies:

> mvn clean install

Launch Back-end:

>  mvn spring-boot:run

Launch the tests:

> mvn clean install

### Docker

Build the container:

> docker build -t bobapp-back .  

Start the container:

> docker run -p 8080:8080 --name bobapp-back -d bobapp-back 