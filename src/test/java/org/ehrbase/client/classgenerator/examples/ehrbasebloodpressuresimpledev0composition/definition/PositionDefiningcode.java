package org.ehrbase.client.classgenerator.examples.ehrbasebloodpressuresimpledev0composition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PositionDefiningcode implements EnumValueSet {
    STANDING("Standing", "Standing at the time of blood pressure measurement", "local", "at1000"),

    TRENDELENBURG("Trendelenburg", "Lying flat on the back (supine position) with the feet higher than the head at the time of blood pressure measurement", "local", "at1013"),

    LYING("Lying", "Lying flat at the time of blood pressure measurement", "local", "at1003"),

    LEFTLATERAL("Left Lateral", "Lying on the left side at the time of blood pressure measurement", "local", "at1014"),

    RECLINING("Reclining", "Reclining at the time of blood pressure measurement", "local", "at1002"),

    SITTING("Sitting", "Sitting (for example on bed or chair) at the time of blood pressure measurement", "local", "at1001");

    private String value;

    private String description;

    private String terminologyId;

    private String code;

    PositionDefiningcode(String value, String description, String terminologyId, String code) {
        this.value = value;
        this.description = description;
        this.terminologyId = terminologyId;
        this.code = code;
    }

  public String getValue() {
      return this.value;
  }

  public String getDescription() {
      return this.description;
  }

  public String getTerminologyId() {
      return this.terminologyId;
  }

  public String getCode() {
      return this.code;
  }
}
