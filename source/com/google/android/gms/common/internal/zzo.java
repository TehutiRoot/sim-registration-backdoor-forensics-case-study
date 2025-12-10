package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzo {

    /* renamed from: f */
    public static final Uri f45189f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f45190a;

    /* renamed from: b */
    public final String f45191b;

    /* renamed from: c */
    public final ComponentName f45192c;

    /* renamed from: d */
    public final int f45193d;

    /* renamed from: e */
    public final boolean f45194e;

    public zzo(ComponentName componentName, int i) {
        this.f45190a = null;
        this.f45191b = null;
        Preconditions.checkNotNull(componentName);
        this.f45192c = componentName;
        this.f45193d = 4225;
        this.f45194e = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        if (Objects.equal(this.f45190a, zzoVar.f45190a) && Objects.equal(this.f45191b, zzoVar.f45191b) && Objects.equal(this.f45192c, zzoVar.f45192c) && this.f45194e == zzoVar.f45194e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45190a, this.f45191b, this.f45192c, 4225, Boolean.valueOf(this.f45194e));
    }

    public final String toString() {
        String str = this.f45190a;
        if (str == null) {
            Preconditions.checkNotNull(this.f45192c);
            return this.f45192c.flattenToString();
        }
        return str;
    }

    @Nullable
    public final ComponentName zza() {
        return this.f45192c;
    }

    public final Intent zzb(Context context) {
        Bundle bundle;
        if (this.f45190a != null) {
            Intent intent = null;
            if (this.f45194e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f45190a);
                try {
                    bundle = context.getContentResolver().call(f45189f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f45190a)));
                }
            }
            if (intent == null) {
                return new Intent(this.f45190a).setPackage(this.f45191b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f45192c);
    }

    @Nullable
    public final String zzc() {
        return this.f45191b;
    }

    public zzo(String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.f45190a = str;
        Preconditions.checkNotEmpty(str2);
        this.f45191b = str2;
        this.f45192c = null;
        this.f45193d = 4225;
        this.f45194e = z;
    }
}
