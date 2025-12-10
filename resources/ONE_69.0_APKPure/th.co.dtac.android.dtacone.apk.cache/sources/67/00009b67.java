package com.google.android.gms.internal.vision;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzbe {

    /* renamed from: a */
    public final Map f47577a;

    public zzbe(Map map) {
        this.f47577a = map;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = (Map) this.f47577a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str3);
            if (valueOf.length() != 0) {
                str3 = str2.concat(valueOf);
            } else {
                str3 = new String(str2);
            }
        }
        return (String) map.get(str3);
    }
}