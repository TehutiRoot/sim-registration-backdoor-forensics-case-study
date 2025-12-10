package com.google.firebase.appdistribution.gradle.models;

import androidx.autofill.HintConstants;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010'¨\u0006+"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "", "Lcom/google/firebase/appdistribution/gradle/models/LoginCredentialFieldHints;", "fieldHints", "", "google", "", HintConstants.AUTOFILL_HINT_PASSWORD, HintConstants.AUTOFILL_HINT_USERNAME, "<init>", "(Lcom/google/firebase/appdistribution/gradle/models/LoginCredentialFieldHints;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/google/firebase/appdistribution/gradle/models/LoginCredentialFieldHints;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/google/firebase/appdistribution/gradle/models/LoginCredentialFieldHints;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/models/LoginCredentialFieldHints;", "getFieldHints", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Boolean;", "getGoogle", "setGoogle", "(Ljava/lang/Boolean;)V", OperatorName.CURVE_TO, "Ljava/lang/String;", "getPassword", "setPassword", "(Ljava/lang/String;)V", "d", "getUsername", "setUsername", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LoginCredential {
    @SerializedName("fieldHints")
    @Nullable

    /* renamed from: a */
    private final LoginCredentialFieldHints f54628a;

    /* renamed from: b */
    public Boolean f54629b;

    /* renamed from: c */
    public String f54630c;

    /* renamed from: d */
    public String f54631d;

    public LoginCredential() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LoginCredential copy$default(LoginCredential loginCredential, LoginCredentialFieldHints loginCredentialFieldHints, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            loginCredentialFieldHints = loginCredential.f54628a;
        }
        if ((i & 2) != 0) {
            bool = loginCredential.f54629b;
        }
        if ((i & 4) != 0) {
            str = loginCredential.f54630c;
        }
        if ((i & 8) != 0) {
            str2 = loginCredential.f54631d;
        }
        return loginCredential.copy(loginCredentialFieldHints, bool, str, str2);
    }

    @Nullable
    public final LoginCredentialFieldHints component1() {
        return this.f54628a;
    }

    @Nullable
    public final Boolean component2() {
        return this.f54629b;
    }

    @Nullable
    public final String component3() {
        return this.f54630c;
    }

    @Nullable
    public final String component4() {
        return this.f54631d;
    }

    @NotNull
    public final LoginCredential copy(@Nullable LoginCredentialFieldHints loginCredentialFieldHints, @Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        return new LoginCredential(loginCredentialFieldHints, bool, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginCredential) {
            LoginCredential loginCredential = (LoginCredential) obj;
            return Intrinsics.areEqual(this.f54628a, loginCredential.f54628a) && Intrinsics.areEqual(this.f54629b, loginCredential.f54629b) && Intrinsics.areEqual(this.f54630c, loginCredential.f54630c) && Intrinsics.areEqual(this.f54631d, loginCredential.f54631d);
        }
        return false;
    }

    @Nullable
    public final LoginCredentialFieldHints getFieldHints() {
        return this.f54628a;
    }

    @Nullable
    public final Boolean getGoogle() {
        return this.f54629b;
    }

    @Nullable
    public final String getPassword() {
        return this.f54630c;
    }

    @Nullable
    public final String getUsername() {
        return this.f54631d;
    }

    public int hashCode() {
        LoginCredentialFieldHints loginCredentialFieldHints = this.f54628a;
        int hashCode = (loginCredentialFieldHints == null ? 0 : loginCredentialFieldHints.hashCode()) * 31;
        Boolean bool = this.f54629b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f54630c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54631d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setGoogle(@Nullable Boolean bool) {
        this.f54629b = bool;
    }

    public final void setPassword(@Nullable String str) {
        this.f54630c = str;
    }

    public final void setUsername(@Nullable String str) {
        this.f54631d = str;
    }

    @NotNull
    public String toString() {
        return "LoginCredential(fieldHints=" + this.f54628a + ", google=" + this.f54629b + ", password=" + this.f54630c + ", username=" + this.f54631d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public LoginCredential(@Nullable LoginCredentialFieldHints loginCredentialFieldHints, @Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.f54628a = loginCredentialFieldHints;
        this.f54629b = bool;
        this.f54630c = str;
        this.f54631d = str2;
    }

    public /* synthetic */ LoginCredential(LoginCredentialFieldHints loginCredentialFieldHints, Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : loginCredentialFieldHints, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
