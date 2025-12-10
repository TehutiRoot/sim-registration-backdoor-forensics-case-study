package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
public class IncludeAction extends AbstractIncludeAction {

    /* renamed from: e */
    public int f39777e = 2;

    public SaxEventRecorder createRecorder(InputStream inputStream, URL url) {
        return new SaxEventRecorder(getContext());
    }

    /* renamed from: k */
    public final String m51522k(SaxEvent saxEvent) {
        return saxEvent.qName.length() > 0 ? saxEvent.qName : saxEvent.localName;
    }

    /* renamed from: l */
    public final InputStream m51521l(URL url) {
        try {
            return url.openStream();
        } catch (IOException e) {
            optionalWarning("Failed to open [" + url.toString() + "]", e);
            return null;
        }
    }

    /* renamed from: m */
    public final void m51520m(SaxEventRecorder saxEventRecorder) {
        boolean z;
        boolean z2;
        int i;
        SaxEvent saxEvent;
        List<SaxEvent> saxEventList = saxEventRecorder.getSaxEventList();
        if (saxEventList.size() == 0) {
            return;
        }
        SaxEvent saxEvent2 = saxEventList.get(0);
        if (saxEvent2 != null) {
            String m51522k = m51522k(saxEvent2);
            z2 = "included".equalsIgnoreCase(m51522k);
            z = "configuration".equalsIgnoreCase(m51522k);
        } else {
            z = false;
            z2 = false;
        }
        if (z2 || z) {
            saxEventList.remove(0);
            int size = saxEventList.size();
            if (size == 0 || (saxEvent = saxEventList.get(size - 1)) == null) {
                return;
            }
            String m51522k2 = m51522k(saxEvent);
            if ((z2 && "included".equalsIgnoreCase(m51522k2)) || (z && "configuration".equalsIgnoreCase(m51522k2))) {
                saxEventList.remove(i);
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException {
        InputStream m51521l = m51521l(url);
        try {
            if (m51521l != null) {
                try {
                    ConfigurationWatchListUtil.addToWatchList(getContext(), url);
                    SaxEventRecorder createRecorder = createRecorder(m51521l, url);
                    createRecorder.setContext(getContext());
                    createRecorder.recordEvents(m51521l);
                    m51520m(createRecorder);
                    interpretationContext.getJoranInterpreter().getEventPlayer().addEventsDynamically(createRecorder.getSaxEventList(), this.f39777e);
                } catch (JoranException e) {
                    optionalWarning("Failed processing [" + url.toString() + "]", e);
                }
            }
        } finally {
            close(m51521l);
        }
    }

    public void setEventOffset(int i) {
        this.f39777e = i;
    }
}
