package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes2.dex */
public final class C4631i implements Parcelable {
    public static final Parcelable.Creator<C4631i> CREATOR = new C4632a();

    /* renamed from: a */
    public final String f35671a;

    /* renamed from: b */
    public final String f35672b;

    /* renamed from: c */
    public final boolean f35673c;

    /* renamed from: d */
    public final int f35674d;

    /* renamed from: e */
    public final int f35675e;

    /* renamed from: f */
    public final String f35676f;

    /* renamed from: g */
    public final boolean f35677g;

    /* renamed from: h */
    public final boolean f35678h;

    /* renamed from: i */
    public final boolean f35679i;

    /* renamed from: j */
    public final boolean f35680j;

    /* renamed from: k */
    public final int f35681k;

    /* renamed from: l */
    public final String f35682l;

    /* renamed from: m */
    public final int f35683m;

    /* renamed from: n */
    public final boolean f35684n;

    /* renamed from: androidx.fragment.app.i$a */
    /* loaded from: classes2.dex */
    public class C4632a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4631i createFromParcel(Parcel parcel) {
            return new C4631i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4631i[] newArray(int i) {
            return new C4631i[i];
        }
    }

    public C4631i(Fragment fragment) {
        this.f35671a = fragment.getClass().getName();
        this.f35672b = fragment.mWho;
        this.f35673c = fragment.mFromLayout;
        this.f35674d = fragment.mFragmentId;
        this.f35675e = fragment.mContainerId;
        this.f35676f = fragment.mTag;
        this.f35677g = fragment.mRetainInstance;
        this.f35678h = fragment.mRemoving;
        this.f35679i = fragment.mDetached;
        this.f35680j = fragment.mHidden;
        this.f35681k = fragment.mMaxState.ordinal();
        this.f35682l = fragment.mTargetWho;
        this.f35683m = fragment.mTargetRequestCode;
        this.f35684n = fragment.mUserVisibleHint;
    }

    /* renamed from: a */
    public Fragment m54227a(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        Fragment instantiate = fragmentFactory.instantiate(classLoader, this.f35671a);
        instantiate.mWho = this.f35672b;
        instantiate.mFromLayout = this.f35673c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.f35674d;
        instantiate.mContainerId = this.f35675e;
        instantiate.mTag = this.f35676f;
        instantiate.mRetainInstance = this.f35677g;
        instantiate.mRemoving = this.f35678h;
        instantiate.mDetached = this.f35679i;
        instantiate.mHidden = this.f35680j;
        instantiate.mMaxState = Lifecycle.State.values()[this.f35681k];
        instantiate.mTargetWho = this.f35682l;
        instantiate.mTargetRequestCode = this.f35683m;
        instantiate.mUserVisibleHint = this.f35684n;
        return instantiate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f35671a);
        sb.append(" (");
        sb.append(this.f35672b);
        sb.append(")}:");
        if (this.f35673c) {
            sb.append(" fromLayout");
        }
        if (this.f35675e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f35675e));
        }
        String str = this.f35676f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f35676f);
        }
        if (this.f35677g) {
            sb.append(" retainInstance");
        }
        if (this.f35678h) {
            sb.append(" removing");
        }
        if (this.f35679i) {
            sb.append(" detached");
        }
        if (this.f35680j) {
            sb.append(" hidden");
        }
        if (this.f35682l != null) {
            sb.append(" targetWho=");
            sb.append(this.f35682l);
            sb.append(" targetRequestCode=");
            sb.append(this.f35683m);
        }
        if (this.f35684n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35671a);
        parcel.writeString(this.f35672b);
        parcel.writeInt(this.f35673c ? 1 : 0);
        parcel.writeInt(this.f35674d);
        parcel.writeInt(this.f35675e);
        parcel.writeString(this.f35676f);
        parcel.writeInt(this.f35677g ? 1 : 0);
        parcel.writeInt(this.f35678h ? 1 : 0);
        parcel.writeInt(this.f35679i ? 1 : 0);
        parcel.writeInt(this.f35680j ? 1 : 0);
        parcel.writeInt(this.f35681k);
        parcel.writeString(this.f35682l);
        parcel.writeInt(this.f35683m);
        parcel.writeInt(this.f35684n ? 1 : 0);
    }

    public C4631i(Parcel parcel) {
        this.f35671a = parcel.readString();
        this.f35672b = parcel.readString();
        this.f35673c = parcel.readInt() != 0;
        this.f35674d = parcel.readInt();
        this.f35675e = parcel.readInt();
        this.f35676f = parcel.readString();
        this.f35677g = parcel.readInt() != 0;
        this.f35678h = parcel.readInt() != 0;
        this.f35679i = parcel.readInt() != 0;
        this.f35680j = parcel.readInt() != 0;
        this.f35681k = parcel.readInt();
        this.f35682l = parcel.readString();
        this.f35683m = parcel.readInt();
        this.f35684n = parcel.readInt() != 0;
    }
}
