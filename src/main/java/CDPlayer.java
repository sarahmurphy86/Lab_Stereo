public class CDPlayer extends Component {

    public CDPlayer(String make, String model){
        super(make, model);
    }

    public String play(String song){
        return "Playing " + song;
    }
}
