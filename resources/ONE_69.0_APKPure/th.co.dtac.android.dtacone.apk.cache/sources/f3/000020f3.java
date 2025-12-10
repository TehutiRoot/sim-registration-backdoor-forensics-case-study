package androidx.camera.video;

import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.video.h */
/* loaded from: classes.dex */
public final class C2626h extends Recorder.AbstractC2597i {

    /* renamed from: g */
    public final OutputOptions f11937g;

    /* renamed from: h */
    public final Executor f11938h;

    /* renamed from: i */
    public final Consumer f11939i;

    /* renamed from: j */
    public final boolean f11940j;

    /* renamed from: k */
    public final boolean f11941k;

    /* renamed from: l */
    public final long f11942l;

    public C2626h(OutputOptions outputOptions, Executor executor, Consumer consumer, boolean z, boolean z2, long j) {
        if (outputOptions != null) {
            this.f11937g = outputOptions;
            this.f11938h = executor;
            this.f11939i = consumer;
            this.f11940j = z;
            this.f11941k = z2;
            this.f11942l = j;
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
        if (!(obj instanceof Recorder.AbstractC2597i)) {
            return false;
        }
        Recorder.AbstractC2597i abstractC2597i = (Recorder.AbstractC2597i) obj;
        if (this.f11937g.equals(abstractC2597i.mo62180r()) && ((executor = this.f11938h) != null ? executor.equals(abstractC2597i.mo62182p()) : abstractC2597i.mo62182p() == null) && ((consumer = this.f11939i) != null ? consumer.equals(abstractC2597i.mo62181q()) : abstractC2597i.mo62181q() == null) && this.f11940j == abstractC2597i.mo62178t() && this.f11941k == abstractC2597i.mo62177w() && this.f11942l == abstractC2597i.mo62179s()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (this.f11937g.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f11938h;
        int i2 = 0;
        if (executor == null) {
            hashCode = 0;
        } else {
            hashCode = executor.hashCode();
        }
        int i3 = (hashCode2 ^ hashCode) * 1000003;
        Consumer consumer = this.f11939i;
        if (consumer != null) {
            i2 = consumer.hashCode();
        }
        int i4 = (i3 ^ i2) * 1000003;
        int i5 = 1237;
        if (this.f11940j) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i6 = (i4 ^ i) * 1000003;
        if (this.f11941k) {
            i5 = 1231;
        }
        long j = this.f11942l;
        return ((i6 ^ i5) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // androidx.camera.video.Recorder.AbstractC2597i
    /* renamed from: p */
    public Executor mo62182p() {
        return this.f11938h;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2597i
    /* renamed from: q */
    public Consumer mo62181q() {
        return this.f11939i;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2597i
    /* renamed from: r */
    public OutputOptions mo62180r() {
        return this.f11937g;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2597i
    /* renamed from: s */
    public long mo62179s() {
        return this.f11942l;
    }

    @Override // androidx.camera.video.Recorder.AbstractC2597i
    /* renamed from: t */
    public boolean mo62178t() {
        return this.f11940j;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f11937g + ", getCallbackExecutor=" + this.f11938h + ", getEventListener=" + this.f11939i + ", hasAudioEnabled=" + this.f11940j + ", isPersistent=" + this.f11941k + ", getRecordingId=" + this.f11942l + "}";
    }

    @Override // androidx.camera.video.Recorder.AbstractC2597i
    /* renamed from: w */
    public boolean mo62177w() {
        return this.f11941k;
    }
}