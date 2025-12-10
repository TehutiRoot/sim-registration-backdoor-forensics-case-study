package th.p047co.dtac.android.dtacone.model.mrtr_prepaid;

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
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.model.mixpanel.prepaid.PrepaidMixpanelData;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.AddressPaymentReceipt;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.PaymentReceiptData;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.activate.ActivateResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.assign_pooling.response.MrtrPrepaidAssignPoolingResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.family_sim.SaveFamilySimResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.permission_activation.MrtrPermissionActivationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.FaceCompareResponseSubmit;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.response.MrtrPrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.NationWideCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.SimTermSukCheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentRequest;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Ý\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bï\u0001\b\u0087\b\u0018\u00002\u00020\u0001B«\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010/\u001a\u00020!\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00104\u001a\u00020&\u0012\b\b\u0002\u00105\u001a\u00020&\u0012\b\b\u0002\u00106\u001a\u00020&\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010?\u001a\u00020!\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010D\u0012\b\b\u0002\u0010I\u001a\u00020&\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010L\u001a\u00020!\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u00020S\u0012\b\b\u0002\u0010T\u001a\u00020U\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z¢\u0006\u0002\u0010[J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020!HÆ\u0003J\u0010\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020\t0#HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020&HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010.HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020!HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u000103HÆ\u0003J\n\u0010£\u0002\u001a\u00020&HÆ\u0003J\n\u0010¤\u0002\u001a\u00020&HÆ\u0003J\n\u0010¥\u0002\u001a\u00020&HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010>HÆ\u0003J\n\u0010ª\u0002\u001a\u00020!HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\n\u0010³\u0002\u001a\u00020&HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010µ\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010·\u0002\u001a\u00020!HÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010NHÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010PHÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010PHÆ\u0003J\n\u0010»\u0002\u001a\u00020SHÆ\u0003J\n\u0010¼\u0002\u001a\u00020UHÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010WHÆ\u0003J\f\u0010¾\u0002\u001a\u0004\u0018\u00010WHÆ\u0003J\f\u0010¿\u0002\u001a\u0004\u0018\u00010ZHÆ\u0003J\f\u0010À\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010Á\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010\u0010HÆ\u0003J°\u0005\u0010Ä\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u00020!2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020&2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020!2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010I\u001a\u00020&2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010L\u001a\u00020!2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010ZHÆ\u0001J\u0015\u0010Å\u0002\u001a\u00020&2\t\u0010Æ\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ç\u0002\u001a\u00020!HÖ\u0001J\n\u0010È\u0002\u001a\u00020\tHÖ\u0001R\u001c\u0010(\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010'\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010]\"\u0004\ba\u0010_R\u001c\u0010F\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010G\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010c\"\u0004\bs\u0010eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010]\"\u0004\by\u0010_R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u007f\"\u0006\b\u0083\u0001\u0010\u0081\u0001R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010]\"\u0005\b\u0085\u0001\u0010_R\u001e\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010c\"\u0005\b\u0087\u0001\u0010eR \u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010T\u001a\u00020UX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010E\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010c\"\u0005\b\u0095\u0001\u0010eR \u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010]\"\u0005\b\u009b\u0001\u0010_R \u0010Y\u001a\u0004\u0018\u00010ZX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010J\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010]\"\u0005\b¡\u0001\u0010_R\u001e\u0010K\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010]\"\u0005\b£\u0001\u0010_R \u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010]\"\u0005\b©\u0001\u0010_R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010]\"\u0005\b«\u0001\u0010_R\u001d\u00105\u001a\u00020&X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b5\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u001d\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b%\u0010¬\u0001\"\u0006\b¯\u0001\u0010®\u0001R\u001d\u00106\u001a\u00020&X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b6\u0010¬\u0001\"\u0006\b°\u0001\u0010®\u0001R\u001d\u0010I\u001a\u00020&X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bI\u0010¬\u0001\"\u0006\b±\u0001\u0010®\u0001R\u001e\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u001e\u0010L\u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¶\u0001\u0010³\u0001\"\u0006\b·\u0001\u0010µ\u0001R \u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R \u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R \u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R \u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u001e\u0010@\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0001\u0010]\"\u0005\bÍ\u0001\u0010_R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010]\"\u0005\bÏ\u0001\u0010_R \u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010]\"\u0005\bÕ\u0001\u0010_R \u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÚ\u0001\u0010]\"\u0005\bÛ\u0001\u0010_R \u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R \u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R \u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R\u001e\u0010$\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0001\u0010]\"\u0005\bí\u0001\u0010_R\u001e\u00104\u001a\u00020&X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bî\u0001\u0010¬\u0001\"\u0006\bï\u0001\u0010®\u0001R\u001e\u0010H\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bð\u0001\u0010c\"\u0005\bñ\u0001\u0010eR \u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u001e\u0010?\u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bö\u0001\u0010³\u0001\"\u0006\b÷\u0001\u0010µ\u0001R\u001e\u0010/\u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bø\u0001\u0010³\u0001\"\u0006\bù\u0001\u0010µ\u0001R \u0010X\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R \u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bþ\u0001\u0010û\u0001\"\u0006\bÿ\u0001\u0010ý\u0001R\u001e\u0010R\u001a\u00020SX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R \u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R \u0010Q\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0002\u0010\u0085\u0002\"\u0006\b\u0089\u0002\u0010\u0087\u0002¨\u0006É\u0002"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid/MrtrPrepaid;", "", "prepaidConfig", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;", "nationWideCollection", "Lth/co/dtac/android/dtacone/model/prepaid/NationWideCollection;", "prepaidMixpanelData", "Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;", "ocrIdCard", "", "cameraBirthDate", "displaySubscriberNumber", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformationForAddress", "card", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "postcodeSequence", "Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;", "postcode", "postcodeSequenceString", "cardType", "imageName", "idDocType", "paymentReceiptData", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "addressPaymentReceipt", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "addressMailingData", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "consentNonTelcoResponse", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "kycAttemp", "", "attachmentNames", "", "registerType", "isKYC", "", "acceptNonTelco", "ConsentVersionLabel", "activationResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/activate/ActivateResponse;", "saveFamilySimResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/SaveFamilySimResponse;", "checkSimStockResponse", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "totalAmount", "cutSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "getAuthorizationByRtrResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "requireFaceRecognition", "isCheckSimStock", "isOverruleXSim", "mrtrPrepaidValidateBarcodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;", "mrtrPermissionActivationResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationResponse;", "registerRequest", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "registerResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "successType", "nontelcoConsentType", "mrtrPrepaidAssignPoolingResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/assign_pooling/response/MrtrPrepaidAssignPoolingResponse;", "checkSimStockError", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "cutSimStockError", "activationError", "assignPoolingError", "saveFamilySimError", "isReadCardInAddress", "familySimPostpaidNumber", "featureCode", "lastOptionalImageName", "mrtrPrepaidValidateIdCardResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "xSIMConsentResponse", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "xSIMConsentResponsePreview", "xSIMConsentRequest", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "currentFormType", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "upPassFormResult", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "upPassFormCompareResult", "faceCompareResponseSubmit", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;", "(Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;Lth/co/dtac/android/dtacone/model/prepaid/NationWideCollection;Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;ILjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/activate/ActivateResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/SaveFamilySimResponse;Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;ILth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;ZZZLth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;ILjava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/assign_pooling/response/MrtrPrepaidAssignPoolingResponse;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;ZLjava/lang/String;Ljava/lang/String;ILth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;)V", "getConsentVersionLabel", "()Ljava/lang/String;", "setConsentVersionLabel", "(Ljava/lang/String;)V", "getAcceptNonTelco", "setAcceptNonTelco", "getActivationError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "setActivationError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "getActivationResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/activate/ActivateResponse;", "setActivationResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/activate/ActivateResponse;)V", "getAddressMailingData", "()Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "setAddressMailingData", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;)V", "getAddressPaymentReceipt", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "setAddressPaymentReceipt", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;)V", "getAssignPoolingError", "setAssignPoolingError", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getCameraBirthDate", "setCameraBirthDate", "getCard", "()Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "setCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;)V", "getCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCardInformationForAddress", "setCardInformationForAddress", "getCardType", "setCardType", "getCheckSimStockError", "setCheckSimStockError", "getCheckSimStockResponse", "()Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;", "setCheckSimStockResponse", "(Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/SimTermSukCheckSimStockResponse;)V", "getConsentNonTelcoResponse", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "setConsentNonTelcoResponse", "(Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;)V", "getCurrentFormType", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "setCurrentFormType", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)V", "getCutSimStockError", "setCutSimStockError", "getCutSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "setCutSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;)V", "getDisplaySubscriberNumber", "setDisplaySubscriberNumber", "getFaceCompareResponseSubmit", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;", "setFaceCompareResponseSubmit", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/FaceCompareResponseSubmit;)V", "getFamilySimPostpaidNumber", "setFamilySimPostpaidNumber", "getFeatureCode", "setFeatureCode", "getGetAuthorizationByRtrResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "setGetAuthorizationByRtrResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;)V", "getIdDocType", "setIdDocType", "getImageName", "setImageName", "()Z", "setCheckSimStock", "(Z)V", "setKYC", "setOverruleXSim", "setReadCardInAddress", "getKycAttemp", "()I", "setKycAttemp", "(I)V", "getLastOptionalImageName", "setLastOptionalImageName", "getMrtrPermissionActivationResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationResponse;", "setMrtrPermissionActivationResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationResponse;)V", "getMrtrPrepaidAssignPoolingResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/assign_pooling/response/MrtrPrepaidAssignPoolingResponse;", "setMrtrPrepaidAssignPoolingResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/assign_pooling/response/MrtrPrepaidAssignPoolingResponse;)V", "getMrtrPrepaidValidateBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;", "setMrtrPrepaidValidateBarcodeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;)V", "getMrtrPrepaidValidateIdCardResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "setMrtrPrepaidValidateIdCardResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;)V", "getNationWideCollection", "()Lth/co/dtac/android/dtacone/model/prepaid/NationWideCollection;", "setNationWideCollection", "(Lth/co/dtac/android/dtacone/model/prepaid/NationWideCollection;)V", "getNontelcoConsentType", "setNontelcoConsentType", "getOcrIdCard", "setOcrIdCard", "getPaymentReceiptData", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "setPaymentReceiptData", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;)V", "getPostcode", "setPostcode", "getPostcodeSequence", "()Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;", "setPostcodeSequence", "(Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;)V", "getPostcodeSequenceString", "setPostcodeSequenceString", "getPrepaidConfig", "()Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;", "setPrepaidConfig", "(Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;)V", "getPrepaidMixpanelData", "()Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;", "setPrepaidMixpanelData", "(Lth/co/dtac/android/dtacone/model/mixpanel/prepaid/PrepaidMixpanelData;)V", "getRegisterRequest", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;", "setRegisterRequest", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/request/MrtrPrepaidRegisterRequest;)V", "getRegisterResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "setRegisterResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;)V", "getRegisterType", "setRegisterType", "getRequireFaceRecognition", "setRequireFaceRecognition", "getSaveFamilySimError", "setSaveFamilySimError", "getSaveFamilySimResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/SaveFamilySimResponse;", "setSaveFamilySimResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/SaveFamilySimResponse;)V", "getSuccessType", "setSuccessType", "getTotalAmount", "setTotalAmount", "getUpPassFormCompareResult", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "setUpPassFormCompareResult", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;)V", "getUpPassFormResult", "setUpPassFormResult", "getXSIMConsentRequest", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;", "setXSIMConsentRequest", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentRequest;)V", "getXSIMConsentResponse", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "setXSIMConsentResponse", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;)V", "getXSIMConsentResponsePreview", "setXSIMConsentResponsePreview", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid.MrtrPrepaid */
/* loaded from: classes8.dex */
public final class MrtrPrepaid {
    public static final int $stable = 8;
    @Nullable
    private String ConsentVersionLabel;
    @Nullable
    private String acceptNonTelco;
    @Nullable
    private ErrorCollection activationError;
    @Nullable
    private ActivateResponse activationResponse;
    @Nullable
    private AddressMailingData addressMailingData;
    @Nullable
    private AddressPaymentReceipt addressPaymentReceipt;
    @Nullable
    private ErrorCollection assignPoolingError;
    @NotNull
    private List<String> attachmentNames;
    @Nullable
    private String cameraBirthDate;
    @Nullable
    private CardCollection card;
    @Nullable
    private IdCardInformationCollection cardInformation;
    @Nullable
    private IdCardInformationCollection cardInformationForAddress;
    @Nullable
    private String cardType;
    @Nullable
    private ErrorCollection checkSimStockError;
    @Nullable
    private SimTermSukCheckSimStockResponse checkSimStockResponse;
    @Nullable
    private ConsentNonTelcoResponse consentNonTelcoResponse;
    @NotNull
    private UpPassFormType currentFormType;
    @Nullable
    private ErrorCollection cutSimStockError;
    @Nullable
    private CutSimStockResponse cutSimStockResponse;
    @Nullable
    private String displaySubscriberNumber;
    @Nullable
    private FaceCompareResponseSubmit faceCompareResponseSubmit;
    @Nullable
    private String familySimPostpaidNumber;
    @Nullable
    private String featureCode;
    @Nullable
    private GetAuthorizationByRtrResponse getAuthorizationByRtrResponse;
    @Nullable
    private String idDocType;
    @Nullable
    private String imageName;
    private boolean isCheckSimStock;
    private boolean isKYC;
    private boolean isOverruleXSim;
    private boolean isReadCardInAddress;
    private int kycAttemp;
    private int lastOptionalImageName;
    @Nullable
    private MrtrPermissionActivationResponse mrtrPermissionActivationResponse;
    @Nullable
    private MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse;
    @Nullable
    private MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse;
    @Nullable
    private MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse;
    @Nullable
    private NationWideCollection nationWideCollection;
    @Nullable
    private String nontelcoConsentType;
    @Nullable
    private String ocrIdCard;
    @Nullable
    private PaymentReceiptData paymentReceiptData;
    @Nullable
    private String postcode;
    @Nullable
    private CardInformationCollection postcodeSequence;
    @Nullable
    private String postcodeSequenceString;
    @Nullable
    private PrepaidConfig prepaidConfig;
    @Nullable
    private PrepaidMixpanelData prepaidMixpanelData;
    @Nullable
    private MrtrPrepaidRegisterRequest registerRequest;
    @Nullable
    private MrtrPrepaidRegisterResponse registerResponse;
    @Nullable
    private String registerType;
    private boolean requireFaceRecognition;
    @Nullable
    private ErrorCollection saveFamilySimError;
    @Nullable
    private SaveFamilySimResponse saveFamilySimResponse;
    private int successType;
    private int totalAmount;
    @Nullable
    private UpPassFormResult upPassFormCompareResult;
    @Nullable
    private UpPassFormResult upPassFormResult;
    @NotNull
    private XSIMConsentRequest xSIMConsentRequest;
    @Nullable
    private XSIMConsentResponse xSIMConsentResponse;
    @Nullable
    private XSIMConsentResponse xSIMConsentResponsePreview;

    public MrtrPrepaid() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, null, null, 0, null, null, false, false, false, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, null, null, null, null, null, -1, 67108863, null);
    }

    @Nullable
    public final PrepaidConfig component1() {
        return this.prepaidConfig;
    }

    @Nullable
    public final CardInformationCollection component10() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String component11() {
        return this.postcode;
    }

    @Nullable
    public final String component12() {
        return this.postcodeSequenceString;
    }

    @Nullable
    public final String component13() {
        return this.cardType;
    }

    @Nullable
    public final String component14() {
        return this.imageName;
    }

    @Nullable
    public final String component15() {
        return this.idDocType;
    }

    @Nullable
    public final PaymentReceiptData component16() {
        return this.paymentReceiptData;
    }

    @Nullable
    public final AddressPaymentReceipt component17() {
        return this.addressPaymentReceipt;
    }

    @Nullable
    public final AddressMailingData component18() {
        return this.addressMailingData;
    }

    @Nullable
    public final ConsentNonTelcoResponse component19() {
        return this.consentNonTelcoResponse;
    }

    @Nullable
    public final NationWideCollection component2() {
        return this.nationWideCollection;
    }

    public final int component20() {
        return this.kycAttemp;
    }

    @NotNull
    public final List<String> component21() {
        return this.attachmentNames;
    }

    @Nullable
    public final String component22() {
        return this.registerType;
    }

    public final boolean component23() {
        return this.isKYC;
    }

    @Nullable
    public final String component24() {
        return this.acceptNonTelco;
    }

    @Nullable
    public final String component25() {
        return this.ConsentVersionLabel;
    }

    @Nullable
    public final ActivateResponse component26() {
        return this.activationResponse;
    }

    @Nullable
    public final SaveFamilySimResponse component27() {
        return this.saveFamilySimResponse;
    }

    @Nullable
    public final SimTermSukCheckSimStockResponse component28() {
        return this.checkSimStockResponse;
    }

    public final int component29() {
        return this.totalAmount;
    }

    @Nullable
    public final PrepaidMixpanelData component3() {
        return this.prepaidMixpanelData;
    }

    @Nullable
    public final CutSimStockResponse component30() {
        return this.cutSimStockResponse;
    }

    @Nullable
    public final GetAuthorizationByRtrResponse component31() {
        return this.getAuthorizationByRtrResponse;
    }

    public final boolean component32() {
        return this.requireFaceRecognition;
    }

    public final boolean component33() {
        return this.isCheckSimStock;
    }

    public final boolean component34() {
        return this.isOverruleXSim;
    }

    @Nullable
    public final MrtrPrepaidValidateBarcodeResponse component35() {
        return this.mrtrPrepaidValidateBarcodeResponse;
    }

    @Nullable
    public final MrtrPermissionActivationResponse component36() {
        return this.mrtrPermissionActivationResponse;
    }

    @Nullable
    public final MrtrPrepaidRegisterRequest component37() {
        return this.registerRequest;
    }

    @Nullable
    public final MrtrPrepaidRegisterResponse component38() {
        return this.registerResponse;
    }

    public final int component39() {
        return this.successType;
    }

    @Nullable
    public final String component4() {
        return this.ocrIdCard;
    }

    @Nullable
    public final String component40() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final MrtrPrepaidAssignPoolingResponse component41() {
        return this.mrtrPrepaidAssignPoolingResponse;
    }

    @Nullable
    public final ErrorCollection component42() {
        return this.checkSimStockError;
    }

    @Nullable
    public final ErrorCollection component43() {
        return this.cutSimStockError;
    }

    @Nullable
    public final ErrorCollection component44() {
        return this.activationError;
    }

    @Nullable
    public final ErrorCollection component45() {
        return this.assignPoolingError;
    }

    @Nullable
    public final ErrorCollection component46() {
        return this.saveFamilySimError;
    }

    public final boolean component47() {
        return this.isReadCardInAddress;
    }

    @Nullable
    public final String component48() {
        return this.familySimPostpaidNumber;
    }

    @Nullable
    public final String component49() {
        return this.featureCode;
    }

    @Nullable
    public final String component5() {
        return this.cameraBirthDate;
    }

    public final int component50() {
        return this.lastOptionalImageName;
    }

    @Nullable
    public final MrtrPrepaidValidateIdCardResponse component51() {
        return this.mrtrPrepaidValidateIdCardResponse;
    }

    @Nullable
    public final XSIMConsentResponse component52() {
        return this.xSIMConsentResponse;
    }

    @Nullable
    public final XSIMConsentResponse component53() {
        return this.xSIMConsentResponsePreview;
    }

    @NotNull
    public final XSIMConsentRequest component54() {
        return this.xSIMConsentRequest;
    }

    @NotNull
    public final UpPassFormType component55() {
        return this.currentFormType;
    }

    @Nullable
    public final UpPassFormResult component56() {
        return this.upPassFormResult;
    }

    @Nullable
    public final UpPassFormResult component57() {
        return this.upPassFormCompareResult;
    }

    @Nullable
    public final FaceCompareResponseSubmit component58() {
        return this.faceCompareResponseSubmit;
    }

    @Nullable
    public final String component6() {
        return this.displaySubscriberNumber;
    }

    @Nullable
    public final IdCardInformationCollection component7() {
        return this.cardInformation;
    }

    @Nullable
    public final IdCardInformationCollection component8() {
        return this.cardInformationForAddress;
    }

    @Nullable
    public final CardCollection component9() {
        return this.card;
    }

    @NotNull
    public final MrtrPrepaid copy(@Nullable PrepaidConfig prepaidConfig, @Nullable NationWideCollection nationWideCollection, @Nullable PrepaidMixpanelData prepaidMixpanelData, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, @Nullable CardCollection cardCollection, @Nullable CardInformationCollection cardInformationCollection, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable PaymentReceiptData paymentReceiptData, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable AddressMailingData addressMailingData, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, int i, @NotNull List<String> attachmentNames, @Nullable String str9, boolean z, @Nullable String str10, @Nullable String str11, @Nullable ActivateResponse activateResponse, @Nullable SaveFamilySimResponse saveFamilySimResponse, @Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse, int i2, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable GetAuthorizationByRtrResponse getAuthorizationByRtrResponse, boolean z2, boolean z3, boolean z4, @Nullable MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse, @Nullable MrtrPermissionActivationResponse mrtrPermissionActivationResponse, @Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, @Nullable MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse, int i3, @Nullable String str12, @Nullable MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, @Nullable ErrorCollection errorCollection3, @Nullable ErrorCollection errorCollection4, @Nullable ErrorCollection errorCollection5, boolean z5, @Nullable String str13, @Nullable String str14, int i4, @Nullable MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse, @Nullable XSIMConsentResponse xSIMConsentResponse, @Nullable XSIMConsentResponse xSIMConsentResponse2, @NotNull XSIMConsentRequest xSIMConsentRequest, @NotNull UpPassFormType currentFormType, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @Nullable FaceCompareResponseSubmit faceCompareResponseSubmit) {
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(xSIMConsentRequest, "xSIMConsentRequest");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        return new MrtrPrepaid(prepaidConfig, nationWideCollection, prepaidMixpanelData, str, str2, str3, idCardInformationCollection, idCardInformationCollection2, cardCollection, cardInformationCollection, str4, str5, str6, str7, str8, paymentReceiptData, addressPaymentReceipt, addressMailingData, consentNonTelcoResponse, i, attachmentNames, str9, z, str10, str11, activateResponse, saveFamilySimResponse, simTermSukCheckSimStockResponse, i2, cutSimStockResponse, getAuthorizationByRtrResponse, z2, z3, z4, mrtrPrepaidValidateBarcodeResponse, mrtrPermissionActivationResponse, mrtrPrepaidRegisterRequest, mrtrPrepaidRegisterResponse, i3, str12, mrtrPrepaidAssignPoolingResponse, errorCollection, errorCollection2, errorCollection3, errorCollection4, errorCollection5, z5, str13, str14, i4, mrtrPrepaidValidateIdCardResponse, xSIMConsentResponse, xSIMConsentResponse2, xSIMConsentRequest, currentFormType, upPassFormResult, upPassFormResult2, faceCompareResponseSubmit);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPrepaid) {
            MrtrPrepaid mrtrPrepaid = (MrtrPrepaid) obj;
            return Intrinsics.areEqual(this.prepaidConfig, mrtrPrepaid.prepaidConfig) && Intrinsics.areEqual(this.nationWideCollection, mrtrPrepaid.nationWideCollection) && Intrinsics.areEqual(this.prepaidMixpanelData, mrtrPrepaid.prepaidMixpanelData) && Intrinsics.areEqual(this.ocrIdCard, mrtrPrepaid.ocrIdCard) && Intrinsics.areEqual(this.cameraBirthDate, mrtrPrepaid.cameraBirthDate) && Intrinsics.areEqual(this.displaySubscriberNumber, mrtrPrepaid.displaySubscriberNumber) && Intrinsics.areEqual(this.cardInformation, mrtrPrepaid.cardInformation) && Intrinsics.areEqual(this.cardInformationForAddress, mrtrPrepaid.cardInformationForAddress) && Intrinsics.areEqual(this.card, mrtrPrepaid.card) && Intrinsics.areEqual(this.postcodeSequence, mrtrPrepaid.postcodeSequence) && Intrinsics.areEqual(this.postcode, mrtrPrepaid.postcode) && Intrinsics.areEqual(this.postcodeSequenceString, mrtrPrepaid.postcodeSequenceString) && Intrinsics.areEqual(this.cardType, mrtrPrepaid.cardType) && Intrinsics.areEqual(this.imageName, mrtrPrepaid.imageName) && Intrinsics.areEqual(this.idDocType, mrtrPrepaid.idDocType) && Intrinsics.areEqual(this.paymentReceiptData, mrtrPrepaid.paymentReceiptData) && Intrinsics.areEqual(this.addressPaymentReceipt, mrtrPrepaid.addressPaymentReceipt) && Intrinsics.areEqual(this.addressMailingData, mrtrPrepaid.addressMailingData) && Intrinsics.areEqual(this.consentNonTelcoResponse, mrtrPrepaid.consentNonTelcoResponse) && this.kycAttemp == mrtrPrepaid.kycAttemp && Intrinsics.areEqual(this.attachmentNames, mrtrPrepaid.attachmentNames) && Intrinsics.areEqual(this.registerType, mrtrPrepaid.registerType) && this.isKYC == mrtrPrepaid.isKYC && Intrinsics.areEqual(this.acceptNonTelco, mrtrPrepaid.acceptNonTelco) && Intrinsics.areEqual(this.ConsentVersionLabel, mrtrPrepaid.ConsentVersionLabel) && Intrinsics.areEqual(this.activationResponse, mrtrPrepaid.activationResponse) && Intrinsics.areEqual(this.saveFamilySimResponse, mrtrPrepaid.saveFamilySimResponse) && Intrinsics.areEqual(this.checkSimStockResponse, mrtrPrepaid.checkSimStockResponse) && this.totalAmount == mrtrPrepaid.totalAmount && Intrinsics.areEqual(this.cutSimStockResponse, mrtrPrepaid.cutSimStockResponse) && Intrinsics.areEqual(this.getAuthorizationByRtrResponse, mrtrPrepaid.getAuthorizationByRtrResponse) && this.requireFaceRecognition == mrtrPrepaid.requireFaceRecognition && this.isCheckSimStock == mrtrPrepaid.isCheckSimStock && this.isOverruleXSim == mrtrPrepaid.isOverruleXSim && Intrinsics.areEqual(this.mrtrPrepaidValidateBarcodeResponse, mrtrPrepaid.mrtrPrepaidValidateBarcodeResponse) && Intrinsics.areEqual(this.mrtrPermissionActivationResponse, mrtrPrepaid.mrtrPermissionActivationResponse) && Intrinsics.areEqual(this.registerRequest, mrtrPrepaid.registerRequest) && Intrinsics.areEqual(this.registerResponse, mrtrPrepaid.registerResponse) && this.successType == mrtrPrepaid.successType && Intrinsics.areEqual(this.nontelcoConsentType, mrtrPrepaid.nontelcoConsentType) && Intrinsics.areEqual(this.mrtrPrepaidAssignPoolingResponse, mrtrPrepaid.mrtrPrepaidAssignPoolingResponse) && Intrinsics.areEqual(this.checkSimStockError, mrtrPrepaid.checkSimStockError) && Intrinsics.areEqual(this.cutSimStockError, mrtrPrepaid.cutSimStockError) && Intrinsics.areEqual(this.activationError, mrtrPrepaid.activationError) && Intrinsics.areEqual(this.assignPoolingError, mrtrPrepaid.assignPoolingError) && Intrinsics.areEqual(this.saveFamilySimError, mrtrPrepaid.saveFamilySimError) && this.isReadCardInAddress == mrtrPrepaid.isReadCardInAddress && Intrinsics.areEqual(this.familySimPostpaidNumber, mrtrPrepaid.familySimPostpaidNumber) && Intrinsics.areEqual(this.featureCode, mrtrPrepaid.featureCode) && this.lastOptionalImageName == mrtrPrepaid.lastOptionalImageName && Intrinsics.areEqual(this.mrtrPrepaidValidateIdCardResponse, mrtrPrepaid.mrtrPrepaidValidateIdCardResponse) && Intrinsics.areEqual(this.xSIMConsentResponse, mrtrPrepaid.xSIMConsentResponse) && Intrinsics.areEqual(this.xSIMConsentResponsePreview, mrtrPrepaid.xSIMConsentResponsePreview) && Intrinsics.areEqual(this.xSIMConsentRequest, mrtrPrepaid.xSIMConsentRequest) && Intrinsics.areEqual(this.currentFormType, mrtrPrepaid.currentFormType) && Intrinsics.areEqual(this.upPassFormResult, mrtrPrepaid.upPassFormResult) && Intrinsics.areEqual(this.upPassFormCompareResult, mrtrPrepaid.upPassFormCompareResult) && Intrinsics.areEqual(this.faceCompareResponseSubmit, mrtrPrepaid.faceCompareResponseSubmit);
        }
        return false;
    }

    @Nullable
    public final String getAcceptNonTelco() {
        return this.acceptNonTelco;
    }

    @Nullable
    public final ErrorCollection getActivationError() {
        return this.activationError;
    }

    @Nullable
    public final ActivateResponse getActivationResponse() {
        return this.activationResponse;
    }

    @Nullable
    public final AddressMailingData getAddressMailingData() {
        return this.addressMailingData;
    }

    @Nullable
    public final AddressPaymentReceipt getAddressPaymentReceipt() {
        return this.addressPaymentReceipt;
    }

    @Nullable
    public final ErrorCollection getAssignPoolingError() {
        return this.assignPoolingError;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getCameraBirthDate() {
        return this.cameraBirthDate;
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
    public final IdCardInformationCollection getCardInformationForAddress() {
        return this.cardInformationForAddress;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final ErrorCollection getCheckSimStockError() {
        return this.checkSimStockError;
    }

    @Nullable
    public final SimTermSukCheckSimStockResponse getCheckSimStockResponse() {
        return this.checkSimStockResponse;
    }

    @Nullable
    public final ConsentNonTelcoResponse getConsentNonTelcoResponse() {
        return this.consentNonTelcoResponse;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.ConsentVersionLabel;
    }

    @NotNull
    public final UpPassFormType getCurrentFormType() {
        return this.currentFormType;
    }

    @Nullable
    public final ErrorCollection getCutSimStockError() {
        return this.cutSimStockError;
    }

    @Nullable
    public final CutSimStockResponse getCutSimStockResponse() {
        return this.cutSimStockResponse;
    }

    @Nullable
    public final String getDisplaySubscriberNumber() {
        return this.displaySubscriberNumber;
    }

    @Nullable
    public final FaceCompareResponseSubmit getFaceCompareResponseSubmit() {
        return this.faceCompareResponseSubmit;
    }

    @Nullable
    public final String getFamilySimPostpaidNumber() {
        return this.familySimPostpaidNumber;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final GetAuthorizationByRtrResponse getGetAuthorizationByRtrResponse() {
        return this.getAuthorizationByRtrResponse;
    }

    @Nullable
    public final String getIdDocType() {
        return this.idDocType;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }

    public final int getKycAttemp() {
        return this.kycAttemp;
    }

    public final int getLastOptionalImageName() {
        return this.lastOptionalImageName;
    }

    @Nullable
    public final MrtrPermissionActivationResponse getMrtrPermissionActivationResponse() {
        return this.mrtrPermissionActivationResponse;
    }

    @Nullable
    public final MrtrPrepaidAssignPoolingResponse getMrtrPrepaidAssignPoolingResponse() {
        return this.mrtrPrepaidAssignPoolingResponse;
    }

    @Nullable
    public final MrtrPrepaidValidateBarcodeResponse getMrtrPrepaidValidateBarcodeResponse() {
        return this.mrtrPrepaidValidateBarcodeResponse;
    }

    @Nullable
    public final MrtrPrepaidValidateIdCardResponse getMrtrPrepaidValidateIdCardResponse() {
        return this.mrtrPrepaidValidateIdCardResponse;
    }

    @Nullable
    public final NationWideCollection getNationWideCollection() {
        return this.nationWideCollection;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String getOcrIdCard() {
        return this.ocrIdCard;
    }

    @Nullable
    public final PaymentReceiptData getPaymentReceiptData() {
        return this.paymentReceiptData;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final CardInformationCollection getPostcodeSequence() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String getPostcodeSequenceString() {
        return this.postcodeSequenceString;
    }

    @Nullable
    public final PrepaidConfig getPrepaidConfig() {
        return this.prepaidConfig;
    }

    @Nullable
    public final PrepaidMixpanelData getPrepaidMixpanelData() {
        return this.prepaidMixpanelData;
    }

    @Nullable
    public final MrtrPrepaidRegisterRequest getRegisterRequest() {
        return this.registerRequest;
    }

    @Nullable
    public final MrtrPrepaidRegisterResponse getRegisterResponse() {
        return this.registerResponse;
    }

    @Nullable
    public final String getRegisterType() {
        return this.registerType;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final ErrorCollection getSaveFamilySimError() {
        return this.saveFamilySimError;
    }

    @Nullable
    public final SaveFamilySimResponse getSaveFamilySimResponse() {
        return this.saveFamilySimResponse;
    }

    public final int getSuccessType() {
        return this.successType;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormCompareResult() {
        return this.upPassFormCompareResult;
    }

    @Nullable
    public final UpPassFormResult getUpPassFormResult() {
        return this.upPassFormResult;
    }

    @NotNull
    public final XSIMConsentRequest getXSIMConsentRequest() {
        return this.xSIMConsentRequest;
    }

    @Nullable
    public final XSIMConsentResponse getXSIMConsentResponse() {
        return this.xSIMConsentResponse;
    }

    @Nullable
    public final XSIMConsentResponse getXSIMConsentResponsePreview() {
        return this.xSIMConsentResponsePreview;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        PrepaidConfig prepaidConfig = this.prepaidConfig;
        int hashCode = (prepaidConfig == null ? 0 : prepaidConfig.hashCode()) * 31;
        NationWideCollection nationWideCollection = this.nationWideCollection;
        int hashCode2 = (hashCode + (nationWideCollection == null ? 0 : nationWideCollection.hashCode())) * 31;
        PrepaidMixpanelData prepaidMixpanelData = this.prepaidMixpanelData;
        int hashCode3 = (hashCode2 + (prepaidMixpanelData == null ? 0 : prepaidMixpanelData.hashCode())) * 31;
        String str = this.ocrIdCard;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cameraBirthDate;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displaySubscriberNumber;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.cardInformation;
        int hashCode7 = (hashCode6 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection2 = this.cardInformationForAddress;
        int hashCode8 = (hashCode7 + (idCardInformationCollection2 == null ? 0 : idCardInformationCollection2.hashCode())) * 31;
        CardCollection cardCollection = this.card;
        int hashCode9 = (hashCode8 + (cardCollection == null ? 0 : cardCollection.hashCode())) * 31;
        CardInformationCollection cardInformationCollection = this.postcodeSequence;
        int hashCode10 = (hashCode9 + (cardInformationCollection == null ? 0 : cardInformationCollection.hashCode())) * 31;
        String str4 = this.postcode;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postcodeSequenceString;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardType;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imageName;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.idDocType;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        PaymentReceiptData paymentReceiptData = this.paymentReceiptData;
        int hashCode16 = (hashCode15 + (paymentReceiptData == null ? 0 : paymentReceiptData.hashCode())) * 31;
        AddressPaymentReceipt addressPaymentReceipt = this.addressPaymentReceipt;
        int hashCode17 = (hashCode16 + (addressPaymentReceipt == null ? 0 : addressPaymentReceipt.hashCode())) * 31;
        AddressMailingData addressMailingData = this.addressMailingData;
        int hashCode18 = (hashCode17 + (addressMailingData == null ? 0 : addressMailingData.hashCode())) * 31;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.consentNonTelcoResponse;
        int hashCode19 = (((((hashCode18 + (consentNonTelcoResponse == null ? 0 : consentNonTelcoResponse.hashCode())) * 31) + this.kycAttemp) * 31) + this.attachmentNames.hashCode()) * 31;
        String str9 = this.registerType;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z = this.isKYC;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode20 + i) * 31;
        String str10 = this.acceptNonTelco;
        int hashCode21 = (i2 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ConsentVersionLabel;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ActivateResponse activateResponse = this.activationResponse;
        int hashCode23 = (hashCode22 + (activateResponse == null ? 0 : activateResponse.hashCode())) * 31;
        SaveFamilySimResponse saveFamilySimResponse = this.saveFamilySimResponse;
        int hashCode24 = (hashCode23 + (saveFamilySimResponse == null ? 0 : saveFamilySimResponse.hashCode())) * 31;
        SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse = this.checkSimStockResponse;
        int hashCode25 = (((hashCode24 + (simTermSukCheckSimStockResponse == null ? 0 : simTermSukCheckSimStockResponse.hashCode())) * 31) + this.totalAmount) * 31;
        CutSimStockResponse cutSimStockResponse = this.cutSimStockResponse;
        int hashCode26 = (hashCode25 + (cutSimStockResponse == null ? 0 : cutSimStockResponse.hashCode())) * 31;
        GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = this.getAuthorizationByRtrResponse;
        int hashCode27 = (hashCode26 + (getAuthorizationByRtrResponse == null ? 0 : getAuthorizationByRtrResponse.hashCode())) * 31;
        boolean z2 = this.requireFaceRecognition;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode27 + i3) * 31;
        boolean z3 = this.isCheckSimStock;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isOverruleXSim;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = this.mrtrPrepaidValidateBarcodeResponse;
        int hashCode28 = (i8 + (mrtrPrepaidValidateBarcodeResponse == null ? 0 : mrtrPrepaidValidateBarcodeResponse.hashCode())) * 31;
        MrtrPermissionActivationResponse mrtrPermissionActivationResponse = this.mrtrPermissionActivationResponse;
        int hashCode29 = (hashCode28 + (mrtrPermissionActivationResponse == null ? 0 : mrtrPermissionActivationResponse.hashCode())) * 31;
        MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.registerRequest;
        int hashCode30 = (hashCode29 + (mrtrPrepaidRegisterRequest == null ? 0 : mrtrPrepaidRegisterRequest.hashCode())) * 31;
        MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse = this.registerResponse;
        int hashCode31 = (((hashCode30 + (mrtrPrepaidRegisterResponse == null ? 0 : mrtrPrepaidRegisterResponse.hashCode())) * 31) + this.successType) * 31;
        String str12 = this.nontelcoConsentType;
        int hashCode32 = (hashCode31 + (str12 == null ? 0 : str12.hashCode())) * 31;
        MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse = this.mrtrPrepaidAssignPoolingResponse;
        int hashCode33 = (hashCode32 + (mrtrPrepaidAssignPoolingResponse == null ? 0 : mrtrPrepaidAssignPoolingResponse.hashCode())) * 31;
        ErrorCollection errorCollection = this.checkSimStockError;
        int hashCode34 = (hashCode33 + (errorCollection == null ? 0 : errorCollection.hashCode())) * 31;
        ErrorCollection errorCollection2 = this.cutSimStockError;
        int hashCode35 = (hashCode34 + (errorCollection2 == null ? 0 : errorCollection2.hashCode())) * 31;
        ErrorCollection errorCollection3 = this.activationError;
        int hashCode36 = (hashCode35 + (errorCollection3 == null ? 0 : errorCollection3.hashCode())) * 31;
        ErrorCollection errorCollection4 = this.assignPoolingError;
        int hashCode37 = (hashCode36 + (errorCollection4 == null ? 0 : errorCollection4.hashCode())) * 31;
        ErrorCollection errorCollection5 = this.saveFamilySimError;
        int hashCode38 = (hashCode37 + (errorCollection5 == null ? 0 : errorCollection5.hashCode())) * 31;
        boolean z5 = this.isReadCardInAddress;
        int i9 = (hashCode38 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        String str13 = this.familySimPostpaidNumber;
        int hashCode39 = (i9 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.featureCode;
        int hashCode40 = (((hashCode39 + (str14 == null ? 0 : str14.hashCode())) * 31) + this.lastOptionalImageName) * 31;
        MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse = this.mrtrPrepaidValidateIdCardResponse;
        int hashCode41 = (hashCode40 + (mrtrPrepaidValidateIdCardResponse == null ? 0 : mrtrPrepaidValidateIdCardResponse.hashCode())) * 31;
        XSIMConsentResponse xSIMConsentResponse = this.xSIMConsentResponse;
        int hashCode42 = (hashCode41 + (xSIMConsentResponse == null ? 0 : xSIMConsentResponse.hashCode())) * 31;
        XSIMConsentResponse xSIMConsentResponse2 = this.xSIMConsentResponsePreview;
        int hashCode43 = (((((hashCode42 + (xSIMConsentResponse2 == null ? 0 : xSIMConsentResponse2.hashCode())) * 31) + this.xSIMConsentRequest.hashCode()) * 31) + this.currentFormType.hashCode()) * 31;
        UpPassFormResult upPassFormResult = this.upPassFormResult;
        int hashCode44 = (hashCode43 + (upPassFormResult == null ? 0 : upPassFormResult.hashCode())) * 31;
        UpPassFormResult upPassFormResult2 = this.upPassFormCompareResult;
        int hashCode45 = (hashCode44 + (upPassFormResult2 == null ? 0 : upPassFormResult2.hashCode())) * 31;
        FaceCompareResponseSubmit faceCompareResponseSubmit = this.faceCompareResponseSubmit;
        return hashCode45 + (faceCompareResponseSubmit != null ? faceCompareResponseSubmit.hashCode() : 0);
    }

    public final boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final boolean isKYC() {
        return this.isKYC;
    }

    public final boolean isOverruleXSim() {
        return this.isOverruleXSim;
    }

    public final boolean isReadCardInAddress() {
        return this.isReadCardInAddress;
    }

    public final void setAcceptNonTelco(@Nullable String str) {
        this.acceptNonTelco = str;
    }

    public final void setActivationError(@Nullable ErrorCollection errorCollection) {
        this.activationError = errorCollection;
    }

    public final void setActivationResponse(@Nullable ActivateResponse activateResponse) {
        this.activationResponse = activateResponse;
    }

    public final void setAddressMailingData(@Nullable AddressMailingData addressMailingData) {
        this.addressMailingData = addressMailingData;
    }

    public final void setAddressPaymentReceipt(@Nullable AddressPaymentReceipt addressPaymentReceipt) {
        this.addressPaymentReceipt = addressPaymentReceipt;
    }

    public final void setAssignPoolingError(@Nullable ErrorCollection errorCollection) {
        this.assignPoolingError = errorCollection;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setCameraBirthDate(@Nullable String str) {
        this.cameraBirthDate = str;
    }

    public final void setCard(@Nullable CardCollection cardCollection) {
        this.card = cardCollection;
    }

    public final void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformation = idCardInformationCollection;
    }

    public final void setCardInformationForAddress(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformationForAddress = idCardInformationCollection;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setCheckSimStock(boolean z) {
        this.isCheckSimStock = z;
    }

    public final void setCheckSimStockError(@Nullable ErrorCollection errorCollection) {
        this.checkSimStockError = errorCollection;
    }

    public final void setCheckSimStockResponse(@Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse) {
        this.checkSimStockResponse = simTermSukCheckSimStockResponse;
    }

    public final void setConsentNonTelcoResponse(@Nullable ConsentNonTelcoResponse consentNonTelcoResponse) {
        this.consentNonTelcoResponse = consentNonTelcoResponse;
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.ConsentVersionLabel = str;
    }

    public final void setCurrentFormType(@NotNull UpPassFormType upPassFormType) {
        Intrinsics.checkNotNullParameter(upPassFormType, "<set-?>");
        this.currentFormType = upPassFormType;
    }

    public final void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        this.cutSimStockError = errorCollection;
    }

    public final void setCutSimStockResponse(@Nullable CutSimStockResponse cutSimStockResponse) {
        this.cutSimStockResponse = cutSimStockResponse;
    }

    public final void setDisplaySubscriberNumber(@Nullable String str) {
        this.displaySubscriberNumber = str;
    }

    public final void setFaceCompareResponseSubmit(@Nullable FaceCompareResponseSubmit faceCompareResponseSubmit) {
        this.faceCompareResponseSubmit = faceCompareResponseSubmit;
    }

    public final void setFamilySimPostpaidNumber(@Nullable String str) {
        this.familySimPostpaidNumber = str;
    }

    public final void setFeatureCode(@Nullable String str) {
        this.featureCode = str;
    }

    public final void setGetAuthorizationByRtrResponse(@Nullable GetAuthorizationByRtrResponse getAuthorizationByRtrResponse) {
        this.getAuthorizationByRtrResponse = getAuthorizationByRtrResponse;
    }

    public final void setIdDocType(@Nullable String str) {
        this.idDocType = str;
    }

    public final void setImageName(@Nullable String str) {
        this.imageName = str;
    }

    public final void setKYC(boolean z) {
        this.isKYC = z;
    }

    public final void setKycAttemp(int i) {
        this.kycAttemp = i;
    }

    public final void setLastOptionalImageName(int i) {
        this.lastOptionalImageName = i;
    }

    public final void setMrtrPermissionActivationResponse(@Nullable MrtrPermissionActivationResponse mrtrPermissionActivationResponse) {
        this.mrtrPermissionActivationResponse = mrtrPermissionActivationResponse;
    }

    public final void setMrtrPrepaidAssignPoolingResponse(@Nullable MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse) {
        this.mrtrPrepaidAssignPoolingResponse = mrtrPrepaidAssignPoolingResponse;
    }

    public final void setMrtrPrepaidValidateBarcodeResponse(@Nullable MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse) {
        this.mrtrPrepaidValidateBarcodeResponse = mrtrPrepaidValidateBarcodeResponse;
    }

    public final void setMrtrPrepaidValidateIdCardResponse(@Nullable MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse) {
        this.mrtrPrepaidValidateIdCardResponse = mrtrPrepaidValidateIdCardResponse;
    }

    public final void setNationWideCollection(@Nullable NationWideCollection nationWideCollection) {
        this.nationWideCollection = nationWideCollection;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.nontelcoConsentType = str;
    }

    public final void setOcrIdCard(@Nullable String str) {
        this.ocrIdCard = str;
    }

    public final void setOverruleXSim(boolean z) {
        this.isOverruleXSim = z;
    }

    public final void setPaymentReceiptData(@Nullable PaymentReceiptData paymentReceiptData) {
        this.paymentReceiptData = paymentReceiptData;
    }

    public final void setPostcode(@Nullable String str) {
        this.postcode = str;
    }

    public final void setPostcodeSequence(@Nullable CardInformationCollection cardInformationCollection) {
        this.postcodeSequence = cardInformationCollection;
    }

    public final void setPostcodeSequenceString(@Nullable String str) {
        this.postcodeSequenceString = str;
    }

    public final void setPrepaidConfig(@Nullable PrepaidConfig prepaidConfig) {
        this.prepaidConfig = prepaidConfig;
    }

    public final void setPrepaidMixpanelData(@Nullable PrepaidMixpanelData prepaidMixpanelData) {
        this.prepaidMixpanelData = prepaidMixpanelData;
    }

    public final void setReadCardInAddress(boolean z) {
        this.isReadCardInAddress = z;
    }

    public final void setRegisterRequest(@Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest) {
        this.registerRequest = mrtrPrepaidRegisterRequest;
    }

    public final void setRegisterResponse(@Nullable MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse) {
        this.registerResponse = mrtrPrepaidRegisterResponse;
    }

    public final void setRegisterType(@Nullable String str) {
        this.registerType = str;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    public final void setSaveFamilySimError(@Nullable ErrorCollection errorCollection) {
        this.saveFamilySimError = errorCollection;
    }

    public final void setSaveFamilySimResponse(@Nullable SaveFamilySimResponse saveFamilySimResponse) {
        this.saveFamilySimResponse = saveFamilySimResponse;
    }

    public final void setSuccessType(int i) {
        this.successType = i;
    }

    public final void setTotalAmount(int i) {
        this.totalAmount = i;
    }

    public final void setUpPassFormCompareResult(@Nullable UpPassFormResult upPassFormResult) {
        this.upPassFormCompareResult = upPassFormResult;
    }

    public final void setUpPassFormResult(@Nullable UpPassFormResult upPassFormResult) {
        this.upPassFormResult = upPassFormResult;
    }

    public final void setXSIMConsentRequest(@NotNull XSIMConsentRequest xSIMConsentRequest) {
        Intrinsics.checkNotNullParameter(xSIMConsentRequest, "<set-?>");
        this.xSIMConsentRequest = xSIMConsentRequest;
    }

    public final void setXSIMConsentResponse(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        this.xSIMConsentResponse = xSIMConsentResponse;
    }

    public final void setXSIMConsentResponsePreview(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        this.xSIMConsentResponsePreview = xSIMConsentResponse;
    }

    @NotNull
    public String toString() {
        PrepaidConfig prepaidConfig = this.prepaidConfig;
        NationWideCollection nationWideCollection = this.nationWideCollection;
        PrepaidMixpanelData prepaidMixpanelData = this.prepaidMixpanelData;
        String str = this.ocrIdCard;
        String str2 = this.cameraBirthDate;
        String str3 = this.displaySubscriberNumber;
        IdCardInformationCollection idCardInformationCollection = this.cardInformation;
        IdCardInformationCollection idCardInformationCollection2 = this.cardInformationForAddress;
        CardCollection cardCollection = this.card;
        CardInformationCollection cardInformationCollection = this.postcodeSequence;
        String str4 = this.postcode;
        String str5 = this.postcodeSequenceString;
        String str6 = this.cardType;
        String str7 = this.imageName;
        String str8 = this.idDocType;
        PaymentReceiptData paymentReceiptData = this.paymentReceiptData;
        AddressPaymentReceipt addressPaymentReceipt = this.addressPaymentReceipt;
        AddressMailingData addressMailingData = this.addressMailingData;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.consentNonTelcoResponse;
        int i = this.kycAttemp;
        List<String> list = this.attachmentNames;
        String str9 = this.registerType;
        boolean z = this.isKYC;
        String str10 = this.acceptNonTelco;
        String str11 = this.ConsentVersionLabel;
        ActivateResponse activateResponse = this.activationResponse;
        SaveFamilySimResponse saveFamilySimResponse = this.saveFamilySimResponse;
        SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse = this.checkSimStockResponse;
        int i2 = this.totalAmount;
        CutSimStockResponse cutSimStockResponse = this.cutSimStockResponse;
        GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = this.getAuthorizationByRtrResponse;
        boolean z2 = this.requireFaceRecognition;
        boolean z3 = this.isCheckSimStock;
        boolean z4 = this.isOverruleXSim;
        MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = this.mrtrPrepaidValidateBarcodeResponse;
        MrtrPermissionActivationResponse mrtrPermissionActivationResponse = this.mrtrPermissionActivationResponse;
        MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.registerRequest;
        MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse = this.registerResponse;
        int i3 = this.successType;
        String str12 = this.nontelcoConsentType;
        MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse = this.mrtrPrepaidAssignPoolingResponse;
        ErrorCollection errorCollection = this.checkSimStockError;
        ErrorCollection errorCollection2 = this.cutSimStockError;
        ErrorCollection errorCollection3 = this.activationError;
        ErrorCollection errorCollection4 = this.assignPoolingError;
        ErrorCollection errorCollection5 = this.saveFamilySimError;
        boolean z5 = this.isReadCardInAddress;
        String str13 = this.familySimPostpaidNumber;
        String str14 = this.featureCode;
        int i4 = this.lastOptionalImageName;
        MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse = this.mrtrPrepaidValidateIdCardResponse;
        XSIMConsentResponse xSIMConsentResponse = this.xSIMConsentResponse;
        XSIMConsentResponse xSIMConsentResponse2 = this.xSIMConsentResponsePreview;
        XSIMConsentRequest xSIMConsentRequest = this.xSIMConsentRequest;
        UpPassFormType upPassFormType = this.currentFormType;
        UpPassFormResult upPassFormResult = this.upPassFormResult;
        UpPassFormResult upPassFormResult2 = this.upPassFormCompareResult;
        FaceCompareResponseSubmit faceCompareResponseSubmit = this.faceCompareResponseSubmit;
        return "MrtrPrepaid(prepaidConfig=" + prepaidConfig + ", nationWideCollection=" + nationWideCollection + ", prepaidMixpanelData=" + prepaidMixpanelData + ", ocrIdCard=" + str + ", cameraBirthDate=" + str2 + ", displaySubscriberNumber=" + str3 + ", cardInformation=" + idCardInformationCollection + ", cardInformationForAddress=" + idCardInformationCollection2 + ", card=" + cardCollection + ", postcodeSequence=" + cardInformationCollection + ", postcode=" + str4 + ", postcodeSequenceString=" + str5 + ", cardType=" + str6 + ", imageName=" + str7 + ", idDocType=" + str8 + ", paymentReceiptData=" + paymentReceiptData + ", addressPaymentReceipt=" + addressPaymentReceipt + ", addressMailingData=" + addressMailingData + ", consentNonTelcoResponse=" + consentNonTelcoResponse + ", kycAttemp=" + i + ", attachmentNames=" + list + ", registerType=" + str9 + ", isKYC=" + z + ", acceptNonTelco=" + str10 + ", ConsentVersionLabel=" + str11 + ", activationResponse=" + activateResponse + ", saveFamilySimResponse=" + saveFamilySimResponse + ", checkSimStockResponse=" + simTermSukCheckSimStockResponse + ", totalAmount=" + i2 + ", cutSimStockResponse=" + cutSimStockResponse + ", getAuthorizationByRtrResponse=" + getAuthorizationByRtrResponse + ", requireFaceRecognition=" + z2 + ", isCheckSimStock=" + z3 + ", isOverruleXSim=" + z4 + ", mrtrPrepaidValidateBarcodeResponse=" + mrtrPrepaidValidateBarcodeResponse + ", mrtrPermissionActivationResponse=" + mrtrPermissionActivationResponse + ", registerRequest=" + mrtrPrepaidRegisterRequest + ", registerResponse=" + mrtrPrepaidRegisterResponse + ", successType=" + i3 + ", nontelcoConsentType=" + str12 + ", mrtrPrepaidAssignPoolingResponse=" + mrtrPrepaidAssignPoolingResponse + ", checkSimStockError=" + errorCollection + ", cutSimStockError=" + errorCollection2 + ", activationError=" + errorCollection3 + ", assignPoolingError=" + errorCollection4 + ", saveFamilySimError=" + errorCollection5 + ", isReadCardInAddress=" + z5 + ", familySimPostpaidNumber=" + str13 + ", featureCode=" + str14 + ", lastOptionalImageName=" + i4 + ", mrtrPrepaidValidateIdCardResponse=" + mrtrPrepaidValidateIdCardResponse + ", xSIMConsentResponse=" + xSIMConsentResponse + ", xSIMConsentResponsePreview=" + xSIMConsentResponse2 + ", xSIMConsentRequest=" + xSIMConsentRequest + ", currentFormType=" + upPassFormType + ", upPassFormResult=" + upPassFormResult + ", upPassFormCompareResult=" + upPassFormResult2 + ", faceCompareResponseSubmit=" + faceCompareResponseSubmit + ")";
    }

    public MrtrPrepaid(@Nullable PrepaidConfig prepaidConfig, @Nullable NationWideCollection nationWideCollection, @Nullable PrepaidMixpanelData prepaidMixpanelData, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, @Nullable CardCollection cardCollection, @Nullable CardInformationCollection cardInformationCollection, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable PaymentReceiptData paymentReceiptData, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable AddressMailingData addressMailingData, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, int i, @NotNull List<String> attachmentNames, @Nullable String str9, boolean z, @Nullable String str10, @Nullable String str11, @Nullable ActivateResponse activateResponse, @Nullable SaveFamilySimResponse saveFamilySimResponse, @Nullable SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse, int i2, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable GetAuthorizationByRtrResponse getAuthorizationByRtrResponse, boolean z2, boolean z3, boolean z4, @Nullable MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse, @Nullable MrtrPermissionActivationResponse mrtrPermissionActivationResponse, @Nullable MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, @Nullable MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse, int i3, @Nullable String str12, @Nullable MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, @Nullable ErrorCollection errorCollection3, @Nullable ErrorCollection errorCollection4, @Nullable ErrorCollection errorCollection5, boolean z5, @Nullable String str13, @Nullable String str14, int i4, @Nullable MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse, @Nullable XSIMConsentResponse xSIMConsentResponse, @Nullable XSIMConsentResponse xSIMConsentResponse2, @NotNull XSIMConsentRequest xSIMConsentRequest, @NotNull UpPassFormType currentFormType, @Nullable UpPassFormResult upPassFormResult, @Nullable UpPassFormResult upPassFormResult2, @Nullable FaceCompareResponseSubmit faceCompareResponseSubmit) {
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(xSIMConsentRequest, "xSIMConsentRequest");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        this.prepaidConfig = prepaidConfig;
        this.nationWideCollection = nationWideCollection;
        this.prepaidMixpanelData = prepaidMixpanelData;
        this.ocrIdCard = str;
        this.cameraBirthDate = str2;
        this.displaySubscriberNumber = str3;
        this.cardInformation = idCardInformationCollection;
        this.cardInformationForAddress = idCardInformationCollection2;
        this.card = cardCollection;
        this.postcodeSequence = cardInformationCollection;
        this.postcode = str4;
        this.postcodeSequenceString = str5;
        this.cardType = str6;
        this.imageName = str7;
        this.idDocType = str8;
        this.paymentReceiptData = paymentReceiptData;
        this.addressPaymentReceipt = addressPaymentReceipt;
        this.addressMailingData = addressMailingData;
        this.consentNonTelcoResponse = consentNonTelcoResponse;
        this.kycAttemp = i;
        this.attachmentNames = attachmentNames;
        this.registerType = str9;
        this.isKYC = z;
        this.acceptNonTelco = str10;
        this.ConsentVersionLabel = str11;
        this.activationResponse = activateResponse;
        this.saveFamilySimResponse = saveFamilySimResponse;
        this.checkSimStockResponse = simTermSukCheckSimStockResponse;
        this.totalAmount = i2;
        this.cutSimStockResponse = cutSimStockResponse;
        this.getAuthorizationByRtrResponse = getAuthorizationByRtrResponse;
        this.requireFaceRecognition = z2;
        this.isCheckSimStock = z3;
        this.isOverruleXSim = z4;
        this.mrtrPrepaidValidateBarcodeResponse = mrtrPrepaidValidateBarcodeResponse;
        this.mrtrPermissionActivationResponse = mrtrPermissionActivationResponse;
        this.registerRequest = mrtrPrepaidRegisterRequest;
        this.registerResponse = mrtrPrepaidRegisterResponse;
        this.successType = i3;
        this.nontelcoConsentType = str12;
        this.mrtrPrepaidAssignPoolingResponse = mrtrPrepaidAssignPoolingResponse;
        this.checkSimStockError = errorCollection;
        this.cutSimStockError = errorCollection2;
        this.activationError = errorCollection3;
        this.assignPoolingError = errorCollection4;
        this.saveFamilySimError = errorCollection5;
        this.isReadCardInAddress = z5;
        this.familySimPostpaidNumber = str13;
        this.featureCode = str14;
        this.lastOptionalImageName = i4;
        this.mrtrPrepaidValidateIdCardResponse = mrtrPrepaidValidateIdCardResponse;
        this.xSIMConsentResponse = xSIMConsentResponse;
        this.xSIMConsentResponsePreview = xSIMConsentResponse2;
        this.xSIMConsentRequest = xSIMConsentRequest;
        this.currentFormType = currentFormType;
        this.upPassFormResult = upPassFormResult;
        this.upPassFormCompareResult = upPassFormResult2;
        this.faceCompareResponseSubmit = faceCompareResponseSubmit;
    }

    public /* synthetic */ MrtrPrepaid(PrepaidConfig prepaidConfig, NationWideCollection nationWideCollection, PrepaidMixpanelData prepaidMixpanelData, String str, String str2, String str3, IdCardInformationCollection idCardInformationCollection, IdCardInformationCollection idCardInformationCollection2, CardCollection cardCollection, CardInformationCollection cardInformationCollection, String str4, String str5, String str6, String str7, String str8, PaymentReceiptData paymentReceiptData, AddressPaymentReceipt addressPaymentReceipt, AddressMailingData addressMailingData, ConsentNonTelcoResponse consentNonTelcoResponse, int i, List list, String str9, boolean z, String str10, String str11, ActivateResponse activateResponse, SaveFamilySimResponse saveFamilySimResponse, SimTermSukCheckSimStockResponse simTermSukCheckSimStockResponse, int i2, CutSimStockResponse cutSimStockResponse, GetAuthorizationByRtrResponse getAuthorizationByRtrResponse, boolean z2, boolean z3, boolean z4, MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse, MrtrPermissionActivationResponse mrtrPermissionActivationResponse, MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse, int i3, String str12, MrtrPrepaidAssignPoolingResponse mrtrPrepaidAssignPoolingResponse, ErrorCollection errorCollection, ErrorCollection errorCollection2, ErrorCollection errorCollection3, ErrorCollection errorCollection4, ErrorCollection errorCollection5, boolean z5, String str13, String str14, int i4, MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse, XSIMConsentResponse xSIMConsentResponse, XSIMConsentResponse xSIMConsentResponse2, XSIMConsentRequest xSIMConsentRequest, UpPassFormType upPassFormType, UpPassFormResult upPassFormResult, UpPassFormResult upPassFormResult2, FaceCompareResponseSubmit faceCompareResponseSubmit, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : prepaidConfig, (i5 & 2) != 0 ? null : nationWideCollection, (i5 & 4) != 0 ? null : prepaidMixpanelData, (i5 & 8) != 0 ? null : str, (i5 & 16) != 0 ? null : str2, (i5 & 32) != 0 ? null : str3, (i5 & 64) != 0 ? null : idCardInformationCollection, (i5 & 128) != 0 ? null : idCardInformationCollection2, (i5 & 256) != 0 ? null : cardCollection, (i5 & 512) != 0 ? null : cardInformationCollection, (i5 & 1024) != 0 ? null : str4, (i5 & 2048) != 0 ? null : str5, (i5 & 4096) != 0 ? null : str6, (i5 & 8192) != 0 ? null : str7, (i5 & 16384) != 0 ? null : str8, (i5 & 32768) != 0 ? null : paymentReceiptData, (i5 & 65536) != 0 ? null : addressPaymentReceipt, (i5 & 131072) != 0 ? null : addressMailingData, (i5 & 262144) != 0 ? null : consentNonTelcoResponse, (i5 & 524288) != 0 ? 0 : i, (i5 & 1048576) != 0 ? new ArrayList() : list, (i5 & 2097152) != 0 ? null : str9, (i5 & 4194304) != 0 ? false : z, (i5 & 8388608) != 0 ? null : str10, (i5 & 16777216) != 0 ? null : str11, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : activateResponse, (i5 & 67108864) != 0 ? null : saveFamilySimResponse, (i5 & 134217728) != 0 ? null : simTermSukCheckSimStockResponse, (i5 & 268435456) != 0 ? 0 : i2, (i5 & PKIFailureInfo.duplicateCertReq) != 0 ? null : cutSimStockResponse, (i5 & 1073741824) != 0 ? null : getAuthorizationByRtrResponse, (i5 & Integer.MIN_VALUE) != 0 ? true : z2, (i6 & 1) != 0 ? true : z3, (i6 & 2) != 0 ? false : z4, (i6 & 4) != 0 ? null : mrtrPrepaidValidateBarcodeResponse, (i6 & 8) != 0 ? null : mrtrPermissionActivationResponse, (i6 & 16) != 0 ? null : mrtrPrepaidRegisterRequest, (i6 & 32) != 0 ? null : mrtrPrepaidRegisterResponse, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? null : str12, (i6 & 256) != 0 ? null : mrtrPrepaidAssignPoolingResponse, (i6 & 512) != 0 ? null : errorCollection, (i6 & 1024) != 0 ? null : errorCollection2, (i6 & 2048) != 0 ? null : errorCollection3, (i6 & 4096) != 0 ? null : errorCollection4, (i6 & 8192) != 0 ? null : errorCollection5, (i6 & 16384) == 0 ? z5 : false, (i6 & 32768) != 0 ? null : str13, (i6 & 65536) != 0 ? null : str14, (i6 & 131072) == 0 ? i4 : 1, (i6 & 262144) != 0 ? null : mrtrPrepaidValidateIdCardResponse, (i6 & 524288) != 0 ? null : xSIMConsentResponse, (i6 & 1048576) != 0 ? null : xSIMConsentResponse2, (i6 & 2097152) != 0 ? new XSIMConsentRequest(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : xSIMConsentRequest, (i6 & 4194304) != 0 ? new UpPassFormType.Ocr(null, null, false, null, 15, null) : upPassFormType, (i6 & 8388608) != 0 ? null : upPassFormResult, (i6 & 16777216) != 0 ? null : upPassFormResult2, (i6 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : faceCompareResponseSubmit);
    }
}