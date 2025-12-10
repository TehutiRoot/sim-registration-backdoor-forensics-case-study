package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cK1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC19336cK1 {
    /* renamed from: a */
    public static final SnapshotMutationPolicy m51693a() {
        C19326cH0 c19326cH0 = C19326cH0.f39387a;
        Intrinsics.checkNotNull(c19326cH0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return c19326cH0;
    }

    /* renamed from: b */
    public static final SnapshotMutationPolicy m51692b() {
        C17760Ht1 c17760Ht1 = C17760Ht1.f2341a;
        Intrinsics.checkNotNull(c17760Ht1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return c17760Ht1;
    }

    /* renamed from: c */
    public static final SnapshotMutationPolicy m51691c() {
        C21580pN1 c21580pN1 = C21580pN1.f76578a;
        Intrinsics.checkNotNull(c21580pN1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return c21580pN1;
    }
}
