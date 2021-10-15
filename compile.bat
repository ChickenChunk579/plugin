@echo off
echo compiling...
javac -cp ".;./lib/craftbukkit-1.17.1.jar" src/com/plugin/plugin/*.java
echo done
echo building jar
cd src
jar cf ../server/plugins/plugin-1.0.0.jar *
cd ..
echo done