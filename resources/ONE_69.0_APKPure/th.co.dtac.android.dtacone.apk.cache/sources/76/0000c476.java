package p000;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_vision_barcode.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzus;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19561dL2 implements zzek {

    /* renamed from: a */
    public final /* synthetic */ zzpk f61211a;

    /* renamed from: b */
    public final /* synthetic */ float f61212b;

    /* renamed from: c */
    public final /* synthetic */ zzuv f61213c;

    /* renamed from: d */
    public final /* synthetic */ float f61214d;

    /* renamed from: e */
    public final /* synthetic */ zzus f61215e;

    public C19561dL2(zzus zzusVar, zzpk zzpkVar, float f, zzuv zzuvVar, float f2) {
        this.f61215e = zzusVar;
        this.f61211a = zzpkVar;
        this.f61212b = f;
        this.f61213c = zzuvVar;
        this.f61214d = f2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final void zza(Throwable th2) {
        GmsLogger gmsLogger;
        AtomicBoolean atomicBoolean;
        gmsLogger = zzus.f46752s;
        float f = this.f61214d;
        gmsLogger.m48396w("AutoZoom", "Unable to set zoom to " + f, th2);
        atomicBoolean = this.f61215e.f46754b;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        Float f = (Float) obj;
        if (f.floatValue() >= 1.0f) {
            zzus.m46984d(this.f61215e, f.floatValue());
            this.f61215e.m46980h(this.f61211a, this.f61212b, f.floatValue(), this.f61213c);
        }
        atomicBoolean = this.f61215e.f46754b;
        atomicBoolean.set(false);
    }
}