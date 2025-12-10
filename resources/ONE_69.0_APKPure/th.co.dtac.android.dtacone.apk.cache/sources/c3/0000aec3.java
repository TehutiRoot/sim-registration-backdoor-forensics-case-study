package com.google.firebase.appdistribution.gradle.models;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\n¨\u0006\u001e"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;", "", "", "message", "", "code", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getCode", OperatorName.CURVE_TO, "getStatus", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ErrorPayload {
    @SerializedName("message")
    @Nullable

    /* renamed from: a */
    private final String f54635a;
    @SerializedName("code")

    /* renamed from: b */
    private final int f54636b;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable

    /* renamed from: c */
    private final String f54637c;

    public ErrorPayload() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ ErrorPayload copy$default(ErrorPayload errorPayload, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorPayload.f54635a;
        }
        if ((i2 & 2) != 0) {
            i = errorPayload.f54636b;
        }
        if ((i2 & 4) != 0) {
            str2 = errorPayload.f54637c;
        }
        return errorPayload.copy(str, i, str2);
    }

    @Nullable
    public final String component1() {
        return this.f54635a;
    }

    public final int component2() {
        return this.f54636b;
    }

    @Nullable
    public final String component3() {
        return this.f54637c;
    }

    @NotNull
    public final ErrorPayload copy(@Nullable String str, int i, @Nullable String str2) {
        return new ErrorPayload(str, i, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorPayload) {
            ErrorPayload errorPayload = (ErrorPayload) obj;
            return Intrinsics.areEqual(this.f54635a, errorPayload.f54635a) && this.f54636b == errorPayload.f54636b && Intrinsics.areEqual(this.f54637c, errorPayload.f54637c);
        }
        return false;
    }

    public final int getCode() {
        return this.f54636b;
    }

    @Nullable
    public final String getMessage() {
        return this.f54635a;
    }

    @Nullable
    public final String getStatus() {
        return this.f54637c;
    }

    public int hashCode() {
        String str = this.f54635a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f54636b) * 31;
        String str2 = this.f54637c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ErrorPayload(message=" + this.f54635a + ", code=" + this.f54636b + ", status=" + this.f54637c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ErrorPayload(@Nullable String str, int i, @Nullable String str2) {
        this.f54635a = str;
        this.f54636b = i;
        this.f54637c = str2;
    }

    public /* synthetic */ ErrorPayload(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
    }
}