package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes2.dex */
public final class C4627g implements Parcelable {
    public static final Parcelable.Creator<C4627g> CREATOR = new C4628a();

    /* renamed from: a */
    public ArrayList f35655a;

    /* renamed from: b */
    public ArrayList f35656b;

    /* renamed from: c */
    public C4616b[] f35657c;

    /* renamed from: d */
    public int f35658d;

    /* renamed from: e */
    public String f35659e;

    /* renamed from: f */
    public ArrayList f35660f;

    /* renamed from: g */
    public ArrayList f35661g;

    /* renamed from: h */
    public ArrayList f35662h;

    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes2.dex */
    public class C4628a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4627g createFromParcel(Parcel parcel) {
            return new C4627g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4627g[] newArray(int i) {
            return new C4627g[i];
        }
    }

    public C4627g() {
        this.f35659e = null;
        this.f35660f = new ArrayList();
        this.f35661g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f35655a);
        parcel.writeStringList(this.f35656b);
        parcel.writeTypedArray(this.f35657c, i);
        parcel.writeInt(this.f35658d);
        parcel.writeString(this.f35659e);
        parcel.writeStringList(this.f35660f);
        parcel.writeTypedList(this.f35661g);
        parcel.writeTypedList(this.f35662h);
    }

    public C4627g(Parcel parcel) {
        this.f35659e = null;
        this.f35660f = new ArrayList();
        this.f35661g = new ArrayList();
        this.f35655a = parcel.createStringArrayList();
        this.f35656b = parcel.createStringArrayList();
        this.f35657c = (C4616b[]) parcel.createTypedArray(C4616b.CREATOR);
        this.f35658d = parcel.readInt();
        this.f35659e = parcel.readString();
        this.f35660f = parcel.createStringArrayList();
        this.f35661g = parcel.createTypedArrayList(C4618c.CREATOR);
        this.f35662h = parcel.createTypedArrayList(FragmentManager.C4599m.CREATOR);
    }
}
