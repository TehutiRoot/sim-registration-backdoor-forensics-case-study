package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* renamed from: EM2 */
/* loaded from: classes3.dex */
public final class EM2 {

    /* renamed from: a */
    public String f1343a = null;

    /* renamed from: b */
    public long f1344b = -1;

    /* renamed from: c */
    public zzag f1345c = zzag.zzl();

    /* renamed from: d */
    public zzag f1346d = zzag.zzl();

    /* renamed from: a */
    public final EM2 m68663a(long j) {
        this.f1344b = j;
        return this;
    }

    /* renamed from: b */
    public final EM2 m68662b(List list) {
        Preconditions.checkNotNull(list);
        this.f1346d = zzag.zzk(list);
        return this;
    }

    /* renamed from: c */
    public final EM2 m68661c(List list) {
        Preconditions.checkNotNull(list);
        this.f1345c = zzag.zzk(list);
        return this;
    }

    /* renamed from: d */
    public final EM2 m68660d(String str) {
        this.f1343a = str;
        return this;
    }

    /* renamed from: e */
    public final C17809Ib2 m68659e() {
        if (this.f1343a != null) {
            if (this.f1344b >= 0) {
                if (this.f1345c.isEmpty() && this.f1346d.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new C17809Ib2(this.f1343a, this.f1344b, this.f1345c, this.f1346d, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}