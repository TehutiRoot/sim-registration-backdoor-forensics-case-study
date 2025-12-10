package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes6.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public CameraWrapper f72052a;

    /* renamed from: b */
    public Handler f72053b;

    /* renamed from: c */
    public boolean f72054c;

    /* renamed from: d */
    public boolean f72055d;

    /* renamed from: e */
    public boolean f72056e;

    /* renamed from: f */
    public boolean f72057f;

    /* renamed from: g */
    public Camera.PreviewCallback f72058g;

    /* renamed from: h */
    public Runnable f72059h;

    /* renamed from: i */
    public Camera.AutoFocusCallback f72060i;

    /* renamed from: me.dm7.barcodescanner.core.CameraPreview$a */
    /* loaded from: classes6.dex */
    public class RunnableC12289a implements Runnable {
        public RunnableC12289a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CameraPreview.this.f72052a != null && CameraPreview.this.f72054c && CameraPreview.this.f72055d && CameraPreview.this.f72056e) {
                CameraPreview.this.safeAutoFocus();
            }
        }
    }

    /* renamed from: me.dm7.barcodescanner.core.CameraPreview$b */
    /* loaded from: classes6.dex */
    public class C12290b implements Camera.AutoFocusCallback {
        public C12290b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CameraPreview.this.m26607h();
        }
    }

    public CameraPreview(Context context, CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        super(context);
        this.f72054c = true;
        this.f72055d = true;
        this.f72056e = false;
        this.f72057f = true;
        this.f72059h = new RunnableC12289a();
        this.f72060i = new C12290b();
        init(cameraWrapper, previewCallback);
    }

    private Camera.Size getOptimalPreviewSize() {
        double d;
        CameraWrapper cameraWrapper = this.f72052a;
        Camera.Size size = null;
        if (cameraWrapper == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = cameraWrapper.mCamera.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (DisplayUtils.getScreenOrientation(getContext()) == 1) {
            height = width;
            width = height;
        }
        String lowerCase = Build.BRAND.toLowerCase();
        if (!lowerCase.contains("dtac") && !lowerCase.contains("wiko")) {
            d = 0.5d;
        } else {
            d = 0.1d;
        }
        double d2 = width / height;
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d3 = Double.MAX_VALUE;
        for (Camera.Size size2 : supportedPreviewSizes) {
            if (Math.abs((size2.width / size2.height) - d2) <= d && Math.abs(size2.height - height) < d3) {
                d3 = Math.abs(size2.height - height);
                size = size2;
            }
        }
        if (size == null) {
            double d4 = Double.MAX_VALUE;
            for (Camera.Size size3 : supportedPreviewSizes) {
                if (Math.abs(size3.height - height) < d4) {
                    size = size3;
                    d4 = Math.abs(size3.height - height);
                }
            }
        }
        return size;
    }

    private void setAutoFocusMode(Camera.Parameters parameters) {
        if (this.f72052a.mCamera != null) {
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (this.f72055d && supportedFocusModes.contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            } else if (supportedFocusModes.contains("fixed")) {
                parameters.setFocusMode("fixed");
            } else if (supportedFocusModes.contains("infinity")) {
                parameters.setFocusMode("infinity");
            } else {
                parameters.setFocusMode(supportedFocusModes.get(0));
            }
        }
    }

    /* renamed from: f */
    public final void m26609f(Camera.Size size) {
        Point m26608g = m26608g(new Point(getWidth(), getHeight()));
        float f = size.width / size.height;
        int i = m26608g.x;
        int i2 = m26608g.y;
        if (i / i2 > f) {
            m26606i((int) (i2 * f), i2);
        } else {
            m26606i(i, (int) (i / f));
        }
    }

    /* renamed from: g */
    public final Point m26608g(Point point) {
        if (getDisplayOrientation() % BitmapUtil.IMAGE_180_DEGREE == 0) {
            return point;
        }
        return new Point(point.y, point.x);
    }

    public int getDisplayOrientation() {
        int i = 0;
        if (this.f72052a == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = this.f72052a.mCameraId;
        if (i2 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i2, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        i = BitmapUtil.IMAGE_270_DEGREE;
                    }
                } else {
                    i = BitmapUtil.IMAGE_180_DEGREE;
                }
            } else {
                i = 90;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    /* renamed from: h */
    public final void m26607h() {
        this.f72053b.postDelayed(this.f72059h, 1000L);
    }

    /* renamed from: i */
    public final void m26606i(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % BitmapUtil.IMAGE_180_DEGREE != 0) {
            i2 = i;
            i = i2;
        }
        if (this.f72057f) {
            float f = i;
            float width = ((View) getParent()).getWidth() / f;
            float f2 = i2;
            float height = ((View) getParent()).getHeight() / f2;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i2 = Math.round(f2 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public void init(CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        setCamera(cameraWrapper, previewCallback);
        this.f72053b = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    public void safeAutoFocus() {
        try {
            this.f72052a.mCamera.autoFocus(this.f72060i);
        } catch (RuntimeException unused) {
            m26607h();
        }
    }

    public void setAutoFocus(boolean z) {
        if (this.f72052a == null || !this.f72054c || z == this.f72055d) {
            return;
        }
        this.f72055d = z;
        if (z) {
            if (this.f72056e) {
                safeAutoFocus();
                return;
            } else {
                m26607h();
                return;
            }
        }
        this.f72052a.mCamera.cancelAutoFocus();
    }

    public void setCamera(CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        this.f72052a = cameraWrapper;
        this.f72058g = previewCallback;
    }

    public void setShouldScaleToFill(boolean z) {
        this.f72057f = z;
    }

    public void setupCameraParameters() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.f72052a.mCamera.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.f72052a.mCamera.setParameters(parameters);
        m26609f(optimalPreviewSize);
    }

    public void showCameraPreview() {
        if (this.f72052a != null) {
            try {
                getHolder().addCallback(this);
                this.f72054c = true;
                setupCameraParameters();
                this.f72052a.mCamera.setPreviewDisplay(getHolder());
                this.f72052a.mCamera.setDisplayOrientation(getDisplayOrientation());
                this.f72052a.mCamera.setOneShotPreviewCallback(this.f72058g);
                this.f72052a.mCamera.startPreview();
                if (this.f72055d) {
                    if (this.f72056e) {
                        safeAutoFocus();
                    } else {
                        m26607h();
                    }
                }
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    public void stopCameraPreview() {
        if (this.f72052a != null) {
            try {
                this.f72054c = false;
                getHolder().removeCallback(this);
                this.f72052a.mCamera.cancelAutoFocus();
                this.f72052a.mCamera.setOneShotPreviewCallback(null);
                this.f72052a.mCamera.stopPreview();
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        stopCameraPreview();
        showCameraPreview();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f72056e = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f72056e = false;
        stopCameraPreview();
    }

    public CameraPreview(Context context, AttributeSet attributeSet, CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        super(context, attributeSet);
        this.f72054c = true;
        this.f72055d = true;
        this.f72056e = false;
        this.f72057f = true;
        this.f72059h = new RunnableC12289a();
        this.f72060i = new C12290b();
        init(cameraWrapper, previewCallback);
    }
}