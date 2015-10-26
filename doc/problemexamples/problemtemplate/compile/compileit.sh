#!/bin/bash
javac=/bin/javac
[ -x "$javac" ] || javac=/usr/bin/javac
if [ ! -x $javac ]; then
    echo "$javac not found or it's not executable"
    exit 47
fi
jar=/bin/jar
[ -x "$jar" ] || jar=/usr/bin/jar
if [ ! -x $jar ]; then
    echo "$jar not found or it's not executable"
    exit 47
fi
export CLASSPATH=.:$CLASSPATH
cd src
if [ -r "HelloWorld.java" ]; then
  $javac "HelloWorld.java"
  echo $? > ../compileit.retcode
fi
find . -name "*.java" | while read lin; do
  $javac "$lin"
  echo $? > ../compileit.retcode
done
rm -f ../run.jar
$jar cvfe ../run.jar HelloWorld *
exit 0
