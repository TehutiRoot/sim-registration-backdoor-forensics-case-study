package th.p047co.dtac.android.dtacone.model.appOne.pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSet;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneVerifyAndGenAutoApproveCodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostSubscribeNumberDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidatePre2PostTrueCompanyDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidatePrivilegeDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostVerifySubscriberPreToPostData;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.LegalAddress;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.p052enum.DeviceSaleCampaignType;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0085\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0016\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010/\u001a\u00020\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u00020\u0016\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010<\u001a\u00020\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0016\u0012\b\b\u0002\u0010>\u001a\u00020\u0016\u0012\b\b\u0002\u0010?\u001a\u00020\u0003\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\u0016\b\u0002\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010H\u0012\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010H\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010K\u001a\u00020\u0016\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010Q\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S\u0012\b\b\u0002\u0010T\u001a\u00020\u0003\u0012\b\b\u0002\u0010U\u001a\u00020\u0003\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010]\u001a\u00020\u0003\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010_J\n\u0010\u0096\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010uJ\u0010\u0010\u009c\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0016HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0016HÆ\u0003J\n\u0010 \u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0002\u001a\u00020\u0012HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¥\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0002\u001a\u00020\u0016HÆ\u0003J\n\u0010ª\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010&HÆ\u0003J\n\u0010¬\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010(HÆ\u0003J\n\u0010®\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010.HÆ\u0003J\n\u0010²\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010µ\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u000107HÆ\u0003J\n\u0010·\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0002\u001a\u00020\u0016HÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010»\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0002\u001a\u00020\u0016HÆ\u0003J\n\u0010½\u0002\u001a\u00020\u0016HÆ\u0003J\n\u0010¾\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010¿\u0002\u001a\u0004\u0018\u00010AHÆ\u0003J\f\u0010À\u0002\u001a\u0004\u0018\u00010CHÆ\u0003J\f\u0010Á\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Â\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010FHÆ\u0003J\u0018\u0010Ä\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010HHÆ\u0003J\u0018\u0010Å\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010HHÆ\u0003J\f\u0010Æ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ç\u0002\u001a\u00020\u0016HÆ\u0003J\f\u0010È\u0002\u001a\u0004\u0018\u00010MHÆ\u0003J\f\u0010É\u0002\u001a\u0004\u0018\u00010OHÆ\u0003J\u0012\u0010Ê\u0002\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010QHÆ\u0003J\f\u0010Ë\u0002\u001a\u0004\u0018\u00010SHÆ\u0003J\n\u0010Ì\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010Ï\u0002\u001a\u0004\u0018\u00010WHÆ\u0003J\f\u0010Ð\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0002\u001a\u0004\u0018\u00010ZHÆ\u0003J\u0011\u0010Ò\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010uJ\f\u0010Ó\u0002\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010Ô\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010Õ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ö\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ø\u0002\u001a\u00020\u0003HÆ\u0003J\u0098\u0006\u0010Ù\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u00020\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u00020\u00162\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00162\b\b\u0002\u0010>\u001a\u00020\u00162\b\b\u0002\u0010?\u001a\u00020\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u0016\b\u0002\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010H2\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010H2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010K\u001a\u00020\u00162\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\b\b\u0002\u0010T\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010]\u001a\u00020\u00032\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Ú\u0002J\u0015\u0010Û\u0002\u001a\u00020\u00162\t\u0010Ü\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ý\u0002\u001a\u00020\u0012HÖ\u0001J\n\u0010Þ\u0002\u001a\u00020\u0003HÖ\u0001R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010]\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001c\u0010^\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010m\"\u0004\bq\u0010oR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\u001e\u0010[\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010x\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR(\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010z\"\u0004\b~\u0010|R\u001b\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010m\"\u0005\b\u0080\u0001\u0010oR\u001c\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010m\"\u0005\b\u0082\u0001\u0010oR\u001c\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010m\"\u0005\b\u0084\u0001\u0010oR \u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010m\"\u0005\b\u008a\u0001\u0010oR \u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010m\"\u0005\b\u0090\u0001\u0010oR\u001c\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010m\"\u0005\b\u0092\u0001\u0010oR\u001c\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010m\"\u0005\b\u0094\u0001\u0010oR \u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R \u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010m\"\u0005\b\u009e\u0001\u0010oR \u0010\\\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010;\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010m\"\u0005\b¤\u0001\u0010oR \u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010m\"\u0005\bª\u0001\u0010oR\u001c\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010m\"\u0005\b¬\u0001\u0010oR\u001c\u0010T\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010m\"\u0005\b®\u0001\u0010oR\u001c\u0010?\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010m\"\u0005\b°\u0001\u0010oR\u001d\u0010\u0019\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0019\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u001d\u0010#\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b#\u0010±\u0001\"\u0006\b´\u0001\u0010³\u0001R\u001d\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0015\u0010±\u0001\"\u0006\bµ\u0001\u0010³\u0001R\u001d\u0010K\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bK\u0010±\u0001\"\u0006\b¶\u0001\u0010³\u0001R\u001d\u0010>\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b>\u0010±\u0001\"\u0006\b·\u0001\u0010³\u0001R\u001c\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010m\"\u0005\b¹\u0001\u0010oR \u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010m\"\u0005\b¿\u0001\u0010oR \u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÀ\u0001\u0010 \u0001\"\u0006\bÁ\u0001\u0010¢\u0001R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010m\"\u0005\bÃ\u0001\u0010oR\u001e\u0010D\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010m\"\u0005\bÅ\u0001\u0010oR\u001c\u0010/\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010m\"\u0005\bÇ\u0001\u0010oR\u001c\u0010<\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010m\"\u0005\bÉ\u0001\u0010oR\u001c\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010m\"\u0005\bË\u0001\u0010oR \u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R \u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010m\"\u0005\bÕ\u0001\u0010oR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010m\"\u0005\b×\u0001\u0010oR \u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0012\n\u0002\u0010x\u001a\u0005\bØ\u0001\u0010u\"\u0005\bÙ\u0001\u0010wR&\u0010P\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010QX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R \u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R \u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R \u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R \u0010,\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bê\u0001\u0010»\u0001\"\u0006\bë\u0001\u0010½\u0001R \u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bð\u0001\u0010Û\u0001\"\u0006\bñ\u0001\u0010Ý\u0001R\u001e\u0010X\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0001\u0010m\"\u0005\bó\u0001\u0010oR\u001e\u00108\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bô\u0001\u0010±\u0001\"\u0006\bõ\u0001\u0010³\u0001R\u001c\u0010U\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bö\u0001\u0010m\"\u0005\b÷\u0001\u0010oR\u001c\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0001\u0010m\"\u0005\bù\u0001\u0010oR\u001c\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010m\"\u0005\bû\u0001\u0010oR\u001e\u0010J\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bü\u0001\u0010m\"\u0005\bý\u0001\u0010oR \u0010R\u001a\u0004\u0018\u00010SX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R \u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R \u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R\u001e\u0010\u001b\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R \u0010Y\u001a\u0004\u0018\u00010ZX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001c\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0002\u0010m\"\u0005\b\u0093\u0002\u0010oR\u001e\u0010=\u001a\u00020\u0016X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0002\u0010±\u0001\"\u0006\b\u0095\u0002\u0010³\u0001¨\u0006ß\u0002"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostModel;", "", "companyCode", "", "customerNumber", "hardwareNumber", "existingHardwareNumber", "existingBrand", "existingModel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "packageGroupType", "idNumber", "idCardType", "idCardInformationCollection", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "postCodeFromSmartCard", "postcode", "postcodeSequence", "", "referenceDocListFileName", "", "isSmartCard", "", "faceRecResponse", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "isFaceRecog", "verifyType", "verifyAttempt", "newIMEIResponse", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "nontelcoConsentType", "consentVersionLabel", "mrtrConsentId", "consentType", "consentVersion", "isShowConsent", "simCardNumber", "addressMailingData", "Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "addressLegalData", "Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;", "legalAddressPostCode", "mPackage", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "recommendPackage", "packageSetRetailer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "otpCode", "getPre2PostProfile", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;", "recommendedPackageResponse", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "contractFlowID", "Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;", "authorizationData", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "requireFaceRecognition", "enquiryPackage", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$EnquiryData;", "href", "packageGroupRefNo", "withDevice", "isWithContract", "invoiceAlertMethod", "propositionTrueItem", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "packageTrueItem", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "ocrBirthDate", "verifyAndGenAutoApproveCodeResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;", "consentNonTelcoAcceptValue", "Lkotlin/Pair;", "consentTmnAcceptValue", "transactionId", "isWithCampaign", "pricePlansResponse", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlanData;", "pricePlansDetailStatusResponse", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;", "pricePlansDetailListResponse", "", "validatePre2PostResponse", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;", "imieResult", "simBarcodeResult", "validatePrivilege", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeDataResponse;", "reportId", "verifySubscriberPreToPostData", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;", "consentId", "hardwareNumberResponse", "blacklistSharingStatus", "canBuyDeviceWithContract", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;ZLjava/lang/String;ILth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;ZLth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$EnquiryData;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlanData;Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeDataResponse;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLegalData", "()Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;", "setAddressLegalData", "(Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;)V", "getAddressMailingData", "()Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "setAddressMailingData", "(Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;)V", "getAuthorizationData", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;", "setAuthorizationData", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;)V", "getBlacklistSharingStatus", "()Ljava/lang/String;", "setBlacklistSharingStatus", "(Ljava/lang/String;)V", "getCanBuyDeviceWithContract", "setCanBuyDeviceWithContract", "getCompanyCode", "setCompanyCode", "getConsentId", "()Ljava/lang/Integer;", "setConsentId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConsentNonTelcoAcceptValue", "()Lkotlin/Pair;", "setConsentNonTelcoAcceptValue", "(Lkotlin/Pair;)V", "getConsentTmnAcceptValue", "setConsentTmnAcceptValue", "getConsentType", "setConsentType", "getConsentVersion", "setConsentVersion", "getConsentVersionLabel", "setConsentVersionLabel", "getContractFlowID", "()Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;", "setContractFlowID", "(Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;)V", "getCustomerNumber", "setCustomerNumber", "getEnquiryPackage", "()Lth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$EnquiryData;", "setEnquiryPackage", "(Lth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$EnquiryData;)V", "getExistingBrand", "setExistingBrand", "getExistingHardwareNumber", "setExistingHardwareNumber", "getExistingModel", "setExistingModel", "getFaceRecResponse", "()Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;", "setFaceRecResponse", "(Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;)V", "getGetPre2PostProfile", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;", "setGetPre2PostProfile", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;)V", "getHardwareNumber", "setHardwareNumber", "getHardwareNumberResponse", "()Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "setHardwareNumberResponse", "(Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;)V", "getHref", "setHref", "getIdCardInformationCollection", "()Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "setIdCardInformationCollection", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "getIdCardType", "setIdCardType", "getIdNumber", "setIdNumber", "getImieResult", "setImieResult", "getInvoiceAlertMethod", "setInvoiceAlertMethod", "()Z", "setFaceRecog", "(Z)V", "setShowConsent", "setSmartCard", "setWithCampaign", "setWithContract", "getLegalAddressPostCode", "setLegalAddressPostCode", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "getMrtrConsentId", "setMrtrConsentId", "getNewIMEIResponse", "setNewIMEIResponse", "getNontelcoConsentType", "setNontelcoConsentType", "getOcrBirthDate", "setOcrBirthDate", "getOtpCode", "setOtpCode", "getPackageGroupRefNo", "setPackageGroupRefNo", "getPackageGroupType", "setPackageGroupType", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "setPackageSetRetailer", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;)V", "getPackageTrueItem", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "setPackageTrueItem", "(Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;)V", "getPostCodeFromSmartCard", "setPostCodeFromSmartCard", "getPostcode", "setPostcode", "getPostcodeSequence", "setPostcodeSequence", "getPricePlansDetailListResponse", "()Ljava/util/List;", "setPricePlansDetailListResponse", "(Ljava/util/List;)V", "getPricePlansDetailStatusResponse", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;", "setPricePlansDetailStatusResponse", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;)V", "getPricePlansResponse", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlanData;", "setPricePlansResponse", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlanData;)V", "getPropositionTrueItem", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "setPropositionTrueItem", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;)V", "getRecommendPackage", "setRecommendPackage", "getRecommendedPackageResponse", "()Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "setRecommendedPackageResponse", "(Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;)V", "getReferenceDocListFileName", "setReferenceDocListFileName", "getReportId", "setReportId", "getRequireFaceRecognition", "setRequireFaceRecognition", "getSimBarcodeResult", "setSimBarcodeResult", "getSimCardNumber", "setSimCardNumber", "getSubscriberNumber", "setSubscriberNumber", "getTransactionId", "setTransactionId", "getValidatePre2PostResponse", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;", "setValidatePre2PostResponse", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;)V", "getValidatePrivilege", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeDataResponse;", "setValidatePrivilege", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeDataResponse;)V", "getVerifyAndGenAutoApproveCodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;", "setVerifyAndGenAutoApproveCodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;)V", "getVerifyAttempt", "()I", "setVerifyAttempt", "(I)V", "getVerifySubscriberPreToPostData", "()Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;", "setVerifySubscriberPreToPostData", "(Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;)V", "getVerifyType", "setVerifyType", "getWithDevice", "setWithDevice", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLth/co/dtac/android/dtacone/model/face_recognition/FaceRecResponse;ZLjava/lang/String;ILth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;Lth/co/dtac/android/dtacone/model/device_sale/LegalAddress;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberDataResponse;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;Lth/co/dtac/android/dtacone/util/enum/DeviceSaleCampaignType;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationDataResponse;ZLth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$EnquiryData;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;ZLth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlanData;Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyDataResponse;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeDataResponse;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostData;Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostModel;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostModel */
/* loaded from: classes8.dex */
public final class OnePre2PostModel {
    public static final int $stable = 8;
    @Nullable
    private LegalAddress addressLegalData;
    @Nullable
    private OneAddressMailingData addressMailingData;
    @Nullable
    private OnePre2PostAuthorizationDataResponse authorizationData;
    @NotNull
    private String blacklistSharingStatus;
    @Nullable
    private String canBuyDeviceWithContract;
    @NotNull
    private String companyCode;
    @Nullable
    private Integer consentId;
    @Nullable
    private Pair<String, String> consentNonTelcoAcceptValue;
    @Nullable
    private Pair<String, String> consentTmnAcceptValue;
    @NotNull
    private String consentType;
    @NotNull
    private String consentVersion;
    @NotNull
    private String consentVersionLabel;
    @Nullable
    private DeviceSaleCampaignType contractFlowID;
    @NotNull
    private String customerNumber;
    @Nullable
    private OnePre2PostViewModel.EnquiryData enquiryPackage;
    @NotNull
    private String existingBrand;
    @NotNull
    private String existingHardwareNumber;
    @NotNull
    private String existingModel;
    @Nullable
    private FaceRecResponse faceRecResponse;
    @Nullable
    private OnePre2PostSubscribeNumberDataResponse getPre2PostProfile;
    @NotNull
    private String hardwareNumber;
    @Nullable
    private GetNewIMEIResponse hardwareNumberResponse;
    @Nullable
    private String href;
    @Nullable
    private IdCardInformationCollection idCardInformationCollection;
    @NotNull
    private String idCardType;
    @NotNull
    private String idNumber;
    @NotNull
    private String imieResult;
    @NotNull
    private String invoiceAlertMethod;
    private boolean isFaceRecog;
    private boolean isShowConsent;
    private boolean isSmartCard;
    private boolean isWithCampaign;
    private boolean isWithContract;
    @NotNull
    private String legalAddressPostCode;
    @Nullable
    private Package mPackage;
    @NotNull
    private String mrtrConsentId;
    @Nullable
    private GetNewIMEIResponse newIMEIResponse;
    @Nullable
    private String nontelcoConsentType;
    @Nullable
    private String ocrBirthDate;
    @NotNull
    private String otpCode;
    @NotNull
    private String packageGroupRefNo;
    @NotNull
    private String packageGroupType;
    @Nullable
    private OnePostpaidPackageSet packageSetRetailer;
    @Nullable
    private PriceplanListItem packageTrueItem;
    @Nullable
    private String postCodeFromSmartCard;
    @Nullable
    private String postcode;
    @Nullable
    private Integer postcodeSequence;
    @Nullable
    private List<PriceplanListItem> pricePlansDetailListResponse;
    @Nullable
    private PricePlansStatus pricePlansDetailStatusResponse;
    @Nullable
    private PricePlanData pricePlansResponse;
    @Nullable
    private PropositionListItem propositionTrueItem;
    @Nullable
    private Package recommendPackage;
    @Nullable
    private RecommendPackageResponse recommendedPackageResponse;
    @NotNull
    private List<String> referenceDocListFileName;
    @Nullable
    private String reportId;
    private boolean requireFaceRecognition;
    @NotNull
    private String simBarcodeResult;
    @NotNull
    private String simCardNumber;
    @NotNull
    private String subscriberNumber;
    @Nullable
    private String transactionId;
    @Nullable
    private OnePre2PostValidatePre2PostTrueCompanyDataResponse validatePre2PostResponse;
    @Nullable
    private OnePre2PostValidatePrivilegeDataResponse validatePrivilege;
    @Nullable
    private OneVerifyAndGenAutoApproveCodeResponse verifyAndGenAutoApproveCodeResponse;
    private int verifyAttempt;
    @Nullable
    private OnePre2PostVerifySubscriberPreToPostData verifySubscriberPreToPostData;
    @NotNull
    private String verifyType;
    private boolean withDevice;

    public OnePre2PostModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
    }

    @NotNull
    public final String component1() {
        return this.companyCode;
    }

    @NotNull
    public final String component10() {
        return this.idCardType;
    }

    @Nullable
    public final IdCardInformationCollection component11() {
        return this.idCardInformationCollection;
    }

    @Nullable
    public final String component12() {
        return this.postCodeFromSmartCard;
    }

    @Nullable
    public final String component13() {
        return this.postcode;
    }

    @Nullable
    public final Integer component14() {
        return this.postcodeSequence;
    }

    @NotNull
    public final List<String> component15() {
        return this.referenceDocListFileName;
    }

    public final boolean component16() {
        return this.isSmartCard;
    }

    @Nullable
    public final FaceRecResponse component17() {
        return this.faceRecResponse;
    }

    public final boolean component18() {
        return this.isFaceRecog;
    }

    @NotNull
    public final String component19() {
        return this.verifyType;
    }

    @NotNull
    public final String component2() {
        return this.customerNumber;
    }

    public final int component20() {
        return this.verifyAttempt;
    }

    @Nullable
    public final GetNewIMEIResponse component21() {
        return this.newIMEIResponse;
    }

    @Nullable
    public final String component22() {
        return this.nontelcoConsentType;
    }

    @NotNull
    public final String component23() {
        return this.consentVersionLabel;
    }

    @NotNull
    public final String component24() {
        return this.mrtrConsentId;
    }

    @NotNull
    public final String component25() {
        return this.consentType;
    }

    @NotNull
    public final String component26() {
        return this.consentVersion;
    }

    public final boolean component27() {
        return this.isShowConsent;
    }

    @NotNull
    public final String component28() {
        return this.simCardNumber;
    }

    @Nullable
    public final OneAddressMailingData component29() {
        return this.addressMailingData;
    }

    @NotNull
    public final String component3() {
        return this.hardwareNumber;
    }

    @Nullable
    public final LegalAddress component30() {
        return this.addressLegalData;
    }

    @NotNull
    public final String component31() {
        return this.legalAddressPostCode;
    }

    @Nullable
    public final Package component32() {
        return this.mPackage;
    }

    @Nullable
    public final Package component33() {
        return this.recommendPackage;
    }

    @Nullable
    public final OnePostpaidPackageSet component34() {
        return this.packageSetRetailer;
    }

    @NotNull
    public final String component35() {
        return this.otpCode;
    }

    @Nullable
    public final OnePre2PostSubscribeNumberDataResponse component36() {
        return this.getPre2PostProfile;
    }

    @Nullable
    public final RecommendPackageResponse component37() {
        return this.recommendedPackageResponse;
    }

    @Nullable
    public final DeviceSaleCampaignType component38() {
        return this.contractFlowID;
    }

    @Nullable
    public final OnePre2PostAuthorizationDataResponse component39() {
        return this.authorizationData;
    }

    @NotNull
    public final String component4() {
        return this.existingHardwareNumber;
    }

    public final boolean component40() {
        return this.requireFaceRecognition;
    }

    @Nullable
    public final OnePre2PostViewModel.EnquiryData component41() {
        return this.enquiryPackage;
    }

    @Nullable
    public final String component42() {
        return this.href;
    }

    @NotNull
    public final String component43() {
        return this.packageGroupRefNo;
    }

    public final boolean component44() {
        return this.withDevice;
    }

    public final boolean component45() {
        return this.isWithContract;
    }

    @NotNull
    public final String component46() {
        return this.invoiceAlertMethod;
    }

    @Nullable
    public final PropositionListItem component47() {
        return this.propositionTrueItem;
    }

    @Nullable
    public final PriceplanListItem component48() {
        return this.packageTrueItem;
    }

    @Nullable
    public final String component49() {
        return this.ocrBirthDate;
    }

    @NotNull
    public final String component5() {
        return this.existingBrand;
    }

    @Nullable
    public final OneVerifyAndGenAutoApproveCodeResponse component50() {
        return this.verifyAndGenAutoApproveCodeResponse;
    }

    @Nullable
    public final Pair<String, String> component51() {
        return this.consentNonTelcoAcceptValue;
    }

    @Nullable
    public final Pair<String, String> component52() {
        return this.consentTmnAcceptValue;
    }

    @Nullable
    public final String component53() {
        return this.transactionId;
    }

    public final boolean component54() {
        return this.isWithCampaign;
    }

    @Nullable
    public final PricePlanData component55() {
        return this.pricePlansResponse;
    }

    @Nullable
    public final PricePlansStatus component56() {
        return this.pricePlansDetailStatusResponse;
    }

    @Nullable
    public final List<PriceplanListItem> component57() {
        return this.pricePlansDetailListResponse;
    }

    @Nullable
    public final OnePre2PostValidatePre2PostTrueCompanyDataResponse component58() {
        return this.validatePre2PostResponse;
    }

    @NotNull
    public final String component59() {
        return this.imieResult;
    }

    @NotNull
    public final String component6() {
        return this.existingModel;
    }

    @NotNull
    public final String component60() {
        return this.simBarcodeResult;
    }

    @Nullable
    public final OnePre2PostValidatePrivilegeDataResponse component61() {
        return this.validatePrivilege;
    }

    @Nullable
    public final String component62() {
        return this.reportId;
    }

    @Nullable
    public final OnePre2PostVerifySubscriberPreToPostData component63() {
        return this.verifySubscriberPreToPostData;
    }

    @Nullable
    public final Integer component64() {
        return this.consentId;
    }

    @Nullable
    public final GetNewIMEIResponse component65() {
        return this.hardwareNumberResponse;
    }

    @NotNull
    public final String component66() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final String component67() {
        return this.canBuyDeviceWithContract;
    }

    @NotNull
    public final String component7() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component8() {
        return this.packageGroupType;
    }

    @NotNull
    public final String component9() {
        return this.idNumber;
    }

    @NotNull
    public final OnePre2PostModel copy(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String existingHardwareNumber, @NotNull String existingBrand, @NotNull String existingModel, @NotNull String subscriberNumber, @NotNull String packageGroupType, @NotNull String idNumber, @NotNull String idCardType, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull List<String> referenceDocListFileName, boolean z, @Nullable FaceRecResponse faceRecResponse, boolean z2, @NotNull String verifyType, int i, @Nullable GetNewIMEIResponse getNewIMEIResponse, @Nullable String str3, @NotNull String consentVersionLabel, @NotNull String mrtrConsentId, @NotNull String consentType, @NotNull String consentVersion, boolean z3, @NotNull String simCardNumber, @Nullable OneAddressMailingData oneAddressMailingData, @Nullable LegalAddress legalAddress, @NotNull String legalAddressPostCode, @Nullable Package r102, @Nullable Package r103, @Nullable OnePostpaidPackageSet onePostpaidPackageSet, @NotNull String otpCode, @Nullable OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse, @Nullable RecommendPackageResponse recommendPackageResponse, @Nullable DeviceSaleCampaignType deviceSaleCampaignType, @Nullable OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse, boolean z4, @Nullable OnePre2PostViewModel.EnquiryData enquiryData, @Nullable String str4, @NotNull String packageGroupRefNo, boolean z5, boolean z6, @NotNull String invoiceAlertMethod, @Nullable PropositionListItem propositionListItem, @Nullable PriceplanListItem priceplanListItem, @Nullable String str5, @Nullable OneVerifyAndGenAutoApproveCodeResponse oneVerifyAndGenAutoApproveCodeResponse, @Nullable Pair<String, String> pair, @Nullable Pair<String, String> pair2, @Nullable String str6, boolean z7, @Nullable PricePlanData pricePlanData, @Nullable PricePlansStatus pricePlansStatus, @Nullable List<PriceplanListItem> list, @Nullable OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse, @NotNull String imieResult, @NotNull String simBarcodeResult, @Nullable OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse, @Nullable String str7, @Nullable OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData, @Nullable Integer num2, @Nullable GetNewIMEIResponse getNewIMEIResponse2, @NotNull String blacklistSharingStatus, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(existingHardwareNumber, "existingHardwareNumber");
        Intrinsics.checkNotNullParameter(existingBrand, "existingBrand");
        Intrinsics.checkNotNullParameter(existingModel, "existingModel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(consentVersionLabel, "consentVersionLabel");
        Intrinsics.checkNotNullParameter(mrtrConsentId, "mrtrConsentId");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(legalAddressPostCode, "legalAddressPostCode");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(imieResult, "imieResult");
        Intrinsics.checkNotNullParameter(simBarcodeResult, "simBarcodeResult");
        Intrinsics.checkNotNullParameter(blacklistSharingStatus, "blacklistSharingStatus");
        return new OnePre2PostModel(companyCode, customerNumber, hardwareNumber, existingHardwareNumber, existingBrand, existingModel, subscriberNumber, packageGroupType, idNumber, idCardType, idCardInformationCollection, str, str2, num, referenceDocListFileName, z, faceRecResponse, z2, verifyType, i, getNewIMEIResponse, str3, consentVersionLabel, mrtrConsentId, consentType, consentVersion, z3, simCardNumber, oneAddressMailingData, legalAddress, legalAddressPostCode, r102, r103, onePostpaidPackageSet, otpCode, onePre2PostSubscribeNumberDataResponse, recommendPackageResponse, deviceSaleCampaignType, onePre2PostAuthorizationDataResponse, z4, enquiryData, str4, packageGroupRefNo, z5, z6, invoiceAlertMethod, propositionListItem, priceplanListItem, str5, oneVerifyAndGenAutoApproveCodeResponse, pair, pair2, str6, z7, pricePlanData, pricePlansStatus, list, onePre2PostValidatePre2PostTrueCompanyDataResponse, imieResult, simBarcodeResult, onePre2PostValidatePrivilegeDataResponse, str7, onePre2PostVerifySubscriberPreToPostData, num2, getNewIMEIResponse2, blacklistSharingStatus, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostModel) {
            OnePre2PostModel onePre2PostModel = (OnePre2PostModel) obj;
            return Intrinsics.areEqual(this.companyCode, onePre2PostModel.companyCode) && Intrinsics.areEqual(this.customerNumber, onePre2PostModel.customerNumber) && Intrinsics.areEqual(this.hardwareNumber, onePre2PostModel.hardwareNumber) && Intrinsics.areEqual(this.existingHardwareNumber, onePre2PostModel.existingHardwareNumber) && Intrinsics.areEqual(this.existingBrand, onePre2PostModel.existingBrand) && Intrinsics.areEqual(this.existingModel, onePre2PostModel.existingModel) && Intrinsics.areEqual(this.subscriberNumber, onePre2PostModel.subscriberNumber) && Intrinsics.areEqual(this.packageGroupType, onePre2PostModel.packageGroupType) && Intrinsics.areEqual(this.idNumber, onePre2PostModel.idNumber) && Intrinsics.areEqual(this.idCardType, onePre2PostModel.idCardType) && Intrinsics.areEqual(this.idCardInformationCollection, onePre2PostModel.idCardInformationCollection) && Intrinsics.areEqual(this.postCodeFromSmartCard, onePre2PostModel.postCodeFromSmartCard) && Intrinsics.areEqual(this.postcode, onePre2PostModel.postcode) && Intrinsics.areEqual(this.postcodeSequence, onePre2PostModel.postcodeSequence) && Intrinsics.areEqual(this.referenceDocListFileName, onePre2PostModel.referenceDocListFileName) && this.isSmartCard == onePre2PostModel.isSmartCard && Intrinsics.areEqual(this.faceRecResponse, onePre2PostModel.faceRecResponse) && this.isFaceRecog == onePre2PostModel.isFaceRecog && Intrinsics.areEqual(this.verifyType, onePre2PostModel.verifyType) && this.verifyAttempt == onePre2PostModel.verifyAttempt && Intrinsics.areEqual(this.newIMEIResponse, onePre2PostModel.newIMEIResponse) && Intrinsics.areEqual(this.nontelcoConsentType, onePre2PostModel.nontelcoConsentType) && Intrinsics.areEqual(this.consentVersionLabel, onePre2PostModel.consentVersionLabel) && Intrinsics.areEqual(this.mrtrConsentId, onePre2PostModel.mrtrConsentId) && Intrinsics.areEqual(this.consentType, onePre2PostModel.consentType) && Intrinsics.areEqual(this.consentVersion, onePre2PostModel.consentVersion) && this.isShowConsent == onePre2PostModel.isShowConsent && Intrinsics.areEqual(this.simCardNumber, onePre2PostModel.simCardNumber) && Intrinsics.areEqual(this.addressMailingData, onePre2PostModel.addressMailingData) && Intrinsics.areEqual(this.addressLegalData, onePre2PostModel.addressLegalData) && Intrinsics.areEqual(this.legalAddressPostCode, onePre2PostModel.legalAddressPostCode) && Intrinsics.areEqual(this.mPackage, onePre2PostModel.mPackage) && Intrinsics.areEqual(this.recommendPackage, onePre2PostModel.recommendPackage) && Intrinsics.areEqual(this.packageSetRetailer, onePre2PostModel.packageSetRetailer) && Intrinsics.areEqual(this.otpCode, onePre2PostModel.otpCode) && Intrinsics.areEqual(this.getPre2PostProfile, onePre2PostModel.getPre2PostProfile) && Intrinsics.areEqual(this.recommendedPackageResponse, onePre2PostModel.recommendedPackageResponse) && this.contractFlowID == onePre2PostModel.contractFlowID && Intrinsics.areEqual(this.authorizationData, onePre2PostModel.authorizationData) && this.requireFaceRecognition == onePre2PostModel.requireFaceRecognition && Intrinsics.areEqual(this.enquiryPackage, onePre2PostModel.enquiryPackage) && Intrinsics.areEqual(this.href, onePre2PostModel.href) && Intrinsics.areEqual(this.packageGroupRefNo, onePre2PostModel.packageGroupRefNo) && this.withDevice == onePre2PostModel.withDevice && this.isWithContract == onePre2PostModel.isWithContract && Intrinsics.areEqual(this.invoiceAlertMethod, onePre2PostModel.invoiceAlertMethod) && Intrinsics.areEqual(this.propositionTrueItem, onePre2PostModel.propositionTrueItem) && Intrinsics.areEqual(this.packageTrueItem, onePre2PostModel.packageTrueItem) && Intrinsics.areEqual(this.ocrBirthDate, onePre2PostModel.ocrBirthDate) && Intrinsics.areEqual(this.verifyAndGenAutoApproveCodeResponse, onePre2PostModel.verifyAndGenAutoApproveCodeResponse) && Intrinsics.areEqual(this.consentNonTelcoAcceptValue, onePre2PostModel.consentNonTelcoAcceptValue) && Intrinsics.areEqual(this.consentTmnAcceptValue, onePre2PostModel.consentTmnAcceptValue) && Intrinsics.areEqual(this.transactionId, onePre2PostModel.transactionId) && this.isWithCampaign == onePre2PostModel.isWithCampaign && Intrinsics.areEqual(this.pricePlansResponse, onePre2PostModel.pricePlansResponse) && Intrinsics.areEqual(this.pricePlansDetailStatusResponse, onePre2PostModel.pricePlansDetailStatusResponse) && Intrinsics.areEqual(this.pricePlansDetailListResponse, onePre2PostModel.pricePlansDetailListResponse) && Intrinsics.areEqual(this.validatePre2PostResponse, onePre2PostModel.validatePre2PostResponse) && Intrinsics.areEqual(this.imieResult, onePre2PostModel.imieResult) && Intrinsics.areEqual(this.simBarcodeResult, onePre2PostModel.simBarcodeResult) && Intrinsics.areEqual(this.validatePrivilege, onePre2PostModel.validatePrivilege) && Intrinsics.areEqual(this.reportId, onePre2PostModel.reportId) && Intrinsics.areEqual(this.verifySubscriberPreToPostData, onePre2PostModel.verifySubscriberPreToPostData) && Intrinsics.areEqual(this.consentId, onePre2PostModel.consentId) && Intrinsics.areEqual(this.hardwareNumberResponse, onePre2PostModel.hardwareNumberResponse) && Intrinsics.areEqual(this.blacklistSharingStatus, onePre2PostModel.blacklistSharingStatus) && Intrinsics.areEqual(this.canBuyDeviceWithContract, onePre2PostModel.canBuyDeviceWithContract);
        }
        return false;
    }

    @Nullable
    public final LegalAddress getAddressLegalData() {
        return this.addressLegalData;
    }

    @Nullable
    public final OneAddressMailingData getAddressMailingData() {
        return this.addressMailingData;
    }

    @Nullable
    public final OnePre2PostAuthorizationDataResponse getAuthorizationData() {
        return this.authorizationData;
    }

    @NotNull
    public final String getBlacklistSharingStatus() {
        return this.blacklistSharingStatus;
    }

    @Nullable
    public final String getCanBuyDeviceWithContract() {
        return this.canBuyDeviceWithContract;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final Integer getConsentId() {
        return this.consentId;
    }

    @Nullable
    public final Pair<String, String> getConsentNonTelcoAcceptValue() {
        return this.consentNonTelcoAcceptValue;
    }

    @Nullable
    public final Pair<String, String> getConsentTmnAcceptValue() {
        return this.consentTmnAcceptValue;
    }

    @NotNull
    public final String getConsentType() {
        return this.consentType;
    }

    @NotNull
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    @NotNull
    public final String getConsentVersionLabel() {
        return this.consentVersionLabel;
    }

    @Nullable
    public final DeviceSaleCampaignType getContractFlowID() {
        return this.contractFlowID;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final OnePre2PostViewModel.EnquiryData getEnquiryPackage() {
        return this.enquiryPackage;
    }

    @NotNull
    public final String getExistingBrand() {
        return this.existingBrand;
    }

    @NotNull
    public final String getExistingHardwareNumber() {
        return this.existingHardwareNumber;
    }

    @NotNull
    public final String getExistingModel() {
        return this.existingModel;
    }

    @Nullable
    public final FaceRecResponse getFaceRecResponse() {
        return this.faceRecResponse;
    }

    @Nullable
    public final OnePre2PostSubscribeNumberDataResponse getGetPre2PostProfile() {
        return this.getPre2PostProfile;
    }

    @NotNull
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @Nullable
    public final GetNewIMEIResponse getHardwareNumberResponse() {
        return this.hardwareNumberResponse;
    }

    @Nullable
    public final String getHref() {
        return this.href;
    }

    @Nullable
    public final IdCardInformationCollection getIdCardInformationCollection() {
        return this.idCardInformationCollection;
    }

    @NotNull
    public final String getIdCardType() {
        return this.idCardType;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getImieResult() {
        return this.imieResult;
    }

    @NotNull
    public final String getInvoiceAlertMethod() {
        return this.invoiceAlertMethod;
    }

    @NotNull
    public final String getLegalAddressPostCode() {
        return this.legalAddressPostCode;
    }

    @Nullable
    public final Package getMPackage() {
        return this.mPackage;
    }

    @NotNull
    public final String getMrtrConsentId() {
        return this.mrtrConsentId;
    }

    @Nullable
    public final GetNewIMEIResponse getNewIMEIResponse() {
        return this.newIMEIResponse;
    }

    @Nullable
    public final String getNontelcoConsentType() {
        return this.nontelcoConsentType;
    }

    @Nullable
    public final String getOcrBirthDate() {
        return this.ocrBirthDate;
    }

    @NotNull
    public final String getOtpCode() {
        return this.otpCode;
    }

    @NotNull
    public final String getPackageGroupRefNo() {
        return this.packageGroupRefNo;
    }

    @NotNull
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @Nullable
    public final OnePostpaidPackageSet getPackageSetRetailer() {
        return this.packageSetRetailer;
    }

    @Nullable
    public final PriceplanListItem getPackageTrueItem() {
        return this.packageTrueItem;
    }

    @Nullable
    public final String getPostCodeFromSmartCard() {
        return this.postCodeFromSmartCard;
    }

    @Nullable
    public final String getPostcode() {
        return this.postcode;
    }

    @Nullable
    public final Integer getPostcodeSequence() {
        return this.postcodeSequence;
    }

    @Nullable
    public final List<PriceplanListItem> getPricePlansDetailListResponse() {
        return this.pricePlansDetailListResponse;
    }

    @Nullable
    public final PricePlansStatus getPricePlansDetailStatusResponse() {
        return this.pricePlansDetailStatusResponse;
    }

    @Nullable
    public final PricePlanData getPricePlansResponse() {
        return this.pricePlansResponse;
    }

    @Nullable
    public final PropositionListItem getPropositionTrueItem() {
        return this.propositionTrueItem;
    }

    @Nullable
    public final Package getRecommendPackage() {
        return this.recommendPackage;
    }

    @Nullable
    public final RecommendPackageResponse getRecommendedPackageResponse() {
        return this.recommendedPackageResponse;
    }

    @NotNull
    public final List<String> getReferenceDocListFileName() {
        return this.referenceDocListFileName;
    }

    @Nullable
    public final String getReportId() {
        return this.reportId;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    @NotNull
    public final String getSimBarcodeResult() {
        return this.simBarcodeResult;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    public final OnePre2PostValidatePre2PostTrueCompanyDataResponse getValidatePre2PostResponse() {
        return this.validatePre2PostResponse;
    }

    @Nullable
    public final OnePre2PostValidatePrivilegeDataResponse getValidatePrivilege() {
        return this.validatePrivilege;
    }

    @Nullable
    public final OneVerifyAndGenAutoApproveCodeResponse getVerifyAndGenAutoApproveCodeResponse() {
        return this.verifyAndGenAutoApproveCodeResponse;
    }

    public final int getVerifyAttempt() {
        return this.verifyAttempt;
    }

    @Nullable
    public final OnePre2PostVerifySubscriberPreToPostData getVerifySubscriberPreToPostData() {
        return this.verifySubscriberPreToPostData;
    }

    @NotNull
    public final String getVerifyType() {
        return this.verifyType;
    }

    public final boolean getWithDevice() {
        return this.withDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((this.companyCode.hashCode() * 31) + this.customerNumber.hashCode()) * 31) + this.hardwareNumber.hashCode()) * 31) + this.existingHardwareNumber.hashCode()) * 31) + this.existingBrand.hashCode()) * 31) + this.existingModel.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.packageGroupType.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.idCardType.hashCode()) * 31;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformationCollection;
        int hashCode2 = (hashCode + (idCardInformationCollection == null ? 0 : idCardInformationCollection.hashCode())) * 31;
        String str = this.postCodeFromSmartCard;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postcode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.postcodeSequence;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.referenceDocListFileName.hashCode()) * 31;
        boolean z = this.isSmartCard;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        int hashCode6 = (i2 + (faceRecResponse == null ? 0 : faceRecResponse.hashCode())) * 31;
        boolean z2 = this.isFaceRecog;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode7 = (((((hashCode6 + i3) * 31) + this.verifyType.hashCode()) * 31) + this.verifyAttempt) * 31;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        int hashCode8 = (hashCode7 + (getNewIMEIResponse == null ? 0 : getNewIMEIResponse.hashCode())) * 31;
        String str3 = this.nontelcoConsentType;
        int hashCode9 = (((((((((hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.consentVersionLabel.hashCode()) * 31) + this.mrtrConsentId.hashCode()) * 31) + this.consentType.hashCode()) * 31) + this.consentVersion.hashCode()) * 31;
        boolean z3 = this.isShowConsent;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int hashCode10 = (((hashCode9 + i4) * 31) + this.simCardNumber.hashCode()) * 31;
        OneAddressMailingData oneAddressMailingData = this.addressMailingData;
        int hashCode11 = (hashCode10 + (oneAddressMailingData == null ? 0 : oneAddressMailingData.hashCode())) * 31;
        LegalAddress legalAddress = this.addressLegalData;
        int hashCode12 = (((hashCode11 + (legalAddress == null ? 0 : legalAddress.hashCode())) * 31) + this.legalAddressPostCode.hashCode()) * 31;
        Package r1 = this.mPackage;
        int hashCode13 = (hashCode12 + (r1 == null ? 0 : r1.hashCode())) * 31;
        Package r12 = this.recommendPackage;
        int hashCode14 = (hashCode13 + (r12 == null ? 0 : r12.hashCode())) * 31;
        OnePostpaidPackageSet onePostpaidPackageSet = this.packageSetRetailer;
        int hashCode15 = (((hashCode14 + (onePostpaidPackageSet == null ? 0 : onePostpaidPackageSet.hashCode())) * 31) + this.otpCode.hashCode()) * 31;
        OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse = this.getPre2PostProfile;
        int hashCode16 = (hashCode15 + (onePre2PostSubscribeNumberDataResponse == null ? 0 : onePre2PostSubscribeNumberDataResponse.hashCode())) * 31;
        RecommendPackageResponse recommendPackageResponse = this.recommendedPackageResponse;
        int hashCode17 = (hashCode16 + (recommendPackageResponse == null ? 0 : recommendPackageResponse.hashCode())) * 31;
        DeviceSaleCampaignType deviceSaleCampaignType = this.contractFlowID;
        int hashCode18 = (hashCode17 + (deviceSaleCampaignType == null ? 0 : deviceSaleCampaignType.hashCode())) * 31;
        OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse = this.authorizationData;
        int hashCode19 = (hashCode18 + (onePre2PostAuthorizationDataResponse == null ? 0 : onePre2PostAuthorizationDataResponse.hashCode())) * 31;
        boolean z4 = this.requireFaceRecognition;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode19 + i5) * 31;
        OnePre2PostViewModel.EnquiryData enquiryData = this.enquiryPackage;
        int hashCode20 = (i6 + (enquiryData == null ? 0 : enquiryData.hashCode())) * 31;
        String str4 = this.href;
        int hashCode21 = (((hashCode20 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.packageGroupRefNo.hashCode()) * 31;
        boolean z5 = this.withDevice;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode21 + i7) * 31;
        boolean z6 = this.isWithContract;
        int i9 = z6;
        if (z6 != 0) {
            i9 = 1;
        }
        int hashCode22 = (((i8 + i9) * 31) + this.invoiceAlertMethod.hashCode()) * 31;
        PropositionListItem propositionListItem = this.propositionTrueItem;
        int hashCode23 = (hashCode22 + (propositionListItem == null ? 0 : propositionListItem.hashCode())) * 31;
        PriceplanListItem priceplanListItem = this.packageTrueItem;
        int hashCode24 = (hashCode23 + (priceplanListItem == null ? 0 : priceplanListItem.hashCode())) * 31;
        String str5 = this.ocrBirthDate;
        int hashCode25 = (hashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
        OneVerifyAndGenAutoApproveCodeResponse oneVerifyAndGenAutoApproveCodeResponse = this.verifyAndGenAutoApproveCodeResponse;
        int hashCode26 = (hashCode25 + (oneVerifyAndGenAutoApproveCodeResponse == null ? 0 : oneVerifyAndGenAutoApproveCodeResponse.hashCode())) * 31;
        Pair<String, String> pair = this.consentNonTelcoAcceptValue;
        int hashCode27 = (hashCode26 + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair<String, String> pair2 = this.consentTmnAcceptValue;
        int hashCode28 = (hashCode27 + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        String str6 = this.transactionId;
        int hashCode29 = (hashCode28 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z7 = this.isWithCampaign;
        int i10 = (hashCode29 + (z7 ? 1 : z7 ? 1 : 0)) * 31;
        PricePlanData pricePlanData = this.pricePlansResponse;
        int hashCode30 = (i10 + (pricePlanData == null ? 0 : pricePlanData.hashCode())) * 31;
        PricePlansStatus pricePlansStatus = this.pricePlansDetailStatusResponse;
        int hashCode31 = (hashCode30 + (pricePlansStatus == null ? 0 : pricePlansStatus.hashCode())) * 31;
        List<PriceplanListItem> list = this.pricePlansDetailListResponse;
        int hashCode32 = (hashCode31 + (list == null ? 0 : list.hashCode())) * 31;
        OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse = this.validatePre2PostResponse;
        int hashCode33 = (((((hashCode32 + (onePre2PostValidatePre2PostTrueCompanyDataResponse == null ? 0 : onePre2PostValidatePre2PostTrueCompanyDataResponse.hashCode())) * 31) + this.imieResult.hashCode()) * 31) + this.simBarcodeResult.hashCode()) * 31;
        OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse = this.validatePrivilege;
        int hashCode34 = (hashCode33 + (onePre2PostValidatePrivilegeDataResponse == null ? 0 : onePre2PostValidatePrivilegeDataResponse.hashCode())) * 31;
        String str7 = this.reportId;
        int hashCode35 = (hashCode34 + (str7 == null ? 0 : str7.hashCode())) * 31;
        OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData = this.verifySubscriberPreToPostData;
        int hashCode36 = (hashCode35 + (onePre2PostVerifySubscriberPreToPostData == null ? 0 : onePre2PostVerifySubscriberPreToPostData.hashCode())) * 31;
        Integer num2 = this.consentId;
        int hashCode37 = (hashCode36 + (num2 == null ? 0 : num2.hashCode())) * 31;
        GetNewIMEIResponse getNewIMEIResponse2 = this.hardwareNumberResponse;
        int hashCode38 = (((hashCode37 + (getNewIMEIResponse2 == null ? 0 : getNewIMEIResponse2.hashCode())) * 31) + this.blacklistSharingStatus.hashCode()) * 31;
        String str8 = this.canBuyDeviceWithContract;
        return hashCode38 + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean isFaceRecog() {
        return this.isFaceRecog;
    }

    public final boolean isShowConsent() {
        return this.isShowConsent;
    }

    public final boolean isSmartCard() {
        return this.isSmartCard;
    }

    public final boolean isWithCampaign() {
        return this.isWithCampaign;
    }

    public final boolean isWithContract() {
        return this.isWithContract;
    }

    public final void setAddressLegalData(@Nullable LegalAddress legalAddress) {
        this.addressLegalData = legalAddress;
    }

    public final void setAddressMailingData(@Nullable OneAddressMailingData oneAddressMailingData) {
        this.addressMailingData = oneAddressMailingData;
    }

    public final void setAuthorizationData(@Nullable OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse) {
        this.authorizationData = onePre2PostAuthorizationDataResponse;
    }

    public final void setBlacklistSharingStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.blacklistSharingStatus = str;
    }

    public final void setCanBuyDeviceWithContract(@Nullable String str) {
        this.canBuyDeviceWithContract = str;
    }

    public final void setCompanyCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyCode = str;
    }

    public final void setConsentId(@Nullable Integer num) {
        this.consentId = num;
    }

    public final void setConsentNonTelcoAcceptValue(@Nullable Pair<String, String> pair) {
        this.consentNonTelcoAcceptValue = pair;
    }

    public final void setConsentTmnAcceptValue(@Nullable Pair<String, String> pair) {
        this.consentTmnAcceptValue = pair;
    }

    public final void setConsentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentType = str;
    }

    public final void setConsentVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersion = str;
    }

    public final void setConsentVersionLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentVersionLabel = str;
    }

    public final void setContractFlowID(@Nullable DeviceSaleCampaignType deviceSaleCampaignType) {
        this.contractFlowID = deviceSaleCampaignType;
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setEnquiryPackage(@Nullable OnePre2PostViewModel.EnquiryData enquiryData) {
        this.enquiryPackage = enquiryData;
    }

    public final void setExistingBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingBrand = str;
    }

    public final void setExistingHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingHardwareNumber = str;
    }

    public final void setExistingModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.existingModel = str;
    }

    public final void setFaceRecResponse(@Nullable FaceRecResponse faceRecResponse) {
        this.faceRecResponse = faceRecResponse;
    }

    public final void setFaceRecog(boolean z) {
        this.isFaceRecog = z;
    }

    public final void setGetPre2PostProfile(@Nullable OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse) {
        this.getPre2PostProfile = onePre2PostSubscribeNumberDataResponse;
    }

    public final void setHardwareNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hardwareNumber = str;
    }

    public final void setHardwareNumberResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.hardwareNumberResponse = getNewIMEIResponse;
    }

    public final void setHref(@Nullable String str) {
        this.href = str;
    }

    public final void setIdCardInformationCollection(@Nullable IdCardInformationCollection idCardInformationCollection) {
        this.idCardInformationCollection = idCardInformationCollection;
    }

    public final void setIdCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idCardType = str;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setImieResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imieResult = str;
    }

    public final void setInvoiceAlertMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invoiceAlertMethod = str;
    }

    public final void setLegalAddressPostCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.legalAddressPostCode = str;
    }

    public final void setMPackage(@Nullable Package r1) {
        this.mPackage = r1;
    }

    public final void setMrtrConsentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mrtrConsentId = str;
    }

    public final void setNewIMEIResponse(@Nullable GetNewIMEIResponse getNewIMEIResponse) {
        this.newIMEIResponse = getNewIMEIResponse;
    }

    public final void setNontelcoConsentType(@Nullable String str) {
        this.nontelcoConsentType = str;
    }

    public final void setOcrBirthDate(@Nullable String str) {
        this.ocrBirthDate = str;
    }

    public final void setOtpCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpCode = str;
    }

    public final void setPackageGroupRefNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupRefNo = str;
    }

    public final void setPackageGroupType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupType = str;
    }

    public final void setPackageSetRetailer(@Nullable OnePostpaidPackageSet onePostpaidPackageSet) {
        this.packageSetRetailer = onePostpaidPackageSet;
    }

    public final void setPackageTrueItem(@Nullable PriceplanListItem priceplanListItem) {
        this.packageTrueItem = priceplanListItem;
    }

    public final void setPostCodeFromSmartCard(@Nullable String str) {
        this.postCodeFromSmartCard = str;
    }

    public final void setPostcode(@Nullable String str) {
        this.postcode = str;
    }

    public final void setPostcodeSequence(@Nullable Integer num) {
        this.postcodeSequence = num;
    }

    public final void setPricePlansDetailListResponse(@Nullable List<PriceplanListItem> list) {
        this.pricePlansDetailListResponse = list;
    }

    public final void setPricePlansDetailStatusResponse(@Nullable PricePlansStatus pricePlansStatus) {
        this.pricePlansDetailStatusResponse = pricePlansStatus;
    }

    public final void setPricePlansResponse(@Nullable PricePlanData pricePlanData) {
        this.pricePlansResponse = pricePlanData;
    }

    public final void setPropositionTrueItem(@Nullable PropositionListItem propositionListItem) {
        this.propositionTrueItem = propositionListItem;
    }

    public final void setRecommendPackage(@Nullable Package r1) {
        this.recommendPackage = r1;
    }

    public final void setRecommendedPackageResponse(@Nullable RecommendPackageResponse recommendPackageResponse) {
        this.recommendedPackageResponse = recommendPackageResponse;
    }

    public final void setReferenceDocListFileName(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.referenceDocListFileName = list;
    }

    public final void setReportId(@Nullable String str) {
        this.reportId = str;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    public final void setShowConsent(boolean z) {
        this.isShowConsent = z;
    }

    public final void setSimBarcodeResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simBarcodeResult = str;
    }

    public final void setSimCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simCardNumber = str;
    }

    public final void setSmartCard(boolean z) {
        this.isSmartCard = z;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setTransactionId(@Nullable String str) {
        this.transactionId = str;
    }

    public final void setValidatePre2PostResponse(@Nullable OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse) {
        this.validatePre2PostResponse = onePre2PostValidatePre2PostTrueCompanyDataResponse;
    }

    public final void setValidatePrivilege(@Nullable OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse) {
        this.validatePrivilege = onePre2PostValidatePrivilegeDataResponse;
    }

    public final void setVerifyAndGenAutoApproveCodeResponse(@Nullable OneVerifyAndGenAutoApproveCodeResponse oneVerifyAndGenAutoApproveCodeResponse) {
        this.verifyAndGenAutoApproveCodeResponse = oneVerifyAndGenAutoApproveCodeResponse;
    }

    public final void setVerifyAttempt(int i) {
        this.verifyAttempt = i;
    }

    public final void setVerifySubscriberPreToPostData(@Nullable OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData) {
        this.verifySubscriberPreToPostData = onePre2PostVerifySubscriberPreToPostData;
    }

    public final void setVerifyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyType = str;
    }

    public final void setWithCampaign(boolean z) {
        this.isWithCampaign = z;
    }

    public final void setWithContract(boolean z) {
        this.isWithContract = z;
    }

    public final void setWithDevice(boolean z) {
        this.withDevice = z;
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.customerNumber;
        String str3 = this.hardwareNumber;
        String str4 = this.existingHardwareNumber;
        String str5 = this.existingBrand;
        String str6 = this.existingModel;
        String str7 = this.subscriberNumber;
        String str8 = this.packageGroupType;
        String str9 = this.idNumber;
        String str10 = this.idCardType;
        IdCardInformationCollection idCardInformationCollection = this.idCardInformationCollection;
        String str11 = this.postCodeFromSmartCard;
        String str12 = this.postcode;
        Integer num = this.postcodeSequence;
        List<String> list = this.referenceDocListFileName;
        boolean z = this.isSmartCard;
        FaceRecResponse faceRecResponse = this.faceRecResponse;
        boolean z2 = this.isFaceRecog;
        String str13 = this.verifyType;
        int i = this.verifyAttempt;
        GetNewIMEIResponse getNewIMEIResponse = this.newIMEIResponse;
        String str14 = this.nontelcoConsentType;
        String str15 = this.consentVersionLabel;
        String str16 = this.mrtrConsentId;
        String str17 = this.consentType;
        String str18 = this.consentVersion;
        boolean z3 = this.isShowConsent;
        String str19 = this.simCardNumber;
        OneAddressMailingData oneAddressMailingData = this.addressMailingData;
        LegalAddress legalAddress = this.addressLegalData;
        String str20 = this.legalAddressPostCode;
        Package r15 = this.mPackage;
        Package r152 = this.recommendPackage;
        OnePostpaidPackageSet onePostpaidPackageSet = this.packageSetRetailer;
        String str21 = this.otpCode;
        OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse = this.getPre2PostProfile;
        RecommendPackageResponse recommendPackageResponse = this.recommendedPackageResponse;
        DeviceSaleCampaignType deviceSaleCampaignType = this.contractFlowID;
        OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse = this.authorizationData;
        boolean z4 = this.requireFaceRecognition;
        OnePre2PostViewModel.EnquiryData enquiryData = this.enquiryPackage;
        String str22 = this.href;
        String str23 = this.packageGroupRefNo;
        boolean z5 = this.withDevice;
        boolean z6 = this.isWithContract;
        String str24 = this.invoiceAlertMethod;
        PropositionListItem propositionListItem = this.propositionTrueItem;
        PriceplanListItem priceplanListItem = this.packageTrueItem;
        String str25 = this.ocrBirthDate;
        OneVerifyAndGenAutoApproveCodeResponse oneVerifyAndGenAutoApproveCodeResponse = this.verifyAndGenAutoApproveCodeResponse;
        Pair<String, String> pair = this.consentNonTelcoAcceptValue;
        Pair<String, String> pair2 = this.consentTmnAcceptValue;
        String str26 = this.transactionId;
        boolean z7 = this.isWithCampaign;
        PricePlanData pricePlanData = this.pricePlansResponse;
        PricePlansStatus pricePlansStatus = this.pricePlansDetailStatusResponse;
        List<PriceplanListItem> list2 = this.pricePlansDetailListResponse;
        OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse = this.validatePre2PostResponse;
        String str27 = this.imieResult;
        String str28 = this.simBarcodeResult;
        OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse = this.validatePrivilege;
        String str29 = this.reportId;
        OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData = this.verifySubscriberPreToPostData;
        Integer num2 = this.consentId;
        GetNewIMEIResponse getNewIMEIResponse2 = this.hardwareNumberResponse;
        String str30 = this.blacklistSharingStatus;
        String str31 = this.canBuyDeviceWithContract;
        return "OnePre2PostModel(companyCode=" + str + ", customerNumber=" + str2 + ", hardwareNumber=" + str3 + ", existingHardwareNumber=" + str4 + ", existingBrand=" + str5 + ", existingModel=" + str6 + ", subscriberNumber=" + str7 + ", packageGroupType=" + str8 + ", idNumber=" + str9 + ", idCardType=" + str10 + ", idCardInformationCollection=" + idCardInformationCollection + ", postCodeFromSmartCard=" + str11 + ", postcode=" + str12 + ", postcodeSequence=" + num + ", referenceDocListFileName=" + list + ", isSmartCard=" + z + ", faceRecResponse=" + faceRecResponse + ", isFaceRecog=" + z2 + ", verifyType=" + str13 + ", verifyAttempt=" + i + ", newIMEIResponse=" + getNewIMEIResponse + ", nontelcoConsentType=" + str14 + ", consentVersionLabel=" + str15 + ", mrtrConsentId=" + str16 + ", consentType=" + str17 + ", consentVersion=" + str18 + ", isShowConsent=" + z3 + ", simCardNumber=" + str19 + ", addressMailingData=" + oneAddressMailingData + ", addressLegalData=" + legalAddress + ", legalAddressPostCode=" + str20 + ", mPackage=" + r15 + ", recommendPackage=" + r152 + ", packageSetRetailer=" + onePostpaidPackageSet + ", otpCode=" + str21 + ", getPre2PostProfile=" + onePre2PostSubscribeNumberDataResponse + ", recommendedPackageResponse=" + recommendPackageResponse + ", contractFlowID=" + deviceSaleCampaignType + ", authorizationData=" + onePre2PostAuthorizationDataResponse + ", requireFaceRecognition=" + z4 + ", enquiryPackage=" + enquiryData + ", href=" + str22 + ", packageGroupRefNo=" + str23 + ", withDevice=" + z5 + ", isWithContract=" + z6 + ", invoiceAlertMethod=" + str24 + ", propositionTrueItem=" + propositionListItem + ", packageTrueItem=" + priceplanListItem + ", ocrBirthDate=" + str25 + ", verifyAndGenAutoApproveCodeResponse=" + oneVerifyAndGenAutoApproveCodeResponse + ", consentNonTelcoAcceptValue=" + pair + ", consentTmnAcceptValue=" + pair2 + ", transactionId=" + str26 + ", isWithCampaign=" + z7 + ", pricePlansResponse=" + pricePlanData + ", pricePlansDetailStatusResponse=" + pricePlansStatus + ", pricePlansDetailListResponse=" + list2 + ", validatePre2PostResponse=" + onePre2PostValidatePre2PostTrueCompanyDataResponse + ", imieResult=" + str27 + ", simBarcodeResult=" + str28 + ", validatePrivilege=" + onePre2PostValidatePrivilegeDataResponse + ", reportId=" + str29 + ", verifySubscriberPreToPostData=" + onePre2PostVerifySubscriberPreToPostData + ", consentId=" + num2 + ", hardwareNumberResponse=" + getNewIMEIResponse2 + ", blacklistSharingStatus=" + str30 + ", canBuyDeviceWithContract=" + str31 + ")";
    }

    public OnePre2PostModel(@NotNull String companyCode, @NotNull String customerNumber, @NotNull String hardwareNumber, @NotNull String existingHardwareNumber, @NotNull String existingBrand, @NotNull String existingModel, @NotNull String subscriberNumber, @NotNull String packageGroupType, @NotNull String idNumber, @NotNull String idCardType, @Nullable IdCardInformationCollection idCardInformationCollection, @Nullable String str, @Nullable String str2, @Nullable Integer num, @NotNull List<String> referenceDocListFileName, boolean z, @Nullable FaceRecResponse faceRecResponse, boolean z2, @NotNull String verifyType, int i, @Nullable GetNewIMEIResponse getNewIMEIResponse, @Nullable String str3, @NotNull String consentVersionLabel, @NotNull String mrtrConsentId, @NotNull String consentType, @NotNull String consentVersion, boolean z3, @NotNull String simCardNumber, @Nullable OneAddressMailingData oneAddressMailingData, @Nullable LegalAddress legalAddress, @NotNull String legalAddressPostCode, @Nullable Package r48, @Nullable Package r49, @Nullable OnePostpaidPackageSet onePostpaidPackageSet, @NotNull String otpCode, @Nullable OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse, @Nullable RecommendPackageResponse recommendPackageResponse, @Nullable DeviceSaleCampaignType deviceSaleCampaignType, @Nullable OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse, boolean z4, @Nullable OnePre2PostViewModel.EnquiryData enquiryData, @Nullable String str4, @NotNull String packageGroupRefNo, boolean z5, boolean z6, @NotNull String invoiceAlertMethod, @Nullable PropositionListItem propositionListItem, @Nullable PriceplanListItem priceplanListItem, @Nullable String str5, @Nullable OneVerifyAndGenAutoApproveCodeResponse oneVerifyAndGenAutoApproveCodeResponse, @Nullable Pair<String, String> pair, @Nullable Pair<String, String> pair2, @Nullable String str6, boolean z7, @Nullable PricePlanData pricePlanData, @Nullable PricePlansStatus pricePlansStatus, @Nullable List<PriceplanListItem> list, @Nullable OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse, @NotNull String imieResult, @NotNull String simBarcodeResult, @Nullable OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse, @Nullable String str7, @Nullable OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData, @Nullable Integer num2, @Nullable GetNewIMEIResponse getNewIMEIResponse2, @NotNull String blacklistSharingStatus, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(hardwareNumber, "hardwareNumber");
        Intrinsics.checkNotNullParameter(existingHardwareNumber, "existingHardwareNumber");
        Intrinsics.checkNotNullParameter(existingBrand, "existingBrand");
        Intrinsics.checkNotNullParameter(existingModel, "existingModel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idCardType, "idCardType");
        Intrinsics.checkNotNullParameter(referenceDocListFileName, "referenceDocListFileName");
        Intrinsics.checkNotNullParameter(verifyType, "verifyType");
        Intrinsics.checkNotNullParameter(consentVersionLabel, "consentVersionLabel");
        Intrinsics.checkNotNullParameter(mrtrConsentId, "mrtrConsentId");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentVersion, "consentVersion");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(legalAddressPostCode, "legalAddressPostCode");
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Intrinsics.checkNotNullParameter(invoiceAlertMethod, "invoiceAlertMethod");
        Intrinsics.checkNotNullParameter(imieResult, "imieResult");
        Intrinsics.checkNotNullParameter(simBarcodeResult, "simBarcodeResult");
        Intrinsics.checkNotNullParameter(blacklistSharingStatus, "blacklistSharingStatus");
        this.companyCode = companyCode;
        this.customerNumber = customerNumber;
        this.hardwareNumber = hardwareNumber;
        this.existingHardwareNumber = existingHardwareNumber;
        this.existingBrand = existingBrand;
        this.existingModel = existingModel;
        this.subscriberNumber = subscriberNumber;
        this.packageGroupType = packageGroupType;
        this.idNumber = idNumber;
        this.idCardType = idCardType;
        this.idCardInformationCollection = idCardInformationCollection;
        this.postCodeFromSmartCard = str;
        this.postcode = str2;
        this.postcodeSequence = num;
        this.referenceDocListFileName = referenceDocListFileName;
        this.isSmartCard = z;
        this.faceRecResponse = faceRecResponse;
        this.isFaceRecog = z2;
        this.verifyType = verifyType;
        this.verifyAttempt = i;
        this.newIMEIResponse = getNewIMEIResponse;
        this.nontelcoConsentType = str3;
        this.consentVersionLabel = consentVersionLabel;
        this.mrtrConsentId = mrtrConsentId;
        this.consentType = consentType;
        this.consentVersion = consentVersion;
        this.isShowConsent = z3;
        this.simCardNumber = simCardNumber;
        this.addressMailingData = oneAddressMailingData;
        this.addressLegalData = legalAddress;
        this.legalAddressPostCode = legalAddressPostCode;
        this.mPackage = r48;
        this.recommendPackage = r49;
        this.packageSetRetailer = onePostpaidPackageSet;
        this.otpCode = otpCode;
        this.getPre2PostProfile = onePre2PostSubscribeNumberDataResponse;
        this.recommendedPackageResponse = recommendPackageResponse;
        this.contractFlowID = deviceSaleCampaignType;
        this.authorizationData = onePre2PostAuthorizationDataResponse;
        this.requireFaceRecognition = z4;
        this.enquiryPackage = enquiryData;
        this.href = str4;
        this.packageGroupRefNo = packageGroupRefNo;
        this.withDevice = z5;
        this.isWithContract = z6;
        this.invoiceAlertMethod = invoiceAlertMethod;
        this.propositionTrueItem = propositionListItem;
        this.packageTrueItem = priceplanListItem;
        this.ocrBirthDate = str5;
        this.verifyAndGenAutoApproveCodeResponse = oneVerifyAndGenAutoApproveCodeResponse;
        this.consentNonTelcoAcceptValue = pair;
        this.consentTmnAcceptValue = pair2;
        this.transactionId = str6;
        this.isWithCampaign = z7;
        this.pricePlansResponse = pricePlanData;
        this.pricePlansDetailStatusResponse = pricePlansStatus;
        this.pricePlansDetailListResponse = list;
        this.validatePre2PostResponse = onePre2PostValidatePre2PostTrueCompanyDataResponse;
        this.imieResult = imieResult;
        this.simBarcodeResult = simBarcodeResult;
        this.validatePrivilege = onePre2PostValidatePrivilegeDataResponse;
        this.reportId = str7;
        this.verifySubscriberPreToPostData = onePre2PostVerifySubscriberPreToPostData;
        this.consentId = num2;
        this.hardwareNumberResponse = getNewIMEIResponse2;
        this.blacklistSharingStatus = blacklistSharingStatus;
        this.canBuyDeviceWithContract = str8;
    }

    public /* synthetic */ OnePre2PostModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, IdCardInformationCollection idCardInformationCollection, String str11, String str12, Integer num, List list, boolean z, FaceRecResponse faceRecResponse, boolean z2, String str13, int i, GetNewIMEIResponse getNewIMEIResponse, String str14, String str15, String str16, String str17, String str18, boolean z3, String str19, OneAddressMailingData oneAddressMailingData, LegalAddress legalAddress, String str20, Package r98, Package r99, OnePostpaidPackageSet onePostpaidPackageSet, String str21, OnePre2PostSubscribeNumberDataResponse onePre2PostSubscribeNumberDataResponse, RecommendPackageResponse recommendPackageResponse, DeviceSaleCampaignType deviceSaleCampaignType, OnePre2PostAuthorizationDataResponse onePre2PostAuthorizationDataResponse, boolean z4, OnePre2PostViewModel.EnquiryData enquiryData, String str22, String str23, boolean z5, boolean z6, String str24, PropositionListItem propositionListItem, PriceplanListItem priceplanListItem, String str25, OneVerifyAndGenAutoApproveCodeResponse oneVerifyAndGenAutoApproveCodeResponse, Pair pair, Pair pair2, String str26, boolean z7, PricePlanData pricePlanData, PricePlansStatus pricePlansStatus, List list2, OnePre2PostValidatePre2PostTrueCompanyDataResponse onePre2PostValidatePre2PostTrueCompanyDataResponse, String str27, String str28, OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse, String str29, OnePre2PostVerifySubscriberPreToPostData onePre2PostVerifySubscriberPreToPostData, Integer num2, GetNewIMEIResponse getNewIMEIResponse2, String str30, String str31, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "01" : str10, (i2 & 1024) != 0 ? null : idCardInformationCollection, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? new ArrayList() : list, (i2 & 32768) != 0 ? false : z, (i2 & 65536) != 0 ? null : faceRecResponse, (i2 & 131072) != 0 ? false : z2, (i2 & 262144) != 0 ? "" : str13, (i2 & 524288) != 0 ? 0 : i, (i2 & 1048576) != 0 ? null : getNewIMEIResponse, (i2 & 2097152) != 0 ? null : str14, (i2 & 4194304) != 0 ? "" : str15, (i2 & 8388608) != 0 ? "" : str16, (i2 & 16777216) != 0 ? "" : str17, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str18, (i2 & 67108864) != 0 ? false : z3, (i2 & 134217728) != 0 ? "" : str19, (i2 & 268435456) != 0 ? null : oneAddressMailingData, (i2 & PKIFailureInfo.duplicateCertReq) != 0 ? null : legalAddress, (i2 & 1073741824) != 0 ? "" : str20, (i2 & Integer.MIN_VALUE) != 0 ? null : r98, (i3 & 1) != 0 ? null : r99, (i3 & 2) != 0 ? null : onePostpaidPackageSet, (i3 & 4) != 0 ? "" : str21, (i3 & 8) != 0 ? null : onePre2PostSubscribeNumberDataResponse, (i3 & 16) != 0 ? null : recommendPackageResponse, (i3 & 32) != 0 ? null : deviceSaleCampaignType, (i3 & 64) != 0 ? null : onePre2PostAuthorizationDataResponse, (i3 & 128) != 0 ? false : z4, (i3 & 256) != 0 ? null : enquiryData, (i3 & 512) != 0 ? null : str22, (i3 & 1024) != 0 ? "" : str23, (i3 & 2048) != 0 ? false : z5, (i3 & 4096) != 0 ? false : z6, (i3 & 8192) != 0 ? Constant.EInvoice.SMS_WITH_EMAIL : str24, (i3 & 16384) != 0 ? null : propositionListItem, (i3 & 32768) != 0 ? null : priceplanListItem, (i3 & 65536) != 0 ? null : str25, (i3 & 131072) != 0 ? null : oneVerifyAndGenAutoApproveCodeResponse, (i3 & 262144) != 0 ? null : pair, (i3 & 524288) != 0 ? null : pair2, (i3 & 1048576) != 0 ? null : str26, (i3 & 2097152) != 0 ? false : z7, (i3 & 4194304) != 0 ? null : pricePlanData, (i3 & 8388608) != 0 ? null : pricePlansStatus, (i3 & 16777216) != 0 ? null : list2, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : onePre2PostValidatePre2PostTrueCompanyDataResponse, (i3 & 67108864) != 0 ? "" : str27, (i3 & 134217728) != 0 ? "" : str28, (i3 & 268435456) != 0 ? null : onePre2PostValidatePrivilegeDataResponse, (i3 & PKIFailureInfo.duplicateCertReq) != 0 ? null : str29, (i3 & 1073741824) != 0 ? null : onePre2PostVerifySubscriberPreToPostData, (i3 & Integer.MIN_VALUE) != 0 ? 0 : num2, (i4 & 1) != 0 ? null : getNewIMEIResponse2, (i4 & 2) != 0 ? "" : str30, (i4 & 4) != 0 ? null : str31);
    }
}
