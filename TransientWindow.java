public class TransientWindow extends Window
{   
    public TransientWindow(String impType)
    {
        super(impType);
    }

    public void drawCloseBox()
    {
        drawRect();
    }
}
