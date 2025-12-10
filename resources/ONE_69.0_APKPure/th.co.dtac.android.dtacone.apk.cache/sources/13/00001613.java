package p000;

import android.widget.SeekBar;
import com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent;

/* renamed from: X8 */
/* loaded from: classes5.dex */
public final class C1647X8 extends SeekBarProgressChangeEvent {

    /* renamed from: a */
    public final SeekBar f7476a;

    /* renamed from: b */
    public final int f7477b;

    /* renamed from: c */
    public final boolean f7478c;

    public C1647X8(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            this.f7476a = seekBar;
            this.f7477b = i;
            this.f7478c = z;
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
        if (this.f7476a.equals(seekBarProgressChangeEvent.view()) && this.f7477b == seekBarProgressChangeEvent.progress() && this.f7478c == seekBarProgressChangeEvent.fromUser()) {
            return true;
        }
        return false;
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent
    public boolean fromUser() {
        return this.f7478c;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f7476a.hashCode() ^ 1000003) * 1000003) ^ this.f7477b) * 1000003;
        if (this.f7478c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarProgressChangeEvent
    public int progress() {
        return this.f7477b;
    }

    public String toString() {
        return "SeekBarProgressChangeEvent{view=" + this.f7476a + ", progress=" + this.f7477b + ", fromUser=" + this.f7478c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.SeekBarChangeEvent
    public SeekBar view() {
        return this.f7476a;
    }
}