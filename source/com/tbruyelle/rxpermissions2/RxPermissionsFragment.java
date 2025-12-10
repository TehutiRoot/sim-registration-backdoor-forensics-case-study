package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class RxPermissionsFragment extends Fragment {

    /* renamed from: a */
    public Map f59164a = new HashMap();

    /* renamed from: b */
    public boolean f59165b;

    /* renamed from: a */
    public boolean m33163a(String str) {
        int checkSelfPermission;
        checkSelfPermission = getActivity().checkSelfPermission(str);
        if (checkSelfPermission == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m33162b(String str) {
        boolean isPermissionRevokedByPolicy;
        isPermissionRevokedByPolicy = getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        return isPermissionRevokedByPolicy;
    }

    /* renamed from: c */
    public void m33161c(String str) {
    }

    public boolean containsByPermission(@NonNull String str) {
        return this.f59164a.containsKey(str);
    }

    /* renamed from: d */
    public void m33160d(String[] strArr, int[] iArr, boolean[] zArr) {
        boolean z;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            m33161c("onRequestPermissionsResult  " + strArr[i]);
            PublishSubject publishSubject = (PublishSubject) this.f59164a.get(strArr[i]);
            if (publishSubject == null) {
                return;
            }
            this.f59164a.remove(strArr[i]);
            if (iArr[i] == 0) {
                z = true;
            } else {
                z = false;
            }
            publishSubject.onNext(new Permission(strArr[i], z, zArr[i]));
            publishSubject.onComplete();
        }
    }

    /* renamed from: e */
    public void m33159e(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public PublishSubject<Permission> getSubjectByPermission(@NonNull String str) {
        return (PublishSubject) this.f59164a.get(str);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        boolean shouldShowRequestPermissionRationale;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            shouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale(strArr[i2]);
            zArr[i2] = shouldShowRequestPermissionRationale;
        }
        m33160d(strArr, iArr, zArr);
    }

    public void setLogging(boolean z) {
        this.f59165b = z;
    }

    public PublishSubject<Permission> setSubjectForPermission(@NonNull String str, @NonNull PublishSubject<Permission> publishSubject) {
        return (PublishSubject) this.f59164a.put(str, publishSubject);
    }
}
