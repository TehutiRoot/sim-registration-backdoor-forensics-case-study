package th.p047co.dtac.android.dtacone.model.mrtr_change_sim;

import android.graphics.Bitmap;
import androidx.autofill.HintConstants;
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
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimConfig;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.esim.AutoTransferEsimResponse;
import th.p047co.dtac.android.dtacone.model.esim.SimCardNumberResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.current_sim.response.MrtrChangeSimGetCurrentSimResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.response.MrtrChangeSimExistingProfileResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.reason.response.MrtrChangeSimReasonResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.reason.response.ReasonsItem;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.submit.request.MrtrChangeSimSubmitRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.request.MrtrChangeSimVerifyRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.response.MrtrChangeSimVerifyResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.AddressPaymentReceipt;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.PaymentReceiptData;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.response.CheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u008c\u0001\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000b\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010<\u001a\u00020\u000b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010E\u001a\u00020\u000b\u0012\b\b\u0002\u0010F\u001a\u00020\u000b\u0012\b\b\u0002\u0010G\u001a\u00020\u000b¢\u0006\u0002\u0010HR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010&\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001c\u0010\"\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010b\"\u0004\bf\u0010dR\u001c\u0010#\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010V\"\u0004\bj\u0010XR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001f\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010/\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010|\"\u0005\b\u0084\u0001\u0010~R \u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R \u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010=\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010|\"\u0005\b\u0096\u0001\u0010~R\u001b\u0010F\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\bF\u0010N\"\u0005\b\u0097\u0001\u0010PR\u001b\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\n\u0010N\"\u0005\b\u0098\u0001\u0010PR\u001b\u0010'\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b'\u0010N\"\u0005\b\u0099\u0001\u0010PR\u001b\u0010%\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b%\u0010N\"\u0005\b\u009a\u0001\u0010PR\u001b\u0010E\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\bE\u0010N\"\u0005\b\u009b\u0001\u0010PR\"\u0010$\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0014\n\u0003\u0010\u009f\u0001\u001a\u0005\b$\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010G\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\bG\u0010N\"\u0005\b \u0001\u0010PR\u001b\u0010<\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b<\u0010N\"\u0005\b¡\u0001\u0010PR\u001b\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u000e\u0010N\"\u0005\b¢\u0001\u0010PR\u001e\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R \u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R \u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010V\"\u0005\b°\u0001\u0010XR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010V\"\u0005\b²\u0001\u0010XR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010V\"\u0005\b´\u0001\u0010XR \u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u001e\u0010D\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010V\"\u0005\bº\u0001\u0010XR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010V\"\u0005\b¼\u0001\u0010XR\u001c\u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010N\"\u0005\b¾\u0001\u0010PR \u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R \u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R \u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R \u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001¨\u0006Ï\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/MrtrChangeSim;", "", "changeSimConfig", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;", "changeSimReason", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;", "selectedReasonsItem", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/ReasonsItem;", "changeSimRequestVerifyReason", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;", "isAttorney", "", "optionalImage", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "isSmartCard", "ownerIdCardNumber", "", "ownerIdCardPhoto", "attorneyIdCardNumber", "attorneyIdCardPhoto", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "kycAttemp", "", "cardType", "ownerPostCode", "attorneyPostCode", "attachmentNames", "", "addressPaymentReceipt", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "paymentReceiptData", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformationAttoney", "cardInformationForAddress", "isReadCardInAddress", "isCheckSimStock", "airportShop", "isAutoTransferEDMS", "requireFaceRecognition", "checkSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "cutSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "checkSimStockError", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "cutSimStockError", "getCurrentSimResponse", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/current_sim/response/MrtrChangeSimGetCurrentSimResponse;", "verifyRequest", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/request/MrtrChangeSimVerifyRequest;", "verifyResponse", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;", "existingProfileResponse", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;", "changeSimSubmitRequest", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/MrtrChangeSimSubmitRequest;", "faceRecResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "isSaveESIMOrder", "inProgressError", "simCardNumberResponse", "Lth/co/dtac/android/dtacone/model/esim/SimCardNumberResponse;", "autoTransferEsimResponse", "Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimResponse;", "mergeBitmaps", "Landroid/graphics/Bitmap;", "pendingEsimCard", "isNotCaptured", "isAllowManualKYC", "isRequireLiveness", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/ReasonsItem;Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;ZLth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/Boolean;ZZZZLth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/current_sim/response/MrtrChangeSimGetCurrentSimResponse;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/request/MrtrChangeSimVerifyRequest;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/MrtrChangeSimSubmitRequest;Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;ZLth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/esim/SimCardNumberResponse;Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimResponse;Landroid/graphics/Bitmap;Ljava/lang/String;ZZZ)V", "getAddressPaymentReceipt", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "setAddressPaymentReceipt", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;)V", "getAirportShop", "()Z", "setAirportShop", "(Z)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getAttorneyIdCardNumber", "()Ljava/lang/String;", "setAttorneyIdCardNumber", "(Ljava/lang/String;)V", "getAttorneyIdCardPhoto", "setAttorneyIdCardPhoto", "getAttorneyPostCode", "setAttorneyPostCode", "getAutoTransferEsimResponse", "()Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimResponse;", "setAutoTransferEsimResponse", "(Lth/co/dtac/android/dtacone/model/esim/AutoTransferEsimResponse;)V", "getCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCardInformationAttoney", "setCardInformationAttoney", "getCardInformationForAddress", "setCardInformationForAddress", "getCardType", "setCardType", "getChangeSimConfig", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;", "setChangeSimConfig", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;)V", "getChangeSimReason", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;", "setChangeSimReason", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;)V", "getChangeSimRequestVerifyReason", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;", "setChangeSimRequestVerifyReason", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimRequestVerifyReason;)V", "getChangeSimSubmitRequest", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/MrtrChangeSimSubmitRequest;", "setChangeSimSubmitRequest", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/MrtrChangeSimSubmitRequest;)V", "getCheckSimStockError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "setCheckSimStockError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "getCheckSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", "setCheckSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;)V", "getCutSimStockError", "setCutSimStockError", "getCutSimStockResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "setCutSimStockResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;)V", "getExistingProfileResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;", "setExistingProfileResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;)V", "getFaceRecResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setFaceRecResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getGetCurrentSimResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/current_sim/response/MrtrChangeSimGetCurrentSimResponse;", "setGetCurrentSimResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/current_sim/response/MrtrChangeSimGetCurrentSimResponse;)V", "getInProgressError", "setInProgressError", "setAllowManualKYC", "setAttorney", "setAutoTransferEDMS", "setCheckSimStock", "setNotCaptured", "()Ljava/lang/Boolean;", "setReadCardInAddress", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setRequireLiveness", "setSaveESIMOrder", "setSmartCard", "getKycAttemp", "()I", "setKycAttemp", "(I)V", "getMergeBitmaps", "()Landroid/graphics/Bitmap;", "setMergeBitmaps", "(Landroid/graphics/Bitmap;)V", "getOptionalImage", "()Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;", "setOptionalImage", "(Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidOptionalImage;)V", "getOwnerIdCardNumber", "setOwnerIdCardNumber", "getOwnerIdCardPhoto", "setOwnerIdCardPhoto", "getOwnerPostCode", "setOwnerPostCode", "getPaymentReceiptData", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "setPaymentReceiptData", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;)V", "getPendingEsimCard", "setPendingEsimCard", "getPhoneNumber", "setPhoneNumber", "getRequireFaceRecognition", "setRequireFaceRecognition", "getSelectedReasonsItem", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/ReasonsItem;", "setSelectedReasonsItem", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/ReasonsItem;)V", "getSimCardNumberResponse", "()Lth/co/dtac/android/dtacone/model/esim/SimCardNumberResponse;", "setSimCardNumberResponse", "(Lth/co/dtac/android/dtacone/model/esim/SimCardNumberResponse;)V", "getVerifyRequest", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/request/MrtrChangeSimVerifyRequest;", "setVerifyRequest", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/request/MrtrChangeSimVerifyRequest;)V", "getVerifyResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;", "setVerifyResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.MrtrChangeSim */
/* loaded from: classes8.dex */
public final class MrtrChangeSim {
    public static final int $stable = 8;
    @Nullable
    private AddressPaymentReceipt addressPaymentReceipt;
    private boolean airportShop;
    @NotNull
    private List<String> attachmentNames;
    @Nullable
    private String attorneyIdCardNumber;
    @Nullable
    private String attorneyIdCardPhoto;
    @Nullable
    private String attorneyPostCode;
    @Nullable
    private AutoTransferEsimResponse autoTransferEsimResponse;
    @Nullable
    private IdCardInformationCollection cardInformation;
    @Nullable
    private IdCardInformationCollection cardInformationAttoney;
    @Nullable
    private IdCardInformationCollection cardInformationForAddress;
    @Nullable
    private String cardType;
    @Nullable
    private ChangeSimConfig changeSimConfig;
    @Nullable
    private MrtrChangeSimReasonResponse changeSimReason;
    @Nullable
    private ChangeSimRequestVerifyReason changeSimRequestVerifyReason;
    @Nullable
    private MrtrChangeSimSubmitRequest changeSimSubmitRequest;
    @Nullable
    private ErrorCollection checkSimStockError;
    @Nullable
    private CheckSimStockResponse checkSimStockResponse;
    @Nullable
    private ErrorCollection cutSimStockError;
    @Nullable
    private CutSimStockResponse cutSimStockResponse;
    @Nullable
    private MrtrChangeSimExistingProfileResponse existingProfileResponse;
    @Nullable
    private FaceRecResponse faceRecResponse;
    @Nullable
    private MrtrChangeSimGetCurrentSimResponse getCurrentSimResponse;
    @Nullable
    private ErrorCollection inProgressError;
    private boolean isAllowManualKYC;
    private boolean isAttorney;
    private boolean isAutoTransferEDMS;
    private boolean isCheckSimStock;
    private boolean isNotCaptured;
    @Nullable
    private Boolean isReadCardInAddress;
    private boolean isRequireLiveness;
    private boolean isSaveESIMOrder;
    private boolean isSmartCard;
    private int kycAttemp;
    @Nullable
    private Bitmap mergeBitmaps;
    @Nullable
    private UpdatePrepaidOptionalImage optionalImage;
    @Nullable
    private String ownerIdCardNumber;
    @Nullable
    private String ownerIdCardPhoto;
    @Nullable
    private String ownerPostCode;
    @Nullable
    private PaymentReceiptData paymentReceiptData;
    @Nullable
    private String pendingEsimCard;
    @Nullable
    private String phoneNumber;
    private boolean requireFaceRecognition;
    @Nullable
    private ReasonsItem selectedReasonsItem;
    @Nullable
    private SimCardNumberResponse simCardNumberResponse;
    @Nullable
    private MrtrChangeSimVerifyRequest verifyRequest;
    @Nullable
    private MrtrChangeSimVerifyResponse verifyResponse;

    public MrtrChangeSim() {
        this(null, null, null, null, false, null, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, -1, 16383, null);
    }

    @Nullable
    public final AddressPaymentReceipt getAddressPaymentReceipt() {
        return this.addressPaymentReceipt;
    }

    public final boolean getAirportShop() {
        return this.airportShop;
    }

    @NotNull
    public final List<String> getAttachmentNames() {
        return this.attachmentNames;
    }

    @Nullable
    public final String getAttorneyIdCardNumber() {
        return this.attorneyIdCardNumber;
    }

    @Nullable
    public final String getAttorneyIdCardPhoto() {
        return this.attorneyIdCardPhoto;
    }

    @Nullable
    public final String getAttorneyPostCode() {
        return this.attorneyPostCode;
    }

    @Nullable
    public final AutoTransferEsimResponse getAutoTransferEsimResponse() {
        return this.autoTransferEsimResponse;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformation() {
        return this.cardInformation;
    }

    @Nullable
    public final IdCardInformationCollection getCardInformationAttoney() {
        return this.cardInformationAttoney;
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
    public final ChangeSimConfig getChangeSimConfig() {
        return this.changeSimConfig;
    }

    @Nullable
    public final MrtrChangeSimReasonResponse getChangeSimReason() {
        return this.changeSimReason;
    }

    @Nullable
    public final ChangeSimRequestVerifyReason getChangeSimRequestVerifyReason() {
        return this.changeSimRequestVerifyReason;
    }

    @Nullable
    public final MrtrChangeSimSubmitRequest getChangeSimSubmitRequest() {
        return this.changeSimSubmitRequest;
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
    public final ErrorCollection getCutSimStockError() {
        return this.cutSimStockError;
    }

    @Nullable
    public final CutSimStockResponse getCutSimStockResponse() {
        return this.cutSimStockResponse;
    }

    @Nullable
    public final MrtrChangeSimExistingProfileResponse getExistingProfileResponse() {
        return this.existingProfileResponse;
    }

    @Nullable
    public final FaceRecResponse getFaceRecResponse() {
        return this.faceRecResponse;
    }

    @Nullable
    public final MrtrChangeSimGetCurrentSimResponse getGetCurrentSimResponse() {
        return this.getCurrentSimResponse;
    }

    @Nullable
    public final ErrorCollection getInProgressError() {
        return this.inProgressError;
    }

    public final int getKycAttemp() {
        return this.kycAttemp;
    }

    @Nullable
    public final Bitmap getMergeBitmaps() {
        return this.mergeBitmaps;
    }

    @Nullable
    public final UpdatePrepaidOptionalImage getOptionalImage() {
        return this.optionalImage;
    }

    @Nullable
    public final String getOwnerIdCardNumber() {
        return this.ownerIdCardNumber;
    }

    @Nullable
    public final String getOwnerIdCardPhoto() {
        return this.ownerIdCardPhoto;
    }

    @Nullable
    public final String getOwnerPostCode() {
        return this.ownerPostCode;
    }

    @Nullable
    public final PaymentReceiptData getPaymentReceiptData() {
        return this.paymentReceiptData;
    }

    @Nullable
    public final String getPendingEsimCard() {
        return this.pendingEsimCard;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final ReasonsItem getSelectedReasonsItem() {
        return this.selectedReasonsItem;
    }

    @Nullable
    public final SimCardNumberResponse getSimCardNumberResponse() {
        return this.simCardNumberResponse;
    }

    @Nullable
    public final MrtrChangeSimVerifyRequest getVerifyRequest() {
        return this.verifyRequest;
    }

    @Nullable
    public final MrtrChangeSimVerifyResponse getVerifyResponse() {
        return this.verifyResponse;
    }

    public final boolean isAllowManualKYC() {
        return this.isAllowManualKYC;
    }

    public final boolean isAttorney() {
        return this.isAttorney;
    }

    public final boolean isAutoTransferEDMS() {
        return this.isAutoTransferEDMS;
    }

    public final boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final boolean isNotCaptured() {
        return this.isNotCaptured;
    }

    @Nullable
    public final Boolean isReadCardInAddress() {
        return this.isReadCardInAddress;
    }

    public final boolean isRequireLiveness() {
        return this.isRequireLiveness;
    }

    public final boolean isSaveESIMOrder() {
        return this.isSaveESIMOrder;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAddressPaymentReceipt(@Nullable AddressPaymentReceipt addressPaymentReceipt) {
        this.addressPaymentReceipt = addressPaymentReceipt;
    }

    public final void setAirportShop(boolean z) {
        this.airportShop = z;
    }

    public final void setAllowManualKYC(boolean z) {
        this.isAllowManualKYC = z;
    }

    public final void setAttachmentNames(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachmentNames = list;
    }

    public final void setAttorney(boolean z) {
        this.isAttorney = z;
    }

    public final void setAttorneyIdCardNumber(@Nullable String str) {
        this.attorneyIdCardNumber = str;
    }

    public final void setAttorneyIdCardPhoto(@Nullable String str) {
        this.attorneyIdCardPhoto = str;
    }

    public final void setAttorneyPostCode(@Nullable String str) {
        this.attorneyPostCode = str;
    }

    public final void setAutoTransferEDMS(boolean z) {
        this.isAutoTransferEDMS = z;
    }

    public final void setAutoTransferEsimResponse(@Nullable AutoTransferEsimResponse autoTransferEsimResponse) {
        this.autoTransferEsimResponse = autoTransferEsimResponse;
    }

    public final void setCardInformation(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformation = idCardInformationCollection;
    }

    public final void setCardInformationAttoney(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformationAttoney = idCardInformationCollection;
    }

    public final void setCardInformationForAddress(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.cardInformationForAddress = idCardInformationCollection;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setChangeSimConfig(@Nullable ChangeSimConfig changeSimConfig) {
        this.changeSimConfig = changeSimConfig;
    }

    public final void setChangeSimReason(@Nullable MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse) {
        this.changeSimReason = mrtrChangeSimReasonResponse;
    }

    public final void setChangeSimRequestVerifyReason(@Nullable ChangeSimRequestVerifyReason changeSimRequestVerifyReason) {
        this.changeSimRequestVerifyReason = changeSimRequestVerifyReason;
    }

    public final void setChangeSimSubmitRequest(@Nullable MrtrChangeSimSubmitRequest mrtrChangeSimSubmitRequest) {
        this.changeSimSubmitRequest = mrtrChangeSimSubmitRequest;
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

    public final void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        this.cutSimStockError = errorCollection;
    }

    public final void setCutSimStockResponse(@Nullable CutSimStockResponse cutSimStockResponse) {
        this.cutSimStockResponse = cutSimStockResponse;
    }

    public final void setExistingProfileResponse(@Nullable MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse) {
        this.existingProfileResponse = mrtrChangeSimExistingProfileResponse;
    }

    public final void setFaceRecResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.faceRecResponse = faceRecResponse;
    }

    public final void setGetCurrentSimResponse(@Nullable MrtrChangeSimGetCurrentSimResponse mrtrChangeSimGetCurrentSimResponse) {
        this.getCurrentSimResponse = mrtrChangeSimGetCurrentSimResponse;
    }

    public final void setInProgressError(@Nullable ErrorCollection errorCollection) {
        this.inProgressError = errorCollection;
    }

    public final void setKycAttemp(int i) {
        this.kycAttemp = i;
    }

    public final void setMergeBitmaps(@Nullable Bitmap bitmap) {
        this.mergeBitmaps = bitmap;
    }

    public final void setNotCaptured(boolean z) {
        this.isNotCaptured = z;
    }

    public final void setOptionalImage(@Nullable UpdatePrepaidOptionalImage updatePrepaidOptionalImage) {
        this.optionalImage = updatePrepaidOptionalImage;
    }

    public final void setOwnerIdCardNumber(@Nullable String str) {
        this.ownerIdCardNumber = str;
    }

    public final void setOwnerIdCardPhoto(@Nullable String str) {
        this.ownerIdCardPhoto = str;
    }

    public final void setOwnerPostCode(@Nullable String str) {
        this.ownerPostCode = str;
    }

    public final void setPaymentReceiptData(@Nullable PaymentReceiptData paymentReceiptData) {
        this.paymentReceiptData = paymentReceiptData;
    }

    public final void setPendingEsimCard(@Nullable String str) {
        this.pendingEsimCard = str;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public final void setReadCardInAddress(@Nullable Boolean bool) {
        this.isReadCardInAddress = bool;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    public final void setRequireLiveness(boolean z) {
        this.isRequireLiveness = z;
    }

    public final void setSaveESIMOrder(boolean z) {
        this.isSaveESIMOrder = z;
    }

    public final void setSelectedReasonsItem(@Nullable ReasonsItem reasonsItem) {
        this.selectedReasonsItem = reasonsItem;
    }

    public final void setSimCardNumberResponse(@Nullable SimCardNumberResponse simCardNumberResponse) {
        this.simCardNumberResponse = simCardNumberResponse;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setVerifyRequest(@Nullable MrtrChangeSimVerifyRequest mrtrChangeSimVerifyRequest) {
        this.verifyRequest = mrtrChangeSimVerifyRequest;
    }

    public final void setVerifyResponse(@Nullable MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse) {
        this.verifyResponse = mrtrChangeSimVerifyResponse;
    }

    public MrtrChangeSim(@Nullable ChangeSimConfig changeSimConfig, @Nullable MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse, @Nullable ReasonsItem reasonsItem, @Nullable ChangeSimRequestVerifyReason changeSimRequestVerifyReason, boolean z, @Nullable UpdatePrepaidOptionalImage updatePrepaidOptionalImage, boolean z2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull List<String> attachmentNames, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable PaymentReceiptData paymentReceiptData, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, @Nullable IdCardInformationCollection idCardInformationCollection3, @Nullable Boolean bool, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable CheckSimStockResponse checkSimStockResponse, @Nullable CutSimStockResponse cutSimStockResponse, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, @Nullable MrtrChangeSimGetCurrentSimResponse mrtrChangeSimGetCurrentSimResponse, @Nullable MrtrChangeSimVerifyRequest mrtrChangeSimVerifyRequest, @Nullable MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse, @Nullable MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse, @Nullable MrtrChangeSimSubmitRequest mrtrChangeSimSubmitRequest, @Nullable FaceRecResponse faceRecResponse, boolean z7, @Nullable ErrorCollection errorCollection3, @Nullable SimCardNumberResponse simCardNumberResponse, @Nullable AutoTransferEsimResponse autoTransferEsimResponse, @Nullable Bitmap bitmap, @Nullable String str9, boolean z8, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        this.changeSimConfig = changeSimConfig;
        this.changeSimReason = mrtrChangeSimReasonResponse;
        this.selectedReasonsItem = reasonsItem;
        this.changeSimRequestVerifyReason = changeSimRequestVerifyReason;
        this.isAttorney = z;
        this.optionalImage = updatePrepaidOptionalImage;
        this.isSmartCard = z2;
        this.ownerIdCardNumber = str;
        this.ownerIdCardPhoto = str2;
        this.attorneyIdCardNumber = str3;
        this.attorneyIdCardPhoto = str4;
        this.phoneNumber = str5;
        this.kycAttemp = i;
        this.cardType = str6;
        this.ownerPostCode = str7;
        this.attorneyPostCode = str8;
        this.attachmentNames = attachmentNames;
        this.addressPaymentReceipt = addressPaymentReceipt;
        this.paymentReceiptData = paymentReceiptData;
        this.cardInformation = idCardInformationCollection;
        this.cardInformationAttoney = idCardInformationCollection2;
        this.cardInformationForAddress = idCardInformationCollection3;
        this.isReadCardInAddress = bool;
        this.isCheckSimStock = z3;
        this.airportShop = z4;
        this.isAutoTransferEDMS = z5;
        this.requireFaceRecognition = z6;
        this.checkSimStockResponse = checkSimStockResponse;
        this.cutSimStockResponse = cutSimStockResponse;
        this.checkSimStockError = errorCollection;
        this.cutSimStockError = errorCollection2;
        this.getCurrentSimResponse = mrtrChangeSimGetCurrentSimResponse;
        this.verifyRequest = mrtrChangeSimVerifyRequest;
        this.verifyResponse = mrtrChangeSimVerifyResponse;
        this.existingProfileResponse = mrtrChangeSimExistingProfileResponse;
        this.changeSimSubmitRequest = mrtrChangeSimSubmitRequest;
        this.faceRecResponse = faceRecResponse;
        this.isSaveESIMOrder = z7;
        this.inProgressError = errorCollection3;
        this.simCardNumberResponse = simCardNumberResponse;
        this.autoTransferEsimResponse = autoTransferEsimResponse;
        this.mergeBitmaps = bitmap;
        this.pendingEsimCard = str9;
        this.isNotCaptured = z8;
        this.isAllowManualKYC = z9;
        this.isRequireLiveness = z10;
    }

    public /* synthetic */ MrtrChangeSim(ChangeSimConfig changeSimConfig, MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse, ReasonsItem reasonsItem, ChangeSimRequestVerifyReason changeSimRequestVerifyReason, boolean z, UpdatePrepaidOptionalImage updatePrepaidOptionalImage, boolean z2, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, List list, AddressPaymentReceipt addressPaymentReceipt, PaymentReceiptData paymentReceiptData, IdCardInformationCollection idCardInformationCollection, IdCardInformationCollection idCardInformationCollection2, IdCardInformationCollection idCardInformationCollection3, Boolean bool, boolean z3, boolean z4, boolean z5, boolean z6, CheckSimStockResponse checkSimStockResponse, CutSimStockResponse cutSimStockResponse, ErrorCollection errorCollection, ErrorCollection errorCollection2, MrtrChangeSimGetCurrentSimResponse mrtrChangeSimGetCurrentSimResponse, MrtrChangeSimVerifyRequest mrtrChangeSimVerifyRequest, MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse, MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse, MrtrChangeSimSubmitRequest mrtrChangeSimSubmitRequest, FaceRecResponse faceRecResponse, boolean z7, ErrorCollection errorCollection3, SimCardNumberResponse simCardNumberResponse, AutoTransferEsimResponse autoTransferEsimResponse, Bitmap bitmap, String str9, boolean z8, boolean z9, boolean z10, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : changeSimConfig, (i2 & 2) != 0 ? null : mrtrChangeSimReasonResponse, (i2 & 4) != 0 ? null : reasonsItem, (i2 & 8) != 0 ? null : changeSimRequestVerifyReason, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : updatePrepaidOptionalImage, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? null : str6, (i2 & 16384) != 0 ? null : str7, (i2 & 32768) != 0 ? null : str8, (i2 & 65536) != 0 ? new ArrayList() : list, (i2 & 131072) != 0 ? null : addressPaymentReceipt, (i2 & 262144) != 0 ? null : paymentReceiptData, (i2 & 524288) != 0 ? null : idCardInformationCollection, (i2 & 1048576) != 0 ? null : idCardInformationCollection2, (i2 & 2097152) != 0 ? null : idCardInformationCollection3, (i2 & 4194304) != 0 ? null : bool, (i2 & 8388608) != 0 ? false : z3, (i2 & 16777216) != 0 ? false : z4, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z5, (i2 & 67108864) != 0 ? true : z6, (i2 & 134217728) != 0 ? null : checkSimStockResponse, (i2 & 268435456) != 0 ? null : cutSimStockResponse, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? null : errorCollection, (i2 & 1073741824) != 0 ? null : errorCollection2, (i2 & Integer.MIN_VALUE) != 0 ? null : mrtrChangeSimGetCurrentSimResponse, (i3 & 1) != 0 ? null : mrtrChangeSimVerifyRequest, (i3 & 2) != 0 ? null : mrtrChangeSimVerifyResponse, (i3 & 4) != 0 ? null : mrtrChangeSimExistingProfileResponse, (i3 & 8) != 0 ? null : mrtrChangeSimSubmitRequest, (i3 & 16) != 0 ? null : faceRecResponse, (i3 & 32) != 0 ? false : z7, (i3 & 64) != 0 ? null : errorCollection3, (i3 & 128) != 0 ? null : simCardNumberResponse, (i3 & 256) != 0 ? null : autoTransferEsimResponse, (i3 & 512) != 0 ? null : bitmap, (i3 & 1024) != 0 ? null : str9, (i3 & 2048) != 0 ? false : z8, (i3 & 4096) != 0 ? false : z9, (i3 & 8192) != 0 ? false : z10);
    }
}