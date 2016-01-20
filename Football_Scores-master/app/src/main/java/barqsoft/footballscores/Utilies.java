package barqsoft.footballscores;

import android.content.Context;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilies {
    // @den update codes
    // codes need to be updated every year, better use api for retrieve actual team codes from server
    public static final int SERIE_A = 401; //357;
    public static final int PREMIER_LEGAUE = 398; //354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 399; //358;
    public static final int BUNDESLIGA1 = 394; //351;
    public static final int BUNDESLIGA2 = 395; //351;

    public static String getLeague(Context contex, int league_num) {
        switch (league_num) {
            case SERIE_A:
                //return "Seria A";
                return contex.getString(R.string.seriaa);
            case PREMIER_LEGAUE:
                //"Premier League";
                return contex.getString(R.string.premierleague);
            case CHAMPIONS_LEAGUE:
                //return "UEFA Champions League";
                return contex.getString(R.string.champions_league);
            case PRIMERA_DIVISION:
                //return "Primera Division";
                return contex.getString(R.string.primeradivison);
            case BUNDESLIGA1:
                //return "1. Bundesliga";
                return contex.getString(R.string.bundesliga1);
            case BUNDESLIGA2:
                //return "2. Bundesliga";
                return contex.getString(R.string.bundesliga2);
            default:
                //return "Not known League Please report";
                return contex.getString(R.string.not_known_league);
        }
    }

    public static String getMatchDay(Context context, int match_day, int league_num) {
        if (league_num == CHAMPIONS_LEAGUE) {
            if (match_day <= 6) {
                //return "Group Stages, Matchday : 6";
                return context.getString(R.string.group_stage_text) + ", " + context.getString(R.string.matchday_text) + ": 6";
            } else if (match_day == 7 || match_day == 8) {
                //return "First Knockout round";
                return context.getString(R.string.first_knockout_round);
            } else if (match_day == 9 || match_day == 10) {
                //return "QuarterFinal";
                return context.getString(R.string.quarter_final);
            } else if (match_day == 11 || match_day == 12) {
                //return "SemiFinal";
                return context.getString(R.string.semi_final);
            } else {
                //return "Final";
                return context.getString(R.string.final_text);
            }
        } else {
            //return "Matchday : " + String.valueOf(match_day);
            return context.getString(R.string.matchday_text) + ": " + String.valueOf(match_day);
        }
    }

    public static String getScores(int home_goals, int awaygoals) {
        if (home_goals < 0 || awaygoals < 0) {
            return " - ";
        } else {
            return String.valueOf(home_goals) + " - " + String.valueOf(awaygoals);
        }
    }

    public static int getTeamCrestByTeamName(String teamname) {
        if (teamname == null) {
            return R.drawable.no_icon;
        }
        switch (teamname) { //This is the set of icons that are currently in the app. Feel free to find and add more
            //as you go.
            case "Arsenal London FC":
                return R.drawable.arsenal;
            case "Manchester United FC":
                return R.drawable.manchester_united;
            case "Swansea City":
                return R.drawable.swansea_city_afc;
            case "Leicester City":
                return R.drawable.leicester_city_fc_hd_logo;
            case "Everton FC":
                return R.drawable.everton_fc_logo1;
            case "West Ham United FC":
                return R.drawable.west_ham;
            case "Tottenham Hotspur FC":
                return R.drawable.tottenham_hotspur;
            case "West Bromwich Albion":
                return R.drawable.west_bromwich_albion_hd_logo;
            case "Sunderland AFC":
                return R.drawable.sunderland;
            case "Stoke City FC":
                return R.drawable.stoke_city;
            default:
                return R.drawable.no_icon;
        }
    }
}
