package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ZK1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class ZK1 {
    /* renamed from: a */
    public static final SnapshotMutationPolicy m65239a() {
        C20412iH0 c20412iH0 = C20412iH0.f62803a;
        Intrinsics.checkNotNull(c20412iH0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return c20412iH0;
    }

    /* renamed from: b */
    public static final SnapshotMutationPolicy m65238b() {
        C17598Eu1 c17598Eu1 = C17598Eu1.f1513a;
        Intrinsics.checkNotNull(c17598Eu1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return c17598Eu1;
    }

    /* renamed from: c */
    public static final SnapshotMutationPolicy m65237c() {
        C21125mO1 c21125mO1 = C21125mO1.f71983a;
        Intrinsics.checkNotNull(c21125mO1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return c21125mO1;
    }
}