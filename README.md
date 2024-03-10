# gh-second-action

Sample workflow to run java test via maven

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
      run: mvn clean test
```