package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcl;
import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: fh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19960fh2 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzcl.m46704b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}