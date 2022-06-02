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
		stage('On release') {
			when {
				branch 'release-*'
			}
			steps {
				echo "On Release"
				echo env.BRANCH_NAME
			}
		}
		stage('On CLI') {
			steps {
				sh '''
					jf config show
					jf rt ping
				'''
			}
		}
	}
}
