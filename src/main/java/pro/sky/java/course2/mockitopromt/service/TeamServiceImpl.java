package pro.sky.java.course2.mockitopromt.service;

import pro.sky.java.course2.mockitopromt.repository.TeamRepository;

import java.util.Collection;
import java.util.stream.Collectors;

public abstract class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public String add(String teamName) {
        return teamRepository.add(teamName);
    }

    @Override
    public String find(String teamName) {
        return teamRepository.find(teamName);
    }

    @Override
    public String remove(String teamName) {
        return teamRepository.remove(teamName);
    }

    @Override
    public String findTeamAsString() {
        return String.join(",", findTeams());
    }

    @Override
    public Collection<String> findTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Collection<String> findTeamsByPrefix(String prefix) {
        return findTeams().stream().filter(team -> startsWith(prefix)).collect(Collectors.toList());
    }

    protected abstract boolean startsWith(String prefix);

    @Override
    public Collection<String> removeAll() {
        return teamRepository.removeAll();
    }

}
