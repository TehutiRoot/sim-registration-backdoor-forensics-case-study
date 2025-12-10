package jp.p022co.cyberagent.android.gpuimage;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import jp.p022co.cyberagent.android.gpuimage.util.TextureRotationUtil;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageFilterGroup */
/* loaded from: classes5.dex */
public class GPUImageFilterGroup extends GPUImageFilter {

    /* renamed from: e */
    public int[] f67491e;

    /* renamed from: f */
    public int[] f67492f;

    /* renamed from: g */
    public final FloatBuffer f67493g;

    /* renamed from: h */
    public final FloatBuffer f67494h;

    /* renamed from: i */
    public final FloatBuffer f67495i;
    protected List<GPUImageFilter> mFilters;
    protected List<GPUImageFilter> mMergedFilters;

    public GPUImageFilterGroup() {
        this(null);
    }

    /* renamed from: a */
    public final void m29102a() {
        int[] iArr = this.f67492f;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.f67492f = null;
        }
        int[] iArr2 = this.f67491e;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f67491e = null;
        }
    }

    public void addFilter(GPUImageFilter gPUImageFilter) {
        if (gPUImageFilter == null) {
            return;
        }
        this.mFilters.add(gPUImageFilter);
        updateMergedFilters();
    }

    public List<GPUImageFilter> getFilters() {
        return this.mFilters;
    }

    public List<GPUImageFilter> getMergedFilters() {
        return this.mMergedFilters;
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onDestroy() {
        m29102a();
        for (GPUImageFilter gPUImageFilter : this.mFilters) {
            gPUImageFilter.destroy();
        }
        super.onDestroy();
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    @SuppressLint({"WrongCall"})
    public void onDraw(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        List<GPUImageFilter> list;
        boolean z;
        FloatBuffer floatBuffer3;
        runPendingOnDrawTasks();
        if (isInitialized() && this.f67491e != null && this.f67492f != null && (list = this.mMergedFilters) != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                GPUImageFilter gPUImageFilter = this.mMergedFilters.get(i2);
                int i3 = size - 1;
                if (i2 < i3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    GLES20.glBindFramebuffer(36160, this.f67491e[i2]);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i2 == 0) {
                    gPUImageFilter.onDraw(i, floatBuffer, floatBuffer2);
                } else if (i2 == i3) {
                    FloatBuffer floatBuffer4 = this.f67493g;
                    if (size % 2 == 0) {
                        floatBuffer3 = this.f67495i;
                    } else {
                        floatBuffer3 = this.f67494h;
                    }
                    gPUImageFilter.onDraw(i, floatBuffer4, floatBuffer3);
                } else {
                    gPUImageFilter.onDraw(i, this.f67493g, this.f67494h);
                }
                if (z) {
                    GLES20.glBindFramebuffer(36160, 0);
                    i = this.f67492f[i2];
                }
            }
        }
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        for (GPUImageFilter gPUImageFilter : this.mFilters) {
            gPUImageFilter.init();
        }
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        if (this.f67491e != null) {
            m29102a();
        }
        int size = this.mFilters.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mFilters.get(i3).onOutputSizeChanged(i, i2);
        }
        List<GPUImageFilter> list = this.mMergedFilters;
        if (list != null && list.size() > 0) {
            int i4 = 1;
            int size2 = this.mMergedFilters.size() - 1;
            this.f67491e = new int[size2];
            this.f67492f = new int[size2];
            int i5 = 0;
            while (i5 < size2) {
                GLES20.glGenFramebuffers(i4, this.f67491e, i5);
                GLES20.glGenTextures(i4, this.f67492f, i5);
                GLES20.glBindTexture(3553, this.f67492f[i5]);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, this.f67491e[i5]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f67492f[i5], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i5++;
                i4 = 1;
            }
        }
    }

    public void updateMergedFilters() {
        if (this.mFilters == null) {
            return;
        }
        List<GPUImageFilter> list = this.mMergedFilters;
        if (list == null) {
            this.mMergedFilters = new ArrayList();
        } else {
            list.clear();
        }
        for (GPUImageFilter gPUImageFilter : this.mFilters) {
            if (gPUImageFilter instanceof GPUImageFilterGroup) {
                GPUImageFilterGroup gPUImageFilterGroup = (GPUImageFilterGroup) gPUImageFilter;
                gPUImageFilterGroup.updateMergedFilters();
                List<GPUImageFilter> mergedFilters = gPUImageFilterGroup.getMergedFilters();
                if (mergedFilters != null && !mergedFilters.isEmpty()) {
                    this.mMergedFilters.addAll(mergedFilters);
                }
            } else {
                this.mMergedFilters.add(gPUImageFilter);
            }
        }
    }

    public GPUImageFilterGroup(List<GPUImageFilter> list) {
        this.mFilters = list;
        if (list == null) {
            this.mFilters = new ArrayList();
        } else {
            updateMergedFilters();
        }
        float[] fArr = GPUImageRenderer.f67558u;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f67493g = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = TextureRotationUtil.TEXTURE_NO_ROTATION;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f67494h = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        float[] rotation = TextureRotationUtil.getRotation(Rotation.NORMAL, false, true);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(rotation.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f67495i = asFloatBuffer3;
        asFloatBuffer3.put(rotation).position(0);
    }
}
