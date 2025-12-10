package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;

/* renamed from: Eu1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17598Eu1 implements SnapshotMutationPolicy {

    /* renamed from: a */
    public static final C17598Eu1 f1513a = new C17598Eu1();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return XK1.m65615a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}