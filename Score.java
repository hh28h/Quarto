import java.io.*;

public class Score {
    int user 
    String score = userWin + " - " + computerWin;
    public void saveScore() throws FileNotFoundException {
  
        try {
            BufferedWriter writer = new BufferedWriter("score.txt");
            writer.write("QUARTO!\nYour scores are stored here.\nUser vs. Computer\n");
            writer.append("\n" + score);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}