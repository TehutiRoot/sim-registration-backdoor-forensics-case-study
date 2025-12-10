package p000;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: VL1 */
/* loaded from: classes2.dex */
public abstract class VL1 {

    /* renamed from: a */
    public final SnapshotStateMap f6626a;

    /* renamed from: b */
    public final Iterator f6627b;

    /* renamed from: c */
    public int f6628c;

    /* renamed from: d */
    public Map.Entry f6629d;

    /* renamed from: e */
    public Map.Entry f6630e;

    public VL1(SnapshotStateMap map, Iterator iterator) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f6626a = map;
        this.f6627b = iterator;
        this.f6628c = map.getModification$runtime_release();
        m65858c();
    }

    /* renamed from: c */
    public final void m65858c() {
        Map.Entry entry;
        this.f6629d = this.f6630e;
        if (this.f6627b.hasNext()) {
            entry = (Map.Entry) this.f6627b.next();
        } else {
            entry = null;
        }
        this.f6630e = entry;
    }

    /* renamed from: e */
    public final Map.Entry m65857e() {
        return this.f6629d;
    }

    /* renamed from: f */
    public final SnapshotStateMap m65856f() {
        return this.f6626a;
    }

    /* renamed from: g */
    public final Map.Entry m65855g() {
        return this.f6630e;
    }

    public final boolean hasNext() {
        if (this.f6630e != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (m65856f().getModification$runtime_release() == this.f6628c) {
            Map.Entry entry = this.f6629d;
            if (entry != null) {
                this.f6626a.remove(entry.getKey());
                this.f6629d = null;
                Unit unit = Unit.INSTANCE;
                this.f6628c = m65856f().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
