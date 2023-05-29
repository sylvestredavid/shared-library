#!/usr/bin/env groovy

def call(String buildResult) {
  if(buildResult == "SUCCESS" {
    slackSend color: 'good', message: "SUCCESSFULL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
  }
  if(buildResult == "UNSTABLE" {
    slackSend color: 'warning', message: "UNSTABLE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
  }
  else { 
    slackSend color: 'danger', message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
  }
}
