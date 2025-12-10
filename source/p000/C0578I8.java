package p000;

import android.net.Uri;
import androidx.camera.video.OutputResults;

/* renamed from: I8 */
/* loaded from: classes.dex */
public final class C0578I8 extends OutputResults {

    /* renamed from: a */
    public final Uri f2415a;

    public C0578I8(Uri uri) {
        if (uri != null) {
            this.f2415a = uri;
            return;
        }
        throw new NullPointerException("Null outputUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputResults) {
            return this.f2415a.equals(((OutputResults) obj).getOutputUri());
        }
        return false;
    }

    @Override // androidx.camera.video.OutputResults
    public Uri getOutputUri() {
        return this.f2415a;
    }

    public int hashCode() {
        return this.f2415a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f2415a + "}";
    }
}
