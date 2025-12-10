package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes2.dex */
public final class C4609g implements Parcelable {
    public static final Parcelable.Creator<C4609g> CREATOR = new C4610a();

    /* renamed from: a */
    public ArrayList f35743a;

    /* renamed from: b */
    public ArrayList f35744b;

    /* renamed from: c */
    public C4598b[] f35745c;

    /* renamed from: d */
    public int f35746d;

    /* renamed from: e */
    public String f35747e;

    /* renamed from: f */
    public ArrayList f35748f;

    /* renamed from: g */
    public ArrayList f35749g;

    /* renamed from: h */
    public ArrayList f35750h;

    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes2.dex */
    public class C4610a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4609g createFromParcel(Parcel parcel) {
            return new C4609g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4609g[] newArray(int i) {
            return new C4609g[i];
        }
    }

    public C4609g() {
        this.f35747e = null;
        this.f35748f = new ArrayList();
        this.f35749g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f35743a);
        parcel.writeStringList(this.f35744b);
        parcel.writeTypedArray(this.f35745c, i);
        parcel.writeInt(this.f35746d);
        parcel.writeString(this.f35747e);
        parcel.writeStringList(this.f35748f);
        parcel.writeTypedList(this.f35749g);
        parcel.writeTypedList(this.f35750h);
    }

    public C4609g(Parcel parcel) {
        this.f35747e = null;
        this.f35748f = new ArrayList();
        this.f35749g = new ArrayList();
        this.f35743a = parcel.createStringArrayList();
        this.f35744b = parcel.createStringArrayList();
        this.f35745c = (C4598b[]) parcel.createTypedArray(C4598b.CREATOR);
        this.f35746d = parcel.readInt();
        this.f35747e = parcel.readString();
        this.f35748f = parcel.createStringArrayList();
        this.f35749g = parcel.createTypedArrayList(C4600c.CREATOR);
        this.f35750h = parcel.createTypedArrayList(FragmentManager.C4581m.CREATOR);
    }
}