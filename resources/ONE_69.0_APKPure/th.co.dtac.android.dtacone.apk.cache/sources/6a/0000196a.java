package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.C6587c;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ag2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19087ag2 extends AbstractC19960fh2 {
    /* renamed from: a */
    public abstract Map mo46716a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo46716a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo46716a().isEmpty();
    }

    @Override // p000.AbstractC19960fh2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return zzcl.m46704b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return zzcl.m46703c(this, collection.iterator());
        }
    }

    @Override // p000.AbstractC19960fh2, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                AbstractC20986ld2.m26795a(size, "expectedSize");
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
            return ((C6587c) mo46716a()).f47280d.zzo().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo46716a().size();
    }
}