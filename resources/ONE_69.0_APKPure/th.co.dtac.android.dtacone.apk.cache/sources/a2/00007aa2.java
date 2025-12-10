package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

/* loaded from: classes.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* renamed from: g */
    public CyclicBuffer f40006g;

    /* renamed from: h */
    public int f40007h = 512;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (isStarted()) {
            this.f40006g.add(e);
        }
    }

    public E get(int i) {
        if (isStarted()) {
            return (E) this.f40006g.get(i);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f40006g.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.f40007h;
    }

    public void reset() {
        this.f40006g.clear();
    }

    public void setMaxSize(int i) {
        this.f40007h = i;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f40006g = new CyclicBuffer(this.f40007h);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f40006g = null;
        super.stop();
    }
}