## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Cara Menjalankan Program

Untuk menjalankan program utama dalam proyek ini, harap perhatikan instruksi berikut:

1. **PENTING**: Untuk menjalankan program, akses folder spesifik yang berisi kode sumber yang ingin dijalankan. Jangan menjalankan program dari folder induk.
2. Gunakan perintah kompilasi dan eksekusi Java secara manual melalui terminal.
3. Hindari menggunakan fitur "Run Java" pada Visual Studio Code karena struktur paket dalam proyek ini memerlukan metode kompilasi dan eksekusi khusus.

Contoh perintah untuk menjalankan program:
```bash
# Akses folder spesifik Manusia
cd src/Polimorfisme-Universal\ \(Inclusion\)/Manusia
javac *.java
java MPerson
```

atau

```bash
# Akses folder spesifik Pekerja
cd src/Post-Test/Pekerja
javac *.java
java TestPolimorfisme
```
