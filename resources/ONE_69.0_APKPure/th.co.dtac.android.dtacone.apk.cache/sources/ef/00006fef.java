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
public class C4600c implements Parcelable {
    public static final Parcelable.Creator<C4600c> CREATOR = new C4601a();

    /* renamed from: a */
    public final List f35727a;

    /* renamed from: b */
    public final List f35728b;

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes2.dex */
    public class C4601a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4600c createFromParcel(Parcel parcel) {
            return new C4600c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4600c[] newArray(int i) {
            return new C4600c[i];
        }
    }

    public C4600c(List list, List list2) {
        this.f35727a = list;
        this.f35728b = list2;
    }

    /* renamed from: a */
    public List m54218a(FragmentManager fragmentManager, Map map) {
        HashMap hashMap = new HashMap(this.f35727a.size());
        for (String str : this.f35727a) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                Bundle m54151C = fragmentManager.m54294q0().m54151C(str, null);
                if (m54151C != null) {
                    ClassLoader classLoader = fragmentManager.getHost().m54398b().getClassLoader();
                    Fragment m54178a = ((C4613i) m54151C.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).m54178a(fragmentManager.getFragmentFactory(), classLoader);
                    m54178a.mSavedFragmentState = m54151C;
                    if (m54151C.getBundle("savedInstanceState") == null) {
                        m54178a.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = m54151C.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    m54178a.setArguments(bundle);
                    hashMap.put(m54178a.mWho, m54178a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C4598b c4598b : this.f35728b) {
            arrayList.add(c4598b.m54221c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f35727a);
        parcel.writeTypedList(this.f35728b);
    }

    public C4600c(Parcel parcel) {
        this.f35727a = parcel.createStringArrayList();
        this.f35728b = parcel.createTypedArrayList(C4598b.CREATOR);
    }
}