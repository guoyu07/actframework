package playground;

import act.plugin.Plugin;

/**
 * Created by luog on 7/02/2015.
 */
public class MyNiceProjectLayoutProbe extends MyProjectLayoutProbe implements Plugin {
    @Override
    public String buildFileName() {
        return "myniceproj.layout";
    }
}

