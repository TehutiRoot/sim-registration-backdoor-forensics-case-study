package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class InputConfigurationCompat {

    /* renamed from: a */
    public final InterfaceC2378d f10583a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$b */
    /* loaded from: classes.dex */
    public static final class C2376b extends C2375a {
        public C2376b(Object obj) {
            super(obj);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.C2375a, androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        /* renamed from: c */
        public boolean mo63615c() {
            return ((InputConfiguration) mo63616b()).isMultiResolution();
        }

        public C2376b(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$c */
    /* loaded from: classes.dex */
    public static final class C2377c implements InterfaceC2378d {

        /* renamed from: a */
        public final int f10585a;

        /* renamed from: b */
        public final int f10586b;

        /* renamed from: c */
        public final int f10587c;

        public C2377c(int i, int i2, int i3) {
            this.f10585a = i;
            this.f10586b = i2;
            this.f10587c = i3;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        /* renamed from: b */
        public Object mo63616b() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        /* renamed from: c */
        public boolean mo63615c() {
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2377c)) {
                return false;
            }
            C2377c c2377c = (C2377c) obj;
            if (c2377c.getWidth() != this.f10585a || c2377c.getHeight() != this.f10586b || c2377c.getFormat() != this.f10587c) {
                return false;
            }
            return true;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        public int getFormat() {
            return this.f10587c;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        public int getHeight() {
            return this.f10586b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        public int getWidth() {
            return this.f10585a;
        }

        public int hashCode() {
            int i = 31 ^ this.f10585a;
            int i2 = this.f10586b ^ ((i << 5) - i);
            return this.f10587c ^ ((i2 << 5) - i2);
        }

        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", Integer.valueOf(this.f10585a), Integer.valueOf(this.f10586b), Integer.valueOf(this.f10587c));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2378d {
        /* renamed from: b */
        Object mo63616b();

        /* renamed from: c */
        boolean mo63615c();

        int getFormat();

        int getHeight();

        int getWidth();
    }

    public InputConfigurationCompat(int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            this.f10583a = new C2376b(i, i2, i3);
        } else if (i4 >= 23) {
            this.f10583a = new C2375a(i, i2, i3);
        } else {
            this.f10583a = new C2377c(i, i2, i3);
        }
    }

    @Nullable
    public static InputConfigurationCompat wrap(@Nullable Object obj) {
        int i;
        if (obj == null || (i = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (i >= 31) {
            return new InputConfigurationCompat(new C2376b(obj));
        }
        return new InputConfigurationCompat(new C2375a(obj));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat)) {
            return false;
        }
        return this.f10583a.equals(((InputConfigurationCompat) obj).f10583a);
    }

    public int getFormat() {
        return this.f10583a.getFormat();
    }

    public int getHeight() {
        return this.f10583a.getHeight();
    }

    public int getWidth() {
        return this.f10583a.getWidth();
    }

    public int hashCode() {
        return this.f10583a.hashCode();
    }

    public boolean isMultiResolution() {
        return this.f10583a.mo63615c();
    }

    @NonNull
    public String toString() {
        return this.f10583a.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.f10583a.mo63616b();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$a */
    /* loaded from: classes.dex */
    public static class C2375a implements InterfaceC2378d {

        /* renamed from: a */
        public final InputConfiguration f10584a;

        public C2375a(Object obj) {
            this.f10584a = (InputConfiguration) obj;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        /* renamed from: b */
        public Object mo63616b() {
            return this.f10584a;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        /* renamed from: c */
        public boolean mo63615c() {
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC2378d)) {
                return false;
            }
            return Objects.equals(this.f10584a, ((InterfaceC2378d) obj).mo63616b());
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        public int getFormat() {
            return this.f10584a.getFormat();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        public int getHeight() {
            return this.f10584a.getHeight();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2378d
        public int getWidth() {
            return this.f10584a.getWidth();
        }

        public int hashCode() {
            return this.f10584a.hashCode();
        }

        public String toString() {
            return this.f10584a.toString();
        }

        public C2375a(int i, int i2, int i3) {
            this(new InputConfiguration(i, i2, i3));
        }
    }

    public InputConfigurationCompat(InterfaceC2378d interfaceC2378d) {
        this.f10583a = interfaceC2378d;
    }
}