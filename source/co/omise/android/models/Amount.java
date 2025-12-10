package co.omise.android.models;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0005J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m28850d2 = {"Lco/omise/android/models/Amount;", "", "amount", "", FirebaseAnalytics.Param.CURRENCY, "", "(JLjava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "localAmount", "", "getLocalAmount", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toAmountString", "toString", "decimalPlaces", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Amount {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long amount;
    @NotNull
    private final String currency;

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m28850d2 = {"Lco/omise/android/models/Amount$Companion;", "", "()V", "fromLocalAmount", "Lco/omise/android/models/Amount;", "localAMount", "", FirebaseAnalytics.Param.CURRENCY, "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Amount fromLocalAmount(double d, @NotNull String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            if (!Intrinsics.areEqual(currency, "jpy")) {
                d *= 100;
            }
            return new Amount((long) d, currency);
        }

        private Companion() {
        }
    }

    public Amount(long j, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = j;
        this.currency = currency;
    }

    public static /* synthetic */ Amount copy$default(Amount amount, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = amount.amount;
        }
        if ((i & 2) != 0) {
            str = amount.currency;
        }
        return amount.copy(j, str);
    }

    @JvmStatic
    @NotNull
    public static final Amount fromLocalAmount(double d, @NotNull String str) {
        return Companion.fromLocalAmount(d, str);
    }

    private final double getLocalAmount() {
        String lowerCase = this.currency.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (Intrinsics.areEqual(lowerCase, "jpy")) {
            return this.amount;
        }
        return this.amount / 100.0d;
    }

    public final long component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.currency;
    }

    @NotNull
    public final Amount copy(long j, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new Amount(j, currency);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Amount) {
            Amount amount = (Amount) obj;
            return this.amount == amount.amount && Intrinsics.areEqual(this.currency, amount.currency);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AbstractC17792Ig1.m67882a(this.amount) * 31) + this.currency.hashCode();
    }

    @NotNull
    public final String toAmountString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getLocalAmount());
        sb.append(TokenParser.f74560SP);
        String upperCase = this.currency.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append(upperCase);
        return sb.toString();
    }

    @NotNull
    public String toString() {
        return "Amount(amount=" + this.amount + ", currency=" + this.currency + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @NotNull
    public final String toString(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%." + i + 'f', Arrays.copyOf(new Object[]{Double.valueOf(getLocalAmount())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
