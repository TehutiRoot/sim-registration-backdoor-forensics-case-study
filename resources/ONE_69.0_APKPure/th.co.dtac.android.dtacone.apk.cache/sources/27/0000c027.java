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
    public static final Object f59164b = new Object();

    /* renamed from: a */
    public RxPermissionsFragment f59165a;

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$a */
    /* loaded from: classes5.dex */
    public class C9829a implements ObservableTransformer {

        /* renamed from: a */
        public final /* synthetic */ String[] f59166a;

        /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$a$a */
        /* loaded from: classes5.dex */
        public class C9830a implements Function {
            public C9830a() {
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

        public C9829a(String[] strArr) {
            this.f59166a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return RxPermissions.this.m33162h(observable, this.f59166a).buffer(this.f59166a.length).flatMap(new C9830a());
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$b */
    /* loaded from: classes5.dex */
    public class C9831b implements ObservableTransformer {

        /* renamed from: a */
        public final /* synthetic */ String[] f59169a;

        public C9831b(String[] strArr) {
            this.f59169a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return RxPermissions.this.m33162h(observable, this.f59169a);
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$c */
    /* loaded from: classes5.dex */
    public class C9832c implements ObservableTransformer {

        /* renamed from: a */
        public final /* synthetic */ String[] f59171a;

        /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$c$a */
        /* loaded from: classes5.dex */
        public class C9833a implements Function {
            public C9833a() {
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

        public C9832c(String[] strArr) {
            this.f59171a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return RxPermissions.this.m33162h(observable, this.f59171a).buffer(this.f59171a.length).flatMap(new C9833a());
        }
    }

    /* renamed from: com.tbruyelle.rxpermissions2.RxPermissions$d */
    /* loaded from: classes5.dex */
    public class C9834d implements Function {

        /* renamed from: a */
        public final /* synthetic */ String[] f59174a;

        public C9834d(String[] strArr) {
            this.f59174a = strArr;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Observable apply(Object obj) {
            return RxPermissions.this.m33161i(this.f59174a);
        }
    }

    public RxPermissions(@NonNull Activity activity) {
        this.f59165a = m33166d(activity);
    }

    /* renamed from: c */
    public final RxPermissionsFragment m33167c(Activity activity) {
        return (RxPermissionsFragment) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    /* renamed from: d */
    public final RxPermissionsFragment m33166d(Activity activity) {
        RxPermissionsFragment m33167c = m33167c(activity);
        if (m33167c == null) {
            RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
            FragmentManager fragmentManager = activity.getFragmentManager();
            fragmentManager.beginTransaction().add(rxPermissionsFragment, "RxPermissions").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return rxPermissionsFragment;
        }
        return m33167c;
    }

    /* renamed from: e */
    public boolean m33165e() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public <T> ObservableTransformer<T, Boolean> ensure(String... strArr) {
        return new C9829a(strArr);
    }

    public <T> ObservableTransformer<T, Permission> ensureEach(String... strArr) {
        return new C9831b(strArr);
    }

    public <T> ObservableTransformer<T, Permission> ensureEachCombined(String... strArr) {
        return new C9832c(strArr);
    }

    /* renamed from: f */
    public final Observable m33164f(Observable observable, Observable observable2) {
        if (observable == null) {
            return Observable.just(f59164b);
        }
        return Observable.merge(observable, observable2);
    }

    /* renamed from: g */
    public final Observable m33163g(String... strArr) {
        for (String str : strArr) {
            if (!this.f59165a.containsByPermission(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(f59164b);
    }

    /* renamed from: h */
    public final Observable m33162h(Observable observable, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m33164f(observable, m33163g(strArr)).flatMap(new C9834d(strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* renamed from: i */
    public final Observable m33161i(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f59165a.m33153c("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(Observable.just(new Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(Observable.just(new Permission(str, false, false)));
            } else {
                PublishSubject<Permission> subjectByPermission = this.f59165a.getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = PublishSubject.create();
                    this.f59165a.setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            m33160j((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    public boolean isGranted(String str) {
        if (m33165e() && !this.f59165a.m33155a(str)) {
            return false;
        }
        return true;
    }

    public boolean isRevoked(String str) {
        if (m33165e() && this.f59165a.m33154b(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m33160j(String[] strArr) {
        RxPermissionsFragment rxPermissionsFragment = this.f59165a;
        rxPermissionsFragment.m33153c("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f59165a.m33151e(strArr);
    }

    /* renamed from: k */
    public final boolean m33159k(Activity activity, String... strArr) {
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
        return Observable.just(f59164b).compose(ensure(strArr));
    }

    public Observable<Permission> requestEach(String... strArr) {
        return Observable.just(f59164b).compose(ensureEach(strArr));
    }

    public Observable<Permission> requestEachCombined(String... strArr) {
        return Observable.just(f59164b).compose(ensureEachCombined(strArr));
    }

    public void setLogging(boolean z) {
        this.f59165a.setLogging(z);
    }

    public Observable<Boolean> shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        if (!m33165e()) {
            return Observable.just(Boolean.FALSE);
        }
        return Observable.just(Boolean.valueOf(m33159k(activity, strArr)));
    }
}