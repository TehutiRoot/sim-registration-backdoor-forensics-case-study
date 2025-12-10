package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent;

/* renamed from: X8 */
/* loaded from: classes5.dex */
public final class C1658X8 extends SeekBarProgressChangeEvent {

    /* renamed from: a */
    public final SeekBar f7392a;

    /* renamed from: b */
    public final int f7393b;

    /* renamed from: c */
    public final boolean f7394c;

    public C1658X8(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            this.f7392a = seekBar;
            this.f7393b = i;
            this.f7394c = z;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeekBarProgressChangeEvent)) {
            return false;
        }
        SeekBarProgressChangeEvent seekBarProgressChangeEvent = (SeekBarProgressChangeEvent) obj;
        if (this.f7392a.equals(seekBarProgressChangeEvent.view()) && this.f7393b == seekBarProgressChangeEvent.progress() && this.f7394c == seekBarProgressChangeEvent.fromUser()) {
            return true;
        }
        return false;
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent
    public boolean fromUser() {
        return this.f7394c;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f7392a.hashCode() ^ 1000003) * 1000003) ^ this.f7393b) * 1000003;
        if (this.f7394c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent
    public int progress() {
        return this.f7393b;
    }

    public String toString() {
        return "SeekBarProgressChangeEvent{view=" + this.f7392a + ", progress=" + this.f7393b + ", fromUser=" + this.f7394c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarChangeEvent
    public SeekBar view() {
        return this.f7392a;
    }
}
