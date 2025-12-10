package th.p047co.dtac.android.dtacone.util.constant;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\nR\u0014\u00104\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\nR\u0014\u00105\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00106\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\nR\u0014\u00107\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\nR\u0014\u00108\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\nR\u0014\u00109\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\nR\u0014\u0010:\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\nR\u0014\u0010;\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\nR\u0014\u0010<\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\nR\u0014\u0010=\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\nR\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR;\u0010K\u001a&\u0012\f\u0012\n E*\u0004\u0018\u00010\u00050\u0005 E*\u0012\u0012\f\u0012\n E*\u0004\u0018\u00010\u00050\u0005\u0018\u00010F0D8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006L"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/PermissionConstant;", "", "<init>", "()V", "", "", "", "getImageTransactionType", "()Ljava/util/Map;", "M_TOP_UP", "Ljava/lang/String;", PermissionConstant.M_STV, PermissionConstant.M_RECTIFY, PermissionConstant.M_REGS_PRE, "PORTIN", PermissionConstant.M_RTR_PRFRMNCE, PermissionConstant.M_PRE2_POST, PermissionConstant.M_REGS_POST, PermissionConstant.PORTIN_POSTPAID, PermissionConstant.M_XNTL_MNP, PermissionConstant.MNP_PREPAID, PermissionConstant.MNP_POSTPAID, PermissionConstant.M_STAFF_PRMSSN, PermissionConstant.M_STAFF_MANAGE, PermissionConstant.M_CHNG_SIM, "E_PIN", PermissionConstant.M_ONLINE_STORE, PermissionConstant.M_CHNG_OWNR_PRE, "M_QR_SCANNER", "M_BUY_DOL", PermissionConstant.M_BUYDOL_HIST, PermissionConstant.M_RTR_PROFILE, PermissionConstant.M_CHNG_PFL_PIC, PermissionConstant.M_CAMPAIGN, PermissionConstant.M_ACT_SIM, PermissionConstant.M_PROFIT_REP, PermissionConstant.M_TRANS_HIST, PermissionConstant.M_SALES_SUMM, PermissionConstant.M_COMMISSION, PermissionConstant.M_CHNG_PACK, PermissionConstant.M_CHNG_PRE_PACK, PermissionConstant.M_SALE_ORDR, PermissionConstant.M_SALE_ORDR_ONLY, PermissionConstant.M_REGS_DAHM, PermissionConstant.M_FAMI_SIM, PermissionConstant.M_ESIM, PermissionConstant.M_MISSION, PermissionConstant.M_TAKE_PHOT, PermissionConstant.M_CHNG_PWD, PermissionConstant.M_PROMOTER_RTR, PermissionConstant.M_SALE_RCMMND, PermissionConstant.M_HEAL_CHCK, PermissionConstant.M_ENQY_CUST, PermissionConstant.M_FACE_RECO, PermissionConstant.M_3PRV_SERV, PermissionConstant.M_COUP_CHCK, PermissionConstant.M_EXPR_PACK, PermissionConstant.M_ELIGIBLE, PermissionConstant.M_MULT_PRE, PermissionConstant.M_NBTC_RE_IDEN, PermissionConstant.M_TOL, PermissionConstant.M_NAD_OB, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[Ljava/lang/String;", "getPortin", "()[Ljava/lang/String;", "portin", "", "kotlin.jvm.PlatformType", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getALL_MNP", "()Ljava/util/List;", "ALL_MNP", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.constant.PermissionConstant */
/* loaded from: classes8.dex */
public final class PermissionConstant {
    public static final int $stable;
    @NotNull
    public static final String E_PIN = "E-PIN";
    @NotNull
    public static final String MNP_POSTPAID = "MNP_POSTPAID";
    @NotNull
    public static final String MNP_PREPAID = "MNP_PREPAID";
    @NotNull
    public static final String M_3PRV_SERV = "M_3PRV_SERV";
    @NotNull
    public static final String M_ACT_SIM = "M_ACT_SIM";
    @NotNull
    public static final String M_BUYDOL_HIST = "M_BUYDOL_HIST";
    @NotNull
    public static final String M_CAMPAIGN = "M_CAMPAIGN";
    @NotNull
    public static final String M_CHNG_OWNR_PRE = "M_CHNG_OWNR_PRE";
    @NotNull
    public static final String M_CHNG_PACK = "M_CHNG_PACK";
    @NotNull
    public static final String M_CHNG_PFL_PIC = "M_CHNG_PFL_PIC";
    @NotNull
    public static final String M_CHNG_PRE_PACK = "M_CHNG_PRE_PACK";
    @NotNull
    public static final String M_CHNG_PWD = "M_CHNG_PWD";
    @NotNull
    public static final String M_CHNG_SIM = "M_CHNG_SIM";
    @NotNull
    public static final String M_COMMISSION = "M_COMMISSION";
    @NotNull
    public static final String M_COUP_CHCK = "M_COUP_CHCK";
    @NotNull
    public static final String M_ELIGIBLE = "M_ELIGIBLE";
    @NotNull
    public static final String M_ENQY_CUST = "M_ENQY_CUST";
    @NotNull
    public static final String M_ESIM = "M_ESIM";
    @NotNull
    public static final String M_EXPR_PACK = "M_EXPR_PACK";
    @NotNull
    public static final String M_FACE_RECO = "M_FACE_RECO";
    @NotNull
    public static final String M_FAMI_SIM = "M_FAMI_SIM";
    @NotNull
    public static final String M_HEAL_CHCK = "M_HEAL_CHCK";
    @NotNull
    public static final String M_MISSION = "M_MISSION";
    @NotNull
    public static final String M_MULT_PRE = "M_MULT_PRE";
    @NotNull
    public static final String M_NAD_OB = "M_NAD_OB";
    @NotNull
    public static final String M_NBTC_RE_IDEN = "M_NBTC_RE_IDEN";
    @NotNull
    public static final String M_ONLINE_STORE = "M_ONLINE_STORE";
    @NotNull
    public static final String M_PRE2_POST = "M_PRE2_POST";
    @NotNull
    public static final String M_PROFIT_REP = "M_PROFIT_REP";
    @NotNull
    public static final String M_PROMOTER_RTR = "M_PROMOTER_RTR";
    @NotNull
    public static final String M_QR_SCANNER = "M_TAKE_PHOTO_QR";
    @NotNull
    public static final String M_RECTIFY = "M_RECTIFY";
    @NotNull
    public static final String M_REGS_DAHM = "M_REGS_DAHM";
    @NotNull
    public static final String M_REGS_POST = "M_REGS_POST";
    @NotNull
    public static final String M_REGS_PRE = "M_REGS_PRE";
    @NotNull
    public static final String M_RTR_PRFRMNCE = "M_RTR_PRFRMNCE";
    @NotNull
    public static final String M_RTR_PROFILE = "M_RTR_PROFILE";
    @NotNull
    public static final String M_SALES_SUMM = "M_SALES_SUMM";
    @NotNull
    public static final String M_SALE_ORDR = "M_SALE_ORDR";
    @NotNull
    public static final String M_SALE_ORDR_ONLY = "M_SALE_ORDR_ONLY";
    @NotNull
    public static final String M_SALE_RCMMND = "M_SALE_RCMMND";
    @NotNull
    public static final String M_STAFF_MANAGE = "M_STAFF_MANAGE";
    @NotNull
    public static final String M_STAFF_PRMSSN = "M_STAFF_PRMSSN";
    @NotNull
    public static final String M_STV = "M_STV";
    @NotNull
    public static final String M_TAKE_PHOT = "M_TAKE_PHOT";
    @NotNull
    public static final String M_TOL = "M_TOL";
    @NotNull
    public static final String M_TOP_UP = "M_TOPUP";
    @NotNull
    public static final String M_TRANS_HIST = "M_TRANS_HIST";
    @NotNull
    public static final String M_XNTL_MNP = "M_XNTL_MNP";
    @NotNull
    public static final String PORTIN = "PORTIN";
    @NotNull
    public static final String PORTIN_POSTPAID = "PORTIN_POSTPAID";

    /* renamed from: a */
    public static final String[] f87123a;

    /* renamed from: b */
    public static final List f87124b;
    @NotNull
    public static final PermissionConstant INSTANCE = new PermissionConstant();
    @JvmField
    @NotNull
    public static final String M_BUY_DOL = "M_BUY_DOL";

    static {
        String[] strArr = {MNP_POSTPAID, MNP_PREPAID, PORTIN_POSTPAID, M_XNTL_MNP};
        f87123a = strArr;
        f87124b = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
        $stable = 8;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, Integer> getImageTransactionType() {
        HashMap hashMap = new HashMap();
        hashMap.put(M_TOP_UP, Integer.valueOf(R.drawable.ic_home_topup));
        hashMap.put(M_STV, Integer.valueOf(R.drawable.ic_home_stv_proserm));
        hashMap.put(M_RECTIFY, Integer.valueOf(R.drawable.ic_home_refund));
        hashMap.put(M_REGS_PRE, Integer.valueOf(R.drawable.ic_home_prepaid));
        hashMap.put(PORTIN_POSTPAID, Integer.valueOf(R.drawable.ic_home_mnp));
        hashMap.put(M_XNTL_MNP, Integer.valueOf(R.drawable.ic_home_mnp));
        hashMap.put(MNP_POSTPAID, Integer.valueOf(R.drawable.ic_home_mnp));
        hashMap.put(MNP_PREPAID, Integer.valueOf(R.drawable.ic_home_mnp));
        hashMap.put(M_CHNG_SIM, Integer.valueOf(R.drawable.ic_home_change_sim));
        hashMap.put(M_PRE2_POST, Integer.valueOf(R.drawable.ic_home_pre2post));
        hashMap.put(M_RTR_PRFRMNCE, Integer.valueOf(R.drawable.banner_rtr));
        hashMap.put(M_STAFF_MANAGE, Integer.valueOf(R.drawable.banner_staff_manage_permission));
        hashMap.put(M_STAFF_PRMSSN, Integer.valueOf(R.drawable.banner_staff_permission));
        hashMap.put(M_REGS_POST, Integer.valueOf(R.drawable.simpostpaid));
        hashMap.put("E-PIN", Integer.valueOf(R.drawable.banner_epin));
        hashMap.put(M_CHNG_OWNR_PRE, Integer.valueOf(R.drawable.ic_home_update_prepaid));
        hashMap.put(M_BUY_DOL, Integer.valueOf(R.drawable.banner_buy_dol_permission));
        hashMap.put(M_BUYDOL_HIST, Integer.valueOf(R.drawable.ic_buy_dol_history));
        hashMap.put(M_CHNG_PFL_PIC, Integer.valueOf(R.drawable.ic_camera_permission));
        hashMap.put(M_ACT_SIM, Integer.valueOf(R.drawable.ic_home_sim_act));
        hashMap.put(M_CHNG_PRE_PACK, Integer.valueOf(R.drawable.ic_home_change_main_pack));
        hashMap.put(M_SALE_ORDR, Integer.valueOf(R.drawable.ic_home_device_sale));
        hashMap.put(M_CHNG_PACK, Integer.valueOf(R.drawable.ic_home_change_pack));
        hashMap.put(M_REGS_DAHM, Integer.valueOf(R.drawable.ic_home_dah));
        hashMap.put(M_EXPR_PACK, Integer.valueOf(R.drawable.icon_cancelpackage));
        hashMap.put(M_FAMI_SIM, Integer.valueOf(R.drawable.icon_menu_familysim));
        hashMap.put(M_ESIM, Integer.valueOf(R.drawable.icon_esim));
        hashMap.put(M_MULT_PRE, Integer.valueOf(R.drawable.ic_home_multi_sim));
        hashMap.put(M_NBTC_RE_IDEN, Integer.valueOf(R.drawable.ic_nbtc_re_iden));
        hashMap.put(M_QR_SCANNER, Integer.valueOf(R.drawable.ic_qr_scan));
        return hashMap;
    }

    public final List<String> getALL_MNP() {
        return f87124b;
    }

    @NotNull
    public final String[] getPortin() {
        return f87123a;
    }
}