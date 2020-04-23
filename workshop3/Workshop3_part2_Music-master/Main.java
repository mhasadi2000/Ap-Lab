package com.company;

import java.util.ArrayList;
/**The Main class for using and testing the system
 * @author Mohammad Hossein Asadi
 * **/
public class Main {

    /**The main method**/
    public static void main(String[] args) {
        /*creat  four MusicCollection of pop, jazz, rock and country**/
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz= new MusicCollection();
        MusicCollection rock= new MusicCollection();
        MusicCollection country= new MusicCollection();
        //----------------------------------------------------------
        /*the answer of the question in workshop:
        if you want to creat a large number of MusicCollection
        for example about 100 collections you can use array
        as it comes bellow.
         */
        MusicCollection[] mu=new MusicCollection[3];
        for (int i = 0; i <mu.length; i++){
            MusicCollection traditional=new MusicCollection();
            mu[i]=traditional;
        }
        //----------------------------------------------------------
        /*creat a number of musics and add them to music collections**/
        Music m1=new Music("001","Bani",2019);
        Music m2=new Music("002","Marly",2010);
        Music m3=new Music("003","Jim",2009);
        Music m4=new Music("004","Samani",2015);
        Music m5=new Music("005","Alex",2000);
        Music m6=new Music("006","Ghader",2018);
        pop.addFile(m1);
        pop.addFile(m2);
        jazz.addFile(m3);
        rock.addFile(m4);
        country.addFile(m5);
        pop.addFile(m6);
        /*set the filename and the singer name of m5**/
        m5.setFilename("0005");
        m5.setSinger("Hamid");
        System.out.println("-------------------------");
        /*print the number of pop collection**/
        System.out.println("number of pop files: "+pop.getNumberOfFiles());
        System.out.println("-------------------------");
        /*start playing a music in the position of index**/
        pop.startPlaying(0);
        System.out.println("-------------------------");
        /*stop playing the music**/
        pop.stopPlaying();
        System.out.println("-------------------------");
        /*add tow musics to favorite list**/
        pop.addToFavorites(m1);
        pop.addToFavorites(m2);
        /*get the list of all favorite files**/
        pop.listFavoritesFile();
        System.out.println("-------------------------");
        /*get the list of a music in the index position**/
        pop.listFile(0);
        System.out.println("-------------------------");
        /*get the list of all files**/
        pop.listAllFiles();
        System.out.println("-------------------------");
        /*search within the filenames and singers**/
        pop.searchWithinFavorites("Bani");
        pop.searchWithinFavorites("002");
        /*remove a music file from favorite list**/
        pop.removeFromFavorites(0);
        /*remove a file from the list**/
        pop.removeFile(0);
        System.out.println("-------------------------");
        /*print the number of pop collection**/
        System.out.println("number of pop files: "+pop.getNumberOfFiles());
        System.out.println("number of jazz files: "+jazz.getNumberOfFiles());
        System.out.println("number of rock files: "+rock.getNumberOfFiles());
        System.out.println("number of country files: "+country.getNumberOfFiles());







    }
}
