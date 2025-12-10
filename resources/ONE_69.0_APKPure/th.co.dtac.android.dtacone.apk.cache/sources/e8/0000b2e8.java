package com.google.firebase.sessions;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011¨\u0006%"}, m29142d2 = {"Lcom/google/firebase/sessions/SessionDetails;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;IJ)Lcom/google/firebase/sessions/SessionDetails;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSessionId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFirstSessionId", OperatorName.CURVE_TO, "I", "getSessionIndex", "d", OperatorName.SET_LINE_CAPSTYLE, "getSessionStartTimestampUs", "com.google.firebase-firebase-sessions"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SessionDetails {

    /* renamed from: a */
    public final String f56570a;

    /* renamed from: b */
    public final String f56571b;

    /* renamed from: c */
    public final int f56572c;

    /* renamed from: d */
    public final long f56573d;

    public SessionDetails(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f56570a = sessionId;
        this.f56571b = firstSessionId;
        this.f56572c = i;
        this.f56573d = j;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionDetails.f56570a;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionDetails.f56571b;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = sessionDetails.f56572c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = sessionDetails.f56573d;
        }
        return sessionDetails.copy(str, str3, i3, j);
    }

    @NotNull
    public final String component1() {
        return this.f56570a;
    }

    @NotNull
    public final String component2() {
        return this.f56571b;
    }

    public final int component3() {
        return this.f56572c;
    }

    public final long component4() {
        return this.f56573d;
    }

    @NotNull
    public final SessionDetails copy(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        return new SessionDetails(sessionId, firstSessionId, i, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionDetails) {
            SessionDetails sessionDetails = (SessionDetails) obj;
            return Intrinsics.areEqual(this.f56570a, sessionDetails.f56570a) && Intrinsics.areEqual(this.f56571b, sessionDetails.f56571b) && this.f56572c == sessionDetails.f56572c && this.f56573d == sessionDetails.f56573d;
        }
        return false;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.f56571b;
    }

    @NotNull
    public final String getSessionId() {
        return this.f56570a;
    }

    public final int getSessionIndex() {
        return this.f56572c;
    }

    public final long getSessionStartTimestampUs() {
        return this.f56573d;
    }

    public int hashCode() {
        return (((((this.f56570a.hashCode() * 31) + this.f56571b.hashCode()) * 31) + this.f56572c) * 31) + AbstractC17631Fh1.m68395a(this.f56573d);
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.f56570a + ", firstSessionId=" + this.f56571b + ", sessionIndex=" + this.f56572c + ", sessionStartTimestampUs=" + this.f56573d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}