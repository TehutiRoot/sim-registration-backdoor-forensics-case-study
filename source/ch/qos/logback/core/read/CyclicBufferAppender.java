package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

/* loaded from: classes.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* renamed from: g */
    public CyclicBuffer f40008g;

    /* renamed from: h */
    public int f40009h = 512;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (isStarted()) {
            this.f40008g.add(e);
        }
    }

    public E get(int i) {
        if (isStarted()) {
            return (E) this.f40008g.get(i);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f40008g.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.f40009h;
    }

    public void reset() {
        this.f40008g.clear();
    }

    public void setMaxSize(int i) {
        this.f40009h = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40008g = new CyclicBuffer(this.f40009h);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f40008g = null;
        super.stop();
    }
}
