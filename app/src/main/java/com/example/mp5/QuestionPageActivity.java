package com.example.mp5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionPageActivity extends MainActivity {
    private int player1Points = 0;
    private int player2Points = 0;


    //Random Number Generator
    public int getRandomNumber() {
        double randomNumber = 10 * Math.random();
        int numberAsInt = (int) randomNumber;
        return numberAsInt;
    }

    //Set the number of points for player 1
    public void setPlayer1Points(int points) {
        player1Points = points;
    }

    //Get the number of points for player 1
    public int getPlayer1Points() {
        return player2Points;
    }

    //Set the number of points for player 2
    public void setPlayer2Points(int points) {
        player2Points = points;
    }

    //Get the number of points for player 2
    public int getPlayer2Points() {
        return player2Points;
    }



    public void generateRandomQuestion() {
        int rng = getRandomNumber();

        String[] randomQuestions = new String[10];
        randomQuestions[0] = "What is the definition of edema?";
        randomQuestions[1] = "What is the definition of inflammation";
        randomQuestions[2] = "What is the function of tumor necrosis factor (TNF)?";
        randomQuestions[3] = "What's the function of a toll-like receptor?";
        randomQuestions[4] = "What is platelet-activating factor?";
        randomQuestions[5] = "What is a leukotriene?";
        randomQuestions[6] = "What is the function of a prostaglandin?";
        randomQuestions[7] = "What is the function of a selectin?";
        randomQuestions[8] = "What is the function of an integrin?";
        randomQuestions[9] = "What is chemotaxis?";


        String[] questionAOptions = new String[10];

        questionAOptions[0] = "An excess of watery fluid collecting in the cavities or tissues of the body";
        questionAOptions[1] = "Condition in which part of the body becomes reddened, swollen, hot, and often painful";
        questionAOptions[2] = "One of the cytokines that make up the acute phase reaction";
        questionAOptions[3] = "Recognize structurally conserved molecules derived from microbes";
        questionAOptions[4] = "Causes platelet aggregation, inflammation, and allergic response";
        questionAOptions[5] = "Metabolite of arachidonic acid";
        questionAOptions[6] = "Inhibiting the aggregation of blood platelets";
        questionAOptions[7] = "Mediate the initial weak interactions between leukocytes and endothelium";
        questionAOptions[8] = "Firm adhesion of leukocytes to endothelium";
        questionAOptions[9] = "The movement of an organism in response to a chemical stimulus";

        String[] questionBOptions = new String[10];

        questionBOptions[0] = "A collection of white blood cells in an epithelial tissue";
        questionBOptions[1] = "The excessive accumulation of fat cells in the abdomen";
        questionBOptions[2] = "An enzyme responsible for phosphorylating ATP";
        questionBOptions[3] = "Signals for the transcription of rRNA";
        questionBOptions[4] = "Inhibits platelet formation";
        questionBOptions[5] = "Metabolite of lysine";
        questionBOptions[6] = "Causes the lysing of red blood cells";
        questionBOptions[7] = "Creates the myelin sheath around neurons";
        questionBOptions[8] = "Prevents viruses from invading the blood brain barrier";
        questionBOptions[9] = "The storage of water in connective tissue";

        String[] questionCOptions = new String[10];

        questionCOptions[0] = "The attack of antibodies against self antigens";
        questionCOptions[1] = "The generation of stem cells";
        questionCOptions[2] = "A molecule responsible for electrostatic balance across a neuron";
        questionCOptions[3] = "Acts as a ligand for antagonists";
        questionCOptions[4] = "A molecule that prevents Wilson's disease";
        questionCOptions[5] = "A molecule that is capable of self-replication";
        questionCOptions[6] = "Inhibits the transcription of selectin genes";
        questionCOptions[7] = "Amplifies the translation of integrin genes";
        questionCOptions[8] = "Inhibits the translation tRNA genes";
        questionCOptions[9] = "The formation of multiple granulomas";

        String[] questionDOptions = new String[10];

        questionDOptions[0] = "A strain of Zika virus";
        questionDOptions[1] = "The presence of an extra thoracic vertabrae";
        questionDOptions[2] = "A protein receptor that pumps out sodium ions";
        questionDOptions[3] = "A deadly bacterium that attacks the uterine lining";
        questionDOptions[4] = "A hormone responsible for female reproduction";
        questionDOptions[5] = "A byproduct of the TCA cycle";
        questionDOptions[6] = "Destroying glucose production";
        questionDOptions[7] = "Influences DNA remodeling proteins";
        questionDOptions[8] = "Prevents DNA gyrase from binding to DNA";
        questionDOptions[9] = "The taxonomic classification of molecules";

        String questionLabel = randomQuestions[rng];
        String questionAPhrase = questionAOptions[rng];
        String questionBPhrase = questionBOptions[rng];
        String questionCPhrase = questionCOptions[rng];
        String questionDPhrase = questionDOptions[rng];


        TextView setQuestionLabel = (TextView) findViewById(R.id.questionLabel);
        setQuestionLabel.setText(questionLabel);

        TextView setQuestionA = (TextView) findViewById(R.id.questionAButton);
        setQuestionA.setText(questionAPhrase);

        TextView setQuestionB = (TextView) findViewById(R.id.questionBButton);
        setQuestionB.setText(questionBPhrase);

        TextView setQuestionC = (TextView) findViewById(R.id.questionCButton);
        setQuestionC.setText(questionCPhrase);

        TextView setQuestionD = (TextView) findViewById(R.id.questionDButton);
        setQuestionD.setText(questionDPhrase);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionpage);
        generateRandomQuestion();
        configureQuestionButtons();
        TextView setPlayerNumberLabel = (TextView) findViewById(R.id.playerNumberLabel);
        String whichPlayer;
        if (getPlayer1()) {
            whichPlayer = "Player 1";
            setPlayerNumberLabel.setText(whichPlayer);
        } else {
            whichPlayer = "Player 2";
            setPlayerNumberLabel.setText(whichPlayer);
        }


    }

    public void configureQuestionButtons() {
        Button questionAButton = (Button) findViewById(R.id.questionAButton);
        final MediaPlayer right = MediaPlayer.create(this, R.raw.right);
        questionAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right.start();
                startActivity(new Intent(QuestionPageActivity.this, GamePageActivity.class));
            }
        });

        Button questionBButton = (Button) findViewById(R.id.questionBButton);
        final MediaPlayer wrong = MediaPlayer.create(this, R.raw.wrong);
        questionBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
                if (getPlayer1()) {
                    setPlayer1(false);
                } else {
                    setPlayer1(true);
                }

                startActivity(new Intent(QuestionPageActivity.this, QuestionPageActivity.class));
            }
        });

        Button questionCButton = (Button) findViewById(R.id.questionCButton);
        questionCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
                if (getPlayer1()) {
                    setPlayer1(false);
                } else {
                    setPlayer1(true);
                }

                startActivity(new Intent(QuestionPageActivity.this, QuestionPageActivity.class));
            }
        });

        Button questionDButton = (Button) findViewById(R.id.questionDButton);
        questionDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
                if (getPlayer1()) {
                    setPlayer1(false);
                } else {
                    setPlayer1(true);
                }

                startActivity(new Intent(QuestionPageActivity.this, QuestionPageActivity.class));
            }
        });
    }
}
