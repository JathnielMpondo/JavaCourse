@echo off
javac %1.java
if %errorlevel% equ 0 (
    java %1
) else (
    echo "Erreur de compilation."
)
