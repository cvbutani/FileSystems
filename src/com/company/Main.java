package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
//            Path path1 = FileSystems.getDefault().getPath("Example", "File2.txt");
//            Path path2 = FileSystems.getDefault().getPath("Example", "File1Copy.txt");
//            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);                        //  copy file from one place to another
//
//            path1 = FileSystems.getDefault().getPath("Example", "File1Copy.txt");
//            path2 = FileSystems.getDefault().getPath("Example", "Dir1","File1Copy.txt");
//            Files.copy(path1,path2, StandardCopyOption.REPLACE_EXISTING);                         //  copy file from one place to another
//
//            path1 = FileSystems.getDefault().getPath("Example", "File1.txt");
//            path2 = FileSystems.getDefault().getPath("Example","Dir2", "File1.txt");
//            Files.move(path1,path2, StandardCopyOption.REPLACE_EXISTING);                         //  move file from one place to another

//            path1 = FileSystems.getDefault().getPath("Example", "File1Copy.txt");
//            path2 = FileSystems.getDefault().getPath("Example", "File2.txt");
//            Files.move(path1,path2, StandardCopyOption.REPLACE_EXISTING);                         // Rename file
//            Files.delete(path2);                                                                    // Delete File
//            Files.deleteIfExists(path2);                                                             //     Delete only if Exists

//            Path path1 = FileSystems.getDefault().getPath("Example", "File1.txt");
//            Files.createFile(path1);                                                              // Create File

//            Path path1 = FileSystems.getDefault().getPath("Example", "dir4");
//            Files.createDirectory(path1);                                                           // Create Directory

//            Path path1 = FileSystems.getDefault().getPath("Example/Dir2/Dir3/Dir5/Dir6/Dir7");        //  Create Multiple Directory
//            Files.createDirectories(path1);

//            Path path1 = FileSystems.getDefault().getPath("Example/Dir2/Dir3/Dir5/Dir6/Dir7", "File1.txt");       //  Create File in multiple Directories
//            Files.createFile(path1);

            Path path1 = FileSystems.getDefault().getPath("Example", "File2.txt");
            long size = Files.size(path1);                                                              // get Size of the file
            System.out.println("Size: " + size);
            System.out.println("Last Modified Time/Date: " + Files.getLastModifiedTime(path1));         // get last modified time of the file
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        Path path = FileSystems.getDefault().getPath("FileIn.txt");
//        printFile(path);
//        System.out.println();
//
////        path = FileSystems.getDefault().getPath("File","FileInFile.txt");
//        path = Paths.get(".", "File", "FileInFile.txt");
//        printFile(path);
//        System.out.println();
//
//        path = FileSystems.getDefault().getPath("/home/chiragbutani","/IdeaProjects","/FileOut.txt");
////        path = FileSystems.getDefault().getPath("/home/chiragbutani/IdeaProjects/FileOut.txt");
//        printFile(path);
//
//        path = Paths.get(".");
//        System.out.println();
//        System.out.println(path.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".","File","..","File","FileInFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath()); // This will print out actual path of file which you are looking for.
//        printFile(path2);
//
//        //  Below 4 line code will only print path and It will not create any file named as thisFileDoesNotExists.txt
//        path2 = FileSystems.getDefault().getPath("thisFileDoesNotExists.txt");
//        System.out.println(path2.toAbsolutePath());
//
//        path2 = Paths.get("/home/chiragbutani/Documents", "File" , "FileInDoc.txt");
//        System.out.println(path2.toAbsolutePath());
//
//        //  Below listed 4 line will check weather Folder/File Exists in directory or not
//        //  Files.exists will check if File is available or not. Returns True or False accordingly.
//        path = FileSystems.getDefault().getPath("File");
//        System.out.println("Exists: " + Files.exists(path));
//
//        path = FileSystems.getDefault().getPath("FileIN");
//        System.out.println("Exists: " + Files.exists(path));
//
//        //  Files.notExists is true when file is not in directory.
//        path = FileSystems.getDefault().getPath("FileIN");
//        System.out.println("Exists: " + Files.notExists(path));
//
//    }
//
//    public static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
