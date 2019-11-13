package tes.Monarchetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>tes.Monarchetype</groupId>
  <artifactId>Archetype</artifactId>
  <version>1.1.1</version>
  <packaging>jar</packaging>

  <name>Archetype</name>
  <url>http://maven.apache.org</url>
  

    <!-- modification de la pom pour ajouter le checkstyle -->
		  
     <reporting>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-checkstyle-plugin</artifactId>
          <version>3.1.0</version>
          <reportSets>
            <reportSet>
              <reports>
                <report>checkstyle</report>
              </reports>
            </reportSet>
          </reportSets>
        </plugin>
      </plugins>
    </reporting>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  
    
  <build>
   <plugins>    
   	 <!-- generation de la java doc -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-javadoc-plugin</artifactId>
        <version>3.1.1</version>
        <configuration>
       
        </configuration>
      </plugin>
    
       <!-- modification de la pom pour le findbug-->
        <plugin>
        	<groupId>org.codehaus.mojo</groupId>
        	<artifactId>findbugs-maven-plugin</artifactId>
        	<version>3.0.6-SNAPSHOT</version>
      	</plugin>
      	
      	     <!-- modification de la pom pour generer un jar-->
       <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.2.0</version>
        <configuration>
          <archive>
            <manifestFile>${project.build.outputDirectory}/META-INF/MANIFEST.MF</manifestFile>
          </archive>
        </configuration>
       
      </plugin>
      	
     <!-- modification de la pom pour ajouter jar avec ses dependances-->
     <plugin>
		 <artifactId>maven-assembly-plugin</artifactId>
		 <configuration>
		 <archive>
		 <manifest>
		 <mainClass>fully.qualified.MainClass</mainClass>
		 </manifest>
		 </archive>
		 <descriptorRefs>
		 <descriptorRef>jar-with-dependencies</descriptorRef>
		 </descriptorRefs>
		 </configuration>
 </plugin>

    </plugins>	
  
  </build>
</project>

 * 
 * 
 * 
 * 
 * 
 * */
}