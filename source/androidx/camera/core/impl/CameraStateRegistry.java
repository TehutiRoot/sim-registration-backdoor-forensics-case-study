package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {

    /* renamed from: a */
    public final StringBuilder f11098a = new StringBuilder();

    /* renamed from: b */
    public final Object f11099b;

    /* renamed from: c */
    public int f11100c;

    /* renamed from: d */
    public final CameraCoordinator f11101d;

    /* renamed from: e */
    public final Map f11102e;

    /* renamed from: f */
    public int f11103f;

    /* loaded from: classes.dex */
    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* loaded from: classes.dex */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    /* renamed from: androidx.camera.core.impl.CameraStateRegistry$a */
    /* loaded from: classes.dex */
    public static class C2503a {

        /* renamed from: a */
        public CameraInternal.State f11104a;

        /* renamed from: b */
        public final Executor f11105b;

        /* renamed from: c */
        public final OnConfigureAvailableListener f11106c;

        /* renamed from: d */
        public final OnOpenAvailableListener f11107d;

        public C2503a(CameraInternal.State state, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.f11104a = state;
            this.f11105b = executor;
            this.f11106c = onConfigureAvailableListener;
            this.f11107d = onOpenAvailableListener;
        }

        /* renamed from: a */
        public CameraInternal.State m62957a() {
            return this.f11104a;
        }

        /* renamed from: b */
        public void m62956b() {
            try {
                Executor executor = this.f11105b;
                final OnConfigureAvailableListener onConfigureAvailableListener = this.f11106c;
                Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new Runnable() { // from class: lk
                    @Override // java.lang.Runnable
                    public final void run() {
                        onConfigureAvailableListener.onConfigureAvailable();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63227e("CameraStateRegistry", "Unable to notify camera to configure.", e);
            }
        }

        /* renamed from: c */
        public void m62955c() {
            try {
                Executor executor = this.f11105b;
                final OnOpenAvailableListener onOpenAvailableListener = this.f11107d;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new Runnable() { // from class: kk
                    @Override // java.lang.Runnable
                    public final void run() {
                        onOpenAvailableListener.onOpenAvailable();
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.m63227e("CameraStateRegistry", "Unable to notify camera to open.", e);
            }
        }

        /* renamed from: d */
        public CameraInternal.State m62954d(CameraInternal.State state) {
            CameraInternal.State state2 = this.f11104a;
            this.f11104a = state;
            return state2;
        }
    }

    public CameraStateRegistry(@NonNull CameraCoordinator cameraCoordinator, int i) {
        Object obj = new Object();
        this.f11099b = obj;
        this.f11102e = new HashMap();
        this.f11100c = i;
        synchronized (obj) {
            this.f11101d = cameraCoordinator;
            this.f11103f = this.f11100c;
        }
    }

    /* renamed from: b */
    public static boolean m62961b(CameraInternal.State state) {
        if (state != null && state.holdsCameraSlot()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C2503a m62962a(String str) {
        for (Camera camera : this.f11102e.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return (C2503a) this.f11102e.get(camera);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m62960c() {
        String str;
        if (Logger.isDebugEnabled("CameraStateRegistry")) {
            this.f11098a.setLength(0);
            this.f11098a.append("Recalculating open cameras:\n");
            this.f11098a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f11098a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f11102e.entrySet()) {
            if (Logger.isDebugEnabled("CameraStateRegistry")) {
                if (((C2503a) entry.getValue()).m62957a() != null) {
                    str = ((C2503a) entry.getValue()).m62957a().toString();
                } else {
                    str = "UNKNOWN";
                }
                this.f11098a.append(String.format(Locale.US, "%-45s%-22s\n", ((Camera) entry.getKey()).toString(), str));
            }
            if (m62961b(((C2503a) entry.getValue()).m62957a())) {
                i++;
            }
        }
        if (Logger.isDebugEnabled("CameraStateRegistry")) {
            this.f11098a.append("-------------------------------------------------------------------\n");
            this.f11098a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f11100c)));
            Logger.m63230d("CameraStateRegistry", this.f11098a.toString());
        }
        this.f11103f = Math.max(this.f11100c - i, 0);
    }

    /* renamed from: d */
    public final CameraInternal.State m62959d(Camera camera) {
        C2503a c2503a = (C2503a) this.f11102e.remove(camera);
        if (c2503a != null) {
            m62960c();
            return c2503a.m62957a();
        }
        return null;
    }

    /* renamed from: e */
    public final CameraInternal.State m62958e(Camera camera, CameraInternal.State state) {
        boolean z;
        CameraInternal.State m62954d = ((C2503a) Preconditions.checkNotNull((C2503a) this.f11102e.get(camera), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m62954d(state);
        CameraInternal.State state2 = CameraInternal.State.OPENING;
        if (state == state2) {
            if (!m62961b(state) && m62954d != state2) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkState(z, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (m62954d != state) {
            m62960c();
        }
        return m62954d;
    }

    public boolean isCameraClosing() {
        synchronized (this.f11099b) {
            try {
                for (Map.Entry entry : this.f11102e.entrySet()) {
                    if (((C2503a) entry.getValue()).m62957a() == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void markCameraState(@NonNull Camera camera, @NonNull CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i, int i2) {
        int i3;
        boolean z;
        synchronized (this.f11099b) {
            boolean z2 = true;
            if (i2 == 2) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            this.f11100c = i3;
            if (i != 2 && i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i != 2 || i2 == 2) {
                z2 = false;
            }
            if (z || z2) {
                m62960c();
            }
        }
    }

    public void registerCamera(@NonNull Camera camera, @NonNull Executor executor, @NonNull OnConfigureAvailableListener onConfigureAvailableListener, @NonNull OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.f11099b) {
            Preconditions.checkState(!this.f11102e.containsKey(camera), "Camera is already registered: " + camera);
            this.f11102e.put(camera, new C2503a(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0005, B:6:0x001d, B:9:0x0056, B:11:0x005a, B:16:0x006d, B:18:0x0075, B:22:0x0082, B:24:0x009a, B:25:0x009d, B:15:0x0067), top: B:29:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x0005, B:6:0x001d, B:9:0x0056, B:11:0x005a, B:16:0x006d, B:18:0x0075, B:22:0x0082, B:24:0x009a, B:25:0x009d, B:15:0x0067), top: B:29:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean tryOpenCamera(@androidx.annotation.NonNull androidx.camera.core.Camera r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r11.f11099b
            monitor-enter(r2)
            java.util.Map r3 = r11.f11102e     // Catch: java.lang.Throwable -> L54
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L54
            androidx.camera.core.impl.CameraStateRegistry$a r3 = (androidx.camera.core.impl.CameraStateRegistry.C2503a) r3     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "Camera must first be registered with registerCamera()"
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3, r4)     // Catch: java.lang.Throwable -> L54
            androidx.camera.core.impl.CameraStateRegistry$a r3 = (androidx.camera.core.impl.CameraStateRegistry.C2503a) r3     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "CameraStateRegistry"
            boolean r4 = androidx.camera.core.Logger.isDebugEnabled(r4)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L56
            java.lang.StringBuilder r4 = r11.f11098a     // Catch: java.lang.Throwable -> L54
            r4.setLength(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r4 = r11.f11098a     // Catch: java.lang.Throwable -> L54
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            int r7 = r11.f11103f     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L54
            androidx.camera.core.impl.CameraInternal$State r8 = r3.m62957a()     // Catch: java.lang.Throwable -> L54
            boolean r8 = m62961b(r8)     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L54
            androidx.camera.core.impl.CameraInternal$State r9 = r3.m62957a()     // Catch: java.lang.Throwable -> L54
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L54
            r10[r1] = r12     // Catch: java.lang.Throwable -> L54
            r10[r0] = r7     // Catch: java.lang.Throwable -> L54
            r12 = 2
            r10[r12] = r8     // Catch: java.lang.Throwable -> L54
            r12 = 3
            r10[r12] = r9     // Catch: java.lang.Throwable -> L54
            java.lang.String r12 = java.lang.String.format(r5, r6, r10)     // Catch: java.lang.Throwable -> L54
            r4.append(r12)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r12 = move-exception
            goto L9f
        L56:
            int r12 = r11.f11103f     // Catch: java.lang.Throwable -> L54
            if (r12 > 0) goto L67
            androidx.camera.core.impl.CameraInternal$State r12 = r3.m62957a()     // Catch: java.lang.Throwable -> L54
            boolean r12 = m62961b(r12)     // Catch: java.lang.Throwable -> L54
            if (r12 == 0) goto L65
            goto L67
        L65:
            r12 = 0
            goto L6d
        L67:
            androidx.camera.core.impl.CameraInternal$State r12 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.Throwable -> L54
            r3.m62954d(r12)     // Catch: java.lang.Throwable -> L54
            r12 = 1
        L6d:
            java.lang.String r3 = "CameraStateRegistry"
            boolean r3 = androidx.camera.core.Logger.isDebugEnabled(r3)     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L98
            java.lang.StringBuilder r3 = r11.f11098a     // Catch: java.lang.Throwable -> L54
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = " --> %s"
            if (r12 == 0) goto L80
            java.lang.String r6 = "SUCCESS"
            goto L82
        L80:
            java.lang.String r6 = "FAIL"
        L82:
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L54
            r0[r1] = r6     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = java.lang.String.format(r4, r5, r0)     // Catch: java.lang.Throwable -> L54
            r3.append(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "CameraStateRegistry"
            java.lang.StringBuilder r1 = r11.f11098a     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L54
            androidx.camera.core.Logger.m63230d(r0, r1)     // Catch: java.lang.Throwable -> L54
        L98:
            if (r12 == 0) goto L9d
            r11.m62960c()     // Catch: java.lang.Throwable -> L54
        L9d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            return r12
        L9f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCamera(androidx.camera.core.Camera):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean tryOpenCaptureSession(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11099b
            monitor-enter(r0)
            androidx.camera.core.concurrent.CameraCoordinator r1 = r5.f11101d     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Lf
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r6 = move-exception
            goto L61
        L11:
            androidx.camera.core.impl.CameraStateRegistry$a r1 = r5.m62962a(r6)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 == 0) goto L21
            androidx.camera.core.impl.CameraStateRegistry$a r6 = r5.m62962a(r6)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.impl.CameraInternal$State r6 = r6.m62957a()     // Catch: java.lang.Throwable -> Lf
            goto L22
        L21:
            r6 = r2
        L22:
            if (r7 == 0) goto L32
            androidx.camera.core.impl.CameraStateRegistry$a r1 = r5.m62962a(r7)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L32
            androidx.camera.core.impl.CameraStateRegistry$a r7 = r5.m62962a(r7)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.impl.CameraInternal$State r2 = r7.m62957a()     // Catch: java.lang.Throwable -> Lf
        L32:
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            if (r1 != 0) goto L46
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 == 0) goto L44
            goto L46
        L44:
            r6 = 0
            goto L47
        L46:
            r6 = 1
        L47:
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r7 != 0) goto L58
            androidx.camera.core.impl.CameraInternal$State r7 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Lf
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L56
            goto L58
        L56:
            r7 = 0
            goto L59
        L58:
            r7 = 1
        L59:
            if (r6 == 0) goto L5e
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.tryOpenCaptureSession(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void markCameraState(@androidx.annotation.NonNull androidx.camera.core.Camera r7, @androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal.State r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11099b
            monitor-enter(r0)
            int r1 = r6.f11103f     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L11
            androidx.camera.core.impl.CameraInternal$State r2 = r6.m62959d(r7)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r7 = move-exception
            goto Lbf
        L11:
            androidx.camera.core.impl.CameraInternal$State r2 = r6.m62958e(r7, r8)     // Catch: java.lang.Throwable -> Le
        L15:
            if (r2 != r8) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L19:
            androidx.camera.core.concurrent.CameraCoordinator r2 = r6.f11101d     // Catch: java.lang.Throwable -> Le
            int r2 = r2.getCameraOperatingMode()     // Catch: java.lang.Throwable -> Le
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L3e
            androidx.camera.core.impl.CameraInternal$State r2 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.Throwable -> Le
            if (r8 != r2) goto L3e
            androidx.camera.core.CameraInfo r2 = r7.getCameraInfo()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r2.getCameraId()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.concurrent.CameraCoordinator r3 = r6.f11101d     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = r3.getPairedConcurrentCameraId(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3e
            androidx.camera.core.impl.CameraStateRegistry$a r2 = r6.m62962a(r2)     // Catch: java.lang.Throwable -> Le
            goto L3f
        L3e:
            r2 = r4
        L3f:
            r3 = 1
            if (r1 >= r3) goto L7f
            int r1 = r6.f11103f     // Catch: java.lang.Throwable -> Le
            if (r1 <= 0) goto L7f
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map r8 = r6.f11102e     // Catch: java.lang.Throwable -> Le
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Le
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> Le
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$a r3 = (androidx.camera.core.impl.CameraStateRegistry.C2503a) r3     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r3 = r3.m62957a()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraInternal$State r5 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r3 != r5) goto L55
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.Camera r3 = (androidx.camera.core.Camera) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$a r1 = (androidx.camera.core.impl.CameraStateRegistry.C2503a) r1     // Catch: java.lang.Throwable -> Le
            r4.put(r3, r1)     // Catch: java.lang.Throwable -> Le
            goto L55
        L7f:
            androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.Throwable -> Le
            if (r8 != r1) goto L97
            int r8 = r6.f11103f     // Catch: java.lang.Throwable -> Le
            if (r8 <= 0) goto L97
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r4.<init>()     // Catch: java.lang.Throwable -> Le
            java.util.Map r8 = r6.f11102e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.impl.CameraStateRegistry$a r8 = (androidx.camera.core.impl.CameraStateRegistry.C2503a) r8     // Catch: java.lang.Throwable -> Le
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> Le
        L97:
            if (r4 == 0) goto L9e
            if (r9 != 0) goto L9e
            r4.remove(r7)     // Catch: java.lang.Throwable -> Le
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto Lb9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        La9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.CameraStateRegistry$a r8 = (androidx.camera.core.impl.CameraStateRegistry.C2503a) r8
            r8.m62955c()
            goto La9
        Lb9:
            if (r2 == 0) goto Lbe
            r2.m62956b()
        Lbe:
            return
        Lbf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraStateRegistry.markCameraState(androidx.camera.core.Camera, androidx.camera.core.impl.CameraInternal$State, boolean):void");
    }
}
