package com.google.firebase.appdistribution.gradle.models.uploadstatus;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusResponse;", "", "", "isDone", "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;", "response", "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(ZLcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusError;)V", "component1", "()Z", "component2", "()Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;", "component3", "()Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusError;", "copy", "(ZLcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusError;)Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;", "getResponse", OperatorName.CURVE_TO, "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusError;", "getError", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UploadStatusResponse {
    @SerializedName("done")

    /* renamed from: a */
    private final boolean f54657a;
    @SerializedName("response")
    @Nullable

    /* renamed from: b */
    private final WrappedResponse f54658b;
    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    @Nullable

    /* renamed from: c */
    private final UploadStatusError f54659c;

    public UploadStatusResponse(boolean z, @Nullable WrappedResponse wrappedResponse, @Nullable UploadStatusError uploadStatusError) {
        this.f54657a = z;
        this.f54658b = wrappedResponse;
        this.f54659c = uploadStatusError;
    }

    public static /* synthetic */ UploadStatusResponse copy$default(UploadStatusResponse uploadStatusResponse, boolean z, WrappedResponse wrappedResponse, UploadStatusError uploadStatusError, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uploadStatusResponse.f54657a;
        }
        if ((i & 2) != 0) {
            wrappedResponse = uploadStatusResponse.f54658b;
        }
        if ((i & 4) != 0) {
            uploadStatusError = uploadStatusResponse.f54659c;
        }
        return uploadStatusResponse.copy(z, wrappedResponse, uploadStatusError);
    }

    public final boolean component1() {
        return this.f54657a;
    }

    @Nullable
    public final WrappedResponse component2() {
        return this.f54658b;
    }

    @Nullable
    public final UploadStatusError component3() {
        return this.f54659c;
    }

    @NotNull
    public final UploadStatusResponse copy(boolean z, @Nullable WrappedResponse wrappedResponse, @Nullable UploadStatusError uploadStatusError) {
        return new UploadStatusResponse(z, wrappedResponse, uploadStatusError);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadStatusResponse) {
            UploadStatusResponse uploadStatusResponse = (UploadStatusResponse) obj;
            return this.f54657a == uploadStatusResponse.f54657a && Intrinsics.areEqual(this.f54658b, uploadStatusResponse.f54658b) && Intrinsics.areEqual(this.f54659c, uploadStatusResponse.f54659c);
        }
        return false;
    }

    @Nullable
    public final UploadStatusError getError() {
        return this.f54659c;
    }

    @Nullable
    public final WrappedResponse getResponse() {
        return this.f54658b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.f54657a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        WrappedResponse wrappedResponse = this.f54658b;
        int hashCode = (i + (wrappedResponse == null ? 0 : wrappedResponse.hashCode())) * 31;
        UploadStatusError uploadStatusError = this.f54659c;
        return hashCode + (uploadStatusError != null ? uploadStatusError.hashCode() : 0);
    }

    public final boolean isDone() {
        return this.f54657a;
    }

    @NotNull
    public String toString() {
        return "UploadStatusResponse(isDone=" + this.f54657a + ", response=" + this.f54658b + ", error=" + this.f54659c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ UploadStatusResponse(boolean z, WrappedResponse wrappedResponse, UploadStatusError uploadStatusError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : wrappedResponse, (i & 4) != 0 ? null : uploadStatusError);
    }
}
