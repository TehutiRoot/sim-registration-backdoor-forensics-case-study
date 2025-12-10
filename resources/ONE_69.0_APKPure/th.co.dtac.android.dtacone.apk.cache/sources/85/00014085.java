package th.p047co.dtac.android.dtacone.view.appOne.tol.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.register_true_online.RegisterTrueOnlineMixpanel;

@Metadata(m29143d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001.\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "", "Tol", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort$AppointmentPrimary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort$AppointmentSecondary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort$Checking;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Consent;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Consent$NonTelco;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Consent$TMN;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Device;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Discount;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Discount$Contract;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Discount$Select;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$MarketingCodeSelect;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$NumberSelect;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$OneTimeCharge;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$PackageSelect;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$InputIdCard;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$InputInformation;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation$AppointmentPrimary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation$AppointmentSecondary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation$Contact;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$PaymentSummary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Review;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Review$Information;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Review$TakePhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectGisLocation;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber$FixedLinePlus;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber$TrueMoveH;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber$TrueVisions;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectProductType;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Signature;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Signature$DocumentPreview;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Signature$DocumentSign;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Success;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto$FaceRecognition;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto$IdCard;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto$Optional;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$CampaignSelection;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$FeeInfo;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$MarketingCodeSelection;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$SmartSearch;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen */
/* loaded from: classes10.dex */
public interface OneTolScreen {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001:\u0011\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "CheckPort", "Consent", "Device", RegisterTrueOnlineMixpanel.ACTION_DISCOUNT, "FixedLinePlus", "InputIdCard", "InputInformation", "Installation", "PaymentSummary", "Review", "SelectGisLocation", "SelectNumber", "SelectProductType", "Signature", "Success", "TakePhoto", "TolPackage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol */
    /* loaded from: classes10.dex */
    public static final class Tol implements OneTolScreen {
        public static final int $stable = 0;
        @NotNull
        public static final Tol INSTANCE = new Tol();
        @NotNull
        public static final String ROUTE = "register_true_online";

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "AppointmentPrimary", "AppointmentSecondary", "Checking", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$CheckPort */
        /* loaded from: classes10.dex */
        public static final class CheckPort implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final CheckPort INSTANCE = new CheckPort();
            @NotNull
            public static final String ROUTE = "register_true_online/check_port";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort$AppointmentPrimary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$CheckPort$AppointmentPrimary */
            /* loaded from: classes10.dex */
            public static final class AppointmentPrimary implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final AppointmentPrimary INSTANCE = new AppointmentPrimary();
                @NotNull
                public static final String ROUTE = "register_true_online/check_port/select_primary_appointment";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort$AppointmentSecondary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$CheckPort$AppointmentSecondary */
            /* loaded from: classes10.dex */
            public static final class AppointmentSecondary implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final AppointmentSecondary INSTANCE = new AppointmentSecondary();
                @NotNull
                public static final String ROUTE = "register_true_online/check_port/select_secondary_appointment";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$CheckPort$Checking;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$CheckPort$Checking */
            /* loaded from: classes10.dex */
            public static final class Checking implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final Checking INSTANCE = new Checking();
                @NotNull
                public static final String ROUTE = "register_true_online/check_port/checking";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Consent;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "NonTelco", Constant.ConsentDomain.TMN, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Consent */
        /* loaded from: classes10.dex */
        public static final class Consent implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Consent INSTANCE = new Consent();
            @NotNull
            public static final String ROUTE = "register_true_online/consent";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Consent$NonTelco;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Consent$NonTelco */
            /* loaded from: classes10.dex */
            public static final class NonTelco implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final NonTelco INSTANCE = new NonTelco();
                @NotNull
                public static final String ROUTE = "register_true_online/consent/non_telco";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Consent$TMN;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Consent$TMN */
            /* loaded from: classes10.dex */
            public static final class TMN implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final TMN INSTANCE = new TMN();
                @NotNull
                public static final String ROUTE = "register_true_online/consent/tmn";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Device;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Device */
        /* loaded from: classes10.dex */
        public static final class Device implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Device INSTANCE = new Device();
            @NotNull
            public static final String ROUTE = "register_true_online/device";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Discount;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "Contract", "Select", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Discount */
        /* loaded from: classes10.dex */
        public static final class Discount implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Discount INSTANCE = new Discount();
            @NotNull
            public static final String ROUTE = "register_true_online/discount";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Discount$Contract;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Discount$Contract */
            /* loaded from: classes10.dex */
            public static final class Contract implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final Contract INSTANCE = new Contract();
                @NotNull
                public static final String ROUTE = "register_true_online/discount/contract";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Discount$Select;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Discount$Select */
            /* loaded from: classes10.dex */
            public static final class Select implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final Select INSTANCE = new Select();
                @NotNull
                public static final String ROUTE = "register_true_online/discount/select";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "MarketingCodeSelect", "NumberSelect", "OneTimeCharge", "PackageSelect", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$FixedLinePlus */
        /* loaded from: classes10.dex */
        public static final class FixedLinePlus implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final FixedLinePlus INSTANCE = new FixedLinePlus();
            @NotNull
            public static final String ROUTE = "register_true_online/fixed_line_plus";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$MarketingCodeSelect;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "createRoute", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/Integer;)Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$FixedLinePlus$MarketingCodeSelect */
            /* loaded from: classes10.dex */
            public static final class MarketingCodeSelect implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final MarketingCodeSelect INSTANCE = new MarketingCodeSelect();
                @NotNull
                public static final String ROUTE = "register_true_online/fixed_line_plus/marketing_code_select/{index}";

                public static /* synthetic */ String createRoute$default(MarketingCodeSelect marketingCodeSelect, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        num = null;
                    }
                    return marketingCodeSelect.createRoute(num);
                }

                @NotNull
                public final String createRoute(@Nullable Integer num) {
                    if (num == null) {
                        return "register_true_online/fixed_line_plus/marketing_code_select/";
                    }
                    return "register_true_online/fixed_line_plus/marketing_code_select/" + num;
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$NumberSelect;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "createRoute", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/Integer;)Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$FixedLinePlus$NumberSelect */
            /* loaded from: classes10.dex */
            public static final class NumberSelect implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final NumberSelect INSTANCE = new NumberSelect();
                @NotNull
                public static final String ROUTE = "register_true_online/fixed_line_plus/number_select/{index}";

                public static /* synthetic */ String createRoute$default(NumberSelect numberSelect, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        num = null;
                    }
                    return numberSelect.createRoute(num);
                }

                @NotNull
                public final String createRoute(@Nullable Integer num) {
                    if (num == null) {
                        return "register_true_online/fixed_line_plus/number_select/";
                    }
                    return "register_true_online/fixed_line_plus/number_select/" + num;
                }
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$OneTimeCharge;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$FixedLinePlus$OneTimeCharge */
            /* loaded from: classes10.dex */
            public static final class OneTimeCharge implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final OneTimeCharge INSTANCE = new OneTimeCharge();
                @NotNull
                public static final String ROUTE = "register_true_online/fixed_line_plus/one_time_charge";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$FixedLinePlus$PackageSelect;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "createRoute", FirebaseAnalytics.Param.INDEX, "", "(Ljava/lang/Integer;)Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$FixedLinePlus$PackageSelect */
            /* loaded from: classes10.dex */
            public static final class PackageSelect implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final PackageSelect INSTANCE = new PackageSelect();
                @NotNull
                public static final String ROUTE = "register_true_online/fixed_line_plus/package_select/{index}";

                public static /* synthetic */ String createRoute$default(PackageSelect packageSelect, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        num = null;
                    }
                    return packageSelect.createRoute(num);
                }

                @NotNull
                public final String createRoute(@Nullable Integer num) {
                    if (num == null) {
                        return "register_true_online/fixed_line_plus/package_select/";
                    }
                    return "register_true_online/fixed_line_plus/package_select/" + num;
                }
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$InputIdCard;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$InputIdCard */
        /* loaded from: classes10.dex */
        public static final class InputIdCard implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final InputIdCard INSTANCE = new InputIdCard();
            @NotNull
            public static final String ROUTE = "register_true_online/input_id_card";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$InputInformation;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$InputInformation */
        /* loaded from: classes10.dex */
        public static final class InputInformation implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final InputInformation INSTANCE = new InputInformation();
            @NotNull
            public static final String ROUTE = "register_true_online/input_information";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "AppointmentPrimary", "AppointmentSecondary", "Contact", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Installation */
        /* loaded from: classes10.dex */
        public static final class Installation implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Installation INSTANCE = new Installation();
            @NotNull
            public static final String ROUTE = "register_true_online/installation";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation$AppointmentPrimary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Installation$AppointmentPrimary */
            /* loaded from: classes10.dex */
            public static final class AppointmentPrimary implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final AppointmentPrimary INSTANCE = new AppointmentPrimary();
                @NotNull
                public static final String ROUTE = "register_true_online/installation/appointment_primary";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation$AppointmentSecondary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Installation$AppointmentSecondary */
            /* loaded from: classes10.dex */
            public static final class AppointmentSecondary implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final AppointmentSecondary INSTANCE = new AppointmentSecondary();
                @NotNull
                public static final String ROUTE = "register_true_online/installation/appointment_secondary";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Installation$Contact;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Installation$Contact */
            /* loaded from: classes10.dex */
            public static final class Contact implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final Contact INSTANCE = new Contact();
                @NotNull
                public static final String ROUTE = "register_true_online/installation/contact";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$PaymentSummary;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$PaymentSummary */
        /* loaded from: classes10.dex */
        public static final class PaymentSummary implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final PaymentSummary INSTANCE = new PaymentSummary();
            @NotNull
            public static final String ROUTE = "register_true_online/payment_summary";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Review;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "Information", "TakePhoto", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Review */
        /* loaded from: classes10.dex */
        public static final class Review implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Review INSTANCE = new Review();
            @NotNull
            public static final String ROUTE = "register_true_online/review";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Review$Information;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Review$Information */
            /* loaded from: classes10.dex */
            public static final class Information implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final Information INSTANCE = new Information();
                @NotNull
                public static final String ROUTE = "register_true_online/review/information";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Review$TakePhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Review$TakePhoto */
            /* loaded from: classes10.dex */
            public static final class TakePhoto implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final TakePhoto INSTANCE = new TakePhoto();
                @NotNull
                public static final String ROUTE = "register_true_online/review/take_photo";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectGisLocation;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$SelectGisLocation */
        /* loaded from: classes10.dex */
        public static final class SelectGisLocation implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final SelectGisLocation INSTANCE = new SelectGisLocation();
            @NotNull
            public static final String ROUTE = "register_true_online/select_gis_location";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "FixedLinePlus", "TrueMoveH", "TrueVisions", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$SelectNumber */
        /* loaded from: classes10.dex */
        public static final class SelectNumber implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final SelectNumber INSTANCE = new SelectNumber();
            @NotNull
            public static final String ROUTE = "register_true_online/select_number";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber$FixedLinePlus;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$SelectNumber$FixedLinePlus */
            /* loaded from: classes10.dex */
            public static final class FixedLinePlus implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final FixedLinePlus INSTANCE = new FixedLinePlus();
                @NotNull
                public static final String ROUTE = "register_true_online/select_number/fixed_line_plus";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber$TrueMoveH;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$SelectNumber$TrueMoveH */
            /* loaded from: classes10.dex */
            public static final class TrueMoveH implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final TrueMoveH INSTANCE = new TrueMoveH();
                @NotNull
                public static final String ROUTE = "register_true_online/select_number/true_move_h";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectNumber$TrueVisions;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$SelectNumber$TrueVisions */
            /* loaded from: classes10.dex */
            public static final class TrueVisions implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final TrueVisions INSTANCE = new TrueVisions();
                @NotNull
                public static final String ROUTE = "register_true_online/select_number/true_visions";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$SelectProductType;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$SelectProductType */
        /* loaded from: classes10.dex */
        public static final class SelectProductType implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final SelectProductType INSTANCE = new SelectProductType();
            @NotNull
            public static final String ROUTE = "register_true_online/select_product_type";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Signature;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "DocumentPreview", "DocumentSign", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Signature */
        /* loaded from: classes10.dex */
        public static final class Signature implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Signature INSTANCE = new Signature();
            @NotNull
            public static final String ROUTE = "register_true_online/signature";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Signature$DocumentPreview;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Signature$DocumentPreview */
            /* loaded from: classes10.dex */
            public static final class DocumentPreview implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final DocumentPreview INSTANCE = new DocumentPreview();
                @NotNull
                public static final String ROUTE = "register_true_online/signature/document_preview";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Signature$DocumentSign;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Signature$DocumentSign */
            /* loaded from: classes10.dex */
            public static final class DocumentSign implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final DocumentSign INSTANCE = new DocumentSign();
                @NotNull
                public static final String ROUTE = "register_true_online/signature/document_sign";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$Success;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$Success */
        /* loaded from: classes10.dex */
        public static final class Success implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final Success INSTANCE = new Success();
            @NotNull
            public static final String ROUTE = "register_true_online/success";
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "FaceRecognition", "IdCard", "Optional", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TakePhoto */
        /* loaded from: classes10.dex */
        public static final class TakePhoto implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final TakePhoto INSTANCE = new TakePhoto();
            @NotNull
            public static final String ROUTE = "register_true_online/take_photo";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto$FaceRecognition;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TakePhoto$FaceRecognition */
            /* loaded from: classes10.dex */
            public static final class FaceRecognition implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final FaceRecognition INSTANCE = new FaceRecognition();
                @NotNull
                public static final String ROUTE = "register_true_online/take_photo/face_recognition";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto$IdCard;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TakePhoto$IdCard */
            /* loaded from: classes10.dex */
            public static final class IdCard implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final IdCard INSTANCE = new IdCard();
                @NotNull
                public static final String ROUTE = "register_true_online/take_photo/id_card";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TakePhoto$Optional;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TakePhoto$Optional */
            /* loaded from: classes10.dex */
            public static final class Optional implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final Optional INSTANCE = new Optional();
                @NotNull
                public static final String ROUTE = "register_true_online/take_photo/optional";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "CampaignSelection", "FeeInfo", "MarketingCodeSelection", "SmartSearch", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TolPackage */
        /* loaded from: classes10.dex */
        public static final class TolPackage implements OneTolScreen {
            public static final int $stable = 0;
            @NotNull
            public static final TolPackage INSTANCE = new TolPackage();
            @NotNull
            public static final String ROUTE = "register_true_online/tol_package";

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$CampaignSelection;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TolPackage$CampaignSelection */
            /* loaded from: classes10.dex */
            public static final class CampaignSelection implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final CampaignSelection INSTANCE = new CampaignSelection();
                @NotNull
                public static final String ROUTE = "register_true_online/tol_package/campaign_selection";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$FeeInfo;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TolPackage$FeeInfo */
            /* loaded from: classes10.dex */
            public static final class FeeInfo implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final FeeInfo INSTANCE = new FeeInfo();
                @NotNull
                public static final String ROUTE = "register_true_online/tol_package/fee_info";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$MarketingCodeSelection;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TolPackage$MarketingCodeSelection */
            /* loaded from: classes10.dex */
            public static final class MarketingCodeSelection implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final MarketingCodeSelection INSTANCE = new MarketingCodeSelection();
                @NotNull
                public static final String ROUTE = "register_true_online/tol_package/marketing_code_selection";
            }

            @StabilityInferred(parameters = 0)
            @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen$Tol$TolPackage$SmartSearch;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/OneTolScreen;", "()V", "ROUTE", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen$Tol$TolPackage$SmartSearch */
            /* loaded from: classes10.dex */
            public static final class SmartSearch implements OneTolScreen {
                public static final int $stable = 0;
                @NotNull
                public static final SmartSearch INSTANCE = new SmartSearch();
                @NotNull
                public static final String ROUTE = "register_true_online/tol_package/smart_search";
            }
        }
    }
}