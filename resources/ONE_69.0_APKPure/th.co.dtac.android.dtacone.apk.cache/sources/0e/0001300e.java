package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "", "ESign", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen */
/* loaded from: classes10.dex */
public interface OneESignScreen {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "BlackList", "Consent", "ConsentTMN", "QRScan", "Signature", "Success", "TakePhoto", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign */
    /* loaded from: classes10.dex */
    public static final class ESign implements OneESignScreen {
        public static final int $stable = 0;
        @NotNull
        public static final ESign INSTANCE = new ESign();
        @NotNull
        public static final String ROUTE = "consent_e_sign";

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$BlackList;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$BlackList */
        /* loaded from: classes10.dex */
        public static final class BlackList implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final BlackList INSTANCE = new BlackList();
            @NotNull
            public static final String ROUTE = "consent_e_sign/black_list";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$Consent;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "route", "documentType", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$Consent */
        /* loaded from: classes10.dex */
        public static final class Consent implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Consent INSTANCE = new Consent();
            @NotNull
            public static final String ROUTE = "consent_e_sign/consent/{documentType}";

            @NotNull
            public final String route(@NotNull String documentType) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                return "consent_e_sign/consent/" + documentType;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$ConsentTMN;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$ConsentTMN */
        /* loaded from: classes10.dex */
        public static final class ConsentTMN implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final ConsentTMN INSTANCE = new ConsentTMN();
            @NotNull
            public static final String ROUTE = "consent_e_sign/consent_tmn";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$QRScan;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$QRScan */
        /* loaded from: classes10.dex */
        public static final class QRScan implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final QRScan INSTANCE = new QRScan();
            @NotNull
            public static final String ROUTE = "consent_e_sign/qr_scan";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$Signature;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$Signature */
        /* loaded from: classes10.dex */
        public static final class Signature implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Signature INSTANCE = new Signature();
            @NotNull
            public static final String ROUTE = "consent_e_sign/signature";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$Success;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$Success */
        /* loaded from: classes10.dex */
        public static final class Success implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Success INSTANCE = new Success();
            @NotNull
            public static final String ROUTE = "consent_e_sign/success";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen$ESign$TakePhoto;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneESignScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen$ESign$TakePhoto */
        /* loaded from: classes10.dex */
        public static final class TakePhoto implements OneESignScreen {
            public static final int $stable = 0;
            @NotNull
            public static final TakePhoto INSTANCE = new TakePhoto();
            @NotNull
            public static final String ROUTE = "consent_e_sign/take_photo";
        }
    }
}