package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * @author Mohammad Hossein Asadi
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> musics ;
    private ArrayList<Music> favorites;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        musics=new ArrayList<>();
        favorites=new ArrayList<>();
        player=new MusicPlayer();
    }

    /**
     * Add a music file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music filename)
    {
        musics.add(filename);
    }

    /**
     * Return the number of music files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return musics.size();
    }

    /**
     * List a music file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)){
            System.out.println(musics.get(index).getFilename()+" | "+musics.get(index).getSinger()+" | "+musics.get(index).getReleaseYear());
        }else{
            System.out.println("the index is not valid");
        }
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        Iterator<Music> ite=musics.iterator();
        while(ite.hasNext()){
            Music temp=ite.next();
            System.out.println(temp.getFilename()+" | "+temp.getSinger()+" | "+temp.getReleaseYear());
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)){
            musics.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)){
            player.startPlaying(musics.get(index).getFilename());
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if (index < musics.size() && index>=0){
            return true;
        }
        System.out.println("the index is not valid");
        return false;
    }
    /**add a music file to the favorite list
     * @param music to add to favorite list
     * **/
    public void addToFavorites(Music music){
        favorites.add(music);
    }

    /**remove a music file from the favorite list
     * @param index the index that we want to remove
     * **/
    public void removeFromFavorites(int index){
        if(validIndex(index)){
            favorites.remove(index);
        }
    }
    /**Show a list of all the music files in the favorite collection.**/
    public void listFavoritesFile(){
        Iterator<Music> ite=favorites.iterator();
        while(ite.hasNext()){
            Music temp=ite.next();
            System.out.println(temp.getFilename()+" | "+temp.getSinger()+" | "+temp.getReleaseYear());
        }
    }

    /**get a string and search within singers and file's address
     * @param forSearch to find among singers and addresses.
     * **/
    public void searchWithinFavorites(String forSearch){
        Iterator<Music> ite=musics.iterator();
        while (ite.hasNext()){
           if( ite.next().getSinger().equals(forSearch)){
               System.out.println("("+forSearch+") that you entered is found among singers in your favorite list");
           }
        }
        Iterator<Music> it=musics.iterator();
        while (it.hasNext()){
            if( it.next().getFilename().equals(forSearch)){
                System.out.println("("+forSearch+") that you entered is found among file's address in your favorite list");
            }
        }

    }

}