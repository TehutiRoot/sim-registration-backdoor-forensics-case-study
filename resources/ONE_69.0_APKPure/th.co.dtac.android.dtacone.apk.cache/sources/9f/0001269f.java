package th.p047co.dtac.android.dtacone.util;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a\u001c\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000b*\u00020\u0002¨\u0006\f"}, m29142d2 = {"address1", "", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "address1ForSubmit", "address2", "address2ForSubmit", "applyDefaultBirthDateSmartCard", "getFullGenderDefault", "getGenderDefault", "getTitle", "removePrefixAddress", "Lkotlin/Triple;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.IdCardInformationCollectionHelperKt */
/* loaded from: classes8.dex */
public final class IdCardInformationCollectionHelperKt {
    @NotNull
    public static final String address1(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(idCardInformationCollection.getHouseNo());
        String moo = idCardInformationCollection.getMoo();
        if (moo != null && moo.length() != 0) {
            String moo2 = idCardInformationCollection.getMoo();
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + moo2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        String soi = idCardInformationCollection.getSoi();
        if (soi != null && soi.length() != 0) {
            String soi2 = idCardInformationCollection.getSoi();
            sb.append(soi2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        String road = idCardInformationCollection.getRoad();
        if (road != null && road.length() != 0) {
            sb.append(idCardInformationCollection.getRoad());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "address1.toString()");
        return StringsKt__StringsKt.trim(sb2).toString();
    }

    @NotNull
    public static final String address1ForSubmit(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(idCardInformationCollection.getHouseNo());
        String moo = idCardInformationCollection.getMoo();
        if (moo != null && moo.length() != 0) {
            String moo2 = idCardInformationCollection.getMoo();
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + moo2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        String soi = idCardInformationCollection.getSoi();
        if (soi != null && soi.length() != 0) {
            String soi2 = idCardInformationCollection.getSoi();
            sb.append(soi2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        String road = idCardInformationCollection.getRoad();
        if (road != null && road.length() != 0) {
            sb.append(idCardInformationCollection.getRoad());
        }
        String subDistrict = idCardInformationCollection.getSubDistrict();
        if (subDistrict != null && subDistrict.length() != 0) {
            sb.append(idCardInformationCollection.getSubDistrict());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "address1.toString()");
        return StringsKt__StringsKt.trim(sb2).toString();
    }

    @NotNull
    public static final String address2(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        return removePrefixAddress(idCardInformationCollection).getSecond();
    }

    @NotNull
    public static final String address2ForSubmit(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        String district = idCardInformationCollection.getDistrict();
        String province = idCardInformationCollection.getProvince();
        return district + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + province;
    }

    @NotNull
    public static final String applyDefaultBirthDateSmartCard(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() < 8) {
            String take = StringsKt___StringsKt.take(str, 4);
            return take + "0101";
        }
        return str;
    }

    @NotNull
    public static final String getFullGenderDefault(@Nullable IdCardInformationCollection idCardInformationCollection) {
        String str;
        if (idCardInformationCollection != null) {
            str = idCardInformationCollection.getGender();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "1") || !Intrinsics.areEqual(str, "2")) {
            return "MALE";
        }
        return "FEMALE";
    }

    @NotNull
    public static final String getGenderDefault(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        String gender = idCardInformationCollection.getGender();
        if (Intrinsics.areEqual(gender, "1")) {
            return "M";
        }
        if (Intrinsics.areEqual(gender, "2")) {
            return "F";
        }
        return PDBorderStyleDictionary.STYLE_UNDERLINE;
    }

    @NotNull
    public static final String getTitle(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        if (Intrinsics.areEqual("น.ส.", idCardInformationCollection.getPrefixTH())) {
            return "นางสาว";
        }
        String prefixTH = idCardInformationCollection.getPrefixTH();
        Intrinsics.checkNotNullExpressionValue(prefixTH, "prefixTH");
        return prefixTH;
    }

    @NotNull
    public static final Triple<String, String, String> removePrefixAddress(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        String province = idCardInformationCollection.getProvince();
        Intrinsics.checkNotNullExpressionValue(province, "province");
        String replace$default = AbstractC19741eO1.replace$default(province, "จังหวัด", "", false, 4, (Object) null);
        String subDistrict = idCardInformationCollection.getSubDistrict();
        Intrinsics.checkNotNullExpressionValue(subDistrict, "subDistrict");
        String replace$default2 = AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(subDistrict, "ตำบล", "", false, 4, (Object) null), "แขวง", "", false, 4, (Object) null);
        String district = idCardInformationCollection.getDistrict();
        Intrinsics.checkNotNullExpressionValue(district, "district");
        return new Triple<>(replace$default, replace$default2, AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(district, "อำเภอ", "", false, 4, (Object) null), "เขต", "", false, 4, (Object) null));
    }
}