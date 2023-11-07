public class Step {
    String httpAudioLink, header, mainContent;
    int timerAmount;

    public Step(String httpAudioLink, String header, String mainContent, int timerAmount) {
        this.httpAudioLink = httpAudioLink;
        this.header = header;
        this.mainContent = mainContent;
        this.timerAmount = timerAmount;
    }
}
