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
    public final Interpreter f39804a;

    /* renamed from: b */
    public List f39805b;

    /* renamed from: c */
    public int f39806c;

    public EventPlayer(Interpreter interpreter) {
        this.f39804a = interpreter;
    }

    public void addEventsDynamically(List<SaxEvent> list, int i) {
        this.f39805b.addAll(this.f39806c + i, list);
    }

    public List<SaxEvent> getCopyOfPlayerEventList() {
        return new ArrayList(this.f39805b);
    }

    public void play(List<SaxEvent> list) {
        this.f39805b = list;
        int i = 0;
        while (true) {
            this.f39806c = i;
            if (this.f39806c >= this.f39805b.size()) {
                return;
            }
            SaxEvent saxEvent = (SaxEvent) this.f39805b.get(this.f39806c);
            if (saxEvent instanceof StartEvent) {
                this.f39804a.startElement((StartEvent) saxEvent);
                this.f39804a.getInterpretationContext().m51499b(saxEvent);
            }
            if (saxEvent instanceof BodyEvent) {
                this.f39804a.getInterpretationContext().m51499b(saxEvent);
                this.f39804a.characters((BodyEvent) saxEvent);
            }
            if (saxEvent instanceof EndEvent) {
                this.f39804a.getInterpretationContext().m51499b(saxEvent);
                this.f39804a.endElement((EndEvent) saxEvent);
            }
            i = this.f39806c + 1;
        }
    }
}