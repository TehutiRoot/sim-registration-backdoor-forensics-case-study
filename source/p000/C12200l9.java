package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent;

/* renamed from: l9 */
/* loaded from: classes5.dex */
public final class C12200l9 extends TextViewTextChangeEvent {

    /* renamed from: a */
    public final TextView f71544a;

    /* renamed from: b */
    public final CharSequence f71545b;

    /* renamed from: c */
    public final int f71546c;

    /* renamed from: d */
    public final int f71547d;

    /* renamed from: e */
    public final int f71548e;

    public C12200l9(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.f71544a = textView;
            if (charSequence != null) {
                this.f71545b = charSequence;
                this.f71546c = i;
                this.f71547d = i2;
                this.f71548e = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public int before() {
        return this.f71547d;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public int count() {
        return this.f71548e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewTextChangeEvent)) {
            return false;
        }
        TextViewTextChangeEvent textViewTextChangeEvent = (TextViewTextChangeEvent) obj;
        if (this.f71544a.equals(textViewTextChangeEvent.view()) && this.f71545b.equals(textViewTextChangeEvent.text()) && this.f71546c == textViewTextChangeEvent.start() && this.f71547d == textViewTextChangeEvent.before() && this.f71548e == textViewTextChangeEvent.count()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f71544a.hashCode() ^ 1000003) * 1000003) ^ this.f71545b.hashCode()) * 1000003) ^ this.f71546c) * 1000003) ^ this.f71547d) * 1000003) ^ this.f71548e;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public int start() {
        return this.f71546c;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public CharSequence text() {
        return this.f71545b;
    }

    public String toString() {
        return "TextViewTextChangeEvent{view=" + this.f71544a + ", text=" + ((Object) this.f71545b) + ", start=" + this.f71546c + ", before=" + this.f71547d + ", count=" + this.f71548e + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public TextView view() {
        return this.f71544a;
    }
}
