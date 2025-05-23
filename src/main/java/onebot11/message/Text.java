package onebot11.message;

public class Text extends Segment{
    @Override
    public String getText() {
        if (this.getData() instanceof String){
            return String.valueOf(this.data);
        }
    }
}