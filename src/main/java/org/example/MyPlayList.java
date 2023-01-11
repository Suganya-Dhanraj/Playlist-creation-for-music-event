package org.example;

public class MyPlayList {
    public static void main(String[] args) {
        UserPlaylist s1= new UserPlaylist();
        int user_iD= s1.getUser_id();
        System.out.println(user_iD);
    }
    public static void setPlaylist(String[] args) {
        UserPlaylist s1= new UserPlaylist();
        int play_list= s1.setPlaylist_id();
        System.out.println(play_list);
    }




}
