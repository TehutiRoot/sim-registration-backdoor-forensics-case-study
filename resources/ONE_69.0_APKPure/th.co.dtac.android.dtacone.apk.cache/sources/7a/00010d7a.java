package p000;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: sd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22197sd2 implements Iterator {

    /* renamed from: a */
    public int f79936a = 0;

    /* renamed from: b */
    public final /* synthetic */ zzat f79937b;

    public C22197sd2(zzat zzatVar) {
        this.f79937b = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f79936a;
        str = this.f79937b.f46252a;
        if (i < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.f79936a;
        zzat zzatVar = this.f79937b;
        str = zzatVar.f46252a;
        if (i < str.length()) {
            str2 = zzatVar.f46252a;
            this.f79936a = i + 1;
            return new zzat(String.valueOf(str2.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}