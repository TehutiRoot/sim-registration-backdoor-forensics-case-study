package co.omise.android.models;

import android.annotation.SuppressLint;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0004\u0007\b\t\nB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m28850d2 = {"Lco/omise/android/models/TokenizationMethod;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Card", "Companion", "GooglePay", OpenTypeScript.UNKNOWN, "Lco/omise/android/models/TokenizationMethod$Card;", "Lco/omise/android/models/TokenizationMethod$GooglePay;", "Lco/omise/android/models/TokenizationMethod$Unknown;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public abstract class TokenizationMethod {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JsonValue
    @Nullable
    private final String name;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/TokenizationMethod$Card;", "Lco/omise/android/models/TokenizationMethod;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Card extends TokenizationMethod {
        @NotNull
        public static final Card INSTANCE = new Card();

        private Card() {
            super("card", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28850d2 = {"Lco/omise/android/models/TokenizationMethod$Companion;", "", "()V", "creator", "Lco/omise/android/models/TokenizationMethod;", "name", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JsonCreator
        @SuppressLint({"DefaultLocale"})
        @NotNull
        public final TokenizationMethod creator(@Nullable String str) {
            if (Intrinsics.areEqual(str, "card")) {
                return Card.INSTANCE;
            }
            if (Intrinsics.areEqual(str, "googlepay")) {
                return GooglePay.INSTANCE;
            }
            return new Unknown(str);
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/TokenizationMethod$GooglePay;", "Lco/omise/android/models/TokenizationMethod;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class GooglePay extends TokenizationMethod {
        @NotNull
        public static final GooglePay INSTANCE = new GooglePay();

        private GooglePay() {
            super("googlepay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/TokenizationMethod$Unknown;", "Lco/omise/android/models/TokenizationMethod;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Unknown extends TokenizationMethod {
        @Nullable
        private final String name;

        public Unknown(@Nullable String str) {
            super(str, null);
            this.name = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.getName();
            }
            return unknown.copy(str);
        }

        @Nullable
        public final String component1() {
            return getName();
        }

        @NotNull
        public final Unknown copy(@Nullable String str) {
            return new Unknown(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(getName(), ((Unknown) obj).getName());
        }

        @Override // co.omise.android.models.TokenizationMethod
        @Nullable
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            if (getName() == null) {
                return 0;
            }
            return getName().hashCode();
        }

        @NotNull
        public String toString() {
            return "Unknown(name=" + getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ TokenizationMethod(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    @JsonCreator
    @SuppressLint({"DefaultLocale"})
    @NotNull
    public static final TokenizationMethod creator(@Nullable String str) {
        return Companion.creator(str);
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    private TokenizationMethod(String str) {
        this.name = str;
    }
}
