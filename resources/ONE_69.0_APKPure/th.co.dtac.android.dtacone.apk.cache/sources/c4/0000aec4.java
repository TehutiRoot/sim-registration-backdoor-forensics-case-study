package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig;", "", "Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;", "tokens", "<init>", "(Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;)V", "component1", "()Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;", "copy", "(Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;)Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;", "getTokens", "Tokens", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FirebaseCliConfig {

    /* renamed from: a */
    public final Tokens f54638a;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;", "", "", "refreshToken", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/FirebaseCliConfig$Tokens;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRefreshToken", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Tokens {

        /* renamed from: a */
        public final String f54639a;

        public Tokens() {
            this(null, 1, null);
        }

        public static /* synthetic */ Tokens copy$default(Tokens tokens, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokens.f54639a;
            }
            return tokens.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.f54639a;
        }

        @NotNull
        public final Tokens copy(@Nullable String str) {
            return new Tokens(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Tokens) && Intrinsics.areEqual(this.f54639a, ((Tokens) obj).f54639a);
        }

        @Nullable
        public final String getRefreshToken() {
            return this.f54639a;
        }

        public int hashCode() {
            String str = this.f54639a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Tokens(refreshToken=" + this.f54639a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Tokens(@Nullable String str) {
            this.f54639a = str;
        }

        public /* synthetic */ Tokens(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public FirebaseCliConfig() {
        this(null, 1, null);
    }

    public static /* synthetic */ FirebaseCliConfig copy$default(FirebaseCliConfig firebaseCliConfig, Tokens tokens, int i, Object obj) {
        if ((i & 1) != 0) {
            tokens = firebaseCliConfig.f54638a;
        }
        return firebaseCliConfig.copy(tokens);
    }

    @Nullable
    public final Tokens component1() {
        return this.f54638a;
    }

    @NotNull
    public final FirebaseCliConfig copy(@Nullable Tokens tokens) {
        return new FirebaseCliConfig(tokens);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseCliConfig) && Intrinsics.areEqual(this.f54638a, ((FirebaseCliConfig) obj).f54638a);
    }

    @Nullable
    public final Tokens getTokens() {
        return this.f54638a;
    }

    public int hashCode() {
        Tokens tokens = this.f54638a;
        if (tokens == null) {
            return 0;
        }
        return tokens.hashCode();
    }

    @NotNull
    public String toString() {
        return "FirebaseCliConfig(tokens=" + this.f54638a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public FirebaseCliConfig(@Nullable Tokens tokens) {
        this.f54638a = tokens;
    }

    public /* synthetic */ FirebaseCliConfig(Tokens tokens, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tokens);
    }
}