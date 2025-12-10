package p000;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* renamed from: M92 */
/* loaded from: classes3.dex */
public final class M92 {

    /* renamed from: a */
    public final Uri f3820a;

    public M92(Uri uri) {
        this.f3820a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M92)) {
            return false;
        }
        return Objects.equal(((M92) obj).f3820a, this.f3820a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3820a);
    }
}