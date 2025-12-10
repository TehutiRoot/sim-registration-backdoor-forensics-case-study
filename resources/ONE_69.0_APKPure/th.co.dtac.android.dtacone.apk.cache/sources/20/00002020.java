package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ImageProxy;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class ImageProcessorRequest implements ImageProcessor.Request {

    /* renamed from: a */
    public final ImageProxy f11479a;

    /* renamed from: b */
    public final int f11480b;

    public ImageProcessorRequest(@NonNull ImageProxy imageProxy, int i) {
        this.f11479a = imageProxy;
        this.f11480b = i;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    @NonNull
    public ImageProxy getInputImage() {
        return this.f11479a;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.f11480b;
    }
}