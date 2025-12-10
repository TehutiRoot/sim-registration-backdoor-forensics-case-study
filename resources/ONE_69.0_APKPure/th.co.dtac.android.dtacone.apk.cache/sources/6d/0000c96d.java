package p000;

import androidx.camera.video.AudioStats;

/* renamed from: i8 */
/* loaded from: classes.dex */
public final class C10430i8 extends AudioStats {

    /* renamed from: b */
    public final int f62767b;

    /* renamed from: c */
    public final double f62768c;

    /* renamed from: d */
    public final Throwable f62769d;

    public C10430i8(int i, double d, Throwable th2) {
        this.f62767b = i;
        this.f62768c = d;
        this.f62769d = th2;
    }

    @Override // androidx.camera.video.AudioStats
    /* renamed from: a */
    public double mo31037a() {
        return this.f62768c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStats)) {
            return false;
        }
        AudioStats audioStats = (AudioStats) obj;
        if (this.f62767b == audioStats.getAudioState() && Double.doubleToLongBits(this.f62768c) == Double.doubleToLongBits(audioStats.mo31037a())) {
            Throwable th2 = this.f62769d;
            if (th2 == null) {
                if (audioStats.getErrorCause() == null) {
                    return true;
                }
            } else if (th2.equals(audioStats.getErrorCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioStats
    public int getAudioState() {
        return this.f62767b;
    }

    @Override // androidx.camera.video.AudioStats
    public Throwable getErrorCause() {
        return this.f62769d;
    }

    public int hashCode() {
        int hashCode;
        int doubleToLongBits = (((this.f62767b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f62768c) >>> 32) ^ Double.doubleToLongBits(this.f62768c)))) * 1000003;
        Throwable th2 = this.f62769d;
        if (th2 == null) {
            hashCode = 0;
        } else {
            hashCode = th2.hashCode();
        }
        return doubleToLongBits ^ hashCode;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f62767b + ", audioAmplitudeInternal=" + this.f62768c + ", errorCause=" + this.f62769d + "}";
    }
}