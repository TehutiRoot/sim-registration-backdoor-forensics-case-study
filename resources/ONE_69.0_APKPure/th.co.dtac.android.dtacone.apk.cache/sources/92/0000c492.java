package p000;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.R;
import java.util.Arrays;

/* renamed from: dU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19580dU1 implements Parcelable {
    public static final Parcelable.Creator<C19580dU1> CREATOR = new C10071a();

    /* renamed from: a */
    public final C22929wr0 f61250a;

    /* renamed from: b */
    public final C22929wr0 f61251b;

    /* renamed from: c */
    public final int f61252c;

    /* renamed from: d */
    public int f61253d;

    /* renamed from: e */
    public int f61254e;

    /* renamed from: f */
    public int f61255f;

    /* renamed from: g */
    public int f61256g;

    /* renamed from: dU1$a */
    /* loaded from: classes4.dex */
    public class C10071a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C19580dU1 createFromParcel(Parcel parcel) {
            return new C19580dU1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C19580dU1[] newArray(int i) {
            return new C19580dU1[i];
        }
    }

    public C19580dU1() {
        this(0);
    }

    /* renamed from: a */
    public static String m31827a(Resources resources, CharSequence charSequence) {
        return m31826b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m31826b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static int m31821g(int i) {
        if (i >= 12) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public int m31825c() {
        if (this.f61252c == 1) {
            return R.string.material_hour_24h_suffix;
        }
        return R.string.material_hour_suffix;
    }

    /* renamed from: d */
    public int m31824d() {
        if (this.f61252c == 1) {
            return this.f61253d % 24;
        }
        int i = this.f61253d;
        if (i % 12 == 0) {
            return 12;
        }
        if (this.f61256g == 1) {
            return i - 12;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C22929wr0 m31823e() {
        return this.f61251b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19580dU1)) {
            return false;
        }
        C19580dU1 c19580dU1 = (C19580dU1) obj;
        if (this.f61253d == c19580dU1.f61253d && this.f61254e == c19580dU1.f61254e && this.f61252c == c19580dU1.f61252c && this.f61255f == c19580dU1.f61255f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C22929wr0 m31822f() {
        return this.f61250a;
    }

    /* renamed from: h */
    public void m31820h(int i) {
        if (this.f61252c == 1) {
            this.f61253d = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f61256g != 1) {
            i2 = 0;
        }
        this.f61253d = i3 + i2;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f61252c), Integer.valueOf(this.f61253d), Integer.valueOf(this.f61254e), Integer.valueOf(this.f61255f)});
    }

    /* renamed from: i */
    public void m31819i(int i) {
        this.f61256g = m31821g(i);
        this.f61253d = i;
    }

    /* renamed from: j */
    public void m31818j(int i) {
        this.f61254e = i % 60;
    }

    /* renamed from: k */
    public void m31817k(int i) {
        if (i != this.f61256g) {
            this.f61256g = i;
            int i2 = this.f61253d;
            if (i2 < 12 && i == 1) {
                this.f61253d = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.f61253d = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f61253d);
        parcel.writeInt(this.f61254e);
        parcel.writeInt(this.f61255f);
        parcel.writeInt(this.f61252c);
    }

    public C19580dU1(int i) {
        this(0, 0, 10, i);
    }

    public C19580dU1(int i, int i2, int i3, int i4) {
        this.f61253d = i;
        this.f61254e = i2;
        this.f61255f = i3;
        this.f61252c = i4;
        this.f61256g = m31821g(i);
        this.f61250a = new C22929wr0(59);
        this.f61251b = new C22929wr0(i4 == 1 ? 23 : 12);
    }

    public C19580dU1(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}