package p000;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoCapabilities;
import androidx.camera.video.VideoOutput;

/* renamed from: d22  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC19455d22 {
    /* renamed from: a */
    public static VideoCapabilities m31941a(VideoOutput videoOutput, CameraInfo cameraInfo) {
        return VideoCapabilities.EMPTY;
    }

    /* renamed from: b */
    public static Observable m31940b(VideoOutput videoOutput) {
        return ConstantObservable.withValue(null);
    }

    /* renamed from: c */
    public static Observable m31939c(VideoOutput videoOutput) {
        return StreamInfo.f11749c;
    }

    /* renamed from: e */
    public static void m31937e(VideoOutput videoOutput, SurfaceRequest surfaceRequest, Timebase timebase) {
        videoOutput.onSurfaceRequested(surfaceRequest);
    }

    /* renamed from: d */
    public static void m31938d(VideoOutput videoOutput, VideoOutput.SourceState sourceState) {
    }
}
