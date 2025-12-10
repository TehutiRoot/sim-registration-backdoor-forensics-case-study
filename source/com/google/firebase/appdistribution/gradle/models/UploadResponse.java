package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/UploadResponse;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/UploadResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UploadResponse {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f54648a;

    public UploadResponse(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f54648a = name;
    }

    public static /* synthetic */ UploadResponse copy$default(UploadResponse uploadResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadResponse.f54648a;
        }
        return uploadResponse.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.f54648a;
    }

    @NotNull
    public final UploadResponse copy(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new UploadResponse(name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadResponse) && Intrinsics.areEqual(this.f54648a, ((UploadResponse) obj).f54648a);
    }

    @NotNull
    public final String getName() {
        return this.f54648a;
    }

    public int hashCode() {
        return this.f54648a.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadResponse(name=" + this.f54648a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
