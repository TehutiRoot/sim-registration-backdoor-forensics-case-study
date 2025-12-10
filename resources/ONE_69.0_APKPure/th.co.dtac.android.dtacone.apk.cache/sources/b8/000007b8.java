package p000;

import android.net.Uri;
import androidx.camera.video.OutputResults;

/* renamed from: I8 */
/* loaded from: classes.dex */
public final class C0568I8 extends OutputResults {

    /* renamed from: a */
    public final Uri f2584a;

    public C0568I8(Uri uri) {
        if (uri != null) {
            this.f2584a = uri;
            return;
        }
        throw new NullPointerException("Null outputUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputResults) {
            return this.f2584a.equals(((OutputResults) obj).getOutputUri());
        }
        return false;
    }

    @Override // androidx.camera.video.OutputResults
    public Uri getOutputUri() {
        return this.f2584a;
    }

    public int hashCode() {
        return this.f2584a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f2584a + "}";
    }
}