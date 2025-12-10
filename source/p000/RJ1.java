package p000;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: RJ1 */
/* loaded from: classes2.dex */
public final class RJ1 implements CompositionGroup, Iterable, KMappedMarker {

    /* renamed from: a */
    public final SlotTable f5319a;

    /* renamed from: b */
    public final int f5320b;

    /* renamed from: c */
    public final int f5321c;

    public RJ1(SlotTable table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f5319a = table;
        this.f5320b = i;
        this.f5321c = i2;
    }

    /* renamed from: a */
    private final void m66459a() {
        if (this.f5319a.getVersion$runtime_release() == this.f5321c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        Anchor anchor;
        int anchorIndex;
        int i;
        int m60188i;
        Intrinsics.checkNotNullParameter(identityToFind, "identityToFind");
        if (identityToFind instanceof Anchor) {
            anchor = (Anchor) identityToFind;
        } else {
            anchor = null;
        }
        if (anchor == null || !this.f5319a.ownsAnchor(anchor) || (anchorIndex = this.f5319a.anchorIndex(anchor)) < (i = this.f5320b)) {
            return null;
        }
        int i2 = anchorIndex - i;
        m60188i = SlotTableKt.m60188i(this.f5319a.getGroups(), this.f5320b);
        if (i2 >= m60188i) {
            return null;
        }
        return new RJ1(this.f5319a, anchorIndex, this.f5321c);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable getData() {
        return new C0510HD(this.f5319a, this.f5320b);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int m60188i;
        m60188i = SlotTableKt.m60188i(this.f5319a.getGroups(), this.f5320b);
        return m60188i;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        m66459a();
        SlotReader openReader = this.f5319a.openReader();
        try {
            return openReader.anchor(this.f5320b);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        boolean m60184m;
        int m60181p;
        int m60175v;
        m60184m = SlotTableKt.m60184m(this.f5319a.getGroups(), this.f5320b);
        if (!m60184m) {
            m60181p = SlotTableKt.m60181p(this.f5319a.getGroups(), this.f5320b);
            return Integer.valueOf(m60181p);
        }
        Object[] slots = this.f5319a.getSlots();
        m60175v = SlotTableKt.m60175v(this.f5319a.getGroups(), this.f5320b);
        Object obj = slots[m60175v];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        boolean m60182o;
        int m60176u;
        m60182o = SlotTableKt.m60182o(this.f5319a.getGroups(), this.f5320b);
        if (m60182o) {
            Object[] slots = this.f5319a.getSlots();
            m60176u = SlotTableKt.m60176u(this.f5319a.getGroups(), this.f5320b);
            return slots[m60176u];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int m60191f;
        int groupSize = this.f5320b + getGroupSize();
        if (groupSize < this.f5319a.getGroupsSize()) {
            slotsSize = SlotTableKt.m60191f(this.f5319a.getGroups(), groupSize);
        } else {
            slotsSize = this.f5319a.getSlotsSize();
        }
        m60191f = SlotTableKt.m60191f(this.f5319a.getGroups(), this.f5320b);
        return slotsSize - m60191f;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        boolean m60186k;
        int m60195b;
        m60186k = SlotTableKt.m60186k(this.f5319a.getGroups(), this.f5320b);
        if (!m60186k) {
            return null;
        }
        Object[] slots = this.f5319a.getSlots();
        m60195b = SlotTableKt.m60195b(this.f5319a.getGroups(), this.f5320b);
        Object obj = slots[m60195b];
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int m60188i;
        m60188i = SlotTableKt.m60188i(this.f5319a.getGroups(), this.f5320b);
        if (m60188i == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int m60188i;
        m66459a();
        SlotTable slotTable = this.f5319a;
        int i = this.f5320b;
        m60188i = SlotTableKt.m60188i(slotTable.getGroups(), this.f5320b);
        return new C19296c70(slotTable, i + 1, i + m60188i);
    }

    public /* synthetic */ RJ1(SlotTable slotTable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion$runtime_release() : i2);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable getCompositionGroups() {
        return this;
    }
}
