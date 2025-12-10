package androidx.camera.core.internal.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.internal.utils.RingBuffer;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class ArrayRingBuffer<T> implements RingBuffer<T> {

    /* renamed from: a */
    public final int f11374a;

    /* renamed from: b */
    public final ArrayDeque f11375b;

    /* renamed from: c */
    public final Object f11376c;

    /* renamed from: d */
    public final RingBuffer.OnRemoveCallback f11377d;

    public ArrayRingBuffer(int i) {
        this(i, null);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    @NonNull
    public T dequeue() {
        T t;
        synchronized (this.f11376c) {
            t = (T) this.f11375b.removeLast();
        }
        return t;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(@NonNull T t) {
        T t2;
        synchronized (this.f11376c) {
            try {
                if (this.f11375b.size() >= this.f11374a) {
                    t2 = dequeue();
                } else {
                    t2 = null;
                }
                this.f11375b.addFirst(t);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RingBuffer.OnRemoveCallback onRemoveCallback = this.f11377d;
        if (onRemoveCallback != null && t2 != null) {
            onRemoveCallback.onRemove(t2);
        }
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public int getMaxCapacity() {
        return this.f11374a;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f11376c) {
            isEmpty = this.f11375b.isEmpty();
        }
        return isEmpty;
    }

    public ArrayRingBuffer(int i, @Nullable RingBuffer.OnRemoveCallback<T> onRemoveCallback) {
        this.f11376c = new Object();
        this.f11374a = i;
        this.f11375b = new ArrayDeque(i);
        this.f11377d = onRemoveCallback;
    }
}
