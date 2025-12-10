package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p003ui.layout.PinnableContainer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.lazy.layout.b */
/* loaded from: classes.dex */
public final class C2943b implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* renamed from: a */
    public final Object f13682a;

    /* renamed from: b */
    public final LazyLayoutPinnedItemList f13683b;

    /* renamed from: c */
    public final MutableIntState f13684c;

    /* renamed from: d */
    public final MutableIntState f13685d;

    /* renamed from: e */
    public final MutableState f13686e;

    /* renamed from: f */
    public final MutableState f13687f;

    public C2943b(Object obj, LazyLayoutPinnedItemList pinnedItemList) {
        MutableState m31891g;
        MutableState m31891g2;
        Intrinsics.checkNotNullParameter(pinnedItemList, "pinnedItemList");
        this.f13682a = obj;
        this.f13683b = pinnedItemList;
        this.f13684c = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f13685d = SnapshotIntStateKt.mutableIntStateOf(0);
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f13686e = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f13687f = m31891g2;
    }

    /* renamed from: a */
    public final PinnableContainer.PinnedHandle m61183a() {
        return (PinnableContainer.PinnedHandle) this.f13686e.getValue();
    }

    /* renamed from: b */
    public final PinnableContainer m61182b() {
        return m61180d();
    }

    /* renamed from: c */
    public final int m61181c() {
        return this.f13685d.getIntValue();
    }

    /* renamed from: d */
    public final PinnableContainer m61180d() {
        return (PinnableContainer) this.f13687f.getValue();
    }

    /* renamed from: e */
    public final void m61179e() {
        int m61181c = m61181c();
        for (int i = 0; i < m61181c; i++) {
            release();
        }
    }

    /* renamed from: f */
    public void m61178f(int i) {
        this.f13684c.setIntValue(i);
    }

    /* renamed from: g */
    public final void m61177g(PinnableContainer.PinnedHandle pinnedHandle) {
        this.f13686e.setValue(pinnedHandle);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.f13684c.getIntValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public Object getKey() {
        return this.f13682a;
    }

    /* renamed from: h */
    public final void m61176h(PinnableContainer pinnableContainer) {
        PinnableContainer.PinnedHandle pinnedHandle;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            if (pinnableContainer != m61180d()) {
                m61174j(pinnableContainer);
                if (m61181c() > 0) {
                    PinnableContainer.PinnedHandle m61183a = m61183a();
                    if (m61183a != null) {
                        m61183a.release();
                    }
                    if (pinnableContainer != null) {
                        pinnedHandle = pinnableContainer.pin();
                    } else {
                        pinnedHandle = null;
                    }
                    m61177g(pinnedHandle);
                }
            }
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* renamed from: i */
    public final void m61175i(int i) {
        this.f13685d.setIntValue(i);
    }

    /* renamed from: j */
    public final void m61174j(PinnableContainer pinnableContainer) {
        this.f13687f.setValue(pinnableContainer);
    }

    @Override // androidx.compose.p003ui.layout.PinnableContainer
    public PinnableContainer.PinnedHandle pin() {
        PinnableContainer.PinnedHandle pinnedHandle;
        if (m61181c() == 0) {
            this.f13683b.pin$foundation_release(this);
            PinnableContainer m61182b = m61182b();
            if (m61182b != null) {
                pinnedHandle = m61182b.pin();
            } else {
                pinnedHandle = null;
            }
            m61177g(pinnedHandle);
        }
        m61175i(m61181c() + 1);
        return this;
    }

    @Override // androidx.compose.p003ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (m61181c() > 0) {
            m61175i(m61181c() - 1);
            if (m61181c() == 0) {
                this.f13683b.release$foundation_release(this);
                PinnableContainer.PinnedHandle m61183a = m61183a();
                if (m61183a != null) {
                    m61183a.release();
                }
                m61177g(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }
}
