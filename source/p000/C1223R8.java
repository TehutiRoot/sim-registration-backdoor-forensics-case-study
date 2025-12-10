package p000;

import androidx.camera.video.AudioStats;
import androidx.camera.video.RecordingStats;

/* renamed from: R8 */
/* loaded from: classes.dex */
public final class C1223R8 extends RecordingStats {

    /* renamed from: a */
    public final long f5274a;

    /* renamed from: b */
    public final long f5275b;

    /* renamed from: c */
    public final AudioStats f5276c;

    public C1223R8(long j, long j2, AudioStats audioStats) {
        this.f5274a = j;
        this.f5275b = j2;
        if (audioStats != null) {
            this.f5276c = audioStats;
            return;
        }
        throw new NullPointerException("Null audioStats");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordingStats)) {
            return false;
        }
        RecordingStats recordingStats = (RecordingStats) obj;
        if (this.f5274a == recordingStats.getRecordedDurationNanos() && this.f5275b == recordingStats.getNumBytesRecorded() && this.f5276c.equals(recordingStats.getAudioStats())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.RecordingStats
    public AudioStats getAudioStats() {
        return this.f5276c;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getNumBytesRecorded() {
        return this.f5275b;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getRecordedDurationNanos() {
        return this.f5274a;
    }

    public int hashCode() {
        long j = this.f5274a;
        long j2 = this.f5275b;
        return this.f5276c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f5274a + ", numBytesRecorded=" + this.f5275b + ", audioStats=" + this.f5276c + "}";
    }
}
