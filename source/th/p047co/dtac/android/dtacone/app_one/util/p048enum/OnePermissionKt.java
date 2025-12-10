package th.p047co.dtac.android.dtacone.app_one.util.p048enum;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.p027bm.Rule;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.home.groupService.HomeExtKt;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, m28850d2 = {"getOneIconByPermission", "", "", "company", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.enum.OnePermissionKt */
/* loaded from: classes7.dex */
public final class OnePermissionKt {
    public static final int getOneIconByPermission(@NotNull String str, @NotNull String company) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(company, "company");
        if (Intrinsics.areEqual(company, "TRUE")) {
            switch (str.hashCode()) {
                case -2054117291:
                    if (str.equals(PermissionConstant.M_REGS_PRE)) {
                        return R.drawable.ic_one_red_prepaid;
                    }
                    break;
                case -2000650492:
                    if (str.equals(PermissionConstant.M_ESIM)) {
                        return R.drawable.ic_one_red_esim;
                    }
                    break;
                case -1876882402:
                    if (str.equals(PermissionConstant.M_TOP_UP)) {
                        return R.drawable.ic_one_red_topup;
                    }
                    break;
                case -1871062906:
                    if (str.equals(PermissionConstant.M_RECTIFY)) {
                        return R.drawable.ic_one_red_rectify;
                    }
                    break;
                case -1471258786:
                    if (str.equals(PermissionConstant.M_PRE2_POST)) {
                        return R.drawable.ic_one_red_pre2post;
                    }
                    break;
                case -719008090:
                    if (str.equals(PermissionConstant.M_MULT_PRE)) {
                        return R.drawable.ic_one_red_bulk_regist;
                    }
                    break;
                case -423880016:
                    if (str.equals(PermissionConstant.M_XNTL_MNP)) {
                        return R.drawable.ic_one_red_mnp;
                    }
                    break;
                case -311817006:
                    if (str.equals(PermissionConstant.M_RTR_PRFRMNCE)) {
                        return R.drawable.ic_one_red_report;
                    }
                    break;
                case -116194779:
                    if (str.equals(PermissionConstant.PORTIN_POSTPAID)) {
                        return R.drawable.ic_one_red_mnp;
                    }
                    break;
                case 74023715:
                    if (str.equals(PermissionConstant.M_STV)) {
                        return R.drawable.ic_one_red_stv;
                    }
                    break;
                case 74024511:
                    if (str.equals(PermissionConstant.M_TOL)) {
                        return R.drawable.ic_one_red_tol;
                    }
                    break;
                case 180022648:
                    if (str.equals(PermissionConstant.M_ACT_SIM)) {
                        return R.drawable.ic_one_red_activate_sim;
                    }
                    break;
                case 299825463:
                    if (str.equals(PermissionConstant.M_SALE_ORDR)) {
                        return R.drawable.ic_one_red_device_sale;
                    }
                    break;
                case 425364462:
                    if (str.equals(PermissionConstant.M_CHNG_PWD)) {
                        return R.drawable.ic_one_red_change_password;
                    }
                    break;
                case 425366920:
                    if (str.equals(PermissionConstant.M_CHNG_SIM)) {
                        return R.drawable.ic_one_red_change_sim;
                    }
                    break;
                case 483895078:
                    if (str.equals(PermissionConstant.M_NBTC_RE_IDEN)) {
                        return R.drawable.ic_one_nbtc_re_iden_true;
                    }
                    break;
                case 612691775:
                    if (str.equals(PermissionConstant.M_CHNG_OWNR_PRE)) {
                        return R.drawable.ic_one_red_update_prepaid;
                    }
                    break;
                case 746871054:
                    if (str.equals(PermissionConstant.M_REGS_POST)) {
                        return R.drawable.ic_one_red_postpaid;
                    }
                    break;
                case 820914783:
                    if (str.equals(PermissionConstant.MNP_PREPAID)) {
                        return R.drawable.ic_one_red_mnp;
                    }
                    break;
                case 1218641323:
                    if (str.equals(PermissionConstant.M_TRANS_HIST)) {
                        return R.drawable.ic_one_red_transaction_history;
                    }
                    break;
                case 1715952348:
                    if (str.equals(PermissionConstant.MNP_POSTPAID)) {
                        return R.drawable.ic_one_red_mnp;
                    }
                    break;
                case 1850313652:
                    if (str.equals(PermissionConstant.M_QR_SCANNER)) {
                        return R.drawable.ic_esig_qr_scan;
                    }
                    break;
                case 1943118610:
                    if (str.equals(PermissionConstant.M_CHNG_PFL_PIC)) {
                        return R.drawable.ic_one_red_edit_profile_image;
                    }
                    break;
                case 1966832676:
                    if (str.equals(PermissionConstant.M_CHNG_PRE_PACK)) {
                        return R.drawable.ic_one_red_change_main_pack;
                    }
                    break;
            }
            return HomeExtKt.getHomeIconImage(str);
        }
        switch (str.hashCode()) {
            case -2054117291:
                if (str.equals(PermissionConstant.M_REGS_PRE)) {
                    return R.drawable.ic_one_blue_prepaid;
                }
                break;
            case -2000650492:
                if (str.equals(PermissionConstant.M_ESIM)) {
                    return R.drawable.ic_one_blue_esim;
                }
                break;
            case -1876882402:
                if (str.equals(PermissionConstant.M_TOP_UP)) {
                    return R.drawable.ic_one_blue_topup;
                }
                break;
            case -1871062906:
                if (str.equals(PermissionConstant.M_RECTIFY)) {
                    return R.drawable.ic_one_blue_rectify;
                }
                break;
            case -1471258786:
                if (str.equals(PermissionConstant.M_PRE2_POST)) {
                    return R.drawable.ic_one_blue_pre2post;
                }
                break;
            case -719008090:
                if (str.equals(PermissionConstant.M_MULT_PRE)) {
                    return R.drawable.ic_one_blue_bulk_regist;
                }
                break;
            case -423880016:
                if (str.equals(PermissionConstant.M_XNTL_MNP)) {
                    return R.drawable.ic_one_blue_mnp;
                }
                break;
            case -311817006:
                if (str.equals(PermissionConstant.M_RTR_PRFRMNCE)) {
                    return R.drawable.ic_one_blue_report;
                }
                break;
            case -116194779:
                if (str.equals(PermissionConstant.PORTIN_POSTPAID)) {
                    return R.drawable.ic_one_blue_mnp;
                }
                break;
            case 74023715:
                if (str.equals(PermissionConstant.M_STV)) {
                    return R.drawable.ic_one_blue_stv;
                }
                break;
            case 180022648:
                if (str.equals(PermissionConstant.M_ACT_SIM)) {
                    return R.drawable.ic_one_blue_activate_sim;
                }
                break;
            case 299825463:
                if (str.equals(PermissionConstant.M_SALE_ORDR)) {
                    return R.drawable.ic_one_blue_device_sale;
                }
                break;
            case 425364462:
                if (str.equals(PermissionConstant.M_CHNG_PWD)) {
                    return R.drawable.ic_one_blue_change_password;
                }
                break;
            case 425366920:
                if (str.equals(PermissionConstant.M_CHNG_SIM)) {
                    return R.drawable.ic_one_blue_change_sim;
                }
                break;
            case 483895078:
                if (str.equals(PermissionConstant.M_NBTC_RE_IDEN)) {
                    return R.drawable.ic_one_nbtc_re_iden;
                }
                break;
            case 612691775:
                if (str.equals(PermissionConstant.M_CHNG_OWNR_PRE)) {
                    return R.drawable.ic_one_blue_update_prepaid;
                }
                break;
            case 746871054:
                if (str.equals(PermissionConstant.M_REGS_POST)) {
                    return R.drawable.ic_one_blue_postpaid;
                }
                break;
            case 820914783:
                if (str.equals(PermissionConstant.MNP_PREPAID)) {
                    return R.drawable.ic_one_blue_mnp;
                }
                break;
            case 1218641323:
                if (str.equals(PermissionConstant.M_TRANS_HIST)) {
                    return R.drawable.ic_one_blue_transaction_history;
                }
                break;
            case 1715952348:
                if (str.equals(PermissionConstant.MNP_POSTPAID)) {
                    return R.drawable.ic_one_blue_mnp;
                }
                break;
            case 1850313652:
                if (str.equals(PermissionConstant.M_QR_SCANNER)) {
                    return R.drawable.ic_esig_qr_scan_d;
                }
                break;
            case 1943118610:
                if (str.equals(PermissionConstant.M_CHNG_PFL_PIC)) {
                    return R.drawable.ic_one_blue_edit_profile_image;
                }
                break;
            case 1966832676:
                if (str.equals(PermissionConstant.M_CHNG_PRE_PACK)) {
                    return R.drawable.ic_one_blue_change_main_pack;
                }
                break;
        }
        return HomeExtKt.getHomeIconImage(str);
    }

    public static /* synthetic */ int getOneIconByPermission$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = Rule.ALL;
        }
        return getOneIconByPermission(str, str2);
    }
}
