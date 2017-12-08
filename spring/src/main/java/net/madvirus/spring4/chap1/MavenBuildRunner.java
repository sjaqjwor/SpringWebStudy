
package net.madvirus.spring4.chap1;
import java.util.List;

public class MavenBuildRunner implements BuildRunner{

    private String mavenPath;
    @Override
    public void build(List<String> srcDirs , String binDirs){
        String info = "메이븐 경로"+mavenPath+"\n";
        for(String srcDir : srcDirs){
            info+= "소스경로"+srcDir+"\n";
        }
        info+="클래스파일 경로"+binDirs+"\n";
        System.out.print(info);
    }

    public void setMavenPath(String mavenPath){
        this.mavenPath= mavenPath;
    }
}
