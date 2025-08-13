package zad2.services;

import zad2.models.Employee;
import zad2.models.Position;
import zad2.models.Team;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompanyService {

    //napisz metode ktora jako arg pobiera liste Teamow a jako wynik zwraca Teamy w ktorych nie ma zadnego junior java developera
    public static List<Team> getTeamWithoutJuniorOrDeveloper(List<Team> teamList) {
        List<Team> teamsWithoutJunior = new ArrayList<>();
        for (Team team : teamList) {
            if (team.getEmployeesList() != null) {
                for (Employee employee : team.getEmployeesList()) {
                    if ((employee.getPosition().equals(Position.JUNIOR_DEVELOPER))) {
                        break;
                    }
                    if (!(teamsWithoutJunior.contains(team)))
                    teamsWithoutJunior.add(team);
                }
            }
        }
        return teamsWithoutJunior;
    }

//napisz metode ktora jako arg pobiera liste Teamow a jako wynik zwraca Teamy w ktorych jest chociaz jeden junior
public static List<Team> getTeamWithMinOneJuniorDeveloper(List<Team> teamList) {
    List<Team> teamsWithMin1Junior = new ArrayList<>();
    for (Team team : teamList) {
        if (team.getEmployeesList() != null) {
            for (Employee employee : team.getEmployeesList()) {
                if (employee.getPosition().equals(Position.JUNIOR_DEVELOPER)) {
                    teamsWithMin1Junior.add(team);
                }
            }
        }
    }
    return teamsWithMin1Junior;
}

//napisz metode ktora jako arg pobiera liste teamow a jako wynik zwraca Teamy w ktorych jest min 2 seniorow
public static List<Team> getTeamWithMin2SeniorDeveloper(List<Team> teamList) {
    List<Team> teamsWithMin2Seniors = new ArrayList<>();
    for (Team team : teamList) {
        int seniorsNumber = 0;
        if (team.getEmployeesList() != null) {
            for (Employee employee : team.getEmployeesList()) {
                if (employee.getPosition().equals(Position.SENIOR_DEVELOPER)) {
                    seniorsNumber++;
                }
            }
            if (seniorsNumber >= 2) {
                teamsWithMin2Seniors.add(team);
            }
        }
    }
    return teamsWithMin2Seniors;
}

//napisz metode ktora jako arg pobiera liste teamow a jako wynik zwraca Team w ktorym jest najwiecej roznych stanowisk
public static Team getTeamWithMostDifferentPositions(List<Team> teamList) {
    Team teamWithMostDifferentPositions = null;
    int positionsCnt = 0;
    for (Team team : teamList) {
        Set<Position> differentPositionSet = new HashSet<>();
        for (Employee employee : team.getEmployeesList()) {
            differentPositionSet.add(employee.getPosition());
        }
        if (differentPositionSet.size() > positionsCnt) {
            teamWithMostDifferentPositions = team;
        }
    }
    return teamWithMostDifferentPositions;
}
}