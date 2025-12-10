package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
/* loaded from: classes3.dex */
public final class JsonUtils {

    /* renamed from: a */
    public static final Pattern f45320a = Pattern.compile("\\\\.");

    /* renamed from: b */
    public static final Pattern f45321b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Preconditions.checkNotNull(next);
                } catch (JSONException unused) {
                }
                if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return obj.equals(obj2);
        }
    }

    @Nullable
    @KeepForSdk
    public static String escapeString(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f45321b.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(0);
                if (charAt != '\f') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            if (charAt != '/') {
                                if (charAt != '\\') {
                                    switch (charAt) {
                                        case '\b':
                                            matcher.appendReplacement(stringBuffer, "\\\\b");
                                            continue;
                                        case '\t':
                                            matcher.appendReplacement(stringBuffer, "\\\\t");
                                            continue;
                                        case '\n':
                                            matcher.appendReplacement(stringBuffer, "\\\\n");
                                            continue;
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\\\\/");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, "\\\\r");
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                }
            }
            if (stringBuffer != null) {
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }

    @NonNull
    @KeepForSdk
    public static String unescapeString(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            String m68060a = AbstractC17726Hf2.m68060a(str);
            Matcher matcher = f45320a.matcher(m68060a);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char charAt = matcher.group().charAt(1);
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            if (charAt != 'b') {
                                if (charAt != 'f') {
                                    if (charAt != 'n') {
                                        if (charAt != 'r') {
                                            if (charAt == 't') {
                                                matcher.appendReplacement(stringBuffer, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
                                            } else {
                                                throw new IllegalStateException("Found an escaped character that should never be.");
                                            }
                                        } else {
                                            matcher.appendReplacement(stringBuffer, "\r");
                                        }
                                    } else {
                                        matcher.appendReplacement(stringBuffer, "\n");
                                    }
                                } else {
                                    matcher.appendReplacement(stringBuffer, "\f");
                                }
                            } else {
                                matcher.appendReplacement(stringBuffer, "\b");
                            }
                        } else {
                            matcher.appendReplacement(stringBuffer, "\\\\");
                        }
                    } else {
                        matcher.appendReplacement(stringBuffer, RemoteSettings.FORWARD_SLASH_STRING);
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                }
            }
            if (stringBuffer == null) {
                return m68060a;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }
}
