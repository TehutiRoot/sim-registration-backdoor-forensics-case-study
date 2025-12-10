package p000;

import android.view.View;
import com.jakewharton.rxbinding2.view.ViewScrollChangeEvent;

/* renamed from: w9 */
/* loaded from: classes5.dex */
public final class C16959w9 extends ViewScrollChangeEvent {

    /* renamed from: a */
    public final View f108345a;

    /* renamed from: b */
    public final int f108346b;

    /* renamed from: c */
    public final int f108347c;

    /* renamed from: d */
    public final int f108348d;

    /* renamed from: e */
    public final int f108349e;

    public C16959w9(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            this.f108345a = view;
            this.f108346b = i;
            this.f108347c = i2;
            this.f108348d = i3;
            this.f108349e = i4;
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
        if (this.f108345a.equals(viewScrollChangeEvent.view()) && this.f108346b == viewScrollChangeEvent.scrollX() && this.f108347c == viewScrollChangeEvent.scrollY() && this.f108348d == viewScrollChangeEvent.oldScrollX() && this.f108349e == viewScrollChangeEvent.oldScrollY()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f108345a.hashCode() ^ 1000003) * 1000003) ^ this.f108346b) * 1000003) ^ this.f108347c) * 1000003) ^ this.f108348d) * 1000003) ^ this.f108349e;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int oldScrollX() {
        return this.f108348d;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int oldScrollY() {
        return this.f108349e;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int scrollX() {
        return this.f108346b;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public int scrollY() {
        return this.f108347c;
    }

    public String toString() {
        return "ViewScrollChangeEvent{view=" + this.f108345a + ", scrollX=" + this.f108346b + ", scrollY=" + this.f108347c + ", oldScrollX=" + this.f108348d + ", oldScrollY=" + this.f108349e + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewScrollChangeEvent
    public View view() {
        return this.f108345a;
    }
}