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
    public CameraWrapper f71950a;

    /* renamed from: b */
    public Handler f71951b;

    /* renamed from: c */
    public boolean f71952c;

    /* renamed from: d */
    public boolean f71953d;

    /* renamed from: e */
    public boolean f71954e;

    /* renamed from: f */
    public boolean f71955f;

    /* renamed from: g */
    public Camera.PreviewCallback f71956g;

    /* renamed from: h */
    public Runnable f71957h;

    /* renamed from: i */
    public Camera.AutoFocusCallback f71958i;

    /* renamed from: me.dm7.barcodescanner.core.CameraPreview$a */
    /* loaded from: classes6.dex */
    public class RunnableC12301a implements Runnable {
        public RunnableC12301a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CameraPreview.this.f71950a != null && CameraPreview.this.f71952c && CameraPreview.this.f71953d && CameraPreview.this.f71954e) {
                CameraPreview.this.safeAutoFocus();
            }
        }
    }

    /* renamed from: me.dm7.barcodescanner.core.CameraPreview$b */
    /* loaded from: classes6.dex */
    public class C12302b implements Camera.AutoFocusCallback {
        public C12302b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            CameraPreview.this.m26237h();
        }
    }

    public CameraPreview(Context context, CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        super(context);
        this.f71952c = true;
        this.f71953d = true;
        this.f71954e = false;
        this.f71955f = true;
        this.f71957h = new RunnableC12301a();
        this.f71958i = new C12302b();
        init(cameraWrapper, previewCallback);
    }

    private Camera.Size getOptimalPreviewSize() {
        double d;
        CameraWrapper cameraWrapper = this.f71950a;
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
        if (this.f71950a.mCamera != null) {
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (this.f71953d && supportedFocusModes.contains("continuous-picture")) {
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
    public final void m26239f(Camera.Size size) {
        Point m26238g = m26238g(new Point(getWidth(), getHeight()));
        float f = size.width / size.height;
        int i = m26238g.x;
        int i2 = m26238g.y;
        if (i / i2 > f) {
            m26236i((int) (i2 * f), i2);
        } else {
            m26236i(i, (int) (i / f));
        }
    }

    /* renamed from: g */
    public final Point m26238g(Point point) {
        if (getDisplayOrientation() % BitmapUtil.IMAGE_180_DEGREE == 0) {
            return point;
        }
        return new Point(point.y, point.x);
    }

    public int getDisplayOrientation() {
        int i = 0;
        if (this.f71950a == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = this.f71950a.mCameraId;
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
    public final void m26237h() {
        this.f71951b.postDelayed(this.f71957h, 1000L);
    }

    /* renamed from: i */
    public final void m26236i(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % BitmapUtil.IMAGE_180_DEGREE != 0) {
            i2 = i;
            i = i2;
        }
        if (this.f71955f) {
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
        this.f71951b = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    public void safeAutoFocus() {
        try {
            this.f71950a.mCamera.autoFocus(this.f71958i);
        } catch (RuntimeException unused) {
            m26237h();
        }
    }

    public void setAutoFocus(boolean z) {
        if (this.f71950a == null || !this.f71952c || z == this.f71953d) {
            return;
        }
        this.f71953d = z;
        if (z) {
            if (this.f71954e) {
                safeAutoFocus();
                return;
            } else {
                m26237h();
                return;
            }
        }
        this.f71950a.mCamera.cancelAutoFocus();
    }

    public void setCamera(CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        this.f71950a = cameraWrapper;
        this.f71956g = previewCallback;
    }

    public void setShouldScaleToFill(boolean z) {
        this.f71955f = z;
    }

    public void setupCameraParameters() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.f71950a.mCamera.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.f71950a.mCamera.setParameters(parameters);
        m26239f(optimalPreviewSize);
    }

    public void showCameraPreview() {
        if (this.f71950a != null) {
            try {
                getHolder().addCallback(this);
                this.f71952c = true;
                setupCameraParameters();
                this.f71950a.mCamera.setPreviewDisplay(getHolder());
                this.f71950a.mCamera.setDisplayOrientation(getDisplayOrientation());
                this.f71950a.mCamera.setOneShotPreviewCallback(this.f71956g);
                this.f71950a.mCamera.startPreview();
                if (this.f71953d) {
                    if (this.f71954e) {
                        safeAutoFocus();
                    } else {
                        m26237h();
                    }
                }
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    public void stopCameraPreview() {
        if (this.f71950a != null) {
            try {
                this.f71952c = false;
                getHolder().removeCallback(this);
                this.f71950a.mCamera.cancelAutoFocus();
                this.f71950a.mCamera.setOneShotPreviewCallback(null);
                this.f71950a.mCamera.stopPreview();
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
        this.f71954e = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f71954e = false;
        stopCameraPreview();
    }

    public CameraPreview(Context context, AttributeSet attributeSet, CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        super(context, attributeSet);
        this.f71952c = true;
        this.f71953d = true;
        this.f71954e = false;
        this.f71955f = true;
        this.f71957h = new RunnableC12301a();
        this.f71958i = new C12302b();
        init(cameraWrapper, previewCallback);
    }
}
