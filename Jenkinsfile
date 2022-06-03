pipeline {
	agent { label 'datalake' }
	options {
		disableConcurrentBuilds();
	}
	stages {
		stage('Hello') {
			steps {
				echo "Hello World"
			}
		}
		stage('On main') {
			when {
				branch 'main'
			}
			steps {
				echo "On Main"
			}
		}
		stage('On release 6.6.0') {
			when {
				branch 'release6.6.0'
			}
			steps {
				echo "On Release 6.6.0"
			}
		}
		stage('On release 6.8.0') {
			when {
				branch 'release6.8.0'
			}
			steps {
				echo "On Release 6.8.0"
			}
		}
		stage('On CLI') {
			steps {
				sh '''
					echo "jf config show"
					echo "jf rt ping"
				'''
			}
		}
	}
}
