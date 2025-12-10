package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.ViewPagerCardAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneSearchView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressListTrueFragment;
import th.p047co.dtac.android.dtacone.configuration.activity.OneMnpComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePostpaidRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePre2PostComponent;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.Data;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem;
import th.p047co.dtac.android.dtacone.util.ComponentUtil;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.widget.view.DtacSnackbar;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0004¦\u0001§\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020*0%¢\u0006\u0004\b+\u0010)J\u001b\u0010-\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020,0%¢\u0006\u0004\b-\u0010)J\u001b\u0010.\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020,0%¢\u0006\u0004\b.\u0010)J\u001b\u0010/\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020,0%¢\u0006\u0004\b/\u0010)J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010\u0004J\u0015\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\b8\u0010\u0004J\u000f\u00109\u001a\u00020\nH\u0002¢\u0006\u0004\b9\u0010\u0004J-\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\b\u0012\u0004\u0012\u00020*0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010%H\u0002¢\u0006\u0004\b=\u0010<J-\u0010>\u001a\b\u0012\u0004\u0012\u00020,0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010%H\u0002¢\u0006\u0004\b>\u0010<J-\u0010?\u001a\b\u0012\u0004\u0012\u00020,0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010%H\u0002¢\u0006\u0004\b?\u0010<J\u000f\u0010@\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\nH\u0002¢\u0006\u0004\bA\u0010\u0004J\u0011\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bC\u0010DJ\u0011\u0010E\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\bE\u0010FJ\u0011\u0010G\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\bG\u0010HJ\u0011\u0010I\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bI\u0010JJ\u0011\u00105\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b5\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bQ\u0010\u001eJ\u0017\u0010S\u001a\u00020\n2\u0006\u0010R\u001a\u00020!H\u0002¢\u0006\u0004\bS\u0010$J\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020*0%2\b\u0010T\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bU\u0010VJ'\u0010X\u001a\b\u0012\u0004\u0012\u00020,0%2\b\u0010T\u001a\u0004\u0018\u00010\u001a2\u0006\u0010W\u001a\u00020\u001aH\u0002¢\u0006\u0004\bX\u0010YJ+\u0010[\u001a\u0004\u0018\u00010\u001a2\b\u0010T\u001a\u0004\u0018\u00010\u001a2\u0006\u0010W\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\u001aH\u0002¢\u0006\u0004\b[\u0010\\J/\u0010^\u001a\b\u0012\u0004\u0012\u00020,0%2\b\u0010T\u001a\u0004\u0018\u00010\u001a2\u0006\u0010W\u001a\u00020\u001a2\u0006\u0010]\u001a\u00020\u001aH\u0002¢\u0006\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010o\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008a\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008a\u0001R!\u0010:\u001a\u000b\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0094\u0001R!\u0010\u0098\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0094\u0001R!\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0094\u0001R!\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0094\u0001R\u001a\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010 \u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001¨\u0006¨\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", Constant.ServiceAPIName.onStart, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", SearchIntents.EXTRA_QUERY, "", "onQueryTextSubmit", "(Ljava/lang/String;)Z", "newText", "onQueryTextChange", "", "pageId", "setMailAddressPage", "(I)V", "", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", FirebaseAnalytics.Param.ITEMS, "loadProvinceList", "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", "loadDistrictList", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/SubDistrictItem;", "loadSubDistrictList", "loadPostCodeList", "loadPostCodeFromSearchList", "onQueryError", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment$OnSuccessCallback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment$OnSuccessCallback;)V", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.CLOSE_AND_STROKE, "(Landroid/view/View;)V", "t", OperatorName.RESTORE, "listAddress", "D", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "F", "B", "u", "P", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/Data;", "M", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/Data;", "R", "()Ljava/lang/Integer;", "S", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/SubDistrictItem;", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", "C", "()Ljava/lang/String;", "postCode", "N", "(Ljava/lang/String;)V", OperatorName.STROKING_COLOR_GRAY, "currentItem", OperatorName.SET_LINE_WIDTH, "provinceId", "x", "(Ljava/lang/String;)Ljava/util/List;", "districtId", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "subDistrictId", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "subDistrictName", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;", "viewPager", "Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;", "getViewPager", "()Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;", "setViewPager", "(Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "Landroid/widget/TextView;", "tvToolbarTitle", "Landroid/widget/TextView;", "getTvToolbarTitle", "()Landroid/widget/TextView;", "setTvToolbarTitle", "(Landroid/widget/TextView;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraint", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraint", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setConstraint", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneSearchView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneSearchView;", "searchView", "Landroid/view/MenuItem;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/MenuItem;", "searchItem", "Lth/co/dtac/android/dtacone/adapter/ViewPagerCardAdapter;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/ViewPagerCardAdapter;", "adapter", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment;", "d", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListTrueFragment;", "provinceListFragment", "e", "districtListFragment", OperatorName.FILL_NON_ZERO, "subDistrictListFragment", OperatorName.NON_STROKING_GRAY, "postCodeListFragment", "", OperatorName.CLOSE_PATH, "Ljava/util/List;", "i", "listProvinceAddressFull", OperatorName.SET_LINE_JOINSTYLE, "listDistrictAddressFull", OperatorName.NON_STROKING_CMYK, "listSubDistrictAddressFull", OperatorName.LINE_TO, "listPostCodeAddressFull", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment$OnSuccessCallback;", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "getRtrRx2Repository", "()Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "setRtrRx2Repository", "(Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;)V", "Companion", "OnSuccessCallback", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneAddressInfoDialogTrueFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneAddressInfoDialogTrueFragment.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BundleExtension.kt\nth/co/dtac/android/dtacone/app_one/extension/BundleExtensionKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,431:1\n766#2:432\n857#2,2:433\n766#2:435\n857#2,2:436\n766#2:438\n857#2,2:439\n766#2:441\n857#2,2:442\n1477#2:456\n1502#2,3:457\n1505#2,3:467\n1238#2,4:472\n1549#2:476\n1620#2,3:477\n1549#2:480\n1620#2,3:481\n766#2:484\n857#2,2:485\n766#2:487\n857#2,2:488\n766#2:490\n857#2,2:491\n766#2:493\n857#2,2:494\n14#3,4:444\n14#3,4:448\n14#3,4:452\n372#4,7:460\n453#4:470\n403#4:471\n*S KotlinDebug\n*F\n+ 1 OneAddressInfoDialogTrueFragment.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment\n*L\n171#1:432\n171#1:433,2\n174#1:435\n174#1:436,2\n177#1:438\n177#1:439,2\n180#1:441\n180#1:442,2\n285#1:456\n285#1:457,3\n285#1:467,3\n286#1:472,4\n305#1:476\n305#1:477,3\n320#1:480\n320#1:481,3\n376#1:484\n376#1:485,2\n379#1:487\n379#1:488,2\n382#1:490\n382#1:491,2\n385#1:493\n385#1:494,2\n238#1:444,4\n239#1:448,4\n240#1:452,4\n285#1:460,7\n286#1:470\n286#1:471\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment */
/* loaded from: classes7.dex */
public final class OneAddressInfoDialogTrueFragment extends DialogFragment implements SearchView.OnQueryTextListener {

    /* renamed from: a */
    public OneSearchView f83031a;

    /* renamed from: b */
    public MenuItem f83032b;

    /* renamed from: c */
    public ViewPagerCardAdapter f83033c;
    public ConstraintLayout constraint;

    /* renamed from: d */
    public OneAddressListTrueFragment f83034d;

    /* renamed from: e */
    public OneAddressListTrueFragment f83035e;

    /* renamed from: f */
    public OneAddressListTrueFragment f83036f;

    /* renamed from: g */
    public OneAddressListTrueFragment f83037g;

    /* renamed from: h */
    public List f83038h;

    /* renamed from: i */
    public List f83039i;

    /* renamed from: j */
    public List f83040j;

    /* renamed from: k */
    public List f83041k;

    /* renamed from: l */
    public List f83042l;

    /* renamed from: m */
    public OnSuccessCallback f83043m;
    @Inject
    public RtrRx2Repository rtrRx2Repository;
    public Toolbar toolbar;
    public TextView tvToolbarTitle;
    public WrapContentViewPager viewPager;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment$Companion;", "", "()V", "ARGUMENT_DISTRICT", "", "ARGUMENT_POSTCODE", "ARGUMENT_PROVINCE", "ARGUMENT_SHOW_PAGE", "ARGUMENT_SUB_DISTRICT", "DISTRICT", "", "POST_CODE", "PROVINCE", "SEARCH_MENU", "SUB_DISTRICT", "WITH_ONLINE_METHOD", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment;", "showPage", "province", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "district", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", "subDistrict", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/SubDistrictItem;", "withOnlineMethod", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneAddressInfoDialogTrueFragment newInstance$default(Companion companion, int i, ProvinceItem provinceItem, DistrictsItem districtsItem, SubDistrictItem subDistrictItem, boolean z, int i2, Object obj) {
            boolean z2;
            if ((i2 & 16) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            return companion.newInstance(i, provinceItem, districtsItem, subDistrictItem, z2);
        }

        @NotNull
        public final OneAddressInfoDialogTrueFragment newInstance(int i, @Nullable ProvinceItem provinceItem, @Nullable DistrictsItem districtsItem, @Nullable SubDistrictItem subDistrictItem, boolean z) {
            Bundle bundle = new Bundle();
            OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment = new OneAddressInfoDialogTrueFragment();
            bundle.putInt("ARGUMENT_SHOW_PAGE", i);
            bundle.putParcelable("ARGUMENT_PROVINCE", provinceItem);
            bundle.putParcelable("ARGUMENT_DISTRICT", districtsItem);
            bundle.putParcelable("ARGUMENT_SUB_DISTRICT", subDistrictItem);
            bundle.putBoolean("WITH_ONLINE_METHOD", z);
            oneAddressInfoDialogTrueFragment.setArguments(bundle);
            return oneAddressInfoDialogTrueFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment$OnSuccessCallback;", "", "onSuccessSelectAddress", "", "province", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "districtList", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", "subDistrict", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/SubDistrictItem;", "postCode", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment$OnSuccessCallback */
    /* loaded from: classes7.dex */
    public interface OnSuccessCallback {
        void onSuccessSelectAddress(@Nullable ProvinceItem provinceItem, @Nullable DistrictsItem districtsItem, @Nullable SubDistrictItem subDistrictItem, @Nullable String str);
    }

    /* renamed from: G */
    private final boolean m19678G(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public static final void m19677H(OneAddressInfoDialogTrueFragment this$0, List items) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(items, "$items");
        OneAddressListTrueFragment oneAddressListTrueFragment = this$0.f83035e;
        if (oneAddressListTrueFragment != null) {
            oneAddressListTrueFragment.setItems(items);
        }
    }

    /* renamed from: I */
    public static final void m19676I(OneAddressInfoDialogTrueFragment this$0, List finalItems) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(finalItems, "$finalItems");
        OneAddressListTrueFragment oneAddressListTrueFragment = this$0.f83037g;
        if (oneAddressListTrueFragment != null) {
            oneAddressListTrueFragment.setItems(finalItems);
        }
    }

    /* renamed from: J */
    public static final void m19675J(OneAddressInfoDialogTrueFragment this$0, List finalItems) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(finalItems, "$finalItems");
        OneAddressListTrueFragment oneAddressListTrueFragment = this$0.f83037g;
        if (oneAddressListTrueFragment != null) {
            oneAddressListTrueFragment.setItems(finalItems);
        }
    }

    /* renamed from: K */
    public static final void m19674K(OneAddressInfoDialogTrueFragment this$0, List items) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(items, "$items");
        OneAddressListTrueFragment oneAddressListTrueFragment = this$0.f83034d;
        if (oneAddressListTrueFragment != null) {
            oneAddressListTrueFragment.setItems(items);
        }
    }

    /* renamed from: L */
    public static final void m19673L(OneAddressInfoDialogTrueFragment this$0, List uniqueItems) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uniqueItems, "$uniqueItems");
        OneAddressListTrueFragment oneAddressListTrueFragment = this$0.f83036f;
        if (oneAddressListTrueFragment != null) {
            oneAddressListTrueFragment.setItems(uniqueItems);
        }
    }

    /* renamed from: P */
    private final void m19669P() {
        Integer m19667R;
        Integer m19667R2;
        Integer m19667R3;
        if (m19670O() != null && ((m19667R = m19667R()) == null || m19667R.intValue() != 0)) {
            OneAddressListTrueFragment oneAddressListTrueFragment = this.f83034d;
            if (oneAddressListTrueFragment != null) {
                oneAddressListTrueFragment.setSelectedItem(m19670O());
            }
            if (m19657v() != null && ((m19667R2 = m19667R()) == null || m19667R2.intValue() != 1)) {
                OneAddressListTrueFragment oneAddressListTrueFragment2 = this.f83035e;
                if (oneAddressListTrueFragment2 != null) {
                    oneAddressListTrueFragment2.setSelectedItem(m19657v());
                }
                if (m19666S() != null && ((m19667R3 = m19667R()) == null || m19667R3.intValue() != 2)) {
                    OneAddressListTrueFragment oneAddressListTrueFragment3 = this.f83036f;
                    if (oneAddressListTrueFragment3 != null) {
                        oneAddressListTrueFragment3.setSelectedItem(m19666S());
                    }
                    Integer m19667R4 = m19667R();
                    if (m19667R4 != null && m19667R4.intValue() == 3) {
                        setMailAddressPage(3);
                        return;
                    } else {
                        m19671N(m19682C());
                        return;
                    }
                }
                setMailAddressPage(2);
                return;
            }
            setMailAddressPage(1);
            return;
        }
        setMailAddressPage(0);
    }

    /* renamed from: Q */
    private final void m19668Q() {
        View view;
        ImageView clearButton;
        TextView tvSearchText;
        TextView tvSearchText2;
        getToolbar().inflateMenu(R.menu.one_mailing_search_menu);
        getToolbar().setLayoutTransition(new LayoutTransition());
        MenuItem findItem = getToolbar().getMenu().findItem(R.id.searchView);
        this.f83032b = findItem;
        OneSearchView oneSearchView = null;
        if (findItem != null) {
            view = findItem.getActionView();
        } else {
            view = null;
        }
        if (view instanceof OneSearchView) {
            oneSearchView = (OneSearchView) view;
        }
        this.f83031a = oneSearchView;
        if (oneSearchView != null) {
            oneSearchView.setBackgroundResource(R.drawable.background_one_button_gray);
        }
        OneSearchView oneSearchView2 = this.f83031a;
        if (oneSearchView2 != null && (tvSearchText2 = oneSearchView2.getTvSearchText()) != null) {
            tvSearchText2.setTextColor(ContextCompat.getColor(requireContext(), R.color.jet_back));
        }
        OneSearchView oneSearchView3 = this.f83031a;
        if (oneSearchView3 != null && (tvSearchText = oneSearchView3.getTvSearchText()) != null) {
            tvSearchText.setHintTextColor(ContextCompat.getColor(requireContext(), R.color.colorGray));
        }
        OneSearchView oneSearchView4 = this.f83031a;
        if (oneSearchView4 != null && (clearButton = oneSearchView4.getClearButton()) != null) {
            clearButton.setImageResource(R.drawable.ic_clear_text);
        }
        OneSearchView oneSearchView5 = this.f83031a;
        if (oneSearchView5 != null) {
            oneSearchView5.setOnQueryTextListener(this);
        }
    }

    /* renamed from: R */
    private final Integer m19667R() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("ARGUMENT_SHOW_PAGE"));
        }
        return null;
    }

    public static final /* synthetic */ ViewPagerCardAdapter access$getAdapter$p(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment) {
        return oneAddressInfoDialogTrueFragment.f83033c;
    }

    public static final /* synthetic */ void access$getAllAddressFromDb(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, int i) {
        oneAddressInfoDialogTrueFragment.m19656w(i);
    }

    public static final /* synthetic */ OneSearchView access$getSearchView$p(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment) {
        return oneAddressInfoDialogTrueFragment.f83031a;
    }

    /* renamed from: n */
    public static /* synthetic */ void m19665n(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, List list) {
        m19676I(oneAddressInfoDialogTrueFragment, list);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19664o(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, List list) {
        m19675J(oneAddressInfoDialogTrueFragment, list);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19663p(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, List list) {
        m19673L(oneAddressInfoDialogTrueFragment, list);
    }

    /* renamed from: q */
    public static /* synthetic */ void m19662q(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, List list) {
        m19674K(oneAddressInfoDialogTrueFragment, list);
    }

    /* renamed from: r */
    public static /* synthetic */ void m19661r(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, List list) {
        m19677H(oneAddressInfoDialogTrueFragment, list);
    }

    /* renamed from: s */
    private final void m19660s(View view) {
        View findViewById = view.findViewById(R.id.viewPager);
        Intrinsics.checkNotNullExpressionValue(findViewById, "v.findViewById(R.id.viewPager)");
        setViewPager((WrapContentViewPager) findViewById);
        View findViewById2 = view.findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "v.findViewById(R.id.toolbar)");
        setToolbar((Toolbar) findViewById2);
        View findViewById3 = view.findViewById(R.id.tv_toolbar_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "v.findViewById(R.id.tv_toolbar_title)");
        setTvToolbarTitle((TextView) findViewById3);
        View findViewById4 = view.findViewById(R.id.constraint);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "v.findViewById(R.id.constraint)");
        setConstraint((ConstraintLayout) findViewById4);
    }

    /* renamed from: t */
    private final void m19659t() {
        OneAddressListTrueFragment.Companion companion = OneAddressListTrueFragment.Companion;
        this.f83034d = companion.newInstance(0);
        this.f83035e = companion.newInstance(1);
        this.f83036f = companion.newInstance(2);
        this.f83037g = companion.newInstance(3);
    }

    /* renamed from: u */
    private final void m19658u() {
        ViewPagerCardAdapter viewPagerCardAdapter = new ViewPagerCardAdapter(getChildFragmentManager());
        this.f83033c = viewPagerCardAdapter;
        viewPagerCardAdapter.addFragmentCard(this.f83034d, "เลือกจังหวัด");
        ViewPagerCardAdapter viewPagerCardAdapter2 = this.f83033c;
        if (viewPagerCardAdapter2 != null) {
            viewPagerCardAdapter2.addFragmentCard(this.f83035e, "เลือกเขต/อำเภอ");
        }
        ViewPagerCardAdapter viewPagerCardAdapter3 = this.f83033c;
        if (viewPagerCardAdapter3 != null) {
            viewPagerCardAdapter3.addFragmentCard(this.f83036f, "เลือกแขวง/ตำบล");
        }
        ViewPagerCardAdapter viewPagerCardAdapter4 = this.f83033c;
        if (viewPagerCardAdapter4 != null) {
            viewPagerCardAdapter4.addFragmentCard(this.f83037g, "เลือกรหัสไปรษณีย์");
        }
        getViewPager().setAllowedSwipeDirection(WrapContentViewPager.SwipeDirection.LEFT);
        getViewPager().setAdapter(this.f83033c);
        getViewPager().addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment$configurationViewPager$1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                CharSequence charSequence;
                TextView tvToolbarTitle = OneAddressInfoDialogTrueFragment.this.getTvToolbarTitle();
                ViewPagerCardAdapter access$getAdapter$p = OneAddressInfoDialogTrueFragment.access$getAdapter$p(OneAddressInfoDialogTrueFragment.this);
                if (access$getAdapter$p != null) {
                    charSequence = access$getAdapter$p.getPageTitle(i);
                } else {
                    charSequence = null;
                }
                tvToolbarTitle.setText(charSequence);
                OneAddressInfoDialogTrueFragment.access$getAllAddressFromDb(OneAddressInfoDialogTrueFragment.this, i);
                OneSearchView access$getSearchView$p = OneAddressInfoDialogTrueFragment.access$getSearchView$p(OneAddressInfoDialogTrueFragment.this);
                if (access$getSearchView$p != null) {
                    access$getSearchView$p.clearEditText();
                }
            }
        });
    }

    /* renamed from: w */
    public final void m19656w(int i) {
        List<ProvinceItem> emptyList;
        Object obj;
        Object obj2;
        Object obj3;
        if (i != 0) {
            Object obj4 = null;
            if (i != 1) {
                String str = "";
                if (i != 2) {
                    if (i == 3) {
                        OneAddressListTrueFragment oneAddressListTrueFragment = this.f83034d;
                        if (oneAddressListTrueFragment != null) {
                            obj2 = oneAddressListTrueFragment.getSelectedItem();
                        } else {
                            obj2 = null;
                        }
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem");
                        String id2 = ((ProvinceItem) obj2).getId();
                        if (id2 == null) {
                            id2 = "";
                        }
                        OneAddressListTrueFragment oneAddressListTrueFragment2 = this.f83035e;
                        if (oneAddressListTrueFragment2 != null) {
                            obj3 = oneAddressListTrueFragment2.getSelectedItem();
                        } else {
                            obj3 = null;
                        }
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem");
                        String id3 = ((DistrictsItem) obj3).getId();
                        if (id3 == null) {
                            id3 = "";
                        }
                        OneAddressListTrueFragment oneAddressListTrueFragment3 = this.f83036f;
                        if (oneAddressListTrueFragment3 != null) {
                            obj4 = oneAddressListTrueFragment3.getSelectedItem();
                        }
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem");
                        String th2 = ((SubDistrictItem) obj4).getTh();
                        if (th2 != null) {
                            str = th2;
                        }
                        loadPostCodeList(m19653z(id2, id3, str));
                        return;
                    }
                    return;
                }
                OneAddressListTrueFragment oneAddressListTrueFragment4 = this.f83034d;
                if (oneAddressListTrueFragment4 != null) {
                    obj = oneAddressListTrueFragment4.getSelectedItem();
                } else {
                    obj = null;
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem");
                String id4 = ((ProvinceItem) obj).getId();
                OneAddressListTrueFragment oneAddressListTrueFragment5 = this.f83035e;
                if (oneAddressListTrueFragment5 != null) {
                    obj4 = oneAddressListTrueFragment5.getSelectedItem();
                }
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem");
                String id5 = ((DistrictsItem) obj4).getId();
                if (id5 != null) {
                    str = id5;
                }
                loadSubDistrictList(m19680E(id4, str));
                return;
            }
            OneAddressListTrueFragment oneAddressListTrueFragment6 = this.f83034d;
            if (oneAddressListTrueFragment6 != null) {
                obj4 = oneAddressListTrueFragment6.getSelectedItem();
            }
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem");
            loadDistrictList(m19655x(((ProvinceItem) obj4).getId()));
            return;
        }
        Data m19672M = m19672M();
        if (m19672M == null || (emptyList = m19672M.getProvince()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        loadProvinceList(emptyList);
    }

    /* renamed from: A */
    public final String m19684A(String str, String str2, String str3) {
        List<ProvinceItem> province;
        List<DistrictsItem> districts;
        List<SubDistrictItem> subDistrict;
        Data m19672M = m19672M();
        if (m19672M != null && (province = m19672M.getProvince()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : province) {
                if (Intrinsics.areEqual(((ProvinceItem) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            ProvinceItem provinceItem = (ProvinceItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            if (provinceItem != null && (districts = provinceItem.getDistricts()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : districts) {
                    if (Intrinsics.areEqual(((DistrictsItem) obj2).getId(), str2)) {
                        arrayList2.add(obj2);
                    }
                }
                DistrictsItem districtsItem = (DistrictsItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                if (districtsItem != null && (subDistrict = districtsItem.getSubDistrict()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : subDistrict) {
                        if (Intrinsics.areEqual(((SubDistrictItem) obj3).getId(), str3)) {
                            arrayList3.add(obj3);
                        }
                    }
                    SubDistrictItem subDistrictItem = (SubDistrictItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList3);
                    if (subDistrictItem != null) {
                        return subDistrictItem.getZipCode();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    public final List m19683B(String str, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String zipCode = ((SubDistrictItem) obj).getZipCode();
                if (zipCode != null && StringsKt__StringsKt.contains((CharSequence) zipCode, (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: C */
    public final String m19682C() {
        Object obj;
        OneAddressListTrueFragment oneAddressListTrueFragment = this.f83036f;
        if (oneAddressListTrueFragment != null) {
            obj = oneAddressListTrueFragment.getSelectedItem();
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem");
        return ((SubDistrictItem) obj).getZipCode();
    }

    /* renamed from: D */
    public final List m19681D(String str, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String th2 = ((ProvinceItem) obj).getTh();
                if (th2 != null && StringsKt__StringsKt.contains((CharSequence) th2, (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: E */
    public final List m19680E(String str, String str2) {
        List<ProvinceItem> province;
        List<DistrictsItem> districts;
        List<SubDistrictItem> subDistrict;
        Data m19672M = m19672M();
        if (m19672M != null && (province = m19672M.getProvince()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : province) {
                if (Intrinsics.areEqual(((ProvinceItem) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            ProvinceItem provinceItem = (ProvinceItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            if (provinceItem != null && (districts = provinceItem.getDistricts()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : districts) {
                    if (Intrinsics.areEqual(((DistrictsItem) obj2).getId(), str2)) {
                        arrayList2.add(obj2);
                    }
                }
                DistrictsItem districtsItem = (DistrictsItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                if (districtsItem != null && (subDistrict = districtsItem.getSubDistrict()) != null) {
                    return subDistrict;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: F */
    public final List m19679F(String str, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String th2 = ((SubDistrictItem) obj).getTh();
                if (th2 != null && StringsKt__StringsKt.contains((CharSequence) th2, (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: M */
    public final Data m19672M() {
        return getRtrRx2Repository().getLocationData().getData();
    }

    /* renamed from: N */
    public final void m19671N(String str) {
        Object obj;
        Object obj2;
        dismiss();
        OnSuccessCallback onSuccessCallback = this.f83043m;
        if (onSuccessCallback != null) {
            OneAddressListTrueFragment oneAddressListTrueFragment = this.f83034d;
            Object obj3 = null;
            if (oneAddressListTrueFragment != null) {
                obj = oneAddressListTrueFragment.getSelectedItem();
            } else {
                obj = null;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem");
            ProvinceItem provinceItem = (ProvinceItem) obj;
            OneAddressListTrueFragment oneAddressListTrueFragment2 = this.f83035e;
            if (oneAddressListTrueFragment2 != null) {
                obj2 = oneAddressListTrueFragment2.getSelectedItem();
            } else {
                obj2 = null;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem");
            DistrictsItem districtsItem = (DistrictsItem) obj2;
            OneAddressListTrueFragment oneAddressListTrueFragment3 = this.f83036f;
            if (oneAddressListTrueFragment3 != null) {
                obj3 = oneAddressListTrueFragment3.getSelectedItem();
            }
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem");
            onSuccessCallback.onSuccessSelectAddress(provinceItem, districtsItem, (SubDistrictItem) obj3, str);
        }
    }

    /* renamed from: O */
    public final ProvinceItem m19670O() {
        Object obj;
        Object parcelable;
        Bundle arguments = getArguments();
        Parcelable parcelable2 = null;
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("ARGUMENT_PROVINCE", ProvinceItem.class);
            obj = (Parcelable) parcelable;
        } else {
            Parcelable parcelable3 = arguments.getParcelable("ARGUMENT_PROVINCE");
            if (parcelable3 instanceof ProvinceItem) {
                parcelable2 = parcelable3;
            }
            obj = (ProvinceItem) parcelable2;
        }
        return (ProvinceItem) obj;
    }

    /* renamed from: S */
    public final SubDistrictItem m19666S() {
        Object obj;
        Object parcelable;
        Bundle arguments = getArguments();
        Parcelable parcelable2 = null;
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("ARGUMENT_SUB_DISTRICT", SubDistrictItem.class);
            obj = (Parcelable) parcelable;
        } else {
            Parcelable parcelable3 = arguments.getParcelable("ARGUMENT_SUB_DISTRICT");
            if (parcelable3 instanceof SubDistrictItem) {
                parcelable2 = parcelable3;
            }
            obj = (SubDistrictItem) parcelable2;
        }
        return (SubDistrictItem) obj;
    }

    @NotNull
    public final ConstraintLayout getConstraint() {
        ConstraintLayout constraintLayout = this.constraint;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("constraint");
        return null;
    }

    @NotNull
    public final RtrRx2Repository getRtrRx2Repository() {
        RtrRx2Repository rtrRx2Repository = this.rtrRx2Repository;
        if (rtrRx2Repository != null) {
            return rtrRx2Repository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtrRx2Repository");
        return null;
    }

    @NotNull
    public final Toolbar getToolbar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            return toolbar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbar");
        return null;
    }

    @NotNull
    public final TextView getTvToolbarTitle() {
        TextView textView = this.tvToolbarTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvToolbarTitle");
        return null;
    }

    @NotNull
    public final WrapContentViewPager getViewPager() {
        WrapContentViewPager wrapContentViewPager = this.viewPager;
        if (wrapContentViewPager != null) {
            return wrapContentViewPager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }

    public final void loadDistrictList(@NotNull final List<DistrictsItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List list = this.f83040j;
        if (list == null || list.isEmpty()) {
            this.f83040j = items;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: IK0
            {
                OneAddressInfoDialogTrueFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneAddressInfoDialogTrueFragment.m19661r(OneAddressInfoDialogTrueFragment.this, items);
            }
        }, 100L);
        this.f83038h = items;
    }

    public final void loadPostCodeFromSearchList(@NotNull List<SubDistrictItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List<SubDistrictItem> list = items;
        final ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (SubDistrictItem subDistrictItem : list) {
            subDistrictItem.setPostCode(Boolean.TRUE);
            arrayList.add(subDistrictItem);
        }
        List list2 = this.f83042l;
        if (list2 == null || list2.isEmpty()) {
            this.f83042l = arrayList;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: JK0
            {
                OneAddressInfoDialogTrueFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneAddressInfoDialogTrueFragment.m19665n(OneAddressInfoDialogTrueFragment.this, arrayList);
            }
        }, 100L);
        this.f83038h = items;
    }

    public final void loadPostCodeList(@NotNull List<SubDistrictItem> items) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.size() <= 1) {
            OneAddressListTrueFragment oneAddressListTrueFragment = this.f83034d;
            Object obj3 = null;
            if (oneAddressListTrueFragment != null) {
                obj = oneAddressListTrueFragment.getSelectedItem();
            } else {
                obj = null;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem");
            String id2 = ((ProvinceItem) obj).getId();
            OneAddressListTrueFragment oneAddressListTrueFragment2 = this.f83035e;
            if (oneAddressListTrueFragment2 != null) {
                obj2 = oneAddressListTrueFragment2.getSelectedItem();
            } else {
                obj2 = null;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem");
            String id3 = ((DistrictsItem) obj2).getId();
            String str = "";
            if (id3 == null) {
                id3 = "";
            }
            OneAddressListTrueFragment oneAddressListTrueFragment3 = this.f83036f;
            if (oneAddressListTrueFragment3 != null) {
                obj3 = oneAddressListTrueFragment3.getSelectedItem();
            }
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem");
            String id4 = ((SubDistrictItem) obj3).getId();
            if (id4 != null) {
                str = id4;
            }
            m19671N(m19684A(id2, id3, str));
            return;
        }
        List<SubDistrictItem> list = items;
        final ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (SubDistrictItem subDistrictItem : list) {
            subDistrictItem.setPostCode(Boolean.TRUE);
            arrayList.add(subDistrictItem);
        }
        List list2 = this.f83042l;
        if (list2 == null || list2.isEmpty()) {
            this.f83042l = arrayList;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: GK0
            {
                OneAddressInfoDialogTrueFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneAddressInfoDialogTrueFragment.m19664o(OneAddressInfoDialogTrueFragment.this, arrayList);
            }
        }, 100L);
        this.f83038h = items;
    }

    public final void loadProvinceList(@NotNull final List<ProvinceItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List list = this.f83039i;
        if (list == null || list.isEmpty()) {
            this.f83039i = items;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: HK0
            {
                OneAddressInfoDialogTrueFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneAddressInfoDialogTrueFragment.m19662q(OneAddressInfoDialogTrueFragment.this, items);
            }
        }, 100L);
        this.f83038h = items;
    }

    public final void loadSubDistrictList(@NotNull List<SubDistrictItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : items) {
            String th2 = ((SubDistrictItem) obj).getTh();
            Object obj2 = linkedHashMap.get(th2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(th2, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC18515Tn0.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (SubDistrictItem) CollectionsKt___CollectionsKt.first((List<? extends Object>) entry.getValue()));
        }
        final List list = CollectionsKt___CollectionsKt.toList(linkedHashMap2.values());
        List list2 = this.f83041k;
        if (list2 == null || list2.isEmpty()) {
            this.f83041k = list;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: KK0
            {
                OneAddressInfoDialogTrueFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneAddressInfoDialogTrueFragment.m19663p(OneAddressInfoDialogTrueFragment.this, list);
            }
        }, 100L);
        this.f83038h = items;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof OnePre2PostActivity) {
            ((OnePre2PostComponent) ComponentUtil.getActivityComponent(getActivity(), OnePre2PostComponent.class)).inject(this);
        } else if (activity instanceof OnePostpaidRegistrationActivity) {
            ((OnePostpaidRegistrationComponent) ComponentUtil.getActivityComponent(getActivity(), OnePostpaidRegistrationComponent.class)).inject(this);
        } else if (activity instanceof OneMnpActivity) {
            ((OneMnpComponent) ComponentUtil.getActivityComponent(getActivity(), OneMnpComponent.class)).inject(this);
        } else {
            ((OnePostpaidRegistrationComponent) ComponentUtil.getActivityComponent(getActivity(), OnePostpaidRegistrationComponent.class)).inject(this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.one_dialog_mailing_address, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m19660s(view);
        return view;
    }

    public final void onQueryError() {
        ConstraintLayout constraint = getConstraint();
        String string = getString(R.string.server_error_try_again);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_error_try_again)");
        DtacSnackbar.snackbar(constraint, string, getContext(), 0).show();
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(@NotNull String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        int currentItem = getViewPager().getCurrentItem();
        OneSearchView oneSearchView = this.f83031a;
        if (oneSearchView != null && oneSearchView != null) {
            oneSearchView.setEnabled(true);
        }
        if (m19678G(newText)) {
            m19656w(currentItem);
            return false;
        }
        int currentItem2 = getViewPager().getCurrentItem();
        if (currentItem2 != 0) {
            if (currentItem2 != 1) {
                if (currentItem2 != 2) {
                    if (currentItem2 == 3) {
                        loadPostCodeFromSearchList(m19683B(newText, this.f83042l));
                        return false;
                    }
                    return false;
                }
                loadSubDistrictList(m19679F(newText, this.f83041k));
                return false;
            }
            loadDistrictList(m19654y(newText, this.f83040j));
            return false;
        }
        loadProvinceList(m19681D(newText, this.f83039i));
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.one_dialog_shape_round_corner);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        m19669P();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m19659t();
        m19658u();
        m19668Q();
    }

    public final void setCallback(@NotNull OnSuccessCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f83043m = callback;
    }

    public final void setConstraint(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.constraint = constraintLayout;
    }

    public final void setMailAddressPage(int i) {
        List<ProvinceItem> emptyList;
        int i2;
        Object obj;
        Object obj2;
        MenuItem menuItem = this.f83032b;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
        getViewPager().setCurrentItem(i);
        CharSequence charSequence = null;
        Object obj3 = null;
        Object obj4 = null;
        if (i != 0) {
            String str = "";
            if (i != 3) {
                if (i == 4) {
                    OneAddressListTrueFragment oneAddressListTrueFragment = this.f83037g;
                    if (oneAddressListTrueFragment != null) {
                        obj3 = oneAddressListTrueFragment.getSelectedItem();
                    }
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem");
                    String zipCode = ((SubDistrictItem) obj3).getZipCode();
                    if (zipCode != null) {
                        str = zipCode;
                    }
                    m19671N(str);
                    return;
                }
                return;
            }
            List list = this.f83042l;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i2 <= 1) {
                OneAddressListTrueFragment oneAddressListTrueFragment2 = this.f83034d;
                if (oneAddressListTrueFragment2 != null) {
                    obj = oneAddressListTrueFragment2.getSelectedItem();
                } else {
                    obj = null;
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem");
                String id2 = ((ProvinceItem) obj).getId();
                OneAddressListTrueFragment oneAddressListTrueFragment3 = this.f83035e;
                if (oneAddressListTrueFragment3 != null) {
                    obj2 = oneAddressListTrueFragment3.getSelectedItem();
                } else {
                    obj2 = null;
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem");
                String id3 = ((DistrictsItem) obj2).getId();
                if (id3 == null) {
                    id3 = "";
                }
                OneAddressListTrueFragment oneAddressListTrueFragment4 = this.f83036f;
                if (oneAddressListTrueFragment4 != null) {
                    obj4 = oneAddressListTrueFragment4.getSelectedItem();
                }
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem");
                String id4 = ((SubDistrictItem) obj4).getId();
                if (id4 != null) {
                    str = id4;
                }
                m19671N(m19684A(id2, id3, str));
                return;
            }
            return;
        }
        Data m19672M = m19672M();
        if (m19672M == null || (emptyList = m19672M.getProvince()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        loadProvinceList(emptyList);
        TextView tvToolbarTitle = getTvToolbarTitle();
        ViewPagerCardAdapter viewPagerCardAdapter = this.f83033c;
        if (viewPagerCardAdapter != null) {
            charSequence = viewPagerCardAdapter.getPageTitle(i);
        }
        tvToolbarTitle.setText(charSequence);
    }

    public final void setRtrRx2Repository(@NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "<set-?>");
        this.rtrRx2Repository = rtrRx2Repository;
    }

    public final void setToolbar(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "<set-?>");
        this.toolbar = toolbar;
    }

    public final void setTvToolbarTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvToolbarTitle = textView;
    }

    public final void setViewPager(@NotNull WrapContentViewPager wrapContentViewPager) {
        Intrinsics.checkNotNullParameter(wrapContentViewPager, "<set-?>");
        this.viewPager = wrapContentViewPager;
    }

    /* renamed from: v */
    public final DistrictsItem m19657v() {
        Object obj;
        Object parcelable;
        Bundle arguments = getArguments();
        Parcelable parcelable2 = null;
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("ARGUMENT_DISTRICT", DistrictsItem.class);
            obj = (Parcelable) parcelable;
        } else {
            Parcelable parcelable3 = arguments.getParcelable("ARGUMENT_DISTRICT");
            if (parcelable3 instanceof DistrictsItem) {
                parcelable2 = parcelable3;
            }
            obj = (DistrictsItem) parcelable2;
        }
        return (DistrictsItem) obj;
    }

    /* renamed from: x */
    public final List m19655x(String str) {
        List<ProvinceItem> province;
        List<DistrictsItem> districts;
        Data m19672M = m19672M();
        if (m19672M != null && (province = m19672M.getProvince()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : province) {
                if (Intrinsics.areEqual(((ProvinceItem) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            ProvinceItem provinceItem = (ProvinceItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            if (provinceItem != null && (districts = provinceItem.getDistricts()) != null) {
                return districts;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: y */
    public final List m19654y(String str, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String th2 = ((DistrictsItem) obj).getTh();
                if (th2 != null && StringsKt__StringsKt.contains((CharSequence) th2, (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: z */
    public final List m19653z(String str, String str2, String str3) {
        List<ProvinceItem> province;
        List<DistrictsItem> districts;
        List<SubDistrictItem> subDistrict;
        Data m19672M = m19672M();
        if (m19672M != null && (province = m19672M.getProvince()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : province) {
                if (Intrinsics.areEqual(((ProvinceItem) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            ProvinceItem provinceItem = (ProvinceItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
            if (provinceItem != null && (districts = provinceItem.getDistricts()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : districts) {
                    if (Intrinsics.areEqual(((DistrictsItem) obj2).getId(), str2)) {
                        arrayList2.add(obj2);
                    }
                }
                DistrictsItem districtsItem = (DistrictsItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                if (districtsItem != null && (subDistrict = districtsItem.getSubDistrict()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : subDistrict) {
                        if (Intrinsics.areEqual(((SubDistrictItem) obj3).getTh(), str3)) {
                            arrayList3.add(obj3);
                        }
                    }
                    return arrayList3;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
