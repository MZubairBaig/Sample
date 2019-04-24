package Json2Pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Surface Card Minimum Position Value",
    "Fluid Level",
    "Fluid Submergence",
    "Net Stroke Length",
    "Surface Card Maximum Position Value",
    "Pumping Speed (SPM)",
    "Peak Polished Rod Load",
    "Fluid Load",
    "Minimum Polished Rod Load",
    "Pump Fillage",
    "Pump Intake Pressure",
    "Surface Card Load and Position",
    "Structural Loading",
    "Card ID",
    "Gross Stroke Length",
    "Card Type",
    "Load Pump-Off Percent",
    "Downhole Card Load and Position",
    "Position Pump-Off Percent",
    "Surface Stroke Period"
})
public class Payload {

    @JsonProperty("Surface Card Minimum Position Value")
    private String surfaceCardMinimumPositionValue;
    @JsonProperty("Fluid Level")
    private String fluidLevel;
    @JsonProperty("Fluid Submergence")
    private String fluidSubmergence;
    @JsonProperty("Net Stroke Length")
    private String netStrokeLength;
    @JsonProperty("Surface Card Maximum Position Value")
    private String surfaceCardMaximumPositionValue;
    @JsonProperty("Pumping Speed (SPM)")
    private String pumpingSpeedSPM;
    @JsonProperty("Peak Polished Rod Load")
    private String peakPolishedRodLoad;
    @JsonProperty("Fluid Load")
    private String fluidLoad;
    @JsonProperty("Minimum Polished Rod Load")
    private String minimumPolishedRodLoad;
    @JsonProperty("Pump Fillage")
    private String pumpFillage;
    @JsonProperty("Pump Intake Pressure")
    private String pumpIntakePressure;
    @JsonProperty("Surface Card Load and Position")
    private List<List<String>> surfaceCardLoadAndPosition = null;
    @JsonProperty("Structural Loading")
    private String structuralLoading;
    @JsonProperty("Card ID")
    private String cardID;
    @JsonProperty("Gross Stroke Length")
    private String grossStrokeLength;
    @JsonProperty("Card Type")
    private String cardType;
    @JsonProperty("Load Pump-Off Percent")
    private String loadPumpOffPercent;
    @JsonProperty("Downhole Card Load and Position")
    private List<List<String>> downholeCardLoadAndPosition = null;
    @JsonProperty("Position Pump-Off Percent")
    private String positionPumpOffPercent;
    @JsonProperty("Surface Stroke Period")
    private String surfaceStrokePeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Surface Card Minimum Position Value")
    public String getSurfaceCardMinimumPositionValue() {
        return surfaceCardMinimumPositionValue;
    }

    @JsonProperty("Surface Card Minimum Position Value")
    public void setSurfaceCardMinimumPositionValue(String surfaceCardMinimumPositionValue) {
        this.surfaceCardMinimumPositionValue = surfaceCardMinimumPositionValue;
    }

    @JsonProperty("Fluid Level")
    public String getFluidLevel() {
        return fluidLevel;
    }

    @JsonProperty("Fluid Level")
    public void setFluidLevel(String fluidLevel) {
        this.fluidLevel = fluidLevel;
    }

    @JsonProperty("Fluid Submergence")
    public String getFluidSubmergence() {
        return fluidSubmergence;
    }

    @JsonProperty("Fluid Submergence")
    public void setFluidSubmergence(String fluidSubmergence) {
        this.fluidSubmergence = fluidSubmergence;
    }

    @JsonProperty("Net Stroke Length")
    public String getNetStrokeLength() {
        return netStrokeLength;
    }

    @JsonProperty("Net Stroke Length")
    public void setNetStrokeLength(String netStrokeLength) {
        this.netStrokeLength = netStrokeLength;
    }

    @JsonProperty("Surface Card Maximum Position Value")
    public String getSurfaceCardMaximumPositionValue() {
        return surfaceCardMaximumPositionValue;
    }

    @JsonProperty("Surface Card Maximum Position Value")
    public void setSurfaceCardMaximumPositionValue(String surfaceCardMaximumPositionValue) {
        this.surfaceCardMaximumPositionValue = surfaceCardMaximumPositionValue;
    }

    @JsonProperty("Pumping Speed (SPM)")
    public String getPumpingSpeedSPM() {
        return pumpingSpeedSPM;
    }

    @JsonProperty("Pumping Speed (SPM)")
    public void setPumpingSpeedSPM(String pumpingSpeedSPM) {
        this.pumpingSpeedSPM = pumpingSpeedSPM;
    }

    @JsonProperty("Peak Polished Rod Load")
    public String getPeakPolishedRodLoad() {
        return peakPolishedRodLoad;
    }

    @JsonProperty("Peak Polished Rod Load")
    public void setPeakPolishedRodLoad(String peakPolishedRodLoad) {
        this.peakPolishedRodLoad = peakPolishedRodLoad;
    }

    @JsonProperty("Fluid Load")
    public String getFluidLoad() {
        return fluidLoad;
    }

    @JsonProperty("Fluid Load")
    public void setFluidLoad(String fluidLoad) {
        this.fluidLoad = fluidLoad;
    }

    @JsonProperty("Minimum Polished Rod Load")
    public String getMinimumPolishedRodLoad() {
        return minimumPolishedRodLoad;
    }

    @JsonProperty("Minimum Polished Rod Load")
    public void setMinimumPolishedRodLoad(String minimumPolishedRodLoad) {
        this.minimumPolishedRodLoad = minimumPolishedRodLoad;
    }

    @JsonProperty("Pump Fillage")
    public String getPumpFillage() {
        return pumpFillage;
    }

    @JsonProperty("Pump Fillage")
    public void setPumpFillage(String pumpFillage) {
        this.pumpFillage = pumpFillage;
    }

    @JsonProperty("Pump Intake Pressure")
    public String getPumpIntakePressure() {
        return pumpIntakePressure;
    }

    @JsonProperty("Pump Intake Pressure")
    public void setPumpIntakePressure(String pumpIntakePressure) {
        this.pumpIntakePressure = pumpIntakePressure;
    }

    @JsonProperty("Surface Card Load and Position")
    public List<List<String>> getSurfaceCardLoadAndPosition() {
        return surfaceCardLoadAndPosition;
    }

    @JsonProperty("Surface Card Load and Position")
    public void setSurfaceCardLoadAndPosition(List<List<String>> surfaceCardLoadAndPosition) {
        this.surfaceCardLoadAndPosition = surfaceCardLoadAndPosition;
    }

    @JsonProperty("Structural Loading")
    public String getStructuralLoading() {
        return structuralLoading;
    }

    @JsonProperty("Structural Loading")
    public void setStructuralLoading(String structuralLoading) {
        this.structuralLoading = structuralLoading;
    }

    @JsonProperty("Card ID")
    public String getCardID() {
        return cardID;
    }

    @JsonProperty("Card ID")
    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    @JsonProperty("Gross Stroke Length")
    public String getGrossStrokeLength() {
        return grossStrokeLength;
    }

    @JsonProperty("Gross Stroke Length")
    public void setGrossStrokeLength(String grossStrokeLength) {
        this.grossStrokeLength = grossStrokeLength;
    }

    @JsonProperty("Card Type")
    public String getCardType() {
        return cardType;
    }

    @JsonProperty("Card Type")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @JsonProperty("Load Pump-Off Percent")
    public String getLoadPumpOffPercent() {
        return loadPumpOffPercent;
    }

    @JsonProperty("Load Pump-Off Percent")
    public void setLoadPumpOffPercent(String loadPumpOffPercent) {
        this.loadPumpOffPercent = loadPumpOffPercent;
    }

    @JsonProperty("Downhole Card Load and Position")
    public List<List<String>> getDownholeCardLoadAndPosition() {
        return downholeCardLoadAndPosition;
    }

    @JsonProperty("Downhole Card Load and Position")
    public void setDownholeCardLoadAndPosition(List<List<String>> downholeCardLoadAndPosition) {
        this.downholeCardLoadAndPosition = downholeCardLoadAndPosition;
    }

    @JsonProperty("Position Pump-Off Percent")
    public String getPositionPumpOffPercent() {
        return positionPumpOffPercent;
    }

    @JsonProperty("Position Pump-Off Percent")
    public void setPositionPumpOffPercent(String positionPumpOffPercent) {
        this.positionPumpOffPercent = positionPumpOffPercent;
    }

    @JsonProperty("Surface Stroke Period")
    public String getSurfaceStrokePeriod() {
        return surfaceStrokePeriod;
    }

    @JsonProperty("Surface Stroke Period")
    public void setSurfaceStrokePeriod(String surfaceStrokePeriod) {
        this.surfaceStrokePeriod = surfaceStrokePeriod;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
