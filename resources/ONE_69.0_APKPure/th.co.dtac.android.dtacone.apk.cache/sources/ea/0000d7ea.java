package jp.p022co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageMixBlendFilter */
/* loaded from: classes5.dex */
public class GPUImageMixBlendFilter extends GPUImageTwoInputFilter {

    /* renamed from: g */
    public int f67594g;

    /* renamed from: h */
    public float f67595h;

    public GPUImageMixBlendFilter(String str) {
        this(str, 0.5f);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageTwoInputFilter, jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.f67594g = GLES20.glGetUniformLocation(getProgram(), "mixturePercent");
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInitialized() {
        super.onInitialized();
        setMix(this.f67595h);
    }

    public void setMix(float f) {
        this.f67595h = f;
        setFloat(this.f67594g, f);
    }

    public GPUImageMixBlendFilter(String str, float f) {
        super(str);
        this.f67595h = f;
    }
}