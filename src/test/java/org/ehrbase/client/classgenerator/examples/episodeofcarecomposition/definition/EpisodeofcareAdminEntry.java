package org.ehrbase.client.classgenerator.examples.episodeofcarecomposition.definition;

import com.nedap.archie.rm.datatypes.CodePhrase;
import com.nedap.archie.rm.datavalues.quantity.DvInterval;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

import java.net.URI;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-ADMIN_ENTRY.episodeofcare.v0")
public class EpisodeofcareAdminEntry {
    @Path("/data[at0001]/items[at0002]")
    private List<IdentifierElement> identifier;

    @Path("/data[at0001]/items[at0013]")
    private List<TeamElement> team;

    @Path("/data[at0001]/items[at0003]/value|defining_code")
    private StatusDefiningcode statusDefiningcode;

    @Path("/language")
    private CodePhrase language;

    @Path("/data[at0001]/items[at0018]")
    private List<DiagnosisCluster> diagnosis;

    @Path("/subject")
    private PartyProxy subject;

    @Path("/data[at0001]/items[at0017]/value|value")
    private URI managingOrganizationValue;

    @Path("/data[at0001]/items[at0011]/value|value")
    private String typeValue;

    @Path("/data[at0001]/items[at0014]/value")
    private DvInterval period;

    @Path("/data[at0001]/items[at0012]/value|value")
    private URI careManagerValue;

    public void setIdentifier(List<IdentifierElement> identifier) {
        this.identifier = identifier;
    }

    public List<IdentifierElement> getIdentifier() {
        return this.identifier;
    }

    public void setTeam(List<TeamElement> team) {
        this.team = team;
    }

    public List<TeamElement> getTeam() {
        return this.team;
    }

    public void setStatusDefiningcode(StatusDefiningcode statusDefiningcode) {
        this.statusDefiningcode = statusDefiningcode;
    }

    public StatusDefiningcode getStatusDefiningcode() {
        return this.statusDefiningcode;
    }

    public void setLanguage(CodePhrase language) {
        this.language = language;
    }

    public CodePhrase getLanguage() {
        return this.language;
    }

    public void setDiagnosis(List<DiagnosisCluster> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<DiagnosisCluster> getDiagnosis() {
        return this.diagnosis;
    }

    public void setSubject(PartyProxy subject) {
        this.subject = subject;
    }

    public PartyProxy getSubject() {
        return this.subject;
    }

    public void setManagingOrganizationValue(URI managingOrganizationValue) {
        this.managingOrganizationValue = managingOrganizationValue;
    }

    public URI getManagingOrganizationValue() {
        return this.managingOrganizationValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return this.typeValue;
    }

    public void setPeriod(DvInterval period) {
        this.period = period;
    }

    public DvInterval getPeriod() {
        return this.period;
    }

    public void setCareManagerValue(URI careManagerValue) {
        this.careManagerValue = careManagerValue;
    }

    public URI getCareManagerValue() {
        return this.careManagerValue;
    }
}