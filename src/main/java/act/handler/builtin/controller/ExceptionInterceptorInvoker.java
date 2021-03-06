package act.handler.builtin.controller;

import act.util.Prioritised;
import org.osgl.mvc.result.Result;
import act.app.AppContext;

public interface ExceptionInterceptorInvoker extends Prioritised {
    Result handle(Exception e, AppContext appContext);
}
