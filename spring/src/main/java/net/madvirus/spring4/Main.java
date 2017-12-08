package net.madvirus.spring4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){
//        MavenBuildRunner buildRunner = new MavenBuildRunner();
//        buildRunner.setMavenPath("c://apache-maven-3.1.1");
//        Project project = new Project();
//        List<String> srcDirs = new ArrayList<>();
//        srcDirs.add("src");
//        srcDirs.add("srcResources");
//        project.setSrcDirs(srcDirs);
//        project.setBinDir("bin");
//        project.setBuildRunner(buildRunner);
//
//        project.build();

        String configLocation = "classpath:applicationContext.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        Project project = ctx.getBean("Project",Project.class);
        project.build();
        ctx.close();
    }
}
