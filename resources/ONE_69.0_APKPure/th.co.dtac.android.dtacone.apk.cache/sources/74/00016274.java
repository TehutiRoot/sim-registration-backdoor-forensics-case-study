package p000;

import com.google.android.gms.internal.clearcut.zzcn;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23259yl2 extends AbstractC17945Kd2 {

    /* renamed from: c */
    public static final C23259yl2 f109150c;

    /* renamed from: b */
    public final List f109151b;

    static {
        C23259yl2 c23259yl2 = new C23259yl2();
        f109150c = c23259yl2;
        c23259yl2.zzv();
    }

    public C23259yl2() {
        this(new ArrayList(10));
    }

    /* renamed from: a */
    public static C23259yl2 m246a() {
        return f109150c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        zzw();
        this.f109151b.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f109151b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zzw();
        Object remove = this.f109151b.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzw();
        Object obj2 = this.f109151b.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109151b.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f109151b);
            return new C23259yl2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C23259yl2(List list) {
        this.f109151b = list;
    }
}