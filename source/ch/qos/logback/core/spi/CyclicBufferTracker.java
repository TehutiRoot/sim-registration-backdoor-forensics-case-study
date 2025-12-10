package ch.qos.logback.core.spi;

import ch.qos.logback.core.helpers.CyclicBuffer;

/* loaded from: classes.dex */
public class CyclicBufferTracker<E> extends AbstractComponentTracker<CyclicBuffer<E>> {

    /* renamed from: g */
    public int f40121g = 256;

    public CyclicBufferTracker() {
        setMaxComponents(64);
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public CyclicBuffer<E> buildComponent(String str) {
        return new CyclicBuffer<>(this.f40121g);
    }

    public int getBufferSize() {
        return this.f40121g;
    }

    public boolean isComponentStale(CyclicBuffer<E> cyclicBuffer) {
        return false;
    }

    public void processPriorToRemoval(CyclicBuffer<E> cyclicBuffer) {
        cyclicBuffer.clear();
    }

    public void setBufferSize(int i) {
        this.f40121g = i;
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public /* bridge */ /* synthetic */ boolean isComponentStale(Object obj) {
        return isComponentStale((CyclicBuffer) ((CyclicBuffer) obj));
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public /* bridge */ /* synthetic */ void processPriorToRemoval(Object obj) {
        processPriorToRemoval((CyclicBuffer) ((CyclicBuffer) obj));
    }
}
