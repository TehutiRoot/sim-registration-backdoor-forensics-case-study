package p000;

import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* renamed from: gd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20119gd0 extends C13286ri {

    /* renamed from: c */
    public static final C20119gd0 f62219c = new C20119gd0(new ImageCapturePixelHDRPlus());

    /* renamed from: b */
    public final ImageCapturePixelHDRPlus f62220b;

    public C20119gd0(ImageCapturePixelHDRPlus imageCapturePixelHDRPlus) {
        this.f62220b = imageCapturePixelHDRPlus;
    }

    @Override // p000.C13286ri, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void unpack(UseCaseConfig useCaseConfig, CaptureConfig.Builder builder) {
        super.unpack(useCaseConfig, builder);
        if (useCaseConfig instanceof ImageCaptureConfig) {
            ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (imageCaptureConfig.hasCaptureMode()) {
                this.f62220b.toggleHDRPlus(imageCaptureConfig.getCaptureMode(), builder2);
            }
            builder.addImplementationOptions(builder2.build());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}