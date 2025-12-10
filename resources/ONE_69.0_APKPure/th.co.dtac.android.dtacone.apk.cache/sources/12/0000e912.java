package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent;

/* renamed from: l9 */
/* loaded from: classes5.dex */
public final class C12176l9 extends TextViewTextChangeEvent {

    /* renamed from: a */
    public final TextView f71592a;

    /* renamed from: b */
    public final CharSequence f71593b;

    /* renamed from: c */
    public final int f71594c;

    /* renamed from: d */
    public final int f71595d;

    /* renamed from: e */
    public final int f71596e;

    public C12176l9(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.f71592a = textView;
            if (charSequence != null) {
                this.f71593b = charSequence;
                this.f71594c = i;
                this.f71595d = i2;
                this.f71596e = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public int before() {
        return this.f71595d;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public int count() {
        return this.f71596e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewTextChangeEvent)) {
            return false;
        }
        TextViewTextChangeEvent textViewTextChangeEvent = (TextViewTextChangeEvent) obj;
        if (this.f71592a.equals(textViewTextChangeEvent.view()) && this.f71593b.equals(textViewTextChangeEvent.text()) && this.f71594c == textViewTextChangeEvent.start() && this.f71595d == textViewTextChangeEvent.before() && this.f71596e == textViewTextChangeEvent.count()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f71592a.hashCode() ^ 1000003) * 1000003) ^ this.f71593b.hashCode()) * 1000003) ^ this.f71594c) * 1000003) ^ this.f71595d) * 1000003) ^ this.f71596e;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public int start() {
        return this.f71594c;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public CharSequence text() {
        return this.f71593b;
    }

    public String toString() {
        return "TextViewTextChangeEvent{view=" + this.f71592a + ", text=" + ((Object) this.f71593b) + ", start=" + this.f71594c + ", before=" + this.f71595d + ", count=" + this.f71596e + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent
    public TextView view() {
        return this.f71592a;
    }
}