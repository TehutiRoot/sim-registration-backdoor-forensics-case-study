package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioStream;

/* renamed from: androidx.camera.video.internal.audio.c */
/* loaded from: classes.dex */
public final class C2656c extends AudioStream.PacketInfo {

    /* renamed from: a */
    public final int f11944a;

    /* renamed from: b */
    public final long f11945b;

    public C2656c(int i, long j) {
        this.f11944a = i;
        this.f11945b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.PacketInfo)) {
            return false;
        }
        AudioStream.PacketInfo packetInfo = (AudioStream.PacketInfo) obj;
        if (this.f11944a == packetInfo.getSizeInBytes() && this.f11945b == packetInfo.getTimestampNs()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public int getSizeInBytes() {
        return this.f11944a;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public long getTimestampNs() {
        return this.f11945b;
    }

    public int hashCode() {
        long j = this.f11945b;
        return ((this.f11944a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f11944a + ", timestampNs=" + this.f11945b + "}";
    }
}
