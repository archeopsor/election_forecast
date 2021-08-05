package elxn.forecast;

import elxn.forecast.Poll;
import tech.tablesaw.api.Table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;


public class Data {
    private static String presidentPrimaryPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/president_primary_polls.csv";
    private static String presidentGeneralPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/president_polls.csv";
    private static String presidentApprovalPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/president_approval_polls.csv";
    private static String senatePollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/senate_polls.csv";
    private static String housePollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/house_polls.csv";
    private static String genericBallotPollsUrl = "https://projects.fivethirtyeight.com/polls-page/data/generic_ballot_polls.csv";

    private static Table getPolls(String FILE_URL) throws IOException {
        try {
            URL url = new URL(FILE_URL);
            Table dataframe = Table.read().csv(url);
            return dataframe;
        } catch (MalformedURLException e) {
            throw new IOException("Unable to download file: " + FILE_URL);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPolls(presidentPrimaryPollsUrl));
    }
}
