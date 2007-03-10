/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.jci.examples.commandline;

/**
 * 
 * @author tcurdt
 */
public final class CommandlineCompiler {
    
    public static void main( String[] args ) throws Exception {
        /*
		final Options options = new Options();
		options.addOption("classpath", false, "classpath");
		options.addOption("source", false, "classpath");
		options.addOption("target", false, "classpath");

		final CommandLineParser = new PossixParser();
		final CommandLine cmd = parser.parse(options, args);

		final JavaCompilerSettingsFactory settingsFactory = new ProperitesJavaCompilerSettingsFactory("compiler.properties")
		final JavaCompilerSettingsFactory settingsFactory = new AvalonJavaCompilerSettingsFactory(configuration)
		final JavaCompilerSettingsFactory settingsFactory = new XmlJavaCompilerSettingsFactory("compiler-settings.xml")
		final JavaCompilerSettingsFactory settingsFactory = new CliJavaCompilerSettingsFactory(cmd);
    	
        final JavaCompilerSettings settings = settingsFactory.createSettings();
        final JavaCompiler compiler = JavaCompilerFactory.getInstance().createCompiler(settings);
        //final JavaCompiler compiler = settings.createCompiler();



  -g                         Generate all debugging info
  -g:none                    Generate no debugging info
  -g:{lines,vars,source}     Generate only some debugging info
  -nowarn                    Generate no warnings
  -verbose                   Output messages about what the compiler is doing
  -deprecation               Output source locations where deprecated APIs are used
  -classpath <path>          Specify where to find user class files
  -sourcepath <path>         Specify where to find input source files
  -bootclasspath <path>      Override location of bootstrap class files
  -extdirs <dirs>            Override location of installed extensions
  -endorseddirs <dirs>       Override location of endorsed standards path
  -d <directory>             Specify where to place generated class files
  -encoding <encoding>       Specify character encoding used by source files
  -source <release>          Provide source compatibility with specified release
  -target <release>          Generate class files for specific VM version

  -J<flag>                   Pass <flag> directly to the runtime system
  -Xlint                     Enable recommended warnings
  -Xlint:{all,deprecation,unchecked,fallthrough,path,serial,finally,-deprecation,-unchecked,-fallthrough,-path,-serial,-finally}Enable or disable specific warnings
  -Xbootclasspath/p:<path>   Prepend to the bootstrap class path
  -Xbootclasspath/a:<path>   Append to the bootstrap class path
  -Xbootclasspath:<path>     Override location of bootstrap class files
  -Djava.ext.dirs=<dirs>     Override location of installed extensions
  -Djava.endorsed.dirs=<dirs>Override location of endorsed standards path
  -Xmaxerrs <number>         Set the maximum number of errors to print
  -Xmaxwarns <number>        Set the maximum number of warnings to print
  -Xstdout <filename>        Redirect standard output

        map.put(CompilerOptions.OPTION_LineNumberAttribute, CompilerOptions.GENERATE);
        map.put(CompilerOptions.OPTION_SourceFileAttribute, CompilerOptions.GENERATE);
        map.put(CompilerOptions.OPTION_ReportDeprecation, CompilerOptions.GENERATE);
        map.put(CompilerOptions.OPTION_ReportUnusedImport, CompilerOptions.IGNORE);
        map.put(CompilerOptions.OPTION_Encoding, "UTF-8");
        map.put(CompilerOptions.OPTION_LocalVariableAttribute, CompilerOptions.GENERATE);
        map.put(CompilerOptions.OPTION_Source, CompilerOptions.VERSION_1_4);
        map.put(CompilerOptions.OPTION_TargetPlatform, CompilerOptions.VERSION_1_4);




		settings.put(CompilerOptions.TARGET_VERSION, "1.4");
		settings.put(CompilerOptions.SOURCE_VERSION, "1.4");

		*/
		
		/*
    	final URL[] classpath = {
    		new URL("a.jar"),
    		new URL("b.jar")
    	};
    	final URL[] classpath = settings.getClasspath();

    	final ClassLoader classloader = new URLClassLoader(classpath);
        
        final ResourceReader reader = new FileResourceReader(new File("srcdir"));
        final ResourceStore store = new MemoryResourceStore();
        
        final String[] resources = new String[] {
        	"org/my/Test.java",
        	"org/my/Something.java"
        };
        
        compiler.compile(resources, reader, store, classloader);
		*/
    }
}