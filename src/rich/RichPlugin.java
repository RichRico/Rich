package rich;

import org.openstreetmap.josm.gui.IconToggleButton;
import org.openstreetmap.josm.gui.MapFrame;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;



public class RichPlugin extends Plugin {

    private IconToggleButton btn;
    protected static RichDialogo tofixDialog;
   

    public RichPlugin(PluginInformation info) {
        super(info);
    }

    @Override
    public void mapFrameInitialized(MapFrame oldFrame, MapFrame newFrame) {
        if (newFrame != null) {
            newFrame.addToggleDialog(tofixDialog = new RichDialogo());
            //mode = new TofixMode(newFrame, "To-Fix", tr("To-fix mode"));
//            btn = new IconToggleButton(mode);
//            btn.setVisible(true);
//            newFrame.addMapMode(btn);

        }
//        else {
//            btn = null;
//            mode = null;
//            tofixDialog = null;
//            //Rub21
//        }

    }
}