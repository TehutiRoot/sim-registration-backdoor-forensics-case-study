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
    public Context f48592a;

    /* renamed from: b */
    public final Object f48593b;

    /* renamed from: c */
    public Camera f48594c;

    /* renamed from: d */
    public int f48595d;

    /* renamed from: e */
    public int f48596e;

    /* renamed from: f */
    public Size f48597f;

    /* renamed from: g */
    public float f48598g;

    /* renamed from: h */
    public int f48599h;

    /* renamed from: i */
    public int f48600i;

    /* renamed from: j */
    public boolean f48601j;

    /* renamed from: k */
    public String f48602k;

    /* renamed from: l */
    public SurfaceTexture f48603l;

    /* renamed from: m */
    public Thread f48604m;

    /* renamed from: n */
    public RunnableC6773a f48605n;

    /* renamed from: o */
    public final IdentityHashMap f48606o;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final Detector f48607a;

        /* renamed from: b */
        public CameraSource f48608b;

        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.f48608b = cameraSource;
            if (context != null) {
                if (detector != null) {
                    this.f48607a = detector;
                    cameraSource.f48592a = context;
                    return;
                }
                throw new IllegalArgumentException("No detector supplied.");
            }
            throw new IllegalArgumentException("No context supplied.");
        }

        @RecentlyNonNull
        public CameraSource build() {
            CameraSource cameraSource = this.f48608b;
            cameraSource.getClass();
            cameraSource.f48605n = new RunnableC6773a(this.f48607a);
            return this.f48608b;
        }

        @RecentlyNonNull
        public Builder setAutoFocusEnabled(boolean z) {
            this.f48608b.f48601j = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                this.f48608b.f48595d = i;
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
                this.f48608b.f48602k = str;
            } else {
                Log.w("CameraSource", String.format("FocusMode %s is not supported for now.", str));
                this.f48608b.f48602k = null;
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestedFps(float f) {
            if (f > 0.0f) {
                this.f48608b.f48598g = f;
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
                this.f48608b.f48599h = i;
                this.f48608b.f48600i = i2;
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
    public class RunnableC6773a implements Runnable {

        /* renamed from: a */
        public Detector f48609a;

        /* renamed from: e */
        public long f48613e;

        /* renamed from: g */
        public ByteBuffer f48615g;

        /* renamed from: b */
        public long f48610b = SystemClock.elapsedRealtime();

        /* renamed from: c */
        public final Object f48611c = new Object();

        /* renamed from: d */
        public boolean f48612d = true;

        /* renamed from: f */
        public int f48614f = 0;

        public RunnableC6773a(Detector detector) {
            this.f48609a = detector;
        }

        /* renamed from: a */
        public final void m46031a() {
            Detector detector = this.f48609a;
            if (detector != null) {
                detector.release();
                this.f48609a = null;
            }
        }

        /* renamed from: b */
        public final void m46030b(boolean z) {
            synchronized (this.f48611c) {
                this.f48612d = z;
                this.f48611c.notifyAll();
            }
        }

        /* renamed from: c */
        public final void m46029c(byte[] bArr, Camera camera) {
            synchronized (this.f48611c) {
                try {
                    ByteBuffer byteBuffer = this.f48615g;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.f48615g = null;
                    }
                    if (!CameraSource.this.f48606o.containsKey(bArr)) {
                        return;
                    }
                    this.f48613e = SystemClock.elapsedRealtime() - this.f48610b;
                    this.f48614f++;
                    this.f48615g = (ByteBuffer) CameraSource.this.f48606o.get(bArr);
                    this.f48611c.notifyAll();
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
                synchronized (this.f48611c) {
                    while (true) {
                        z = this.f48612d;
                        if (!z || this.f48615g != null) {
                            break;
                        }
                        try {
                            this.f48611c.wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                    if (!z) {
                        return;
                    }
                    build = new Frame.Builder().setImageData((ByteBuffer) Preconditions.checkNotNull(this.f48615g), CameraSource.this.f48597f.getWidth(), CameraSource.this.f48597f.getHeight(), 17).setId(this.f48614f).setTimestampMillis(this.f48613e).setRotation(CameraSource.this.f48596e).build();
                    byteBuffer = this.f48615g;
                    this.f48615g = null;
                }
                try {
                    ((Detector) Preconditions.checkNotNull(this.f48609a)).receiveFrame(build);
                } catch (Exception unused2) {
                } finally {
                    ((Camera) Preconditions.checkNotNull(CameraSource.this.f48594c)).addCallbackBuffer(((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).array());
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$b */
    /* loaded from: classes4.dex */
    public class C6774b implements Camera.PreviewCallback {
        public C6774b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.f48605n.m46029c(bArr, camera);
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$c */
    /* loaded from: classes4.dex */
    public class C6775c implements Camera.PictureCallback {

        /* renamed from: a */
        public PictureCallback f48618a;

        public C6775c() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.f48618a;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.f48593b) {
                try {
                    if (CameraSource.this.f48594c != null) {
                        CameraSource.this.f48594c.startPreview();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$d */
    /* loaded from: classes4.dex */
    public static class C6776d implements Camera.ShutterCallback {

        /* renamed from: a */
        public ShutterCallback f48620a;

        public C6776d() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
            ShutterCallback shutterCallback = this.f48620a;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.CameraSource$e */
    /* loaded from: classes4.dex */
    public static class C6777e {

        /* renamed from: a */
        public Size f48621a;

        /* renamed from: b */
        public Size f48622b;

        public C6777e(Camera.Size size, Camera.Size size2) {
            this.f48621a = new Size(size.width, size.height);
            if (size2 != null) {
                this.f48622b = new Size(size2.width, size2.height);
            }
        }

        /* renamed from: a */
        public final Size m46026a() {
            return this.f48621a;
        }

        /* renamed from: b */
        public final Size m46025b() {
            return this.f48622b;
        }
    }

    public CameraSource() {
        this.f48593b = new Object();
        this.f48595d = 0;
        this.f48598g = 30.0f;
        this.f48599h = 1024;
        this.f48600i = ViewUtils.EDGE_TO_EDGE_FLAGS;
        this.f48601j = false;
        this.f48606o = new IdentityHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.hardware.Camera m46044d() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.m46044d():android.hardware.Camera");
    }

    public int getCameraFacing() {
        return this.f48595d;
    }

    @RecentlyNonNull
    public Size getPreviewSize() {
        return this.f48597f;
    }

    /* renamed from: i */
    public final byte[] m46039i(Size size) {
        byte[] bArr = new byte[((int) Math.ceil(((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray() && wrap.array() == bArr) {
            this.f48606o.put(bArr, wrap);
            return bArr;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }

    public void release() {
        synchronized (this.f48593b) {
            stop();
            this.f48605n.m46031a();
        }
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start() throws IOException {
        synchronized (this.f48593b) {
            try {
                if (this.f48594c != null) {
                    return this;
                }
                this.f48594c = m46044d();
                SurfaceTexture surfaceTexture = new SurfaceTexture(100);
                this.f48603l = surfaceTexture;
                this.f48594c.setPreviewTexture(surfaceTexture);
                this.f48594c.startPreview();
                Thread thread = new Thread(this.f48605n);
                this.f48604m = thread;
                thread.setName("gms.vision.CameraSource");
                this.f48605n.m46030b(true);
                Thread thread2 = this.f48604m;
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
        synchronized (this.f48593b) {
            this.f48605n.m46030b(false);
            Thread thread = this.f48604m;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                }
                this.f48604m = null;
            }
            Camera camera = this.f48594c;
            if (camera != null) {
                camera.stopPreview();
                this.f48594c.setPreviewCallbackWithBuffer(null);
                try {
                    this.f48594c.setPreviewTexture(null);
                    this.f48603l = null;
                    this.f48594c.setPreviewDisplay(null);
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(valueOf);
                }
                ((Camera) Preconditions.checkNotNull(this.f48594c)).release();
                this.f48594c = null;
            }
            this.f48606o.clear();
        }
    }

    public void takePicture(@Nullable ShutterCallback shutterCallback, @Nullable PictureCallback pictureCallback) {
        synchronized (this.f48593b) {
            try {
                if (this.f48594c != null) {
                    C6776d c6776d = new C6776d();
                    c6776d.f48620a = shutterCallback;
                    C6775c c6775c = new C6775c();
                    c6775c.f48618a = pictureCallback;
                    this.f48594c.takePicture(c6776d, null, null, c6775c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start(@RecentlyNonNull SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.f48593b) {
            try {
                if (this.f48594c != null) {
                    return this;
                }
                Camera m46044d = m46044d();
                this.f48594c = m46044d;
                m46044d.setPreviewDisplay(surfaceHolder);
                this.f48594c.startPreview();
                this.f48604m = new Thread(this.f48605n);
                this.f48605n.m46030b(true);
                Thread thread = this.f48604m;
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
