package p000;

import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;

/* renamed from: Ha2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC17741Ha2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2416a;

    /* renamed from: b */
    public final /* synthetic */ zzfi.zzo f2417b;

    /* renamed from: c */
    public final /* synthetic */ DynamiteClearcutLogger f2418c;

    public RunnableC17741Ha2(DynamiteClearcutLogger dynamiteClearcutLogger, int i, zzfi.zzo zzoVar) {
        this.f2418c = dynamiteClearcutLogger;
        this.f2416a = i;
        this.f2417b = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VisionClearcutLogger visionClearcutLogger;
        visionClearcutLogger = this.f2418c.zzc;
        visionClearcutLogger.zza(this.f2416a, this.f2417b);
    }
}