package io.realm.internal;

/* loaded from: classes5.dex */
public class OsMapChangeSet implements NativeObject {
    public static final int EMPTY_CHANGESET = 0;

    /* renamed from: b */
    public static long f66702b = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66703a;

    public OsMapChangeSet(long j) {
        this.f66703a = j;
    }

    private static native long nativeGetFinalizerPtr();

    private static native String[] nativeGetStringKeyDeletions(long j);

    private static native String[] nativeGetStringKeyInsertions(long j);

    private static native String[] nativeGetStringKeyModifications(long j);

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66702b;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66703a;
    }

    public String[] getStringKeyDeletions() {
        return nativeGetStringKeyDeletions(this.f66703a);
    }

    public String[] getStringKeyInsertions() {
        return nativeGetStringKeyInsertions(this.f66703a);
    }

    public String[] getStringKeyModifications() {
        return nativeGetStringKeyModifications(this.f66703a);
    }

    public boolean isEmpty() {
        if (this.f66703a == 0) {
            return true;
        }
        return false;
    }
}
