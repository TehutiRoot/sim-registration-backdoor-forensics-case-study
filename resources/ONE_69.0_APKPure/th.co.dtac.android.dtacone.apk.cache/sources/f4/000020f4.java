package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.StreamInfo;

/* renamed from: androidx.camera.video.i */
/* loaded from: classes.dex */
public final class C2627i extends StreamInfo {

    /* renamed from: d */
    public final int f11943d;

    /* renamed from: e */
    public final StreamInfo.StreamState f11944e;

    /* renamed from: f */
    public final SurfaceRequest.TransformationInfo f11945f;

    public C2627i(int i, StreamInfo.StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f11943d = i;
        if (streamState != null) {
            this.f11944e = streamState;
            this.f11945f = transformationInfo;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamInfo)) {
            return false;
        }
        StreamInfo streamInfo = (StreamInfo) obj;
        if (this.f11943d == streamInfo.getId() && this.f11944e.equals(streamInfo.getStreamState())) {
            SurfaceRequest.TransformationInfo transformationInfo = this.f11945f;
            if (transformationInfo == null) {
                if (streamInfo.getInProgressTransformationInfo() == null) {
                    return true;
                }
            } else if (transformationInfo.equals(streamInfo.getInProgressTransformationInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.StreamInfo
    public int getId() {
        return this.f11943d;
    }

    @Override // androidx.camera.video.StreamInfo
    public SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
        return this.f11945f;
    }

    @Override // androidx.camera.video.StreamInfo
    public StreamInfo.StreamState getStreamState() {
        return this.f11944e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11943d ^ 1000003) * 1000003) ^ this.f11944e.hashCode()) * 1000003;
        SurfaceRequest.TransformationInfo transformationInfo = this.f11945f;
        if (transformationInfo == null) {
            hashCode = 0;
        } else {
            hashCode = transformationInfo.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "StreamInfo{id=" + this.f11943d + ", streamState=" + this.f11944e + ", inProgressTransformationInfo=" + this.f11945f + "}";
    }
}