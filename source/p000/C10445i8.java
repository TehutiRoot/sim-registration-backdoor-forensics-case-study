package p000;

import androidx.camera.video.AudioStats;

/* renamed from: i8 */
/* loaded from: classes.dex */
public final class C10445i8 extends AudioStats {

    /* renamed from: b */
    public final int f62714b;

    /* renamed from: c */
    public final double f62715c;

    /* renamed from: d */
    public final Throwable f62716d;

    public C10445i8(int i, double d, Throwable th2) {
        this.f62714b = i;
        this.f62715c = d;
        this.f62716d = th2;
    }

    @Override // androidx.camera.video.AudioStats
    /* renamed from: a */
    public double mo30663a() {
        return this.f62715c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStats)) {
            return false;
        }
        AudioStats audioStats = (AudioStats) obj;
        if (this.f62714b == audioStats.getAudioState() && Double.doubleToLongBits(this.f62715c) == Double.doubleToLongBits(audioStats.mo30663a())) {
            Throwable th2 = this.f62716d;
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
        return this.f62714b;
    }

    @Override // androidx.camera.video.AudioStats
    public Throwable getErrorCause() {
        return this.f62716d;
    }

    public int hashCode() {
        int hashCode;
        int doubleToLongBits = (((this.f62714b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f62715c) >>> 32) ^ Double.doubleToLongBits(this.f62715c)))) * 1000003;
        Throwable th2 = this.f62716d;
        if (th2 == null) {
            hashCode = 0;
        } else {
            hashCode = th2.hashCode();
        }
        return doubleToLongBits ^ hashCode;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f62714b + ", audioAmplitudeInternal=" + this.f62715c + ", errorCause=" + this.f62716d + "}";
    }
}
