# gh-second-action

Sample workflow to run java test via maven

REF: https://subodhsingh.hashnode.dev/running-automated-tests-with-github-actions-maven-testng

```
name: Run Java Test with Maven
on: workflow_dispatch
jobs:
  tests:
    runs-on: ubuntu-latest
    steps:
    - name: Checkout
      uses: actions/checkout@v3
    - name: Set up JDK 11
      uses: actions/setup-java@v3
      with:
        java-version: '11'
        distribution: 'temurin'
    - name: Run tests
      run: mvn -f second.action/pom.xml clean test
    - name: Upload Test Report
      uses: actions/upload-artifact@v3
      if: always()
      with:
        path: second.action/test-output/*.*
```