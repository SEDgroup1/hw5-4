public abstract class Window
{
    protected WindowImp imp;

    public Window(String impType)
    {
        setImp(impType);
    }

    public void setImp(String impType)
    {   
        if(impType.equals("XWindow"))
        {   
            WindowImp imp = new XWindowImp();
            this.imp = imp;
        }
        else if(impType.equals("PMWindow"))
        {   
            WindowImp imp = new PMWindowImp();
            this.imp = imp;
        }
    }
    public void drawText()
    {
        System.out.println(imp.drawTextImp());
    }
    public void drawRect()
    {
        System.out.println(imp.drawRectImp());
    }

    public void drawBorder()
    {}

    public void drawCloseBox()
    {}
}