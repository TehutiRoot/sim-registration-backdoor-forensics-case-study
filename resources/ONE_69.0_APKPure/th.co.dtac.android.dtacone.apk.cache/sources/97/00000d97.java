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

/* renamed from: OK1 */
/* loaded from: classes2.dex */
public final class OK1 implements CompositionGroup, Iterable, KMappedMarker {

    /* renamed from: a */
    public final SlotTable f4431a;

    /* renamed from: b */
    public final int f4432b;

    /* renamed from: c */
    public final int f4433c;

    public OK1(SlotTable table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f4431a = table;
        this.f4432b = i;
        this.f4433c = i2;
    }

    /* renamed from: a */
    private final void m67120a() {
        if (this.f4431a.getVersion$runtime_release() == this.f4433c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        Anchor anchor;
        int anchorIndex;
        int i;
        int m60138i;
        Intrinsics.checkNotNullParameter(identityToFind, "identityToFind");
        if (identityToFind instanceof Anchor) {
            anchor = (Anchor) identityToFind;
        } else {
            anchor = null;
        }
        if (anchor == null || !this.f4431a.ownsAnchor(anchor) || (anchorIndex = this.f4431a.anchorIndex(anchor)) < (i = this.f4432b)) {
            return null;
        }
        int i2 = anchorIndex - i;
        m60138i = SlotTableKt.m60138i(this.f4431a.getGroups(), this.f4432b);
        if (i2 >= m60138i) {
            return null;
        }
        return new OK1(this.f4431a, anchorIndex, this.f4433c);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable getData() {
        return new C0573ID(this.f4431a, this.f4432b);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int m60138i;
        m60138i = SlotTableKt.m60138i(this.f4431a.getGroups(), this.f4432b);
        return m60138i;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        m67120a();
        SlotReader openReader = this.f4431a.openReader();
        try {
            return openReader.anchor(this.f4432b);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        boolean m60134m;
        int m60131p;
        int m60125v;
        m60134m = SlotTableKt.m60134m(this.f4431a.getGroups(), this.f4432b);
        if (!m60134m) {
            m60131p = SlotTableKt.m60131p(this.f4431a.getGroups(), this.f4432b);
            return Integer.valueOf(m60131p);
        }
        Object[] slots = this.f4431a.getSlots();
        m60125v = SlotTableKt.m60125v(this.f4431a.getGroups(), this.f4432b);
        Object obj = slots[m60125v];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        boolean m60132o;
        int m60126u;
        m60132o = SlotTableKt.m60132o(this.f4431a.getGroups(), this.f4432b);
        if (m60132o) {
            Object[] slots = this.f4431a.getSlots();
            m60126u = SlotTableKt.m60126u(this.f4431a.getGroups(), this.f4432b);
            return slots[m60126u];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int m60141f;
        int groupSize = this.f4432b + getGroupSize();
        if (groupSize < this.f4431a.getGroupsSize()) {
            slotsSize = SlotTableKt.m60141f(this.f4431a.getGroups(), groupSize);
        } else {
            slotsSize = this.f4431a.getSlotsSize();
        }
        m60141f = SlotTableKt.m60141f(this.f4431a.getGroups(), this.f4432b);
        return slotsSize - m60141f;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        boolean m60136k;
        int m60145b;
        m60136k = SlotTableKt.m60136k(this.f4431a.getGroups(), this.f4432b);
        if (!m60136k) {
            return null;
        }
        Object[] slots = this.f4431a.getSlots();
        m60145b = SlotTableKt.m60145b(this.f4431a.getGroups(), this.f4432b);
        Object obj = slots[m60145b];
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int m60138i;
        m60138i = SlotTableKt.m60138i(this.f4431a.getGroups(), this.f4432b);
        if (m60138i == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int m60138i;
        m67120a();
        SlotTable slotTable = this.f4431a;
        int i = this.f4432b;
        m60138i = SlotTableKt.m60138i(slotTable.getGroups(), this.f4432b);
        return new C20382i70(slotTable, i + 1, i + m60138i);
    }

    public /* synthetic */ OK1(SlotTable slotTable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion$runtime_release() : i2);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable getCompositionGroups() {
        return this;
    }
}