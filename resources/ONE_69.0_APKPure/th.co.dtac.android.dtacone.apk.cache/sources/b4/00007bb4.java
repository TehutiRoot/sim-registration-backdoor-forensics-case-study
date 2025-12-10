package co.omise.android.models;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m29142d2 = {"Lco/omise/android/models/BackendType;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Source", "Token", "Lco/omise/android/models/BackendType$Source;", "Lco/omise/android/models/BackendType$Token;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public abstract class BackendType {
    @Nullable
    private final String name;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m29142d2 = {"Lco/omise/android/models/BackendType$Source;", "Lco/omise/android/models/BackendType;", "sourceType", "Lco/omise/android/models/SourceType;", "(Lco/omise/android/models/SourceType;)V", "getSourceType", "()Lco/omise/android/models/SourceType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Source extends BackendType {
        @NotNull
        private final SourceType sourceType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Source(@NotNull SourceType sourceType) {
            super(sourceType.getName(), null);
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            this.sourceType = sourceType;
        }

        public static /* synthetic */ Source copy$default(Source source, SourceType sourceType, int i, Object obj) {
            if ((i & 1) != 0) {
                sourceType = source.sourceType;
            }
            return source.copy(sourceType);
        }

        @NotNull
        public final SourceType component1() {
            return this.sourceType;
        }

        @NotNull
        public final Source copy(@NotNull SourceType sourceType) {
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            return new Source(sourceType);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Source) && Intrinsics.areEqual(this.sourceType, ((Source) obj).sourceType);
        }

        @NotNull
        public final SourceType getSourceType() {
            return this.sourceType;
        }

        public int hashCode() {
            return this.sourceType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Source(sourceType=" + this.sourceType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m29142d2 = {"Lco/omise/android/models/BackendType$Token;", "Lco/omise/android/models/BackendType;", "tokenizationMethod", "Lco/omise/android/models/TokenizationMethod;", "(Lco/omise/android/models/TokenizationMethod;)V", "getTokenizationMethod", "()Lco/omise/android/models/TokenizationMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Token extends BackendType {
        @NotNull
        private final TokenizationMethod tokenizationMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Token(@NotNull TokenizationMethod tokenizationMethod) {
            super(tokenizationMethod.getName(), null);
            Intrinsics.checkNotNullParameter(tokenizationMethod, "tokenizationMethod");
            this.tokenizationMethod = tokenizationMethod;
        }

        public static /* synthetic */ Token copy$default(Token token, TokenizationMethod tokenizationMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                tokenizationMethod = token.tokenizationMethod;
            }
            return token.copy(tokenizationMethod);
        }

        @NotNull
        public final TokenizationMethod component1() {
            return this.tokenizationMethod;
        }

        @NotNull
        public final Token copy(@NotNull TokenizationMethod tokenizationMethod) {
            Intrinsics.checkNotNullParameter(tokenizationMethod, "tokenizationMethod");
            return new Token(tokenizationMethod);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Token) && Intrinsics.areEqual(this.tokenizationMethod, ((Token) obj).tokenizationMethod);
        }

        @NotNull
        public final TokenizationMethod getTokenizationMethod() {
            return this.tokenizationMethod;
        }

        public int hashCode() {
            return this.tokenizationMethod.hashCode();
        }

        @NotNull
        public String toString() {
            return "Token(tokenizationMethod=" + this.tokenizationMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ BackendType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    private BackendType(String str) {
        this.name = str;
    }
}