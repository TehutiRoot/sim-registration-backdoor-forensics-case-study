package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.StreamInfo;

/* renamed from: androidx.camera.video.i */
/* loaded from: classes.dex */
public final class C2645i extends StreamInfo {

    /* renamed from: d */
    public final int f11855d;

    /* renamed from: e */
    public final StreamInfo.StreamState f11856e;

    /* renamed from: f */
    public final SurfaceRequest.TransformationInfo f11857f;

    public C2645i(int i, StreamInfo.StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f11855d = i;
        if (streamState != null) {
            this.f11856e = streamState;
            this.f11857f = transformationInfo;
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
        if (this.f11855d == streamInfo.getId() && this.f11856e.equals(streamInfo.getStreamState())) {
            SurfaceRequest.TransformationInfo transformationInfo = this.f11857f;
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
        return this.f11855d;
    }

    @Override // androidx.camera.video.StreamInfo
    public SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
        return this.f11857f;
    }

    @Override // androidx.camera.video.StreamInfo
    public StreamInfo.StreamState getStreamState() {
        return this.f11856e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f11855d ^ 1000003) * 1000003) ^ this.f11856e.hashCode()) * 1000003;
        SurfaceRequest.TransformationInfo transformationInfo = this.f11857f;
        if (transformationInfo == null) {
            hashCode = 0;
        } else {
            hashCode = transformationInfo.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "StreamInfo{id=" + this.f11855d + ", streamState=" + this.f11856e + ", inProgressTransformationInfo=" + this.f11857f + "}";
    }
}
