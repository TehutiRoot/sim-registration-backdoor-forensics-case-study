package th.p047co.dtac.android.dtacone.model.mrtr_postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PermitCheckProfileResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.Check3LevelResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageForNewIDResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageItem;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.MrtrPostpaidRegistrationRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.MrtrPostpaidRegistrationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.response.CheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.model.postpaid.PostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bü\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0005\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u00100\u001a\u00020\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00103\u001a\u00020\u0004\u0012\b\b\u0002\u00104\u001a\u00020\u0004\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040I\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W\u0012\b\b\u0002\u0010X\u001a\u00020\u0006\u0012\b\b\u0002\u0010Y\u001a\u00020\u0006\u0012\b\b\u0002\u0010Z\u001a\u00020\u0006\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\b\u0002\u0010^\u001a\u00020_\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010a\u001a\u00020\u0006¢\u0006\u0002\u0010bJ\u0012\u0010\u0094\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009a\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010¢\u0002\u001a\u00020\u001bHÆ\u0003J\n\u0010£\u0002\u001a\u00020\u001bHÆ\u0003J\n\u0010¤\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010#HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010'HÆ\u0003J\n\u0010ª\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010)HÆ\u0003J\n\u0010\u00ad\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010±\u0002\u001a\u00020\u0004HÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u000102HÆ\u0003J\n\u0010³\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010´\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010µ\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010¾\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010¿\u0002\u001a\u0004\u0018\u00010GHÆ\u0003J\n\u0010À\u0002\u001a\u00020\u0004HÆ\u0003J\u0010\u0010Á\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040IHÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010KHÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010Ä\u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010Å\u0002\u001a\u0004\u0018\u00010OHÆ\u0003J\f\u0010Æ\u0002\u001a\u0004\u0018\u00010QHÆ\u0003J\f\u0010Ç\u0002\u001a\u0004\u0018\u00010SHÆ\u0003J\f\u0010È\u0002\u001a\u0004\u0018\u00010UHÆ\u0003J\f\u0010É\u0002\u001a\u0004\u0018\u00010WHÆ\u0003J\n\u0010Ê\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Ë\u0002\u001a\u00020\u0004HÆ\u0003J\n\u0010Ì\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Í\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010Î\u0002\u001a\u0004\u0018\u00010\\HÆ\u0003J\f\u0010Ï\u0002\u001a\u0004\u0018\u00010\\HÆ\u0003J\n\u0010Ð\u0002\u001a\u00020_HÆ\u0003J\f\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010Ò\u0002\u001a\u00020\u0006HÆ\u0003J\n\u0010Ó\u0002\u001a\u00020\u0004HÆ\u0003J\f\u0010Ô\u0002\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010Õ\u0002\u001a\u00020\u0004HÆ\u0003Jð\u0005\u0010Ö\u0002\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00100\u001a\u00020\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\b\b\u0002\u0010X\u001a\u00020\u00062\b\b\u0002\u0010Y\u001a\u00020\u00062\b\b\u0002\u0010Z\u001a\u00020\u00062\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\2\b\b\u0002\u0010^\u001a\u00020_2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010a\u001a\u00020\u0006HÆ\u0001J\u0015\u0010×\u0002\u001a\u00020\u00062\t\u0010Ø\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ù\u0002\u001a\u00020\u001bHÖ\u0001J\n\u0010Ú\u0002\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u00104\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010t\"\u0004\bx\u0010vR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001f\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010*\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0080\u0001\"\u0006\b\u0084\u0001\u0010\u0082\u0001R \u0010R\u001a\u0004\u0018\u00010SX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010t\"\u0005\b\u009a\u0001\u0010vR\u001e\u0010^\u001a\u00020_X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010M\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010t\"\u0005\b \u0001\u0010vR \u0010E\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¡\u0001\u0010\u008a\u0001\"\u0006\b¢\u0001\u0010\u008c\u0001R \u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010d\"\u0005\b¨\u0001\u0010fR\u001e\u0010`\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010t\"\u0005\bª\u0001\u0010vR \u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010t\"\u0005\b°\u0001\u0010vR\u001c\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010t\"\u0005\b²\u0001\u0010vR$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010p\"\u0005\b´\u0001\u0010rR\u001c\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010t\"\u0005\b¶\u0001\u0010vR\u001c\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010t\"\u0005\b¸\u0001\u0010vR\u001c\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010t\"\u0005\bº\u0001\u0010vR\u001b\u0010Y\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\bY\u0010d\"\u0005\b»\u0001\u0010fR\u001b\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0011\u0010d\"\u0005\b¼\u0001\u0010fR\u001b\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0016\u0010d\"\u0005\b½\u0001\u0010fR\u001b\u0010X\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\bX\u0010d\"\u0005\b¾\u0001\u0010fR\u001b\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0010\u0010d\"\u0005\b¿\u0001\u0010fR\u001b\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u001d\u0010d\"\u0005\bÀ\u0001\u0010fR\u001b\u0010a\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\ba\u0010d\"\u0005\bÁ\u0001\u0010fR\u001b\u0010Z\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\bZ\u0010d\"\u0005\bÂ\u0001\u0010fR\u001b\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0013\u0010d\"\u0005\bÃ\u0001\u0010fR\u001b\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\b\u0010d\"\u0005\bÄ\u0001\u0010fR\u001b\u0010+\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b+\u0010d\"\u0005\bÅ\u0001\u0010fR\u001b\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0007\u0010d\"\u0005\bÆ\u0001\u0010fR\u001b\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0005\u0010d\"\u0005\bÇ\u0001\u0010fR\u001e\u0010\u001c\u001a\u00020\u001bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u001e\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÌ\u0001\u0010É\u0001\"\u0006\bÍ\u0001\u0010Ë\u0001R\u001c\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010t\"\u0005\bÏ\u0001\u0010vR \u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R \u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R\u001c\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bØ\u0001\u0010t\"\u0005\bÙ\u0001\u0010vR \u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u001c\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0001\u0010t\"\u0005\bß\u0001\u0010vR \u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R \u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R \u0010T\u001a\u0004\u0018\u00010UX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R\u001e\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0001\u0010t\"\u0005\bí\u0001\u0010vR\u001e\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0001\u0010t\"\u0005\bï\u0001\u0010vR \u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R \u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0001\u0010t\"\u0005\bù\u0001\u0010vR \u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R\u001c\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0001\u0010t\"\u0005\bÿ\u0001\u0010vR \u0010P\u001a\u0004\u0018\u00010QX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R \u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001e\u0010L\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010t\"\u0005\b\u0089\u0002\u0010vR \u0010]\u001a\u0004\u0018\u00010\\X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R \u0010[\u001a\u0004\u0018\u00010\\X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0002\u0010\u008b\u0002\"\u0006\b\u008f\u0002\u0010\u008d\u0002R \u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002¨\u0006Û\u0002"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidModel;", "", "imageOptionalsName", "", "", "isWithDevice", "", "isWithContract", "isSmartCard", "imie", "simBarcode", "idNumber", "postpaidValidationIdCardNumber", "newIdFlag", "KYCRequireVerifyJC", "invoiceAlertMethod", "isFaceRecog", "isCheckSimStock", "defaultPaymentFreeSim", "isShowConsentXSim", "imageSignatureConsentXSim", "consentType", "isDefaultPackage", "blacklistSharingStatus", "canBuyDeviceWithContract", "idDocType", "lastNamePhotoMultiple", "", "kycAttemp", "isKYC", "compareResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "compareResponseForSubmit", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "checkSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "hardwareNumberResponse", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "validateSimBarcodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformationPaymentIdCardAddress", "isSmartCardPaymentAddress", "card", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "postcode", "postcodeSequenceString", "packageGroupRefNo", "addressMailingData", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "legalAddressPostCode", "blacklistFlag", "mPackage", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "packageSetRetailer", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "packageGroupCodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;", "paymentReceiptData", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "addressPaymentReceipt", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "cutSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "registerRequest", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationRequest;", "checkSimStockError", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "cutSimStockError", "postpaidPackageSetRetailerResponse", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;", "attachmentNames", "", "navigateSalesOrder", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrNavigateDeviceSales;", "tagFace", "cutSimPostcode", "postpaidRegistrationResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationResponse;", "specialPackageForNewIDResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageForNewIDResponse;", "check3LevelResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/Check3LevelResponse;", "permitCheckProfileResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/PermitCheckProfileResponse;", "specialPackageItem", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "isEligible", "isAllowManualKYC", "isRequireLiveness", "upPassFormResult", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "upPassFormCompareResult", "currentFormType", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "eligibleIdCard", "isOverruleXSIM", "(Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;ZLth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationRequest;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;Ljava/util/List;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrNavigateDeviceSales;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageForNewIDResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/Check3LevelResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/PermitCheckProfileResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;ZZZLth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Ljava/lang/String;Z)V", "getKYCRequireVerifyJC", "()Z", "setKYCRequireVerifyJC", "(Z)V", "getAddressMailingData", "()Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "setAddressMailingData", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;)V", "getAddressPaymentReceipt", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "setAddressPaymentReceipt", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getBlacklistFlag", "()Ljava/lang/String;", "setBlacklistFlag", "(Ljava/lang/String;)V", "getBlacklistSharingStatus", "setBlacklistSharingStatus", "getCanBuyDeviceWithContract", "setCanBuyDeviceWithContract", "getCard", "()Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "setCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;)V", "getCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCardInformationPaymentIdCardAddress", "setCardInformationPaymentIdCardAddress", "getCheck3LevelResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/Check3LevelResponse;", "setCheck3LevelResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/Check3LevelResponse;)V", "getCheckSimStockError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "setCheckSimStockError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "getCheckSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "setCheckSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;)V", "getCompareResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setCompareResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getCompareResponseForSubmit", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "setCompareResponseForSubmit", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;)V", "getConsentType", "setConsentType", "getCurrentFormType", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "setCurrentFormType", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)V", "getCutSimPostcode", "setCutSimPostcode", "getCutSimStockError", "setCutSimStockError", "getCutSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "setCutSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;)V", "getDefaultPaymentFreeSim", "setDefaultPaymentFreeSim", "getEligibleIdCard", "setEligibleIdCard", "getHardwareNumberResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "setHardwareNumberResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;)V", "getIdDocType", "setIdDocType", "getIdNumber", "setIdNumber", "getImageOptionalsName", "setImageOptionalsName", "getImageSignatureConsentXSim", "setImageSignatureConsentXSim", "getImie", "setImie", "getInvoiceAlertMethod", "setInvoiceAlertMethod", "setAllowManualKYC", "setCheckSimStock", "setDefaultPackage", "setEligible", "setFaceRecog", "setKYC", "setOverruleXSIM", "setRequireLiveness", "setShowConsentXSim", "setSmartCard", "setSmartCardPaymentAddress", "setWithContract", "setWithDevice", "getKycAttemp", "()I", "setKycAttemp", "(I)V", "getLastNamePhotoMultiple", "setLastNamePhotoMultiple", "getLegalAddressPostCode", "setLegalAddressPostCode", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "getNavigateSalesOrder", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrNavigateDeviceSales;", "setNavigateSalesOrder", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrNavigateDeviceSales;)V", "getNewIdFlag", "setNewIdFlag", "getPackageGroupCodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;", "setPackageGroupCodeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;)V", "getPackageGroupRefNo", "setPackageGroupRefNo", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "setPackageSetRetailer", "(Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;)V", "getPaymentReceiptData", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "setPaymentReceiptData", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;)V", "getPermitCheckProfileResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/PermitCheckProfileResponse;", "setPermitCheckProfileResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/PermitCheckProfileResponse;)V", "getPostcode", "setPostcode", "getPostcodeSequenceString", "setPostcodeSequenceString", "getPostpaidPackageSetRetailerResponse", "()Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;", "setPostpaidPackageSetRetailerResponse", "(Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;)V", "getPostpaidRegistrationResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationResponse;", "setPostpaidRegistrationResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationResponse;)V", "getPostpaidValidationIdCardNumber", "setPostpaidValidationIdCardNumber", "getRegisterRequest", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationRequest;", "setRegisterRequest", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationRequest;)V", "getSimBarcode", "setSimBarcode", "getSpecialPackageForNewIDResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageForNewIDResponse;", "setSpecialPackageForNewIDResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageForNewIDResponse;)V", "getSpecialPackageItem", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "setSpecialPackageItem", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;)V", "getTagFace", "setTagFace", "getUpPassFormCompareResult", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "setUpPassFormCompareResult", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;)V", "getUpPassFormResult", "setUpPassFormResult", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidModel */
/* loaded from: classes8.dex */
public final class MrtrPostpaidModel {
    public static final int $stable = 8;
    private boolean KYCRequireVerifyJC;
    @Nullable
    private AddressMailingData addressMailingData;
    @Nullable
    private AddressPaymentReceipt addressPaymentReceipt;
    @NotNull
    private List<String> attachmentNames;
    @NotNull
    private String blacklistFlag;
    @NotNull
    private String blacklistSharingStatus;
    @Nullable
    private String canBuyDeviceWithContract;
    @Nullable
    private CardCollection card;
    @Nullable
    private IdCardInformationCollection cardInformation;
    @Nullable
    private IdCardInformationCollection cardInformationPaymentIdCardAddress;
    @Nullable
    private Check3LevelResponse check3LevelResponse;
    @Nullable
    private ErrorCollection checkSimStockError;
    @Nullable
    private CheckSimStockResponse checkSimStockResponse;
    @Nullable
    private FaceRecResponse compareResponse;
    @Nullable
    private FaceCompareResponse compareResponseForSubmit;
    @NotNull
    private String consentType;
    @NotNull
    private UpPassFormType currentFormType;
    @Nullable
    private String cutSimPostcode;
    @Nullable
    private ErrorCollection cutSimStockError;
    @Nullable
    private CutSimStockResponse cutSimStockResponse;
    private boolean defaultPaymentFreeSim;
    @Nullable
    private String eligibleIdCard;
    @Nullable
    private GetNewIMEIResponse hardwareNumberResponse;
    @NotNull
    private String idDocType;
    @NotNull
    private transient String idNumber;
    @Nullable
    private transient List<String> imageOptionalsName;
    @NotNull
    private String imageSignatureConsentXSim;
    @NotNull
    private transient String imie;
    @NotNull
    private String invoiceAlertMethod;
    private boolean isAllowManualKYC;
    private boolean isCheckSimStock;
    private boolean isDefaultPackage;
    private boolean isEligible;
    private boolean isFaceRecog;
    private boolean isKYC;
    private boolean isOverruleXSIM;
    private boolean isRequireLiveness;
    private boolean isShowConsentXSim;
    private transient boolean isSmartCard;
    private boolean isSmartCardPaymentAddress;
    private transient boolean isWithContract;
    private transient boolean isWithDevice;
    private int kycAttemp;
    private int lastNamePhotoMultiple;
    @NotNull
    private String legalAddressPostCode;
    @Nullable
    private Package mPackage;
    @Nullable
    private MrtrNavigateDeviceSales navigateSalesOrder;
    @NotNull
    private String newIdFlag;
    @Nullable
    private PackageGroupCodeResponse packageGroupCodeResponse;
    @NotNull
    private String packageGroupRefNo;
    @Nullable
    private PackageSet packageSetRetailer;
    @Nullable
    private PaymentReceiptData paymentReceiptData;
    @Nullable
    private PermitCheckProfileResponse permitCheckProfileResponse;
    @Nullable
    private String postcode;
    @Nullable
    private String postcodeSequenceString;
    @Nullable
    private PostpaidPackageSetResponse postpaidPackageSetRetailerResponse;
    @Nullable
    private MrtrPostpaidRegistrationResponse postpaidRegistrationResponse;
    @Nullable
    private String postpaidValidationIdCardNumber;
    @Nullable
    private MrtrPostpaidRegistrationRequest registerRequest;
    @NotNull
    private transient String simBarcode;
    @Nullable
    private SpecialPackageForNewIDResponse specialPackageForNewIDResponse;
    @Nullable
    private SpecialPackageItem specialPackageItem;
    @Nullable
    private String tagFace;
    @Nullable
    private UpPassFormResult upPassFormCompareResult;
    @Nullable
    private UpPassFormResult upPassFormResult;
    @Nullable
    private MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse;

    public MrtrPostpaidModel() {
        this(null, false, false, false, null, null, null, null, null, false, null, false, false, false, false, null, null, false, null, null, null, 0, 0, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, -1, -1, 3, null);
    }

    @Nullable
    public final List<String> component1() {
        return this.imageOptionalsName;
    }

    public final boolean component10() {
        return this.KYCRequireVerifyJC;
    }

    @NotNull
    public final String component11() {
        return this.invoiceAlertMethod;
    }

    public final boolean component12() {
        return this.isFaceRecog;
    }

    public final boolean component13() {
        return this.isCheckSimStock;
    }

    public final boolean component14() {
        return this.defaultPaymentFreeSim;
    }

    public final boolean component15() {
        return this.isShowConsentXSim;
    }

    @NotNull
    public final String component16() {
        return this.imageSignatureConsentXSim;
    }

    @NotNull
    public final String component17() {
        return this.consentType;
    }

    public final boolean component18() {
        return this.isDefaultPackage;
    }

    @NotNull
    public final String component19() {
        return this.blacklistSharingStatus;
    }

    public final boolean component2() {
        return this.isWithDevice;
    }

    @Nullable
    public final String component20() {
        return this.canBuyDeviceWithContract;
    }

    @NotNull
    public final String component21() {
        return this.idDocType;
    }

    public final int component22() {
        return this.lastNamePhotoMultiple;
    }

    public final int component23() {
        return this.kycAttemp;
    }

    public final boolean component24() {
        return this.isKYC;
    }

    @Nullable
    public final FaceRecResponse component25() {
        return this.compareResponse;
    }

    @Nullable
    public final FaceCompareResponse component26() {
        return this.compareResponseForSubmit;
    }

    @Nullable
    public final CheckSimStockResponse component27() {
        return this.checkSimStockResponse;
    }

    @Nullable
    public final GetNewIMEIResponse component28() {
        return this.hardwareNumberResponse;
    }

    @Nullable
    public final MrtrPostpaidValidateSimBarcodeResponse component29() {
        return this.validateSimBarcodeResponse;
    }

    public final boolean component3() {
        return this.isWithContract;
    }

    @Nullable
    public final IdCardInformationCollection component30() {
        return this.cardInformation;
    }

    @Nullable
    public final IdCardInformationCollection component31() {
        return this.cardInformationPaymentIdCardAddress;
    }

    public final boolean component32() {
        return this.isSmartCardPaymentAddress;
    }

    @Nullable
    public final CardCollection component33() {
        return this.card;
    }

    @Nullable
    public final String component34() {
        return this.postcode;
    }

    @Nullable
    public final String component35() {
        return this.postcodeSequenceString;
    }

    @NotNull
    public final String component36() {
        return this.packageGroupRefNo;
    }

    @Nullable
    public final AddressMailingData component37() {
        return this.addressMailingData;
    }

    @NotNull
    public final String component38() {
        return this.legalAddressPostCode;
    }

    @NotNull
    public final String component39() {
        return this.blacklistFlag;
    }

    public final boolean component4() {
        return this.isSmartCard;
    }

    @Nullable
    public final Package component40() {
        return this.mPackage;
    }

    @Nullable
    public final PackageSet component41() {
        return this.packageSetRetailer;
    }

    @Nullable
    public final PackageGroupCodeResponse component42() {
        return this.packageGroupCodeResponse;
    }

    @Nullable
    public final PaymentReceiptData component43() {
        return this.paymentReceiptData;
    }

    @Nullable
    public final AddressPaymentReceipt component44() {
        return this.addressPaymentReceipt;
    }

    @Nullable
    public final CutSimStockResponse component45() {
        return this.cutSimStockResponse;
    }

    @Nullable
    public final MrtrPostpaidRegistrationRequest component46() {
        return this.registerRequest;
    }

    @Nullable
    public final ErrorCollection component47() {
        return this.checkSimStockError;
    }

    @Nullable
    public final ErrorCollection component48() {
        return this.cutSimStockError;
    }

    @Nullable
    public final PostpaidPackageSetResponse component49() {
        return this.postpaidPackageSetRetailerResponse;
    }

    @NotNull
    public final String component5() {
        return this.imie;
    }

    @NotNull
    public final List<String> component50() {
        return this.attachmentNames;
    }

    @Nullable
    public final MrtrNavigateDeviceSales component51() {
        return this.navigateSalesOrder;
    }

    @Nullable
    public final String component52() {
        return this.tagFace;
    }

    @Nullable
    public final String component53() {
        return this.cutSimPostcode;
    }

    @Nullable
    public final MrtrPostpaidRegistrationResponse component54() {
        return this.postpaidRegistrationResponse;
    }

    @Nullable
    public final SpecialPackageForNewIDResponse component55() {
        return this.specialPackageForNewIDResponse;
    }

    @Nullable
    public final Check3LevelResponse component56() {
        return this.check3LevelResponse;
    }

    @Nullable
    public final PermitCheckProfileResponse component57() {
        return this.permitCheckProfileResponse;
    }

    @Nullable
    public final SpecialPackageItem component58() {
        return this.specialPackageItem;
    }

    public final boolean component59() {
        return this.isEligible;
    }

    @NotNull
    public final String component6() {
        return this.simBarcode;
    }

    public final boolean component60() {
        return this.isAllowManualKYC;
    }

    public final boolean component61() {
        return this.isRequireLiveness;
    }

    @Nullable
    public final UpPassFormResult component62() {
        return this.upPassFormResult;
    }

    @Nullable
    public final UpPassFormResult component63() {
        return this.upPassFormCompareResult;
    }

    @NotNull
    public final UpPassFormType component64() {
        return this.currentFormType;
    }

    @Nullable
    public final String component65() {
        return this.eligibleIdCard;
    }

    public final boolean component66() {
        return this.isOverruleXSIM;
    }

    @NotNull
    public final String component7() {
        return this.idNumber;
    }

    @Nullable
    public final String component8() {
        return this.postpaidValidationIdCardNumber;
    }

    @NotNull
    public final String component9() {
        return this.newIdFlag;
    }

    @NotNull
    public final MrtrPostpaidModel copy(@Nullable List<String> list, boolean z, boolean z2, boolean z3, @NotNull String imie, @NotNull String simBarcode, @NotNull String idNumber, @Nullable String str, @NotNull String newIdFlag, boolean z4, @NotNull String invoiceAlertMethod, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull String imageSignatureConsentXSim, @NotNull String consentType, boolean z9, @NotNull String blacklistSharingStatus, @Nullable String str2, @NotNull String idDocType, int i, int i2, boolean z10, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, @Nullable CheckSimStockResponse checkSimStockResponse, @Nullable GetNewIMEIResponse getNewIMEIResponse, @Nullable MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, boolean z11, @Nullable CardCollection cardCollection, @Nullable String str3, @Nullable String str4, @NotNull String packageGroupRefNo, @Nullable AddressMailingData addressMailingData, @NotNull String legalAddressPostCode, @NotNull String blacklistFlag, @Nullable Package r108, @Nullable PackageSet packageSet, @Nullable PackageGroupCodeResponse packageGroupCodeResponse, @Nullable PaymentReceiptData paymentReceiptData, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable MrtrPostpaidRegistrationRequest mrtrPostpaidRegistrationRequest, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, @Nullable PostpaidPackageSetResponse postpaidPackageSetResponse, @NotNull List<String> attachmentNames, @Nullable MrtrNavigateDeviceSales mrtrNavigateDeviceSales, @Nullable String str5, @Nullable String str6, @Nullable MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse, @Nullable SpecialPackageForNewIDResponse specialPackageForNewIDResponse, @Nullable Check3LevelResponse check3LevelResponse, @Nullable PermitCheckProfileResponse permitCheckProfileResponse, @Nullable SpecialPackageItem specialPackageItem, boolean z12, boolean z13, boolean z14, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @NotNull UpPassFormType currentFormType, @Nullable String str7, boolean z15) {
        Intrinsics.checkNotNullParameter(imie, "imie");
        Intrinsics.checkNotNullParameter(simBarcode, "simBarcode");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(newIdFlag, "newIdFlag");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(imageSignatureConsentXSim, "imageSignatureConsentXSim");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(blacklistSharingStatus, "blacklistSharingStatus");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(legalAddressPostCode, "legalAddressPostCode");
        Intrinsics.checkNotNullParameter(blacklistFlag, "blacklistFlag");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        return new MrtrPostpaidModel(list, z, z2, z3, imie, simBarcode, idNumber, str, newIdFlag, z4, invoiceAlertMethod, z5, z6, z7, z8, imageSignatureConsentXSim, consentType, z9, blacklistSharingStatus, str2, idDocType, i, i2, z10, faceRecResponse, faceCompareResponse, checkSimStockResponse, getNewIMEIResponse, mrtrPostpaidValidateSimBarcodeResponse, idCardInformationCollection, idCardInformationCollection2, z11, cardCollection, str3, str4, packageGroupRefNo, addressMailingData, legalAddressPostCode, blacklistFlag, r108, packageSet, packageGroupCodeResponse, paymentReceiptData, addressPaymentReceipt, cutSimStockResponse, mrtrPostpaidRegistrationRequest, errorCollection, errorCollection2, postpaidPackageSetResponse, attachmentNames, mrtrNavigateDeviceSales, str5, str6, mrtrPostpaidRegistrationResponse, specialPackageForNewIDResponse, check3LevelResponse, permitCheckProfileResponse, specialPackageItem, z12, z13, z14, upPassFormResult, upPassFormResult2, currentFormType, str7, z15);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPostpaidModel) {
            MrtrPostpaidModel mrtrPostpaidModel = (MrtrPostpaidModel) obj;
            return Intrinsics.areEqual(this.imageOptionalsName, mrtrPostpaidModel.imageOptionalsName) && this.isWithDevice == mrtrPostpaidModel.isWithDevice && this.isWithContract == mrtrPostpaidModel.isWithContract && this.isSmartCard == mrtrPostpaidModel.isSmartCard && Intrinsics.areEqual(this.imie, mrtrPostpaidModel.imie) && Intrinsics.areEqual(this.simBarcode, mrtrPostpaidModel.simBarcode) && Intrinsics.areEqual(this.idNumber, mrtrPostpaidModel.idNumber) && Intrinsics.areEqual(this.postpaidValidationIdCardNumber, mrtrPostpaidModel.postpaidValidationIdCardNumber) && Intrinsics.areEqual(this.newIdFlag, mrtrPostpaidModel.newIdFlag) && this.KYCRequireVerifyJC == mrtrPostpaidModel.KYCRequireVerifyJC && Intrinsics.areEqual(this.invoiceAlertMethod, mrtrPostpaidModel.invoiceAlertMethod) && this.isFaceRecog == mrtrPostpaidModel.isFaceRecog && this.isCheckSimStock == mrtrPostpaidModel.isCheckSimStock && this.defaultPaymentFreeSim == mrtrPostpaidModel.defaultPaymentFreeSim && this.isShowConsentXSim == mrtrPostpaidModel.isShowConsentXSim && Intrinsics.areEqual(this.imageSignatureConsentXSim, mrtrPostpaidModel.imageSignatureConsentXSim) && Intrinsics.areEqual(this.consentType, mrtrPostpaidModel.consentType) && this.isDefaultPackage == mrtrPostpaidModel.isDefaultPackage && Intrinsics.areEqual(this.blacklistSharingStatus, mrtrPostpaidModel.blacklistSharingStatus) && Intrinsics.areEqual(this.canBuyDeviceWithContract, mrtrPostpaidModel.canBuyDeviceWithContract) && Intrinsics.areEqual(this.idDocType, mrtrPostpaidModel.idDocType) && this.lastNamePhotoMultiple == mrtrPostpaidModel.lastNamePhotoMultiple && this.kycAttemp == mrtrPostpaidModel.kycAttemp && this.isKYC == mrtrPostpaidModel.isKYC && Intrinsics.areEqual(this.compareResponse, mrtrPostpaidModel.compareResponse) && Intrinsics.areEqual(this.compareResponseForSubmit, mrtrPostpaidModel.compareResponseForSubmit) && Intrinsics.areEqual(this.checkSimStockResponse, mrtrPostpaidModel.checkSimStockResponse) && Intrinsics.areEqual(this.hardwareNumberResponse, mrtrPostpaidModel.hardwareNumberResponse) && Intrinsics.areEqual(this.validateSimBarcodeResponse, mrtrPostpaidModel.validateSimBarcodeResponse) && Intrinsics.areEqual(this.cardInformation, mrtrPostpaidModel.cardInformation) && Intrinsics.areEqual(this.cardInformationPaymentIdCardAddress, mrtrPostpaidModel.cardInformationPaymentIdCardAddress) && this.isSmartCardPaymentAddress == mrtrPostpaidModel.isSmartCardPaymentAddress && Intrinsics.areEqual(this.card, mrtrPostpaidModel.card) && Intrinsics.areEqual(this.postcode, mrtrPostpaidModel.postcode) && Intrinsics.areEqual(this.postcodeSequenceString, mrtrPostpaidModel.postcodeSequenceString) && Intrinsics.areEqual(this.packageGroupRefNo, mrtrPostpaidModel.packageGroupRefNo) && Intrinsics.areEqual(this.addressMailingData, mrtrPostpaidModel.addressMailingData) && Intrinsics.areEqual(this.legalAddressPostCode, mrtrPostpaidModel.legalAddressPostCode) && Intrinsics.areEqual(this.blacklistFlag, mrtrPostpaidModel.blacklistFlag) && Intrinsics.areEqual(this.mPackage, mrtrPostpaidModel.mPackage) && Intrinsics.areEqual(this.packageSetRetailer, mrtrPostpaidModel.packageSetRetailer) && Intrinsics.areEqual(this.packageGroupCodeResponse, mrtrPostpaidModel.packageGroupCodeResponse) && Intrinsics.areEqual(this.paymentReceiptData, mrtrPostpaidModel.paymentReceiptData) && Intrinsics.areEqual(this.addressPaymentReceipt, mrtrPostpaidModel.addressPaymentReceipt) && Intrinsics.areEqual(this.cutSimStockResponse, mrtrPostpaidModel.cutSimStockResponse) && Intrinsics.areEqual(this.registerRequest, mrtrPostpaidModel.registerRequest) && Intrinsics.areEqual(this.checkSimStockError, mrtrPostpaidModel.checkSimStockError) && Intrinsics.areEqual(this.cutSimStockError, mrtrPostpaidModel.cutSimStockError) && Intrinsics.areEqual(this.postpaidPackageSetRetailerResponse, mrtrPostpaidModel.postpaidPackageSetRetailerResponse) && Intrinsics.areEqual(this.attachmentNames, mrtrPostpaidModel.attachmentNames) && Intrinsics.areEqual(this.navigateSalesOrder, mrtrPostpaidModel.navigateSalesOrder) && Intrinsics.areEqual(this.tagFace, mrtrPostpaidModel.tagFace) && Intrinsics.areEqual(this.cutSimPostcode, mrtrPostpaidModel.cutSimPostcode) && Intrinsics.areEqual(this.postpaidRegistrationResponse, mrtrPostpaidModel.postpaidRegistrationResponse) && Intrinsics.areEqual(this.specialPackageForNewIDResponse, mrtrPostpaidModel.specialPackageForNewIDResponse) && Intrinsics.areEqual(this.check3LevelResponse, mrtrPostpaidModel.check3LevelResponse) && Intrinsics.areEqual(this.permitCheckProfileResponse, mrtrPostpaidModel.permitCheckProfileResponse) && Intrinsics.areEqual(this.specialPackageItem, mrtrPostpaidModel.specialPackageItem) && this.isEligible == mrtrPostpaidModel.isEligible && this.isAllowManualKYC == mrtrPostpaidModel.isAllowManualKYC && this.isRequireLiveness == mrtrPostpaidModel.isRequireLiveness && Intrinsics.areEqual(this.upPassFormResult, mrtrPostpaidModel.upPassFormResult) && Intrinsics.areEqual(this.upPassFormCompareResult, mrtrPostpaidModel.upPassFormCompareResult) && Intrinsics.areEqual(this.currentFormType, mrtrPostpaidModel.currentFormType) && Intrinsics.areEqual(this.eligibleIdCard, mrtrPostpaidModel.eligibleIdCard) && this.isOverruleXSIM == mrtrPostpaidModel.isOverruleXSIM;
        }
        return false;
    }

    @Nullable
    public final AddressMailingData getAddressMailingData() {
        return this.addressMailingData;
    }

    @Nullable
    public final AddressPaymentReceipt getAddressPaymentReceipt() {
        return this.addressPaymentReceipt;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @NotNull
    public final String getBlacklistFlag() {
        return this.blacklistFlag;
    }

    @NotNull
    public final String getBlacklistSharingStatus() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final String getCanBuyDeviceWithContract() {
        return this.canBuyDeviceWithContract;
    }

    @Nullable
    public final CardCollection getCard() {
        return this.card;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformation() {
        return this.cardInformation;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformationPaymentIdCardAddress() {
        return this.cardInformationPaymentIdCardAddress;
    }

    @Nullable
    public final Check3LevelResponse getCheck3LevelResponse() {
        return this.check3LevelResponse;
    }

    @Nullable
    public final ErrorCollection getCheckSimStockError() {
        return this.checkSimStockError;
    }

    @Nullable
    public final CheckSimStockResponse getCheckSimStockResponse() {
        return this.checkSimStockResponse;
    }

    @Nullable
    public final FaceRecResponse getCompareResponse() {
        return this.compareResponse;
    }

    @Nullable
    public final FaceCompareResponse getCompareResponseForSubmit() {
        return this.compareResponseForSubmit;
    }

    @NotNull
    public final String getConsentType() {
        return this.consentType;
    }

    @NotNull
    public final UpPassFormType getCurrentFormType() {
        return this.currentFormType;
    }

    @Nullable
    public final String getCutSimPostcode() {
        return this.cutSimPostcode;
    }

    @Nullable
    public final ErrorCollection getCutSimStockError() {
        return this.cutSimStockError;
    }

    @Nullable
    public final CutSimStockResponse getCutSimStockResponse() {
        return this.cutSimStockResponse;
    }

    public final boolean getDefaultPaymentFreeSim() {
        return this.defaultPaymentFreeSim;
    }

    @Nullable
    public final String getEligibleIdCard() {
        return this.eligibleIdCard;
    }

    @Nullable
    public final GetNewIMEIResponse getHardwareNumberResponse() {
        return this.hardwareNumberResponse;
    }

    @NotNull
    public final String getIdDocType() {
        return this.idDocType;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final List<String> getImageOptionalsName() {
        return this.imageOptionalsName;
    }

    @NotNull
    public final String getImageSignatureConsentXSim() {
        return this.imageSignatureConsentXSim;
    }

    @NotNull
    public final String getImie() {
        return this.imie;
    }

    @NotNull
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    public final boolean getKYCRequireVerifyJC() {
        return this.KYCRequireVerifyJC;
    }

    public final int getKycAttemp() {
        return this.kycAttemp;
    }

    public final int getLastNamePhotoMultiple() {
        return this.lastNamePhotoMultiple;
    }

    @NotNull
    public final String getLegalAddressPostCode() {
        return this.legalAddressPostCode;
    }

    @Nullable
    public final Package getMPackage() {
        return this.mPackage;
    }

    @Nullable
    public final MrtrNavigateDeviceSales getNavigateSalesOrder() {
        return this.navigateSalesOrder;
    }

    @NotNull
    public final String getNewIdFlag() {
        return this.newIdFlag;
    }

    @Nullable
    public final PackageGroupCodeResponse getPackageGroupCodeResponse() {
        return this.packageGroupCodeResponse;
    }

    @NotNull
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    @Nullable
    public final PackageSet getPackageSetRetailer() {
        return this.packageSetRetailer;
    }

    @Nullable
    public final PaymentReceiptData getPaymentReceiptData() {
        return this.paymentReceiptData;
    }

    @Nullable
    public final PermitCheckProfileResponse getPermitCheckProfileResponse() {
        return this.permitCheckProfileResponse;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final String getPostcodeSequenceString() {
        return this.postcodeSequenceString;
    }

    @Nullable
    public final PostpaidPackageSetResponse getPostpaidPackageSetRetailerResponse() {
        return this.postpaidPackageSetRetailerResponse;
    }

    @Nullable
    public final MrtrPostpaidRegistrationResponse getPostpaidRegistrationResponse() {
        return this.postpaidRegistrationResponse;
    }

    @Nullable
    public final String getPostpaidValidationIdCardNumber() {
        return this.postpaidValidationIdCardNumber;
    }

    @Nullable
    public final MrtrPostpaidRegistrationRequest getRegisterRequest() {
        return this.registerRequest;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.simBarcode;
    }

    @Nullable
    public final SpecialPackageForNewIDResponse getSpecialPackageForNewIDResponse() {
        return this.specialPackageForNewIDResponse;
    }

    @Nullable
    public final SpecialPackageItem getSpecialPackageItem() {
        return this.specialPackageItem;
    }

    @Nullable
    public final String getTagFace() {
        return this.tagFace;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormCompareResult() {
        return this.upPassFormCompareResult;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormResult() {
        return this.upPassFormResult;
    }

    @Nullable
    public final MrtrPostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.validateSimBarcodeResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<String> list = this.imageOptionalsName;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.isWithDevice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isWithContract;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isSmartCard;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode2 = (((((((i4 + i5) * 31) + this.imie.hashCode()) * 31) + this.simBarcode.hashCode()) * 31) + this.idNumber.hashCode()) * 31;
        String str = this.postpaidValidationIdCardNumber;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.newIdFlag.hashCode()) * 31;
        boolean z4 = this.KYCRequireVerifyJC;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int hashCode4 = (((hashCode3 + i6) * 31) + this.invoiceAlertMethod.hashCode()) * 31;
        boolean z5 = this.isFaceRecog;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode4 + i7) * 31;
        boolean z6 = this.isCheckSimStock;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z7 = this.defaultPaymentFreeSim;
        int i11 = z7;
        if (z7 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z8 = this.isShowConsentXSim;
        int i13 = z8;
        if (z8 != 0) {
            i13 = 1;
        }
        int hashCode5 = (((((i12 + i13) * 31) + this.imageSignatureConsentXSim.hashCode()) * 31) + this.consentType.hashCode()) * 31;
        boolean z9 = this.isDefaultPackage;
        int i14 = z9;
        if (z9 != 0) {
            i14 = 1;
        }
        int hashCode6 = (((hashCode5 + i14) * 31) + this.blacklistSharingStatus.hashCode()) * 31;
        String str2 = this.canBuyDeviceWithContract;
        int hashCode7 = (((((((hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.idDocType.hashCode()) * 31) + this.lastNamePhotoMultiple) * 31) + this.kycAttemp) * 31;
        boolean z10 = this.isKYC;
        int i15 = z10;
        if (z10 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode7 + i15) * 31;
        FaceRecResponse faceRecResponse = this.compareResponse;
        int hashCode8 = (i16 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31;
        FaceCompareResponse faceCompareResponse = this.compareResponseForSubmit;
        int hashCode9 = (hashCode8 + (faceCompareResponse == null ? 0 : faceCompareResponse.hashCode())) * 31;
        CheckSimStockResponse checkSimStockResponse = this.checkSimStockResponse;
        int hashCode10 = (hashCode9 + (checkSimStockResponse == null ? 0 : checkSimStockResponse.hashCode())) * 31;
        GetNewIMEIResponse getNewIMEIResponse = this.hardwareNumberResponse;
        int hashCode11 = (hashCode10 + (getNewIMEIResponse == null ? 0 : getNewIMEIResponse.hashCode())) * 31;
        MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse = this.validateSimBarcodeResponse;
        int hashCode12 = (hashCode11 + (mrtrPostpaidValidateSimBarcodeResponse == null ? 0 : mrtrPostpaidValidateSimBarcodeResponse.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.cardInformation;
        int hashCode13 = (hashCode12 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection2 = this.cardInformationPaymentIdCardAddress;
        int hashCode14 = (hashCode13 + (idCardInformationCollection2 == null ? 0 : idCardInformationCollection2.hashCode())) * 31;
        boolean z11 = this.isSmartCardPaymentAddress;
        int i17 = z11;
        if (z11 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode14 + i17) * 31;
        CardCollection cardCollection = this.card;
        int hashCode15 = (i18 + (cardCollection == null ? 0 : cardCollection.hashCode())) * 31;
        String str3 = this.postcode;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postcodeSequenceString;
        int hashCode17 = (((hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.packageGroupRefNo.hashCode()) * 31;
        AddressMailingData addressMailingData = this.addressMailingData;
        int hashCode18 = (((((hashCode17 + (addressMailingData == null ? 0 : addressMailingData.hashCode())) * 31) + this.legalAddressPostCode.hashCode()) * 31) + this.blacklistFlag.hashCode()) * 31;
        Package r2 = this.mPackage;
        int hashCode19 = (hashCode18 + (r2 == null ? 0 : r2.hashCode())) * 31;
        PackageSet packageSet = this.packageSetRetailer;
        int hashCode20 = (hashCode19 + (packageSet == null ? 0 : packageSet.hashCode())) * 31;
        PackageGroupCodeResponse packageGroupCodeResponse = this.packageGroupCodeResponse;
        int hashCode21 = (hashCode20 + (packageGroupCodeResponse == null ? 0 : packageGroupCodeResponse.hashCode())) * 31;
        PaymentReceiptData paymentReceiptData = this.paymentReceiptData;
        int hashCode22 = (hashCode21 + (paymentReceiptData == null ? 0 : paymentReceiptData.hashCode())) * 31;
        AddressPaymentReceipt addressPaymentReceipt = this.addressPaymentReceipt;
        int hashCode23 = (hashCode22 + (addressPaymentReceipt == null ? 0 : addressPaymentReceipt.hashCode())) * 31;
        CutSimStockResponse cutSimStockResponse = this.cutSimStockResponse;
        int hashCode24 = (hashCode23 + (cutSimStockResponse == null ? 0 : cutSimStockResponse.hashCode())) * 31;
        MrtrPostpaidRegistrationRequest mrtrPostpaidRegistrationRequest = this.registerRequest;
        int hashCode25 = (hashCode24 + (mrtrPostpaidRegistrationRequest == null ? 0 : mrtrPostpaidRegistrationRequest.hashCode())) * 31;
        ErrorCollection errorCollection = this.checkSimStockError;
        int hashCode26 = (hashCode25 + (errorCollection == null ? 0 : errorCollection.hashCode())) * 31;
        ErrorCollection errorCollection2 = this.cutSimStockError;
        int hashCode27 = (hashCode26 + (errorCollection2 == null ? 0 : errorCollection2.hashCode())) * 31;
        PostpaidPackageSetResponse postpaidPackageSetResponse = this.postpaidPackageSetRetailerResponse;
        int hashCode28 = (((hashCode27 + (postpaidPackageSetResponse == null ? 0 : postpaidPackageSetResponse.hashCode())) * 31) + this.attachmentNames.hashCode()) * 31;
        MrtrNavigateDeviceSales mrtrNavigateDeviceSales = this.navigateSalesOrder;
        int hashCode29 = (hashCode28 + (mrtrNavigateDeviceSales == null ? 0 : mrtrNavigateDeviceSales.hashCode())) * 31;
        String str5 = this.tagFace;
        int hashCode30 = (hashCode29 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cutSimPostcode;
        int hashCode31 = (hashCode30 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse = this.postpaidRegistrationResponse;
        int hashCode32 = (hashCode31 + (mrtrPostpaidRegistrationResponse == null ? 0 : mrtrPostpaidRegistrationResponse.hashCode())) * 31;
        SpecialPackageForNewIDResponse specialPackageForNewIDResponse = this.specialPackageForNewIDResponse;
        int hashCode33 = (hashCode32 + (specialPackageForNewIDResponse == null ? 0 : specialPackageForNewIDResponse.hashCode())) * 31;
        Check3LevelResponse check3LevelResponse = this.check3LevelResponse;
        int hashCode34 = (hashCode33 + (check3LevelResponse == null ? 0 : check3LevelResponse.hashCode())) * 31;
        PermitCheckProfileResponse permitCheckProfileResponse = this.permitCheckProfileResponse;
        int hashCode35 = (hashCode34 + (permitCheckProfileResponse == null ? 0 : permitCheckProfileResponse.hashCode())) * 31;
        SpecialPackageItem specialPackageItem = this.specialPackageItem;
        int hashCode36 = (hashCode35 + (specialPackageItem == null ? 0 : specialPackageItem.hashCode())) * 31;
        boolean z12 = this.isEligible;
        int i19 = z12;
        if (z12 != 0) {
            i19 = 1;
        }
        int i20 = (hashCode36 + i19) * 31;
        boolean z13 = this.isAllowManualKYC;
        int i21 = z13;
        if (z13 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z14 = this.isRequireLiveness;
        int i23 = z14;
        if (z14 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        UpPassFormResult upPassFormResult = this.upPassFormResult;
        int hashCode37 = (i24 + (upPassFormResult == null ? 0 : upPassFormResult.hashCode())) * 31;
        UpPassFormResult upPassFormResult2 = this.upPassFormCompareResult;
        int hashCode38 = (((hashCode37 + (upPassFormResult2 == null ? 0 : upPassFormResult2.hashCode())) * 31) + this.currentFormType.hashCode()) * 31;
        String str7 = this.eligibleIdCard;
        int hashCode39 = (hashCode38 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z15 = this.isOverruleXSIM;
        return hashCode39 + (z15 ? 1 : z15 ? 1 : 0);
    }

    public final boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    public final boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final boolean isDefaultPackage() {
        return this.isDefaultPackage;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final boolean isFaceRecog() {
        return this.isFaceRecog;
    }

    public final boolean isKYC() {
        return this.isKYC;
    }

    public final boolean isOverruleXSIM() {
        return this.isOverruleXSIM;
    }

    public final boolean isRequireLiveness() {
        return this.isRequireLiveness;
    }

    public final boolean isShowConsentXSim() {
        return this.isShowConsentXSim;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final boolean isSmartCardPaymentAddress() {
        return this.isSmartCardPaymentAddress;
    }

    public final boolean isWithContract() {
        return this.isWithContract;
    }

    public final boolean isWithDevice() {
        return this.isWithDevice;
    }

    public final void setAddressMailingData(@Nullable AddressMailingData addressMailingData) {
        this.addressMailingData = addressMailingData;
    }

    public final void setAddressPaymentReceipt(@Nullable AddressPaymentReceipt addressPaymentReceipt) {
        this.addressPaymentReceipt = addressPaymentReceipt;
    }

    public final void setAllowManualKYC(boolean z) {
        this.isAllowManualKYC = z;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setBlacklistFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.blacklistFlag = str;
    }

    public final void setBlacklistSharingStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.blacklistSharingStatus = str;
    }

    public final void setCanBuyDeviceWithContract(@Nullable String str) {
        this.canBuyDeviceWithContract = str;
    }

    public final void setCard(@Nullable CardCollection cardCollection) {
        this.card = cardCollection;
    }

    public final void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformation = idCardInformationCollection;
    }

    public final void setCardInformationPaymentIdCardAddress(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformationPaymentIdCardAddress = idCardInformationCollection;
    }

    public final void setCheck3LevelResponse(@Nullable Check3LevelResponse check3LevelResponse) {
        this.check3LevelResponse = check3LevelResponse;
    }

    public final void setCheckSimStock(boolean z) {
        this.isCheckSimStock = z;
    }

    public final void setCheckSimStockError(@Nullable ErrorCollection errorCollection) {
        this.checkSimStockError = errorCollection;
    }

    public final void setCheckSimStockResponse(@Nullable CheckSimStockResponse checkSimStockResponse) {
        this.checkSimStockResponse = checkSimStockResponse;
    }

    public final void setCompareResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.compareResponse = faceRecResponse;
    }

    public final void setCompareResponseForSubmit(@Nullable FaceCompareResponse faceCompareResponse) {
        this.compareResponseForSubmit = faceCompareResponse;
    }

    public final void setConsentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentType = str;
    }

    public final void setCurrentFormType(@NotNull UpPassFormType upPassFormType) {
        Intrinsics.checkNotNullParameter(upPassFormType, "<set-?>");
        this.currentFormType = upPassFormType;
    }

    public final void setCutSimPostcode(@Nullable String str) {
        this.cutSimPostcode = str;
    }

    public final void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        this.cutSimStockError = errorCollection;
    }

    public final void setCutSimStockResponse(@Nullable CutSimStockResponse cutSimStockResponse) {
        this.cutSimStockResponse = cutSimStockResponse;
    }

    public final void setDefaultPackage(boolean z) {
        this.isDefaultPackage = z;
    }

    public final void setDefaultPaymentFreeSim(boolean z) {
        this.defaultPaymentFreeSim = z;
    }

    public final void setEligible(boolean z) {
        this.isEligible = z;
    }

    public final void setEligibleIdCard(@Nullable String str) {
        this.eligibleIdCard = str;
    }

    public final void setFaceRecog(boolean z) {
        this.isFaceRecog = z;
    }

    public final void setHardwareNumberResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.hardwareNumberResponse = getNewIMEIResponse;
    }

    public final void setIdDocType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idDocType = str;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setImageOptionalsName(@Nullable List<String> list) {
        this.imageOptionalsName = list;
    }

    public final void setImageSignatureConsentXSim(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageSignatureConsentXSim = str;
    }

    public final void setImie(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imie = str;
    }

    public final void setInvoiceAlertMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invoiceAlertMethod = str;
    }

    public final void setKYC(boolean z) {
        this.isKYC = z;
    }

    public final void setKYCRequireVerifyJC(boolean z) {
        this.KYCRequireVerifyJC = z;
    }

    public final void setKycAttemp(int i) {
        this.kycAttemp = i;
    }

    public final void setLastNamePhotoMultiple(int i) {
        this.lastNamePhotoMultiple = i;
    }

    public final void setLegalAddressPostCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.legalAddressPostCode = str;
    }

    public final void setMPackage(@Nullable Package r1) {
        this.mPackage = r1;
    }

    public final void setNavigateSalesOrder(@Nullable MrtrNavigateDeviceSales mrtrNavigateDeviceSales) {
        this.navigateSalesOrder = mrtrNavigateDeviceSales;
    }

    public final void setNewIdFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newIdFlag = str;
    }

    public final void setOverruleXSIM(boolean z) {
        this.isOverruleXSIM = z;
    }

    public final void setPackageGroupCodeResponse(@Nullable PackageGroupCodeResponse packageGroupCodeResponse) {
        this.packageGroupCodeResponse = packageGroupCodeResponse;
    }

    public final void setPackageGroupRefNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupRefNo = str;
    }

    public final void setPackageSetRetailer(@Nullable PackageSet packageSet) {
        this.packageSetRetailer = packageSet;
    }

    public final void setPaymentReceiptData(@Nullable PaymentReceiptData paymentReceiptData) {
        this.paymentReceiptData = paymentReceiptData;
    }

    public final void setPermitCheckProfileResponse(@Nullable PermitCheckProfileResponse permitCheckProfileResponse) {
        this.permitCheckProfileResponse = permitCheckProfileResponse;
    }

    public final void setPostcode(@Nullable String str) {
        this.postcode = str;
    }

    public final void setPostcodeSequenceString(@Nullable String str) {
        this.postcodeSequenceString = str;
    }

    public final void setPostpaidPackageSetRetailerResponse(@Nullable PostpaidPackageSetResponse postpaidPackageSetResponse) {
        this.postpaidPackageSetRetailerResponse = postpaidPackageSetResponse;
    }

    public final void setPostpaidRegistrationResponse(@Nullable MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse) {
        this.postpaidRegistrationResponse = mrtrPostpaidRegistrationResponse;
    }

    public final void setPostpaidValidationIdCardNumber(@Nullable String str) {
        this.postpaidValidationIdCardNumber = str;
    }

    public final void setRegisterRequest(@Nullable MrtrPostpaidRegistrationRequest mrtrPostpaidRegistrationRequest) {
        this.registerRequest = mrtrPostpaidRegistrationRequest;
    }

    public final void setRequireLiveness(boolean z) {
        this.isRequireLiveness = z;
    }

    public final void setShowConsentXSim(boolean z) {
        this.isShowConsentXSim = z;
    }

    public final void setSimBarcode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simBarcode = str;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSmartCardPaymentAddress(boolean z) {
        this.isSmartCardPaymentAddress = z;
    }

    public final void setSpecialPackageForNewIDResponse(@Nullable SpecialPackageForNewIDResponse specialPackageForNewIDResponse) {
        this.specialPackageForNewIDResponse = specialPackageForNewIDResponse;
    }

    public final void setSpecialPackageItem(@Nullable SpecialPackageItem specialPackageItem) {
        this.specialPackageItem = specialPackageItem;
    }

    public final void setTagFace(@Nullable String str) {
        this.tagFace = str;
    }

    public final void setUpPassFormCompareResult(@Nullable UpPassFormResult upPassFormResult) {
        this.upPassFormCompareResult = upPassFormResult;
    }

    public final void setUpPassFormResult(@Nullable UpPassFormResult upPassFormResult) {
        this.upPassFormResult = upPassFormResult;
    }

    public final void setValidateSimBarcodeResponse(@Nullable MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse) {
        this.validateSimBarcodeResponse = mrtrPostpaidValidateSimBarcodeResponse;
    }

    public final void setWithContract(boolean z) {
        this.isWithContract = z;
    }

    public final void setWithDevice(boolean z) {
        this.isWithDevice = z;
    }

    @NotNull
    public String toString() {
        List<String> list = this.imageOptionalsName;
        boolean z = this.isWithDevice;
        boolean z2 = this.isWithContract;
        boolean z3 = this.isSmartCard;
        String str = this.imie;
        String str2 = this.simBarcode;
        String str3 = this.idNumber;
        String str4 = this.postpaidValidationIdCardNumber;
        String str5 = this.newIdFlag;
        boolean z4 = this.KYCRequireVerifyJC;
        String str6 = this.invoiceAlertMethod;
        boolean z5 = this.isFaceRecog;
        boolean z6 = this.isCheckSimStock;
        boolean z7 = this.defaultPaymentFreeSim;
        boolean z8 = this.isShowConsentXSim;
        String str7 = this.imageSignatureConsentXSim;
        String str8 = this.consentType;
        boolean z9 = this.isDefaultPackage;
        String str9 = this.blacklistSharingStatus;
        String str10 = this.canBuyDeviceWithContract;
        String str11 = this.idDocType;
        int i = this.lastNamePhotoMultiple;
        int i2 = this.kycAttemp;
        boolean z10 = this.isKYC;
        FaceRecResponse faceRecResponse = this.compareResponse;
        FaceCompareResponse faceCompareResponse = this.compareResponseForSubmit;
        CheckSimStockResponse checkSimStockResponse = this.checkSimStockResponse;
        GetNewIMEIResponse getNewIMEIResponse = this.hardwareNumberResponse;
        MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse = this.validateSimBarcodeResponse;
        IdCardInformationCollection idCardInformationCollection = this.cardInformation;
        IdCardInformationCollection idCardInformationCollection2 = this.cardInformationPaymentIdCardAddress;
        boolean z11 = this.isSmartCardPaymentAddress;
        CardCollection cardCollection = this.card;
        String str12 = this.postcode;
        String str13 = this.postcodeSequenceString;
        String str14 = this.packageGroupRefNo;
        AddressMailingData addressMailingData = this.addressMailingData;
        String str15 = this.legalAddressPostCode;
        String str16 = this.blacklistFlag;
        Package r15 = this.mPackage;
        PackageSet packageSet = this.packageSetRetailer;
        PackageGroupCodeResponse packageGroupCodeResponse = this.packageGroupCodeResponse;
        PaymentReceiptData paymentReceiptData = this.paymentReceiptData;
        AddressPaymentReceipt addressPaymentReceipt = this.addressPaymentReceipt;
        CutSimStockResponse cutSimStockResponse = this.cutSimStockResponse;
        MrtrPostpaidRegistrationRequest mrtrPostpaidRegistrationRequest = this.registerRequest;
        ErrorCollection errorCollection = this.checkSimStockError;
        ErrorCollection errorCollection2 = this.cutSimStockError;
        PostpaidPackageSetResponse postpaidPackageSetResponse = this.postpaidPackageSetRetailerResponse;
        List<String> list2 = this.attachmentNames;
        MrtrNavigateDeviceSales mrtrNavigateDeviceSales = this.navigateSalesOrder;
        String str17 = this.tagFace;
        String str18 = this.cutSimPostcode;
        MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse = this.postpaidRegistrationResponse;
        SpecialPackageForNewIDResponse specialPackageForNewIDResponse = this.specialPackageForNewIDResponse;
        Check3LevelResponse check3LevelResponse = this.check3LevelResponse;
        PermitCheckProfileResponse permitCheckProfileResponse = this.permitCheckProfileResponse;
        SpecialPackageItem specialPackageItem = this.specialPackageItem;
        boolean z12 = this.isEligible;
        boolean z13 = this.isAllowManualKYC;
        boolean z14 = this.isRequireLiveness;
        UpPassFormResult upPassFormResult = this.upPassFormResult;
        UpPassFormResult upPassFormResult2 = this.upPassFormCompareResult;
        UpPassFormType upPassFormType = this.currentFormType;
        String str19 = this.eligibleIdCard;
        boolean z15 = this.isOverruleXSIM;
        return "MrtrPostpaidModel(imageOptionalsName=" + list + ", isWithDevice=" + z + ", isWithContract=" + z2 + ", isSmartCard=" + z3 + ", imie=" + str + ", simBarcode=" + str2 + ", idNumber=" + str3 + ", postpaidValidationIdCardNumber=" + str4 + ", newIdFlag=" + str5 + ", KYCRequireVerifyJC=" + z4 + ", invoiceAlertMethod=" + str6 + ", isFaceRecog=" + z5 + ", isCheckSimStock=" + z6 + ", defaultPaymentFreeSim=" + z7 + ", isShowConsentXSim=" + z8 + ", imageSignatureConsentXSim=" + str7 + ", consentType=" + str8 + ", isDefaultPackage=" + z9 + ", blacklistSharingStatus=" + str9 + ", canBuyDeviceWithContract=" + str10 + ", idDocType=" + str11 + ", lastNamePhotoMultiple=" + i + ", kycAttemp=" + i2 + ", isKYC=" + z10 + ", compareResponse=" + faceRecResponse + ", compareResponseForSubmit=" + faceCompareResponse + ", checkSimStockResponse=" + checkSimStockResponse + ", hardwareNumberResponse=" + getNewIMEIResponse + ", validateSimBarcodeResponse=" + mrtrPostpaidValidateSimBarcodeResponse + ", cardInformation=" + idCardInformationCollection + ", cardInformationPaymentIdCardAddress=" + idCardInformationCollection2 + ", isSmartCardPaymentAddress=" + z11 + ", card=" + cardCollection + ", postcode=" + str12 + ", postcodeSequenceString=" + str13 + ", packageGroupRefNo=" + str14 + ", addressMailingData=" + addressMailingData + ", legalAddressPostCode=" + str15 + ", blacklistFlag=" + str16 + ", mPackage=" + r15 + ", packageSetRetailer=" + packageSet + ", packageGroupCodeResponse=" + packageGroupCodeResponse + ", paymentReceiptData=" + paymentReceiptData + ", addressPaymentReceipt=" + addressPaymentReceipt + ", cutSimStockResponse=" + cutSimStockResponse + ", registerRequest=" + mrtrPostpaidRegistrationRequest + ", checkSimStockError=" + errorCollection + ", cutSimStockError=" + errorCollection2 + ", postpaidPackageSetRetailerResponse=" + postpaidPackageSetResponse + ", attachmentNames=" + list2 + ", navigateSalesOrder=" + mrtrNavigateDeviceSales + ", tagFace=" + str17 + ", cutSimPostcode=" + str18 + ", postpaidRegistrationResponse=" + mrtrPostpaidRegistrationResponse + ", specialPackageForNewIDResponse=" + specialPackageForNewIDResponse + ", check3LevelResponse=" + check3LevelResponse + ", permitCheckProfileResponse=" + permitCheckProfileResponse + ", specialPackageItem=" + specialPackageItem + ", isEligible=" + z12 + ", isAllowManualKYC=" + z13 + ", isRequireLiveness=" + z14 + ", upPassFormResult=" + upPassFormResult + ", upPassFormCompareResult=" + upPassFormResult2 + ", currentFormType=" + upPassFormType + ", eligibleIdCard=" + str19 + ", isOverruleXSIM=" + z15 + ")";
    }

    public MrtrPostpaidModel(@Nullable List<String> list, boolean z, boolean z2, boolean z3, @NotNull String imie, @NotNull String simBarcode, @NotNull String idNumber, @Nullable String str, @NotNull String newIdFlag, boolean z4, @NotNull String invoiceAlertMethod, boolean z5, boolean z6, boolean z7, boolean z8, @NotNull String imageSignatureConsentXSim, @NotNull String consentType, boolean z9, @NotNull String blacklistSharingStatus, @Nullable String str2, @NotNull String idDocType, int i, int i2, boolean z10, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, @Nullable CheckSimStockResponse checkSimStockResponse, @Nullable GetNewIMEIResponse getNewIMEIResponse, @Nullable MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, boolean z11, @Nullable CardCollection cardCollection, @Nullable String str3, @Nullable String str4, @NotNull String packageGroupRefNo, @Nullable AddressMailingData addressMailingData, @NotNull String legalAddressPostCode, @NotNull String blacklistFlag, @Nullable Package r56, @Nullable PackageSet packageSet, @Nullable PackageGroupCodeResponse packageGroupCodeResponse, @Nullable PaymentReceiptData paymentReceiptData, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable MrtrPostpaidRegistrationRequest mrtrPostpaidRegistrationRequest, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, @Nullable PostpaidPackageSetResponse postpaidPackageSetResponse, @NotNull List<String> attachmentNames, @Nullable MrtrNavigateDeviceSales mrtrNavigateDeviceSales, @Nullable String str5, @Nullable String str6, @Nullable MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse, @Nullable SpecialPackageForNewIDResponse specialPackageForNewIDResponse, @Nullable Check3LevelResponse check3LevelResponse, @Nullable PermitCheckProfileResponse permitCheckProfileResponse, @Nullable SpecialPackageItem specialPackageItem, boolean z12, boolean z13, boolean z14, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @NotNull UpPassFormType currentFormType, @Nullable String str7, boolean z15) {
        Intrinsics.checkNotNullParameter(imie, "imie");
        Intrinsics.checkNotNullParameter(simBarcode, "simBarcode");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(newIdFlag, "newIdFlag");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(imageSignatureConsentXSim, "imageSignatureConsentXSim");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(blacklistSharingStatus, "blacklistSharingStatus");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(legalAddressPostCode, "legalAddressPostCode");
        Intrinsics.checkNotNullParameter(blacklistFlag, "blacklistFlag");
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        this.imageOptionalsName = list;
        this.isWithDevice = z;
        this.isWithContract = z2;
        this.isSmartCard = z3;
        this.imie = imie;
        this.simBarcode = simBarcode;
        this.idNumber = idNumber;
        this.postpaidValidationIdCardNumber = str;
        this.newIdFlag = newIdFlag;
        this.KYCRequireVerifyJC = z4;
        this.invoiceAlertMethod = invoiceAlertMethod;
        this.isFaceRecog = z5;
        this.isCheckSimStock = z6;
        this.defaultPaymentFreeSim = z7;
        this.isShowConsentXSim = z8;
        this.imageSignatureConsentXSim = imageSignatureConsentXSim;
        this.consentType = consentType;
        this.isDefaultPackage = z9;
        this.blacklistSharingStatus = blacklistSharingStatus;
        this.canBuyDeviceWithContract = str2;
        this.idDocType = idDocType;
        this.lastNamePhotoMultiple = i;
        this.kycAttemp = i2;
        this.isKYC = z10;
        this.compareResponse = faceRecResponse;
        this.compareResponseForSubmit = faceCompareResponse;
        this.checkSimStockResponse = checkSimStockResponse;
        this.hardwareNumberResponse = getNewIMEIResponse;
        this.validateSimBarcodeResponse = mrtrPostpaidValidateSimBarcodeResponse;
        this.cardInformation = idCardInformationCollection;
        this.cardInformationPaymentIdCardAddress = idCardInformationCollection2;
        this.isSmartCardPaymentAddress = z11;
        this.card = cardCollection;
        this.postcode = str3;
        this.postcodeSequenceString = str4;
        this.packageGroupRefNo = packageGroupRefNo;
        this.addressMailingData = addressMailingData;
        this.legalAddressPostCode = legalAddressPostCode;
        this.blacklistFlag = blacklistFlag;
        this.mPackage = r56;
        this.packageSetRetailer = packageSet;
        this.packageGroupCodeResponse = packageGroupCodeResponse;
        this.paymentReceiptData = paymentReceiptData;
        this.addressPaymentReceipt = addressPaymentReceipt;
        this.cutSimStockResponse = cutSimStockResponse;
        this.registerRequest = mrtrPostpaidRegistrationRequest;
        this.checkSimStockError = errorCollection;
        this.cutSimStockError = errorCollection2;
        this.postpaidPackageSetRetailerResponse = postpaidPackageSetResponse;
        this.attachmentNames = attachmentNames;
        this.navigateSalesOrder = mrtrNavigateDeviceSales;
        this.tagFace = str5;
        this.cutSimPostcode = str6;
        this.postpaidRegistrationResponse = mrtrPostpaidRegistrationResponse;
        this.specialPackageForNewIDResponse = specialPackageForNewIDResponse;
        this.check3LevelResponse = check3LevelResponse;
        this.permitCheckProfileResponse = permitCheckProfileResponse;
        this.specialPackageItem = specialPackageItem;
        this.isEligible = z12;
        this.isAllowManualKYC = z13;
        this.isRequireLiveness = z14;
        this.upPassFormResult = upPassFormResult;
        this.upPassFormCompareResult = upPassFormResult2;
        this.currentFormType = currentFormType;
        this.eligibleIdCard = str7;
        this.isOverruleXSIM = z15;
    }

    public /* synthetic */ MrtrPostpaidModel(List list, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, boolean z4, String str6, boolean z5, boolean z6, boolean z7, boolean z8, String str7, String str8, boolean z9, String str9, String str10, String str11, int i, int i2, boolean z10, FaceRecResponse faceRecResponse, FaceCompareResponse faceCompareResponse, CheckSimStockResponse checkSimStockResponse, GetNewIMEIResponse getNewIMEIResponse, MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse, IdCardInformationCollection idCardInformationCollection, IdCardInformationCollection idCardInformationCollection2, boolean z11, CardCollection cardCollection, String str12, String str13, String str14, AddressMailingData addressMailingData, String str15, String str16, Package r109, PackageSet packageSet, PackageGroupCodeResponse packageGroupCodeResponse, PaymentReceiptData paymentReceiptData, AddressPaymentReceipt addressPaymentReceipt, CutSimStockResponse cutSimStockResponse, MrtrPostpaidRegistrationRequest mrtrPostpaidRegistrationRequest, ErrorCollection errorCollection, ErrorCollection errorCollection2, PostpaidPackageSetResponse postpaidPackageSetResponse, List list2, MrtrNavigateDeviceSales mrtrNavigateDeviceSales, String str17, String str18, MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse, SpecialPackageForNewIDResponse specialPackageForNewIDResponse, Check3LevelResponse check3LevelResponse, PermitCheckProfileResponse permitCheckProfileResponse, SpecialPackageItem specialPackageItem, boolean z12, boolean z13, boolean z14, UpPassFormResult upPassFormResult, UpPassFormResult upPassFormResult2, UpPassFormType upPassFormType, String str19, boolean z15, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? false : z4, (i3 & 1024) != 0 ? "" : str6, (i3 & 2048) != 0 ? false : z5, (i3 & 4096) != 0 ? false : z6, (i3 & 8192) != 0 ? false : z7, (i3 & 16384) != 0 ? false : z8, (i3 & 32768) != 0 ? "" : str7, (i3 & 65536) != 0 ? "" : str8, (i3 & 131072) != 0 ? false : z9, (i3 & 262144) != 0 ? "" : str9, (i3 & 524288) != 0 ? null : str10, (i3 & 1048576) != 0 ? IdDocumentType.ID_CARD : str11, (i3 & 2097152) != 0 ? 0 : i, (i3 & 4194304) != 0 ? 0 : i2, (i3 & 8388608) != 0 ? false : z10, (i3 & 16777216) != 0 ? null : faceRecResponse, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : faceCompareResponse, (i3 & 67108864) != 0 ? null : checkSimStockResponse, (i3 & 134217728) != 0 ? null : getNewIMEIResponse, (i3 & 268435456) != 0 ? null : mrtrPostpaidValidateSimBarcodeResponse, (i3 & PKIFailureInfo.duplicateCertReq) != 0 ? null : idCardInformationCollection, (i3 & 1073741824) != 0 ? null : idCardInformationCollection2, (i3 & Integer.MIN_VALUE) != 0 ? false : z11, (i4 & 1) != 0 ? null : cardCollection, (i4 & 2) != 0 ? null : str12, (i4 & 4) != 0 ? null : str13, (i4 & 8) != 0 ? "" : str14, (i4 & 16) != 0 ? null : addressMailingData, (i4 & 32) != 0 ? "" : str15, (i4 & 64) != 0 ? "" : str16, (i4 & 128) != 0 ? null : r109, (i4 & 256) != 0 ? null : packageSet, (i4 & 512) != 0 ? null : packageGroupCodeResponse, (i4 & 1024) != 0 ? null : paymentReceiptData, (i4 & 2048) != 0 ? null : addressPaymentReceipt, (i4 & 4096) != 0 ? null : cutSimStockResponse, (i4 & 8192) != 0 ? null : mrtrPostpaidRegistrationRequest, (i4 & 16384) != 0 ? null : errorCollection, (i4 & 32768) != 0 ? null : errorCollection2, (i4 & 65536) != 0 ? null : postpaidPackageSetResponse, (i4 & 131072) != 0 ? new ArrayList() : list2, (i4 & 262144) != 0 ? null : mrtrNavigateDeviceSales, (i4 & 524288) != 0 ? "" : str17, (i4 & 1048576) != 0 ? "" : str18, (i4 & 2097152) != 0 ? null : mrtrPostpaidRegistrationResponse, (i4 & 4194304) != 0 ? null : specialPackageForNewIDResponse, (i4 & 8388608) != 0 ? null : check3LevelResponse, (i4 & 16777216) != 0 ? null : permitCheckProfileResponse, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : specialPackageItem, (i4 & 67108864) != 0 ? false : z12, (i4 & 134217728) != 0 ? false : z13, (i4 & 268435456) != 0 ? false : z14, (i4 & PKIFailureInfo.duplicateCertReq) != 0 ? null : upPassFormResult, (i4 & 1073741824) != 0 ? null : upPassFormResult2, (i4 & Integer.MIN_VALUE) != 0 ? new UpPassFormType.Ocr(null, null, false, null, 15, null) : upPassFormType, (i5 & 1) != 0 ? "" : str19, (i5 & 2) != 0 ? false : z15);
    }
}