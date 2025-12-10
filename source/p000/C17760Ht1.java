package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;

/* renamed from: Ht1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17760Ht1 implements SnapshotMutationPolicy {

    /* renamed from: a */
    public static final C17760Ht1 f2341a = new C17760Ht1();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return AbstractC18986aK1.m65109a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
