package act.boot;

import act.app.ProjectLayout;

import java.io.File;

/**
 * Helper to build {@link ProjectLayout}
 */
public class ProjectLayoutBuilder implements ProjectLayout {

    private String appBase;

    private String src;
    private String rsrc;
    private String lib;
    private String asset;
    private String tgt;
    private String routeTable;
    private String conf;

    private ProjectLayout _layout;

    private void _refresh() {
        _layout = toLayout();
    }

    public ProjectLayoutBuilder source(String src) {
        this.src = src;
        _refresh();
        return this;
    }

    public ProjectLayoutBuilder resource(String rsrc) {
        this.rsrc = rsrc;
        _refresh();
        return this;
    }

    public ProjectLayoutBuilder lib(String lib) {
        this.lib = lib;
        _refresh();
        return this;
    }

    public ProjectLayoutBuilder asset(String asset) {
        this.asset = asset;
        _refresh();
        return this;
    }

    public ProjectLayoutBuilder target(String tgt) {
        this.tgt = tgt;
        _refresh();
        return this;
    }

    public ProjectLayoutBuilder routeTable(String routeTable) {
        this.routeTable = routeTable;
        _refresh();
        return this;
    }

    public ProjectLayoutBuilder conf(String conf) {
        this.conf = conf;
        _refresh();
        return this;
    }

    @Override
    public File source(File appBase) {
        return _layout.source(appBase);
    }

    @Override
    public File resource(File appBase) {
        return _layout.resource(appBase);
    }

    @Override
    public File lib(File appBase) {
        return _layout.lib(appBase);
    }

    @Override
    public File asset(File appBase) {
        return _layout.asset(appBase);
    }

    @Override
    public File target(File appBase) {
        return _layout.target(appBase);
    }

    @Override
    public File routeTable(File appBase) {
        return _layout.routeTable(appBase);
    }

    @Override
    public File conf(File appBase) {
        return _layout.conf(appBase);
    }

    public ProjectLayout toLayout() {
        return new ProjectLayout.CustomizedProjectLayout(src, rsrc, lib, asset, tgt, routeTable, conf);
    }
}
