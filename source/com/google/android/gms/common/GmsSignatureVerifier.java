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
    public static final C17967La2 f44657a;

    /* renamed from: b */
    public static final C17967La2 f44658b;

    /* renamed from: c */
    public static final HashMap f44659c;

    static {
        HL2 hl2 = new HL2();
        hl2.m68101d("com.google.android.gms");
        hl2.m68104a(204200000L);
        LD2 ld2 = IH2.f2473d;
        hl2.m68102c(zzag.zzn(ld2.mo26574b(), IH2.f2471b.mo26574b()));
        LD2 ld22 = IH2.f2472c;
        hl2.m68103b(zzag.zzn(ld22.mo26574b(), IH2.f2470a.mo26574b()));
        f44657a = hl2.m68100e();
        HL2 hl22 = new HL2();
        hl22.m68101d("com.android.vending");
        hl22.m68104a(82240000L);
        hl22.m68102c(zzag.zzm(ld2.mo26574b()));
        hl22.m68103b(zzag.zzm(ld22.mo26574b()));
        f44658b = hl22.m68100e();
        f44659c = new HashMap();
    }
}
