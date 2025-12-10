package co.omise.android.extensions;

import androidx.autofill.HintConstants;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason;", "", "()V", "AmountIsGreaterThanValidAmount", "AmountIsLessThanValidAmount", "Companion", "CurrencyNotSupported", "EmptyName", "InvalidCurrency", "InvalidEmail", "InvalidName", "InvalidPhoneNumber", "NameIsTooLong", "SourceTypeNotSupported", OpenTypeScript.UNKNOWN, "Lco/omise/android/extensions/BadRequestReason$AmountIsGreaterThanValidAmount;", "Lco/omise/android/extensions/BadRequestReason$AmountIsLessThanValidAmount;", "Lco/omise/android/extensions/BadRequestReason$CurrencyNotSupported;", "Lco/omise/android/extensions/BadRequestReason$EmptyName;", "Lco/omise/android/extensions/BadRequestReason$InvalidCurrency;", "Lco/omise/android/extensions/BadRequestReason$InvalidEmail;", "Lco/omise/android/extensions/BadRequestReason$InvalidName;", "Lco/omise/android/extensions/BadRequestReason$InvalidPhoneNumber;", "Lco/omise/android/extensions/BadRequestReason$NameIsTooLong;", "Lco/omise/android/extensions/BadRequestReason$SourceTypeNotSupported;", "Lco/omise/android/extensions/BadRequestReason$Unknown;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public abstract class BadRequestReason {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Regex amountAtLeastValidAmountErrorMessageRegex = new Regex("amount must be at least (\\d+)(\\s)?(([a-zA-Z]{3})?)");
    @NotNull
    private static final Regex amountLessThanValidAmountErrorMessageRegex = new Regex("amount must be greater than (\\d+)(\\s)?(([a-zA-Z]{3})?)");
    @NotNull
    private static final Regex amountGreaterThanValidAmountErrorMessageRegex = new Regex("amount must be less than (\\d+)(\\s)?(([a-zA-Z]{3})?)");
    @NotNull
    private static final Regex nameIsTooLongErrorMessageRegex = new Regex("name is too long \\(maximum is (\\d+) characters\\)");

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$AmountIsGreaterThanValidAmount;", "Lco/omise/android/extensions/BadRequestReason;", "validAmount", "", FirebaseAnalytics.Param.CURRENCY, "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getValidAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lco/omise/android/extensions/BadRequestReason$AmountIsGreaterThanValidAmount;", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class AmountIsGreaterThanValidAmount extends BadRequestReason {
        @Nullable
        private final String currency;
        @Nullable
        private final Long validAmount;

        public AmountIsGreaterThanValidAmount() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ AmountIsGreaterThanValidAmount copy$default(AmountIsGreaterThanValidAmount amountIsGreaterThanValidAmount, Long l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                l = amountIsGreaterThanValidAmount.validAmount;
            }
            if ((i & 2) != 0) {
                str = amountIsGreaterThanValidAmount.currency;
            }
            return amountIsGreaterThanValidAmount.copy(l, str);
        }

        @Nullable
        public final Long component1() {
            return this.validAmount;
        }

        @Nullable
        public final String component2() {
            return this.currency;
        }

        @NotNull
        public final AmountIsGreaterThanValidAmount copy(@Nullable Long l, @Nullable String str) {
            return new AmountIsGreaterThanValidAmount(l, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AmountIsGreaterThanValidAmount) {
                AmountIsGreaterThanValidAmount amountIsGreaterThanValidAmount = (AmountIsGreaterThanValidAmount) obj;
                return Intrinsics.areEqual(this.validAmount, amountIsGreaterThanValidAmount.validAmount) && Intrinsics.areEqual(this.currency, amountIsGreaterThanValidAmount.currency);
            }
            return false;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final Long getValidAmount() {
            return this.validAmount;
        }

        public int hashCode() {
            Long l = this.validAmount;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.currency;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AmountIsGreaterThanValidAmount(validAmount=" + this.validAmount + ", currency=" + this.currency + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ AmountIsGreaterThanValidAmount(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
        }

        public AmountIsGreaterThanValidAmount(@Nullable Long l, @Nullable String str) {
            super(null);
            this.validAmount = l;
            this.currency = str;
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$AmountIsLessThanValidAmount;", "Lco/omise/android/extensions/BadRequestReason;", "validAmount", "", FirebaseAnalytics.Param.CURRENCY, "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getValidAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lco/omise/android/extensions/BadRequestReason$AmountIsLessThanValidAmount;", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class AmountIsLessThanValidAmount extends BadRequestReason {
        @Nullable
        private final String currency;
        @Nullable
        private final Long validAmount;

        public AmountIsLessThanValidAmount() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ AmountIsLessThanValidAmount copy$default(AmountIsLessThanValidAmount amountIsLessThanValidAmount, Long l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                l = amountIsLessThanValidAmount.validAmount;
            }
            if ((i & 2) != 0) {
                str = amountIsLessThanValidAmount.currency;
            }
            return amountIsLessThanValidAmount.copy(l, str);
        }

        @Nullable
        public final Long component1() {
            return this.validAmount;
        }

        @Nullable
        public final String component2() {
            return this.currency;
        }

        @NotNull
        public final AmountIsLessThanValidAmount copy(@Nullable Long l, @Nullable String str) {
            return new AmountIsLessThanValidAmount(l, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AmountIsLessThanValidAmount) {
                AmountIsLessThanValidAmount amountIsLessThanValidAmount = (AmountIsLessThanValidAmount) obj;
                return Intrinsics.areEqual(this.validAmount, amountIsLessThanValidAmount.validAmount) && Intrinsics.areEqual(this.currency, amountIsLessThanValidAmount.currency);
            }
            return false;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final Long getValidAmount() {
            return this.validAmount;
        }

        public int hashCode() {
            Long l = this.validAmount;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.currency;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AmountIsLessThanValidAmount(validAmount=" + this.validAmount + ", currency=" + this.currency + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ AmountIsLessThanValidAmount(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
        }

        public AmountIsLessThanValidAmount(@Nullable Long l, @Nullable String str) {
            super(null);
            this.validAmount = l;
            this.currency = str;
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$Companion;", "", "()V", "amountAtLeastValidAmountErrorMessageRegex", "Lkotlin/text/Regex;", "amountGreaterThanValidAmountErrorMessageRegex", "amountLessThanValidAmountErrorMessageRegex", "nameIsTooLongErrorMessageRegex", "creator", "Lco/omise/android/extensions/BadRequestReason;", "message", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BadRequestReason creator(@NotNull String message) {
            BadRequestReason unknown;
            Long l;
            Long l2;
            Long l3;
            Intrinsics.checkNotNullParameter(message, "message");
            if (StringExtensionsKt.isContains(message, "currency must be")) {
                return InvalidCurrency.INSTANCE;
            }
            String str = null;
            if (StringExtensionsKt.isContains(message, "amount must be")) {
                if (BadRequestReason.amountAtLeastValidAmountErrorMessageRegex.matches(message)) {
                    List<String> groupValues = ((MatchResult) SequencesKt___SequencesKt.toList(Regex.findAll$default(BadRequestReason.amountAtLeastValidAmountErrorMessageRegex, message, 0, 2, null)).get(0)).getGroupValues();
                    String str2 = (String) CollectionsKt___CollectionsKt.getOrNull(groupValues, 1);
                    if (str2 != null) {
                        l3 = Long.valueOf(Long.parseLong(str2));
                    } else {
                        l3 = null;
                    }
                    String str3 = groupValues.get(3);
                    if (str3.length() != 0) {
                        str = str3;
                    }
                    return new AmountIsLessThanValidAmount(l3, str);
                } else if (BadRequestReason.amountLessThanValidAmountErrorMessageRegex.matches(message)) {
                    List<String> groupValues2 = ((MatchResult) SequencesKt___SequencesKt.toList(Regex.findAll$default(BadRequestReason.amountLessThanValidAmountErrorMessageRegex, message, 0, 2, null)).get(0)).getGroupValues();
                    String str4 = (String) CollectionsKt___CollectionsKt.getOrNull(groupValues2, 1);
                    if (str4 != null) {
                        l2 = Long.valueOf(Long.parseLong(str4));
                    } else {
                        l2 = null;
                    }
                    String str5 = groupValues2.get(3);
                    if (str5.length() != 0) {
                        str = str5;
                    }
                    return new AmountIsLessThanValidAmount(l2, str);
                } else if (BadRequestReason.amountGreaterThanValidAmountErrorMessageRegex.matches(message)) {
                    List<String> groupValues3 = ((MatchResult) SequencesKt___SequencesKt.toList(Regex.findAll$default(BadRequestReason.amountGreaterThanValidAmountErrorMessageRegex, message, 0, 2, null)).get(0)).getGroupValues();
                    String str6 = (String) CollectionsKt___CollectionsKt.getOrNull(groupValues3, 1);
                    if (str6 != null) {
                        l = Long.valueOf(Long.parseLong(str6));
                    } else {
                        l = null;
                    }
                    String str7 = groupValues3.get(3);
                    if (str7.length() != 0) {
                        str = str7;
                    }
                    return new AmountIsGreaterThanValidAmount(l, str);
                } else {
                    unknown = new Unknown(StringExtensionsKt.capitalizeFirstChar(message));
                }
            } else if (StringExtensionsKt.isContains(message, "source type")) {
                return SourceTypeNotSupported.INSTANCE;
            } else {
                if (StringExtensionsKt.isContains(message, FirebaseAnalytics.Param.CURRENCY)) {
                    return CurrencyNotSupported.INSTANCE;
                }
                if (StringExtensionsKt.isContains(message, "name") && StringExtensionsKt.isContains(message, "blank")) {
                    return EmptyName.INSTANCE;
                }
                if (AbstractC20204hN1.startsWith$default(message, "name is too long", false, 2, null)) {
                    unknown = new NameIsTooLong(Integer.parseInt(((MatchResult) SequencesKt___SequencesKt.toList(Regex.findAll$default(BadRequestReason.nameIsTooLongErrorMessageRegex, message, 0, 2, null)).get(0)).getGroupValues().get(1)));
                } else if (StringExtensionsKt.isContains(message, "name")) {
                    return InvalidName.INSTANCE;
                } else {
                    if (StringExtensionsKt.isContains(message, "email")) {
                        return InvalidEmail.INSTANCE;
                    }
                    if (StringExtensionsKt.isContains(message, HintConstants.AUTOFILL_HINT_PHONE)) {
                        return InvalidPhoneNumber.INSTANCE;
                    }
                    unknown = new Unknown(StringExtensionsKt.capitalizeFirstChar(message));
                }
            }
            return unknown;
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$CurrencyNotSupported;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class CurrencyNotSupported extends BadRequestReason {
        @NotNull
        public static final CurrencyNotSupported INSTANCE = new CurrencyNotSupported();

        private CurrencyNotSupported() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$EmptyName;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class EmptyName extends BadRequestReason {
        @NotNull
        public static final EmptyName INSTANCE = new EmptyName();

        private EmptyName() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$InvalidCurrency;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidCurrency extends BadRequestReason {
        @NotNull
        public static final InvalidCurrency INSTANCE = new InvalidCurrency();

        private InvalidCurrency() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$InvalidEmail;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidEmail extends BadRequestReason {
        @NotNull
        public static final InvalidEmail INSTANCE = new InvalidEmail();

        private InvalidEmail() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$InvalidName;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidName extends BadRequestReason {
        @NotNull
        public static final InvalidName INSTANCE = new InvalidName();

        private InvalidName() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$InvalidPhoneNumber;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidPhoneNumber extends BadRequestReason {
        @NotNull
        public static final InvalidPhoneNumber INSTANCE = new InvalidPhoneNumber();

        private InvalidPhoneNumber() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$NameIsTooLong;", "Lco/omise/android/extensions/BadRequestReason;", "maximum", "", "(I)V", "getMaximum", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class NameIsTooLong extends BadRequestReason {
        private final int maximum;

        public NameIsTooLong(int i) {
            super(null);
            this.maximum = i;
        }

        public static /* synthetic */ NameIsTooLong copy$default(NameIsTooLong nameIsTooLong, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nameIsTooLong.maximum;
            }
            return nameIsTooLong.copy(i);
        }

        public final int component1() {
            return this.maximum;
        }

        @NotNull
        public final NameIsTooLong copy(int i) {
            return new NameIsTooLong(i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameIsTooLong) && this.maximum == ((NameIsTooLong) obj).maximum;
        }

        public final int getMaximum() {
            return this.maximum;
        }

        public int hashCode() {
            return this.maximum;
        }

        @NotNull
        public String toString() {
            return "NameIsTooLong(maximum=" + this.maximum + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$SourceTypeNotSupported;", "Lco/omise/android/extensions/BadRequestReason;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class SourceTypeNotSupported extends BadRequestReason {
        @NotNull
        public static final SourceTypeNotSupported INSTANCE = new SourceTypeNotSupported();

        private SourceTypeNotSupported() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/extensions/BadRequestReason$Unknown;", "Lco/omise/android/extensions/BadRequestReason;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Unknown extends BadRequestReason {
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

    public /* synthetic */ BadRequestReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BadRequestReason() {
    }
}
