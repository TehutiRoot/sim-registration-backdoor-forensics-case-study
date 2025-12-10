package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* renamed from: HL2 */
/* loaded from: classes3.dex */
public final class HL2 {

    /* renamed from: a */
    public String f2200a = null;

    /* renamed from: b */
    public long f2201b = -1;

    /* renamed from: c */
    public zzag f2202c = zzag.zzl();

    /* renamed from: d */
    public zzag f2203d = zzag.zzl();

    /* renamed from: a */
    public final HL2 m68104a(long j) {
        this.f2201b = j;
        return this;
    }

    /* renamed from: b */
    public final HL2 m68103b(List list) {
        Preconditions.checkNotNull(list);
        this.f2203d = zzag.zzk(list);
        return this;
    }

    /* renamed from: c */
    public final HL2 m68102c(List list) {
        Preconditions.checkNotNull(list);
        this.f2202c = zzag.zzk(list);
        return this;
    }

    /* renamed from: d */
    public final HL2 m68101d(String str) {
        this.f2200a = str;
        return this;
    }

    /* renamed from: e */
    public final C17967La2 m68100e() {
        if (this.f2200a != null) {
            if (this.f2201b >= 0) {
                if (this.f2202c.isEmpty() && this.f2203d.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new C17967La2(this.f2200a, this.f2201b, this.f2202c, this.f2203d, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}
