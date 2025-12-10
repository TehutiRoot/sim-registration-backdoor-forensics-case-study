package p000;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_vision_barcode.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzus;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20025gK2 implements zzek {

    /* renamed from: a */
    public final /* synthetic */ zzpk f62139a;

    /* renamed from: b */
    public final /* synthetic */ float f62140b;

    /* renamed from: c */
    public final /* synthetic */ zzuv f62141c;

    /* renamed from: d */
    public final /* synthetic */ float f62142d;

    /* renamed from: e */
    public final /* synthetic */ zzus f62143e;

    public C20025gK2(zzus zzusVar, zzpk zzpkVar, float f, zzuv zzuvVar, float f2) {
        this.f62143e = zzusVar;
        this.f62139a = zzpkVar;
        this.f62140b = f;
        this.f62141c = zzuvVar;
        this.f62142d = f2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final void zza(Throwable th2) {
        GmsLogger gmsLogger;
        AtomicBoolean atomicBoolean;
        gmsLogger = zzus.f46740s;
        float f = this.f62142d;
        gmsLogger.m48399w("AutoZoom", "Unable to set zoom to " + f, th2);
        atomicBoolean = this.f62143e.f46742b;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        Float f = (Float) obj;
        if (f.floatValue() >= 1.0f) {
            zzus.m46975d(this.f62143e, f.floatValue());
            this.f62143e.m46971h(this.f62139a, this.f62140b, f.floatValue(), this.f62141c);
        }
        atomicBoolean = this.f62143e.f46742b;
        atomicBoolean.set(false);
    }
}
