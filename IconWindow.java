public class IconWindow extends Window
{   
    public IconWindow(String impType)
    {
        super(impType);
    }
    
    public void drawBorder()
    {
        drawText();
        drawRect();
    }
}
