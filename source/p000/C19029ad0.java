package p000;

import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* renamed from: ad0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19029ad0 extends C13288ri {

    /* renamed from: c */
    public static final C19029ad0 f8372c = new C19029ad0(new ImageCapturePixelHDRPlus());

    /* renamed from: b */
    public final ImageCapturePixelHDRPlus f8373b;

    public C19029ad0(ImageCapturePixelHDRPlus imageCapturePixelHDRPlus) {
        this.f8373b = imageCapturePixelHDRPlus;
    }

    @Override // p000.C13288ri, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void unpack(UseCaseConfig useCaseConfig, CaptureConfig.Builder builder) {
        super.unpack(useCaseConfig, builder);
        if (useCaseConfig instanceof ImageCaptureConfig) {
            ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (imageCaptureConfig.hasCaptureMode()) {
                this.f8373b.toggleHDRPlus(imageCaptureConfig.getCaptureMode(), builder2);
            }
            builder.addImplementationOptions(builder2.build());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
