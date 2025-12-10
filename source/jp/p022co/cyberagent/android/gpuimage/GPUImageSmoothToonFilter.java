package jp.p022co.cyberagent.android.gpuimage;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageSmoothToonFilter */
/* loaded from: classes5.dex */
public class GPUImageSmoothToonFilter extends GPUImageFilterGroup {

    /* renamed from: j */
    public GPUImageGaussianBlurFilter f67597j;

    /* renamed from: k */
    public GPUImageToonFilter f67598k;

    public GPUImageSmoothToonFilter() {
        GPUImageGaussianBlurFilter gPUImageGaussianBlurFilter = new GPUImageGaussianBlurFilter();
        this.f67597j = gPUImageGaussianBlurFilter;
        addFilter(gPUImageGaussianBlurFilter);
        GPUImageToonFilter gPUImageToonFilter = new GPUImageToonFilter();
        this.f67598k = gPUImageToonFilter;
        addFilter(gPUImageToonFilter);
        getFilters().add(this.f67597j);
        setBlurSize(0.5f);
        setThreshold(0.2f);
        setQuantizationLevels(10.0f);
    }

    public void setBlurSize(float f) {
        this.f67597j.setBlurSize(f);
    }

    public void setQuantizationLevels(float f) {
        this.f67598k.setQuantizationLevels(f);
    }

    public void setTexelHeight(float f) {
        this.f67598k.setTexelHeight(f);
    }

    public void setTexelWidth(float f) {
        this.f67598k.setTexelWidth(f);
    }

    public void setThreshold(float f) {
        this.f67598k.setThreshold(f);
    }
}
