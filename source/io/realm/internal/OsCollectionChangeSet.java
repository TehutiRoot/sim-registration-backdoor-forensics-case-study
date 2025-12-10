package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class OsCollectionChangeSet implements OrderedCollectionChangeSet, NativeObject {
    public static final int MAX_ARRAY_LENGTH = 2147483639;
    public static final int TYPE_DELETION = 0;
    public static final int TYPE_INSERTION = 1;
    public static final int TYPE_MODIFICATION = 2;

    /* renamed from: c */
    public static long f66690c = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final long f66691a;

    /* renamed from: b */
    public final boolean f66692b;

    public OsCollectionChangeSet(long j, boolean z) {
        this.f66691a = j;
        this.f66692b = z;
        NativeContext.dummyContext.addReference(this);
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetIndices(long j, int i);

    private static native int[] nativeGetRanges(long j, int i);

    /* renamed from: a */
    public final OrderedCollectionChangeSet.Range[] m29550a(int[] iArr) {
        if (iArr == null) {
            return new OrderedCollectionChangeSet.Range[0];
        }
        int length = iArr.length / 2;
        OrderedCollectionChangeSet.Range[] rangeArr = new OrderedCollectionChangeSet.Range[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            rangeArr[i] = new OrderedCollectionChangeSet.Range(iArr[i2], iArr[i2 + 1]);
        }
        return rangeArr;
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.Range[] getChangeRanges() {
        return m29550a(nativeGetRanges(this.f66691a, 2));
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getChanges() {
        return nativeGetIndices(this.f66691a, 2);
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.Range[] getDeletionRanges() {
        return m29550a(nativeGetRanges(this.f66691a, 0));
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getDeletions() {
        return nativeGetIndices(this.f66691a, 0);
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public Throwable getError() {
        return null;
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.Range[] getInsertionRanges() {
        return m29550a(nativeGetRanges(this.f66691a, 1));
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public int[] getInsertions() {
        return nativeGetIndices(this.f66691a, 1);
    }

    public long getNativeFinalizerPtr() {
        return f66690c;
    }

    public long getNativePtr() {
        return this.f66691a;
    }

    @Override // io.realm.OrderedCollectionChangeSet
    public OrderedCollectionChangeSet.State getState() {
        throw new UnsupportedOperationException("This method should be overridden in a subclass");
    }

    public boolean isEmpty() {
        if (this.f66691a == 0) {
            return true;
        }
        return false;
    }

    public boolean isFirstAsyncCallback() {
        return this.f66692b;
    }

    public String toString() {
        if (this.f66691a == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(getDeletionRanges()) + "\nInsertion Ranges: " + Arrays.toString(getInsertionRanges()) + "\nChange Ranges: " + Arrays.toString(getChangeRanges());
    }
}
