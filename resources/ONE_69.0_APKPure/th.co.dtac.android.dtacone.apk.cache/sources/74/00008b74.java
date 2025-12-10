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
    public static final Object f44780e = new Object();

    /* renamed from: f */
    public static GoogleServices f44781f;

    /* renamed from: a */
    public final String f44782a;

    /* renamed from: b */
    public final Status f44783b;

    /* renamed from: c */
    public final boolean f44784c;

    /* renamed from: d */
    public final boolean f44785d;

    public GoogleServices(String str, boolean z) {
        this.f44782a = str;
        this.f44783b = Status.RESULT_SUCCESS;
        this.f44784c = z;
        this.f44785d = !z;
    }

    /* renamed from: b */
    public static GoogleServices m48580b(String str) {
        GoogleServices googleServices;
        synchronized (f44780e) {
            try {
                googleServices = f44781f;
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
        return m48580b("getGoogleAppId").f44782a;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (f44780e) {
            try {
                if (f44781f == null) {
                    f44781f = new GoogleServices(context);
                }
                status = f44781f.f44783b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices m48580b = m48580b("isMeasurementEnabled");
        if (m48580b.f44783b.isSuccess() && m48580b.f44784c) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return m48580b("isMeasurementExplicitlyDisabled").f44785d;
    }

    /* renamed from: a */
    public Status m48581a(String str) {
        String str2 = this.f44782a;
        if (str2 != null && !str2.equals(str)) {
            String str3 = this.f44782a;
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
            this.f44785d = z;
        } else {
            this.f44785d = false;
        }
        this.f44784c = r2;
        String zzb = zzah.zzb(context);
        zzb = zzb == null ? new StringResourceValueReader(context).getString("google_app_id") : zzb;
        if (TextUtils.isEmpty(zzb)) {
            this.f44783b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f44782a = null;
            return;
        }
        this.f44782a = zzb;
        this.f44783b = Status.RESULT_SUCCESS;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static Status initialize(@NonNull Context context, @NonNull String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (f44780e) {
            try {
                GoogleServices googleServices = f44781f;
                if (googleServices != null) {
                    return googleServices.m48581a(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z);
                f44781f = googleServices2;
                return googleServices2.f44783b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}