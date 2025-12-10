package me.dm7.barcodescanner.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* loaded from: classes6.dex */
public abstract class BarcodeScannerView extends FrameLayout implements Camera.PreviewCallback {

    /* renamed from: a */
    public CameraWrapper f71937a;

    /* renamed from: b */
    public CameraPreview f71938b;

    /* renamed from: c */
    public IViewFinder f71939c;

    /* renamed from: d */
    public Rect f71940d;

    /* renamed from: e */
    public CameraHandlerThread f71941e;

    /* renamed from: f */
    public Boolean f71942f;

    /* renamed from: g */
    public boolean f71943g;

    /* renamed from: h */
    public boolean f71944h;

    public BarcodeScannerView(Context context) {
        super(context);
        this.f71943g = true;
        this.f71944h = true;
    }

    public IViewFinder createViewFinderView(Context context) {
        return new ViewFinderView(context);
    }

    public boolean getFlash() {
        CameraWrapper cameraWrapper = this.f71937a;
        if (cameraWrapper == null || !CameraUtils.isFlashSupported(cameraWrapper.mCamera) || !this.f71937a.mCamera.getParameters().getFlashMode().equals("torch")) {
            return false;
        }
        return true;
    }

    public synchronized Rect getFramingRectInPreview(int i, int i2) {
        try {
            if (this.f71940d == null) {
                Rect framingRect = this.f71939c.getFramingRect();
                int width = this.f71939c.getWidth();
                int height = this.f71939c.getHeight();
                if (framingRect != null && width != 0 && height != 0) {
                    Rect rect = new Rect(framingRect);
                    if (i < width) {
                        rect.left = (rect.left * i) / width;
                        rect.right = (rect.right * i) / width;
                    }
                    if (i2 < height) {
                        rect.top = (rect.top * i2) / height;
                        rect.bottom = (rect.bottom * i2) / height;
                    }
                    this.f71940d = rect;
                }
                return null;
            }
            return this.f71940d;
        } finally {
        }
    }

    public void resumeCameraPreview() {
        CameraPreview cameraPreview = this.f71938b;
        if (cameraPreview != null) {
            cameraPreview.showCameraPreview();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f71943g = z;
        CameraPreview cameraPreview = this.f71938b;
        if (cameraPreview != null) {
            cameraPreview.setAutoFocus(z);
        }
    }

    public void setFlash(boolean z) {
        this.f71942f = Boolean.valueOf(z);
        CameraWrapper cameraWrapper = this.f71937a;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.f71937a.mCamera.getParameters();
            if (z) {
                if (parameters.getFlashMode().equals("torch")) {
                    return;
                }
                parameters.setFlashMode("torch");
            } else if (parameters.getFlashMode().equals("off")) {
                return;
            } else {
                parameters.setFlashMode("off");
            }
            this.f71937a.mCamera.setParameters(parameters);
        }
    }

    public void setShouldScaleToFill(boolean z) {
        this.f71944h = z;
    }

    public void setupCameraPreview(CameraWrapper cameraWrapper) {
        this.f71937a = cameraWrapper;
        if (cameraWrapper != null) {
            setupLayout(cameraWrapper);
            this.f71939c.setupViewFinder();
            Boolean bool = this.f71942f;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.f71943g);
        }
    }

    public final void setupLayout(CameraWrapper cameraWrapper) {
        removeAllViews();
        CameraPreview cameraPreview = new CameraPreview(getContext(), cameraWrapper, this);
        this.f71938b = cameraPreview;
        cameraPreview.setShouldScaleToFill(this.f71944h);
        if (!this.f71944h) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(this.f71938b);
            addView(relativeLayout);
        } else {
            addView(this.f71938b);
        }
        IViewFinder createViewFinderView = createViewFinderView(getContext());
        this.f71939c = createViewFinderView;
        if (createViewFinderView instanceof View) {
            addView((View) createViewFinderView);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }

    public void startCamera(int i) {
        if (this.f71941e == null) {
            this.f71941e = new CameraHandlerThread(this);
        }
        this.f71941e.startCamera(i);
    }

    public void stopCamera() {
        if (this.f71937a != null) {
            this.f71938b.stopCameraPreview();
            this.f71938b.setCamera(null, null);
            this.f71937a.mCamera.release();
            this.f71937a = null;
        }
        CameraHandlerThread cameraHandlerThread = this.f71941e;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.quit();
            this.f71941e = null;
        }
    }

    public void stopCameraPreview() {
        CameraPreview cameraPreview = this.f71938b;
        if (cameraPreview != null) {
            cameraPreview.stopCameraPreview();
        }
    }

    public void toggleFlash() {
        CameraWrapper cameraWrapper = this.f71937a;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.f71937a.mCamera.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode("off");
            } else {
                parameters.setFlashMode("torch");
            }
            this.f71937a.mCamera.setParameters(parameters);
        }
    }

    public BarcodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71943g = true;
        this.f71944h = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.BarcodeScannerView, 0, 0);
        try {
            setShouldScaleToFill(obtainStyledAttributes.getBoolean(R.styleable.BarcodeScannerView_shouldScaleToFill, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void startCamera() {
        startCamera(CameraUtils.getDefaultCameraId());
    }
}
