package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: pt0 */
/* loaded from: classes4.dex */
public final class C21662pt0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C21662pt0> CREATOR = new C13145a();

    /* renamed from: a */
    public final Calendar f76794a;

    /* renamed from: b */
    public final int f76795b;

    /* renamed from: c */
    public final int f76796c;

    /* renamed from: d */
    public final int f76797d;

    /* renamed from: e */
    public final int f76798e;

    /* renamed from: f */
    public final long f76799f;

    /* renamed from: g */
    public String f76800g;

    /* renamed from: pt0$a */
    /* loaded from: classes4.dex */
    public class C13145a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C21662pt0 createFromParcel(Parcel parcel) {
            return C21662pt0.m23566b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C21662pt0[] newArray(int i) {
            return new C21662pt0[i];
        }
    }

    public C21662pt0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m1144f = AbstractC22545v02.m1144f(calendar);
        this.f76794a = m1144f;
        this.f76795b = m1144f.get(2);
        this.f76796c = m1144f.get(1);
        this.f76797d = m1144f.getMaximum(7);
        this.f76798e = m1144f.getActualMaximum(5);
        this.f76799f = m1144f.getTimeInMillis();
    }

    /* renamed from: b */
    public static C21662pt0 m23566b(int i, int i2) {
        Calendar m1133q = AbstractC22545v02.m1133q();
        m1133q.set(1, i);
        m1133q.set(2, i2);
        return new C21662pt0(m1133q);
    }

    /* renamed from: c */
    public static C21662pt0 m23565c(long j) {
        Calendar m1133q = AbstractC22545v02.m1133q();
        m1133q.setTimeInMillis(j);
        return new C21662pt0(m1133q);
    }

    /* renamed from: d */
    public static C21662pt0 m23564d() {
        return new C21662pt0(AbstractC22545v02.m1135o());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C21662pt0 c21662pt0) {
        return this.f76794a.compareTo(c21662pt0.f76794a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m23563e(int i) {
        int i2 = this.f76794a.get(7);
        if (i <= 0) {
            i = this.f76794a.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + this.f76797d;
        }
        return i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21662pt0)) {
            return false;
        }
        C21662pt0 c21662pt0 = (C21662pt0) obj;
        if (this.f76795b == c21662pt0.f76795b && this.f76796c == c21662pt0.f76796c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long m23562f(int i) {
        Calendar m1144f = AbstractC22545v02.m1144f(this.f76794a);
        m1144f.set(5, i);
        return m1144f.getTimeInMillis();
    }

    /* renamed from: g */
    public int m23561g(long j) {
        Calendar m1144f = AbstractC22545v02.m1144f(this.f76794a);
        m1144f.setTimeInMillis(j);
        return m1144f.get(5);
    }

    /* renamed from: h */
    public String m23560h() {
        if (this.f76800g == null) {
            this.f76800g = AbstractC1521VD.m65891l(this.f76794a.getTimeInMillis());
        }
        return this.f76800g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f76795b), Integer.valueOf(this.f76796c)});
    }

    /* renamed from: i */
    public long m23559i() {
        return this.f76794a.getTimeInMillis();
    }

    /* renamed from: j */
    public C21662pt0 m23558j(int i) {
        Calendar m1144f = AbstractC22545v02.m1144f(this.f76794a);
        m1144f.add(2, i);
        return new C21662pt0(m1144f);
    }

    /* renamed from: k */
    public int m23557k(C21662pt0 c21662pt0) {
        if (this.f76794a instanceof GregorianCalendar) {
            return ((c21662pt0.f76796c - this.f76796c) * 12) + (c21662pt0.f76795b - this.f76795b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f76796c);
        parcel.writeInt(this.f76795b);
    }
}
