import java.util.ArrayList;
import java.util.List;

public class FrameList {
    private List<Frame> frames = new ArrayList<Frame>();
    private int currentFrame = 0;

    public FrameList() {
        for (int i = 0; i < 9; i++){
            frames.add(new RegularFrame());
        }
        frames.add(new FinalFrame());
    }

    public void incrementCurrentFrame() {
        currentFrame++;
    }
}
