package p000;

import com.google.android.gms.internal.firebase_ml.zzlw;
import com.google.android.gms.internal.firebase_ml.zzmn;

/* renamed from: dH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19500dH2 extends AbstractC20354iF2 {

    /* renamed from: c */
    public final CharSequence f61121c;

    /* renamed from: d */
    public final zzlw f61122d;

    /* renamed from: e */
    public final boolean f61123e;

    /* renamed from: f */
    public int f61124f = 0;

    /* renamed from: g */
    public int f61125g;

    public AbstractC19500dH2(zzmn zzmnVar, CharSequence charSequence) {
        zzlw zzlwVar;
        int i;
        zzlwVar = zzmnVar.f45949a;
        this.f61122d = zzlwVar;
        this.f61123e = false;
        i = zzmnVar.f45952d;
        this.f61125g = i;
        this.f61121c = charSequence;
    }

    @Override // p000.AbstractC20354iF2
    /* renamed from: a */
    public final /* synthetic */ Object mo30658a() {
        int i = this.f61124f;
        while (true) {
            int i2 = this.f61124f;
            if (i2 != -1) {
                int mo31156c = mo31156c(i2);
                if (mo31156c == -1) {
                    mo31156c = this.f61121c.length();
                    this.f61124f = -1;
                } else {
                    this.f61124f = mo31155d(mo31156c);
                }
                int i3 = this.f61124f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f61124f = i4;
                    if (i4 > this.f61121c.length()) {
                        this.f61124f = -1;
                    }
                } else {
                    while (i < mo31156c && this.f61122d.zzb(this.f61121c.charAt(i))) {
                        i++;
                    }
                    while (mo31156c > i && this.f61122d.zzb(this.f61121c.charAt(mo31156c - 1))) {
                        mo31156c--;
                    }
                    int i5 = this.f61125g;
                    if (i5 == 1) {
                        mo31156c = this.f61121c.length();
                        this.f61124f = -1;
                        while (mo31156c > i && this.f61122d.zzb(this.f61121c.charAt(mo31156c - 1))) {
                            mo31156c--;
                        }
                    } else {
                        this.f61125g = i5 - 1;
                    }
                    return this.f61121c.subSequence(i, mo31156c).toString();
                }
            } else {
                m30657b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo31156c(int i);

    /* renamed from: d */
    public abstract int mo31155d(int i);
}
