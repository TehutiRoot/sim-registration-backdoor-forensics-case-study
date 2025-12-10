package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {
    @NonNull
    public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);

    /* renamed from: a */
    public final boolean f48543a = false;

    /* renamed from: b */
    public final boolean f48544b = false;

    /* renamed from: c */
    public final String f48545c = null;

    /* renamed from: d */
    public final boolean f48546d = false;

    /* renamed from: g */
    public final boolean f48549g = false;

    /* renamed from: e */
    public final String f48547e = null;

    /* renamed from: f */
    public final String f48548f = null;

    /* renamed from: h */
    public final Long f48550h = null;

    /* renamed from: i */
    public final Long f48551i = null;

    public /* synthetic */ SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2, zaf zafVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        boolean z = ((SignInOptions) obj).f48543a;
        if (Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
