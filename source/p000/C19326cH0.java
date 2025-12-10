package p000;

import androidx.compose.runtime.SnapshotMutationPolicy;

/* renamed from: cH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19326cH0 implements SnapshotMutationPolicy {

    /* renamed from: a */
    public static final C19326cH0 f39387a = new C19326cH0();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return AbstractC18986aK1.m65109a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
