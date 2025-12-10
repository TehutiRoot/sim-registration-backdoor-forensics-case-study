package p000;

import com.google.android.gms.internal.clearcut.zzcn;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Bk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17357Bk2 extends AbstractC18101Nc2 {

    /* renamed from: c */
    public static final C17357Bk2 f499c;

    /* renamed from: b */
    public final List f500b;

    static {
        C17357Bk2 c17357Bk2 = new C17357Bk2();
        f499c = c17357Bk2;
        c17357Bk2.zzv();
    }

    public C17357Bk2() {
        this(new ArrayList(10));
    }

    /* renamed from: a */
    public static C17357Bk2 m68880a() {
        return f499c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        zzw();
        this.f500b.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f500b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zzw();
        Object remove = this.f500b.remove(i);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzw();
        Object obj2 = this.f500b.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f500b.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f500b);
            return new C17357Bk2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public C17357Bk2(List list) {
        this.f500b = list;
    }
}
