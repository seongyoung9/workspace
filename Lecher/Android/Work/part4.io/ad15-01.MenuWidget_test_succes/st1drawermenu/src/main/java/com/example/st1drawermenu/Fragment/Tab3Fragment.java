package com.example.st1drawermenu.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.st1drawermenu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3Fragment extends Fragment {


    private ImageButton imagebtnBa1 = null;
    private ImageButton imagebtnBa2 = null;
    private ImageButton imagebtnBa3 = null;
    private ImageButton imagebtnBa4 = null;
    private ImageButton imagebtnBa5 = null;
    private ImageButton imagebtnBa6 = null;
    private ImageButton imagebtnBa7 = null;


    public Tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        imagebtnBa1 = view.findViewById(R.id.imagebtnBa1);
        imagebtnBa2 = view.findViewById(R.id.imagebtnBa2);
        imagebtnBa3 = view.findViewById(R.id.imagebtnBa3);
        imagebtnBa4 = view.findViewById(R.id.imagebtnBa4);
        imagebtnBa5 = view.findViewById(R.id.imagebtnBa5);
        imagebtnBa6 = view.findViewById(R.id.imagebtnBa6);
        imagebtnBa7 = view.findViewById(R.id.imagebtnBa7);


        imagebtnBa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "기브커피몰로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.givecoffeemall.com"));
                startActivity(i);
            }
        });


        imagebtnBa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "구글로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });


        imagebtnBa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "네이버로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(i);
            }
        });


        imagebtnBa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "유튜브로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
                startActivity(i);
            }
        });


        imagebtnBa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "갤러리 사진파일로 이동합니다.", Toast.LENGTH_SHORT).show();
                String url = "content://media/internal/images/media";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


        imagebtnBa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "응급전화 119로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel://119"));
                startActivity(i);
            }
        });


        imagebtnBa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "카카오로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kakaocorp.com"));
                startActivity(i);
            }
        });


        return view;
    }


}




