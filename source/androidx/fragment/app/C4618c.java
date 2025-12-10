package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes2.dex */
public class C4618c implements Parcelable {
    public static final Parcelable.Creator<C4618c> CREATOR = new C4619a();

    /* renamed from: a */
    public final List f35639a;

    /* renamed from: b */
    public final List f35640b;

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes2.dex */
    public class C4619a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4618c createFromParcel(Parcel parcel) {
            return new C4618c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4618c[] newArray(int i) {
            return new C4618c[i];
        }
    }

    public C4618c(List list, List list2) {
        this.f35639a = list;
        this.f35640b = list2;
    }

    /* renamed from: a */
    public List m54267a(FragmentManager fragmentManager, Map map) {
        HashMap hashMap = new HashMap(this.f35639a.size());
        for (String str : this.f35639a) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                Bundle m54200C = fragmentManager.m54344q0().m54200C(str, null);
                if (m54200C != null) {
                    ClassLoader classLoader = fragmentManager.getHost().m54448b().getClassLoader();
                    Fragment m54227a = ((C4631i) m54200C.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).m54227a(fragmentManager.getFragmentFactory(), classLoader);
                    m54227a.mSavedFragmentState = m54200C;
                    if (m54200C.getBundle("savedInstanceState") == null) {
                        m54227a.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = m54200C.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    m54227a.setArguments(bundle);
                    hashMap.put(m54227a.mWho, m54227a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C4616b c4616b : this.f35640b) {
            arrayList.add(c4616b.m54270c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f35639a);
        parcel.writeTypedList(this.f35640b);
    }

    public C4618c(Parcel parcel) {
        this.f35639a = parcel.createStringArrayList();
        this.f35640b = parcel.createTypedArrayList(C4616b.CREATOR);
    }
}
