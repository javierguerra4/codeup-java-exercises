//import java.io.IOException;
//import java.nio.file.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class FileIOLecture {
//
//    //        Method that will do the above code in one line.
//    public void readFileAndOutput (Path pathToFile){
//        List<String> linesInTheFile = new ArrayList<>();
//        try {
//            linesInTheFile = Files.readAllLines(pathToFile);
//        } catch (IOException)
//        }
//    }
//
//
//
//    public static void main(String[] args) {
////        Path path =  Paths.get("src");
////        System.out.println(path);
////        System.out.println(path.toAbsolutePath());
////        Path pathToThisLectureFile = Paths.get("src", "FileIOLecture.java");
////        System.out.println(pathToThisLectureFile);
//        Path pathToOurDataDir = Paths.get("src/test");
//////        System.out.println(pathToOurDataDir);
////        try {
////            Files.createDirectories(pathToOurDataDir);
////        } catch (IOException ioe) {
////            ioe.printStackTrace();
//
//        Path pathToOurFile = Paths.get("src/data", "list.txt");
////        try {
////            if (Files.notExists(pathToOurFile)) {
////                Files.createFile(pathToOurFile);
////        } else {
////            System.out.println("The" + pathToOurFile + "file already exist!");
////        }
////    } catch (IOException ioe) {
////                System.out.println("There was a problem!");
////                ioe.printStackTrace();
////            }
////        }
//        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudias");
//        try{
//            Files.write(pathToOurFile, imperials);
//        } catch (IOException ioe) {
//        ioe.printStackTrace();
//    }
//        List<String> currentList = new ArrayList<>();
//        try{
//            currentList = Files.readAllLines(pathToOurFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        for (String item : currentList){
//            System.out.println(item);
//        }
//
//
//    }
//}