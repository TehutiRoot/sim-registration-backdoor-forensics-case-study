package p000;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.spi.ContextAwareImpl;
import org.xml.sax.Locator;

/* renamed from: ag */
/* loaded from: classes.dex */
public class C1907ag extends ContextAwareImpl {
    public C1907ag(Context context, Interpreter interpreter) {
        super(context, interpreter);
    }

    @Override // ch.qos.logback.core.spi.ContextAwareImpl
    public Object getOrigin() {
        Locator locator = ((Interpreter) super.getOrigin()).f39823f;
        if (locator != null) {
            return Interpreter.class.getName() + "@" + locator.getLineNumber() + ":" + locator.getColumnNumber();
        }
        return Interpreter.class.getName() + "@NA:NA";
    }
}
