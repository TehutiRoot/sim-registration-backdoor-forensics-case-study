package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.C6598c;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: df2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19558df2 extends AbstractC20421ig2 {
    /* renamed from: a */
    public abstract Map mo31803a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo31803a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo31803a().isEmpty();
    }

    @Override // p000.AbstractC20421ig2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzcl.m46713b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzcl.m46712c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC20421ig2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC21441oc2.m25901a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) Math.ceil(size / 0.75d);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C6598c) mo31803a()).f47268d.zzo().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo31803a().size();
    }
}
