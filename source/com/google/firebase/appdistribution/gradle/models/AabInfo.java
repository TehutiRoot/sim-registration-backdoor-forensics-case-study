package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/AabInfo;", "", "Lcom/google/firebase/appdistribution/gradle/models/AabState;", "aabState", "Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;", "aabCertificate", "<init>", "(Lcom/google/firebase/appdistribution/gradle/models/AabState;Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;)V", "component1", "()Lcom/google/firebase/appdistribution/gradle/models/AabState;", "component2", "()Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;", "copy", "(Lcom/google/firebase/appdistribution/gradle/models/AabState;Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;)Lcom/google/firebase/appdistribution/gradle/models/AabInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/models/AabState;", "getAabState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;", "getAabCertificate", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AabInfo {
    @SerializedName("integrationState")
    @Nullable

    /* renamed from: a */
    private final AabState f54609a;
    @SerializedName("testCertificate")
    @Nullable

    /* renamed from: b */
    private final AabCertificate f54610b;

    public AabInfo() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AabInfo copy$default(AabInfo aabInfo, AabState aabState, AabCertificate aabCertificate, int i, Object obj) {
        if ((i & 1) != 0) {
            aabState = aabInfo.f54609a;
        }
        if ((i & 2) != 0) {
            aabCertificate = aabInfo.f54610b;
        }
        return aabInfo.copy(aabState, aabCertificate);
    }

    @Nullable
    public final AabState component1() {
        return this.f54609a;
    }

    @Nullable
    public final AabCertificate component2() {
        return this.f54610b;
    }

    @NotNull
    public final AabInfo copy(@Nullable AabState aabState, @Nullable AabCertificate aabCertificate) {
        return new AabInfo(aabState, aabCertificate);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AabInfo) {
            AabInfo aabInfo = (AabInfo) obj;
            return this.f54609a == aabInfo.f54609a && Intrinsics.areEqual(this.f54610b, aabInfo.f54610b);
        }
        return false;
    }

    @Nullable
    public final AabCertificate getAabCertificate() {
        return this.f54610b;
    }

    @Nullable
    public final AabState getAabState() {
        return this.f54609a;
    }

    public int hashCode() {
        AabState aabState = this.f54609a;
        int hashCode = (aabState == null ? 0 : aabState.hashCode()) * 31;
        AabCertificate aabCertificate = this.f54610b;
        return hashCode + (aabCertificate != null ? aabCertificate.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AabInfo(aabState=" + this.f54609a + ", aabCertificate=" + this.f54610b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public AabInfo(@Nullable AabState aabState, @Nullable AabCertificate aabCertificate) {
        this.f54609a = aabState;
        this.f54610b = aabCertificate;
    }

    public /* synthetic */ AabInfo(AabState aabState, AabCertificate aabCertificate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aabState, (i & 2) != 0 ? null : aabCertificate);
    }
}
