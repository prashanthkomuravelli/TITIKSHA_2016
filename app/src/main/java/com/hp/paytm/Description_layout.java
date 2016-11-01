package com.hp.paytm;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class Description_layout extends AppCompatActivity {
    TextView Eventname;
    TextView date;
    Date dt;
    TextView organisers;
    TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_layout);
        Eventname= (TextView) findViewById(R.id.Eventname);
        date= (TextView) findViewById(R.id.Date);
        organisers= (TextView) findViewById(R.id.organisers);
        dt=new Date();
        about= (TextView) findViewById( R.id.about);
        String Event_clicked;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF064B44")));
        Intent in=getIntent();
        Event_clicked=in.getExtras().getString("EventClicked");
        Eventname.setText(Event_clicked);
        if(Event_clicked.equals("CHIMERA")){

            organisers.setText("\nSameer Sengar\n\nAnoop Singh\n\nShuvikash Patel\n\nDeepak Jha\n\nSangam Kumar");
            about.setText(" CHIMERA, the paper presentation of Titiksha’16 for all branches, aims at tapping the infinite potential of human mind to generate an Idea, which when given a proper platform, can transform into a great new discovery. This is your platform to express yourself, make your views known, explore your ideas and make the best paper presentation. We invite you to bring forth such original ideas and present it in a genuine and comprehensive way.\n" +
                    "(e.g. topic :- Data mining, Virtualization Technologies, Brain Computer Interface, Internet of things, Robotics, AutoMobile etc )\n" +
                    "Budget:- Rs1000");

        }
        else  if(Event_clicked.equals("CODEWAC")){

            organisers.setText("\n" +
                    "LAVEE SINGH : +919858816663\n" +"\n"+
                    "RAVI SHANKAR : +917298917093\n");
            about.setText(
                    "CodeWAC brings you an opportunity to unleash your coding skills. You just sit on your computer and feel the rush of adrenaline during this coding event.\n" +
                    "CodeWAC consists of two rounds .The first round will be online round and you have to solve 5-7 algorithms challenges. Duration will of 6-8 hours.The second round will be onsite round. Top 50% participants of online round will be advanced to onsite round which consists of 4-5 algorithms challenges. Duration will be of 2-3 hours.\n" +
                    "\n" +
                    "\n" +
                    "TASK\n" +
                    "\n" +
                    "\n" +
                    "Coding contest will be organized on Hackerrank. Algorithms and Problem solving skills would be tested.\n" +
                    "\n" +
                    "\n" +
                    "STRUCTURE\n" +
                    "\n" +
                    "\n" +
                    "Format: It is online programming contest.\n" +
                    "Interface: Hackerrank will be the interface.Teams will use this interface to submit their solutions and the evaluation of solution will be on the same interface.\n" +
                    "Programming Language:There is no restriction on programming language.");

        }
        else  if(Event_clicked.equals("CODEHUNT")){

            organisers.setText("\nShubham Magotra(9596952108)\n\nPaarth Guptha(959671112)");
            about.setText("Code Hunt ,the physical and mental challenge aims at solving simple C programs and running for the next one.Team with best brain and body coordination wins. Challenge open for all the branches.This challenge aims to get participation from students who fells shy to participate or feel that they are weak in code.....   \n" +
                    "\n" +
                    "Type-Team Event");

        }

        else  if(Event_clicked.equals("Skull Crack")){

            organisers.setText("\nKhushboo Gupta\n\nNidhi Nigam\n\nShruti Singh\n\nShirisha Kasarla\n\nVishaka Tyagi\n\nShreya Jain\n\nShubhi Sharma");
            about.setText("Wrap your brain around to get yourself crowned. Use your noodle to suss out the solutions of logical and mathematical problems.This event is meant for all the branches.\n" +
                    "\n" +
                    "This event consists of questions on reasoning , aptitude and mathematics. Questions will test your ability to think logically and it will start easy and get progressively harder as per the number of rounds. There will be around four to five rounds. All the interested students should participate in the group of two.\n" +
                    "An entry fee of Rs 10 will be charged from each group.");

        }
        else  if(Event_clicked.equals("EEE")){

            organisers.setText(
                    "\n" +
                    "Pratyush (08493894679)\n\n" +
                    "Ronij (09622279742)\n\n" +
                    "Shubham (09107042669)\n\n" +
                    "Nidhi Nigam(08493894675)\n\n" +
                    "Shreya Jain(08493894674)");
            about.setText("This mega event will check you in totality i.e. how well you think. It will consist of 3 rounds namely, elimination, experiments and examine. We'll check your IQ, presence of mind, experimental skills and spontaneity. It's open and free for all the streams, so everyone is welcomed.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Rules:\n" +
                    "\n" +
                    "1.First round will contain aptitude questions. Duration will be of 20-30 mins.\n" +
                    "2.Selected students will be divided into groups to perform generic experiments in the second round.\n" +
                    "3.Selected students from second round will have to play with real world problems in third round.\n" +
                    "4.Rank will be decided on the basis of marks obtained in all 3 rounds.\n" +
                    "5.Certificates are assured for the top 10 students.");

        }
        else  if(Event_clicked.equals("WEB CAMP")){

            organisers.setText("\nMadan Pandey(7298917040)\n\nRishabh Kamboj");
            about.setText("An individual coding event in which participants need to design layout for given\n" +
                    "task. The event will mainly focus on the ability of the participants to test their\n" +
                    "designing skill as quick as they can. The one who design the best layout with\n" +
                    "perfect color combination in the allotted time shall be crowned the winner. The\n" +
                    "coding should be done in Html Css Bootstrap Javascript or any other web\n" +
                    "framework and finally push those code in github.");

        }
        else  if(Event_clicked.equals("SLOWMO")){

            organisers.setText("");
            about.setText("slow cycle racing only\n");

        }
        else  if(Event_clicked.equals("sling shot")){

            organisers.setText("Manish Kumar Singh\nSaket Kumar\nAvnish Rajput\nAmit Kumar Saw\nNarendra Babu");

        }
        else  if(Event_clicked.equals("let it rip")){

            organisers.setText("Rahul Sharma");

        }
        else  if(Event_clicked.equals("bridge builder")){

            organisers.setText("Manish Kumar Singh,Danish,Harshit,Utkarsh Singh");

        }
        else  if(Event_clicked.equals("udaan")){

            organisers.setText("");

        }
        else  if(Event_clicked.equals("excellency in cad cam")){

            organisers.setText("Jigiasu Kumar,Ajit Kumar,Abhishek Kumar,Manish Kumar");

        }
        else  if(Event_clicked.equals("robo war")){

            organisers.setText("");

        }
        else  if(Event_clicked.equals("robo disarmer")){

            organisers.setText("");

        }
        else  if(Event_clicked.equals("auto messing")){

            organisers.setText("");

        }
        else  if(Event_clicked.equals("Brain Storm")){

            organisers.setText("\nAVINASH SHARAN MISHRA(14BEC018)\n" +
                    "\n" +
                    "MANISH (14BEC028)\n" +
                    "\n" +
                    "ABHIJEET KUMAR (14BEC002)\n" +
                    "\n" +
                    "CHANCHAL KUMAR (14BEC019)\n" +
                    "\n" +
                    "CHANDAN MAURYA (14BEC020)");
            about.setText("CONTENTS:-\n" +
                    "\n" +
                    "1. IT IS A QUIZ COMPITITION &amp; CONTAINS THREE ROUND.\n" +
                    "\n" +
                    "2. QUIZ IS BASED ON ELECTRONICS DEVICES &amp; IT’S APPLICATIONS AND REASONING.\n" +
                    "\n" +
                    "3. OPEN FOR ALL &amp; GROUP OF TWO MEMBER AS A TEAM CAN BE PARTICIPATE.\n" +
                    "\n" +
                    "DESCRIPTION:-\n" +
                    "\n" +
                    "FIRST ROUND\n" +
                    "\n" +
                    "o IT IS A GENERAL PEN PAPER ROUND &amp; MAXIMUM TIME IS 10 MINUTES.\n" +
                    "\n" +
                    "o IT CONTAINS OBJECTIVE TYPE QUESTIONS(20 QUESTIONS).\n" +
                    "\n" +
                    "o PARTICIPANTS WILL GET +3 MARKS FOR EACH CORRECT ANSWER &amp; -1\n" +
                    "\n" +
                    "MARK FOR AN INCORRECT ANSWER.\n" +
                    "\n" +
                    "o QUESTIONS WILL BE BASED ON BASIC ELECTRONICS,APTITUDE &amp; REASONING.\n" +
                    "\n" +
                    "o TOP 7 TEAMS WILL BE SELECTED FOR NEXT ROUND.\n" +
                    "\n" +
                    "SECOND ROUND\n" +
                    "\n" +
                    "o IT IS DIAGRAM BASED ROUND &amp; MAXIMUM TIME IS 5 MINUTES.\n" +
                    "\n" +
                    "o IT CONTAINS 2 QUESTION (10 MARKS EACH).\n" +
                    "\n" +
                    "o TOP 5 TEAMS WILL BE SELECTED FOR LAST ROUND.\n" +
                    "\n" +
                    "FINAL ROUND\n" +
                    "\n" +
                    "o IT WILL BE A TECH ROUND AND QUESTIONS WILL BE MAINLY FROM NEW\n" +
                    "\n" +
                    "DEVELOPMENTS IN THE FIELD OF ECE.\n" +
                    "\n" +
                    "o IT ALSO CONTAINS TWO QUESTIONS (10 MARKS EACH).\n" +
                    "\n" +
                    "NOTE :-\n" +
                    "\n" +
                    "o THE WINNERS WILL BE CHOSEN ON THE BASIS OF MARKS OBTAINED IN ALL THE THREE\n" +
                    "\n" +
                    "ROUNDS MENTIONED ABOVE.\n" +
                    "\n" +
                    "o IF IN CASE THERE IS TIE ,THEN SOME TIE BREAKER QUESTIONS WILL BE ASKED IN ORAL\n" +
                    "\n" +
                    "FORMAT,AND THEN FINAL POSITIONS WILL BE DECIDED ACCORDINGLY.");

        }
        else  if(Event_clicked.equals("Elcovision")){

            organisers.setText("\nNidhi Verma\n\nShobhana srivastava\n\nJyoti Rai\n\nAnkita Gupta");
            about.setText("only for 1 st year and 2 nd year students\n" +
                    "\n" +
                    "Totally based on electronics.\n" +
                    "\n" +
                    "ROUND-1:\n" +
                    "\n" +
                    "1] We will present 4 circuits at a time with their proper name witten below it for 30\n" +
                    "\n" +
                    "sec{time may exceed to 40 sec}\n" +
                    "\n" +
                    "2]We will give name of components to the participants and ask the circuit in which it was\n" +
                    "\n" +
                    "present{they can either write the name or number of the circuit}.\n" +
                    "\n" +
                    "3]We will finalise top 5 participants on the basis of their right answer.\n" +
                    "\n" +
                    "NOTE- A PEN AND A BLANK PAPER WILL BE PROVIDED TO THE\n" +
                    "\n" +
                    "PARTICIPANTS FOR DRAWING THE CIRCUIT(IF THEY WANT) WITHIN TIME\n" +
                    "\n" +
                    "LIMIT AND ALSO FOR WRITING THE ANSWER.\n" +
                    "\n" +
                    "ROUND-2\n" +
                    "\n" +
                    "1] 5 basic questions will be asked from the selected participants from round 1.Questions\n" +
                    "\n" +
                    "will be based on basic electronics.\n" +
                    "\n" +
                    "2]1 st,2 nd ,3 rd rankers will be decided on the answers.\n");

        }
        else  if(Event_clicked.equals("Electromania")){

            organisers.setText("\nAbhilasha verma[14bec003]\n" +
                    "\n" +
                    "Mansha Bhandari[14bec029]\n" +
                    "\n" +
                    "Akshita Sharma[14bec010]\n" +
                    "\n" +
                    "Aparna dhar[14bec016]\n" +
                    "\n" +
                    "Nishu rana[14bec037]\n" +
                    "\n" +
                    "Ritika patidar[14bec046]\n" +
                    "\n" +
                    "Sunakshi Sharma[14bec056]");
            about.setText("TASK:\n" +
                    "\n" +
                    "Every group will be given a couple of riddles.\n" +
                    "\n" +
                    "Contents:\n" +
                    "\n" +
                    "This event contains only 10 groups, each having minimum 2 students and max 3 students.\n" +
                    "\n" +
                    "Event will be divided into 2 stages.\n" +
                    "\n" +
                    "First stage:\n" +
                    "\n" +
                    "Each group will be given a couple of riddles to solve. The solution of the riddles will the output of the\n" +
                    "\n" +
                    "circuit which they have to make.\n" +
                    "\n" +
                    "Second stage :\n" +
                    "\n" +
                    "Ones who will solve the riddles will be go to second stage only 3 groups will be there in second stage. In\n" +
                    "\n" +
                    "this, they have to design the ckt whose output will be solution of one of the riddles.this task has to be\n" +
                    "\n" +
                    "done on bread board.\n" +
                    "\n" +
                    "Rules:\n" +
                    "\n" +
                    "1. Every round is a timer round.\n" +
                    "\n" +
                    "2. The completion of your task will be considered if and only if your ckt is working properly.\n" +
                    "\n" +
                    "3. Total 10 team will participate. Out of these only 3 teams will go in 2 nd round.");

        }
        else  if(Event_clicked.equals("Play with Arduino")){

            organisers.setText("\nRakesh kumar (14bec041)\n" +
                    "\n" +
                    "Shubham kumar (14bec052)");
            about.setText("Contents:-\n" +
                    "\n" +
                    "This event contains only 20 groups, each having 3 students.\n" +
                    "\n" +
                    "Event will be divided into three different stages.\n" +
                    "\n" +
                    "First stage:\n" +
                    "\n" +
                    "It is a Quiz round having 20 questions which has to be solve in 10 min’s. This Quiz consist of basic\n" +
                    "\n" +
                    "knowledge about Arduino board and its shields. Those who are clear first stage will be sent to next\n" +
                    "\n" +
                    "stage.\n" +
                    "\n" +
                    "Second stage:\n" +
                    "\n" +
                    "This is a timer round, First 6 group who complete the task in minimum time will be promoted for the\n" +
                    "\n" +
                    "final round. The Task will be given at that time.\n" +
                    "\n" +
                    "Third stage:\n" +
                    "\n" +
                    "This is the final stage where each group has to solve their final problem by making their own codes to\n" +
                    "\n" +
                    "complete the task and assemble the connections on bread board.\n" +
                    "\n" +
                    "Rules:\n" +
                    "\n" +
                    "1) Every round is a timer round, so each group act fastly.\n" +
                    "\n" +
                    "2) Each group should keep knowledge about Arduino kit and its software Arduino IDE .\n" +
                    "\n" +
                    "3) If any group lost their components, the team will be disqualified.\n" +
                    "\n" +
                    "4) The completion of your task will be considered if and only if your circuit is working properly.\n" +
                    "\n" +
                    "5) In First stage 4 group will be eliminated and in second stage 2 group will be eliminated (it may be vary\n" +
                    "\n" +
                    "according to the participations ).");

        }
        else  if(Event_clicked.equals("Play With Circuits")){

            organisers.setText("\nABHISHEK KUMAR SINHA (14BEC006)\n" +
                    "\n" +
                    "ROSHAN KUMAR YADAV (14BEC048)\n" +
                    "\n" +
                    "VIVEK KUMAR (14BEC060)");
            about.setText("TASK:\n" +
                    "\n" +
                    "There are three rounds in this contest Participants have to complete the task\n" +
                    "\n" +
                    "given to qualify for the next round.\n" +
                    "\n" +
                    "CONTENTS:\n" +
                    "\n" +
                    "Event will be performed in THREE ROUNDS\n" +
                    "\n" +
                    "FIRST ROUND:\n" +
                    "\n" +
                    "We will show a simple circuit for a fraction of time with the help of projector\n" +
                    "\n" +
                    "and each group will require to draw the same circuit on paper, in a given time\n" +
                    "\n" +
                    "limit.\n" +
                    "\n" +
                    "SECOND ROUND:\n" +
                    "\n" +
                    "The selected participants in the first round will be paired in a group. Every\n" +
                    "\n" +
                    "group will require to make the given circuit with the help of available\n" +
                    "\n" +
                    "hardware, and have to find out the proper output.\n" +
                    "\n" +
                    "FINAL ROUND:\n" +
                    "\n" +
                    "Selected group will require to draw the given circuit, and to show the proper\n" +
                    "\n" +
                    "output on MULTISIM software.\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Every round will be time limited.\n" +
                    "\n" +
                    "2. If any group is not familiar with MULTISIM then a team will be there to\n" +
                    "\n" +
                    "brief them.");

        }
        else  if(Event_clicked.equals("Technojam")){

            organisers.setText("\nAastha Gupta(14bec001)\n" +
                    "\n" +
                    "Jhanvi Katoch(14bec025)\n" +
                    "\n" +
                    "Khushboo Zulfi(14bec026)\n" +
                    "\n" +
                    "Nishu Damral(14bec036)\n" +
                    "\n" +
                    "Ridham Satti(14bec043)");
            about.setText("This is a technical event in which the participants should have basic knowledge\n" +
                    "\n" +
                    "about electronics components. It will be conducted in two rounds/levels.\n" +
                    "\n" +
                    "Round-1:\n" +
                    "\n" +
                    "The participants will be given a crossword to be solved on some technical words\n" +
                    "\n" +
                    "used in electronics and communication subject particularly. The participants who\n" +
                    "\n" +
                    "qualify this round will be promoted to the next round.\n" +
                    "\n" +
                    "Round-2:\n" +
                    "\n" +
                    "The qualified participants will now be given a clue for finding the components\n" +
                    "\n" +
                    "which will be required to make a final circuit. The one with complete working\n" +
                    "\n" +
                    "circuit or maximum no. of components collected wins the event.\n" +
                    "\n" +
                    "Rule And Regulations:\n" +
                    "\n" +
                    "\uF0B7 Maximum 3 participants per team.\n" +
                    "\n" +
                    "\uF0B7 There will be only 15 teams participating in the event.\n" +
                    "\n" +
                    "\uF0B7 Every round will be a timer round.\n" +
                    "\n" +
                    "\uF0B7 The teams finding maximum words in the least time will be qualified for the\n" +
                    "\n" +
                    "2 nd round.\n" +
                    "\n" +
                    "\uF0B7 Only 4 teams will be qualified for the 2 nd round.");

        }
        else  if(Event_clicked.equals("Rubic's Cube")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("cool skull")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Innoversity")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Robbo Soccer")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Wrist Race")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Streax")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Quiz")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Biobiz")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Game of Clones")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Wonderland")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Unscramble")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Forensics")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("Brooding Mind")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("PHYSICS OLYMPIAD")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("mathematics olympiad")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("lab work")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("jo jeeta wahi sikandar")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("marketing event")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("panel discussion")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("sharetech")){

            organisers.setText("");
            about.setText("");

        }
        else  if(Event_clicked.equals("board dat")){

            organisers.setText("");
            about.setText("");


        }
        else  if(Event_clicked.equals("water fight")){

            organisers.setText("");
            about.setText("");

        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
