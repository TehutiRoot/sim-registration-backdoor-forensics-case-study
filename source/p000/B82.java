package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.Objects;

/* renamed from: B82 */
/* loaded from: classes3.dex */
public final class B82 {

    /* renamed from: a */
    public final ApiKey f309a;

    /* renamed from: b */
    public final Feature f310b;

    public /* synthetic */ B82(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.f309a = apiKey;
        this.f310b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof B82)) {
            B82 b82 = (B82) obj;
            if (Objects.equal(this.f309a, b82.f309a) && Objects.equal(this.f310b, b82.f310b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f309a, this.f310b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(Action.KEY_ATTRIBUTE, this.f309a).add("feature", this.f310b).toString();
    }
}
