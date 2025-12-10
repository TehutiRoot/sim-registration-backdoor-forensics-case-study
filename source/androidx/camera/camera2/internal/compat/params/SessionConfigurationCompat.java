package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SessionConfigurationCompat {
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;

    /* renamed from: a */
    public final InterfaceC2400c f10501a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface SessionMode {
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$b */
    /* loaded from: classes.dex */
    public static final class C2399b implements InterfaceC2400c {

        /* renamed from: a */
        public final List f10504a;

        /* renamed from: b */
        public final CameraCaptureSession.StateCallback f10505b;

        /* renamed from: c */
        public final Executor f10506c;

        /* renamed from: d */
        public final int f10507d;

        /* renamed from: e */
        public InputConfigurationCompat f10508e = null;

        /* renamed from: f */
        public CaptureRequest f10509f = null;

        public C2399b(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f10507d = i;
            this.f10504a = Collections.unmodifiableList(new ArrayList(list));
            this.f10505b = stateCallback;
            this.f10506c = executor;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: a */
        public CaptureRequest mo63661a() {
            return this.f10509f;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: b */
        public InputConfigurationCompat mo63660b() {
            return this.f10508e;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: c */
        public List mo63659c() {
            return this.f10504a;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: d */
        public void mo63658d(InputConfigurationCompat inputConfigurationCompat) {
            if (this.f10507d != 1) {
                this.f10508e = inputConfigurationCompat;
                return;
            }
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: e */
        public Object mo63657e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2399b) {
                C2399b c2399b = (C2399b) obj;
                if (Objects.equals(this.f10508e, c2399b.f10508e) && this.f10507d == c2399b.f10507d && this.f10504a.size() == c2399b.f10504a.size()) {
                    for (int i = 0; i < this.f10504a.size(); i++) {
                        if (!((OutputConfigurationCompat) this.f10504a.get(i)).equals(c2399b.f10504a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: f */
        public int mo63656f() {
            return this.f10507d;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: g */
        public void mo63655g(CaptureRequest captureRequest) {
            this.f10509f = captureRequest;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        public Executor getExecutor() {
            return this.f10506c;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        public CameraCaptureSession.StateCallback getStateCallback() {
            return this.f10505b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f10504a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            InputConfigurationCompat inputConfigurationCompat = this.f10508e;
            if (inputConfigurationCompat == null) {
                hashCode = 0;
            } else {
                hashCode = inputConfigurationCompat.hashCode();
            }
            int i2 = hashCode ^ i;
            return this.f10507d ^ ((i2 << 5) - i2);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2400c {
        /* renamed from: a */
        CaptureRequest mo63661a();

        /* renamed from: b */
        InputConfigurationCompat mo63660b();

        /* renamed from: c */
        List mo63659c();

        /* renamed from: d */
        void mo63658d(InputConfigurationCompat inputConfigurationCompat);

        /* renamed from: e */
        Object mo63657e();

        /* renamed from: f */
        int mo63656f();

        /* renamed from: g */
        void mo63655g(CaptureRequest captureRequest);

        Executor getExecutor();

        CameraCaptureSession.StateCallback getStateCallback();
    }

    public SessionConfigurationCompat(int i, @NonNull List<OutputConfigurationCompat> list, @NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f10501a = new C2399b(i, list, executor, stateCallback);
        } else {
            this.f10501a = new C2398a(i, list, executor, stateCallback);
        }
    }

    /* renamed from: a */
    public static List m63662a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            arrayList.add(OutputConfigurationCompat.wrap(AbstractC17728Hg1.m68057a(obj)));
        }
        return arrayList;
    }

    @NonNull
    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<OutputConfiguration> transformFromCompat(@NonNull List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            arrayList.add(AbstractC17728Hg1.m68057a(outputConfigurationCompat.unwrap()));
        }
        return arrayList;
    }

    @Nullable
    public static SessionConfigurationCompat wrap(@Nullable Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return new SessionConfigurationCompat(new C2398a(obj));
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SessionConfigurationCompat)) {
            return false;
        }
        return this.f10501a.equals(((SessionConfigurationCompat) obj).f10501a);
    }

    @NonNull
    public Executor getExecutor() {
        return this.f10501a.getExecutor();
    }

    @Nullable
    public InputConfigurationCompat getInputConfiguration() {
        return this.f10501a.mo63660b();
    }

    @NonNull
    public List<OutputConfigurationCompat> getOutputConfigurations() {
        return this.f10501a.mo63659c();
    }

    @Nullable
    public CaptureRequest getSessionParameters() {
        return this.f10501a.mo63661a();
    }

    public int getSessionType() {
        return this.f10501a.mo63656f();
    }

    @NonNull
    public CameraCaptureSession.StateCallback getStateCallback() {
        return this.f10501a.getStateCallback();
    }

    public int hashCode() {
        return this.f10501a.hashCode();
    }

    public void setInputConfiguration(@NonNull InputConfigurationCompat inputConfigurationCompat) {
        this.f10501a.mo63658d(inputConfigurationCompat);
    }

    public void setSessionParameters(@NonNull CaptureRequest captureRequest) {
        this.f10501a.mo63655g(captureRequest);
    }

    @Nullable
    public Object unwrap() {
        return this.f10501a.mo63657e();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$a */
    /* loaded from: classes.dex */
    public static final class C2398a implements InterfaceC2400c {

        /* renamed from: a */
        public final SessionConfiguration f10502a;

        /* renamed from: b */
        public final List f10503b;

        public C2398a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f10502a = sessionConfiguration;
            this.f10503b = Collections.unmodifiableList(SessionConfigurationCompat.m63662a(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: a */
        public CaptureRequest mo63661a() {
            return this.f10502a.getSessionParameters();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: b */
        public InputConfigurationCompat mo63660b() {
            return InputConfigurationCompat.wrap(this.f10502a.getInputConfiguration());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: c */
        public List mo63659c() {
            return this.f10503b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: d */
        public void mo63658d(InputConfigurationCompat inputConfigurationCompat) {
            this.f10502a.setInputConfiguration((InputConfiguration) inputConfigurationCompat.unwrap());
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: e */
        public Object mo63657e() {
            return this.f10502a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2398a)) {
                return false;
            }
            return Objects.equals(this.f10502a, ((C2398a) obj).f10502a);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: f */
        public int mo63656f() {
            return this.f10502a.getSessionType();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        /* renamed from: g */
        public void mo63655g(CaptureRequest captureRequest) {
            this.f10502a.setSessionParameters(captureRequest);
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        public Executor getExecutor() {
            return this.f10502a.getExecutor();
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.InterfaceC2400c
        public CameraCaptureSession.StateCallback getStateCallback() {
            return this.f10502a.getStateCallback();
        }

        public int hashCode() {
            return this.f10502a.hashCode();
        }

        public C2398a(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, SessionConfigurationCompat.transformFromCompat(list), executor, stateCallback));
        }
    }

    public SessionConfigurationCompat(InterfaceC2400c interfaceC2400c) {
        this.f10501a = interfaceC2400c;
    }
}
