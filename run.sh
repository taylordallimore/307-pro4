javac java/*.java -d bin

cd bin

jar cfm ../core.jar ../manifest.txt ./

cd ../


java -jar core.jar 


py main.py

pause 