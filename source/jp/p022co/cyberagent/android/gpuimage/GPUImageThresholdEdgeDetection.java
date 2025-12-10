package jp.p022co.cyberagent.android.gpuimage;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageThresholdEdgeDetection */
/* loaded from: classes5.dex */
public class GPUImageThresholdEdgeDetection extends GPUImageFilterGroup {
    public GPUImageThresholdEdgeDetection() {
        addFilter(new GPUImageGrayscaleFilter());
        addFilter(new GPUImageSobelThresholdFilter());
    }

    public void setLineSize(float f) {
        ((GPUImage3x3TextureSamplingFilter) getFilters().get(1)).setLineSize(f);
    }

    public void setThreshold(float f) {
        ((GPUImageSobelThresholdFilter) getFilters().get(1)).setThreshold(f);
    }
}
