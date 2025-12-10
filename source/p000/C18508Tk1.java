package p000;

import androidx.customview.poolingcontainer.PoolingContainerListener;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Tk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18508Tk1 {

    /* renamed from: a */
    public final ArrayList f6090a = new ArrayList();

    /* renamed from: a */
    public final void m66172a(PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6090a.add(listener);
    }

    /* renamed from: b */
    public final void m66171b() {
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f6090a); -1 < lastIndex; lastIndex--) {
            ((PoolingContainerListener) this.f6090a.get(lastIndex)).onRelease();
        }
    }

    /* renamed from: c */
    public final void m66170c(PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6090a.remove(listener);
    }
}
