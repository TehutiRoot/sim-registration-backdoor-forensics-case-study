package p000;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.R;
import java.util.Arrays;

/* renamed from: gT1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20044gT1 implements Parcelable {
    public static final Parcelable.Creator<C20044gT1> CREATOR = new C10305a();

    /* renamed from: a */
    public final C21828qr0 f62174a;

    /* renamed from: b */
    public final C21828qr0 f62175b;

    /* renamed from: c */
    public final int f62176c;

    /* renamed from: d */
    public int f62177d;

    /* renamed from: e */
    public int f62178e;

    /* renamed from: f */
    public int f62179f;

    /* renamed from: g */
    public int f62180g;

    /* renamed from: gT1$a */
    /* loaded from: classes4.dex */
    public class C10305a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C20044gT1 createFromParcel(Parcel parcel) {
            return new C20044gT1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C20044gT1[] newArray(int i) {
            return new C20044gT1[i];
        }
    }

    public C20044gT1() {
        this(0);
    }

    /* renamed from: a */
    public static String m31125a(Resources resources, CharSequence charSequence) {
        return m31124b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m31124b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static int m31119g(int i) {
        if (i >= 12) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public int m31123c() {
        if (this.f62176c == 1) {
            return R.string.material_hour_24h_suffix;
        }
        return R.string.material_hour_suffix;
    }

    /* renamed from: d */
    public int m31122d() {
        if (this.f62176c == 1) {
            return this.f62177d % 24;
        }
        int i = this.f62177d;
        if (i % 12 == 0) {
            return 12;
        }
        if (this.f62180g == 1) {
            return i - 12;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C21828qr0 m31121e() {
        return this.f62175b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20044gT1)) {
            return false;
        }
        C20044gT1 c20044gT1 = (C20044gT1) obj;
        if (this.f62177d == c20044gT1.f62177d && this.f62178e == c20044gT1.f62178e && this.f62176c == c20044gT1.f62176c && this.f62179f == c20044gT1.f62179f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C21828qr0 m31120f() {
        return this.f62174a;
    }

    /* renamed from: h */
    public void m31118h(int i) {
        if (this.f62176c == 1) {
            this.f62177d = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f62180g != 1) {
            i2 = 0;
        }
        this.f62177d = i3 + i2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f62176c), Integer.valueOf(this.f62177d), Integer.valueOf(this.f62178e), Integer.valueOf(this.f62179f)});
    }

    /* renamed from: i */
    public void m31117i(int i) {
        this.f62180g = m31119g(i);
        this.f62177d = i;
    }

    /* renamed from: j */
    public void m31116j(int i) {
        this.f62178e = i % 60;
    }

    /* renamed from: k */
    public void m31115k(int i) {
        if (i != this.f62180g) {
            this.f62180g = i;
            int i2 = this.f62177d;
            if (i2 < 12 && i == 1) {
                this.f62177d = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.f62177d = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62177d);
        parcel.writeInt(this.f62178e);
        parcel.writeInt(this.f62179f);
        parcel.writeInt(this.f62176c);
    }

    public C20044gT1(int i) {
        this(0, 0, 10, i);
    }

    public C20044gT1(int i, int i2, int i3, int i4) {
        this.f62177d = i;
        this.f62178e = i2;
        this.f62179f = i3;
        this.f62176c = i4;
        this.f62180g = m31119g(i);
        this.f62174a = new C21828qr0(59);
        this.f62175b = new C21828qr0(i4 == 1 ? 23 : 12);
    }

    public C20044gT1(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
