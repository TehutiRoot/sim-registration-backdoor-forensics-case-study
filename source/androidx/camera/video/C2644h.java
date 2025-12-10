package androidx.camera.video;

import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.video.h */
/* loaded from: classes.dex */
public final class C2644h extends Recorder.AbstractC2615i {

    /* renamed from: g */
    public final OutputOptions f11849g;

    /* renamed from: h */
    public final Executor f11850h;

    /* renamed from: i */
    public final Consumer f11851i;

    /* renamed from: j */
    public final boolean f11852j;

    /* renamed from: k */
    public final boolean f11853k;

    /* renamed from: l */
    public final long f11854l;

    public C2644h(OutputOptions outputOptions, Executor executor, Consumer consumer, boolean z, boolean z2, long j) {
        if (outputOptions != null) {
            this.f11849g = outputOptions;
            this.f11850h = executor;
            this.f11851i = consumer;
            this.f11852j = z;
            this.f11853k = z2;
            this.f11854l = j;
            return;
        }
        throw new NullPointerException("Null getOutputOptions");
    }

    public boolean equals(Object obj) {
        Executor executor;
        Consumer consumer;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recorder.AbstractC2615i)) {
            return false;
        }
        Recorder.AbstractC2615i abstractC2615i = (Recorder.AbstractC2615i) obj;
        if (this.f11849g.equals(abstractC2615i.mo62232r()) && ((executor = this.f11850h) != null ? executor.equals(abstractC2615i.mo62234p()) : abstractC2615i.mo62234p() == null) && ((consumer = this.f11851i) != null ? consumer.equals(abstractC2615i.mo62233q()) : abstractC2615i.mo62233q() == null) && this.f11852j == abstractC2615i.mo62230t() && this.f11853k == abstractC2615i.mo62229w() && this.f11854l == abstractC2615i.mo62231s()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.f11849g.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f11850h;
        int i2 = 0;
        if (executor == null) {
            hashCode = 0;
        } else {
            hashCode = executor.hashCode();
        }
        int i3 = (hashCode2 ^ hashCode) * 1000003;
        Consumer consumer = this.f11851i;
        if (consumer != null) {
            i2 = consumer.hashCode();
        }
        int i4 = (i3 ^ i2) * 1000003;
        int i5 = 1237;
        if (this.f11852j) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i6 = (i4 ^ i) * 1000003;
        if (this.f11853k) {
            i5 = 1231;
        }
        long j = this.f11854l;
        return ((i6 ^ i5) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // androidx.camera.video.Recorder.AbstractC2615i
    /* renamed from: p */
    public Executor mo62234p() {
        return this.f11850h;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2615i
    /* renamed from: q */
    public Consumer mo62233q() {
        return this.f11851i;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2615i
    /* renamed from: r */
    public OutputOptions mo62232r() {
        return this.f11849g;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2615i
    /* renamed from: s */
    public long mo62231s() {
        return this.f11854l;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2615i
    /* renamed from: t */
    public boolean mo62230t() {
        return this.f11852j;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f11849g + ", getCallbackExecutor=" + this.f11850h + ", getEventListener=" + this.f11851i + ", hasAudioEnabled=" + this.f11852j + ", isPersistent=" + this.f11853k + ", getRecordingId=" + this.f11854l + "}";
    }

    @Override // androidx.camera.video.Recorder.AbstractC2615i
    /* renamed from: w */
    public boolean mo62229w() {
        return this.f11853k;
    }
}
