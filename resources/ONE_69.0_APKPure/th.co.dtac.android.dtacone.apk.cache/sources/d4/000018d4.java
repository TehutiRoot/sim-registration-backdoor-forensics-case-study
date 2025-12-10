package p000;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoCapabilities;
import androidx.camera.video.VideoOutput;

/* renamed from: a32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC18983a32 {
    /* renamed from: a */
    public static VideoCapabilities m65186a(VideoOutput videoOutput, CameraInfo cameraInfo) {
        return VideoCapabilities.EMPTY;
    }

    /* renamed from: b */
    public static Observable m65185b(VideoOutput videoOutput) {
        return ConstantObservable.withValue(null);
    }

    /* renamed from: c */
    public static Observable m65184c(VideoOutput videoOutput) {
        return StreamInfo.f11837c;
    }

    /* renamed from: e */
    public static void m65182e(VideoOutput videoOutput, SurfaceRequest surfaceRequest, Timebase timebase) {
        videoOutput.onSurfaceRequested(surfaceRequest);
    }

    /* renamed from: d */
    public static void m65183d(VideoOutput videoOutput, VideoOutput.SourceState sourceState) {
    }
}