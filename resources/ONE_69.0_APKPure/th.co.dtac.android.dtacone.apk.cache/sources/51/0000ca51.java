package io.fotoapparat.exception.camera;

import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lio/fotoapparat/exception/camera/UnsupportedLensException;", "Lio/fotoapparat/exception/camera/CameraException;", "()V", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class UnsupportedLensException extends CameraException {
    public UnsupportedLensException() {
        super("Device has no camera for the desired lens position(s).", null, 2, null);
    }
}