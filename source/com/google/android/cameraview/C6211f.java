package com.google.android.cameraview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* renamed from: com.google.android.cameraview.f */
/* loaded from: classes3.dex */
public class C6211f extends AbstractC6209e {

    /* renamed from: d */
    public final TextureView f43865d;

    /* renamed from: e */
    public int f43866e;

    /* renamed from: com.google.android.cameraview.f$a */
    /* loaded from: classes3.dex */
    public class TextureView$SurfaceTextureListenerC6212a implements TextureView.SurfaceTextureListener {
        public TextureView$SurfaceTextureListenerC6212a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6211f.this.m49180m(i, i2);
            C6211f.this.m49171n();
            C6211f.this.m49185a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6211f.this.m49180m(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6211f.this.m49180m(i, i2);
            C6211f.this.m49171n();
            C6211f.this.m49185a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public C6211f(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, R.layout.texture_view, viewGroup).findViewById(R.id.texture_view);
        this.f43865d = textureView;
        textureView.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC6212a());
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: c */
    public Class mo49178c() {
        return SurfaceTexture.class;
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: d */
    public Surface mo49177d() {
        return new Surface(this.f43865d.getSurfaceTexture());
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: g */
    public View mo49175g() {
        return this.f43865d;
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: i */
    public boolean mo49174i() {
        if (this.f43865d.getSurfaceTexture() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: j */
    public void mo49173j(int i, int i2) {
        this.f43865d.getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: l */
    public void mo49172l(int i) {
        this.f43866e = i;
        m49171n();
    }

    /* renamed from: n */
    public void m49171n() {
        Matrix matrix;
        Matrix matrix2 = new Matrix();
        int i = this.f43866e;
        if (i % BitmapUtil.IMAGE_180_DEGREE == 90) {
            float m49182h = m49182h();
            float m49184b = m49184b();
            matrix = matrix2;
            matrix2.setPolyToPoly(new float[]{0.0f, 0.0f, m49182h, 0.0f, 0.0f, m49184b, m49182h, m49184b}, 0, this.f43866e == 90 ? new float[]{0.0f, m49184b, 0.0f, 0.0f, m49182h, m49184b, m49182h, 0.0f} : new float[]{m49182h, 0.0f, m49182h, m49184b, 0.0f, 0.0f, 0.0f, m49184b}, 0, 4);
        } else {
            matrix = matrix2;
            if (i == 180) {
                matrix.postRotate(180.0f, m49182h() / 2, m49184b() / 2);
            }
        }
        this.f43865d.setTransform(matrix);
    }

    @Override // com.google.android.cameraview.AbstractC6209e
    /* renamed from: o */
    public SurfaceTexture mo49176f() {
        return this.f43865d.getSurfaceTexture();
    }
}
