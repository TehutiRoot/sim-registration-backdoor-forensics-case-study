package co.omise.android.p009ui;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import co.omise.android.C5511R;
import co.omise.android.models.SourceType;
import co.omise.android.models.TokenizationMethod;
import co.omise.android.p009ui.OmiseListItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001e2\u00020\u0001:$\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<BU\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001#=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_¨\u0006`"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource;", "Lco/omise/android/ui/OmiseListItem;", "iconRes", "", "titleRes", "subtitleRes", "indicatorIconRes", "isCreditCard", "", "sourceType", "Lco/omise/android/models/SourceType;", "tokenizationMethod", "Lco/omise/android/models/TokenizationMethod;", "(ILjava/lang/Integer;Ljava/lang/Integer;IZLco/omise/android/models/SourceType;Lco/omise/android/models/TokenizationMethod;)V", "getIconRes", "()Ljava/lang/Integer;", "getIndicatorIconRes", "()Z", "getSourceType", "()Lco/omise/android/models/SourceType;", "getSubtitleRes", "Ljava/lang/Integer;", "getTitleRes", "getTokenizationMethod", "()Lco/omise/android/models/TokenizationMethod;", "Alipay", "AlipayCn", "AlipayHk", "Atome", "Boost", "Companion", "ConvenienceStore", "CreditCard", "Dana", "DuitNowOBW", "DuitNowQR", "Fpx", "Gcash", "GooglePay", "GrabPay", "GrabPayRMS", "Installments", "InternetBankings", "Kakaopay", "MaybankQR", "MobileBankings", "Netbanking", "OcbcDigital", "PayEasy", "PayNow", "PayPay", "PromptPay", "RabbitLinepay", "ShopeePay", "ShopeePayJumpApp", "TescoLotus", "TouchNGo", "TouchNGoAlipay", "TrueMoney", "TrueMoneyJumpApp", "WeChatPay", "Lco/omise/android/ui/PaymentMethodResource$Alipay;", "Lco/omise/android/ui/PaymentMethodResource$AlipayCn;", "Lco/omise/android/ui/PaymentMethodResource$AlipayHk;", "Lco/omise/android/ui/PaymentMethodResource$Atome;", "Lco/omise/android/ui/PaymentMethodResource$Boost;", "Lco/omise/android/ui/PaymentMethodResource$ConvenienceStore;", "Lco/omise/android/ui/PaymentMethodResource$CreditCard;", "Lco/omise/android/ui/PaymentMethodResource$Dana;", "Lco/omise/android/ui/PaymentMethodResource$DuitNowOBW;", "Lco/omise/android/ui/PaymentMethodResource$DuitNowQR;", "Lco/omise/android/ui/PaymentMethodResource$Fpx;", "Lco/omise/android/ui/PaymentMethodResource$Gcash;", "Lco/omise/android/ui/PaymentMethodResource$GooglePay;", "Lco/omise/android/ui/PaymentMethodResource$GrabPay;", "Lco/omise/android/ui/PaymentMethodResource$GrabPayRMS;", "Lco/omise/android/ui/PaymentMethodResource$Installments;", "Lco/omise/android/ui/PaymentMethodResource$InternetBankings;", "Lco/omise/android/ui/PaymentMethodResource$Kakaopay;", "Lco/omise/android/ui/PaymentMethodResource$MaybankQR;", "Lco/omise/android/ui/PaymentMethodResource$MobileBankings;", "Lco/omise/android/ui/PaymentMethodResource$Netbanking;", "Lco/omise/android/ui/PaymentMethodResource$OcbcDigital;", "Lco/omise/android/ui/PaymentMethodResource$PayEasy;", "Lco/omise/android/ui/PaymentMethodResource$PayNow;", "Lco/omise/android/ui/PaymentMethodResource$PayPay;", "Lco/omise/android/ui/PaymentMethodResource$PromptPay;", "Lco/omise/android/ui/PaymentMethodResource$RabbitLinepay;", "Lco/omise/android/ui/PaymentMethodResource$ShopeePay;", "Lco/omise/android/ui/PaymentMethodResource$ShopeePayJumpApp;", "Lco/omise/android/ui/PaymentMethodResource$TescoLotus;", "Lco/omise/android/ui/PaymentMethodResource$TouchNGo;", "Lco/omise/android/ui/PaymentMethodResource$TouchNGoAlipay;", "Lco/omise/android/ui/PaymentMethodResource$TrueMoney;", "Lco/omise/android/ui/PaymentMethodResource$TrueMoneyJumpApp;", "Lco/omise/android/ui/PaymentMethodResource$WeChatPay;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.PaymentMethodResource */
/* loaded from: classes3.dex */
public abstract class PaymentMethodResource implements OmiseListItem {
    @NotNull
    public static final String ALIPAY_PLUS_PROVIDER = "Alipay_plus";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String RMS_PROVIDER = "RMS";
    private final int iconRes;
    private final int indicatorIconRes;
    private final boolean isCreditCard;
    @Nullable
    private final SourceType sourceType;
    @Nullable
    private final Integer subtitleRes;
    @Nullable
    private final Integer titleRes;
    @Nullable
    private final TokenizationMethod tokenizationMethod;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Alipay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Alipay */
    /* loaded from: classes3.dex */
    public static final class Alipay extends PaymentMethodResource {
        @NotNull
        public static final Alipay INSTANCE = new Alipay();

        private Alipay() {
            super(C5511R.C5513drawable.payment_alipay, Integer.valueOf(C5511R.C5518string.payment_method_alipay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.Alipay.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$AlipayCn;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$AlipayCn */
    /* loaded from: classes3.dex */
    public static final class AlipayCn extends PaymentMethodResource {
        @NotNull
        public static final AlipayCn INSTANCE = new AlipayCn();

        private AlipayCn() {
            super(C5511R.C5513drawable.payment_alipay_cn, Integer.valueOf(C5511R.C5518string.payment_method_alipay_cn_title), Integer.valueOf(C5511R.C5518string.payment_method_alipayplus_footnote), C5511R.C5513drawable.ic_redirect, false, SourceType.AlipayCn.INSTANCE, null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$AlipayHk;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$AlipayHk */
    /* loaded from: classes3.dex */
    public static final class AlipayHk extends PaymentMethodResource {
        @NotNull
        public static final AlipayHk INSTANCE = new AlipayHk();

        private AlipayHk() {
            super(C5511R.C5513drawable.payment_alipay_hk, Integer.valueOf(C5511R.C5518string.payment_method_alipay_hk_title), Integer.valueOf(C5511R.C5518string.payment_method_alipayplus_footnote), C5511R.C5513drawable.ic_redirect, false, SourceType.AlipayHk.INSTANCE, null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Atome;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Atome */
    /* loaded from: classes3.dex */
    public static final class Atome extends PaymentMethodResource {
        @NotNull
        public static final Atome INSTANCE = new Atome();

        private Atome() {
            super(C5511R.C5513drawable.payment_atome, Integer.valueOf(C5511R.C5518string.payment_method_atome_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.Atome.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Boost;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Boost */
    /* loaded from: classes3.dex */
    public static final class Boost extends PaymentMethodResource {
        @NotNull
        public static final Boost INSTANCE = new Boost();

        private Boost() {
            super(C5511R.C5513drawable.payment_boost, Integer.valueOf(C5511R.C5518string.payment_method_boots_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.Boost.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Companion;", "", "()V", "ALIPAY_PLUS_PROVIDER", "", "RMS_PROVIDER", "all", "", "Lco/omise/android/ui/PaymentMethodResource;", "getAll", "()Ljava/util/List;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<PaymentMethodResource> getAll() {
            PaymentMethodResource paymentMethodResource;
            Collection<KClass<?>> nestedClasses = Reflection.getOrCreateKotlinClass(PaymentMethodResource.class).getNestedClasses();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nestedClasses.iterator();
            while (it.hasNext()) {
                Object objectInstance = ((KClass) it.next()).getObjectInstance();
                if (objectInstance instanceof PaymentMethodResource) {
                    paymentMethodResource = (PaymentMethodResource) objectInstance;
                } else {
                    paymentMethodResource = null;
                }
                if (paymentMethodResource != null) {
                    arrayList.add(paymentMethodResource);
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$ConvenienceStore;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$ConvenienceStore */
    /* loaded from: classes3.dex */
    public static final class ConvenienceStore extends PaymentMethodResource {
        @NotNull
        public static final ConvenienceStore INSTANCE = new ConvenienceStore();

        private ConvenienceStore() {
            super(C5511R.C5513drawable.payment_conbini, Integer.valueOf(C5511R.C5518string.payment_method_convenience_store_title), null, C5511R.C5513drawable.ic_next, false, SourceType.Econtext.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$CreditCard;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$CreditCard */
    /* loaded from: classes3.dex */
    public static final class CreditCard extends PaymentMethodResource {
        @NotNull
        public static final CreditCard INSTANCE = new CreditCard();

        private CreditCard() {
            super(C5511R.C5513drawable.payment_card, Integer.valueOf(C5511R.C5518string.payment_method_credit_card_title), null, C5511R.C5513drawable.ic_next, true, null, null, 100, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Dana;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Dana */
    /* loaded from: classes3.dex */
    public static final class Dana extends PaymentMethodResource {
        @NotNull
        public static final Dana INSTANCE = new Dana();

        private Dana() {
            super(C5511R.C5513drawable.payment_dana, Integer.valueOf(C5511R.C5518string.payment_method_dana_title), Integer.valueOf(C5511R.C5518string.payment_method_alipayplus_footnote), C5511R.C5513drawable.ic_redirect, false, SourceType.Dana.INSTANCE, null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$DuitNowOBW;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$DuitNowOBW */
    /* loaded from: classes3.dex */
    public static final class DuitNowOBW extends PaymentMethodResource {
        @NotNull
        public static final DuitNowOBW INSTANCE = new DuitNowOBW();

        private DuitNowOBW() {
            super(C5511R.C5513drawable.payment_duitnow_obw, Integer.valueOf(C5511R.C5518string.payment_method_duitnow_obw_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.DuitNowOBW.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$DuitNowQR;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$DuitNowQR */
    /* loaded from: classes3.dex */
    public static final class DuitNowQR extends PaymentMethodResource {
        @NotNull
        public static final DuitNowQR INSTANCE = new DuitNowQR();

        private DuitNowQR() {
            super(C5511R.C5513drawable.payment_duitnow_qr, Integer.valueOf(C5511R.C5518string.payment_method_duitnow_qr_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.DuitNowQR.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Fpx;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Fpx */
    /* loaded from: classes3.dex */
    public static final class Fpx extends PaymentMethodResource {
        @NotNull
        public static final Fpx INSTANCE = new Fpx();

        private Fpx() {
            super(C5511R.C5513drawable.payment_fpx, Integer.valueOf(C5511R.C5518string.payment_method_fpx_title), null, C5511R.C5513drawable.ic_next, false, new SourceType.Fpx(null, 1, null), null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Gcash;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Gcash */
    /* loaded from: classes3.dex */
    public static final class Gcash extends PaymentMethodResource {
        @NotNull
        public static final Gcash INSTANCE = new Gcash();

        private Gcash() {
            super(C5511R.C5513drawable.payment_gcash, Integer.valueOf(C5511R.C5518string.payment_method_gcash_title), Integer.valueOf(C5511R.C5518string.payment_method_alipayplus_footnote), C5511R.C5513drawable.ic_redirect, false, SourceType.Gcash.INSTANCE, null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$GooglePay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$GooglePay */
    /* loaded from: classes3.dex */
    public static final class GooglePay extends PaymentMethodResource {
        @NotNull
        public static final GooglePay INSTANCE = new GooglePay();

        private GooglePay() {
            super(C5511R.C5513drawable.googlepay, Integer.valueOf(C5511R.C5518string.googlepay), null, C5511R.C5513drawable.ic_next, false, null, TokenizationMethod.GooglePay.INSTANCE, 52, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$GrabPay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$GrabPay */
    /* loaded from: classes3.dex */
    public static final class GrabPay extends PaymentMethodResource {
        @NotNull
        public static final GrabPay INSTANCE = new GrabPay();

        private GrabPay() {
            super(C5511R.C5513drawable.payment_grabpay, Integer.valueOf(C5511R.C5518string.payment_method_grabpay_title), Integer.valueOf(C5511R.C5518string.payment_method_grabpay_footnote), C5511R.C5513drawable.ic_redirect, false, new SourceType.GrabPay(null, 1, null), null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$GrabPayRMS;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$GrabPayRMS */
    /* loaded from: classes3.dex */
    public static final class GrabPayRMS extends PaymentMethodResource {
        @NotNull
        public static final GrabPayRMS INSTANCE = new GrabPayRMS();

        private GrabPayRMS() {
            super(C5511R.C5513drawable.payment_grabpay, Integer.valueOf(C5511R.C5518string.payment_method_grabpay_rms_title), null, C5511R.C5513drawable.ic_redirect, false, new SourceType.GrabPay(null, 1, null), null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Installments;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Installments */
    /* loaded from: classes3.dex */
    public static final class Installments extends PaymentMethodResource {
        @NotNull
        public static final Installments INSTANCE = new Installments();

        private Installments() {
            super(C5511R.C5513drawable.payment_installment, Integer.valueOf(C5511R.C5518string.payment_method_installments_title), null, C5511R.C5513drawable.ic_next, false, null, null, 116, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$InternetBankings;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$InternetBankings */
    /* loaded from: classes3.dex */
    public static final class InternetBankings extends PaymentMethodResource {
        @NotNull
        public static final InternetBankings INSTANCE = new InternetBankings();

        private InternetBankings() {
            super(C5511R.C5513drawable.payment_banking, Integer.valueOf(C5511R.C5518string.payment_method_internet_banking_title), null, C5511R.C5513drawable.ic_next, false, null, null, 116, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Kakaopay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Kakaopay */
    /* loaded from: classes3.dex */
    public static final class Kakaopay extends PaymentMethodResource {
        @NotNull
        public static final Kakaopay INSTANCE = new Kakaopay();

        private Kakaopay() {
            super(C5511R.C5513drawable.payment_kakaopay, Integer.valueOf(C5511R.C5518string.payment_method_kakaopay_title), Integer.valueOf(C5511R.C5518string.payment_method_alipayplus_footnote), C5511R.C5513drawable.ic_redirect, false, SourceType.Kakaopay.INSTANCE, null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$MaybankQR;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$MaybankQR */
    /* loaded from: classes3.dex */
    public static final class MaybankQR extends PaymentMethodResource {
        @NotNull
        public static final MaybankQR INSTANCE = new MaybankQR();

        private MaybankQR() {
            super(C5511R.C5513drawable.payment_mae_maybank, Integer.valueOf(C5511R.C5518string.payment_method_maybank_qr_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.MaybankQR.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$MobileBankings;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$MobileBankings */
    /* loaded from: classes3.dex */
    public static final class MobileBankings extends PaymentMethodResource {
        @NotNull
        public static final MobileBankings INSTANCE = new MobileBankings();

        private MobileBankings() {
            super(C5511R.C5513drawable.payment_mobile, Integer.valueOf(C5511R.C5518string.payment_method_mobile_banking_title), null, C5511R.C5513drawable.ic_next, false, null, null, 116, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$Netbanking;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$Netbanking */
    /* loaded from: classes3.dex */
    public static final class Netbanking extends PaymentMethodResource {
        @NotNull
        public static final Netbanking INSTANCE = new Netbanking();

        private Netbanking() {
            super(C5511R.C5513drawable.payment_netbank, Integer.valueOf(C5511R.C5518string.payment_method_netbank_title), null, C5511R.C5513drawable.ic_next, false, SourceType.Econtext.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$OcbcDigital;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$OcbcDigital */
    /* loaded from: classes3.dex */
    public static final class OcbcDigital extends PaymentMethodResource {
        @NotNull
        public static final OcbcDigital INSTANCE = new OcbcDigital();

        private OcbcDigital() {
            super(C5511R.C5513drawable.payment_ocbc_digital, Integer.valueOf(C5511R.C5518string.payment_method_ocbc_digital_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.OcbcDigital.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$PayEasy;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$PayEasy */
    /* loaded from: classes3.dex */
    public static final class PayEasy extends PaymentMethodResource {
        @NotNull
        public static final PayEasy INSTANCE = new PayEasy();

        private PayEasy() {
            super(C5511R.C5513drawable.payment_payeasy, Integer.valueOf(C5511R.C5518string.payment_method_pay_easy_title), null, C5511R.C5513drawable.ic_next, false, SourceType.Econtext.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$PayNow;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$PayNow */
    /* loaded from: classes3.dex */
    public static final class PayNow extends PaymentMethodResource {
        @NotNull
        public static final PayNow INSTANCE = new PayNow();

        private PayNow() {
            super(C5511R.C5513drawable.payment_paynow, Integer.valueOf(C5511R.C5518string.payment_method_paynow_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.PayNow.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$PayPay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$PayPay */
    /* loaded from: classes3.dex */
    public static final class PayPay extends PaymentMethodResource {
        @NotNull
        public static final PayPay INSTANCE = new PayPay();

        private PayPay() {
            super(C5511R.C5513drawable.payment_paypay, Integer.valueOf(C5511R.C5518string.payment_method_paypay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.PayPay.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$PromptPay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$PromptPay */
    /* loaded from: classes3.dex */
    public static final class PromptPay extends PaymentMethodResource {
        @NotNull
        public static final PromptPay INSTANCE = new PromptPay();

        private PromptPay() {
            super(C5511R.C5513drawable.payment_promptpay, Integer.valueOf(C5511R.C5518string.payment_method_promptpay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.PromptPay.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$RabbitLinepay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$RabbitLinepay */
    /* loaded from: classes3.dex */
    public static final class RabbitLinepay extends PaymentMethodResource {
        @NotNull
        public static final RabbitLinepay INSTANCE = new RabbitLinepay();

        private RabbitLinepay() {
            super(C5511R.C5513drawable.payment_rabbit_linepay, Integer.valueOf(C5511R.C5518string.payment_method_rabbit_linepay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.RabbitLinePay.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$ShopeePay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$ShopeePay */
    /* loaded from: classes3.dex */
    public static final class ShopeePay extends PaymentMethodResource {
        @NotNull
        public static final ShopeePay INSTANCE = new ShopeePay();

        private ShopeePay() {
            super(C5511R.C5513drawable.payment_shopeepay, Integer.valueOf(C5511R.C5518string.payment_method_shopeepay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.ShopeePay.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$ShopeePayJumpApp;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$ShopeePayJumpApp */
    /* loaded from: classes3.dex */
    public static final class ShopeePayJumpApp extends PaymentMethodResource {
        @NotNull
        public static final ShopeePayJumpApp INSTANCE = new ShopeePayJumpApp();

        private ShopeePayJumpApp() {
            super(C5511R.C5513drawable.payment_shopeepay, Integer.valueOf(C5511R.C5518string.payment_method_shopeepay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.ShopeePayJumpApp.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$TescoLotus;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$TescoLotus */
    /* loaded from: classes3.dex */
    public static final class TescoLotus extends PaymentMethodResource {
        @NotNull
        public static final TescoLotus INSTANCE = new TescoLotus();

        private TescoLotus() {
            super(C5511R.C5513drawable.payment_tesco, Integer.valueOf(C5511R.C5518string.payment_method_tesco_lotus_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.BillPaymentTescoLotus.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$TouchNGo;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$TouchNGo */
    /* loaded from: classes3.dex */
    public static final class TouchNGo extends PaymentMethodResource {
        @NotNull
        public static final TouchNGo INSTANCE = new TouchNGo();

        private TouchNGo() {
            super(C5511R.C5513drawable.payment_touch_n_go, Integer.valueOf(C5511R.C5518string.payment_method_touch_n_go_title), null, C5511R.C5513drawable.ic_redirect, false, new SourceType.TouchNGo(null, 1, null), null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$TouchNGoAlipay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$TouchNGoAlipay */
    /* loaded from: classes3.dex */
    public static final class TouchNGoAlipay extends PaymentMethodResource {
        @NotNull
        public static final TouchNGoAlipay INSTANCE = new TouchNGoAlipay();

        private TouchNGoAlipay() {
            super(C5511R.C5513drawable.payment_touch_n_go, Integer.valueOf(C5511R.C5518string.payment_method_touch_n_go_title), Integer.valueOf(C5511R.C5518string.payment_method_alipayplus_footnote), C5511R.C5513drawable.ic_redirect, false, new SourceType.TouchNGo(null, 1, null), null, 80, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$TrueMoney;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$TrueMoney */
    /* loaded from: classes3.dex */
    public static final class TrueMoney extends PaymentMethodResource {
        @NotNull
        public static final TrueMoney INSTANCE = new TrueMoney();

        private TrueMoney() {
            super(C5511R.C5513drawable.payment_truemoney, Integer.valueOf(C5511R.C5518string.payment_truemoney_title), null, C5511R.C5513drawable.ic_next, false, SourceType.TrueMoney.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$TrueMoneyJumpApp;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$TrueMoneyJumpApp */
    /* loaded from: classes3.dex */
    public static final class TrueMoneyJumpApp extends PaymentMethodResource {
        @NotNull
        public static final TrueMoneyJumpApp INSTANCE = new TrueMoneyJumpApp();

        private TrueMoneyJumpApp() {
            super(C5511R.C5513drawable.payment_truemoney, Integer.valueOf(C5511R.C5518string.payment_truemoney_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.TrueMoneyJumpApp.INSTANCE, null, 84, null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/PaymentMethodResource$WeChatPay;", "Lco/omise/android/ui/PaymentMethodResource;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.PaymentMethodResource$WeChatPay */
    /* loaded from: classes3.dex */
    public static final class WeChatPay extends PaymentMethodResource {
        @NotNull
        public static final WeChatPay INSTANCE = new WeChatPay();

        private WeChatPay() {
            super(C5511R.C5513drawable.wechat_pay, Integer.valueOf(C5511R.C5518string.payment_method_wechat_pay_title), null, C5511R.C5513drawable.ic_redirect, false, SourceType.WeChatPay.INSTANCE, null, 84, null);
        }
    }

    public /* synthetic */ PaymentMethodResource(int i, Integer num, Integer num2, int i2, boolean z, SourceType sourceType, TokenizationMethod tokenizationMethod, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, num2, i2, z, sourceType, tokenizationMethod);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Boolean getEnabled() {
        return OmiseListItem.DefaultImpls.getEnabled(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @NotNull
    public Integer getIconRes() {
        return Integer.valueOf(this.iconRes);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @NotNull
    public Integer getIndicatorIconRes() {
        return Integer.valueOf(this.indicatorIconRes);
    }

    @Nullable
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getSubtitle() {
        return OmiseListItem.DefaultImpls.getSubtitle(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public String getTitle() {
        return OmiseListItem.DefaultImpls.getTitle(this);
    }

    @Override // co.omise.android.p009ui.OmiseListItem
    @Nullable
    public Integer getTitleRes() {
        return this.titleRes;
    }

    @Nullable
    public final TokenizationMethod getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    public final boolean isCreditCard() {
        return this.isCreditCard;
    }

    private PaymentMethodResource(@DrawableRes int i, @StringRes Integer num, @StringRes Integer num2, @DrawableRes int i2, boolean z, SourceType sourceType, TokenizationMethod tokenizationMethod) {
        this.iconRes = i;
        this.titleRes = num;
        this.subtitleRes = num2;
        this.indicatorIconRes = i2;
        this.isCreditCard = z;
        this.sourceType = sourceType;
        this.tokenizationMethod = tokenizationMethod;
    }

    public /* synthetic */ PaymentMethodResource(int i, Integer num, Integer num2, int i2, boolean z, SourceType sourceType, TokenizationMethod tokenizationMethod, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, (i3 & 4) != 0 ? null : num2, i2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? null : sourceType, (i3 & 64) != 0 ? null : tokenizationMethod, null);
    }
}
