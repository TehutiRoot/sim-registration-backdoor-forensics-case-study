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
public class C6200f extends AbstractC6198e {

    /* renamed from: d */
    public final TextureView f43877d;

    /* renamed from: e */
    public int f43878e;

    /* renamed from: com.google.android.cameraview.f$a */
    /* loaded from: classes3.dex */
    public class TextureView$SurfaceTextureListenerC6201a implements TextureView.SurfaceTextureListener {
        public TextureView$SurfaceTextureListenerC6201a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6200f.this.m49177m(i, i2);
            C6200f.this.m49168n();
            C6200f.this.m49182a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6200f.this.m49177m(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6200f.this.m49177m(i, i2);
            C6200f.this.m49168n();
            C6200f.this.m49182a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public C6200f(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, R.layout.texture_view, viewGroup).findViewById(R.id.texture_view);
        this.f43877d = textureView;
        textureView.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC6201a());
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: c */
    public Class mo49175c() {
        return SurfaceTexture.class;
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: d */
    public Surface mo49174d() {
        return new Surface(this.f43877d.getSurfaceTexture());
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: g */
    public View mo49172g() {
        return this.f43877d;
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: i */
    public boolean mo49171i() {
        if (this.f43877d.getSurfaceTexture() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: j */
    public void mo49170j(int i, int i2) {
        this.f43877d.getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: l */
    public void mo49169l(int i) {
        this.f43878e = i;
        m49168n();
    }

    /* renamed from: n */
    public void m49168n() {
        Matrix matrix;
        Matrix matrix2 = new Matrix();
        int i = this.f43878e;
        if (i % BitmapUtil.IMAGE_180_DEGREE == 90) {
            float m49179h = m49179h();
            float m49181b = m49181b();
            matrix = matrix2;
            matrix2.setPolyToPoly(new float[]{0.0f, 0.0f, m49179h, 0.0f, 0.0f, m49181b, m49179h, m49181b}, 0, this.f43878e == 90 ? new float[]{0.0f, m49181b, 0.0f, 0.0f, m49179h, m49181b, m49179h, 0.0f} : new float[]{m49179h, 0.0f, m49179h, m49181b, 0.0f, 0.0f, 0.0f, m49181b}, 0, 4);
        } else {
            matrix = matrix2;
            if (i == 180) {
                matrix.postRotate(180.0f, m49179h() / 2, m49181b() / 2);
            }
        }
        this.f43877d.setTransform(matrix);
    }

    @Override // com.google.android.cameraview.AbstractC6198e
    /* renamed from: o */
    public SurfaceTexture mo49173f() {
        return this.f43877d.getSurfaceTexture();
    }
}