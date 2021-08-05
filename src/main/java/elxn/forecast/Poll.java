package elxn.forecast;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.text.DateFormat;
import java.text.ParseException;

// This is useless for now because of tablesaw 

public class Poll {

    Integer question_id;
    Integer poll_id;
    Integer cycle;
    String state;
    Integer pollster_id;
    String pollster;
    Integer sponsor_id;
    String sponsors;
    String display_name;
    Integer pollster_rating_id;
    String pollster_rating_name;
    String fte_grade;
    Integer sample_size;
    String population;
    String population_full;
    String methodology;
    String office_type;
    Integer seat_number;
    String seat_name;
    Date start_date;
    Date end_date;
    Date election_date;
    String sponsor_candidate;
    Boolean internal;
    String partisan;
    String tracking; // Bool?
    Boolean nationwide_batch;
    Boolean ranked_choice_reallocated;
    Date created_at;
    String notes;
    String url;
    String stage;
    Integer race_id;
    String answer;
    Integer candidate_id;
    String candidate_name;
    String candidate_party;
    Float pct;

    public Poll(String[] header, String[] pollData) throws ParseException {
        // Map with array index as key, and the relevant column as value
        // Since not all csv files from 538 have the same order of columns
        HashMap<Integer, String> columnMap = new HashMap<Integer, String>();
        for (int i = 0; i < header.length; i++) {
            columnMap.put(i, header[i]);
        }
        
        for (int i = 0; i < pollData.length; i++) {
            // Get rid of empty values in poll data
            if (pollData[i].isBlank()) {
                pollData[i] = "0";
            }

            // Set poll values
            // I don't know a better way to do this
            String col = columnMap.get(i);
            if (col.equals("question_id")) {
                question_id = Integer.parseInt(pollData[0]);
            }
            if (col.equals("poll_id")) {
                poll_id = Integer.parseInt(pollData[1]);
            }
            if (col.equals("cycle")) {
                cycle = Integer.parseInt(pollData[2]);
            }
            if (col.equals("state")) {
                state = pollData[3];
            }
            if (col.equals("pollster_id")) {
                pollster_id = Integer.parseInt(pollData[4]);
            }
            if (col.equals("pollster")) {
                pollster = pollData[5];
            }
            if (col.equals("sponsor_id")) {
                sponsor_id = Integer.parseInt(pollData[6]);
            }
            if (col.equals("sponsors")) {
                sponsors = pollData[7];
            }
            if (col.equals("display_name")) {
                display_name = pollData[8];
            }
            if (col.equals("question_id")) {
                pollster_rating_id = Integer.parseInt(pollData[9]);
            }
            if (col.equals("question_id")) {
                pollster_rating_name = pollData[10];
            }
            if (col.equals("question_id")) {
                fte_grade = pollData[11];
            }
            if (col.equals("question_id")) {
                sample_size = Integer.parseInt(pollData[12]);
            }
            if (col.equals("question_id")) {
                population = pollData[13];
            }
            if (col.equals("question_id")) {
                population_full = pollData[14];
            }
            if (col.equals("question_id")) {
                methodology = pollData[15];
            }
            if (col.equals("question_id")) {
                office_type = pollData[16];
            }
            if (col.equals("question_id")) {
                seat_number = Integer.parseInt(pollData[17]);
            }
            if (col.equals("question_id")) {
                seat_name = pollData[18];
            }
            if (col.equals("question_id")) {
                start_date = DateFormat.getDateInstance().parse(pollData[19]);
            }
            if (col.equals("question_id")) {
                end_date = DateFormat.getDateInstance().parse(pollData[20]);
            }
            if (col.equals("question_id")) {
                election_date = DateFormat.getDateInstance().parse(pollData[21]);
            }
            if (col.equals("question_id")) {
                sponsor_candidate = pollData[22];
            }
            if (col.equals("question_id")) {
                internal = Boolean.parseBoolean(pollData[23]);
            }
            if (col.equals("question_id")) {
                partisan = pollData[24];
            }
            if (col.equals("question_id")) {
                tracking = pollData[25];
            }
            if (col.equals("question_id")) {
                nationwide_batch = Boolean.parseBoolean(pollData[26]);
            }
            if (col.equals("question_id")) {
                ranked_choice_reallocated = Boolean.parseBoolean(pollData[27]);
            }
            if (col.equals("question_id")) {
                created_at = DateFormat.getDateInstance().parse(pollData[28]);
            }
            if (col.equals("question_id")) {
                notes = pollData[29];
            }
            if (col.equals("question_id")) {
                url = pollData[30];
            }
            if (col.equals("question_id")) {
                stage = pollData[31];
            }
            if (col.equals("question_id")) {
                race_id = Integer.parseInt(pollData[32]);
            }
            if (col.equals("question_id")) {
                answer = pollData[33];
            }
            if (col.equals("question_id")) {
                candidate_id = Integer.parseInt(pollData[34]);
            }
            if (col.equals("question_id")) {
                candidate_name = pollData[35];
            }
            if (col.equals("question_id")) {
                pct = Float.parseFloat(pollData[36]) / 100;
            }
        }
    }
}
