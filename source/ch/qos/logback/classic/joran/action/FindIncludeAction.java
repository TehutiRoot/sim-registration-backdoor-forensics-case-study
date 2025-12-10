package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.joran.action.ConditionalIncludeAction;
import ch.qos.logback.core.joran.action.IncludeAction;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class FindIncludeAction extends IncludeAction {
    public FindIncludeAction() {
        setEventOffset(1);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
    }

    @Override // ch.qos.logback.core.joran.action.IncludeAction
    public SaxEventRecorder createRecorder(InputStream inputStream, URL url) {
        return new SaxEventRecorder(getContext());
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        if (interpretationContext.isEmpty() || !(interpretationContext.peekObject() instanceof ConditionalIncludeAction.C5464a)) {
            return;
        }
        URL m51618a = ((ConditionalIncludeAction.C5464a) interpretationContext.popObject()).m51618a();
        if (m51618a == null) {
            addInfo("No paths found from includes");
            return;
        }
        addInfo("Path found [" + m51618a.toString() + "]");
        try {
            processInclude(interpretationContext, m51618a);
        } catch (JoranException e) {
            addError("Failed to process include [" + m51618a.toString() + "]", e);
        }
    }
}
