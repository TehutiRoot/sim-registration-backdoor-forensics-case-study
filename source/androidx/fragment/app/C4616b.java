package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes2.dex */
public final class C4616b implements Parcelable {
    public static final Parcelable.Creator<C4616b> CREATOR = new C4617a();

    /* renamed from: a */
    public final int[] f35625a;

    /* renamed from: b */
    public final ArrayList f35626b;

    /* renamed from: c */
    public final int[] f35627c;

    /* renamed from: d */
    public final int[] f35628d;

    /* renamed from: e */
    public final int f35629e;

    /* renamed from: f */
    public final String f35630f;

    /* renamed from: g */
    public final int f35631g;

    /* renamed from: h */
    public final int f35632h;

    /* renamed from: i */
    public final CharSequence f35633i;

    /* renamed from: j */
    public final int f35634j;

    /* renamed from: k */
    public final CharSequence f35635k;

    /* renamed from: l */
    public final ArrayList f35636l;

    /* renamed from: m */
    public final ArrayList f35637m;

    /* renamed from: n */
    public final boolean f35638n;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes2.dex */
    public class C4617a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4616b createFromParcel(Parcel parcel) {
            return new C4616b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4616b[] newArray(int i) {
            return new C4616b[i];
        }
    }

    public C4616b(C4615a c4615a) {
        int size = c4615a.f35563c.size();
        this.f35625a = new int[size * 6];
        if (c4615a.f35569i) {
            this.f35626b = new ArrayList(size);
            this.f35627c = new int[size];
            this.f35628d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.C4610a c4610a = (FragmentTransaction.C4610a) c4615a.f35563c.get(i2);
                int i3 = i + 1;
                this.f35625a[i] = c4610a.f35580a;
                ArrayList arrayList = this.f35626b;
                Fragment fragment = c4610a.f35581b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f35625a;
                iArr[i3] = c4610a.f35582c ? 1 : 0;
                iArr[i + 2] = c4610a.f35583d;
                iArr[i + 3] = c4610a.f35584e;
                int i4 = i + 5;
                iArr[i + 4] = c4610a.f35585f;
                i += 6;
                iArr[i4] = c4610a.f35586g;
                this.f35627c[i2] = c4610a.f35587h.ordinal();
                this.f35628d[i2] = c4610a.f35588i.ordinal();
            }
            this.f35629e = c4615a.f35568h;
            this.f35630f = c4615a.f35571k;
            this.f35631g = c4615a.f35623v;
            this.f35632h = c4615a.f35572l;
            this.f35633i = c4615a.f35573m;
            this.f35634j = c4615a.f35574n;
            this.f35635k = c4615a.f35575o;
            this.f35636l = c4615a.f35576p;
            this.f35637m = c4615a.f35577q;
            this.f35638n = c4615a.f35578r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final void m54272a(C4615a c4615a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f35625a.length) {
                FragmentTransaction.C4610a c4610a = new FragmentTransaction.C4610a();
                int i3 = i + 1;
                c4610a.f35580a = this.f35625a[i];
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Instantiate ");
                    sb.append(c4615a);
                    sb.append(" op #");
                    sb.append(i2);
                    sb.append(" base fragment #");
                    sb.append(this.f35625a[i3]);
                }
                c4610a.f35587h = Lifecycle.State.values()[this.f35627c[i2]];
                c4610a.f35588i = Lifecycle.State.values()[this.f35628d[i2]];
                int[] iArr = this.f35625a;
                int i4 = i + 2;
                if (iArr[i3] == 0) {
                    z = false;
                }
                c4610a.f35582c = z;
                int i5 = iArr[i4];
                c4610a.f35583d = i5;
                int i6 = iArr[i + 3];
                c4610a.f35584e = i6;
                int i7 = i + 5;
                int i8 = iArr[i + 4];
                c4610a.f35585f = i8;
                i += 6;
                int i9 = iArr[i7];
                c4610a.f35586g = i9;
                c4615a.f35564d = i5;
                c4615a.f35565e = i6;
                c4615a.f35566f = i8;
                c4615a.f35567g = i9;
                c4615a.m54304c(c4610a);
                i2++;
            } else {
                c4615a.f35568h = this.f35629e;
                c4615a.f35571k = this.f35630f;
                c4615a.f35569i = true;
                c4615a.f35572l = this.f35632h;
                c4615a.f35573m = this.f35633i;
                c4615a.f35574n = this.f35634j;
                c4615a.f35575o = this.f35635k;
                c4615a.f35576p = this.f35636l;
                c4615a.f35577q = this.f35637m;
                c4615a.f35578r = this.f35638n;
                return;
            }
        }
    }

    /* renamed from: b */
    public C4615a m54271b(FragmentManager fragmentManager) {
        C4615a c4615a = new C4615a(fragmentManager);
        m54272a(c4615a);
        c4615a.f35623v = this.f35631g;
        for (int i = 0; i < this.f35626b.size(); i++) {
            String str = (String) this.f35626b.get(i);
            if (str != null) {
                ((FragmentTransaction.C4610a) c4615a.f35563c.get(i)).f35581b = fragmentManager.m54383d0(str);
            }
        }
        c4615a.m54282f(1);
        return c4615a;
    }

    /* renamed from: c */
    public C4615a m54270c(FragmentManager fragmentManager, Map map) {
        C4615a c4615a = new C4615a(fragmentManager);
        m54272a(c4615a);
        for (int i = 0; i < this.f35626b.size(); i++) {
            String str = (String) this.f35626b.get(i);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment != null) {
                    ((FragmentTransaction.C4610a) c4615a.f35563c.get(i)).f35581b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f35630f + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return c4615a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f35625a);
        parcel.writeStringList(this.f35626b);
        parcel.writeIntArray(this.f35627c);
        parcel.writeIntArray(this.f35628d);
        parcel.writeInt(this.f35629e);
        parcel.writeString(this.f35630f);
        parcel.writeInt(this.f35631g);
        parcel.writeInt(this.f35632h);
        TextUtils.writeToParcel(this.f35633i, parcel, 0);
        parcel.writeInt(this.f35634j);
        TextUtils.writeToParcel(this.f35635k, parcel, 0);
        parcel.writeStringList(this.f35636l);
        parcel.writeStringList(this.f35637m);
        parcel.writeInt(this.f35638n ? 1 : 0);
    }

    public C4616b(Parcel parcel) {
        this.f35625a = parcel.createIntArray();
        this.f35626b = parcel.createStringArrayList();
        this.f35627c = parcel.createIntArray();
        this.f35628d = parcel.createIntArray();
        this.f35629e = parcel.readInt();
        this.f35630f = parcel.readString();
        this.f35631g = parcel.readInt();
        this.f35632h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f35633i = (CharSequence) creator.createFromParcel(parcel);
        this.f35634j = parcel.readInt();
        this.f35635k = (CharSequence) creator.createFromParcel(parcel);
        this.f35636l = parcel.createStringArrayList();
        this.f35637m = parcel.createStringArrayList();
        this.f35638n = parcel.readInt() != 0;
    }
}
