package com.google.firebase.sessions;

import android.util.Base64;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, m28850d2 = {"Lcom/google/firebase/sessions/SessionDataStoreConfigs;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "PROCESS_NAME", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSESSIONS_CONFIG_NAME", "()Ljava/lang/String;", "SESSIONS_CONFIG_NAME", OperatorName.CURVE_TO, "getSETTINGS_CONFIG_NAME", "SETTINGS_CONFIG_NAME", "com.google.firebase-firebase-sessions"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SessionDataStoreConfigs {
    @NotNull
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();

    /* renamed from: a */
    public static final String f56540a;

    /* renamed from: b */
    public static final String f56541b;

    /* renamed from: c */
    public static final String f56542c;

    static {
        String encodeToString = Base64.encodeToString(AbstractC20204hN1.encodeToByteArray(ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions()), 10);
        f56540a = encodeToString;
        f56541b = "firebase_session_" + encodeToString + "_data";
        f56542c = "firebase_session_" + encodeToString + "_settings";
    }

    @NotNull
    public final String getSESSIONS_CONFIG_NAME() {
        return f56541b;
    }

    @NotNull
    public final String getSETTINGS_CONFIG_NAME() {
        return f56542c;
    }
}
