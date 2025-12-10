package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* loaded from: classes3.dex */
public final class zad {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f48578a;
    public static final Api.ClientKey zaa;
    @ShowFirstParty
    public static final Api.ClientKey zab;
    public static final Api.AbstractClientBuilder zac;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api zag;
    public static final Api zah;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zaa = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        zab = clientKey2;
        R82 r82 = new R82();
        zac = r82;
        C21082m92 c21082m92 = new C21082m92();
        f48578a = c21082m92;
        zae = new Scope(Scopes.PROFILE);
        zaf = new Scope("email");
        zag = new Api("SignIn.API", r82, clientKey);
        zah = new Api("SignIn.INTERNAL_API", c21082m92, clientKey2);
    }
}