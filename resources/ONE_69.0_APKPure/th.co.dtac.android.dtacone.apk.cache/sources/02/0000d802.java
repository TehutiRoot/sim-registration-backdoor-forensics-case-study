package jp.p022co.cyberagent.android.gpuimage;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageSmoothToonFilter */
/* loaded from: classes5.dex */
public class GPUImageSmoothToonFilter extends GPUImageFilterGroup {

    /* renamed from: j */
    public GPUImageGaussianBlurFilter f67654j;

    /* renamed from: k */
    public GPUImageToonFilter f67655k;

    public GPUImageSmoothToonFilter() {
        GPUImageGaussianBlurFilter gPUImageGaussianBlurFilter = new GPUImageGaussianBlurFilter();
        this.f67654j = gPUImageGaussianBlurFilter;
        addFilter(gPUImageGaussianBlurFilter);
        GPUImageToonFilter gPUImageToonFilter = new GPUImageToonFilter();
        this.f67655k = gPUImageToonFilter;
        addFilter(gPUImageToonFilter);
        getFilters().add(this.f67654j);
        setBlurSize(0.5f);
        setThreshold(0.2f);
        setQuantizationLevels(10.0f);
    }

    public void setBlurSize(float f) {
        this.f67654j.setBlurSize(f);
    }

    public void setQuantizationLevels(float f) {
        this.f67655k.setQuantizationLevels(f);
    }

    public void setTexelHeight(float f) {
        this.f67655k.setTexelHeight(f);
    }

    public void setTexelWidth(float f) {
        this.f67655k.setTexelWidth(f);
    }

    public void setThreshold(float f) {
        this.f67655k.setThreshold(f);
    }
}