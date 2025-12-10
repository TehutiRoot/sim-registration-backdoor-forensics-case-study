package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class EventPlayer {

    /* renamed from: a */
    public final Interpreter f39806a;

    /* renamed from: b */
    public List f39807b;

    /* renamed from: c */
    public int f39808c;

    public EventPlayer(Interpreter interpreter) {
        this.f39806a = interpreter;
    }

    public void addEventsDynamically(List<SaxEvent> list, int i) {
        this.f39807b.addAll(this.f39808c + i, list);
    }

    public List<SaxEvent> getCopyOfPlayerEventList() {
        return new ArrayList(this.f39807b);
    }

    public void play(List<SaxEvent> list) {
        this.f39807b = list;
        int i = 0;
        while (true) {
            this.f39808c = i;
            if (this.f39808c >= this.f39807b.size()) {
                return;
            }
            SaxEvent saxEvent = (SaxEvent) this.f39807b.get(this.f39808c);
            if (saxEvent instanceof StartEvent) {
                this.f39806a.startElement((StartEvent) saxEvent);
                this.f39806a.getInterpretationContext().m51504b(saxEvent);
            }
            if (saxEvent instanceof BodyEvent) {
                this.f39806a.getInterpretationContext().m51504b(saxEvent);
                this.f39806a.characters((BodyEvent) saxEvent);
            }
            if (saxEvent instanceof EndEvent) {
                this.f39806a.getInterpretationContext().m51504b(saxEvent);
                this.f39806a.endElement((EndEvent) saxEvent);
            }
            i = this.f39808c + 1;
        }
    }
}
