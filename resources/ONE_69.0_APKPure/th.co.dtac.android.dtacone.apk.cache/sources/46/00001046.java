package p000;

import androidx.camera.video.AudioStats;
import androidx.camera.video.RecordingStats;

/* renamed from: R8 */
/* loaded from: classes.dex */
public final class C1201R8 extends RecordingStats {

    /* renamed from: a */
    public final long f5408a;

    /* renamed from: b */
    public final long f5409b;

    /* renamed from: c */
    public final AudioStats f5410c;

    public C1201R8(long j, long j2, AudioStats audioStats) {
        this.f5408a = j;
        this.f5409b = j2;
        if (audioStats != null) {
            this.f5410c = audioStats;
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
        if (this.f5408a == recordingStats.getRecordedDurationNanos() && this.f5409b == recordingStats.getNumBytesRecorded() && this.f5410c.equals(recordingStats.getAudioStats())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.RecordingStats
    public AudioStats getAudioStats() {
        return this.f5410c;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getNumBytesRecorded() {
        return this.f5409b;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getRecordedDurationNanos() {
        return this.f5408a;
    }

    public int hashCode() {
        long j = this.f5408a;
        long j2 = this.f5409b;
        return this.f5410c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f5408a + ", numBytesRecorded=" + this.f5409b + ", audioStats=" + this.f5410c + "}";
    }
}