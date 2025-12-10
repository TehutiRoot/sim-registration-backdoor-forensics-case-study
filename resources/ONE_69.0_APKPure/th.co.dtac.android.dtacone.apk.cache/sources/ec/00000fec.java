package p000;

import androidx.customview.poolingcontainer.PoolingContainerListener;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ql1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18358Ql1 {

    /* renamed from: a */
    public final ArrayList f5300a = new ArrayList();

    /* renamed from: a */
    public final void m66737a(PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5300a.add(listener);
    }

    /* renamed from: b */
    public final void m66736b() {
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f5300a); -1 < lastIndex; lastIndex--) {
            ((PoolingContainerListener) this.f5300a.get(lastIndex)).onRelease();
        }
    }

    /* renamed from: c */
    public final void m66735c(PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5300a.remove(listener);
    }
}