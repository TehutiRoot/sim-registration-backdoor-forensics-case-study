package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/WrappedErrorResponse;", "", "Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;)V", "component1", "()Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;", "copy", "(Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;)Lcom/google/firebase/appdistribution/gradle/models/WrappedErrorResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/models/ErrorPayload;", "getError", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WrappedErrorResponse {
    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    @Nullable

    /* renamed from: a */
    private final ErrorPayload f54649a;

    public WrappedErrorResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ WrappedErrorResponse copy$default(WrappedErrorResponse wrappedErrorResponse, ErrorPayload errorPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            errorPayload = wrappedErrorResponse.f54649a;
        }
        return wrappedErrorResponse.copy(errorPayload);
    }

    @Nullable
    public final ErrorPayload component1() {
        return this.f54649a;
    }

    @NotNull
    public final WrappedErrorResponse copy(@Nullable ErrorPayload errorPayload) {
        return new WrappedErrorResponse(errorPayload);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WrappedErrorResponse) && Intrinsics.areEqual(this.f54649a, ((WrappedErrorResponse) obj).f54649a);
    }

    @Nullable
    public final ErrorPayload getError() {
        return this.f54649a;
    }

    public int hashCode() {
        ErrorPayload errorPayload = this.f54649a;
        if (errorPayload == null) {
            return 0;
        }
        return errorPayload.hashCode();
    }

    @NotNull
    public String toString() {
        return "WrappedErrorResponse(error=" + this.f54649a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public WrappedErrorResponse(@Nullable ErrorPayload errorPayload) {
        this.f54649a = errorPayload;
    }

    public /* synthetic */ WrappedErrorResponse(ErrorPayload errorPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : errorPayload);
    }
}
