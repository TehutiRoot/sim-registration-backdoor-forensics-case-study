package ch.qos.logback.classic.sift;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.event.InPlayListener;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class SiftAction extends Action implements InPlayListener {

    /* renamed from: c */
    public List f39638c;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.f39638c = new ArrayList();
        interpretationContext.addInPlayListener(this);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        interpretationContext.removeInPlayListener(this);
        Object peekObject = interpretationContext.peekObject();
        if (peekObject instanceof SiftingAppender) {
            SiftingAppender siftingAppender = (SiftingAppender) peekObject;
            siftingAppender.setAppenderFactory(new AppenderFactoryUsingJoran(this.f39638c, siftingAppender.getDiscriminatorKey(), interpretationContext.getCopyOfPropertyMap()));
        }
    }

    public List<SaxEvent> getSeList() {
        return this.f39638c;
    }

    @Override // ch.qos.logback.core.joran.event.InPlayListener
    public void inPlay(SaxEvent saxEvent) {
        this.f39638c.add(saxEvent);
    }
}
