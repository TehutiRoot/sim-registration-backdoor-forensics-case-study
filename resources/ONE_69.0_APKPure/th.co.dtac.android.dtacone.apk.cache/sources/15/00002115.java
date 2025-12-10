package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioStream;

/* renamed from: androidx.camera.video.internal.audio.c */
/* loaded from: classes.dex */
public final class C2638c extends AudioStream.PacketInfo {

    /* renamed from: a */
    public final int f12032a;

    /* renamed from: b */
    public final long f12033b;

    public C2638c(int i, long j) {
        this.f12032a = i;
        this.f12033b = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.PacketInfo)) {
            return false;
        }
        AudioStream.PacketInfo packetInfo = (AudioStream.PacketInfo) obj;
        if (this.f12032a == packetInfo.getSizeInBytes() && this.f12033b == packetInfo.getTimestampNs()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public int getSizeInBytes() {
        return this.f12032a;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public long getTimestampNs() {
        return this.f12033b;
    }

    public int hashCode() {
        long j = this.f12033b;
        return ((this.f12032a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f12032a + ", timestampNs=" + this.f12033b + "}";
    }
}