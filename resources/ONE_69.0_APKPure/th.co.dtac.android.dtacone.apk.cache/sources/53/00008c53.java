package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p005os.ConfigurationCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.R;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zac {

    /* renamed from: a */
    public static final SimpleArrayMap f45156a = new SimpleArrayMap();

    /* renamed from: b */
    public static Locale f45157b;

    /* renamed from: a */
    public static String m48380a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m48379b = m48379b(context, str);
        if (m48379b == null) {
            m48379b = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m48379b, str2);
    }

    /* renamed from: b */
    public static String m48379b(Context context, String str) {
        SimpleArrayMap simpleArrayMap = f45156a;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f45157b)) {
                    simpleArrayMap.clear();
                    f45157b = locale;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                simpleArrayMap.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    @NonNull
    public static String zab(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
            }
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
        }
        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
    }

    @NonNull
    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        String zaa = zaa(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return m48380a(context, "common_google_play_services_api_unavailable_text", zaa);
                                        case 17:
                                            return m48380a(context, "common_google_play_services_sign_in_failed_text", zaa);
                                        case 18:
                                            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, zaa);
                                        default:
                                            return resources.getString(R.string.common_google_play_services_unknown_issue, zaa);
                                    }
                                }
                                return m48380a(context, "common_google_play_services_restricted_profile_text", zaa);
                            }
                            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, zaa);
                        }
                        return m48380a(context, "common_google_play_services_network_error_text", zaa);
                    }
                    return m48380a(context, "common_google_play_services_invalid_account_text", zaa);
                }
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, zaa);
            } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text);
            } else {
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, zaa);
            }
        }
        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, zaa);
    }

    @NonNull
    public static String zad(Context context, int i) {
        if (i != 6 && i != 19) {
            return zac(context, i);
        }
        return m48380a(context, "common_google_play_services_resolution_required_text", zaa(context));
    }

    @NonNull
    public static String zae(Context context, int i) {
        String zaf;
        if (i == 6) {
            zaf = m48379b(context, "common_google_play_services_resolution_required_title");
        } else {
            zaf = zaf(context, i);
        }
        if (zaf == null) {
            return context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
        }
        return zaf;
    }

    @Nullable
    public static String zaf(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m48379b(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m48379b(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
            case 17:
                return m48379b(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m48379b(context, "common_google_play_services_restricted_profile_title");
        }
    }
}