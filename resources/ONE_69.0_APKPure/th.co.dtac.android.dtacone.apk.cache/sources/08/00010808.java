package p000;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22024rd2 implements Iterator {

    /* renamed from: a */
    public int f77560a = 0;

    /* renamed from: b */
    public final /* synthetic */ zzat f77561b;

    public C22024rd2(zzat zzatVar) {
        this.f77561b = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f77560a;
        str = this.f77561b.f46252a;
        if (i < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i = this.f77560a;
        str = this.f77561b.f46252a;
        if (i < str.length()) {
            this.f77560a = i + 1;
            return new zzat(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}