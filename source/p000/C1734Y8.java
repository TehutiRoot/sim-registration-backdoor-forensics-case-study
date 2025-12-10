package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.widget.SeekBarStartChangeEvent;

/* renamed from: Y8 */
/* loaded from: classes5.dex */
public final class C1734Y8 extends SeekBarStartChangeEvent {

    /* renamed from: a */
    public final SeekBar f7690a;

    public C1734Y8(SeekBar seekBar) {
        if (seekBar != null) {
            this.f7690a = seekBar;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekBarStartChangeEvent) {
            return this.f7690a.equals(((SeekBarStartChangeEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.f7690a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SeekBarStartChangeEvent{view=" + this.f7690a + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarChangeEvent
    public SeekBar view() {
        return this.f7690a;
    }
}
