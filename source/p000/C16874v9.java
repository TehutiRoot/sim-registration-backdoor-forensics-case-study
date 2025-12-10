package p000;

import android.view.View;
import com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent;

/* renamed from: v9 */
/* loaded from: classes5.dex */
public final class C16874v9 extends ViewLayoutChangeEvent {

    /* renamed from: a */
    public final View f107586a;

    /* renamed from: b */
    public final int f107587b;

    /* renamed from: c */
    public final int f107588c;

    /* renamed from: d */
    public final int f107589d;

    /* renamed from: e */
    public final int f107590e;

    /* renamed from: f */
    public final int f107591f;

    /* renamed from: g */
    public final int f107592g;

    /* renamed from: h */
    public final int f107593h;

    /* renamed from: i */
    public final int f107594i;

    public C16874v9(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null) {
            this.f107586a = view;
            this.f107587b = i;
            this.f107588c = i2;
            this.f107589d = i3;
            this.f107590e = i4;
            this.f107591f = i5;
            this.f107592g = i6;
            this.f107593h = i7;
            this.f107594i = i8;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int bottom() {
        return this.f107590e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewLayoutChangeEvent)) {
            return false;
        }
        ViewLayoutChangeEvent viewLayoutChangeEvent = (ViewLayoutChangeEvent) obj;
        if (this.f107586a.equals(viewLayoutChangeEvent.view()) && this.f107587b == viewLayoutChangeEvent.left() && this.f107588c == viewLayoutChangeEvent.top() && this.f107589d == viewLayoutChangeEvent.right() && this.f107590e == viewLayoutChangeEvent.bottom() && this.f107591f == viewLayoutChangeEvent.oldLeft() && this.f107592g == viewLayoutChangeEvent.oldTop() && this.f107593h == viewLayoutChangeEvent.oldRight() && this.f107594i == viewLayoutChangeEvent.oldBottom()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f107586a.hashCode() ^ 1000003) * 1000003) ^ this.f107587b) * 1000003) ^ this.f107588c) * 1000003) ^ this.f107589d) * 1000003) ^ this.f107590e) * 1000003) ^ this.f107591f) * 1000003) ^ this.f107592g) * 1000003) ^ this.f107593h) * 1000003) ^ this.f107594i;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int left() {
        return this.f107587b;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldBottom() {
        return this.f107594i;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldLeft() {
        return this.f107591f;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldRight() {
        return this.f107593h;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldTop() {
        return this.f107592g;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int right() {
        return this.f107589d;
    }

    public String toString() {
        return "ViewLayoutChangeEvent{view=" + this.f107586a + ", left=" + this.f107587b + ", top=" + this.f107588c + ", right=" + this.f107589d + ", bottom=" + this.f107590e + ", oldLeft=" + this.f107591f + ", oldTop=" + this.f107592g + ", oldRight=" + this.f107593h + ", oldBottom=" + this.f107594i + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int top() {
        return this.f107588c;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public View view() {
        return this.f107586a;
    }
}
