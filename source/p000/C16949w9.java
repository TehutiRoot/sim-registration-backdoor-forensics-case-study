package p000;

import android.view.View;
import com.jakewharton.rxbinding2.view.ViewScrollChangeEvent;

/* renamed from: w9 */
/* loaded from: classes5.dex */
public final class C16949w9 extends ViewScrollChangeEvent {

    /* renamed from: a */
    public final View f107920a;

    /* renamed from: b */
    public final int f107921b;

    /* renamed from: c */
    public final int f107922c;

    /* renamed from: d */
    public final int f107923d;

    /* renamed from: e */
    public final int f107924e;

    public C16949w9(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            this.f107920a = view;
            this.f107921b = i;
            this.f107922c = i2;
            this.f107923d = i3;
            this.f107924e = i4;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewScrollChangeEvent)) {
            return false;
        }
        ViewScrollChangeEvent viewScrollChangeEvent = (ViewScrollChangeEvent) obj;
        if (this.f107920a.equals(viewScrollChangeEvent.view()) && this.f107921b == viewScrollChangeEvent.scrollX() && this.f107922c == viewScrollChangeEvent.scrollY() && this.f107923d == viewScrollChangeEvent.oldScrollX() && this.f107924e == viewScrollChangeEvent.oldScrollY()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f107920a.hashCode() ^ 1000003) * 1000003) ^ this.f107921b) * 1000003) ^ this.f107922c) * 1000003) ^ this.f107923d) * 1000003) ^ this.f107924e;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int oldScrollX() {
        return this.f107923d;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int oldScrollY() {
        return this.f107924e;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int scrollX() {
        return this.f107921b;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int scrollY() {
        return this.f107922c;
    }

    public String toString() {
        return "ViewScrollChangeEvent{view=" + this.f107920a + ", scrollX=" + this.f107921b + ", scrollY=" + this.f107922c + ", oldScrollX=" + this.f107923d + ", oldScrollY=" + this.f107924e + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public View view() {
        return this.f107920a;
    }
}
