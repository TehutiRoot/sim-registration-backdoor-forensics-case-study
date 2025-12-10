package co.omise.android.extensions;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode;", "", "()V", "AuthenticationFailure", "BadRequest", "Companion", "InvalidCard", "ServiceNotFound", OpenTypeScript.UNKNOWN, "Lco/omise/android/extensions/APIErrorCode$AuthenticationFailure;", "Lco/omise/android/extensions/APIErrorCode$BadRequest;", "Lco/omise/android/extensions/APIErrorCode$InvalidCard;", "Lco/omise/android/extensions/APIErrorCode$ServiceNotFound;", "Lco/omise/android/extensions/APIErrorCode$Unknown;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public abstract class APIErrorCode {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode$AuthenticationFailure;", "Lco/omise/android/extensions/APIErrorCode;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class AuthenticationFailure extends APIErrorCode {
        @NotNull
        public static final AuthenticationFailure INSTANCE = new AuthenticationFailure();

        private AuthenticationFailure() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode$BadRequest;", "Lco/omise/android/extensions/APIErrorCode;", "reasons", "", "Lco/omise/android/extensions/BadRequestReason;", "(Ljava/util/List;)V", "getReasons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class BadRequest extends APIErrorCode {
        @NotNull
        private final List<BadRequestReason> reasons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BadRequest(@NotNull List<? extends BadRequestReason> reasons) {
            super(null);
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            this.reasons = reasons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BadRequest copy$default(BadRequest badRequest, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = badRequest.reasons;
            }
            return badRequest.copy(list);
        }

        @NotNull
        public final List<BadRequestReason> component1() {
            return this.reasons;
        }

        @NotNull
        public final BadRequest copy(@NotNull List<? extends BadRequestReason> reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            return new BadRequest(reasons);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BadRequest) && Intrinsics.areEqual(this.reasons, ((BadRequest) obj).reasons);
        }

        @NotNull
        public final List<BadRequestReason> getReasons() {
            return this.reasons;
        }

        public int hashCode() {
            return this.reasons.hashCode();
        }

        @NotNull
        public String toString() {
            return "BadRequest(reasons=" + this.reasons + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode$Companion;", "", "()V", "creator", "Lco/omise/android/extensions/APIErrorCode;", "code", "", "message", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final APIErrorCode creator(@NotNull String code, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) message, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList<String> arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(split$default, 10));
            for (String str : split$default) {
                if (AbstractC20204hN1.startsWith$default(str, "and", false, 2, null)) {
                    str = AbstractC20204hN1.replaceFirst(str, "and", "", false);
                }
                arrayList.add(str);
            }
            ArrayList<String> arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
            for (String str2 : arrayList) {
                arrayList2.add(StringsKt__StringsKt.trim(str2).toString());
            }
            int hashCode = code.hashCode();
            if (hashCode != -1199193405) {
                if (hashCode != -301818356) {
                    if (hashCode != 526705752) {
                        if (hashCode == 1207582805 && code.equals("bad_request")) {
                            ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList2, 10));
                            for (String str3 : arrayList2) {
                                arrayList3.add(BadRequestReason.Companion.creator(str3));
                            }
                            return new BadRequest(arrayList3);
                        }
                    } else if (code.equals("invalid_card")) {
                        ArrayList arrayList4 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList2, 10));
                        for (String str4 : arrayList2) {
                            arrayList4.add(InvalidCardReason.Companion.creator(str4));
                        }
                        return new InvalidCard(arrayList4);
                    }
                } else if (code.equals("service_not_found")) {
                    return ServiceNotFound.INSTANCE;
                }
            } else if (code.equals("authentication_failure")) {
                return AuthenticationFailure.INSTANCE;
            }
            return new Unknown(code);
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode$InvalidCard;", "Lco/omise/android/extensions/APIErrorCode;", "reasons", "", "Lco/omise/android/extensions/InvalidCardReason;", "(Ljava/util/List;)V", "getReasons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class InvalidCard extends APIErrorCode {
        @NotNull
        private final List<InvalidCardReason> reasons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidCard(@NotNull List<? extends InvalidCardReason> reasons) {
            super(null);
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            this.reasons = reasons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvalidCard copy$default(InvalidCard invalidCard, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = invalidCard.reasons;
            }
            return invalidCard.copy(list);
        }

        @NotNull
        public final List<InvalidCardReason> component1() {
            return this.reasons;
        }

        @NotNull
        public final InvalidCard copy(@NotNull List<? extends InvalidCardReason> reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            return new InvalidCard(reasons);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidCard) && Intrinsics.areEqual(this.reasons, ((InvalidCard) obj).reasons);
        }

        @NotNull
        public final List<InvalidCardReason> getReasons() {
            return this.reasons;
        }

        public int hashCode() {
            return this.reasons.hashCode();
        }

        @NotNull
        public String toString() {
            return "InvalidCard(reasons=" + this.reasons + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode$ServiceNotFound;", "Lco/omise/android/extensions/APIErrorCode;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class ServiceNotFound extends APIErrorCode {
        @NotNull
        public static final ServiceNotFound INSTANCE = new ServiceNotFound();

        private ServiceNotFound() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/extensions/APIErrorCode$Unknown;", "Lco/omise/android/extensions/APIErrorCode;", "code", "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Unknown extends APIErrorCode {
        @Nullable
        private final String code;

        public Unknown(@Nullable String str) {
            super(null);
            this.code = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.code;
            }
            return unknown.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.code;
        }

        @NotNull
        public final Unknown copy(@Nullable String str) {
            return new Unknown(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(this.code, ((Unknown) obj).code);
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            String str = this.code;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Unknown(code=" + this.code + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ APIErrorCode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private APIErrorCode() {
    }
}
