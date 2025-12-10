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
public final class C4598b implements Parcelable {
    public static final Parcelable.Creator<C4598b> CREATOR = new C4599a();

    /* renamed from: a */
    public final int[] f35713a;

    /* renamed from: b */
    public final ArrayList f35714b;

    /* renamed from: c */
    public final int[] f35715c;

    /* renamed from: d */
    public final int[] f35716d;

    /* renamed from: e */
    public final int f35717e;

    /* renamed from: f */
    public final String f35718f;

    /* renamed from: g */
    public final int f35719g;

    /* renamed from: h */
    public final int f35720h;

    /* renamed from: i */
    public final CharSequence f35721i;

    /* renamed from: j */
    public final int f35722j;

    /* renamed from: k */
    public final CharSequence f35723k;

    /* renamed from: l */
    public final ArrayList f35724l;

    /* renamed from: m */
    public final ArrayList f35725m;

    /* renamed from: n */
    public final boolean f35726n;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes2.dex */
    public class C4599a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4598b createFromParcel(Parcel parcel) {
            return new C4598b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4598b[] newArray(int i) {
            return new C4598b[i];
        }
    }

    public C4598b(C4597a c4597a) {
        int size = c4597a.f35651c.size();
        this.f35713a = new int[size * 6];
        if (c4597a.f35657i) {
            this.f35714b = new ArrayList(size);
            this.f35715c = new int[size];
            this.f35716d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.C4592a c4592a = (FragmentTransaction.C4592a) c4597a.f35651c.get(i2);
                int i3 = i + 1;
                this.f35713a[i] = c4592a.f35668a;
                ArrayList arrayList = this.f35714b;
                Fragment fragment = c4592a.f35669b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f35713a;
                iArr[i3] = c4592a.f35670c ? 1 : 0;
                iArr[i + 2] = c4592a.f35671d;
                iArr[i + 3] = c4592a.f35672e;
                int i4 = i + 5;
                iArr[i + 4] = c4592a.f35673f;
                i += 6;
                iArr[i4] = c4592a.f35674g;
                this.f35715c[i2] = c4592a.f35675h.ordinal();
                this.f35716d[i2] = c4592a.f35676i.ordinal();
            }
            this.f35717e = c4597a.f35656h;
            this.f35718f = c4597a.f35659k;
            this.f35719g = c4597a.f35711v;
            this.f35720h = c4597a.f35660l;
            this.f35721i = c4597a.f35661m;
            this.f35722j = c4597a.f35662n;
            this.f35723k = c4597a.f35663o;
            this.f35724l = c4597a.f35664p;
            this.f35725m = c4597a.f35665q;
            this.f35726n = c4597a.f35666r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final void m54223a(C4597a c4597a) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f35713a.length) {
                FragmentTransaction.C4592a c4592a = new FragmentTransaction.C4592a();
                int i3 = i + 1;
                c4592a.f35668a = this.f35713a[i];
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Instantiate ");
                    sb.append(c4597a);
                    sb.append(" op #");
                    sb.append(i2);
                    sb.append(" base fragment #");
                    sb.append(this.f35713a[i3]);
                }
                c4592a.f35675h = Lifecycle.State.values()[this.f35715c[i2]];
                c4592a.f35676i = Lifecycle.State.values()[this.f35716d[i2]];
                int[] iArr = this.f35713a;
                int i4 = i + 2;
                if (iArr[i3] == 0) {
                    z = false;
                }
                c4592a.f35670c = z;
                int i5 = iArr[i4];
                c4592a.f35671d = i5;
                int i6 = iArr[i + 3];
                c4592a.f35672e = i6;
                int i7 = i + 5;
                int i8 = iArr[i + 4];
                c4592a.f35673f = i8;
                i += 6;
                int i9 = iArr[i7];
                c4592a.f35674g = i9;
                c4597a.f35652d = i5;
                c4597a.f35653e = i6;
                c4597a.f35654f = i8;
                c4597a.f35655g = i9;
                c4597a.m54255c(c4592a);
                i2++;
            } else {
                c4597a.f35656h = this.f35717e;
                c4597a.f35659k = this.f35718f;
                c4597a.f35657i = true;
                c4597a.f35660l = this.f35720h;
                c4597a.f35661m = this.f35721i;
                c4597a.f35662n = this.f35722j;
                c4597a.f35663o = this.f35723k;
                c4597a.f35664p = this.f35724l;
                c4597a.f35665q = this.f35725m;
                c4597a.f35666r = this.f35726n;
                return;
            }
        }
    }

    /* renamed from: b */
    public C4597a m54222b(FragmentManager fragmentManager) {
        C4597a c4597a = new C4597a(fragmentManager);
        m54223a(c4597a);
        c4597a.f35711v = this.f35719g;
        for (int i = 0; i < this.f35714b.size(); i++) {
            String str = (String) this.f35714b.get(i);
            if (str != null) {
                ((FragmentTransaction.C4592a) c4597a.f35651c.get(i)).f35669b = fragmentManager.m54333d0(str);
            }
        }
        c4597a.m54233f(1);
        return c4597a;
    }

    /* renamed from: c */
    public C4597a m54221c(FragmentManager fragmentManager, Map map) {
        C4597a c4597a = new C4597a(fragmentManager);
        m54223a(c4597a);
        for (int i = 0; i < this.f35714b.size(); i++) {
            String str = (String) this.f35714b.get(i);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment != null) {
                    ((FragmentTransaction.C4592a) c4597a.f35651c.get(i)).f35669b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f35718f + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return c4597a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f35713a);
        parcel.writeStringList(this.f35714b);
        parcel.writeIntArray(this.f35715c);
        parcel.writeIntArray(this.f35716d);
        parcel.writeInt(this.f35717e);
        parcel.writeString(this.f35718f);
        parcel.writeInt(this.f35719g);
        parcel.writeInt(this.f35720h);
        TextUtils.writeToParcel(this.f35721i, parcel, 0);
        parcel.writeInt(this.f35722j);
        TextUtils.writeToParcel(this.f35723k, parcel, 0);
        parcel.writeStringList(this.f35724l);
        parcel.writeStringList(this.f35725m);
        parcel.writeInt(this.f35726n ? 1 : 0);
    }

    public C4598b(Parcel parcel) {
        this.f35713a = parcel.createIntArray();
        this.f35714b = parcel.createStringArrayList();
        this.f35715c = parcel.createIntArray();
        this.f35716d = parcel.createIntArray();
        this.f35717e = parcel.readInt();
        this.f35718f = parcel.readString();
        this.f35719g = parcel.readInt();
        this.f35720h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f35721i = (CharSequence) creator.createFromParcel(parcel);
        this.f35722j = parcel.readInt();
        this.f35723k = (CharSequence) creator.createFromParcel(parcel);
        this.f35724l = parcel.createStringArrayList();
        this.f35725m = parcel.createStringArrayList();
        this.f35726n = parcel.readInt() != 0;
    }
}