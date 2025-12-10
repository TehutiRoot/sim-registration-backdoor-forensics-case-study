package p000;

import android.view.View;
import com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent;

/* renamed from: v9 */
/* loaded from: classes5.dex */
public final class C16887v9 extends ViewLayoutChangeEvent {

    /* renamed from: a */
    public final View f108000a;

    /* renamed from: b */
    public final int f108001b;

    /* renamed from: c */
    public final int f108002c;

    /* renamed from: d */
    public final int f108003d;

    /* renamed from: e */
    public final int f108004e;

    /* renamed from: f */
    public final int f108005f;

    /* renamed from: g */
    public final int f108006g;

    /* renamed from: h */
    public final int f108007h;

    /* renamed from: i */
    public final int f108008i;

    public C16887v9(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null) {
            this.f108000a = view;
            this.f108001b = i;
            this.f108002c = i2;
            this.f108003d = i3;
            this.f108004e = i4;
            this.f108005f = i5;
            this.f108006g = i6;
            this.f108007h = i7;
            this.f108008i = i8;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int bottom() {
        return this.f108004e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewLayoutChangeEvent)) {
            return false;
        }
        ViewLayoutChangeEvent viewLayoutChangeEvent = (ViewLayoutChangeEvent) obj;
        if (this.f108000a.equals(viewLayoutChangeEvent.view()) && this.f108001b == viewLayoutChangeEvent.left() && this.f108002c == viewLayoutChangeEvent.top() && this.f108003d == viewLayoutChangeEvent.right() && this.f108004e == viewLayoutChangeEvent.bottom() && this.f108005f == viewLayoutChangeEvent.oldLeft() && this.f108006g == viewLayoutChangeEvent.oldTop() && this.f108007h == viewLayoutChangeEvent.oldRight() && this.f108008i == viewLayoutChangeEvent.oldBottom()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f108000a.hashCode() ^ 1000003) * 1000003) ^ this.f108001b) * 1000003) ^ this.f108002c) * 1000003) ^ this.f108003d) * 1000003) ^ this.f108004e) * 1000003) ^ this.f108005f) * 1000003) ^ this.f108006g) * 1000003) ^ this.f108007h) * 1000003) ^ this.f108008i;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int left() {
        return this.f108001b;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldBottom() {
        return this.f108008i;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldLeft() {
        return this.f108005f;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldRight() {
        return this.f108007h;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int oldTop() {
        return this.f108006g;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int right() {
        return this.f108003d;
    }

    public String toString() {
        return "ViewLayoutChangeEvent{view=" + this.f108000a + ", left=" + this.f108001b + ", top=" + this.f108002c + ", right=" + this.f108003d + ", bottom=" + this.f108004e + ", oldLeft=" + this.f108005f + ", oldTop=" + this.f108006g + ", oldRight=" + this.f108007h + ", oldBottom=" + this.f108008i + "}";
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public int top() {
        return this.f108002c;
    }

    @Override // com.jakewharton.rxbinding2.view.ViewLayoutChangeEvent
    public View view() {
        return this.f108000a;
    }
}