# multi-module-app

This app demonstrates how to setup multi module app using Gradle. This small app is comprised for `api`, `background-jobs` and `lib`. The purpose of `api` is to serve a REST API, `background-jobs` to process cron-like jobs, and `lib` to house common code.


### How to compile, test and run:

`./gradlew clean build` will clean, build and run all the tests.

`./gradlew :api:bootRun` and check this url: `http://localhost:8080/greeting`.

`./gradlew :background-jobs:bootRun` will start cron jobs.