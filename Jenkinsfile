node('master') {
    stage('scm') {
        checkout scm
    }
    stage('build') {
        withMaven(jdk: 'JDK1.8.0', maven: 'Maven3.6.0') {
            sh 'mvn clean install'
        }
    }
}
