package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding2.widget.TextViewEditorActionEvent;

/* renamed from: k9 */
/* loaded from: classes5.dex */
public final class C11612k9 extends TextViewEditorActionEvent {

    /* renamed from: a */
    public final TextView f67882a;

    /* renamed from: b */
    public final int f67883b;

    /* renamed from: c */
    public final KeyEvent f67884c;

    public C11612k9(TextView textView, int i, KeyEvent keyEvent) {
        if (textView != null) {
            this.f67882a = textView;
            this.f67883b = i;
            this.f67884c = keyEvent;
            return;
        }
        throw new NullPointerException("Null view");
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewEditorActionEvent
    public int actionId() {
        return this.f67883b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewEditorActionEvent)) {
            return false;
        }
        TextViewEditorActionEvent textViewEditorActionEvent = (TextViewEditorActionEvent) obj;
        if (this.f67882a.equals(textViewEditorActionEvent.view()) && this.f67883b == textViewEditorActionEvent.actionId()) {
            KeyEvent keyEvent = this.f67884c;
            if (keyEvent == null) {
                if (textViewEditorActionEvent.keyEvent() == null) {
                    return true;
                }
            } else if (keyEvent.equals(textViewEditorActionEvent.keyEvent())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f67882a.hashCode() ^ 1000003) * 1000003) ^ this.f67883b) * 1000003;
        KeyEvent keyEvent = this.f67884c;
        if (keyEvent == null) {
            hashCode = 0;
        } else {
            hashCode = keyEvent.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewEditorActionEvent
    public KeyEvent keyEvent() {
        return this.f67884c;
    }

    public String toString() {
        return "TextViewEditorActionEvent{view=" + this.f67882a + ", actionId=" + this.f67883b + ", keyEvent=" + this.f67884c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.TextViewEditorActionEvent
    public TextView view() {
        return this.f67882a;
    }
}