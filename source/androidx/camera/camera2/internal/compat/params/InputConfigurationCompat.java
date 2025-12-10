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
    public final InterfaceC2396d f10495a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$b */
    /* loaded from: classes.dex */
    public static final class C2394b extends C2393a {
        public C2394b(Object obj) {
            super(obj);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.C2393a, androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        /* renamed from: c */
        public boolean mo63664c() {
            return ((InputConfiguration) mo63665b()).isMultiResolution();
        }

        public C2394b(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$c */
    /* loaded from: classes.dex */
    public static final class C2395c implements InterfaceC2396d {

        /* renamed from: a */
        public final int f10497a;

        /* renamed from: b */
        public final int f10498b;

        /* renamed from: c */
        public final int f10499c;

        public C2395c(int i, int i2, int i3) {
            this.f10497a = i;
            this.f10498b = i2;
            this.f10499c = i3;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        /* renamed from: b */
        public Object mo63665b() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        /* renamed from: c */
        public boolean mo63664c() {
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2395c)) {
                return false;
            }
            C2395c c2395c = (C2395c) obj;
            if (c2395c.getWidth() != this.f10497a || c2395c.getHeight() != this.f10498b || c2395c.getFormat() != this.f10499c) {
                return false;
            }
            return true;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        public int getFormat() {
            return this.f10499c;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        public int getHeight() {
            return this.f10498b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        public int getWidth() {
            return this.f10497a;
        }

        public int hashCode() {
            int i = 31 ^ this.f10497a;
            int i2 = this.f10498b ^ ((i << 5) - i);
            return this.f10499c ^ ((i2 << 5) - i2);
        }

        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", Integer.valueOf(this.f10497a), Integer.valueOf(this.f10498b), Integer.valueOf(this.f10499c));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2396d {
        /* renamed from: b */
        Object mo63665b();

        /* renamed from: c */
        boolean mo63664c();

        int getFormat();

        int getHeight();

        int getWidth();
    }

    public InputConfigurationCompat(int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            this.f10495a = new C2394b(i, i2, i3);
        } else if (i4 >= 23) {
            this.f10495a = new C2393a(i, i2, i3);
        } else {
            this.f10495a = new C2395c(i, i2, i3);
        }
    }

    @Nullable
    public static InputConfigurationCompat wrap(@Nullable Object obj) {
        int i;
        if (obj == null || (i = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (i >= 31) {
            return new InputConfigurationCompat(new C2394b(obj));
        }
        return new InputConfigurationCompat(new C2393a(obj));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat)) {
            return false;
        }
        return this.f10495a.equals(((InputConfigurationCompat) obj).f10495a);
    }

    public int getFormat() {
        return this.f10495a.getFormat();
    }

    public int getHeight() {
        return this.f10495a.getHeight();
    }

    public int getWidth() {
        return this.f10495a.getWidth();
    }

    public int hashCode() {
        return this.f10495a.hashCode();
    }

    public boolean isMultiResolution() {
        return this.f10495a.mo63664c();
    }

    @NonNull
    public String toString() {
        return this.f10495a.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.f10495a.mo63665b();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$a */
    /* loaded from: classes.dex */
    public static class C2393a implements InterfaceC2396d {

        /* renamed from: a */
        public final InputConfiguration f10496a;

        public C2393a(Object obj) {
            this.f10496a = (InputConfiguration) obj;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        /* renamed from: b */
        public Object mo63665b() {
            return this.f10496a;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        /* renamed from: c */
        public boolean mo63664c() {
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC2396d)) {
                return false;
            }
            return Objects.equals(this.f10496a, ((InterfaceC2396d) obj).mo63665b());
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        public int getFormat() {
            return this.f10496a.getFormat();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        public int getHeight() {
            return this.f10496a.getHeight();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InterfaceC2396d
        public int getWidth() {
            return this.f10496a.getWidth();
        }

        public int hashCode() {
            return this.f10496a.hashCode();
        }

        public String toString() {
            return this.f10496a.toString();
        }

        public C2393a(int i, int i2, int i3) {
            this(new InputConfiguration(i, i2, i3));
        }
    }

    public InputConfigurationCompat(InterfaceC2396d interfaceC2396d) {
        this.f10495a = interfaceC2396d;
    }
}
