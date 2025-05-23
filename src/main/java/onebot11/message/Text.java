package onebot11.message;

public class Text extends Segment{
    @Override
    public String getText() {
        if (this.data instanceof String){
            return String.valueOf(this.data);
        }
    }
}