package VeckoUppgiftV3;

public class SpellingGame {

    int score = 0;

    int getScore () {
        return score;
    }

        void checkWord(String userAnswer, String correctWord) {

            if (userAnswer.equals(correctWord)) {
                score++;
            }
        }
}
