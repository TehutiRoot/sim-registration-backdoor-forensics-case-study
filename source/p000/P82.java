package p000;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* renamed from: P82 */
/* loaded from: classes3.dex */
public final class P82 {

    /* renamed from: a */
    public final Uri f4657a;

    public P82(Uri uri) {
        this.f4657a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P82)) {
            return false;
        }
        return Objects.equal(((P82) obj).f4657a, this.f4657a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f4657a);
    }
}
