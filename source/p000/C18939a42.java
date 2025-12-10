package p000;

import android.view.View;
import android.view.WindowId;

/* renamed from: a42  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18939a42 implements InterfaceC19117b42 {

    /* renamed from: a */
    public final WindowId f8226a;

    public C18939a42(View view) {
        this.f8226a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C18939a42) && ((C18939a42) obj).f8226a.equals(this.f8226a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8226a.hashCode();
    }
}
