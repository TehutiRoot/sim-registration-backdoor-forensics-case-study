package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.C6543d;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdv;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ji2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20599ji2 extends AbstractC17418Cj2 {
    /* renamed from: a */
    public abstract Map mo29147a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo29147a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo29147a().isEmpty();
    }

    @Override // p000.AbstractC17418Cj2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzdv.m47062c(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzdv.m47061d(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC17418Cj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                AbstractC18430Sf2.m66311a(size, "expectedSize");
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
            return ((C6543d) mo29147a()).f46525d.zzw().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo29147a().size();
    }
}
