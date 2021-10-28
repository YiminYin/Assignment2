package au.edu.unsw.infs3634.musicrecommender;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

    public static List<Music> getAllMusics(){
        List<Music> list = new ArrayList<>();

        list.add(new Music(
            "https://www.jango.com/music/Taylor+Swift/_full_bio",
            "Cardigan",
            "Taylor Swift",
            8,
            "American pop and country music",
            "Taylor Alison Swift (born December 13, 1989) is an American country popsinger-songwriter, musician and actress.",
            R.drawable.m1)
        );
        list.add(new Music(
                "https://www.jango.com/music/Drake/_full_bio",
                "Toosie Slide",
                "Drake",
                9,
                "Hip hop music",
                "Aubrey Drake Graham (born October 24, 1986), who records under the mononym Drake, is a Canadian recording artist and actor.",
                R.drawable.m2)
        );
        list.add(new Music(
                "http://www.musicorigins.org/item/avicii-on-edm/",
                "Wake Me Up",
                "Avicii",
                3,
                "electronic dance music",
                "He was born in Stockholm, Sweden as Tim Bergling, and later became known as Avicii, one of the biggest figures as a DJ, producer, and songwriter within the genre of electronic dance music.",
                R.drawable.m3)
        );
        list.add(new Music(
                "http://en.wikipedia.org/wiki/George_Ezra",
                "Budapest",
                "George Ezra",
                5,
                "Folk Rock",
                "",
                R.drawable.m4)
        );

        list.add(new Music(
                "https://www.jango.com/music/Tove+Lo/_full_bio",
                "Ultimate Hangout",
                "Tove Lo",
                7,
                "Electropop",
                "bba Tove Elsa Nilsson (born 29 October 1987), known professionally as Tove Lo (Swedish pronunciation: [ˈtûːvɛ ˈluː]), is a Swedish singer and songwriter. ",
                R.drawable.m5)
        );
        list.add(new Music(
                "https://www.jango.com/",
                "Tired of Talking",
                "León",
                3,
                "punk",
                "",
                R.drawable.m6)
        );
        list.add(new Music(
                "http://en.wikipedia.org/wiki/BTS_(band)",
                "Butter",
                "BTS",
                4,
                "Hip hop",
                "BTS (Korean: 방탄소년단; RR: Bangtan Sonyeondan), also known as the Bangtan Boys, is a South Korean boy band that was formed in 2010 and debuted in 2013 under Big Hit Entertainment.",
                R.drawable.m7)
        );
        list.add(new Music(
                "https://www.jango.com/music/Wiz+Khalifa/_full_bio",
                "Pull Up (feat. Lil Uzi Vert)",
                "Wiz Khalifa",
                1,
                "generation of new rappers",
                "Wiz Khalifa, or Cameron Jibril Thomaz, is part of a generation of new rappers, along with Drake, Kid Cudi and others, who came up through internet mixtapes and have little to no connection to the streets, gang violence, or the drug game. ",
                R.drawable.m8)
        );
        list.add(new Music(
                "https://www.jango.com/music/Mac+Miller/_full_bio",
                "Knock Knock",
                "Mac Miller",
                6,
                "Art Punk",
                "Malcolm McCormick (born January 19, 1992), known by his stage name Mac Miller (previously Easy Mac), is an American rapper from Pittsburgh, Pennsylvania. He is signed to Rostrum Records.",
                R.drawable.m9)
        );
        list.add(new Music(
                "https://en.wikipedia.org/wiki/Zedd",
                "Clarity (tiesto remix)",
                "Zedd",
                10,
                "EDM",
                "Zedd grew up and began his musical journey in Kaiserslautern, Germany. His stage name, Zedd, was derived from zed, the English pronunciation, barring American English, for the first letter of his surname, Z.",
                R.drawable.m10)
        );
        return  list;
    }
}
