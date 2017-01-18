package com.example.omar.theme;

/**
 * Created by omar on 1/3/2017.
 */
public class NavDrawer {
    private boolean showNotify;
    private String title;

    public NavDrawer()
    {

    }
    public NavDrawer(boolean showNotify , String title)
    {
        this.showNotify = showNotify;
        this.title = title;
    }
    public boolean isShowNotify()
    {
      return showNotify;
    }
    public void setShowNotify(boolean showNotify)
    {
        this.showNotify = showNotify;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

}
