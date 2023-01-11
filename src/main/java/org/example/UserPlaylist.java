package org.example;
class UserPlaylist {
    private int user_id=01;
    private int playlist_id=101;
    private String name= "Movie";
    private int song_num= 1;

    public UserPlaylist(){
        this.user_id = user_id;
        this.playlist_id = playlist_id;
        this.name = name;
        this.song_num = song_num;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int setPlaylist_id() {
        this.playlist_id = playlist_id;
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong_num(int song_num) {
        this.song_num = song_num;
    }

    public int getPlaylist_id() {
        return playlist_id;
    }

    public int getSong_num() {
        return song_num;
    }

    public int getUser_id() {
        return user_id;
    }
    public String getName() {
        return name;
    }
}