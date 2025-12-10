package p000;

import com.google.android.gms.internal.firebase_ml.zzlw;
import com.google.android.gms.internal.firebase_ml.zzmn;

/* renamed from: aI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19028aI2 extends AbstractC19892fG2 {

    /* renamed from: c */
    public final CharSequence f8402c;

    /* renamed from: d */
    public final zzlw f8403d;

    /* renamed from: e */
    public final boolean f8404e;

    /* renamed from: f */
    public int f8405f = 0;

    /* renamed from: g */
    public int f8406g;

    public AbstractC19028aI2(zzmn zzmnVar, CharSequence charSequence) {
        zzlw zzlwVar;
        int i;
        zzlwVar = zzmnVar.f45961a;
        this.f8403d = zzlwVar;
        this.f8404e = false;
        i = zzmnVar.f45964d;
        this.f8406g = i;
        this.f8402c = charSequence;
    }

    @Override // p000.AbstractC19892fG2
    /* renamed from: a */
    public final /* synthetic */ Object mo31544a() {
        int i = this.f8405f;
        while (true) {
            int i2 = this.f8405f;
            if (i2 != -1) {
                int mo31852c = mo31852c(i2);
                if (mo31852c == -1) {
                    mo31852c = this.f8402c.length();
                    this.f8405f = -1;
                } else {
                    this.f8405f = mo31851d(mo31852c);
                }
                int i3 = this.f8405f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f8405f = i4;
                    if (i4 > this.f8402c.length()) {
                        this.f8405f = -1;
                    }
                } else {
                    while (i < mo31852c && this.f8403d.zzb(this.f8402c.charAt(i))) {
                        i++;
                    }
                    while (mo31852c > i && this.f8403d.zzb(this.f8402c.charAt(mo31852c - 1))) {
                        mo31852c--;
                    }
                    int i5 = this.f8406g;
                    if (i5 == 1) {
                        mo31852c = this.f8402c.length();
                        this.f8405f = -1;
                        while (mo31852c > i && this.f8403d.zzb(this.f8402c.charAt(mo31852c - 1))) {
                            mo31852c--;
                        }
                    } else {
                        this.f8406g = i5 - 1;
                    }
                    return this.f8402c.subSequence(i, mo31852c).toString();
                }
            } else {
                m31543b();
                return null;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo31852c(int i);

    /* renamed from: d */
    public abstract int mo31851d(int i);
}