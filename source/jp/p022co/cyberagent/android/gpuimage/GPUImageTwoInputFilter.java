package jp.p022co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import jp.p022co.cyberagent.android.gpuimage.util.TextureRotationUtil;

/* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageTwoInputFilter */
/* loaded from: classes5.dex */
public class GPUImageTwoInputFilter extends GPUImageFilter {

    /* renamed from: e */
    public ByteBuffer f67637e;

    /* renamed from: f */
    public Bitmap f67638f;
    public int mFilterInputTextureUniform2;
    public int mFilterSecondTextureCoordinateAttribute;
    public int mFilterSourceTexture2;

    /* renamed from: jp.co.cyberagent.android.gpuimage.GPUImageTwoInputFilter$a */
    /* loaded from: classes5.dex */
    public class RunnableC11586a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f67639a;

        public RunnableC11586a(Bitmap bitmap) {
            this.f67639a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (GPUImageTwoInputFilter.this.mFilterSourceTexture2 == -1 && (bitmap = this.f67639a) != null && !bitmap.isRecycled()) {
                GLES20.glActiveTexture(33987);
                GPUImageTwoInputFilter.this.mFilterSourceTexture2 = OpenGlUtils.loadTexture(this.f67639a, -1, false);
            }
        }
    }

    public GPUImageTwoInputFilter(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", str);
    }

    public Bitmap getBitmap() {
        return this.f67638f;
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onDestroy() {
        super.onDestroy();
        GLES20.glDeleteTextures(1, new int[]{this.mFilterSourceTexture2}, 0);
        this.mFilterSourceTexture2 = -1;
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onDrawArraysPre() {
        GLES20.glEnableVertexAttribArray(this.mFilterSecondTextureCoordinateAttribute);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.mFilterSourceTexture2);
        GLES20.glUniform1i(this.mFilterInputTextureUniform2, 3);
        this.f67637e.position(0);
        GLES20.glVertexAttribPointer(this.mFilterSecondTextureCoordinateAttribute, 2, 5126, false, 0, (Buffer) this.f67637e);
    }

    @Override // jp.p022co.cyberagent.android.gpuimage.GPUImageFilter
    public void onInit() {
        super.onInit();
        this.mFilterSecondTextureCoordinateAttribute = GLES20.glGetAttribLocation(getProgram(), "inputTextureCoordinate2");
        this.mFilterInputTextureUniform2 = GLES20.glGetUniformLocation(getProgram(), "inputImageTexture2");
        GLES20.glEnableVertexAttribArray(this.mFilterSecondTextureCoordinateAttribute);
        Bitmap bitmap = this.f67638f;
        if (bitmap != null && !bitmap.isRecycled()) {
            setBitmap(this.f67638f);
        }
    }

    public void recycleBitmap() {
        Bitmap bitmap = this.f67638f;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f67638f.recycle();
            this.f67638f = null;
        }
    }

    public void setBitmap(Bitmap bitmap) {
        if (bitmap != null && bitmap.isRecycled()) {
            return;
        }
        this.f67638f = bitmap;
        if (bitmap == null) {
            return;
        }
        runOnDraw(new RunnableC11586a(bitmap));
    }

    public void setRotation(Rotation rotation, boolean z, boolean z2) {
        float[] rotation2 = TextureRotationUtil.getRotation(rotation, z, z2);
        ByteBuffer order = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = order.asFloatBuffer();
        asFloatBuffer.put(rotation2);
        asFloatBuffer.flip();
        this.f67637e = order;
    }

    public GPUImageTwoInputFilter(String str, String str2) {
        super(str, str2);
        this.mFilterSourceTexture2 = -1;
        setRotation(Rotation.NORMAL, false, false);
    }
}
