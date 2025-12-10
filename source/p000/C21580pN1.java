package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C21580pN1 implements SnapshotMutationPolicy {

    /* renamed from: a */
    public static final C21580pN1 f76578a = new C21580pN1();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return AbstractC18986aK1.m65109a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
