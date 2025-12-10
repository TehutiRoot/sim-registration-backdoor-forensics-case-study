package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes3.dex */
public class GmsSignatureVerifier {

    /* renamed from: a */
    public static final C17809Ib2 f44669a;

    /* renamed from: b */
    public static final C17809Ib2 f44670b;

    /* renamed from: c */
    public static final HashMap f44671c;

    static {
        EM2 em2 = new EM2();
        em2.m68660d("com.google.android.gms");
        em2.m68663a(204200000L);
        IE2 ie2 = FI2.f1650d;
        em2.m68661c(zzag.zzn(ie2.mo31272b(), FI2.f1648b.mo31272b()));
        IE2 ie22 = FI2.f1649c;
        em2.m68662b(zzag.zzn(ie22.mo31272b(), FI2.f1647a.mo31272b()));
        f44669a = em2.m68659e();
        EM2 em22 = new EM2();
        em22.m68660d("com.android.vending");
        em22.m68663a(82240000L);
        em22.m68661c(zzag.zzm(ie2.mo31272b()));
        em22.m68662b(zzag.zzm(ie22.mo31272b()));
        f44670b = em22.m68659e();
        f44671c = new HashMap();
    }
}