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
    public CameraWrapper f72039a;

    /* renamed from: b */
    public CameraPreview f72040b;

    /* renamed from: c */
    public IViewFinder f72041c;

    /* renamed from: d */
    public Rect f72042d;

    /* renamed from: e */
    public CameraHandlerThread f72043e;

    /* renamed from: f */
    public Boolean f72044f;

    /* renamed from: g */
    public boolean f72045g;

    /* renamed from: h */
    public boolean f72046h;

    public BarcodeScannerView(Context context) {
        super(context);
        this.f72045g = true;
        this.f72046h = true;
    }

    public IViewFinder createViewFinderView(Context context) {
        return new ViewFinderView(context);
    }

    public boolean getFlash() {
        CameraWrapper cameraWrapper = this.f72039a;
        if (cameraWrapper == null || !CameraUtils.isFlashSupported(cameraWrapper.mCamera) || !this.f72039a.mCamera.getParameters().getFlashMode().equals("torch")) {
            return false;
        }
        return true;
    }

    public synchronized Rect getFramingRectInPreview(int i, int i2) {
        try {
            if (this.f72042d == null) {
                Rect framingRect = this.f72041c.getFramingRect();
                int width = this.f72041c.getWidth();
                int height = this.f72041c.getHeight();
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
                    this.f72042d = rect;
                }
                return null;
            }
            return this.f72042d;
        } finally {
        }
    }

    public void resumeCameraPreview() {
        CameraPreview cameraPreview = this.f72040b;
        if (cameraPreview != null) {
            cameraPreview.showCameraPreview();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f72045g = z;
        CameraPreview cameraPreview = this.f72040b;
        if (cameraPreview != null) {
            cameraPreview.setAutoFocus(z);
        }
    }

    public void setFlash(boolean z) {
        this.f72044f = Boolean.valueOf(z);
        CameraWrapper cameraWrapper = this.f72039a;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.f72039a.mCamera.getParameters();
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
            this.f72039a.mCamera.setParameters(parameters);
        }
    }

    public void setShouldScaleToFill(boolean z) {
        this.f72046h = z;
    }

    public void setupCameraPreview(CameraWrapper cameraWrapper) {
        this.f72039a = cameraWrapper;
        if (cameraWrapper != null) {
            setupLayout(cameraWrapper);
            this.f72041c.setupViewFinder();
            Boolean bool = this.f72044f;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.f72045g);
        }
    }

    public final void setupLayout(CameraWrapper cameraWrapper) {
        removeAllViews();
        CameraPreview cameraPreview = new CameraPreview(getContext(), cameraWrapper, this);
        this.f72040b = cameraPreview;
        cameraPreview.setShouldScaleToFill(this.f72046h);
        if (!this.f72046h) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(this.f72040b);
            addView(relativeLayout);
        } else {
            addView(this.f72040b);
        }
        IViewFinder createViewFinderView = createViewFinderView(getContext());
        this.f72041c = createViewFinderView;
        if (createViewFinderView instanceof View) {
            addView((View) createViewFinderView);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }

    public void startCamera(int i) {
        if (this.f72043e == null) {
            this.f72043e = new CameraHandlerThread(this);
        }
        this.f72043e.startCamera(i);
    }

    public void stopCamera() {
        if (this.f72039a != null) {
            this.f72040b.stopCameraPreview();
            this.f72040b.setCamera(null, null);
            this.f72039a.mCamera.release();
            this.f72039a = null;
        }
        CameraHandlerThread cameraHandlerThread = this.f72043e;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.quit();
            this.f72043e = null;
        }
    }

    public void stopCameraPreview() {
        CameraPreview cameraPreview = this.f72040b;
        if (cameraPreview != null) {
            cameraPreview.stopCameraPreview();
        }
    }

    public void toggleFlash() {
        CameraWrapper cameraWrapper = this.f72039a;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.f72039a.mCamera.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode("off");
            } else {
                parameters.setFlashMode("torch");
            }
            this.f72039a.mCamera.setParameters(parameters);
        }
    }

    public BarcodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72045g = true;
        this.f72046h = true;
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