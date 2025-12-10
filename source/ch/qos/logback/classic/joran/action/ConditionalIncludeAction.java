package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.AbstractIncludeAction;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class ConditionalIncludeAction extends AbstractIncludeAction {

    /* renamed from: ch.qos.logback.classic.joran.action.ConditionalIncludeAction$a */
    /* loaded from: classes.dex */
    public class C5464a {

        /* renamed from: a */
        public URL f39544a;

        public C5464a() {
        }

        /* renamed from: a */
        public URL m51618a() {
            return this.f39544a;
        }

        /* renamed from: b */
        public void m51617b(URL url) {
            this.f39544a = url;
        }
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        if (m51620k(interpretationContext) != null) {
            return;
        }
        super.begin(interpretationContext, str, attributes);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void handleError(String str, Exception exc) {
        if (exc == null || (exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException)) {
            addInfo(str);
        } else {
            addWarn(str, exc);
        }
    }

    /* renamed from: k */
    public final URL m51620k(InterpretationContext interpretationContext) {
        URL m51618a;
        if (interpretationContext.isEmpty()) {
            return null;
        }
        Object peekObject = interpretationContext.peekObject();
        if (!(peekObject instanceof C5464a) || (m51618a = ((C5464a) peekObject).m51618a()) == null) {
            return null;
        }
        return m51618a;
    }

    /* renamed from: l */
    public final URL m51619l(InterpretationContext interpretationContext, URL url) {
        C5464a c5464a = new C5464a();
        c5464a.m51617b(url);
        interpretationContext.pushObject(c5464a);
        return url;
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url) throws JoranException {
        m51619l(interpretationContext, url);
    }
}
