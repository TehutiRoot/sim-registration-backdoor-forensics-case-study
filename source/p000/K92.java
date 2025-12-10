package p000;

import com.google.android.gms.internal.vision.zzfi;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.clearcut.VisionClearcutLogger;

/* renamed from: K92 */
/* loaded from: classes4.dex */
public final class K92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3128a;

    /* renamed from: b */
    public final /* synthetic */ zzfi.zzo f3129b;

    /* renamed from: c */
    public final /* synthetic */ DynamiteClearcutLogger f3130c;

    public K92(DynamiteClearcutLogger dynamiteClearcutLogger, int i, zzfi.zzo zzoVar) {
        this.f3130c = dynamiteClearcutLogger;
        this.f3128a = i;
        this.f3129b = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VisionClearcutLogger visionClearcutLogger;
        visionClearcutLogger = this.f3130c.zzc;
        visionClearcutLogger.zza(this.f3128a, this.f3129b);
    }
}
