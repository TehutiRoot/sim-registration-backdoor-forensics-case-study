package co.omise.android.p009ui;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentResult;", "Landroid/os/Parcelable;", "()V", "Failure", "ThreeDS1Completed", "ThreeDS2Completed", "Lco/omise/android/ui/AuthorizingPaymentResult$Failure;", "Lco/omise/android/ui/AuthorizingPaymentResult$ThreeDS1Completed;", "Lco/omise/android/ui/AuthorizingPaymentResult$ThreeDS2Completed;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.AuthorizingPaymentResult */
/* loaded from: classes3.dex */
public abstract class AuthorizingPaymentResult implements Parcelable {

    @Parcelize
    @Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentResult$Failure;", "Lco/omise/android/ui/AuthorizingPaymentResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.AuthorizingPaymentResult$Failure */
    /* loaded from: classes3.dex */
    public static final class Failure extends AuthorizingPaymentResult {
        @NotNull
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        @NotNull
        private final Throwable throwable;

        @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* renamed from: co.omise.android.ui.AuthorizingPaymentResult$Failure$Creator */
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Failure createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th2, int i, Object obj) {
            if ((i & 1) != 0) {
                th2 = failure.throwable;
            }
            return failure.copy(th2);
        }

        @NotNull
        public final Throwable component1() {
            return this.throwable;
        }

        @NotNull
        public final Failure copy(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) obj).throwable);
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(throwable=" + this.throwable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeSerializable(this.throwable);
        }
    }

    @Parcelize
    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentResult$ThreeDS1Completed;", "Lco/omise/android/ui/AuthorizingPaymentResult;", "returnedUrl", "", "(Ljava/lang/String;)V", "getReturnedUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.AuthorizingPaymentResult$ThreeDS1Completed */
    /* loaded from: classes3.dex */
    public static final class ThreeDS1Completed extends AuthorizingPaymentResult {
        @NotNull
        public static final Parcelable.Creator<ThreeDS1Completed> CREATOR = new Creator();
        @NotNull
        private final String returnedUrl;

        @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* renamed from: co.omise.android.ui.AuthorizingPaymentResult$ThreeDS1Completed$Creator */
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<ThreeDS1Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ThreeDS1Completed createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDS1Completed(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ThreeDS1Completed[] newArray(int i) {
                return new ThreeDS1Completed[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDS1Completed(@NotNull String returnedUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(returnedUrl, "returnedUrl");
            this.returnedUrl = returnedUrl;
        }

        public static /* synthetic */ ThreeDS1Completed copy$default(ThreeDS1Completed threeDS1Completed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = threeDS1Completed.returnedUrl;
            }
            return threeDS1Completed.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.returnedUrl;
        }

        @NotNull
        public final ThreeDS1Completed copy(@NotNull String returnedUrl) {
            Intrinsics.checkNotNullParameter(returnedUrl, "returnedUrl");
            return new ThreeDS1Completed(returnedUrl);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ThreeDS1Completed) && Intrinsics.areEqual(this.returnedUrl, ((ThreeDS1Completed) obj).returnedUrl);
        }

        @NotNull
        public final String getReturnedUrl() {
            return this.returnedUrl;
        }

        public int hashCode() {
            return this.returnedUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return "ThreeDS1Completed(returnedUrl=" + this.returnedUrl + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.returnedUrl);
        }
    }

    @Parcelize
    @Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentResult$ThreeDS2Completed;", "Lco/omise/android/ui/AuthorizingPaymentResult;", "transStatus", "Lco/omise/android/ui/TransactionStatus;", "(Lco/omise/android/ui/TransactionStatus;)V", "getTransStatus", "()Lco/omise/android/ui/TransactionStatus;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.AuthorizingPaymentResult$ThreeDS2Completed */
    /* loaded from: classes3.dex */
    public static final class ThreeDS2Completed extends AuthorizingPaymentResult {
        @NotNull
        public static final Parcelable.Creator<ThreeDS2Completed> CREATOR = new Creator();
        @NotNull
        private final TransactionStatus transStatus;

        @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* renamed from: co.omise.android.ui.AuthorizingPaymentResult$ThreeDS2Completed$Creator */
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<ThreeDS2Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ThreeDS2Completed createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDS2Completed(TransactionStatus.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ThreeDS2Completed[] newArray(int i) {
                return new ThreeDS2Completed[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDS2Completed(@NotNull TransactionStatus transStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(transStatus, "transStatus");
            this.transStatus = transStatus;
        }

        public static /* synthetic */ ThreeDS2Completed copy$default(ThreeDS2Completed threeDS2Completed, TransactionStatus transactionStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionStatus = threeDS2Completed.transStatus;
            }
            return threeDS2Completed.copy(transactionStatus);
        }

        @NotNull
        public final TransactionStatus component1() {
            return this.transStatus;
        }

        @NotNull
        public final ThreeDS2Completed copy(@NotNull TransactionStatus transStatus) {
            Intrinsics.checkNotNullParameter(transStatus, "transStatus");
            return new ThreeDS2Completed(transStatus);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ThreeDS2Completed) && this.transStatus == ((ThreeDS2Completed) obj).transStatus;
        }

        @NotNull
        public final TransactionStatus getTransStatus() {
            return this.transStatus;
        }

        public int hashCode() {
            return this.transStatus.hashCode();
        }

        @NotNull
        public String toString() {
            return "ThreeDS2Completed(transStatus=" + this.transStatus + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.transStatus.name());
        }
    }

    public /* synthetic */ AuthorizingPaymentResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AuthorizingPaymentResult() {
    }
}
