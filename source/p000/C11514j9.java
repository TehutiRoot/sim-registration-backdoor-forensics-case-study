package p000;

import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent;

/* renamed from: j9 */
/* loaded from: classes5.dex */
public final class C11514j9 extends TextViewBeforeTextChangeEvent {

    /* renamed from: a */
    public final TextView f67181a;

    /* renamed from: b */
    public final CharSequence f67182b;

    /* renamed from: c */
    public final int f67183c;

    /* renamed from: d */
    public final int f67184d;

    /* renamed from: e */
    public final int f67185e;

    public C11514j9(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        if (textView != null) {
            this.f67181a = textView;
            if (charSequence != null) {
                this.f67182b = charSequence;
                this.f67183c = i;
                this.f67184d = i2;
                this.f67185e = i3;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public int after() {
        return this.f67185e;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public int count() {
        return this.f67184d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewBeforeTextChangeEvent)) {
            return false;
        }
        TextViewBeforeTextChangeEvent textViewBeforeTextChangeEvent = (TextViewBeforeTextChangeEvent) obj;
        if (this.f67181a.equals(textViewBeforeTextChangeEvent.view()) && this.f67182b.equals(textViewBeforeTextChangeEvent.text()) && this.f67183c == textViewBeforeTextChangeEvent.start() && this.f67184d == textViewBeforeTextChangeEvent.count() && this.f67185e == textViewBeforeTextChangeEvent.after()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f67181a.hashCode() ^ 1000003) * 1000003) ^ this.f67182b.hashCode()) * 1000003) ^ this.f67183c) * 1000003) ^ this.f67184d) * 1000003) ^ this.f67185e;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public int start() {
        return this.f67183c;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public CharSequence text() {
        return this.f67182b;
    }

    public String toString() {
        return "TextViewBeforeTextChangeEvent{view=" + this.f67181a + ", text=" + ((Object) this.f67182b) + ", start=" + this.f67183c + ", count=" + this.f67184d + ", after=" + this.f67185e + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewBeforeTextChangeEvent
    public TextView view() {
        return this.f67181a;
    }
}
