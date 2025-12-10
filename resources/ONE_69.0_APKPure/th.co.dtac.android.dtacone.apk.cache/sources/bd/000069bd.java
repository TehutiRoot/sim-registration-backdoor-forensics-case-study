package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public final class MimeTypeFilter {
    /* renamed from: a */
    public static boolean m57409a(String[] strArr, String[] strArr2) {
        if (strArr2.length == 2) {
            if (!strArr2[0].isEmpty() && !strArr2[1].isEmpty()) {
                if (strArr.length != 2) {
                    return false;
                }
                if (!Marker.ANY_MARKER.equals(strArr2[0]) && !strArr2[0].equals(strArr[0])) {
                    return false;
                }
                if (!Marker.ANY_MARKER.equals(strArr2[1]) && !strArr2[1].equals(strArr[1])) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }

    public static boolean matches(@Nullable String str, @NonNull String str2) {
        if (str == null) {
            return false;
        }
        return m57409a(str.split(RemoteSettings.FORWARD_SLASH_STRING), str2.split(RemoteSettings.FORWARD_SLASH_STRING));
    }

    @NonNull
    public static String[] matchesMany(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        for (String str2 : strArr) {
            if (m57409a(str2.split(RemoteSettings.FORWARD_SLASH_STRING), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Nullable
    public static String matches(@Nullable String str, @NonNull String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        for (String str2 : strArr) {
            if (m57409a(split, str2.split(RemoteSettings.FORWARD_SLASH_STRING))) {
                return str2;
            }
        }
        return null;
    }

    @Nullable
    public static String matches(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        for (String str2 : strArr) {
            if (m57409a(str2.split(RemoteSettings.FORWARD_SLASH_STRING), split)) {
                return str2;
            }
        }
        return null;
    }
}