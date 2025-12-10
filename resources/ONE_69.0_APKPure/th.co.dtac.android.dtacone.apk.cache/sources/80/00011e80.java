package th.p047co.dtac.android.dtacone.model.home.groupService;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m29142d2 = {"getHomeIconImage", "", "", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.home.groupService.HomeExtKt */
/* loaded from: classes8.dex */
public final class HomeExtKt {
    public static final int getHomeIconImage(@Nullable String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2054117291:
                    if (str.equals(PermissionConstant.M_REGS_PRE)) {
                        return R.drawable.ic_home_prepaid;
                    }
                    break;
                case -2000650492:
                    if (str.equals(PermissionConstant.M_ESIM)) {
                        return R.drawable.icon_esim;
                    }
                    break;
                case -1876882402:
                    if (str.equals(PermissionConstant.M_TOP_UP)) {
                        return R.drawable.ic_home_topup;
                    }
                    break;
                case -1871062906:
                    if (str.equals(PermissionConstant.M_RECTIFY)) {
                        return R.drawable.ic_home_refund;
                    }
                    break;
                case -1471258786:
                    if (str.equals(PermissionConstant.M_PRE2_POST)) {
                        return R.drawable.ic_home_pre2post;
                    }
                    break;
                case -719008090:
                    if (str.equals(PermissionConstant.M_MULT_PRE)) {
                        return R.drawable.ic_home_multi_sim;
                    }
                    break;
                case -585509951:
                    if (str.equals(PermissionConstant.M_FAMI_SIM)) {
                        return R.drawable.icon_menu_familysim;
                    }
                    break;
                case -423880016:
                    if (str.equals(PermissionConstant.M_XNTL_MNP)) {
                        return R.drawable.ic_home_mnp;
                    }
                    break;
                case -116194779:
                    if (str.equals(PermissionConstant.PORTIN_POSTPAID)) {
                        return R.drawable.ic_home_mnp;
                    }
                    break;
                case 74023715:
                    if (str.equals(PermissionConstant.M_STV)) {
                        return R.drawable.ic_home_stv_proserm;
                    }
                    break;
                case 180022648:
                    if (str.equals(PermissionConstant.M_ACT_SIM)) {
                        return R.drawable.ic_home_sim_act;
                    }
                    break;
                case 299825463:
                    if (str.equals(PermissionConstant.M_SALE_ORDR)) {
                        return R.drawable.icons_main_buydevice;
                    }
                    break;
                case 301375336:
                    if (str.equals(PermissionConstant.M_CHNG_PACK)) {
                        return R.drawable.icons_main_changepack;
                    }
                    break;
                case 358720244:
                    if (str.equals(PermissionConstant.M_BUYDOL_HIST)) {
                        return R.drawable.ic_buy_dol_history;
                    }
                    break;
                case 425366920:
                    if (str.equals(PermissionConstant.M_CHNG_SIM)) {
                        return R.drawable.ic_home_change_sim;
                    }
                    break;
                case 483895078:
                    if (str.equals(PermissionConstant.M_NBTC_RE_IDEN)) {
                        return R.drawable.ic_nbtc_re_iden;
                    }
                    break;
                case 612691775:
                    if (str.equals(PermissionConstant.M_CHNG_OWNR_PRE)) {
                        return R.drawable.ic_home_update_prepaid;
                    }
                    break;
                case 746499760:
                    if (str.equals(PermissionConstant.M_REGS_DAHM)) {
                        return R.drawable.ic_home_dah;
                    }
                    break;
                case 746871054:
                    if (str.equals(PermissionConstant.M_REGS_POST)) {
                        return R.drawable.ic_home_postpaid;
                    }
                    break;
                case 820914783:
                    if (str.equals(PermissionConstant.MNP_PREPAID)) {
                        return R.drawable.ic_home_mnp;
                    }
                    break;
                case 1715952348:
                    if (str.equals(PermissionConstant.MNP_POSTPAID)) {
                        return R.drawable.ic_home_mnp;
                    }
                    break;
                case 1943118610:
                    if (str.equals(PermissionConstant.M_CHNG_PFL_PIC)) {
                        return R.drawable.ic_camera_permission;
                    }
                    break;
            }
        }
        return R.drawable.image_default;
    }
}