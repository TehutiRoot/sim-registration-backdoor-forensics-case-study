package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent;

/* renamed from: j9 */
/* loaded from: classes5.dex */
public final class C11502j9 extends TextViewBeforeTextChangeEvent {

    /* renamed from: a */
    public final TextView f67242a;

    /* renamed from: b */
    public final CharSequence f67243b;

    /* renamed from: c */
    public final int f67244c;

    /* renamed from: d */
    public final int f67245d;

    /* renamed from: e */
    public final int f67246e;

    public C11502j9(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.f67242a = textView;
            if (charSequence != null) {
                this.f67243b = charSequence;
                this.f67244c = i;
                this.f67245d = i2;
                this.f67246e = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public int after() {
        return this.f67246e;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public int count() {
        return this.f67245d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewBeforeTextChangeEvent)) {
            return false;
        }
        TextViewBeforeTextChangeEvent textViewBeforeTextChangeEvent = (TextViewBeforeTextChangeEvent) obj;
        if (this.f67242a.equals(textViewBeforeTextChangeEvent.view()) && this.f67243b.equals(textViewBeforeTextChangeEvent.text()) && this.f67244c == textViewBeforeTextChangeEvent.start() && this.f67245d == textViewBeforeTextChangeEvent.count() && this.f67246e == textViewBeforeTextChangeEvent.after()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f67242a.hashCode() ^ 1000003) * 1000003) ^ this.f67243b.hashCode()) * 1000003) ^ this.f67244c) * 1000003) ^ this.f67245d) * 1000003) ^ this.f67246e;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public int start() {
        return this.f67244c;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public CharSequence text() {
        return this.f67243b;
    }

    public String toString() {
        return "TextViewBeforeTextChangeEvent{view=" + this.f67242a + ", text=" + ((Object) this.f67243b) + ", start=" + this.f67244c + ", count=" + this.f67245d + ", after=" + this.f67246e + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public TextView view() {
        return this.f67242a;
    }
}