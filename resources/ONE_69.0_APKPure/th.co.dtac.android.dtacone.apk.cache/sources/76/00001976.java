package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;

/* renamed from: aj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19096aj2 extends zzdf {

    /* renamed from: a */
    public final byte[] f8494a;

    /* renamed from: b */
    public int f8495b;

    /* renamed from: c */
    public int f8496c;

    /* renamed from: d */
    public int f8497d;

    public /* synthetic */ C19096aj2(byte[] bArr, int i, int i2, boolean z, zzdc zzdcVar) {
        super(null);
        this.f8497d = Integer.MAX_VALUE;
        this.f8494a = bArr;
        this.f8495b = 0;
    }

    /* renamed from: a */
    public final int m65065a(int i) {
        int i2 = this.f8497d;
        this.f8497d = 0;
        int i3 = this.f8495b + this.f8496c;
        this.f8495b = i3;
        if (i3 > 0) {
            this.f8496c = i3;
            this.f8495b = 0;
        } else {
            this.f8496c = 0;
        }
        return i2;
    }
}