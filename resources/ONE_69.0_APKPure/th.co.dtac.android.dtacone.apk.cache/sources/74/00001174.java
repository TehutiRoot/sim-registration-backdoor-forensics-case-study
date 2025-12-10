package p000;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: SM1 */
/* loaded from: classes2.dex */
public abstract class SM1 {

    /* renamed from: a */
    public final SnapshotStateMap f5817a;

    /* renamed from: b */
    public final Iterator f5818b;

    /* renamed from: c */
    public int f5819c;

    /* renamed from: d */
    public Map.Entry f5820d;

    /* renamed from: e */
    public Map.Entry f5821e;

    public SM1(SnapshotStateMap map, Iterator iterator) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f5817a = map;
        this.f5818b = iterator;
        this.f5819c = map.getModification$runtime_release();
        m66507c();
    }

    /* renamed from: c */
    public final void m66507c() {
        Map.Entry entry;
        this.f5820d = this.f5821e;
        if (this.f5818b.hasNext()) {
            entry = (Map.Entry) this.f5818b.next();
        } else {
            entry = null;
        }
        this.f5821e = entry;
    }

    /* renamed from: e */
    public final Map.Entry m66506e() {
        return this.f5820d;
    }

    /* renamed from: f */
    public final SnapshotStateMap m66505f() {
        return this.f5817a;
    }

    /* renamed from: g */
    public final Map.Entry m66504g() {
        return this.f5821e;
    }

    public final boolean hasNext() {
        if (this.f5821e != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (m66505f().getModification$runtime_release() == this.f5819c) {
            Map.Entry entry = this.f5820d;
            if (entry != null) {
                this.f5817a.remove(entry.getKey());
                this.f5820d = null;
                Unit unit = Unit.INSTANCE;
                this.f5819c = m66505f().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}