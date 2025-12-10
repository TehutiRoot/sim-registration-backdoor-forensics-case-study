package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.widget.SeekBarStartChangeEvent;

/* renamed from: Y8 */
/* loaded from: classes5.dex */
public final class C1716Y8 extends SeekBarStartChangeEvent {

    /* renamed from: a */
    public final SeekBar f7779a;

    public C1716Y8(SeekBar seekBar) {
        if (seekBar != null) {
            this.f7779a = seekBar;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekBarStartChangeEvent) {
            return this.f7779a.equals(((SeekBarStartChangeEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.f7779a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SeekBarStartChangeEvent{view=" + this.f7779a + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarChangeEvent
    public SeekBar view() {
        return this.f7779a;
    }
}