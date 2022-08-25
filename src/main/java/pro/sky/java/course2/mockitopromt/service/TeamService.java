package pro.sky.java.course2.mockitopromt.service;

import java.util.Collection;

public interface TeamService {
    String add(String teamName);

    String find(String teamName);

    String remove(String teamName);

    String findTeamAsString();

    Collection<String> findTeams();

    Collection<String> findTeamsByPrefix(String prefix);

    String findTeamsAsString();


    Collection<String> removeAll();
}
