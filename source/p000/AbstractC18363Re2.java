package p000;

import com.google.android.gms.internal.mlkit_vision_face.C6580c;
import com.google.android.gms.internal.mlkit_vision_face.zzcj;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: Re2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18363Re2 extends AbstractC19733eg2 {
    /* renamed from: a */
    public abstract Map mo46799a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo46799a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo46799a().isEmpty();
    }

    @Override // p000.AbstractC19733eg2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzcj.m46787b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzcj.m46786c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC19733eg2, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                AbstractC17845Jc2.m67732a(size, "expectedSize");
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
            return ((C6580c) mo46799a()).f47068d.zzq().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo46799a().size();
    }
}
