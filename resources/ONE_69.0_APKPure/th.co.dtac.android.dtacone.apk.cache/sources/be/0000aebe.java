package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;", "", "", "certificateHashMd5", "certificateHashSha1", "certificateHashSha256", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/AabCertificate;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCertificateHashMd5", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCertificateHashSha1", OperatorName.CURVE_TO, "getCertificateHashSha256", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AabCertificate {
    @SerializedName("hashMd5")
    @NotNull

    /* renamed from: a */
    private final String f54618a;
    @SerializedName("hashSha1")
    @NotNull

    /* renamed from: b */
    private final String f54619b;
    @SerializedName("hashSha256")
    @NotNull

    /* renamed from: c */
    private final String f54620c;

    public AabCertificate(@NotNull String certificateHashMd5, @NotNull String certificateHashSha1, @NotNull String certificateHashSha256) {
        Intrinsics.checkNotNullParameter(certificateHashMd5, "certificateHashMd5");
        Intrinsics.checkNotNullParameter(certificateHashSha1, "certificateHashSha1");
        Intrinsics.checkNotNullParameter(certificateHashSha256, "certificateHashSha256");
        this.f54618a = certificateHashMd5;
        this.f54619b = certificateHashSha1;
        this.f54620c = certificateHashSha256;
    }

    public static /* synthetic */ AabCertificate copy$default(AabCertificate aabCertificate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aabCertificate.f54618a;
        }
        if ((i & 2) != 0) {
            str2 = aabCertificate.f54619b;
        }
        if ((i & 4) != 0) {
            str3 = aabCertificate.f54620c;
        }
        return aabCertificate.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f54618a;
    }

    @NotNull
    public final String component2() {
        return this.f54619b;
    }

    @NotNull
    public final String component3() {
        return this.f54620c;
    }

    @NotNull
    public final AabCertificate copy(@NotNull String certificateHashMd5, @NotNull String certificateHashSha1, @NotNull String certificateHashSha256) {
        Intrinsics.checkNotNullParameter(certificateHashMd5, "certificateHashMd5");
        Intrinsics.checkNotNullParameter(certificateHashSha1, "certificateHashSha1");
        Intrinsics.checkNotNullParameter(certificateHashSha256, "certificateHashSha256");
        return new AabCertificate(certificateHashMd5, certificateHashSha1, certificateHashSha256);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AabCertificate) {
            AabCertificate aabCertificate = (AabCertificate) obj;
            return Intrinsics.areEqual(this.f54618a, aabCertificate.f54618a) && Intrinsics.areEqual(this.f54619b, aabCertificate.f54619b) && Intrinsics.areEqual(this.f54620c, aabCertificate.f54620c);
        }
        return false;
    }

    @NotNull
    public final String getCertificateHashMd5() {
        return this.f54618a;
    }

    @NotNull
    public final String getCertificateHashSha1() {
        return this.f54619b;
    }

    @NotNull
    public final String getCertificateHashSha256() {
        return this.f54620c;
    }

    public int hashCode() {
        return (((this.f54618a.hashCode() * 31) + this.f54619b.hashCode()) * 31) + this.f54620c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AabCertificate(certificateHashMd5=" + this.f54618a + ", certificateHashSha1=" + this.f54619b + ", certificateHashSha256=" + this.f54620c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}