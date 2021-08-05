package elxn.forecast;

import elxn.forecast.Poll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class Data {
    private static final String presidentPrimaryPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/president_primary_polls.csv";
    private static final String presidentGeneralPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/president_polls.csv";
    private static final String presidentApprovalPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/president_approval_polls.csv";
    private static final String senatePollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/senate_polls.csv";
    private static final String housePollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/house_polls.csv";
    private static final String genericBallotPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/generic_ballot_polls.csv";

    private static void getPolls(String FILE_URL) throws IOException {
        try {
            URL url = new URL(FILE_URL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch (MalformedURLException e) {
            throw new IOException("Unable to download file: " + FILE_URL);
        }
    }

    public static void main(String[] args) throws IOException {
        getPolls(presidentPrimaryPollsUrl);
    }
}
