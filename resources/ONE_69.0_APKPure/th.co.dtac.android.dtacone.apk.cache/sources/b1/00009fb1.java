package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.Frame;
import com.google.android.material.internal.ViewUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class CameraSource {
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_BACK = 0;
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_FRONT = 1;

    /* renamed from: a */
    public Context f48604a;

    /* renamed from: b */
    public final Object f48605b;

    /* renamed from: c */
    public Camera f48606c;

    /* renamed from: d */
    public int f48607d;

    /* renamed from: e */
    public int f48608e;

    /* renamed from: f */
    public Size f48609f;

    /* renamed from: g */
    public float f48610g;

    /* renamed from: h */
    public int f48611h;

    /* renamed from: i */
    public int f48612i;

    /* renamed from: j */
    public boolean f48613j;

    /* renamed from: k */
    public String f48614k;

    /* renamed from: l */
    public SurfaceTexture f48615l;

    /* renamed from: m */
    public Thread f48616m;

    /* renamed from: n */
    public RunnableC6762a f48617n;

    /* renamed from: o */
    public final IdentityHashMap f48618o;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final Detector f48619a;

        /* renamed from: b */
        public CameraSource f48620b;

        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.f48620b = cameraSource;
            if (context != null) {
                if (detector != null) {
                    this.f48619a = detector;
                    cameraSource.f48604a = context;
                    return;
                }
                throw new IllegalArgumentException("No detector supplied.");
            }
            throw new IllegalArgumentException("No context supplied.");
        }

        @RecentlyNonNull
        public CameraSource build() {
            CameraSource cameraSource = this.f48620b;
            cameraSource.getClass();
            cameraSource.f48617n = new RunnableC6762a(this.f48619a);
            return this.f48620b;
        }

        @RecentlyNonNull
        public Builder setAutoFocusEnabled(boolean z) {
            this.f48620b.f48613j = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                this.f48620b.f48607d = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("Invalid camera: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder setFocusMode(@RecentlyNonNull String str) {
            if (str.equals("continuous-video") || str.equals("continuous-picture")) {
                this.f48620b.f48614k = str;
            } else {
                Log.w("CameraSource", String.format("FocusMode %s is not supported for now.", str));
                this.f48620b.f48614k = null;
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestedFps(float f) {
            if (f > 0.0f) {
                this.f48620b.f48610g = f;
                return this;
            }
            StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid fps: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i > 0 && i <= 1000000 && i2 > 0 && i2 <= 1000000) {
                this.f48620b.f48611h = i;
                this.f48620b.f48612i = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Invalid preview size: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* loaded from: classes4.dex */
    public interface PictureCallback {
        void onPictureTaken(@RecentlyNonNull byte[] bArr);
    }

    /* loaded from: classes4.dex */
    public interface ShutterCallback {
        void onShutter();
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$a */
    /* loaded from: classes4.dex */
    public class RunnableC6762a implements Runnable {

        /* renamed from: a */
        public Detector f48621a;

        /* renamed from: e */
        public long f48625e;

        /* renamed from: g */
        public ByteBuffer f48627g;

        /* renamed from: b */
        public long f48622b = SystemClock.elapsedRealtime();

        /* renamed from: c */
        public final Object f48623c = new Object();

        /* renamed from: d */
        public boolean f48624d = true;

        /* renamed from: f */
        public int f48626f = 0;

        public RunnableC6762a(Detector detector) {
            this.f48621a = detector;
        }

        /* renamed from: a */
        public final void m46016a() {
            Detector detector = this.f48621a;
            if (detector != null) {
                detector.release();
                this.f48621a = null;
            }
        }

        /* renamed from: b */
        public final void m46015b(boolean z) {
            synchronized (this.f48623c) {
                this.f48624d = z;
                this.f48623c.notifyAll();
            }
        }

        /* renamed from: c */
        public final void m46014c(byte[] bArr, Camera camera) {
            synchronized (this.f48623c) {
                try {
                    ByteBuffer byteBuffer = this.f48627g;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.f48627g = null;
                    }
                    if (!CameraSource.this.f48618o.containsKey(bArr)) {
                        return;
                    }
                    this.f48625e = SystemClock.elapsedRealtime() - this.f48622b;
                    this.f48626f++;
                    this.f48627g = (ByteBuffer) CameraSource.this.f48618o.get(bArr);
                    this.f48623c.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Frame build;
            ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.f48623c) {
                    while (true) {
                        z = this.f48624d;
                        if (!z || this.f48627g != null) {
                            break;
                        }
                        try {
                            this.f48623c.wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                    if (!z) {
                        return;
                    }
                    build = new Frame.Builder().setImageData((ByteBuffer) Preconditions.checkNotNull(this.f48627g), CameraSource.this.f48609f.getWidth(), CameraSource.this.f48609f.getHeight(), 17).setId(this.f48626f).setTimestampMillis(this.f48625e).setRotation(CameraSource.this.f48608e).build();
                    byteBuffer = this.f48627g;
                    this.f48627g = null;
                }
                try {
                    ((Detector) Preconditions.checkNotNull(this.f48621a)).receiveFrame(build);
                } catch (Exception unused2) {
                } finally {
                    ((Camera) Preconditions.checkNotNull(CameraSource.this.f48606c)).addCallbackBuffer(((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).array());
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$b */
    /* loaded from: classes4.dex */
    public class C6763b implements Camera.PreviewCallback {
        public C6763b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.f48617n.m46014c(bArr, camera);
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$c */
    /* loaded from: classes4.dex */
    public class C6764c implements Camera.PictureCallback {

        /* renamed from: a */
        public PictureCallback f48630a;

        public C6764c() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.f48630a;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.f48605b) {
                try {
                    if (CameraSource.this.f48606c != null) {
                        CameraSource.this.f48606c.startPreview();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$d */
    /* loaded from: classes4.dex */
    public static class C6765d implements Camera.ShutterCallback {

        /* renamed from: a */
        public ShutterCallback f48632a;

        public C6765d() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
            ShutterCallback shutterCallback = this.f48632a;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$e */
    /* loaded from: classes4.dex */
    public static class C6766e {

        /* renamed from: a */
        public Size f48633a;

        /* renamed from: b */
        public Size f48634b;

        public C6766e(Camera.Size size, Camera.Size size2) {
            this.f48633a = new Size(size.width, size.height);
            if (size2 != null) {
                this.f48634b = new Size(size2.width, size2.height);
            }
        }

        /* renamed from: a */
        public final Size m46011a() {
            return this.f48633a;
        }

        /* renamed from: b */
        public final Size m46010b() {
            return this.f48634b;
        }
    }

    public CameraSource() {
        this.f48605b = new Object();
        this.f48607d = 0;
        this.f48610g = 30.0f;
        this.f48611h = 1024;
        this.f48612i = ViewUtils.EDGE_TO_EDGE_FLAGS;
        this.f48613j = false;
        this.f48618o = new IdentityHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.hardware.Camera m46029d() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.m46029d():android.hardware.Camera");
    }

    public int getCameraFacing() {
        return this.f48607d;
    }

    @RecentlyNonNull
    public Size getPreviewSize() {
        return this.f48609f;
    }

    /* renamed from: i */
    public final byte[] m46024i(Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray() && wrap.array() == bArr) {
            this.f48618o.put(bArr, wrap);
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }

    public void release() {
        synchronized (this.f48605b) {
            stop();
            this.f48617n.m46016a();
        }
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start() throws IOException {
        synchronized (this.f48605b) {
            try {
                if (this.f48606c != null) {
                    return this;
                }
                this.f48606c = m46029d();
                SurfaceTexture surfaceTexture = new SurfaceTexture(100);
                this.f48615l = surfaceTexture;
                this.f48606c.setPreviewTexture(surfaceTexture);
                this.f48606c.startPreview();
                Thread thread = new Thread(this.f48617n);
                this.f48616m = thread;
                thread.setName("gms.vision.CameraSource");
                this.f48617n.m46015b(true);
                Thread thread2 = this.f48616m;
                if (thread2 != null) {
                    thread2.start();
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void stop() {
        synchronized (this.f48605b) {
            this.f48617n.m46015b(false);
            Thread thread = this.f48616m;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                }
                this.f48616m = null;
            }
            Camera camera = this.f48606c;
            if (camera != null) {
                camera.stopPreview();
                this.f48606c.setPreviewCallbackWithBuffer(null);
                try {
                    this.f48606c.setPreviewTexture(null);
                    this.f48615l = null;
                    this.f48606c.setPreviewDisplay(null);
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                }
                ((Camera) Preconditions.checkNotNull(this.f48606c)).release();
                this.f48606c = null;
            }
            this.f48618o.clear();
        }
    }

    public void takePicture(@Nullable ShutterCallback shutterCallback, @Nullable PictureCallback pictureCallback) {
        synchronized (this.f48605b) {
            try {
                if (this.f48606c != null) {
                    C6765d c6765d = new C6765d();
                    c6765d.f48632a = shutterCallback;
                    C6764c c6764c = new C6764c();
                    c6764c.f48630a = pictureCallback;
                    this.f48606c.takePicture(c6765d, null, null, c6764c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start(@RecentlyNonNull SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.f48605b) {
            try {
                if (this.f48606c != null) {
                    return this;
                }
                Camera m46029d = m46029d();
                this.f48606c = m46029d;
                m46029d.setPreviewDisplay(surfaceHolder);
                this.f48606c.startPreview();
                this.f48616m = new Thread(this.f48617n);
                this.f48617n.m46015b(true);
                Thread thread = this.f48616m;
                if (thread != null) {
                    thread.start();
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}