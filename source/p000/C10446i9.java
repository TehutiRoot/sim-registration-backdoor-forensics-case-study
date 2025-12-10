package p000;

import android.text.Editable;
import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent;

/* renamed from: i9 */
/* loaded from: classes5.dex */
public final class C10446i9 extends TextViewAfterTextChangeEvent {

    /* renamed from: a */
    public final TextView f62720a;

    /* renamed from: b */
    public final Editable f62721b;

    public C10446i9(TextView textView, Editable editable) {
        if (textView != null) {
            this.f62720a = textView;
            this.f62721b = editable;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent
    public Editable editable() {
        return this.f62721b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        TextViewAfterTextChangeEvent textViewAfterTextChangeEvent = (TextViewAfterTextChangeEvent) obj;
        if (this.f62720a.equals(textViewAfterTextChangeEvent.view())) {
            Editable editable = this.f62721b;
            if (editable == null) {
                if (textViewAfterTextChangeEvent.editable() == null) {
                    return true;
                }
            } else if (editable.equals(textViewAfterTextChangeEvent.editable())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f62720a.hashCode() ^ 1000003) * 1000003;
        Editable editable = this.f62721b;
        if (editable == null) {
            hashCode = 0;
        } else {
            hashCode = editable.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{view=" + this.f62720a + ", editable=" + ((Object) this.f62721b) + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent
    public TextView view() {
        return this.f62720a;
    }
}
