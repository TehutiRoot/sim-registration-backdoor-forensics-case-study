package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public final class GoogleServices {

    /* renamed from: e */
    public static final Object f44768e = new Object();

    /* renamed from: f */
    public static GoogleServices f44769f;

    /* renamed from: a */
    public final String f44770a;

    /* renamed from: b */
    public final Status f44771b;

    /* renamed from: c */
    public final boolean f44772c;

    /* renamed from: d */
    public final boolean f44773d;

    public GoogleServices(String str, boolean z) {
        this.f44770a = str;
        this.f44771b = Status.RESULT_SUCCESS;
        this.f44772c = z;
        this.f44773d = !z;
    }

    /* renamed from: b */
    public static GoogleServices m48583b(String str) {
        GoogleServices googleServices;
        synchronized (f44768e) {
            try {
                googleServices = f44769f;
                if (googleServices == null) {
                    throw new IllegalStateException("Initialize must be called before " + str + ".");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return googleServices;
    }

    @Nullable
    @KeepForSdk
    public static String getGoogleAppId() {
        return m48583b("getGoogleAppId").f44770a;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (f44768e) {
            try {
                if (f44769f == null) {
                    f44769f = new GoogleServices(context);
                }
                status = f44769f.f44771b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices m48583b = m48583b("isMeasurementEnabled");
        if (m48583b.f44771b.isSuccess() && m48583b.f44772c) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return m48583b("isMeasurementExplicitlyDisabled").f44773d;
    }

    /* renamed from: a */
    public Status m48584a(String str) {
        String str2 = this.f44770a;
        if (str2 != null && !str2.equals(str)) {
            String str3 = this.f44770a;
            return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + str3 + "'.");
        }
        return Status.RESULT_SUCCESS;
    }

    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", TypedValues.Custom.S_INT, resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z = integer == 0;
            r2 = integer != 0;
            this.f44773d = z;
        } else {
            this.f44773d = false;
        }
        this.f44772c = r2;
        String zzb = zzah.zzb(context);
        zzb = zzb == null ? new StringResourceValueReader(context).getString("google_app_id") : zzb;
        if (TextUtils.isEmpty(zzb)) {
            this.f44771b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f44770a = null;
            return;
        }
        this.f44770a = zzb;
        this.f44771b = Status.RESULT_SUCCESS;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static Status initialize(@NonNull Context context, @NonNull String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (f44768e) {
            try {
                GoogleServices googleServices = f44769f;
                if (googleServices != null) {
                    return googleServices.m48584a(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z);
                f44769f = googleServices2;
                return googleServices2.f44771b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
