package jp.p022co.cyberagent.android.gpuimage;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageEmbossFilter */
/* loaded from: classes5.dex */
public class GPUImageEmbossFilter extends GPUImage3x3ConvolutionFilter {

    /* renamed from: m */
    public float f67453m;

    public GPUImageEmbossFilter() {
        this(1.0f);
    }

    public float getIntensity() {
        return this.f67453m;
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImage3x3ConvolutionFilter, jp.p022co.cyberagent.android.gpuimage.GPUImage3x3TextureSamplingFilter, jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        setIntensity(this.f67453m);
    }

    public void setIntensity(float f) {
        this.f67453m = f;
        float f2 = -f;
        setConvolutionKernel(new float[]{(-2.0f) * f, f2, 0.0f, f2, 1.0f, f, 0.0f, f, 2.0f * f});
    }

    public GPUImageEmbossFilter(float f) {
        this.f67453m = f;
    }
}
