package com.barban.corentin.m2.miagesousleau.miagesousleaucomposite.rest;

import com.barban.corentin.m2.miagesousleau.miagesousleaucomposite.repo.ParticipantCoursRepository;
import com.barban.corentin.m2.miagesousleau.miagesousleaucomposite.transientobj.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/participants")
public class ParticipantController {

    @Autowired
    ParticipantCoursRepository participantCoursRepository;

    /**
     * Obtenir tous les cours d'un participant
     *
     * @param idParticipant
     * @return
     */
    @GetMapping("{id}")
    public Participant getParticipant(@PathVariable("id") Long idParticipant) {
        return participantCoursRepository.getParticipantWithCours(idParticipant);
    }
}
