package org.ehrbase.client.classgenerator.examples.ehrbasemultioccurrencedev1.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.support.identification.PartyRef;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.examples.shareddefinition.Language;

import java.time.temporal.TemporalAccessor;
import java.util.List;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.body_temperature.v2")
public class BodyTemperature {
    @Path("/protocol[at0020]/items[at0062]")
    private List<Cluster> extension;

    @Path("/language")
    private Language language;

    @Path("/protocol[at0020]/items[at0064]")
    private List<Cluster> structuredMeasurementLocation;

    @Path("/data[at0002]/origin|value")
    private TemporalAccessor originValue;

    @Path("/protocol[at0020]/items[at0059]")
    private Cluster device;

    @Path("/subject|external_ref")
    private PartyRef subjectExternalref;

    @Path("/protocol[at0020]/items[at0021]/value")
    @Choice
    private ProtocolLocationOfMeasurementChoice locationOfMeasurement;

    @Path("/data[at0002]/events")
    private List<BodyTemperatureHistory> history;

    public void setExtension(List<Cluster> extension) {
        this.extension = extension;
    }

    public List<Cluster> getExtension() {
        return this.extension;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setStructuredMeasurementLocation(List<Cluster> structuredMeasurementLocation) {
        this.structuredMeasurementLocation = structuredMeasurementLocation;
    }

    public List<Cluster> getStructuredMeasurementLocation() {
        return this.structuredMeasurementLocation;
    }

    public void setOriginValue(TemporalAccessor originValue) {
        this.originValue = originValue;
    }

    public TemporalAccessor getOriginValue() {
        return this.originValue;
    }

    public void setDevice(Cluster device) {
        this.device = device;
    }

    public Cluster getDevice() {
        return this.device;
    }

    public void setSubjectExternalref(PartyRef subjectExternalref) {
        this.subjectExternalref = subjectExternalref;
    }

    public PartyRef getSubjectExternalref() {
        return this.subjectExternalref;
    }

    public void setLocationOfMeasurement(ProtocolLocationOfMeasurementChoice locationOfMeasurement) {
        this.locationOfMeasurement = locationOfMeasurement;
    }

    public ProtocolLocationOfMeasurementChoice getLocationOfMeasurement() {
        return this.locationOfMeasurement;
    }

    public void setHistory(List<BodyTemperatureHistory> history) {
        this.history = history;
    }

    public List<BodyTemperatureHistory> getHistory() {
        return this.history;
    }
}