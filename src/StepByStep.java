import java.util.ArrayList;
import java.util.List;

public class StepByStep {
    List<Step> stepList = new ArrayList<>();
    Step currentStep;

    public StepByStep(List<Step> stepList) {
        this.stepList = stepList;
    }
}
