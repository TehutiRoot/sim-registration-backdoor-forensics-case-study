package th.p047co.dtac.android.dtacone.extension.format;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\f\u0010\b\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\r\u0010\b\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a#\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a/\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0000*\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0000*\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0011\u0010\u0018\u001a\u00020\u0000*\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0000*\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m28850d2 = {"", "province", "prefix", "toDistrict", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "prefixOptional", PDPageLabelRange.STYLE_LETTERS_LOWER, "toReplaceProvince", "(Ljava/lang/String;)Ljava/lang/String;", "toReplaceDistrict", "toReplaceSubDistrict", "toReplacePrefixProvince", "toReplacePrefixDistrict", "toReplacePrefixSubDistrict", "toProvince", "toSubDistrict", "address", "bkkPrefix", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "toShowHomeNo", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)Ljava/lang/String;", "toShowHomeNoOnly", "toShowAddress2", "toShowAdditionalAddress", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressFormatExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressFormatExt.kt\nth/co/dtac/android/dtacone/extension/format/AddressFormatExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n766#2:86\n857#2,2:87\n766#2:89\n857#2,2:90\n766#2:92\n857#2,2:93\n766#2:95\n857#2,2:96\n*S KotlinDebug\n*F\n+ 1 AddressFormatExt.kt\nth/co/dtac/android/dtacone/extension/format/AddressFormatExtKt\n*L\n68#1:86\n68#1:87,2\n73#1:89\n73#1:90,2\n78#1:92\n78#1:93,2\n84#1:95\n84#1:96,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.format.AddressFormatExtKt */
/* loaded from: classes7.dex */
public final class AddressFormatExtKt {
    /* renamed from: a */
    public static final String m19474a(String str, String str2, String str3) {
        return AbstractC20204hN1.replace$default(AbstractC20204hN1.replace$default(str, str2, "", false, 4, (Object) null), str3, "", false, 4, (Object) null);
    }

    /* renamed from: b */
    public static final String m19473b(String str, String str2, String str3, String str4) {
        if (CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"กรุงเทพ", "จ.กรุงเทพ", "กรุงเทพมหานคร", "จ.กรุงเทพมหานคร"}).contains(str)) {
            return AbstractC20204hN1.replace$default(str2, str3, str4, false, 4, (Object) null);
        }
        return str2;
    }

    @NotNull
    public static final String toDistrict(@NotNull String str, @NotNull String province, @NotNull String prefix) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (AbstractC20204hN1.startsWith$default(str, "อำเภอ", false, 2, null)) {
            str2 = AbstractC20204hN1.replace$default(str, "อำเภอ", prefix, false, 4, (Object) null);
        } else if (AbstractC20204hN1.startsWith$default(str, "อ.", false, 2, null)) {
            str2 = AbstractC20204hN1.replace$default(str, "อ.", prefix, false, 4, (Object) null);
        } else {
            str2 = prefix + str;
        }
        return m19473b(toProvince(province), str2, prefix, "เขต");
    }

    public static /* synthetic */ String toDistrict$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = "อ.";
        }
        return toDistrict(str, str2, str3);
    }

    @NotNull
    public static final String toProvince(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!AbstractC20204hN1.startsWith$default(str, "จังหวัด", false, 2, null) && !AbstractC20204hN1.startsWith$default(str, "จ.", false, 2, null)) {
            return m19473b("จ." + str, "จ." + str, "จ.", "");
        }
        String replace$default = AbstractC20204hN1.replace$default(str, "จังหวัด", "จ.", false, 4, (Object) null);
        return m19473b(replace$default, replace$default, "จ.", "");
    }

    @NotNull
    public static final String toReplaceDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m19474a(str, "อำเภอ", "");
    }

    @NotNull
    public static final String toReplacePrefixDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m19474a(str, "อำเภอ", "อ.");
    }

    @NotNull
    public static final String toReplacePrefixProvince(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m19474a(str, "จังหวัด", "จ.");
    }

    @NotNull
    public static final String toReplacePrefixSubDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m19474a(str, "ตำบล", "ต.");
    }

    @NotNull
    public static final String toReplaceProvince(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m19474a(str, "จังหวัด", "");
    }

    @NotNull
    public static final String toReplaceSubDistrict(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m19474a(str, "ตำบล", "");
    }

    @NotNull
    public static final String toShowAdditionalAddress(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{idCardInformationCollection.getMoo(), idCardInformationCollection.getSoi(), idCardInformationCollection.getRoad()})) {
            if (((String) obj) != null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String toShowAddress2(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{idCardInformationCollection.getMoo(), idCardInformationCollection.getSoi(), idCardInformationCollection.getRoad()})) {
            if (((String) obj) != null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String toShowHomeNo(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{idCardInformationCollection.getHouseNo(), idCardInformationCollection.getMoo(), idCardInformationCollection.getSoi(), idCardInformationCollection.getRoad()})) {
            if (((String) obj) != null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String toShowHomeNoOnly(@NotNull IdCardInformationCollection idCardInformationCollection) {
        Intrinsics.checkNotNullParameter(idCardInformationCollection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : AbstractC10108ds.listOf(idCardInformationCollection.getHouseNo())) {
            if (((String) obj) != null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String toSubDistrict(@NotNull String str, @NotNull String province, @NotNull String prefix) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (AbstractC20204hN1.startsWith$default(str, "ตำบล", false, 2, null)) {
            str2 = AbstractC20204hN1.replace$default(str, "ตำบล", prefix, false, 4, (Object) null);
        } else if (AbstractC20204hN1.startsWith$default(str, "ต.", false, 2, null)) {
            str2 = AbstractC20204hN1.replace$default(str, "ต.", prefix, false, 4, (Object) null);
        } else {
            str2 = prefix + str;
        }
        return m19473b(toProvince(province), str2, prefix, "แขวง");
    }

    public static /* synthetic */ String toSubDistrict$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = "ต.";
        }
        return toSubDistrict(str, str2, str3);
    }
}
