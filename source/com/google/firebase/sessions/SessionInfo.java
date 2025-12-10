package com.google.firebase.sessions;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u0010¨\u00064"}, m28850d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "eventTimestampUs", "Lcom/google/firebase/sessions/DataCollectionStatus;", "dataCollectionStatus", "firebaseInstallationId", "firebaseAuthenticationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()J", "component5", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/sessions/SessionInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSessionId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFirstSessionId", OperatorName.CURVE_TO, "I", "getSessionIndex", "d", OperatorName.SET_LINE_CAPSTYLE, "getEventTimestampUs", "e", "Lcom/google/firebase/sessions/DataCollectionStatus;", "getDataCollectionStatus", OperatorName.FILL_NON_ZERO, "getFirebaseInstallationId", OperatorName.NON_STROKING_GRAY, "getFirebaseAuthenticationToken", "com.google.firebase-firebase-sessions"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SessionInfo {

    /* renamed from: a */
    public final String f56578a;

    /* renamed from: b */
    public final String f56579b;

    /* renamed from: c */
    public final int f56580c;

    /* renamed from: d */
    public final long f56581d;

    /* renamed from: e */
    public final DataCollectionStatus f56582e;

    /* renamed from: f */
    public final String f56583f;

    /* renamed from: g */
    public final String f56584g;

    public SessionInfo(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f56578a = sessionId;
        this.f56579b = firstSessionId;
        this.f56580c = i;
        this.f56581d = j;
        this.f56582e = dataCollectionStatus;
        this.f56583f = firebaseInstallationId;
        this.f56584g = firebaseAuthenticationToken;
    }

    @NotNull
    public final String component1() {
        return this.f56578a;
    }

    @NotNull
    public final String component2() {
        return this.f56579b;
    }

    public final int component3() {
        return this.f56580c;
    }

    public final long component4() {
        return this.f56581d;
    }

    @NotNull
    public final DataCollectionStatus component5() {
        return this.f56582e;
    }

    @NotNull
    public final String component6() {
        return this.f56583f;
    }

    @NotNull
    public final String component7() {
        return this.f56584g;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionInfo(sessionId, firstSessionId, i, j, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionInfo) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            return Intrinsics.areEqual(this.f56578a, sessionInfo.f56578a) && Intrinsics.areEqual(this.f56579b, sessionInfo.f56579b) && this.f56580c == sessionInfo.f56580c && this.f56581d == sessionInfo.f56581d && Intrinsics.areEqual(this.f56582e, sessionInfo.f56582e) && Intrinsics.areEqual(this.f56583f, sessionInfo.f56583f) && Intrinsics.areEqual(this.f56584g, sessionInfo.f56584g);
        }
        return false;
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.f56582e;
    }

    public final long getEventTimestampUs() {
        return this.f56581d;
    }

    @NotNull
    public final String getFirebaseAuthenticationToken() {
        return this.f56584g;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.f56583f;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.f56579b;
    }

    @NotNull
    public final String getSessionId() {
        return this.f56578a;
    }

    public final int getSessionIndex() {
        return this.f56580c;
    }

    public int hashCode() {
        return (((((((((((this.f56578a.hashCode() * 31) + this.f56579b.hashCode()) * 31) + this.f56580c) * 31) + AbstractC17792Ig1.m67882a(this.f56581d)) * 31) + this.f56582e.hashCode()) * 31) + this.f56583f.hashCode()) * 31) + this.f56584g.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionInfo(sessionId=" + this.f56578a + ", firstSessionId=" + this.f56579b + ", sessionIndex=" + this.f56580c + ", eventTimestampUs=" + this.f56581d + ", dataCollectionStatus=" + this.f56582e + ", firebaseInstallationId=" + this.f56583f + ", firebaseAuthenticationToken=" + this.f56584g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
