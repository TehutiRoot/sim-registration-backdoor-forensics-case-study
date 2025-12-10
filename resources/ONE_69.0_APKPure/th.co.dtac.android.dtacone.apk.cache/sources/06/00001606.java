package p000;

import android.view.View;
import android.view.WindowId;

/* renamed from: X42 */
/* loaded from: classes2.dex */
public class X42 implements Y42 {

    /* renamed from: a */
    public final WindowId f7464a;

    public X42(View view) {
        this.f7464a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof X42) && ((X42) obj).f7464a.equals(this.f7464a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7464a.hashCode();
    }
}