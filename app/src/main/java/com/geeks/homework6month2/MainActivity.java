package com.geeks.homework6month2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.geeks.homework6month2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private UserAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        User user =  new User("Messi", 38 ,"https://www.euro-football.ru/images/gallery/12c71427a2dd1eb446055598c3b61a84480d60fa.jpg"
                /*"https://m.media-amazon.com/images/M/MV5BYWM1N2UzZmItY2EzZi00NWEzLTgyYTUtMGI4YTBkMTEwOTE4XkEyXkFqcGc@._V1_.jpg"*/);
        User user1 =  new User("ronaldo", 40 ,
                "https://www.euro-football.ru/images/gallery/a76a81a9d05a39c94874c2d3b3b64f4e287ece76.jpg");
        User user2 =  new User("pirlo", 46 ,
                "https://www.euro-football.ru/images/gallery/5355b3de9903dab971fe05d290cb1ba33929aed8.jpg");
        User user3 =  new User("buffon", 47 ,
                "https://www.euro-football.ru/images/gallery/18350f3dbf6bdf6bcfca7665ba1f854806687300.jpg");
        User user4 =  new User("lujan", 41 ,
                "https://www.euro-football.ru/images/gallery/0196e30a32af7fb1ac9a79ebc5aed190b268d816.jpg");
        User user5 =  new User("casillas", 44 ,
                "https://www.euro-football.ru/images/gallery/f3f2cdc363d21cf19505b81b748c870c4dec7feb.jpg");
        User user6 =  new User("chiellini", 41 ,
                "https://www.euro-football.ru/images/gallery/bf58b34e45a9411b9fc253d5d80bbb97d4631ef5.jpg");
        User user7 =  new User("stephen", 45 ,
                "https://www.euro-football.ru/images/gallery/fb99c49b80e49eed7aa904e7750efb56c750db39.jpg");
        User user8 =  new User("Conqueror", 21 ,
                "https://i.pinimg.com/736x/40/16/32/4016324ca45e07a03eb8f20898e20a48.jpg");
        User user9 =  new User("New Sall Of", 200 ,
                "https://i.pinimg.com/originals/cd/a1/b3/cda1b34acf75df0ce045d8d382d3ebfd.gif");
            /*https://i.pinimg.com/originals/cd/a1/b3/cda1b34acf75df0ce045d8d382d3ebfd.gif*/
        ArrayList<User> userArrayList = new ArrayList<>();

        userArrayList.add(user);
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        userArrayList.add(user6);
        userArrayList.add(user7);
        userArrayList.add(user8);
        userArrayList.add(user9);

        UserSecond userSecond =  new UserSecond("Вальтер Бенитес", 32 ,"https://photobooth.cdn.sports.ru/preset/tags/4/bf/84bb49e5a44e599c44025c5bca69a.jpeg"
                /*"https://m.media-amazon.com/images/M/MV5BYWM1N2UzZmItY2EzZi00NWEzLTgyYTUtMGI4YTBkMTEwOTE4XkEyXkFqcGc@._V1_.jpg"*/);
        UserSecond userSecond1 =  new UserSecond("Валентин Барко", 21 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/b/7a/a790958a24567902f624fbefcade9.png");
        UserSecond userSecond2 =  new UserSecond("Гонсало Монтьель", 28 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/4/de/e559c74ca42be82c950bd52b79e84.png");
        UserSecond userSecond3 =  new UserSecond("Лисандро Мартинес", 27 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/9/02/231ee9a9f4cc5ad59d0c10e894449.png");
        UserSecond userSecond4 =  new UserSecond("Херман Пеccелья", 34 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/d/45/630a3858346f887681d8dad5c39ed.png");
        UserSecond userSecond5 =  new UserSecond("Анхель Ди Мария", 37 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/6/36/e583fdb0943e7abe391f1fba66f06.png");
        UserSecond userSecond6 =  new UserSecond("Леандро Паредес", 31 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/d/60/ebf90ffbc4c51a9e7732538eea6fc.png");
        UserSecond userSecond7 =  new UserSecond("Валентин Кастельянос", 27 ,
                "https://photobooth.cdn.sports.ru/preset/tags/c/f0/901a4100f4041839f7da6b91158df.jpeg");
        UserSecond userSecond8 =  new UserSecond("Сантьяго Кастро", 21 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/f/7a/bc2969e4e41d297e73180b851ab5d.png");
        UserSecond userSecond9 =  new UserSecond("Хулиан Альварес", 25 ,
                "https://photobooth.cdn.sports.ru/preset/tc_person/0/9a/270ae096c4d2c80e23a340fcd7d04.png");
        /*https://i.pinimg.com/originals/cd/a1/b3/cda1b34acf75df0ce045d8d382d3ebfd.gif*/
        ArrayList<UserSecond> userSecondArrayList = new ArrayList<>();

        userSecondArrayList.add(userSecond);
        userSecondArrayList.add(userSecond1);
        userSecondArrayList.add(userSecond2);
        userSecondArrayList.add(userSecond3);
        userSecondArrayList.add(userSecond4);
        userSecondArrayList.add(userSecond5);
        userSecondArrayList.add(userSecond6);
        userSecondArrayList.add(userSecond7);
        userSecondArrayList.add(userSecond8);
        userSecondArrayList.add(userSecond9);

        UserAdapter adapter = new UserAdapter(userArrayList);

        binding.recyclerView.setAdapter(adapter);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));

        adapter.setOnItemClickListener(position -> {



            adapter.moveItemToTop(position);
            adapter.setSelectedItemPosition(0);
        });



        UserSecondAdapter adapter2 = new UserSecondAdapter(userSecondArrayList);

        binding.recyclerViewSecond.setAdapter(adapter2);

        binding.recyclerViewSecond.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));



        ImageView avatar = binding.avatarImage; // avataryi
        Glide.with(this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNN-2PJ8oU9Fe6YRTUsGPlGbLSqAQfVVDb9Q&s")
                .circleCrop()
                .into(avatar);

    }
}