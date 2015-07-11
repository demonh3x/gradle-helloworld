# gradle-helloworld
An initial template for Java projects using Gradle as the build tool.

## Run the tests
`gradle test` will print any failures like:

```
... build information ...

helloWorld.MainTest > theTruth FAILED
    java.lang.AssertionError at MainTest.java:11

1 test completed, 1 failed

... more build information ...
```

Running `gradle test --info` will print like:

```
... build information ...

helloWorld.MainTest > theTruth FAILED
    java.lang.AssertionError: 
    Expected: is <false>
         but: was <true>
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)
        at org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)
        at helloWorld.MainTest.theTruth(MainTest.java:11)

1 test completed, 1 failed

... more build information ...
```

They will also generate more detailed reports:
* HTML: at `build/reports/tests/index.html`
* XML: at `build/test-results/TEST-helloWorld.MainTest.xml`
* Binary: at `build/test-results/binary/test/*`

## Run the main class
`gradle run` will print:

```
... build information ...
Hello world
... more build information ...
```

It will run the class specified at [mainClassName](https://github.com/demonh3x/gradle-helloworld/blob/master/build.gradle#L22).

## Compile jar
`gradle jar` will create the jar at `build/libs/helloworld-0.1.0.jar`. 

The *.jar filename is based on the [baseName](https://github.com/demonh3x/gradle-helloworld/blob/master/build.gradle#L13) and the [version](https://github.com/demonh3x/gradle-helloworld/blob/master/build.gradle#L14).

Executing it: `java -jar builds/libs/helloworld-0.1.0.jar` will run the Main class specified as [Main-Class in the manifest](https://github.com/demonh3x/gradle-helloworld/blob/master/build.gradle#L16).
