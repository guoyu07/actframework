package act.app;

import act.Act;
import act.util.ClassFilter;
import org.osgl._;
import act.plugin.Plugin;

import java.io.File;

/**
 * Base class defines the application project layout probe contract
 * and utilities
 */
public abstract class ProjectLayoutProbe implements Plugin {

    /**
     * Check if the given folder contains an application with certain layout
     *
     * @param appBase the folder supposed to be an application's base
     * @return a {@link ProjectLayout} of the app base or
     * {@code null} if can't figure out the project layout
     */
    public abstract ProjectLayout probe(File appBase);

    @Override
    public void register() {
        Act.mode().appScanner().register(this);
    }

    public static final ClassFilter<ProjectLayoutProbe> PLUGIN_FILTER = new ClassFilter<ProjectLayoutProbe>() {
        @Override
        public void found(Class<? extends ProjectLayoutProbe> clazz) {
            Act.mode().appScanner().register(_.newInstance(clazz));
        }

        @Override
        public Class<ProjectLayoutProbe> superType() {
            return ProjectLayoutProbe.class;
        }
    };

}
