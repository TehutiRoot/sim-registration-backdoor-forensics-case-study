package jp.p022co.cyberagent.android.gpuimage;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageTwoPassFilter */
/* loaded from: classes5.dex */
public class GPUImageTwoPassFilter extends GPUImageFilterGroup {
    public GPUImageTwoPassFilter(String str, String str2, String str3, String str4) {
        super(null);
        addFilter(new GPUImageFilter(str, str2));
        addFilter(new GPUImageFilter(str3, str4));
    }
}
