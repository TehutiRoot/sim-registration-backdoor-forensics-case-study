package me.dm7.barcodescanner.core;

import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes6.dex */
public class CameraHandlerThread extends HandlerThread {

    /* renamed from: a */
    public BarcodeScannerView f71945a;

    /* renamed from: me.dm7.barcodescanner.core.CameraHandlerThread$a */
    /* loaded from: classes6.dex */
    public class RunnableC12299a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f71946a;

        /* renamed from: me.dm7.barcodescanner.core.CameraHandlerThread$a$a */
        /* loaded from: classes6.dex */
        public class RunnableC12300a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Camera f71948a;

            public RunnableC12300a(Camera camera) {
                this.f71948a = camera;
            }

            @Override // java.lang.Runnable
            public void run() {
                CameraHandlerThread.this.f71945a.setupCameraPreview(CameraWrapper.getWrapper(this.f71948a, RunnableC12299a.this.f71946a));
            }
        }

        public RunnableC12299a(int i) {
            this.f71946a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(Looper.getMainLooper()).post(new RunnableC12300a(CameraUtils.getCameraInstance(this.f71946a)));
        }
    }

    public CameraHandlerThread(BarcodeScannerView barcodeScannerView) {
        super("CameraHandlerThread");
        this.f71945a = barcodeScannerView;
        start();
    }

    public void startCamera(int i) {
        new Handler(getLooper()).post(new RunnableC12299a(i));
    }
}
