package io.realm.internal.objectstore;

import io.realm.internal.NativeContext;
import io.realm.internal.NativeObject;

/* loaded from: classes5.dex */
public class OsKeyPathMapping implements NativeObject {

    /* renamed from: a */
    public static final long f66849a = nativeGetFinalizerMethodPtr();
    public long mappingPointer;

    public OsKeyPathMapping(long j) {
        this.mappingPointer = -1L;
        this.mappingPointer = nativeCreateMapping(j);
        NativeContext.dummyContext.addReference(this);
    }

    private static native long nativeCreateMapping(long j);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66849a;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.mappingPointer;
    }
}
