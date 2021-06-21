package com.example.myfirstapp;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bts;
    Button bt_sq1;
    Button bt_sq2;
    Button bt_sq3;
    Button bt_sq4;
    Button b_status;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp1 = MediaPlayer.create(this,R.raw.cow_sound);
        MediaPlayer mp2 = MediaPlayer.create(this,R.raw.duck_sound);
        MediaPlayer mp3 = MediaPlayer.create(this,R.raw.horse_sound);
        MediaPlayer mp4 = MediaPlayer.create(this,R.raw.lamb_sound);
        MediaPlayer mp5 = MediaPlayer.create(this,R.raw.pig_sound);
        MediaPlayer mp6 = MediaPlayer.create(this,R.raw.rooster_sound);

        // Buttons
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button4);
        bt3 = (Button) findViewById(R.id.button2);
        bt4 = (Button) findViewById(R.id.button);
        bt5 = (Button) findViewById(R.id.button7);
        bt6 = (Button) findViewById(R.id.button8);
        bts = (Button) findViewById(R.id.button_start);
        b_status = (Button) findViewById(R.id.status_button);


        // Button Start
        bts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setBackgroundColor(Color.parseColor("#6200EE"));
                bt2.setBackgroundColor(Color.parseColor("#6200EE"));
                bt3.setBackgroundColor(Color.parseColor("#6200EE"));
                bt4.setBackgroundColor(Color.parseColor("#6200EE"));
                bt5.setBackgroundColor(Color.parseColor("#6200EE"));
                bt6.setBackgroundColor(Color.parseColor("#6200EE"));
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                boolean finished = false;
                Random rand = new Random();
                int[] arr = new int[4];
                for (int j = 0; j < 4; ++j) {
                    int randomNum = rand.nextInt((6 - 1) + 1) + 1;
                    arr[j] = randomNum;
                }
                // First Button of sequence
                if(arr[0] == 1) {
                    bt_sq1 = bt1;
                }
                if(arr[0] == 2) {
                    bt_sq1 = bt2;
                }
                if(arr[0] == 3) {
                    bt_sq1 = bt3;
                }
                if(arr[0] == 4) {
                    bt_sq1 = bt4;
                }
                if(arr[0] == 5) {
                    bt_sq1 = bt5;
                }
                if(arr[0] == 6) {
                    bt_sq1 = bt6;
                }

                // Second Button of sequence
                if(arr[1] == 1) {
                    bt_sq2 = bt1;
                }
                if(arr[1] == 2) {
                    bt_sq2 = bt2;
                }
                if(arr[1] == 3) {
                    bt_sq2 = bt3;
                }
                if(arr[1] == 4) {
                    bt_sq2 = bt4;
                }
                if(arr[1] == 5) {
                    bt_sq2 = bt5;
                }
                if(arr[1] == 6) {
                    bt_sq2 = bt6;
                }

                // Third Button of sequence
                if(arr[2] == 1) {
                    bt_sq3 = bt1;
                }
                if(arr[2] == 2) {
                    bt_sq3 = bt2;
                }
                if(arr[2] == 3) {
                    bt_sq3 = bt3;
                }
                if(arr[2] == 4) {
                    bt_sq3 = bt4;
                }
                if(arr[2] == 5) {
                    bt_sq3 = bt5;
                }
                if(arr[2] == 6) {
                    bt_sq3 = bt6;
                }

                // Fourth Button of sequence
                if(arr[3] == 1) {
                    bt_sq4 = bt1;
                }
                if(arr[3] == 2) {
                    bt_sq4 = bt2;
                }
                if(arr[3] == 3) {
                    bt_sq4 = bt3;
                }
                if(arr[3] == 4) {
                    bt_sq4 = bt4;
                }
                if(arr[3] == 5) {
                    bt_sq4 = bt5;
                }
                if(arr[3] == 6) {
                    bt_sq4 = bt6;
                }

                // Showing sequence of buttons
                while (!finished) {
                    // User can not touch buttons during sequence
                    bt1.setClickable(false);
                    bt2.setClickable(false);
                    bt3.setClickable(false);
                    bt4.setClickable(false);
                    bt5.setClickable(false);
                    bt6.setClickable(false);
                    bts.setClickable(false);
                    b_status.setClickable(false);
                    bt_sq1.setClickable(false);
                    bt_sq2.setClickable(false);
                    bt_sq3.setClickable(false);
                    bt_sq4.setClickable(false);

                    // Showing colors on buttons with 2 sec between each of the colors.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq1.setBackgroundColor(Color.parseColor("#CDEFFE"));
                        }
                    }, 1000);
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq1.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                    }, 3000);

                    // Change Button
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq2.setBackgroundColor(Color.parseColor("#CDEFFE"));
                        }
                    }, 4000);
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq2.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                    }, 6000);

                    // Change Button
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq3.setBackgroundColor(Color.parseColor("#CDEFFE"));
                        }
                    }, 7000);
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq3.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                    }, 9000);

                    // Change Button
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq4.setBackgroundColor(Color.parseColor("#CDEFFE"));
                        }
                    }, 10000);
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(false);
                            bt2.setClickable(false);
                            bt3.setClickable(false);
                            bt4.setClickable(false);
                            bt5.setClickable(false);
                            bt6.setClickable(false);
                            bts.setClickable(false);
                            bt_sq1.setClickable(false);
                            bt_sq2.setClickable(false);
                            bt_sq3.setClickable(false);
                            bt_sq4.setClickable(false);
                            bt_sq4.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                    }, 12000);


                    // When sequence finished, user can now touch buttons.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            bt1.setClickable(true);
                            bt2.setClickable(true);
                            bt3.setClickable(true);
                            bt4.setClickable(true);
                            bt6.setClickable(true);
                            bt5.setClickable(true);
                            bts.setClickable(true);
                            bt_sq1.setClickable(true);
                            bt_sq2.setClickable(true);
                            bt_sq3.setClickable(true);
                            bt_sq4.setClickable(true);
                        }
                    }, 12300);
                finished = true;
                }

                // Sequence detector.
                final int[] sequence = {0};
                final boolean[] sequence_bool = {true};

                // Button 1
                final boolean[] next = {false};
                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(sequence[0] > 3){
                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                        else if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                        else {
                            sequence_bool[0] = false;
                            if (arr[0] == 1) {
                                if (sequence[0] == 0) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[1] == 1) {
                                if (sequence[0] == 1) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[2] == 1) {
                                if (sequence[0] == 2) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[3] == 1) {
                                if (sequence[0] == 3) {
                                    b_status.setBackgroundColor(Color.parseColor("#008000"));
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                        }
                        mp1.start();
                        if (!next[0]) {
                            bt1.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            next[0] = true;
                        } else {
                            bt1.setBackgroundColor(Color.parseColor("#6200EE"));
                            next[0] = false;
                        }

                    }
                });

                // Button 2
                final boolean[] next2 = {false};
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(sequence[0] > 3){
                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                        else if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                        else {
                            sequence_bool[0] = false;
                            if (arr[0] == 2) {
                                if (sequence[0] == 0) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[1] == 2) {
                                if (sequence[0] == 1) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[2] == 2) {
                                if (sequence[0] == 2) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[3] == 2) {
                                if (sequence[0] == 3) {
                                    b_status.setBackgroundColor(Color.parseColor("#008000"));
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                        }
                        mp2.start();
                        if (!next2[0]) {
                            bt2.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            next2[0] = true;
                        } else {
                            bt2.setBackgroundColor(Color.parseColor("#6200EE"));
                            next2[0] = false;
                        }

                    }
                });

                // Button 3
                final boolean[] next3 = {false};
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(sequence[0] > 3){
                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                        else if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                        else {
                            sequence_bool[0] = false;
                            if (arr[0] == 3) {
                                if (sequence[0] == 0) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[1] == 3) {
                                if (sequence[0] == 1) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[2] == 3) {
                                if (sequence[0] == 2) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[3] == 3) {
                                if (sequence[0] == 3) {
                                    b_status.setBackgroundColor(Color.parseColor("#008000"));
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                        }
                        mp3.start();
                        if (!next3[0]) {
                            bt3.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            next3[0] = true;
                        } else {
                            bt3.setBackgroundColor(Color.parseColor("#6200EE"));
                            next3[0] = false;
                        }

                    }
                });
                // Button 4
                final boolean[] next4 = {false};
                bt4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(sequence[0] > 3){
                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                        else if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                        else {
                            sequence_bool[0] = false;
                            if (arr[0] == 4) {
                                if (sequence[0] == 0) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[1] == 4) {
                                if (sequence[0] == 1) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[2] == 4) {
                                if (sequence[0] == 2) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[3] == 4) {
                                if (sequence[0] == 3) {
                                    b_status.setBackgroundColor(Color.parseColor("#008000"));
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                        }
                        mp4.start();
                        if (!next4[0]) {
                            bt4.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            next4[0] = true;
                        } else {
                            bt4.setBackgroundColor(Color.parseColor("#6200EE"));
                            next4[0] = false;
                        }

                    }
                });
                // Button 5
                final boolean[] next5 = {false};
                bt5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(sequence[0] > 3){
                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                        else if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                        else {
                            sequence_bool[0] = false;
                            if (arr[0] == 5) {
                                if (sequence[0] == 0) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[1] == 5) {
                                if (sequence[0] == 1) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[2] == 5) {
                                if (sequence[0] == 2) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[3] == 5) {
                                if (sequence[0] == 3) {
                                    b_status.setBackgroundColor(Color.parseColor("#008000"));
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                        }
                        mp5.start();
                        if (!next5[0]) {
                            bt5.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            next5[0] = true;
                        } else {
                            bt5.setBackgroundColor(Color.parseColor("#6200EE"));
                            next5[0] = false;
                        }

                    }
                });
                // Button 6
                final boolean[] next6 = {false};
                bt6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(sequence[0] > 3){
                            b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                        }
                        else if (!sequence_bool[0]){
                            b_status.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                        else {
                            sequence_bool[0] = false;
                            if (arr[0] == 6) {
                                if (sequence[0] == 0) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[1] == 6) {
                                if (sequence[0] == 1) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[2] == 6) {
                                if (sequence[0] == 2) {
                                    sequence_bool[0] = true;
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                            if (arr[3] == 6) {
                                if (sequence[0] == 3) {
                                    b_status.setBackgroundColor(Color.parseColor("#008000"));
                                    sequence[0] = sequence[0] + 1;
                                }
                            }
                        }
                        mp6.start();
                        if (!next6[0]) {
                            bt6.setBackgroundColor(Color.parseColor("#CDEFFE"));
                            next6[0] = true;
                        } else {
                            bt6.setBackgroundColor(Color.parseColor("#6200EE"));
                            next6[0] = false;
                        }

                    }
                });
        }
        });


        // Previous lab logic, buttons
        // Button 1
        final boolean[] next = {false};
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                mp1.start();
                if (!next[0]) {
                    bt1.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next[0] = true;
                } else {
                    bt1.setBackgroundColor(Color.parseColor("#6200EE"));
                    next[0] = false;
                }

            }
        });

        // Button 2
        final boolean[] next2 = {false};
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                mp2.start();
                if (!next2[0]) {
                    bt2.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next2[0] = true;
                } else {
                    bt2.setBackgroundColor(Color.parseColor("#6200EE"));
                    next2[0] = false;
                }

            }
        });

        // Button 3
        final boolean[] next3 = {false};
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                mp3.start();
                if (!next3[0]) {
                    bt3.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next3[0] = true;
                } else {
                    bt3.setBackgroundColor(Color.parseColor("#6200EE"));
                    next3[0] = false;
                }

            }
        });

        // Button 4
        final boolean[] next4 = {false};
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                mp4.start();
                if (!next4[0]) {
                    bt4.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next4[0] = true;
                } else {
                    bt4.setBackgroundColor(Color.parseColor("#6200EE"));
                    next4[0] = false;
                }

            }
        });

        // Button 5
        final boolean[] next5 = {false};
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                mp5.start();
                if (!next5[0]) {
                    bt5.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next5[0] = true;
                } else {
                    bt5.setBackgroundColor(Color.parseColor("#6200EE"));
                    next5[0] = false;
                }

            }
        });

        // Button 6
        final boolean[] next6 = {false};
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_status.setBackgroundColor(Color.parseColor("#6200EE"));
                mp6.start();
                if (!next6[0]) {
                    bt6.setBackgroundColor(Color.parseColor("#CDEFFE"));
                    next6[0] = true;
                } else {
                    bt6.setBackgroundColor(Color.parseColor("#6200EE"));
                    next6[0] = false;
                }

            }
        });
    }}
