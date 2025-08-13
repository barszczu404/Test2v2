package zad2.app;

import zad2.models.Employee;
import zad2.models.Position;
import zad2.models.Team;
import zad2.services.CompanyService;

import java.util.ArrayList;
import java.util.List;

public class CompanyRunner {

    public static void main(String[] args) {

        Employee adam = new Employee("Adam", "Adamski", Position.DESIGNER, 4600);
        Employee basia = new Employee("Barbara", "Boczek", Position.TESTER, 5000);
        Employee czarek = new Employee("Cezary", "Cykada", Position.ANALYST, 5100);//team bez juniora

        Employee darek = new Employee("Dariusz", "Dubik" ,Position.JUNIOR_DEVELOPER, 6000);
        Employee ela = new Employee("Elżbieta", "Ekonomiczna", Position.SENIOR_DEVELOPER, 1000);
        Employee frania = new Employee("Franiczka", "Frankowska", Position.DEVELOPER, 8000);//z 1 juniorem

        Employee grzesiek = new Employee("Grzegorz", "Gaduła", Position.JUNIOR_DEVELOPER, 7000);//1 junior
        Employee heniu = new Employee("Henryk", "Huragan", Position.SENIOR_DEVELOPER, 12000);
        Employee irek = new Employee("Ireneusz", "Iksiński", Position.SENIOR_DEVELOPER, 15000);

        Employee jola = new Employee("Jolanta", "Jajus", Position.MANAGER, 4900);
        Employee karol = new Employee("Karol", "Kowalski", Position.TESTER, 5200);
        Employee leszek = new Employee("Leszek", "Linde", Position.ANALYST, 5400);//bez juniora
        Employee marek = new Employee("Marek", "Moneta", Position.SENIOR_DEVELOPER, 11000);//naj roznych stanowisk

        Team frontendTeam = new Team("Front", adam, basia, czarek);
        Team backendTeam = new Team("Back", darek, ela, frania);
        Team anotherBackend = new Team("Another Backend", grzesiek, heniu, irek);
        Team secondFrontend = new Team("Better Front", jola, karol, leszek, marek);

        List<Team> teams = new ArrayList<>(List.of(frontendTeam, backendTeam, anotherBackend, secondFrontend));

        List<Team> teamWithoutJuniorOrDeveloper = CompanyService.getTeamWithoutJuniorOrDeveloper(teams);
        System.out.println("teamWithoutJuniorOrDeveloper = " + teamWithoutJuniorOrDeveloper);
        List<Team> teamWithMinOneJuniorDeveloper = CompanyService.getTeamWithMinOneJuniorDeveloper(teams);
        System.out.println("teamWithMinOneJuniorDeveloper = " + teamWithMinOneJuniorDeveloper);
        List<Team> teamWithMin2SeniorDeveloper = CompanyService.getTeamWithMin2SeniorDeveloper(teams);
        System.out.println("teamWithMin2SeniorDeveloper = " + teamWithMin2SeniorDeveloper);
        Team teamWithMostDifferentPositions = CompanyService.getTeamWithMostDifferentPositions(teams);
        System.out.println("teamWithMostDifferentPositions = " + teamWithMostDifferentPositions);


    }
}
