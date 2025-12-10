package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RequestKt;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u009a\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010-J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\u009c\u0003\u0010©\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0016\u0010ª\u0001\u001a\u00030«\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u00ad\u0001\u001a\u00030®\u0001HÖ\u0001J\n\u0010¯\u0001\u001a\u00020\u0003HÖ\u0001R\u001e\u0010(\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010/\"\u0004\b;\u00101R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010/\"\u0004\b?\u00101R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010/\"\u0004\bA\u00101R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010)\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010/\"\u0004\bO\u00101R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010/\"\u0004\bQ\u00101R\u001e\u0010&\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010/\"\u0004\bS\u00101R\u001e\u0010*\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010/\"\u0004\bU\u00101R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010/\"\u0004\bW\u00101R\u001e\u0010'\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010/\"\u0004\bY\u00101R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010/\"\u0004\b[\u00101R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010/\"\u0004\b]\u00101R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010/\"\u0004\b_\u00101R\u001e\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010/\"\u0004\ba\u00101R\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010/\"\u0004\be\u00101R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010/\"\u0004\bg\u00101R\u001e\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010/\"\u0004\bi\u00101R\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010/\"\u0004\bk\u00101R\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010/\"\u0004\bm\u00101R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010/\"\u0004\bo\u00101R \u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010/\"\u0004\bq\u00101R \u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010/\"\u0004\bs\u00101R\u001e\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010/\"\u0004\bu\u00101R\u001e\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010/\"\u0004\bw\u00101R\u001e\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010/\"\u0004\by\u00101R\u001e\u0010 \u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010/\"\u0004\b{\u00101R\u001e\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010/\"\u0004\b}\u00101R\u001e\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010/\"\u0004\b\u007f\u00101R \u0010%\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010/\"\u0005\b\u0081\u0001\u00101¨\u0006°\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/SaveChangePackageModel;", "", "channel", "", "cmpFlag", "companyCode", "customerNumber", "groupCode", "lastChangeDateTime", "locationCode", "newPackageGroupDescription", "newPackageGroupCode", "nextCycle", "Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "offersPackage", "", "Lth/co/dtac/android/dtacone/model/change_pack/OffersPackageItem;", "packageCode", "packageDescription", ConstsKt.TELEPHONE_TYPE, "requesterId", "rtrName", "rtrCode", "saveFlag", "source", "subChannel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberStatus", "startDateOption", "subscriberType", "scenarioName", "userLan", "userName", "userCode", "userFormatType", "userTeam", "waiveFee", "waiveFeeFlag", "requesterApplication", "requesterZone", "campaignID", "offerPOID", "requesterChannel", "togglePostpaidEnable", "togglePrepaidEnable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignID", "()Ljava/lang/String;", "setCampaignID", "(Ljava/lang/String;)V", "getChannel", "setChannel", "getCmpFlag", "setCmpFlag", "getCompanyCode", "setCompanyCode", "getCustomerNumber", "setCustomerNumber", "getGroupCode", "setGroupCode", "getLastChangeDateTime", "setLastChangeDateTime", "getLocationCode", "setLocationCode", "getNewPackageGroupCode", "setNewPackageGroupCode", "getNewPackageGroupDescription", "setNewPackageGroupDescription", "getNextCycle", "()Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "setNextCycle", "(Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;)V", "getOfferPOID", "setOfferPOID", "getOffersPackage", "()Ljava/util/List;", "setOffersPackage", "(Ljava/util/List;)V", "getPackageCode", "setPackageCode", "getPackageDescription", "setPackageDescription", "getRequesterApplication", "setRequesterApplication", "getRequesterChannel", "setRequesterChannel", "getRequesterId", "setRequesterId", "getRequesterZone", "setRequesterZone", "getRtrCode", "setRtrCode", "getRtrName", "setRtrName", "getSaveFlag", "setSaveFlag", "getScenarioName", "setScenarioName", "getSource", "setSource", "getStartDateOption", "setStartDateOption", "getSubChannel", "setSubChannel", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberStatus", "setSubscriberStatus", "getSubscriberType", "setSubscriberType", "getTelephoneType", "setTelephoneType", "getTogglePostpaidEnable", "setTogglePostpaidEnable", "getTogglePrepaidEnable", "setTogglePrepaidEnable", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "getUserName", "setUserName", "getUserTeam", "setUserTeam", "getWaiveFee", "setWaiveFee", "getWaiveFeeFlag", "setWaiveFeeFlag", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.SaveChangePackageModel */
/* loaded from: classes8.dex */
public final class SaveChangePackageModel {
    public static final int $stable = 8;
    @SerializedName("campaignID")
    @NotNull
    private String campaignID;
    @SerializedName("channel")
    @NotNull
    private String channel;
    @SerializedName("cmpFlag")
    @NotNull
    private String cmpFlag;
    @SerializedName("companyCode")
    @NotNull
    private String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("groupCode")
    @NotNull
    private String groupCode;
    @SerializedName("lastChangeDateTime")
    @NotNull
    private String lastChangeDateTime;
    @SerializedName("locationCode")
    @NotNull
    private String locationCode;
    @SerializedName("newPackageGroupCode")
    @NotNull
    private String newPackageGroupCode;
    @SerializedName("newPackageGroupDescription")
    @NotNull
    private String newPackageGroupDescription;
    @SerializedName("nextCycle")
    @Nullable
    private NextCycle nextCycle;
    @SerializedName("offerPOID")
    @NotNull
    private String offerPOID;
    @SerializedName("offersPackage")
    @NotNull
    private List<OffersPackageItem> offersPackage;
    @SerializedName("packageCode")
    @NotNull
    private String packageCode;
    @SerializedName("packageDescription")
    @NotNull
    private String packageDescription;
    @SerializedName("requesterApplication")
    @NotNull
    private String requesterApplication;
    @SerializedName("requesterChannel")
    @NotNull
    private String requesterChannel;
    @SerializedName("requesterId")
    @NotNull
    private String requesterId;
    @SerializedName("requesterZone")
    @NotNull
    private String requesterZone;
    @SerializedName("rtrCode")
    @NotNull
    private String rtrCode;
    @SerializedName("rtrName")
    @NotNull
    private String rtrName;
    @SerializedName("saveFlag")
    @NotNull
    private String saveFlag;
    @SerializedName("scenarioName")
    @NotNull
    private String scenarioName;
    @SerializedName("source")
    @NotNull
    private String source;
    @SerializedName("startDateOption")
    @NotNull
    private String startDateOption;
    @SerializedName("subChannel")
    @NotNull
    private String subChannel;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("subscriberStatus")
    @NotNull
    private String subscriberStatus;
    @SerializedName("subscriberType")
    @NotNull
    private String subscriberType;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("togglePostpaidEnable")
    @Nullable
    private String togglePostpaidEnable;
    @SerializedName("togglePrepaidEnable")
    @Nullable
    private String togglePrepaidEnable;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;
    @SerializedName("userName")
    @NotNull
    private String userName;
    @SerializedName("userTeam")
    @NotNull
    private String userTeam;
    @SerializedName("waiveFee")
    @NotNull
    private String waiveFee;
    @SerializedName("waiveFeeFlag")
    @NotNull
    private String waiveFeeFlag;

    public SaveChangePackageModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 127, null);
    }

    @NotNull
    public final String component1() {
        return this.channel;
    }

    @Nullable
    public final NextCycle component10() {
        return this.nextCycle;
    }

    @NotNull
    public final List<OffersPackageItem> component11() {
        return this.offersPackage;
    }

    @NotNull
    public final String component12() {
        return this.packageCode;
    }

    @NotNull
    public final String component13() {
        return this.packageDescription;
    }

    @NotNull
    public final String component14() {
        return this.telephoneType;
    }

    @NotNull
    public final String component15() {
        return this.requesterId;
    }

    @NotNull
    public final String component16() {
        return this.rtrName;
    }

    @NotNull
    public final String component17() {
        return this.rtrCode;
    }

    @NotNull
    public final String component18() {
        return this.saveFlag;
    }

    @NotNull
    public final String component19() {
        return this.source;
    }

    @NotNull
    public final String component2() {
        return this.cmpFlag;
    }

    @NotNull
    public final String component20() {
        return this.subChannel;
    }

    @NotNull
    public final String component21() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component22() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component23() {
        return this.startDateOption;
    }

    @NotNull
    public final String component24() {
        return this.subscriberType;
    }

    @NotNull
    public final String component25() {
        return this.scenarioName;
    }

    @NotNull
    public final String component26() {
        return this.userLan;
    }

    @NotNull
    public final String component27() {
        return this.userName;
    }

    @NotNull
    public final String component28() {
        return this.userCode;
    }

    @NotNull
    public final String component29() {
        return this.userFormatType;
    }

    @NotNull
    public final String component3() {
        return this.companyCode;
    }

    @NotNull
    public final String component30() {
        return this.userTeam;
    }

    @NotNull
    public final String component31() {
        return this.waiveFee;
    }

    @NotNull
    public final String component32() {
        return this.waiveFeeFlag;
    }

    @NotNull
    public final String component33() {
        return this.requesterApplication;
    }

    @NotNull
    public final String component34() {
        return this.requesterZone;
    }

    @NotNull
    public final String component35() {
        return this.campaignID;
    }

    @NotNull
    public final String component36() {
        return this.offerPOID;
    }

    @NotNull
    public final String component37() {
        return this.requesterChannel;
    }

    @Nullable
    public final String component38() {
        return this.togglePostpaidEnable;
    }

    @Nullable
    public final String component39() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final String component4() {
        return this.customerNumber;
    }

    @NotNull
    public final String component5() {
        return this.groupCode;
    }

    @NotNull
    public final String component6() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String component7() {
        return this.locationCode;
    }

    @NotNull
    public final String component8() {
        return this.newPackageGroupDescription;
    }

    @NotNull
    public final String component9() {
        return this.newPackageGroupCode;
    }

    @NotNull
    public final SaveChangePackageModel copy(@NotNull String channel, @NotNull String cmpFlag, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String groupCode, @NotNull String lastChangeDateTime, @NotNull String locationCode, @NotNull String newPackageGroupDescription, @NotNull String newPackageGroupCode, @Nullable NextCycle nextCycle, @NotNull List<OffersPackageItem> offersPackage, @NotNull String packageCode, @NotNull String packageDescription, @NotNull String telephoneType, @NotNull String requesterId, @NotNull String rtrName, @NotNull String rtrCode, @NotNull String saveFlag, @NotNull String source, @NotNull String subChannel, @NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String startDateOption, @NotNull String subscriberType, @NotNull String scenarioName, @NotNull String userLan, @NotNull String userName, @NotNull String userCode, @NotNull String userFormatType, @NotNull String userTeam, @NotNull String waiveFee, @NotNull String waiveFeeFlag, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterChannel, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(newPackageGroupDescription, "newPackageGroupDescription");
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(offersPackage, "offersPackage");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(saveFlag, "saveFlag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userTeam, "userTeam");
        Intrinsics.checkNotNullParameter(waiveFee, "waiveFee");
        Intrinsics.checkNotNullParameter(waiveFeeFlag, "waiveFeeFlag");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        return new SaveChangePackageModel(channel, cmpFlag, companyCode, customerNumber, groupCode, lastChangeDateTime, locationCode, newPackageGroupDescription, newPackageGroupCode, nextCycle, offersPackage, packageCode, packageDescription, telephoneType, requesterId, rtrName, rtrCode, saveFlag, source, subChannel, subscriberNumber, subscriberStatus, startDateOption, subscriberType, scenarioName, userLan, userName, userCode, userFormatType, userTeam, waiveFee, waiveFeeFlag, requesterApplication, requesterZone, campaignID, offerPOID, requesterChannel, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveChangePackageModel) {
            SaveChangePackageModel saveChangePackageModel = (SaveChangePackageModel) obj;
            return Intrinsics.areEqual(this.channel, saveChangePackageModel.channel) && Intrinsics.areEqual(this.cmpFlag, saveChangePackageModel.cmpFlag) && Intrinsics.areEqual(this.companyCode, saveChangePackageModel.companyCode) && Intrinsics.areEqual(this.customerNumber, saveChangePackageModel.customerNumber) && Intrinsics.areEqual(this.groupCode, saveChangePackageModel.groupCode) && Intrinsics.areEqual(this.lastChangeDateTime, saveChangePackageModel.lastChangeDateTime) && Intrinsics.areEqual(this.locationCode, saveChangePackageModel.locationCode) && Intrinsics.areEqual(this.newPackageGroupDescription, saveChangePackageModel.newPackageGroupDescription) && Intrinsics.areEqual(this.newPackageGroupCode, saveChangePackageModel.newPackageGroupCode) && Intrinsics.areEqual(this.nextCycle, saveChangePackageModel.nextCycle) && Intrinsics.areEqual(this.offersPackage, saveChangePackageModel.offersPackage) && Intrinsics.areEqual(this.packageCode, saveChangePackageModel.packageCode) && Intrinsics.areEqual(this.packageDescription, saveChangePackageModel.packageDescription) && Intrinsics.areEqual(this.telephoneType, saveChangePackageModel.telephoneType) && Intrinsics.areEqual(this.requesterId, saveChangePackageModel.requesterId) && Intrinsics.areEqual(this.rtrName, saveChangePackageModel.rtrName) && Intrinsics.areEqual(this.rtrCode, saveChangePackageModel.rtrCode) && Intrinsics.areEqual(this.saveFlag, saveChangePackageModel.saveFlag) && Intrinsics.areEqual(this.source, saveChangePackageModel.source) && Intrinsics.areEqual(this.subChannel, saveChangePackageModel.subChannel) && Intrinsics.areEqual(this.subscriberNumber, saveChangePackageModel.subscriberNumber) && Intrinsics.areEqual(this.subscriberStatus, saveChangePackageModel.subscriberStatus) && Intrinsics.areEqual(this.startDateOption, saveChangePackageModel.startDateOption) && Intrinsics.areEqual(this.subscriberType, saveChangePackageModel.subscriberType) && Intrinsics.areEqual(this.scenarioName, saveChangePackageModel.scenarioName) && Intrinsics.areEqual(this.userLan, saveChangePackageModel.userLan) && Intrinsics.areEqual(this.userName, saveChangePackageModel.userName) && Intrinsics.areEqual(this.userCode, saveChangePackageModel.userCode) && Intrinsics.areEqual(this.userFormatType, saveChangePackageModel.userFormatType) && Intrinsics.areEqual(this.userTeam, saveChangePackageModel.userTeam) && Intrinsics.areEqual(this.waiveFee, saveChangePackageModel.waiveFee) && Intrinsics.areEqual(this.waiveFeeFlag, saveChangePackageModel.waiveFeeFlag) && Intrinsics.areEqual(this.requesterApplication, saveChangePackageModel.requesterApplication) && Intrinsics.areEqual(this.requesterZone, saveChangePackageModel.requesterZone) && Intrinsics.areEqual(this.campaignID, saveChangePackageModel.campaignID) && Intrinsics.areEqual(this.offerPOID, saveChangePackageModel.offerPOID) && Intrinsics.areEqual(this.requesterChannel, saveChangePackageModel.requesterChannel) && Intrinsics.areEqual(this.togglePostpaidEnable, saveChangePackageModel.togglePostpaidEnable) && Intrinsics.areEqual(this.togglePrepaidEnable, saveChangePackageModel.togglePrepaidEnable);
        }
        return false;
    }

    @NotNull
    public final String getCampaignID() {
        return this.campaignID;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getCmpFlag() {
        return this.cmpFlag;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getLocationCode() {
        return this.locationCode;
    }

    @NotNull
    public final String getNewPackageGroupCode() {
        return this.newPackageGroupCode;
    }

    @NotNull
    public final String getNewPackageGroupDescription() {
        return this.newPackageGroupDescription;
    }

    @Nullable
    public final NextCycle getNextCycle() {
        return this.nextCycle;
    }

    @NotNull
    public final String getOfferPOID() {
        return this.offerPOID;
    }

    @NotNull
    public final List<OffersPackageItem> getOffersPackage() {
        return this.offersPackage;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageDescription() {
        return this.packageDescription;
    }

    @NotNull
    public final String getRequesterApplication() {
        return this.requesterApplication;
    }

    @NotNull
    public final String getRequesterChannel() {
        return this.requesterChannel;
    }

    @NotNull
    public final String getRequesterId() {
        return this.requesterId;
    }

    @NotNull
    public final String getRequesterZone() {
        return this.requesterZone;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @NotNull
    public final String getRtrName() {
        return this.rtrName;
    }

    @NotNull
    public final String getSaveFlag() {
        return this.saveFlag;
    }

    @NotNull
    public final String getScenarioName() {
        return this.scenarioName;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getStartDateOption() {
        return this.startDateOption;
    }

    @NotNull
    public final String getSubChannel() {
        return this.subChannel;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @Nullable
    public final String getTogglePostpaidEnable() {
        return this.togglePostpaidEnable;
    }

    @Nullable
    public final String getTogglePrepaidEnable() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getUserTeam() {
        return this.userTeam;
    }

    @NotNull
    public final String getWaiveFee() {
        return this.waiveFee;
    }

    @NotNull
    public final String getWaiveFeeFlag() {
        return this.waiveFeeFlag;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.channel.hashCode() * 31) + this.cmpFlag.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.groupCode.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.locationCode.hashCode()) * 31) + this.newPackageGroupDescription.hashCode()) * 31) + this.newPackageGroupCode.hashCode()) * 31;
        NextCycle nextCycle = this.nextCycle;
        int hashCode2 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode + (nextCycle == null ? 0 : nextCycle.hashCode())) * 31) + this.offersPackage.hashCode()) * 31) + this.packageCode.hashCode()) * 31) + this.packageDescription.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.requesterId.hashCode()) * 31) + this.rtrName.hashCode()) * 31) + this.rtrCode.hashCode()) * 31) + this.saveFlag.hashCode()) * 31) + this.source.hashCode()) * 31) + this.subChannel.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberStatus.hashCode()) * 31) + this.startDateOption.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.scenarioName.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.userTeam.hashCode()) * 31) + this.waiveFee.hashCode()) * 31) + this.waiveFeeFlag.hashCode()) * 31) + this.requesterApplication.hashCode()) * 31) + this.requesterZone.hashCode()) * 31) + this.campaignID.hashCode()) * 31) + this.offerPOID.hashCode()) * 31) + this.requesterChannel.hashCode()) * 31;
        String str = this.togglePostpaidEnable;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.togglePrepaidEnable;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCampaignID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.campaignID = str;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setCmpFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmpFlag = str;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupCode = str;
    }

    public final void setLastChangeDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastChangeDateTime = str;
    }

    public final void setLocationCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locationCode = str;
    }

    public final void setNewPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newPackageGroupCode = str;
    }

    public final void setNewPackageGroupDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newPackageGroupDescription = str;
    }

    public final void setNextCycle(@Nullable NextCycle nextCycle) {
        this.nextCycle = nextCycle;
    }

    public final void setOfferPOID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offerPOID = str;
    }

    public final void setOffersPackage(@NotNull List<OffersPackageItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.offersPackage = list;
    }

    public final void setPackageCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageCode = str;
    }

    public final void setPackageDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageDescription = str;
    }

    public final void setRequesterApplication(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterApplication = str;
    }

    public final void setRequesterChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterChannel = str;
    }

    public final void setRequesterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterId = str;
    }

    public final void setRequesterZone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requesterZone = str;
    }

    public final void setRtrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrCode = str;
    }

    public final void setRtrName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrName = str;
    }

    public final void setSaveFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.saveFlag = str;
    }

    public final void setScenarioName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scenarioName = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setStartDateOption(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDateOption = str;
    }

    public final void setSubChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subChannel = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setSubscriberStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberStatus = str;
    }

    public final void setSubscriberType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberType = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setTogglePostpaidEnable(@Nullable String str) {
        this.togglePostpaidEnable = str;
    }

    public final void setTogglePrepaidEnable(@Nullable String str) {
        this.togglePrepaidEnable = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserTeam(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userTeam = str;
    }

    public final void setWaiveFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.waiveFee = str;
    }

    public final void setWaiveFeeFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.waiveFeeFlag = str;
    }

    @NotNull
    public String toString() {
        String str = this.channel;
        String str2 = this.cmpFlag;
        String str3 = this.companyCode;
        String str4 = this.customerNumber;
        String str5 = this.groupCode;
        String str6 = this.lastChangeDateTime;
        String str7 = this.locationCode;
        String str8 = this.newPackageGroupDescription;
        String str9 = this.newPackageGroupCode;
        NextCycle nextCycle = this.nextCycle;
        List<OffersPackageItem> list = this.offersPackage;
        String str10 = this.packageCode;
        String str11 = this.packageDescription;
        String str12 = this.telephoneType;
        String str13 = this.requesterId;
        String str14 = this.rtrName;
        String str15 = this.rtrCode;
        String str16 = this.saveFlag;
        String str17 = this.source;
        String str18 = this.subChannel;
        String str19 = this.subscriberNumber;
        String str20 = this.subscriberStatus;
        String str21 = this.startDateOption;
        String str22 = this.subscriberType;
        String str23 = this.scenarioName;
        String str24 = this.userLan;
        String str25 = this.userName;
        String str26 = this.userCode;
        String str27 = this.userFormatType;
        String str28 = this.userTeam;
        String str29 = this.waiveFee;
        String str30 = this.waiveFeeFlag;
        String str31 = this.requesterApplication;
        String str32 = this.requesterZone;
        String str33 = this.campaignID;
        String str34 = this.offerPOID;
        String str35 = this.requesterChannel;
        String str36 = this.togglePostpaidEnable;
        String str37 = this.togglePrepaidEnable;
        return "SaveChangePackageModel(channel=" + str + ", cmpFlag=" + str2 + ", companyCode=" + str3 + ", customerNumber=" + str4 + ", groupCode=" + str5 + ", lastChangeDateTime=" + str6 + ", locationCode=" + str7 + ", newPackageGroupDescription=" + str8 + ", newPackageGroupCode=" + str9 + ", nextCycle=" + nextCycle + ", offersPackage=" + list + ", packageCode=" + str10 + ", packageDescription=" + str11 + ", telephoneType=" + str12 + ", requesterId=" + str13 + ", rtrName=" + str14 + ", rtrCode=" + str15 + ", saveFlag=" + str16 + ", source=" + str17 + ", subChannel=" + str18 + ", subscriberNumber=" + str19 + ", subscriberStatus=" + str20 + ", startDateOption=" + str21 + ", subscriberType=" + str22 + ", scenarioName=" + str23 + ", userLan=" + str24 + ", userName=" + str25 + ", userCode=" + str26 + ", userFormatType=" + str27 + ", userTeam=" + str28 + ", waiveFee=" + str29 + ", waiveFeeFlag=" + str30 + ", requesterApplication=" + str31 + ", requesterZone=" + str32 + ", campaignID=" + str33 + ", offerPOID=" + str34 + ", requesterChannel=" + str35 + ", togglePostpaidEnable=" + str36 + ", togglePrepaidEnable=" + str37 + ")";
    }

    public SaveChangePackageModel(@NotNull String channel, @NotNull String cmpFlag, @NotNull String companyCode, @NotNull String customerNumber, @NotNull String groupCode, @NotNull String lastChangeDateTime, @NotNull String locationCode, @NotNull String newPackageGroupDescription, @NotNull String newPackageGroupCode, @Nullable NextCycle nextCycle, @NotNull List<OffersPackageItem> offersPackage, @NotNull String packageCode, @NotNull String packageDescription, @NotNull String telephoneType, @NotNull String requesterId, @NotNull String rtrName, @NotNull String rtrCode, @NotNull String saveFlag, @NotNull String source, @NotNull String subChannel, @NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String startDateOption, @NotNull String subscriberType, @NotNull String scenarioName, @NotNull String userLan, @NotNull String userName, @NotNull String userCode, @NotNull String userFormatType, @NotNull String userTeam, @NotNull String waiveFee, @NotNull String waiveFeeFlag, @NotNull String requesterApplication, @NotNull String requesterZone, @NotNull String campaignID, @NotNull String offerPOID, @NotNull String requesterChannel, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(groupCode, "groupCode");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(newPackageGroupDescription, "newPackageGroupDescription");
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(offersPackage, "offersPackage");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(requesterId, "requesterId");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(saveFlag, "saveFlag");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userTeam, "userTeam");
        Intrinsics.checkNotNullParameter(waiveFee, "waiveFee");
        Intrinsics.checkNotNullParameter(waiveFeeFlag, "waiveFeeFlag");
        Intrinsics.checkNotNullParameter(requesterApplication, "requesterApplication");
        Intrinsics.checkNotNullParameter(requesterZone, "requesterZone");
        Intrinsics.checkNotNullParameter(campaignID, "campaignID");
        Intrinsics.checkNotNullParameter(offerPOID, "offerPOID");
        Intrinsics.checkNotNullParameter(requesterChannel, "requesterChannel");
        this.channel = channel;
        this.cmpFlag = cmpFlag;
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.groupCode = groupCode;
        this.lastChangeDateTime = lastChangeDateTime;
        this.locationCode = locationCode;
        this.newPackageGroupDescription = newPackageGroupDescription;
        this.newPackageGroupCode = newPackageGroupCode;
        this.nextCycle = nextCycle;
        this.offersPackage = offersPackage;
        this.packageCode = packageCode;
        this.packageDescription = packageDescription;
        this.telephoneType = telephoneType;
        this.requesterId = requesterId;
        this.rtrName = rtrName;
        this.rtrCode = rtrCode;
        this.saveFlag = saveFlag;
        this.source = source;
        this.subChannel = subChannel;
        this.subscriberNumber = subscriberNumber;
        this.subscriberStatus = subscriberStatus;
        this.startDateOption = startDateOption;
        this.subscriberType = subscriberType;
        this.scenarioName = scenarioName;
        this.userLan = userLan;
        this.userName = userName;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.userTeam = userTeam;
        this.waiveFee = waiveFee;
        this.waiveFeeFlag = waiveFeeFlag;
        this.requesterApplication = requesterApplication;
        this.requesterZone = requesterZone;
        this.campaignID = campaignID;
        this.offerPOID = offerPOID;
        this.requesterChannel = requesterChannel;
        this.togglePostpaidEnable = str;
        this.togglePrepaidEnable = str2;
    }

    public /* synthetic */ SaveChangePackageModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, NextCycle nextCycle, List list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? null : nextCycle, (i & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? "" : str25, (i & 134217728) != 0 ? "" : str26, (i & 268435456) != 0 ? "" : str27, (i & PKIFailureInfo.duplicateCertReq) != 0 ? "" : str28, (i & 1073741824) != 0 ? "" : str29, (i & Integer.MIN_VALUE) != 0 ? "" : str30, (i2 & 1) != 0 ? RequestKt.REQUESTER_APPLICATION : str31, (i2 & 2) != 0 ? "" : str32, (i2 & 4) != 0 ? "" : str33, (i2 & 8) != 0 ? "" : str34, (i2 & 16) != 0 ? "" : str35, (i2 & 32) != 0 ? null : str36, (i2 & 64) != 0 ? null : str37);
    }
}
