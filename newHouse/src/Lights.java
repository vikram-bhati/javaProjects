public class Lights {
    private String typeOfLight;
    private String noOfLights;
    private String isLightsOn;

    public Lights(String typeOfLight, String noOfLights, String isLightsOn) {
        this.typeOfLight = typeOfLight;
        this.noOfLights = noOfLights;
        this.isLightsOn = isLightsOn;
    }

    public String getTypeOfLight() {
        return typeOfLight;
    }

    public String getNoOfLights() {
        return noOfLights;
    }

    public String getIsLightsOn() {
        return isLightsOn;
    }

    public void lightsOn(){
        isLightsOn="ON";
        System.out.println("Lights "+isLightsOn);
    }
    public void lightsOff(){
        isLightsOn="OFF";
        System.out.println("Lights "+isLightsOn);
    }
}
