package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class OneElementArrayMap$iterator$1 implements Iterator<T>, KMappedMarker {

    /* renamed from: a */
    public boolean f70403a = true;

    /* renamed from: b */
    public final /* synthetic */ OneElementArrayMap f70404b;

    public OneElementArrayMap$iterator$1(OneElementArrayMap oneElementArrayMap) {
        this.f70404b = oneElementArrayMap;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70403a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    @NotNull
    public T next() {
        if (this.f70403a) {
            this.f70403a = false;
            return this.f70404b.getValue();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}