package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdv;
import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: zk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23429zk2 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzdv.m47071c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}