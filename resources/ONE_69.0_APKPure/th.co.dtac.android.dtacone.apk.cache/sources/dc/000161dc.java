package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.Objects;

/* renamed from: y92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23158y92 {

    /* renamed from: a */
    public final ApiKey f108954a;

    /* renamed from: b */
    public final Feature f108955b;

    public /* synthetic */ C23158y92(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.f108954a = apiKey;
        this.f108955b = feature;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Feature m417a(C23158y92 c23158y92) {
        return c23158y92.f108955b;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ ApiKey m416b(C23158y92 c23158y92) {
        return c23158y92.f108954a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C23158y92)) {
            C23158y92 c23158y92 = (C23158y92) obj;
            if (Objects.equal(this.f108954a, c23158y92.f108954a) && Objects.equal(this.f108955b, c23158y92.f108955b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f108954a, this.f108955b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(Action.KEY_ATTRIBUTE, this.f108954a).add("feature", this.f108955b).toString();
    }
}