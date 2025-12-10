package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* loaded from: classes3.dex */
public final class zad {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f48566a;
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
        U72 u72 = new U72();
        zac = u72;
        C21537p82 c21537p82 = new C21537p82();
        f48566a = c21537p82;
        zae = new Scope(Scopes.PROFILE);
        zaf = new Scope("email");
        zag = new Api("SignIn.API", u72, clientKey);
        zah = new Api("SignIn.INTERNAL_API", c21537p82, clientKey2);
    }
}
