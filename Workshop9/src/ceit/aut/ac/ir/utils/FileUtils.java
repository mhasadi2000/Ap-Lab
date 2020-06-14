package ceit.aut.ac.ir.utils;

import ceit.aut.ac.ir.model.Note;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

public class FileUtils {

    public static ArrayList<Note> Notes=new ArrayList<>();
    private static final String NOTES_PATH = "./notes/";

    //It's a static initializer. It's executed when the class is loaded.
    //It's similar to constructor
    static {
        boolean isSuccessful = new File(NOTES_PATH).mkdirs();
        System.out.println("Creating " + NOTES_PATH + " directory is successful: " + isSuccessful);
    }

    public static File[] getFilesInDirectory() {
        return new File(NOTES_PATH).listFiles();
    }


    public static String fileReader(File file) {
        //TODO: Phase1: read content from file\\//
        FileReader f;
        StringBuilder con= new StringBuilder();
        String date = null;
        String title;
        try {
            f=new FileReader(NOTES_PATH+file.getName());
            BufferedReader br=new BufferedReader(f);
            title=br.readLine().replaceFirst("title=","");
            while (br.ready()){
                String temp=br.readLine();
                if (!temp.contains("date=")){
                    con.append(temp).append("\n");
                }else {
                    date=temp.replaceFirst("date=","");
                }
            }
            Note note=new Note(title,con.toString(),date);
            Notes.add(note);
            br.close();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return con.toString();
    }

    /**write content, title, **/
    public static void fileWriter(String content) {
        //TODO: write content on file//\\
        FileWriter f;
        try {
            String fileName = getProperFileName(content);

            f=new FileWriter(NOTES_PATH+fileName+".txt");
            BufferedWriter bw=new BufferedWriter(f);
            bw.write(fileName);
//            bw.write(content);
            bw.close();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //TODO: Phase1: define method here for reading file with InputStream

    public static String fileInputStream(File file) throws IOException {
        String content= "";
        byte[] bytes;
        FileInputStream in=null;
        try {
            in = new FileInputStream(file);
            bytes = in.readAllBytes();
            for (byte b : bytes) {
                content += ((char) b);
            }
        }finally {
            if (in!=null) {
                in.close();
            }
        }

        return content;
    }
    //TODO: Phase1: define method here for writing file with OutputStream

    public static void fileOutputStream(String content) throws IOException {
        FileOutputStream out=null;
        try {
            String fileName = getProperFileName(content);
            out = new FileOutputStream(NOTES_PATH + fileName + ".txt");
            byte[] bytes;
            bytes = fileName.getBytes();
            out.write(bytes);
        }finally {
            if (out!=null){
                out.close();
            }
        }
    }
    //TODO: Phase2: proper methods for handling serialization

    private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        String fileName=null;
        if (loc != -1) {
            fileName=content.substring(0,loc);
        }else if (!content.isEmpty()) {
            fileName= content;
        }else{
            fileName=System.currentTimeMillis() + "_new file";
        }
        Note note=new Note(fileName,content,new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime()));
        return note.toString();
    }

}
