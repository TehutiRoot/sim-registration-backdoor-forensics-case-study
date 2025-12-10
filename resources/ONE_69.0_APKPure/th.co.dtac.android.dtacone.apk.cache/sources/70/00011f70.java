package th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim;

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
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.AddressPaymentReceipt;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.PaymentReceiptData;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.request.MrtrPrepaidValidateIdCardRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.response.MrtrPrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÀ\u0001\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010,\u001a\u00020'\u0012\b\b\u0002\u0010-\u001a\u00020'\u0012\b\b\u0002\u0010.\u001a\u00020!\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020'\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00104\u001a\u00020!\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010#\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#\u0012\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#\u0012\b\b\u0002\u0010@\u001a\u00020\u0005\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010D\u001a\u00020E\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0002\u0010IJ\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020!HÆ\u0003J\u0010\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050#HÆ\u0003J\u0010\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050#HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010â\u0001\u001a\u00020'HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\n\u0010æ\u0001\u001a\u00020'HÆ\u0003J\n\u0010ç\u0001\u001a\u00020'HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010é\u0001\u001a\u00020!HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\n\u0010ì\u0001\u001a\u00020'HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010î\u0001\u001a\u00020!HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\u0012\u0010ð\u0001\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010#HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010ô\u0001\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#HÆ\u0003J\u0012\u0010õ\u0001\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0005HÆ\u0003J\u0012\u0010÷\u0001\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0003\u0010\u009c\u0001J\f\u0010ø\u0001\u001a\u0004\u0018\u00010CHÆ\u0003J\n\u0010ù\u0001\u001a\u00020EHÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010GHÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010GHÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÌ\u0004\u0010\u0081\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020'2\b\b\u0002\u0010-\u001a\u00020'2\b\b\u0002\u0010.\u001a\u00020!2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020'2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00104\u001a\u00020!2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010#2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#2\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#2\b\b\u0002\u0010@\u001a\u00020\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010D\u001a\u00020E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010GHÆ\u0001¢\u0006\u0003\u0010\u0082\u0002J\u0015\u0010\u0083\u0002\u001a\u00020'2\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0085\u0002\u001a\u00020!HÖ\u0001J\n\u0010\u0086\u0002\u001a\u00020\u0005HÖ\u0001R\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010K\"\u0004\bO\u0010MR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010MR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010c\"\u0004\bg\u0010eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010K\"\u0004\bi\u0010MR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001c\u0010D\u001a\u00020EX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u00101\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010k\"\u0005\b\u0083\u0001\u0010mR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010K\"\u0005\b\u0085\u0001\u0010MR \u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010K\"\u0005\b\u008b\u0001\u0010MR \u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010K\"\u0005\b\u0091\u0001\u0010MR \u0010H\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001\"\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010K\"\u0005\b\u0099\u0001\u0010MR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010K\"\u0005\b\u009b\u0001\u0010MR\"\u0010A\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0014\n\u0003\u0010\u009f\u0001\u001a\u0005\bA\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010-\u001a\u00020'X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b-\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R\u001d\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b&\u0010 \u0001\"\u0006\b£\u0001\u0010¢\u0001R\u001d\u00102\u001a\u00020'X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b2\u0010 \u0001\"\u0006\b¤\u0001\u0010¢\u0001R\u001d\u0010,\u001a\u00020'X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b,\u0010 \u0001\"\u0006\b¥\u0001\u0010¢\u0001R\u001e\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R\u001e\u00104\u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010§\u0001\"\u0006\b«\u0001\u0010©\u0001R \u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R$\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010Y\"\u0005\b±\u0001\u0010[R$\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010Y\"\u0005\b³\u0001\u0010[R\u001c\u0010@\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010K\"\u0005\bµ\u0001\u0010MR \u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010K\"\u0005\b»\u0001\u0010MR \u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010K\"\u0005\bÁ\u0001\u0010MR \u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010Y\"\u0005\bÇ\u0001\u0010[R\u001e\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010K\"\u0005\bÉ\u0001\u0010MR \u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R$\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010#X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010Y\"\u0005\bÏ\u0001\u0010[R\u001e\u0010.\u001a\u00020!X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÐ\u0001\u0010§\u0001\"\u0006\bÑ\u0001\u0010©\u0001¨\u0006\u0087\u0002"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MrtrPrepaidMultiSim;", "", "prepaidConfig", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;", "imageSignatureConsentXSim", "", "displaySubscriberNumber", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformationForAddress", "card", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "cameraBirthDate", "postcodeSequence", "Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;", "postcode", "postcodeSequenceString", "cardType", "imageName", "idDocType", "compareResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "compareResponseForSubmit", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "paymentReceiptData", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "addressPaymentReceipt", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "addressMailingData", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "consentNonTelcoResponse", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "kycAttemp", "", "attachmentNames", "", "receiptBase64List", "registerType", "isKYC", "", "acceptNonTelco", "ConsentVersionLabel", "getAuthorizationByRtrResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "isSmartCard", "isCheckSimStock", "successType", "checkSimStockError", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "cutSimStockError", "isReadCardInAddress", "featureCode", "lastOptionalImageName", "mrtrPrepaidValidateIdCardResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "subscriberList", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSubscriber;", "requestValidateIdCard", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;", "consentXSimResponse", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "multiSimSubmitResultList", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSimSubmitResult;", "multiSimSubmitResultListForPrintReceipt", "nontelcoConsentType", "isActivateStatus", "faceCompareResult", "Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;", "currentFormType", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "idDocumentResultForOcr", "Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "idDocumentResultForCompare", "(Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;ZZILth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;ZLjava/lang/String;ILth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;Ljava/util/List;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;)V", "getConsentVersionLabel", "()Ljava/lang/String;", "setConsentVersionLabel", "(Ljava/lang/String;)V", "getAcceptNonTelco", "setAcceptNonTelco", "getAddressMailingData", "()Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "setAddressMailingData", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;)V", "getAddressPaymentReceipt", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;", "setAddressPaymentReceipt", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;)V", "getAttachmentNames", "()Ljava/util/List;", "setAttachmentNames", "(Ljava/util/List;)V", "getCameraBirthDate", "setCameraBirthDate", "getCard", "()Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "setCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;)V", "getCardInformation", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setCardInformation", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getCardInformationForAddress", "setCardInformationForAddress", "getCardType", "setCardType", "getCheckSimStockError", "()Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "setCheckSimStockError", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "getCompareResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setCompareResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getCompareResponseForSubmit", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "setCompareResponseForSubmit", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;)V", "getConsentNonTelcoResponse", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "setConsentNonTelcoResponse", "(Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;)V", "getConsentXSimResponse", "()Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "setConsentXSimResponse", "(Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;)V", "getCurrentFormType", "()Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "setCurrentFormType", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;)V", "getCutSimStockError", "setCutSimStockError", "getDisplaySubscriberNumber", "setDisplaySubscriberNumber", "getFaceCompareResult", "()Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;", "setFaceCompareResult", "(Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;)V", "getFeatureCode", "setFeatureCode", "getGetAuthorizationByRtrResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "setGetAuthorizationByRtrResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;)V", "getIdDocType", "setIdDocType", "getIdDocumentResultForCompare", "()Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "setIdDocumentResultForCompare", "(Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;)V", "getIdDocumentResultForOcr", "setIdDocumentResultForOcr", "getImageName", "setImageName", "getImageSignatureConsentXSim", "setImageSignatureConsentXSim", "()Ljava/lang/Boolean;", "setActivateStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setCheckSimStock", "(Z)V", "setKYC", "setReadCardInAddress", "setSmartCard", "getKycAttemp", "()I", "setKycAttemp", "(I)V", "getLastOptionalImageName", "setLastOptionalImageName", "getMrtrPrepaidValidateIdCardResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "setMrtrPrepaidValidateIdCardResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;)V", "getMultiSimSubmitResultList", "setMultiSimSubmitResultList", "getMultiSimSubmitResultListForPrintReceipt", "setMultiSimSubmitResultListForPrintReceipt", "getNontelcoConsentType", "setNontelcoConsentType", "getPaymentReceiptData", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;", "setPaymentReceiptData", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;)V", "getPostcode", "setPostcode", "getPostcodeSequence", "()Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;", "setPostcodeSequence", "(Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;)V", "getPostcodeSequenceString", "setPostcodeSequenceString", "getPrepaidConfig", "()Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;", "setPrepaidConfig", "(Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;)V", "getReceiptBase64List", "setReceiptBase64List", "getRegisterType", "setRegisterType", "getRequestValidateIdCard", "()Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;", "setRequestValidateIdCard", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;)V", "getSubscriberList", "setSubscriberList", "getSuccessType", "setSuccessType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component5", "component6", "component7", "component8", "component9", "copy", "(Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/PaymentReceiptData;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/AddressPaymentReceipt;Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;ZZILth/co/dtac/android/dtacone/model/error/ErrorCollection;Lth/co/dtac/android/dtacone/model/error/ErrorCollection;ZLjava/lang/String;ILth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;Ljava/util/List;Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/request/MrtrPrepaidValidateIdCardRequest;Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;)Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MrtrPrepaidMultiSim;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSim */
/* loaded from: classes8.dex */
public final class MrtrPrepaidMultiSim {
    public static final int $stable = 8;
    @Nullable
    private String ConsentVersionLabel;
    @Nullable
    private String acceptNonTelco;
    @Nullable
    private AddressMailingData addressMailingData;
    @Nullable
    private AddressPaymentReceipt addressPaymentReceipt;
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
    private FaceRecResponse compareResponse;
    @Nullable
    private FaceCompareResponse compareResponseForSubmit;
    @Nullable
    private ConsentNonTelcoResponse consentNonTelcoResponse;
    @Nullable
    private XSIMConsentResponse consentXSimResponse;
    @NotNull
    private UpPassFormType currentFormType;
    @Nullable
    private ErrorCollection cutSimStockError;
    @Nullable
    private String displaySubscriberNumber;
    @Nullable
    private FaceCompareResult faceCompareResult;
    @Nullable
    private String featureCode;
    @Nullable
    private GetAuthorizationByRtrResponse getAuthorizationByRtrResponse;
    @Nullable
    private String idDocType;
    @Nullable
    private IdDocumentResult idDocumentResultForCompare;
    @Nullable
    private IdDocumentResult idDocumentResultForOcr;
    @Nullable
    private String imageName;
    @Nullable
    private String imageSignatureConsentXSim;
    @Nullable
    private Boolean isActivateStatus;
    private boolean isCheckSimStock;
    private boolean isKYC;
    private boolean isReadCardInAddress;
    private boolean isSmartCard;
    private int kycAttemp;
    private int lastOptionalImageName;
    @Nullable
    private MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse;
    @Nullable
    private List<MultiSimSubmitResult> multiSimSubmitResultList;
    @Nullable
    private List<MultiSimSubmitResult> multiSimSubmitResultListForPrintReceipt;
    @NotNull
    private String nontelcoConsentType;
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
    @NotNull
    private List<String> receiptBase64List;
    @Nullable
    private String registerType;
    @Nullable
    private MrtrPrepaidValidateIdCardRequest requestValidateIdCard;
    @Nullable
    private List<MultiSubscriber> subscriberList;
    private int successType;

    public MrtrPrepaidMultiSim() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, false, false, 0, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
    }

    @Nullable
    public final PrepaidConfig component1() {
        return this.prepaidConfig;
    }

    @Nullable
    public final String component10() {
        return this.postcodeSequenceString;
    }

    @Nullable
    public final String component11() {
        return this.cardType;
    }

    @Nullable
    public final String component12() {
        return this.imageName;
    }

    @Nullable
    public final String component13() {
        return this.idDocType;
    }

    @Nullable
    public final FaceRecResponse component14() {
        return this.compareResponse;
    }

    @Nullable
    public final FaceCompareResponse component15() {
        return this.compareResponseForSubmit;
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
    public final String component2() {
        return this.imageSignatureConsentXSim;
    }

    public final int component20() {
        return this.kycAttemp;
    }

    @NotNull
    public final List<String> component21() {
        return this.attachmentNames;
    }

    @NotNull
    public final List<String> component22() {
        return this.receiptBase64List;
    }

    @Nullable
    public final String component23() {
        return this.registerType;
    }

    public final boolean component24() {
        return this.isKYC;
    }

    @Nullable
    public final String component25() {
        return this.acceptNonTelco;
    }

    @Nullable
    public final String component26() {
        return this.ConsentVersionLabel;
    }

    @Nullable
    public final GetAuthorizationByRtrResponse component27() {
        return this.getAuthorizationByRtrResponse;
    }

    public final boolean component28() {
        return this.isSmartCard;
    }

    public final boolean component29() {
        return this.isCheckSimStock;
    }

    @Nullable
    public final String component3() {
        return this.displaySubscriberNumber;
    }

    public final int component30() {
        return this.successType;
    }

    @Nullable
    public final ErrorCollection component31() {
        return this.checkSimStockError;
    }

    @Nullable
    public final ErrorCollection component32() {
        return this.cutSimStockError;
    }

    public final boolean component33() {
        return this.isReadCardInAddress;
    }

    @Nullable
    public final String component34() {
        return this.featureCode;
    }

    public final int component35() {
        return this.lastOptionalImageName;
    }

    @Nullable
    public final MrtrPrepaidValidateIdCardResponse component36() {
        return this.mrtrPrepaidValidateIdCardResponse;
    }

    @Nullable
    public final List<MultiSubscriber> component37() {
        return this.subscriberList;
    }

    @Nullable
    public final MrtrPrepaidValidateIdCardRequest component38() {
        return this.requestValidateIdCard;
    }

    @Nullable
    public final XSIMConsentResponse component39() {
        return this.consentXSimResponse;
    }

    @Nullable
    public final IdCardInformationCollection component4() {
        return this.cardInformation;
    }

    @Nullable
    public final List<MultiSimSubmitResult> component40() {
        return this.multiSimSubmitResultList;
    }

    @Nullable
    public final List<MultiSimSubmitResult> component41() {
        return this.multiSimSubmitResultListForPrintReceipt;
    }

    @NotNull
    public final String component42() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final Boolean component43() {
        return this.isActivateStatus;
    }

    @Nullable
    public final FaceCompareResult component44() {
        return this.faceCompareResult;
    }

    @NotNull
    public final UpPassFormType component45() {
        return this.currentFormType;
    }

    @Nullable
    public final IdDocumentResult component46() {
        return this.idDocumentResultForOcr;
    }

    @Nullable
    public final IdDocumentResult component47() {
        return this.idDocumentResultForCompare;
    }

    @Nullable
    public final IdCardInformationCollection component5() {
        return this.cardInformationForAddress;
    }

    @Nullable
    public final CardCollection component6() {
        return this.card;
    }

    @Nullable
    public final String component7() {
        return this.cameraBirthDate;
    }

    @Nullable
    public final CardInformationCollection component8() {
        return this.postcodeSequence;
    }

    @Nullable
    public final String component9() {
        return this.postcode;
    }

    @NotNull
    public final MrtrPrepaidMultiSim copy(@Nullable PrepaidConfig prepaidConfig, @Nullable String str, @Nullable String str2, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, @Nullable CardCollection cardCollection, @Nullable String str3, @Nullable CardInformationCollection cardInformationCollection, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, @Nullable PaymentReceiptData paymentReceiptData, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable AddressMailingData addressMailingData, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, int i, @NotNull List<String> attachmentNames, @NotNull List<String> receiptBase64List, @Nullable String str9, boolean z, @Nullable String str10, @Nullable String str11, @Nullable GetAuthorizationByRtrResponse getAuthorizationByRtrResponse, boolean z2, boolean z3, int i2, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, boolean z4, @Nullable String str12, int i3, @Nullable MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse, @Nullable List<MultiSubscriber> list, @Nullable MrtrPrepaidValidateIdCardRequest mrtrPrepaidValidateIdCardRequest, @Nullable XSIMConsentResponse xSIMConsentResponse, @Nullable List<MultiSimSubmitResult> list2, @Nullable List<MultiSimSubmitResult> list3, @NotNull String nontelcoConsentType, @Nullable Boolean bool, @Nullable FaceCompareResult faceCompareResult, @NotNull UpPassFormType currentFormType, @Nullable IdDocumentResult idDocumentResult, @Nullable IdDocumentResult idDocumentResult2) {
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(receiptBase64List, "receiptBase64List");
        Intrinsics.checkNotNullParameter(nontelcoConsentType, "nontelcoConsentType");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        return new MrtrPrepaidMultiSim(prepaidConfig, str, str2, idCardInformationCollection, idCardInformationCollection2, cardCollection, str3, cardInformationCollection, str4, str5, str6, str7, str8, faceRecResponse, faceCompareResponse, paymentReceiptData, addressPaymentReceipt, addressMailingData, consentNonTelcoResponse, i, attachmentNames, receiptBase64List, str9, z, str10, str11, getAuthorizationByRtrResponse, z2, z3, i2, errorCollection, errorCollection2, z4, str12, i3, mrtrPrepaidValidateIdCardResponse, list, mrtrPrepaidValidateIdCardRequest, xSIMConsentResponse, list2, list3, nontelcoConsentType, bool, faceCompareResult, currentFormType, idDocumentResult, idDocumentResult2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPrepaidMultiSim) {
            MrtrPrepaidMultiSim mrtrPrepaidMultiSim = (MrtrPrepaidMultiSim) obj;
            return Intrinsics.areEqual(this.prepaidConfig, mrtrPrepaidMultiSim.prepaidConfig) && Intrinsics.areEqual(this.imageSignatureConsentXSim, mrtrPrepaidMultiSim.imageSignatureConsentXSim) && Intrinsics.areEqual(this.displaySubscriberNumber, mrtrPrepaidMultiSim.displaySubscriberNumber) && Intrinsics.areEqual(this.cardInformation, mrtrPrepaidMultiSim.cardInformation) && Intrinsics.areEqual(this.cardInformationForAddress, mrtrPrepaidMultiSim.cardInformationForAddress) && Intrinsics.areEqual(this.card, mrtrPrepaidMultiSim.card) && Intrinsics.areEqual(this.cameraBirthDate, mrtrPrepaidMultiSim.cameraBirthDate) && Intrinsics.areEqual(this.postcodeSequence, mrtrPrepaidMultiSim.postcodeSequence) && Intrinsics.areEqual(this.postcode, mrtrPrepaidMultiSim.postcode) && Intrinsics.areEqual(this.postcodeSequenceString, mrtrPrepaidMultiSim.postcodeSequenceString) && Intrinsics.areEqual(this.cardType, mrtrPrepaidMultiSim.cardType) && Intrinsics.areEqual(this.imageName, mrtrPrepaidMultiSim.imageName) && Intrinsics.areEqual(this.idDocType, mrtrPrepaidMultiSim.idDocType) && Intrinsics.areEqual(this.compareResponse, mrtrPrepaidMultiSim.compareResponse) && Intrinsics.areEqual(this.compareResponseForSubmit, mrtrPrepaidMultiSim.compareResponseForSubmit) && Intrinsics.areEqual(this.paymentReceiptData, mrtrPrepaidMultiSim.paymentReceiptData) && Intrinsics.areEqual(this.addressPaymentReceipt, mrtrPrepaidMultiSim.addressPaymentReceipt) && Intrinsics.areEqual(this.addressMailingData, mrtrPrepaidMultiSim.addressMailingData) && Intrinsics.areEqual(this.consentNonTelcoResponse, mrtrPrepaidMultiSim.consentNonTelcoResponse) && this.kycAttemp == mrtrPrepaidMultiSim.kycAttemp && Intrinsics.areEqual(this.attachmentNames, mrtrPrepaidMultiSim.attachmentNames) && Intrinsics.areEqual(this.receiptBase64List, mrtrPrepaidMultiSim.receiptBase64List) && Intrinsics.areEqual(this.registerType, mrtrPrepaidMultiSim.registerType) && this.isKYC == mrtrPrepaidMultiSim.isKYC && Intrinsics.areEqual(this.acceptNonTelco, mrtrPrepaidMultiSim.acceptNonTelco) && Intrinsics.areEqual(this.ConsentVersionLabel, mrtrPrepaidMultiSim.ConsentVersionLabel) && Intrinsics.areEqual(this.getAuthorizationByRtrResponse, mrtrPrepaidMultiSim.getAuthorizationByRtrResponse) && this.isSmartCard == mrtrPrepaidMultiSim.isSmartCard && this.isCheckSimStock == mrtrPrepaidMultiSim.isCheckSimStock && this.successType == mrtrPrepaidMultiSim.successType && Intrinsics.areEqual(this.checkSimStockError, mrtrPrepaidMultiSim.checkSimStockError) && Intrinsics.areEqual(this.cutSimStockError, mrtrPrepaidMultiSim.cutSimStockError) && this.isReadCardInAddress == mrtrPrepaidMultiSim.isReadCardInAddress && Intrinsics.areEqual(this.featureCode, mrtrPrepaidMultiSim.featureCode) && this.lastOptionalImageName == mrtrPrepaidMultiSim.lastOptionalImageName && Intrinsics.areEqual(this.mrtrPrepaidValidateIdCardResponse, mrtrPrepaidMultiSim.mrtrPrepaidValidateIdCardResponse) && Intrinsics.areEqual(this.subscriberList, mrtrPrepaidMultiSim.subscriberList) && Intrinsics.areEqual(this.requestValidateIdCard, mrtrPrepaidMultiSim.requestValidateIdCard) && Intrinsics.areEqual(this.consentXSimResponse, mrtrPrepaidMultiSim.consentXSimResponse) && Intrinsics.areEqual(this.multiSimSubmitResultList, mrtrPrepaidMultiSim.multiSimSubmitResultList) && Intrinsics.areEqual(this.multiSimSubmitResultListForPrintReceipt, mrtrPrepaidMultiSim.multiSimSubmitResultListForPrintReceipt) && Intrinsics.areEqual(this.nontelcoConsentType, mrtrPrepaidMultiSim.nontelcoConsentType) && Intrinsics.areEqual(this.isActivateStatus, mrtrPrepaidMultiSim.isActivateStatus) && Intrinsics.areEqual(this.faceCompareResult, mrtrPrepaidMultiSim.faceCompareResult) && Intrinsics.areEqual(this.currentFormType, mrtrPrepaidMultiSim.currentFormType) && Intrinsics.areEqual(this.idDocumentResultForOcr, mrtrPrepaidMultiSim.idDocumentResultForOcr) && Intrinsics.areEqual(this.idDocumentResultForCompare, mrtrPrepaidMultiSim.idDocumentResultForCompare);
        }
        return false;
    }

    @Nullable
    public final String getAcceptNonTelco() {
        return this.acceptNonTelco;
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
    public final FaceRecResponse getCompareResponse() {
        return this.compareResponse;
    }

    @Nullable
    public final FaceCompareResponse getCompareResponseForSubmit() {
        return this.compareResponseForSubmit;
    }

    @Nullable
    public final ConsentNonTelcoResponse getConsentNonTelcoResponse() {
        return this.consentNonTelcoResponse;
    }

    @Nullable
    public final String getConsentVersionLabel() {
        return this.ConsentVersionLabel;
    }

    @Nullable
    public final XSIMConsentResponse getConsentXSimResponse() {
        return this.consentXSimResponse;
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
    public final String getDisplaySubscriberNumber() {
        return this.displaySubscriberNumber;
    }

    @Nullable
    public final FaceCompareResult getFaceCompareResult() {
        return this.faceCompareResult;
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
    public final IdDocumentResult getIdDocumentResultForCompare() {
        return this.idDocumentResultForCompare;
    }

    @Nullable
    public final IdDocumentResult getIdDocumentResultForOcr() {
        return this.idDocumentResultForOcr;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }

    @Nullable
    public final String getImageSignatureConsentXSim() {
        return this.imageSignatureConsentXSim;
    }

    public final int getKycAttemp() {
        return this.kycAttemp;
    }

    public final int getLastOptionalImageName() {
        return this.lastOptionalImageName;
    }

    @Nullable
    public final MrtrPrepaidValidateIdCardResponse getMrtrPrepaidValidateIdCardResponse() {
        return this.mrtrPrepaidValidateIdCardResponse;
    }

    @Nullable
    public final List<MultiSimSubmitResult> getMultiSimSubmitResultList() {
        return this.multiSimSubmitResultList;
    }

    @Nullable
    public final List<MultiSimSubmitResult> getMultiSimSubmitResultListForPrintReceipt() {
        return this.multiSimSubmitResultListForPrintReceipt;
    }

    @NotNull
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
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

    @NotNull
    public final List<String> getReceiptBase64List() {
        return this.receiptBase64List;
    }

    @Nullable
    public final String getRegisterType() {
        return this.registerType;
    }

    @Nullable
    public final MrtrPrepaidValidateIdCardRequest getRequestValidateIdCard() {
        return this.requestValidateIdCard;
    }

    @Nullable
    public final List<MultiSubscriber> getSubscriberList() {
        return this.subscriberList;
    }

    public final int getSuccessType() {
        return this.successType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        PrepaidConfig prepaidConfig = this.prepaidConfig;
        int hashCode = (prepaidConfig == null ? 0 : prepaidConfig.hashCode()) * 31;
        String str = this.imageSignatureConsentXSim;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displaySubscriberNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection = this.cardInformation;
        int hashCode4 = (hashCode3 + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        IdCardInformationCollection idCardInformationCollection2 = this.cardInformationForAddress;
        int hashCode5 = (hashCode4 + (idCardInformationCollection2 == null ? 0 : idCardInformationCollection2.hashCode())) * 31;
        CardCollection cardCollection = this.card;
        int hashCode6 = (hashCode5 + (cardCollection == null ? 0 : cardCollection.hashCode())) * 31;
        String str3 = this.cameraBirthDate;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CardInformationCollection cardInformationCollection = this.postcodeSequence;
        int hashCode8 = (hashCode7 + (cardInformationCollection == null ? 0 : cardInformationCollection.hashCode())) * 31;
        String str4 = this.postcode;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postcodeSequenceString;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardType;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imageName;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.idDocType;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        FaceRecResponse faceRecResponse = this.compareResponse;
        int hashCode14 = (hashCode13 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31;
        FaceCompareResponse faceCompareResponse = this.compareResponseForSubmit;
        int hashCode15 = (hashCode14 + (faceCompareResponse == null ? 0 : faceCompareResponse.hashCode())) * 31;
        PaymentReceiptData paymentReceiptData = this.paymentReceiptData;
        int hashCode16 = (hashCode15 + (paymentReceiptData == null ? 0 : paymentReceiptData.hashCode())) * 31;
        AddressPaymentReceipt addressPaymentReceipt = this.addressPaymentReceipt;
        int hashCode17 = (hashCode16 + (addressPaymentReceipt == null ? 0 : addressPaymentReceipt.hashCode())) * 31;
        AddressMailingData addressMailingData = this.addressMailingData;
        int hashCode18 = (hashCode17 + (addressMailingData == null ? 0 : addressMailingData.hashCode())) * 31;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.consentNonTelcoResponse;
        int hashCode19 = (((((((hashCode18 + (consentNonTelcoResponse == null ? 0 : consentNonTelcoResponse.hashCode())) * 31) + this.kycAttemp) * 31) + this.attachmentNames.hashCode()) * 31) + this.receiptBase64List.hashCode()) * 31;
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
        GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = this.getAuthorizationByRtrResponse;
        int hashCode23 = (hashCode22 + (getAuthorizationByRtrResponse == null ? 0 : getAuthorizationByRtrResponse.hashCode())) * 31;
        boolean z2 = this.isSmartCard;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode23 + i3) * 31;
        boolean z3 = this.isCheckSimStock;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (((i4 + i5) * 31) + this.successType) * 31;
        ErrorCollection errorCollection = this.checkSimStockError;
        int hashCode24 = (i6 + (errorCollection == null ? 0 : errorCollection.hashCode())) * 31;
        ErrorCollection errorCollection2 = this.cutSimStockError;
        int hashCode25 = (hashCode24 + (errorCollection2 == null ? 0 : errorCollection2.hashCode())) * 31;
        boolean z4 = this.isReadCardInAddress;
        int i7 = (hashCode25 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        String str12 = this.featureCode;
        int hashCode26 = (((i7 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.lastOptionalImageName) * 31;
        MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse = this.mrtrPrepaidValidateIdCardResponse;
        int hashCode27 = (hashCode26 + (mrtrPrepaidValidateIdCardResponse == null ? 0 : mrtrPrepaidValidateIdCardResponse.hashCode())) * 31;
        List<MultiSubscriber> list = this.subscriberList;
        int hashCode28 = (hashCode27 + (list == null ? 0 : list.hashCode())) * 31;
        MrtrPrepaidValidateIdCardRequest mrtrPrepaidValidateIdCardRequest = this.requestValidateIdCard;
        int hashCode29 = (hashCode28 + (mrtrPrepaidValidateIdCardRequest == null ? 0 : mrtrPrepaidValidateIdCardRequest.hashCode())) * 31;
        XSIMConsentResponse xSIMConsentResponse = this.consentXSimResponse;
        int hashCode30 = (hashCode29 + (xSIMConsentResponse == null ? 0 : xSIMConsentResponse.hashCode())) * 31;
        List<MultiSimSubmitResult> list2 = this.multiSimSubmitResultList;
        int hashCode31 = (hashCode30 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MultiSimSubmitResult> list3 = this.multiSimSubmitResultListForPrintReceipt;
        int hashCode32 = (((hashCode31 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.nontelcoConsentType.hashCode()) * 31;
        Boolean bool = this.isActivateStatus;
        int hashCode33 = (hashCode32 + (bool == null ? 0 : bool.hashCode())) * 31;
        FaceCompareResult faceCompareResult = this.faceCompareResult;
        int hashCode34 = (((hashCode33 + (faceCompareResult == null ? 0 : faceCompareResult.hashCode())) * 31) + this.currentFormType.hashCode()) * 31;
        IdDocumentResult idDocumentResult = this.idDocumentResultForOcr;
        int hashCode35 = (hashCode34 + (idDocumentResult == null ? 0 : idDocumentResult.hashCode())) * 31;
        IdDocumentResult idDocumentResult2 = this.idDocumentResultForCompare;
        return hashCode35 + (idDocumentResult2 != null ? idDocumentResult2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isActivateStatus() {
        return this.isActivateStatus;
    }

    public final boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final boolean isKYC() {
        return this.isKYC;
    }

    public final boolean isReadCardInAddress() {
        return this.isReadCardInAddress;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final void setAcceptNonTelco(@Nullable String str) {
        this.acceptNonTelco = str;
    }

    public final void setActivateStatus(@Nullable Boolean bool) {
        this.isActivateStatus = bool;
    }

    public final void setAddressMailingData(@Nullable AddressMailingData addressMailingData) {
        this.addressMailingData = addressMailingData;
    }

    public final void setAddressPaymentReceipt(@Nullable AddressPaymentReceipt addressPaymentReceipt) {
        this.addressPaymentReceipt = addressPaymentReceipt;
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

    public final void setCompareResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.compareResponse = faceRecResponse;
    }

    public final void setCompareResponseForSubmit(@Nullable FaceCompareResponse faceCompareResponse) {
        this.compareResponseForSubmit = faceCompareResponse;
    }

    public final void setConsentNonTelcoResponse(@Nullable ConsentNonTelcoResponse consentNonTelcoResponse) {
        this.consentNonTelcoResponse = consentNonTelcoResponse;
    }

    public final void setConsentVersionLabel(@Nullable String str) {
        this.ConsentVersionLabel = str;
    }

    public final void setConsentXSimResponse(@Nullable XSIMConsentResponse xSIMConsentResponse) {
        this.consentXSimResponse = xSIMConsentResponse;
    }

    public final void setCurrentFormType(@NotNull UpPassFormType upPassFormType) {
        Intrinsics.checkNotNullParameter(upPassFormType, "<set-?>");
        this.currentFormType = upPassFormType;
    }

    public final void setCutSimStockError(@Nullable ErrorCollection errorCollection) {
        this.cutSimStockError = errorCollection;
    }

    public final void setDisplaySubscriberNumber(@Nullable String str) {
        this.displaySubscriberNumber = str;
    }

    public final void setFaceCompareResult(@Nullable FaceCompareResult faceCompareResult) {
        this.faceCompareResult = faceCompareResult;
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

    public final void setIdDocumentResultForCompare(@Nullable IdDocumentResult idDocumentResult) {
        this.idDocumentResultForCompare = idDocumentResult;
    }

    public final void setIdDocumentResultForOcr(@Nullable IdDocumentResult idDocumentResult) {
        this.idDocumentResultForOcr = idDocumentResult;
    }

    public final void setImageName(@Nullable String str) {
        this.imageName = str;
    }

    public final void setImageSignatureConsentXSim(@Nullable String str) {
        this.imageSignatureConsentXSim = str;
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

    public final void setMrtrPrepaidValidateIdCardResponse(@Nullable MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse) {
        this.mrtrPrepaidValidateIdCardResponse = mrtrPrepaidValidateIdCardResponse;
    }

    public final void setMultiSimSubmitResultList(@Nullable List<MultiSimSubmitResult> list) {
        this.multiSimSubmitResultList = list;
    }

    public final void setMultiSimSubmitResultListForPrintReceipt(@Nullable List<MultiSimSubmitResult> list) {
        this.multiSimSubmitResultListForPrintReceipt = list;
    }

    public final void setNontelcoConsentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nontelcoConsentType = str;
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

    public final void setReadCardInAddress(boolean z) {
        this.isReadCardInAddress = z;
    }

    public final void setReceiptBase64List(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.receiptBase64List = list;
    }

    public final void setRegisterType(@Nullable String str) {
        this.registerType = str;
    }

    public final void setRequestValidateIdCard(@Nullable MrtrPrepaidValidateIdCardRequest mrtrPrepaidValidateIdCardRequest) {
        this.requestValidateIdCard = mrtrPrepaidValidateIdCardRequest;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubscriberList(@Nullable List<MultiSubscriber> list) {
        this.subscriberList = list;
    }

    public final void setSuccessType(int i) {
        this.successType = i;
    }

    @NotNull
    public String toString() {
        PrepaidConfig prepaidConfig = this.prepaidConfig;
        String str = this.imageSignatureConsentXSim;
        String str2 = this.displaySubscriberNumber;
        IdCardInformationCollection idCardInformationCollection = this.cardInformation;
        IdCardInformationCollection idCardInformationCollection2 = this.cardInformationForAddress;
        CardCollection cardCollection = this.card;
        String str3 = this.cameraBirthDate;
        CardInformationCollection cardInformationCollection = this.postcodeSequence;
        String str4 = this.postcode;
        String str5 = this.postcodeSequenceString;
        String str6 = this.cardType;
        String str7 = this.imageName;
        String str8 = this.idDocType;
        FaceRecResponse faceRecResponse = this.compareResponse;
        FaceCompareResponse faceCompareResponse = this.compareResponseForSubmit;
        PaymentReceiptData paymentReceiptData = this.paymentReceiptData;
        AddressPaymentReceipt addressPaymentReceipt = this.addressPaymentReceipt;
        AddressMailingData addressMailingData = this.addressMailingData;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.consentNonTelcoResponse;
        int i = this.kycAttemp;
        List<String> list = this.attachmentNames;
        List<String> list2 = this.receiptBase64List;
        String str9 = this.registerType;
        boolean z = this.isKYC;
        String str10 = this.acceptNonTelco;
        String str11 = this.ConsentVersionLabel;
        GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = this.getAuthorizationByRtrResponse;
        boolean z2 = this.isSmartCard;
        boolean z3 = this.isCheckSimStock;
        int i2 = this.successType;
        ErrorCollection errorCollection = this.checkSimStockError;
        ErrorCollection errorCollection2 = this.cutSimStockError;
        boolean z4 = this.isReadCardInAddress;
        String str12 = this.featureCode;
        int i3 = this.lastOptionalImageName;
        MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse = this.mrtrPrepaidValidateIdCardResponse;
        List<MultiSubscriber> list3 = this.subscriberList;
        MrtrPrepaidValidateIdCardRequest mrtrPrepaidValidateIdCardRequest = this.requestValidateIdCard;
        XSIMConsentResponse xSIMConsentResponse = this.consentXSimResponse;
        List<MultiSimSubmitResult> list4 = this.multiSimSubmitResultList;
        List<MultiSimSubmitResult> list5 = this.multiSimSubmitResultListForPrintReceipt;
        String str13 = this.nontelcoConsentType;
        Boolean bool = this.isActivateStatus;
        FaceCompareResult faceCompareResult = this.faceCompareResult;
        UpPassFormType upPassFormType = this.currentFormType;
        IdDocumentResult idDocumentResult = this.idDocumentResultForOcr;
        IdDocumentResult idDocumentResult2 = this.idDocumentResultForCompare;
        return "MrtrPrepaidMultiSim(prepaidConfig=" + prepaidConfig + ", imageSignatureConsentXSim=" + str + ", displaySubscriberNumber=" + str2 + ", cardInformation=" + idCardInformationCollection + ", cardInformationForAddress=" + idCardInformationCollection2 + ", card=" + cardCollection + ", cameraBirthDate=" + str3 + ", postcodeSequence=" + cardInformationCollection + ", postcode=" + str4 + ", postcodeSequenceString=" + str5 + ", cardType=" + str6 + ", imageName=" + str7 + ", idDocType=" + str8 + ", compareResponse=" + faceRecResponse + ", compareResponseForSubmit=" + faceCompareResponse + ", paymentReceiptData=" + paymentReceiptData + ", addressPaymentReceipt=" + addressPaymentReceipt + ", addressMailingData=" + addressMailingData + ", consentNonTelcoResponse=" + consentNonTelcoResponse + ", kycAttemp=" + i + ", attachmentNames=" + list + ", receiptBase64List=" + list2 + ", registerType=" + str9 + ", isKYC=" + z + ", acceptNonTelco=" + str10 + ", ConsentVersionLabel=" + str11 + ", getAuthorizationByRtrResponse=" + getAuthorizationByRtrResponse + ", isSmartCard=" + z2 + ", isCheckSimStock=" + z3 + ", successType=" + i2 + ", checkSimStockError=" + errorCollection + ", cutSimStockError=" + errorCollection2 + ", isReadCardInAddress=" + z4 + ", featureCode=" + str12 + ", lastOptionalImageName=" + i3 + ", mrtrPrepaidValidateIdCardResponse=" + mrtrPrepaidValidateIdCardResponse + ", subscriberList=" + list3 + ", requestValidateIdCard=" + mrtrPrepaidValidateIdCardRequest + ", consentXSimResponse=" + xSIMConsentResponse + ", multiSimSubmitResultList=" + list4 + ", multiSimSubmitResultListForPrintReceipt=" + list5 + ", nontelcoConsentType=" + str13 + ", isActivateStatus=" + bool + ", faceCompareResult=" + faceCompareResult + ", currentFormType=" + upPassFormType + ", idDocumentResultForOcr=" + idDocumentResult + ", idDocumentResultForCompare=" + idDocumentResult2 + ")";
    }

    public MrtrPrepaidMultiSim(@Nullable PrepaidConfig prepaidConfig, @Nullable String str, @Nullable String str2, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable IdCardInformationCollection idCardInformationCollection2, @Nullable CardCollection cardCollection, @Nullable String str3, @Nullable CardInformationCollection cardInformationCollection, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable FaceRecResponse faceRecResponse, @Nullable FaceCompareResponse faceCompareResponse, @Nullable PaymentReceiptData paymentReceiptData, @Nullable AddressPaymentReceipt addressPaymentReceipt, @Nullable AddressMailingData addressMailingData, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, int i, @NotNull List<String> attachmentNames, @NotNull List<String> receiptBase64List, @Nullable String str9, boolean z, @Nullable String str10, @Nullable String str11, @Nullable GetAuthorizationByRtrResponse getAuthorizationByRtrResponse, boolean z2, boolean z3, int i2, @Nullable ErrorCollection errorCollection, @Nullable ErrorCollection errorCollection2, boolean z4, @Nullable String str12, int i3, @Nullable MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse, @Nullable List<MultiSubscriber> list, @Nullable MrtrPrepaidValidateIdCardRequest mrtrPrepaidValidateIdCardRequest, @Nullable XSIMConsentResponse xSIMConsentResponse, @Nullable List<MultiSimSubmitResult> list2, @Nullable List<MultiSimSubmitResult> list3, @NotNull String nontelcoConsentType, @Nullable Boolean bool, @Nullable FaceCompareResult faceCompareResult, @NotNull UpPassFormType currentFormType, @Nullable IdDocumentResult idDocumentResult, @Nullable IdDocumentResult idDocumentResult2) {
        Intrinsics.checkNotNullParameter(attachmentNames, "attachmentNames");
        Intrinsics.checkNotNullParameter(receiptBase64List, "receiptBase64List");
        Intrinsics.checkNotNullParameter(nontelcoConsentType, "nontelcoConsentType");
        Intrinsics.checkNotNullParameter(currentFormType, "currentFormType");
        this.prepaidConfig = prepaidConfig;
        this.imageSignatureConsentXSim = str;
        this.displaySubscriberNumber = str2;
        this.cardInformation = idCardInformationCollection;
        this.cardInformationForAddress = idCardInformationCollection2;
        this.card = cardCollection;
        this.cameraBirthDate = str3;
        this.postcodeSequence = cardInformationCollection;
        this.postcode = str4;
        this.postcodeSequenceString = str5;
        this.cardType = str6;
        this.imageName = str7;
        this.idDocType = str8;
        this.compareResponse = faceRecResponse;
        this.compareResponseForSubmit = faceCompareResponse;
        this.paymentReceiptData = paymentReceiptData;
        this.addressPaymentReceipt = addressPaymentReceipt;
        this.addressMailingData = addressMailingData;
        this.consentNonTelcoResponse = consentNonTelcoResponse;
        this.kycAttemp = i;
        this.attachmentNames = attachmentNames;
        this.receiptBase64List = receiptBase64List;
        this.registerType = str9;
        this.isKYC = z;
        this.acceptNonTelco = str10;
        this.ConsentVersionLabel = str11;
        this.getAuthorizationByRtrResponse = getAuthorizationByRtrResponse;
        this.isSmartCard = z2;
        this.isCheckSimStock = z3;
        this.successType = i2;
        this.checkSimStockError = errorCollection;
        this.cutSimStockError = errorCollection2;
        this.isReadCardInAddress = z4;
        this.featureCode = str12;
        this.lastOptionalImageName = i3;
        this.mrtrPrepaidValidateIdCardResponse = mrtrPrepaidValidateIdCardResponse;
        this.subscriberList = list;
        this.requestValidateIdCard = mrtrPrepaidValidateIdCardRequest;
        this.consentXSimResponse = xSIMConsentResponse;
        this.multiSimSubmitResultList = list2;
        this.multiSimSubmitResultListForPrintReceipt = list3;
        this.nontelcoConsentType = nontelcoConsentType;
        this.isActivateStatus = bool;
        this.faceCompareResult = faceCompareResult;
        this.currentFormType = currentFormType;
        this.idDocumentResultForOcr = idDocumentResult;
        this.idDocumentResultForCompare = idDocumentResult2;
    }

    public /* synthetic */ MrtrPrepaidMultiSim(PrepaidConfig prepaidConfig, String str, String str2, IdCardInformationCollection idCardInformationCollection, IdCardInformationCollection idCardInformationCollection2, CardCollection cardCollection, String str3, CardInformationCollection cardInformationCollection, String str4, String str5, String str6, String str7, String str8, FaceRecResponse faceRecResponse, FaceCompareResponse faceCompareResponse, PaymentReceiptData paymentReceiptData, AddressPaymentReceipt addressPaymentReceipt, AddressMailingData addressMailingData, ConsentNonTelcoResponse consentNonTelcoResponse, int i, List list, List list2, String str9, boolean z, String str10, String str11, GetAuthorizationByRtrResponse getAuthorizationByRtrResponse, boolean z2, boolean z3, int i2, ErrorCollection errorCollection, ErrorCollection errorCollection2, boolean z4, String str12, int i3, MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse, List list3, MrtrPrepaidValidateIdCardRequest mrtrPrepaidValidateIdCardRequest, XSIMConsentResponse xSIMConsentResponse, List list4, List list5, String str13, Boolean bool, FaceCompareResult faceCompareResult, UpPassFormType upPassFormType, IdDocumentResult idDocumentResult, IdDocumentResult idDocumentResult2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : prepaidConfig, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : idCardInformationCollection, (i4 & 16) != 0 ? null : idCardInformationCollection2, (i4 & 32) != 0 ? null : cardCollection, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : cardInformationCollection, (i4 & 256) != 0 ? null : str4, (i4 & 512) != 0 ? null : str5, (i4 & 1024) != 0 ? null : str6, (i4 & 2048) != 0 ? null : str7, (i4 & 4096) != 0 ? null : str8, (i4 & 8192) != 0 ? null : faceRecResponse, (i4 & 16384) != 0 ? null : faceCompareResponse, (i4 & 32768) != 0 ? null : paymentReceiptData, (i4 & 65536) != 0 ? null : addressPaymentReceipt, (i4 & 131072) != 0 ? null : addressMailingData, (i4 & 262144) != 0 ? null : consentNonTelcoResponse, (i4 & 524288) != 0 ? 0 : i, (i4 & 1048576) != 0 ? new ArrayList() : list, (i4 & 2097152) != 0 ? new ArrayList() : list2, (i4 & 4194304) != 0 ? null : str9, (i4 & 8388608) != 0 ? false : z, (i4 & 16777216) != 0 ? null : str10, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str11, (i4 & 67108864) != 0 ? null : getAuthorizationByRtrResponse, (i4 & 134217728) != 0 ? true : z2, (i4 & 268435456) != 0 ? true : z3, (i4 & PKIFailureInfo.duplicateCertReq) != 0 ? 0 : i2, (i4 & 1073741824) != 0 ? null : errorCollection, (i4 & Integer.MIN_VALUE) != 0 ? null : errorCollection2, (i5 & 1) == 0 ? z4 : false, (i5 & 2) != 0 ? null : str12, (i5 & 4) == 0 ? i3 : 1, (i5 & 8) != 0 ? null : mrtrPrepaidValidateIdCardResponse, (i5 & 16) != 0 ? new ArrayList() : list3, (i5 & 32) != 0 ? null : mrtrPrepaidValidateIdCardRequest, (i5 & 64) != 0 ? null : xSIMConsentResponse, (i5 & 128) != 0 ? new ArrayList() : list4, (i5 & 256) != 0 ? new ArrayList() : list5, (i5 & 512) != 0 ? "" : str13, (i5 & 1024) != 0 ? Boolean.TRUE : bool, (i5 & 2048) != 0 ? null : faceCompareResult, (i5 & 4096) != 0 ? new UpPassFormType.Ocr(null, null, false, null, 15, null) : upPassFormType, (i5 & 8192) != 0 ? null : idDocumentResult, (i5 & 16384) != 0 ? null : idDocumentResult2);
    }
}