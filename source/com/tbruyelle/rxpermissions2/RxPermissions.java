package com.tbruyelle.rxpermissions2;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class RxPermissions {

    /* renamed from: b */
    public static final Object f59152b = new Object();

    /* renamed from: a */
    public RxPermissionsFragment f59153a;

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$a */
    /* loaded from: classes5.dex */
    public class C9840a implements ObservableTransformer {

        /* renamed from: a */
        public final /* synthetic */ String[] f59154a;

        /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$a$a */
        /* loaded from: classes5.dex */
        public class C9841a implements Function {
            public C9841a() {
            }

            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public ObservableSource apply(List list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((Permission) it.next()).granted) {
                        return Observable.just(Boolean.FALSE);
                    }
                }
                return Observable.just(Boolean.TRUE);
            }
        }

        public C9840a(String[] strArr) {
            this.f59154a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return RxPermissions.this.m33170h(observable, this.f59154a).buffer(this.f59154a.length).flatMap(new C9841a());
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$b */
    /* loaded from: classes5.dex */
    public class C9842b implements ObservableTransformer {

        /* renamed from: a */
        public final /* synthetic */ String[] f59157a;

        public C9842b(String[] strArr) {
            this.f59157a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return RxPermissions.this.m33170h(observable, this.f59157a);
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$c */
    /* loaded from: classes5.dex */
    public class C9843c implements ObservableTransformer {

        /* renamed from: a */
        public final /* synthetic */ String[] f59159a;

        /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$c$a */
        /* loaded from: classes5.dex */
        public class C9844a implements Function {
            public C9844a() {
            }

            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public ObservableSource apply(List list) {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                return Observable.just(new Permission(list));
            }
        }

        public C9843c(String[] strArr) {
            this.f59159a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return RxPermissions.this.m33170h(observable, this.f59159a).buffer(this.f59159a.length).flatMap(new C9844a());
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$d */
    /* loaded from: classes5.dex */
    public class C9845d implements Function {

        /* renamed from: a */
        public final /* synthetic */ String[] f59162a;

        public C9845d(String[] strArr) {
            this.f59162a = strArr;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Observable apply(Object obj) {
            return RxPermissions.this.m33169i(this.f59162a);
        }
    }

    public RxPermissions(@NonNull Activity activity) {
        this.f59153a = m33174d(activity);
    }

    /* renamed from: c */
    public final RxPermissionsFragment m33175c(Activity activity) {
        return (RxPermissionsFragment) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    /* renamed from: d */
    public final RxPermissionsFragment m33174d(Activity activity) {
        RxPermissionsFragment m33175c = m33175c(activity);
        if (m33175c == null) {
            RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
            FragmentManager fragmentManager = activity.getFragmentManager();
            fragmentManager.beginTransaction().add(rxPermissionsFragment, "RxPermissions").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return rxPermissionsFragment;
        }
        return m33175c;
    }

    /* renamed from: e */
    public boolean m33173e() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public <T> ObservableTransformer<T, Boolean> ensure(String... strArr) {
        return new C9840a(strArr);
    }

    public <T> ObservableTransformer<T, Permission> ensureEach(String... strArr) {
        return new C9842b(strArr);
    }

    public <T> ObservableTransformer<T, Permission> ensureEachCombined(String... strArr) {
        return new C9843c(strArr);
    }

    /* renamed from: f */
    public final Observable m33172f(Observable observable, Observable observable2) {
        if (observable == null) {
            return Observable.just(f59152b);
        }
        return Observable.merge(observable, observable2);
    }

    /* renamed from: g */
    public final Observable m33171g(String... strArr) {
        for (String str : strArr) {
            if (!this.f59153a.containsByPermission(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(f59152b);
    }

    /* renamed from: h */
    public final Observable m33170h(Observable observable, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m33172f(observable, m33171g(strArr)).flatMap(new C9845d(strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* renamed from: i */
    public final Observable m33169i(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f59153a.m33161c("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(Observable.just(new Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(Observable.just(new Permission(str, false, false)));
            } else {
                PublishSubject<Permission> subjectByPermission = this.f59153a.getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = PublishSubject.create();
                    this.f59153a.setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            m33168j((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    public boolean isGranted(String str) {
        if (m33173e() && !this.f59153a.m33163a(str)) {
            return false;
        }
        return true;
    }

    public boolean isRevoked(String str) {
        if (m33173e() && this.f59153a.m33162b(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m33168j(String[] strArr) {
        RxPermissionsFragment rxPermissionsFragment = this.f59153a;
        rxPermissionsFragment.m33161c("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f59153a.m33159e(strArr);
    }

    /* renamed from: k */
    public final boolean m33167k(Activity activity, String... strArr) {
        boolean shouldShowRequestPermissionRationale;
        for (String str : strArr) {
            if (!isGranted(str)) {
                shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                if (!shouldShowRequestPermissionRationale) {
                    return false;
                }
            }
        }
        return true;
    }

    public Observable<Boolean> request(String... strArr) {
        return Observable.just(f59152b).compose(ensure(strArr));
    }

    public Observable<Permission> requestEach(String... strArr) {
        return Observable.just(f59152b).compose(ensureEach(strArr));
    }

    public Observable<Permission> requestEachCombined(String... strArr) {
        return Observable.just(f59152b).compose(ensureEachCombined(strArr));
    }

    public void setLogging(boolean z) {
        this.f59153a.setLogging(z);
    }

    public Observable<Boolean> shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        if (!m33173e()) {
            return Observable.just(Boolean.FALSE);
        }
        return Observable.just(Boolean.valueOf(m33167k(activity, strArr)));
    }
}
