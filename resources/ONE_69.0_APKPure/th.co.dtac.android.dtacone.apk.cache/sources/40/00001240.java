package p000;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzjh;

/* renamed from: TA2 */
/* loaded from: classes3.dex */
public final class TA2 extends zzjh {

    /* renamed from: a */
    public final byte[] f6281a;

    /* renamed from: b */
    public int f6282b;

    /* renamed from: c */
    public int f6283c;

    /* renamed from: d */
    public int f6284d;

    public /* synthetic */ TA2(byte[] bArr, int i, int i2, boolean z, zzje zzjeVar) {
        super(null);
        this.f6284d = Integer.MAX_VALUE;
        this.f6281a = bArr;
        this.f6282b = 0;
    }

    /* renamed from: a */
    public final int m66366a(int i) {
        int i2 = this.f6284d;
        this.f6284d = 0;
        int i3 = this.f6282b + this.f6283c;
        this.f6282b = i3;
        if (i3 > 0) {
            this.f6283c = i3;
            this.f6282b = 0;
        } else {
            this.f6283c = 0;
        }
        return i2;
    }
}