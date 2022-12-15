# allure-report-generation-plugin

Add plugin to build tags as mentioned below to generate reports

<build>
    <plugins>
        <plugin>
            <groupId>org.allure.report</groupId>
            <artifactId>allure-report-plugin</artifactId>
            <version>1.0</version>
            <executions>
                <execution>
                    <goals>
                        <goal>generate-report</goal>
                    </goals>
                </execution>
            </executions>
            <configuration>
                <path>Report</path>
            </configuration>
        </plugin>
    </plugins>
</build>
