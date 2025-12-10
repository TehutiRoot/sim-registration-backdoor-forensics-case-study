package p000;

import android.text.Editable;
import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent;

/* renamed from: i9 */
/* loaded from: classes5.dex */
public final class C10431i9 extends TextViewAfterTextChangeEvent {

    /* renamed from: a */
    public final TextView f62772a;

    /* renamed from: b */
    public final Editable f62773b;

    public C10431i9(TextView textView, Editable editable) {
        if (textView != null) {
            this.f62772a = textView;
            this.f62773b = editable;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent
    public Editable editable() {
        return this.f62773b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        TextViewAfterTextChangeEvent textViewAfterTextChangeEvent = (TextViewAfterTextChangeEvent) obj;
        if (this.f62772a.equals(textViewAfterTextChangeEvent.view())) {
            Editable editable = this.f62773b;
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
        int hashCode2 = (this.f62772a.hashCode() ^ 1000003) * 1000003;
        Editable editable = this.f62773b;
        if (editable == null) {
            hashCode = 0;
        } else {
            hashCode = editable.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{view=" + this.f62772a + ", editable=" + ((Object) this.f62773b) + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewAfterTextChangeEvent
    public TextView view() {
        return this.f62772a;
    }
}