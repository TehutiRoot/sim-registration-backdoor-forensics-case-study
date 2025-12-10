package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.widget.SeekBarStopChangeEvent;

/* renamed from: Z8 */
/* loaded from: classes5.dex */
public final class C1784Z8 extends SeekBarStopChangeEvent {

    /* renamed from: a */
    public final SeekBar f8102a;

    public C1784Z8(SeekBar seekBar) {
        if (seekBar != null) {
            this.f8102a = seekBar;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekBarStopChangeEvent) {
            return this.f8102a.equals(((SeekBarStopChangeEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.f8102a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SeekBarStopChangeEvent{view=" + this.f8102a + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarChangeEvent
    public SeekBar view() {
        return this.f8102a;
    }
}