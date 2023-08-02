
package swing;

import java.awt.Rectangle;
import javax.swing.Icon;

public class ModelNavigation {
    
    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Rectangle getRec() {
        return rec;
    }

    public void setRec(Rectangle rec) {
        this.rec = rec;
    }
    public ModelNavigation(Icon icon, int index, Rectangle rec) {
        this.icon = icon;
        this.index = index;
        this.rec = rec;
    }

    public ModelNavigation() {
    }

    private Icon icon;
    private int index;
    private Rectangle rec;

}
