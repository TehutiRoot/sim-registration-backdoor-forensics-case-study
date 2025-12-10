package p000;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: vc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22645vc2 implements Iterator {

    /* renamed from: a */
    public int f107726a = 0;

    /* renamed from: b */
    public final /* synthetic */ zzat f107727b;

    public C22645vc2(zzat zzatVar) {
        this.f107727b = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f107726a;
        str = this.f107727b.f46240a;
        if (i < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.f107726a;
        zzat zzatVar = this.f107727b;
        str = zzatVar.f46240a;
        if (i < str.length()) {
            str2 = zzatVar.f46240a;
            this.f107726a = i + 1;
            return new zzat(String.valueOf(str2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
