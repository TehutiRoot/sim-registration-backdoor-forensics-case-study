package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;

/* renamed from: di2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19567di2 extends zzdf {

    /* renamed from: a */
    public final byte[] f61263a;

    /* renamed from: b */
    public int f61264b;

    /* renamed from: c */
    public int f61265c;

    /* renamed from: d */
    public int f61266d;

    public /* synthetic */ C19567di2(byte[] bArr, int i, int i2, boolean z, zzdc zzdcVar) {
        super(null);
        this.f61266d = Integer.MAX_VALUE;
        this.f61263a = bArr;
        this.f61264b = 0;
    }

    /* renamed from: a */
    public final int m31792a(int i) {
        int i2 = this.f61266d;
        this.f61266d = 0;
        int i3 = this.f61264b + this.f61265c;
        this.f61264b = i3;
        if (i3 > 0) {
            this.f61265c = i3;
            this.f61264b = 0;
        } else {
            this.f61265c = 0;
        }
        return i2;
    }
}
