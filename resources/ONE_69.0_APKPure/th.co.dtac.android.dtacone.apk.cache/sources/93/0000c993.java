package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;

/* renamed from: iH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20412iH0 implements SnapshotMutationPolicy {

    /* renamed from: a */
    public static final C20412iH0 f62803a = new C20412iH0();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return XK1.m65615a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}