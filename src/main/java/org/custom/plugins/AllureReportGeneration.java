package org.custom.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@Mojo(name = "generate-report", defaultPhase = LifecyclePhase.COMPILE)
public class AllureReportGeneration extends AbstractMojo {

   /* @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;*/
    @Parameter(property = "path")
    String path;

    public void execute() throws MojoExecutionException, MojoFailureException {

        Date currentDate = Calendar.getInstance().getTime();
        String folder = String.valueOf(currentDate.getTime());
        File folderdata = new File(path+File.separator+folder);
        if(!folderdata.exists()){
            folderdata.mkdirs();
        }
        File file = new File(path+File.separator+folder+File.separator+"created.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*List<Dependency> dependencies = project.getDependencies();
        long numDependencies = dependencies.stream()
                .filter(d -> (scope == null || scope.isEmpty()) || scope.equals(d.getScope()))
                .count();
        getLog().info("Number of dependencies: " + numDependencies);*/
    }
}
