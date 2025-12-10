package co.omise.android.extensions;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason;", "", "()V", "Companion", "EmptyCardHolderName", "InvalidCardNumber", "InvalidExpirationDate", OpenTypeScript.UNKNOWN, "UnsupportedBrand", "Lco/omise/android/extensions/InvalidCardReason$EmptyCardHolderName;", "Lco/omise/android/extensions/InvalidCardReason$InvalidCardNumber;", "Lco/omise/android/extensions/InvalidCardReason$InvalidExpirationDate;", "Lco/omise/android/extensions/InvalidCardReason$Unknown;", "Lco/omise/android/extensions/InvalidCardReason$UnsupportedBrand;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public abstract class InvalidCardReason {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason$Companion;", "", "()V", "creator", "Lco/omise/android/extensions/InvalidCardReason;", "message", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InvalidCardReason creator(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (StringExtensionsKt.isContains(message, "number")) {
                return InvalidCardNumber.INSTANCE;
            }
            if (StringExtensionsKt.isContains(message, "expiration")) {
                return InvalidExpirationDate.INSTANCE;
            }
            if (StringExtensionsKt.isContains(message, "name")) {
                return EmptyCardHolderName.INSTANCE;
            }
            if (StringExtensionsKt.isContains(message, "brand")) {
                return UnsupportedBrand.INSTANCE;
            }
            return new Unknown(StringExtensionsKt.capitalizeFirstChar(message));
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason$EmptyCardHolderName;", "Lco/omise/android/extensions/InvalidCardReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class EmptyCardHolderName extends InvalidCardReason {
        @NotNull
        public static final EmptyCardHolderName INSTANCE = new EmptyCardHolderName();

        private EmptyCardHolderName() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason$InvalidCardNumber;", "Lco/omise/android/extensions/InvalidCardReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidCardNumber extends InvalidCardReason {
        @NotNull
        public static final InvalidCardNumber INSTANCE = new InvalidCardNumber();

        private InvalidCardNumber() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason$InvalidExpirationDate;", "Lco/omise/android/extensions/InvalidCardReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidExpirationDate extends InvalidCardReason {
        @NotNull
        public static final InvalidExpirationDate INSTANCE = new InvalidExpirationDate();

        private InvalidExpirationDate() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason$Unknown;", "Lco/omise/android/extensions/InvalidCardReason;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Unknown extends InvalidCardReason {
        @Nullable
        private final String message;

        public Unknown(@Nullable String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            return unknown.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final Unknown copy(@Nullable String str) {
            return new Unknown(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(this.message, ((Unknown) obj).message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Unknown(message=" + this.message + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/InvalidCardReason$UnsupportedBrand;", "Lco/omise/android/extensions/InvalidCardReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class UnsupportedBrand extends InvalidCardReason {
        @NotNull
        public static final UnsupportedBrand INSTANCE = new UnsupportedBrand();

        private UnsupportedBrand() {
            super(null);
        }
    }

    public /* synthetic */ InvalidCardReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InvalidCardReason() {
    }
}
