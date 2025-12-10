package co.omise.android.models;

import android.annotation.SuppressLint;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001: \u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u001f'()*+,-./0123456789:;<=>?@ABCDE¨\u0006F"}, m28850d2 = {"Lco/omise/android/models/SourceType;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Alipay", "AlipayCn", "AlipayHk", "Atome", "BarcodeAlipay", "BillPaymentTescoLotus", "Boost", "Companion", "Dana", "DuitNowOBW", "DuitNowQR", "Econtext", "Fpx", "Gcash", "GrabPay", "Installment", "InternetBanking", "Kakaopay", "MaybankQR", "MobileBanking", "OcbcDigital", "PayNow", "PayPay", "PromptPay", "RabbitLinePay", "ShopeePay", "ShopeePayJumpApp", "TouchNGo", "TrueMoney", "TrueMoneyJumpApp", OpenTypeScript.UNKNOWN, "WeChatPay", "Lco/omise/android/models/SourceType$Alipay;", "Lco/omise/android/models/SourceType$AlipayCn;", "Lco/omise/android/models/SourceType$AlipayHk;", "Lco/omise/android/models/SourceType$Atome;", "Lco/omise/android/models/SourceType$BarcodeAlipay;", "Lco/omise/android/models/SourceType$BillPaymentTescoLotus;", "Lco/omise/android/models/SourceType$Boost;", "Lco/omise/android/models/SourceType$Dana;", "Lco/omise/android/models/SourceType$DuitNowOBW;", "Lco/omise/android/models/SourceType$DuitNowQR;", "Lco/omise/android/models/SourceType$Econtext;", "Lco/omise/android/models/SourceType$Fpx;", "Lco/omise/android/models/SourceType$Gcash;", "Lco/omise/android/models/SourceType$GrabPay;", "Lco/omise/android/models/SourceType$Installment;", "Lco/omise/android/models/SourceType$InternetBanking;", "Lco/omise/android/models/SourceType$Kakaopay;", "Lco/omise/android/models/SourceType$MaybankQR;", "Lco/omise/android/models/SourceType$MobileBanking;", "Lco/omise/android/models/SourceType$OcbcDigital;", "Lco/omise/android/models/SourceType$PayNow;", "Lco/omise/android/models/SourceType$PayPay;", "Lco/omise/android/models/SourceType$PromptPay;", "Lco/omise/android/models/SourceType$RabbitLinePay;", "Lco/omise/android/models/SourceType$ShopeePay;", "Lco/omise/android/models/SourceType$ShopeePayJumpApp;", "Lco/omise/android/models/SourceType$TouchNGo;", "Lco/omise/android/models/SourceType$TrueMoney;", "Lco/omise/android/models/SourceType$TrueMoneyJumpApp;", "Lco/omise/android/models/SourceType$Unknown;", "Lco/omise/android/models/SourceType$WeChatPay;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public abstract class SourceType {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JsonValue
    @Nullable
    private final String name;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Alipay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Alipay extends SourceType {
        @NotNull
        public static final Alipay INSTANCE = new Alipay();

        private Alipay() {
            super("alipay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$AlipayCn;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class AlipayCn extends SourceType {
        @NotNull
        public static final AlipayCn INSTANCE = new AlipayCn();

        private AlipayCn() {
            super("alipay_cn", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$AlipayHk;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class AlipayHk extends SourceType {
        @NotNull
        public static final AlipayHk INSTANCE = new AlipayHk();

        private AlipayHk() {
            super("alipay_hk", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Atome;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Atome extends SourceType {
        @NotNull
        public static final Atome INSTANCE = new Atome();

        private Atome() {
            super("atome", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$BarcodeAlipay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class BarcodeAlipay extends SourceType {
        @NotNull
        public static final BarcodeAlipay INSTANCE = new BarcodeAlipay();

        private BarcodeAlipay() {
            super("barcode_alipay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$BillPaymentTescoLotus;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class BillPaymentTescoLotus extends SourceType {
        @NotNull
        public static final BillPaymentTescoLotus INSTANCE = new BillPaymentTescoLotus();

        private BillPaymentTescoLotus() {
            super("bill_payment_tesco_lotus", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Boost;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Boost extends SourceType {
        @NotNull
        public static final Boost INSTANCE = new Boost();

        private Boost() {
            super("boost", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28850d2 = {"Lco/omise/android/models/SourceType$Companion;", "", "()V", "creator", "Lco/omise/android/models/SourceType;", "name", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JsonCreator
        @SuppressLint({"DefaultLocale"})
        @NotNull
        public final SourceType creator(@Nullable String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -2098630958:
                        if (str.equals("shopeepay")) {
                            return ShopeePay.INSTANCE;
                        }
                        break;
                    case -2086695805:
                        if (str.equals("internet_banking_bay")) {
                            return InternetBanking.Bay.INSTANCE;
                        }
                        break;
                    case -2086695787:
                        if (str.equals("internet_banking_bbl")) {
                            return InternetBanking.Bbl.INSTANCE;
                        }
                        break;
                    case -2052195162:
                        if (str.equals("duitnow_qr")) {
                            return DuitNowQR.INSTANCE;
                        }
                        break;
                    case -1917320426:
                        if (str.equals("installment_first_choice")) {
                            return Installment.FirstChoice.INSTANCE;
                        }
                        break;
                    case -1597244583:
                        if (str.equals("touch_n_go")) {
                            return new TouchNGo(null, 1, null);
                        }
                        break;
                    case -1414960566:
                        if (str.equals("alipay")) {
                            return Alipay.INSTANCE;
                        }
                        break;
                    case -1025738778:
                        if (str.equals("truemoney_jumpapp")) {
                            return TrueMoneyJumpApp.INSTANCE;
                        }
                        break;
                    case -995206866:
                        if (str.equals("paynow")) {
                            return PayNow.INSTANCE;
                        }
                        break;
                    case -995205376:
                        if (str.equals("paypay")) {
                            return PayPay.INSTANCE;
                        }
                        break;
                    case -798282556:
                        if (str.equals("promptpay")) {
                            return PromptPay.INSTANCE;
                        }
                        break;
                    case -746712378:
                        if (str.equals("shopeepay_jumpapp")) {
                            return ShopeePayJumpApp.INSTANCE;
                        }
                        break;
                    case -567025393:
                        if (str.equals("rabbit_linepay")) {
                            return RabbitLinePay.INSTANCE;
                        }
                        break;
                    case -318541087:
                        if (str.equals("installment_kbank")) {
                            return Installment.KBank.INSTANCE;
                        }
                        break;
                    case -140710167:
                        if (str.equals("barcode_alipay")) {
                            return BarcodeAlipay.INSTANCE;
                        }
                        break;
                    case 101614:
                        if (str.equals("fpx")) {
                            return new Fpx(null, 1, null);
                        }
                        break;
                    case 3075824:
                        if (str.equals("dana")) {
                            return Dana.INSTANCE;
                        }
                        break;
                    case 93147444:
                        if (str.equals("atome")) {
                            return Atome.INSTANCE;
                        }
                        break;
                    case 93922211:
                        if (str.equals("boost")) {
                            return Boost.INSTANCE;
                        }
                        break;
                    case 98168858:
                        if (str.equals("gcash")) {
                            return Gcash.INSTANCE;
                        }
                        break;
                    case 279933660:
                        if (str.equals("grabpay")) {
                            return new GrabPay(null, 1, null);
                        }
                        break;
                    case 312815115:
                        if (str.equals("mobile_banking_ocbc")) {
                            return OcbcDigital.INSTANCE;
                        }
                        break;
                    case 601464655:
                        if (str.equals("installment_wlb_kbank")) {
                            return Installment.KBankWlb.INSTANCE;
                        }
                        break;
                    case 806457119:
                        if (str.equals("duitnow_obw")) {
                            return DuitNowOBW.INSTANCE;
                        }
                        break;
                    case 846974213:
                        if (str.equals("kakaopay")) {
                            return Kakaopay.INSTANCE;
                        }
                        break;
                    case 881715626:
                        if (str.equals("econtext")) {
                            return Econtext.INSTANCE;
                        }
                        break;
                    case 886320461:
                        if (str.equals("bill_payment_tesco_lotus")) {
                            return BillPaymentTescoLotus.INSTANCE;
                        }
                        break;
                    case 915038719:
                        if (str.equals("maybank_qr")) {
                            return MaybankQR.INSTANCE;
                        }
                        break;
                    case 1103609585:
                        if (str.equals("mobile_banking_kbank")) {
                            return MobileBanking.KBank.INSTANCE;
                        }
                        break;
                    case 1118456932:
                        if (str.equals("mobile_banking_bay")) {
                            return MobileBanking.Bay.INSTANCE;
                        }
                        break;
                    case 1118456950:
                        if (str.equals("mobile_banking_bbl")) {
                            return MobileBanking.Bbl.INSTANCE;
                        }
                        break;
                    case 1118466147:
                        if (str.equals("mobile_banking_ktb")) {
                            return MobileBanking.KTB.INSTANCE;
                        }
                        break;
                    case 1118473308:
                        if (str.equals("mobile_banking_scb")) {
                            return MobileBanking.Scb.INSTANCE;
                        }
                        break;
                    case 1171565634:
                        if (str.equals("installment_wlb_bay")) {
                            return Installment.BayWlb.INSTANCE;
                        }
                        break;
                    case 1171565652:
                        if (str.equals("installment_wlb_bbl")) {
                            return Installment.BblWlb.INSTANCE;
                        }
                        break;
                    case 1171574850:
                        if (str.equals("installment_wlb_ktc")) {
                            return Installment.KtcWlb.INSTANCE;
                        }
                        break;
                    case 1171582010:
                        if (str.equals("installment_wlb_scb")) {
                            return Installment.ScbWlb.INSTANCE;
                        }
                        break;
                    case 1171583498:
                        if (str.equals("installment_wlb_ttb")) {
                            return Installment.TtbWlb.INSTANCE;
                        }
                        break;
                    case 1359934450:
                        if (str.equals("truemoney")) {
                            return TrueMoney.INSTANCE;
                        }
                        break;
                    case 1658152975:
                        if (str.equals("wechat_pay")) {
                            return WeChatPay.INSTANCE;
                        }
                        break;
                    case 1814182996:
                        if (str.equals("installment_bay")) {
                            return Installment.Bay.INSTANCE;
                        }
                        break;
                    case 1814183014:
                        if (str.equals("installment_bbl")) {
                            return Installment.Bbl.INSTANCE;
                        }
                        break;
                    case 1814192212:
                        if (str.equals("installment_ktc")) {
                            return Installment.Ktc.INSTANCE;
                        }
                        break;
                    case 1814193575:
                        if (str.equals("installment_mbb")) {
                            return Installment.Mbb.INSTANCE;
                        }
                        break;
                    case 1814199372:
                        if (str.equals("installment_scb")) {
                            return Installment.Scb.INSTANCE;
                        }
                        break;
                    case 1814200860:
                        if (str.equals("installment_ttb")) {
                            return Installment.Ttb.INSTANCE;
                        }
                        break;
                    case 1814201666:
                        if (str.equals("installment_uob")) {
                            return Installment.Uob.INSTANCE;
                        }
                        break;
                    case 1889115880:
                        if (str.equals("installment_wlb_first_choice")) {
                            return Installment.FirstChoiceWlb.INSTANCE;
                        }
                        break;
                    case 2013883008:
                        if (str.equals("alipay_cn")) {
                            return AlipayCn.INSTANCE;
                        }
                        break;
                    case 2013883160:
                        if (str.equals("alipay_hk")) {
                            return AlipayHk.INSTANCE;
                        }
                        break;
                }
            }
            return new Unknown(str);
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Dana;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Dana extends SourceType {
        @NotNull
        public static final Dana INSTANCE = new Dana();

        private Dana() {
            super("dana", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$DuitNowOBW;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DuitNowOBW extends SourceType {
        @NotNull
        public static final DuitNowOBW INSTANCE = new DuitNowOBW();

        private DuitNowOBW() {
            super("duitnow_obw", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$DuitNowQR;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DuitNowQR extends SourceType {
        @NotNull
        public static final DuitNowQR INSTANCE = new DuitNowQR();

        private DuitNowQR() {
            super("duitnow_qr", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Econtext;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Econtext extends SourceType {
        @NotNull
        public static final Econtext INSTANCE = new Econtext();

        private Econtext() {
            super("econtext", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, m28850d2 = {"Lco/omise/android/models/SourceType$Fpx;", "Lco/omise/android/models/SourceType;", "banks", "", "Lco/omise/android/models/Bank;", "(Ljava/util/List;)V", "getBanks", "()Ljava/util/List;", "setBanks", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Fpx extends SourceType {
        @Nullable
        private List<Bank> banks;

        public Fpx() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Fpx copy$default(Fpx fpx, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = fpx.banks;
            }
            return fpx.copy(list);
        }

        @Nullable
        public final List<Bank> component1() {
            return this.banks;
        }

        @NotNull
        public final Fpx copy(@Nullable List<Bank> list) {
            return new Fpx(list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fpx) && Intrinsics.areEqual(this.banks, ((Fpx) obj).banks);
        }

        @Nullable
        public final List<Bank> getBanks() {
            return this.banks;
        }

        public int hashCode() {
            List<Bank> list = this.banks;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final void setBanks(@Nullable List<Bank> list) {
            this.banks = list;
        }

        @NotNull
        public String toString() {
            return "Fpx(banks=" + this.banks + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Fpx(@Nullable List<Bank> list) {
            super("fpx", null);
            this.banks = list;
        }

        public /* synthetic */ Fpx(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Gcash;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Gcash extends SourceType {
        @NotNull
        public static final Gcash INSTANCE = new Gcash();

        private Gcash() {
            super("gcash", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/SourceType$GrabPay;", "Lco/omise/android/models/SourceType;", "provider", "", "(Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class GrabPay extends SourceType {
        @Nullable
        private final String provider;

        public GrabPay() {
            this(null, 1, null);
        }

        public static /* synthetic */ GrabPay copy$default(GrabPay grabPay, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = grabPay.provider;
            }
            return grabPay.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.provider;
        }

        @NotNull
        public final GrabPay copy(@Nullable String str) {
            return new GrabPay(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GrabPay) && Intrinsics.areEqual(this.provider, ((GrabPay) obj).provider);
        }

        @Nullable
        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            String str = this.provider;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "GrabPay(provider=" + this.provider + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public GrabPay(@Nullable String str) {
            super("grabpay", null);
            this.provider = str;
        }

        public /* synthetic */ GrabPay(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0011\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment;", "Lco/omise/android/models/SourceType;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Bay", "BayWlb", "Bbl", "BblWlb", "FirstChoice", "FirstChoiceWlb", "KBank", "KBankWlb", "Ktc", "KtcWlb", "Mbb", "Scb", "ScbWlb", "Ttb", "TtbWlb", OpenTypeScript.UNKNOWN, "Uob", "Lco/omise/android/models/SourceType$Installment$Bay;", "Lco/omise/android/models/SourceType$Installment$BayWlb;", "Lco/omise/android/models/SourceType$Installment$Bbl;", "Lco/omise/android/models/SourceType$Installment$BblWlb;", "Lco/omise/android/models/SourceType$Installment$FirstChoice;", "Lco/omise/android/models/SourceType$Installment$FirstChoiceWlb;", "Lco/omise/android/models/SourceType$Installment$KBank;", "Lco/omise/android/models/SourceType$Installment$KBankWlb;", "Lco/omise/android/models/SourceType$Installment$Ktc;", "Lco/omise/android/models/SourceType$Installment$KtcWlb;", "Lco/omise/android/models/SourceType$Installment$Mbb;", "Lco/omise/android/models/SourceType$Installment$Scb;", "Lco/omise/android/models/SourceType$Installment$ScbWlb;", "Lco/omise/android/models/SourceType$Installment$Ttb;", "Lco/omise/android/models/SourceType$Installment$TtbWlb;", "Lco/omise/android/models/SourceType$Installment$Unknown;", "Lco/omise/android/models/SourceType$Installment$Uob;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Installment extends SourceType {
        @JsonValue
        @Nullable
        private final String name;

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Bay;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Bay extends Installment {
            @NotNull
            public static final Bay INSTANCE = new Bay();

            private Bay() {
                super("installment_bay", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$BayWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class BayWlb extends Installment {
            @NotNull
            public static final BayWlb INSTANCE = new BayWlb();

            private BayWlb() {
                super("installment_wlb_bay", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Bbl;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Bbl extends Installment {
            @NotNull
            public static final Bbl INSTANCE = new Bbl();

            private Bbl() {
                super("installment_bbl", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$BblWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class BblWlb extends Installment {
            @NotNull
            public static final BblWlb INSTANCE = new BblWlb();

            private BblWlb() {
                super("installment_wlb_bbl", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$FirstChoice;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class FirstChoice extends Installment {
            @NotNull
            public static final FirstChoice INSTANCE = new FirstChoice();

            private FirstChoice() {
                super("installment_first_choice", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$FirstChoiceWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class FirstChoiceWlb extends Installment {
            @NotNull
            public static final FirstChoiceWlb INSTANCE = new FirstChoiceWlb();

            private FirstChoiceWlb() {
                super("installment_wlb_first_choice", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$KBank;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class KBank extends Installment {
            @NotNull
            public static final KBank INSTANCE = new KBank();

            private KBank() {
                super("installment_kbank", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$KBankWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class KBankWlb extends Installment {
            @NotNull
            public static final KBankWlb INSTANCE = new KBankWlb();

            private KBankWlb() {
                super("installment_wlb_kbank", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Ktc;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Ktc extends Installment {
            @NotNull
            public static final Ktc INSTANCE = new Ktc();

            private Ktc() {
                super("installment_ktc", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$KtcWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class KtcWlb extends Installment {
            @NotNull
            public static final KtcWlb INSTANCE = new KtcWlb();

            private KtcWlb() {
                super("installment_wlb_ktc", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Mbb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Mbb extends Installment {
            @NotNull
            public static final Mbb INSTANCE = new Mbb();

            private Mbb() {
                super("installment_mbb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Scb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Scb extends Installment {
            @NotNull
            public static final Scb INSTANCE = new Scb();

            private Scb() {
                super("installment_scb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$ScbWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class ScbWlb extends Installment {
            @NotNull
            public static final ScbWlb INSTANCE = new ScbWlb();

            private ScbWlb() {
                super("installment_wlb_scb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Ttb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Ttb extends Installment {
            @NotNull
            public static final Ttb INSTANCE = new Ttb();

            private Ttb() {
                super("installment_ttb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$TtbWlb;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class TtbWlb extends Installment {
            @NotNull
            public static final TtbWlb INSTANCE = new TtbWlb();

            private TtbWlb() {
                super("installment_wlb_ttb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Unknown;", "Lco/omise/android/models/SourceType$Installment;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Unknown extends Installment {
            @JsonValue
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

            @Override // co.omise.android.models.SourceType.Installment, co.omise.android.models.SourceType
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

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Installment$Uob;", "Lco/omise/android/models/SourceType$Installment;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Uob extends Installment {
            @NotNull
            public static final Uob INSTANCE = new Uob();

            private Uob() {
                super("installment_uob", null);
            }
        }

        public /* synthetic */ Installment(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // co.omise.android.models.SourceType
        @Nullable
        public String getName() {
            return this.name;
        }

        private Installment(String str) {
            super(str, null);
            this.name = str;
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m28850d2 = {"Lco/omise/android/models/SourceType$InternetBanking;", "Lco/omise/android/models/SourceType;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Bay", "Bbl", OpenTypeScript.UNKNOWN, "Lco/omise/android/models/SourceType$InternetBanking$Bay;", "Lco/omise/android/models/SourceType$InternetBanking$Bbl;", "Lco/omise/android/models/SourceType$InternetBanking$Unknown;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class InternetBanking extends SourceType {
        @JsonValue
        @Nullable
        private final String name;

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$InternetBanking$Bay;", "Lco/omise/android/models/SourceType$InternetBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Bay extends InternetBanking {
            @NotNull
            public static final Bay INSTANCE = new Bay();

            private Bay() {
                super("internet_banking_bay", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$InternetBanking$Bbl;", "Lco/omise/android/models/SourceType$InternetBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Bbl extends InternetBanking {
            @NotNull
            public static final Bbl INSTANCE = new Bbl();

            private Bbl() {
                super("internet_banking_bbl", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/SourceType$InternetBanking$Unknown;", "Lco/omise/android/models/SourceType$InternetBanking;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Unknown extends InternetBanking {
            @JsonValue
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

            @Override // co.omise.android.models.SourceType.InternetBanking, co.omise.android.models.SourceType
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

        public /* synthetic */ InternetBanking(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // co.omise.android.models.SourceType
        @Nullable
        public String getName() {
            return this.name;
        }

        private InternetBanking(String str) {
            super(str, null);
            this.name = str;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$Kakaopay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Kakaopay extends SourceType {
        @NotNull
        public static final Kakaopay INSTANCE = new Kakaopay();

        private Kakaopay() {
            super("kakaopay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$MaybankQR;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class MaybankQR extends SourceType {
        @NotNull
        public static final MaybankQR INSTANCE = new MaybankQR();

        private MaybankQR() {
            super("maybank_qr", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking;", "Lco/omise/android/models/SourceType;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Bay", "Bbl", "KBank", "KTB", "Scb", OpenTypeScript.UNKNOWN, "Lco/omise/android/models/SourceType$MobileBanking$Bay;", "Lco/omise/android/models/SourceType$MobileBanking$Bbl;", "Lco/omise/android/models/SourceType$MobileBanking$KBank;", "Lco/omise/android/models/SourceType$MobileBanking$KTB;", "Lco/omise/android/models/SourceType$MobileBanking$Scb;", "Lco/omise/android/models/SourceType$MobileBanking$Unknown;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class MobileBanking extends SourceType {
        @JsonValue
        @Nullable
        private final String name;

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking$Bay;", "Lco/omise/android/models/SourceType$MobileBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Bay extends MobileBanking {
            @NotNull
            public static final Bay INSTANCE = new Bay();

            private Bay() {
                super("mobile_banking_bay", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking$Bbl;", "Lco/omise/android/models/SourceType$MobileBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Bbl extends MobileBanking {
            @NotNull
            public static final Bbl INSTANCE = new Bbl();

            private Bbl() {
                super("mobile_banking_bbl", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking$KBank;", "Lco/omise/android/models/SourceType$MobileBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class KBank extends MobileBanking {
            @NotNull
            public static final KBank INSTANCE = new KBank();

            private KBank() {
                super("mobile_banking_kbank", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking$KTB;", "Lco/omise/android/models/SourceType$MobileBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class KTB extends MobileBanking {
            @NotNull
            public static final KTB INSTANCE = new KTB();

            private KTB() {
                super("mobile_banking_ktb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking$Scb;", "Lco/omise/android/models/SourceType$MobileBanking;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Scb extends MobileBanking {
            @NotNull
            public static final Scb INSTANCE = new Scb();

            private Scb() {
                super("mobile_banking_scb", null);
            }
        }

        @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/SourceType$MobileBanking$Unknown;", "Lco/omise/android/models/SourceType$MobileBanking;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Unknown extends MobileBanking {
            @JsonValue
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

            @Override // co.omise.android.models.SourceType.MobileBanking, co.omise.android.models.SourceType
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

        public /* synthetic */ MobileBanking(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // co.omise.android.models.SourceType
        @Nullable
        public String getName() {
            return this.name;
        }

        private MobileBanking(String str) {
            super(str, null);
            this.name = str;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$OcbcDigital;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class OcbcDigital extends SourceType {
        @NotNull
        public static final OcbcDigital INSTANCE = new OcbcDigital();

        private OcbcDigital() {
            super("mobile_banking_ocbc", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$PayNow;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class PayNow extends SourceType {
        @NotNull
        public static final PayNow INSTANCE = new PayNow();

        private PayNow() {
            super("paynow", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$PayPay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class PayPay extends SourceType {
        @NotNull
        public static final PayPay INSTANCE = new PayPay();

        private PayPay() {
            super("paypay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$PromptPay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class PromptPay extends SourceType {
        @NotNull
        public static final PromptPay INSTANCE = new PromptPay();

        private PromptPay() {
            super("promptpay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$RabbitLinePay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class RabbitLinePay extends SourceType {
        @NotNull
        public static final RabbitLinePay INSTANCE = new RabbitLinePay();

        private RabbitLinePay() {
            super("rabbit_linepay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$ShopeePay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class ShopeePay extends SourceType {
        @NotNull
        public static final ShopeePay INSTANCE = new ShopeePay();

        private ShopeePay() {
            super("shopeepay", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$ShopeePayJumpApp;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class ShopeePayJumpApp extends SourceType {
        @NotNull
        public static final ShopeePayJumpApp INSTANCE = new ShopeePayJumpApp();

        private ShopeePayJumpApp() {
            super("shopeepay_jumpapp", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/SourceType$TouchNGo;", "Lco/omise/android/models/SourceType;", "provider", "", "(Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class TouchNGo extends SourceType {
        @Nullable
        private final String provider;

        public TouchNGo() {
            this(null, 1, null);
        }

        public static /* synthetic */ TouchNGo copy$default(TouchNGo touchNGo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = touchNGo.provider;
            }
            return touchNGo.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.provider;
        }

        @NotNull
        public final TouchNGo copy(@Nullable String str) {
            return new TouchNGo(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TouchNGo) && Intrinsics.areEqual(this.provider, ((TouchNGo) obj).provider);
        }

        @Nullable
        public final String getProvider() {
            return this.provider;
        }

        public int hashCode() {
            String str = this.provider;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "TouchNGo(provider=" + this.provider + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public TouchNGo(@Nullable String str) {
            super("touch_n_go", null);
            this.provider = str;
        }

        public /* synthetic */ TouchNGo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$TrueMoney;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class TrueMoney extends SourceType {
        @NotNull
        public static final TrueMoney INSTANCE = new TrueMoney();

        private TrueMoney() {
            super("truemoney", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$TrueMoneyJumpApp;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class TrueMoneyJumpApp extends SourceType {
        @NotNull
        public static final TrueMoneyJumpApp INSTANCE = new TrueMoneyJumpApp();

        private TrueMoneyJumpApp() {
            super("truemoney_jumpapp", null);
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lco/omise/android/models/SourceType$Unknown;", "Lco/omise/android/models/SourceType;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Unknown extends SourceType {
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

        @Override // co.omise.android.models.SourceType
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

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/models/SourceType$WeChatPay;", "Lco/omise/android/models/SourceType;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class WeChatPay extends SourceType {
        @NotNull
        public static final WeChatPay INSTANCE = new WeChatPay();

        private WeChatPay() {
            super("wechat_pay", null);
        }
    }

    public /* synthetic */ SourceType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    @JsonCreator
    @SuppressLint({"DefaultLocale"})
    @NotNull
    public static final SourceType creator(@Nullable String str) {
        return Companion.creator(str);
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    private SourceType(String str) {
        this.name = str;
    }
}
