package elxn.forecast;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

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

    public Poll(ArrayList<String> pollData) throws ParseException {
        question_id = Integer.parseInt(pollData.get(0));
        poll_id = Integer.parseInt(pollData.get(1));
        cycle = Integer.parseInt(pollData.get(2));
        state = pollData.get(3);
        pollster_id = Integer.parseInt(pollData.get(4));
        pollster = pollData.get(5);
        sponsor_id = Integer.parseInt(pollData.get(6));
        sponsors = pollData.get(7);
        display_name = pollData.get(8);
        pollster_rating_id = Integer.parseInt(pollData.get(9));
        pollster_rating_name = pollData.get(10);
        fte_grade = pollData.get(11);
        sample_size = Integer.parseInt(pollData.get(12));
        population = pollData.get(13);
        population_full = pollData.get(14);
        methodology = pollData.get(15);
        office_type = pollData.get(16);
        seat_number = Integer.parseInt(pollData.get(17));
        seat_name = pollData.get(18);
        start_date = DateFormat.getDateInstance().parse(pollData.get(19));
        end_date = DateFormat.getDateInstance().parse(pollData.get(20));
        election_date = DateFormat.getDateInstance().parse(pollData.get(21));
        sponsor_candidate = pollData.get(22);
        internal = Boolean.parseBoolean(pollData.get(23));
        partisan = pollData.get(24);
        tracking = pollData.get(25);
        nationwide_batch = Boolean.parseBoolean(pollData.get(26));
        ranked_choice_reallocated = Boolean.parseBoolean(pollData.get(27));
        created_at = DateFormat.getDateInstance().parse(pollData.get(28));
        notes = pollData.get(29);
        url = pollData.get(30);
        stage = pollData.get(31);
        race_id = Integer.parseInt(pollData.get(32));
        answer = pollData.get(33);
        candidate_id = Integer.parseInt(pollData.get(34));
        candidate_name = pollData.get(35);
        pct = Float.parseFloat(pollData.get(36)) / 100;
    }
}
