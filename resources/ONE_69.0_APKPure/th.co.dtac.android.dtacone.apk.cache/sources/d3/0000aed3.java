package com.google.firebase.appdistribution.gradle.models.uploadstatus;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;", "", "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatus;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;", "release", "<init>", "(Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatus;Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;)V", "component1", "()Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatus;", "component2", "()Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;", "copy", "(Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatus;Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;)Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/WrappedResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatus;", "getStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;", "getRelease", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WrappedResponse {
    @SerializedName("result")
    @NotNull

    /* renamed from: a */
    private final UploadStatus f54672a;
    @SerializedName("release")
    @NotNull

    /* renamed from: b */
    private final Release f54673b;

    public WrappedResponse(@NotNull UploadStatus status, @NotNull Release release) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(release, "release");
        this.f54672a = status;
        this.f54673b = release;
    }

    public static /* synthetic */ WrappedResponse copy$default(WrappedResponse wrappedResponse, UploadStatus uploadStatus, Release release, int i, Object obj) {
        if ((i & 1) != 0) {
            uploadStatus = wrappedResponse.f54672a;
        }
        if ((i & 2) != 0) {
            release = wrappedResponse.f54673b;
        }
        return wrappedResponse.copy(uploadStatus, release);
    }

    @NotNull
    public final UploadStatus component1() {
        return this.f54672a;
    }

    @NotNull
    public final Release component2() {
        return this.f54673b;
    }

    @NotNull
    public final WrappedResponse copy(@NotNull UploadStatus status, @NotNull Release release) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(release, "release");
        return new WrappedResponse(status, release);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WrappedResponse) {
            WrappedResponse wrappedResponse = (WrappedResponse) obj;
            return this.f54672a == wrappedResponse.f54672a && Intrinsics.areEqual(this.f54673b, wrappedResponse.f54673b);
        }
        return false;
    }

    @NotNull
    public final Release getRelease() {
        return this.f54673b;
    }

    @NotNull
    public final UploadStatus getStatus() {
        return this.f54672a;
    }

    public int hashCode() {
        return (this.f54672a.hashCode() * 31) + this.f54673b.hashCode();
    }

    @NotNull
    public String toString() {
        return "WrappedResponse(status=" + this.f54672a + ", release=" + this.f54673b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}