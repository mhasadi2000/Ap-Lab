package com.company;

/**The music class for store music file information
 * address,singer and release year.
 * @author Mohammad Hosswin Asadi
 * **/
public class Music {
    private String filename;//address
    private  String singer;
    private int releaseYear;

    /**construct music info
     * @param filename the address of music file
     * @param singer the name of singer
     * @param releaseYear the year of release
     * **/
    public Music(String filename,String singer,int releaseYear){
        this.filename=filename;
        this.singer=singer;
        this.releaseYear=releaseYear;
    }

    /**@return filename**/
    public String getFilename() {
        return filename;
    }
    /**@param filename set the filename**/
    public void setFilename(String filename) {
        this.filename = filename;
    }
    /**@return singer of music file**/
    public String getSinger() {
        return singer;
    }

    /**@param singer set the singer of the file**/
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**@return the track release year**/
    public int getReleaseYear() {
        return releaseYear;
    }
}
