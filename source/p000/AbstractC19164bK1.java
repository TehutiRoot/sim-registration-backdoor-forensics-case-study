package p000;

import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bK1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC19164bK1 {

    /* renamed from: a */
    public static final SnapshotThreadLocal f39010a = new SnapshotThreadLocal();

    /* renamed from: b */
    public static final SnapshotThreadLocal f39011b = new SnapshotThreadLocal();

    /* renamed from: b */
    public static final MutableVector m52028b() {
        SnapshotThreadLocal snapshotThreadLocal = f39011b;
        MutableVector mutableVector = (MutableVector) snapshotThreadLocal.get();
        if (mutableVector == null) {
            MutableVector mutableVector2 = new MutableVector(new DerivedStateObserver[0], 0);
            snapshotThreadLocal.set(mutableVector2);
            return mutableVector2;
        }
        return mutableVector;
    }

    /* renamed from: c */
    public static final State m52027c(SnapshotMutationPolicy policy, Function0 calculation) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new DerivedSnapshotState(calculation, policy);
    }

    /* renamed from: d */
    public static final State m52026d(Function0 calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new DerivedSnapshotState(calculation, null);
    }

    /* renamed from: e */
    public static final void m52025e(DerivedStateObserver observer, Function0 block) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers.add(observer);
            block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
            InlineMarker.finallyEnd(1);
        }
    }
}
