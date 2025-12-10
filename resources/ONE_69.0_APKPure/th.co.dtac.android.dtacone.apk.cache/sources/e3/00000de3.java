package p000;

import com.google.android.gms.internal.mlkit_vision_face.C6569c;
import com.google.android.gms.internal.mlkit_vision_face.zzcj;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: Of2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18211Of2 extends AbstractC19268bh2 {
    /* renamed from: a */
    public abstract Map mo46791a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo46791a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo46791a().isEmpty();
    }

    @Override // p000.AbstractC19268bh2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzcj.m46779b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzcj.m46778c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC19268bh2, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                AbstractC17685Gd2.m68264a(size, "expectedSize");
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
            return ((C6569c) mo46791a()).f47080d.zzq().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo46791a().size();
    }
}