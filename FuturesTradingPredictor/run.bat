@echo off
echo Buscando Maven...
where mvn >nul 2>nul
if %ERRORLEVEL% == 0 (
    echo Maven encontrado. Construyendo el proyecto...
    call mvn clean package
    java -jar target\futures-trading-predictor-1.0-SNAPSHOT.jar
    pause
    exit /b
)

echo Maven no encontrado en el sistema.
if not exist "apache-maven-3.8.8" (
    echo Descargando e instalando Maven temporalmente...
    powershell -Command "Invoke-WebRequest -Uri 'https://archive.apache.org/dist/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.zip' -OutFile 'maven.zip'"
    powershell -Command "Expand-Archive maven.zip -DestinationPath ."
    del maven.zip
)

echo Construyendo el proyecto con Maven portatil...
call apache-maven-3.8.8\bin\mvn clean package
echo Ejecutando la aplicacion...
java -jar target\futures-trading-predictor-1.0-SNAPSHOT.jar
pause
