package com.example.backend_pfm.service;

import com.example.backend_pfm.beans.Action;
import com.example.backend_pfm.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService {

    @Autowired
    private ActionRepository actionRepository;

    public List<Action> getAllActions() {
        return actionRepository.findAll();
    }

    public Action getActionById(int id) {
        return actionRepository.findById(id).orElse(null);
    }

    public List<Action> getActionsByReceiverId(int receiverId) {
        return actionRepository.findByReceiverId(receiverId);
    }

    public List<Action> getActionsByDonatorId(int donatorId) {
        return actionRepository.findByDonatorId(donatorId);
    }

    public Action saveAction(Action action) {
        return actionRepository.save(action);
    }

    public void deleteAction(int id) {
        actionRepository.deleteById(id);
    }
}
