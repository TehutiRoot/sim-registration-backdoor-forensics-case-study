package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
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
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.ViewPagerCardAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneSearchView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressListFragment;
import th.p047co.dtac.android.dtacone.configuration.activity.OneMnpComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePostpaidRegistrationComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.OnePre2PostComponent;
import th.p047co.dtac.android.dtacone.model.address.AddressItem;
import th.p047co.dtac.android.dtacone.model.address.AddressItemData;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.postpaid.PostcodeRequestCollection;
import th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter;
import th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter;
import th.p047co.dtac.android.dtacone.util.ComponentUtil;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.self_update.RtrProfileActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;
import th.p047co.dtac.android.dtacone.widget.loading.DtacProgressDialog;
import th.p047co.dtac.android.dtacone.widget.view.DtacSnackbar;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¡\u0001¢\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J-\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010 J\u0017\u0010;\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b;\u0010 J\u0015\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u0010¢\u0006\u0004\b=\u0010#J\u001f\u0010@\u001a\u00020\t2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010\u0006J\u001f\u0010D\u001a\u00020\t2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>H\u0016¢\u0006\u0004\bD\u0010AJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010\u0006J\u0017\u0010G\u001a\u00020\t2\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020\t2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\tH\u0016¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010R\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\tH\u0016¢\u0006\u0004\bS\u0010\u0006R\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010c\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010x\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008c\u0001R!\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u0098\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R!\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0095\u0001R!\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0095\u0001R!\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0095\u0001R\u001a\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001¨\u0006£\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "Lth/co/dtac/android/dtacone/presenter/address/QueryAddressFromDbPresenter$View;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Lth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter$View;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "bindView", "(Landroid/view/View;)V", OperatorName.ENDPATH, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "o", "x", "", "z", "()Ljava/lang/Integer;", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "A", "()Lth/co/dtac/android/dtacone/model/address/AddressItemData;", OperatorName.SET_LINE_WIDTH, "p", OperatorName.CLOSE_AND_STROKE, "item", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lth/co/dtac/android/dtacone/model/address/AddressItemData;)V", "", "newText", "", "u", "(Ljava/lang/String;)Z", "currentItem", OperatorName.SAVE, "(I)V", PDPageLabelRange.STYLE_ROMAN_LOWER, "t", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", Constant.ServiceAPIName.onStart, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onActivityCreated", "(Landroid/os/Bundle;)V", SearchIntents.EXTRA_QUERY, "onQueryTextSubmit", "onQueryTextChange", "pageId", "setMailAddressPage", "", FirebaseAnalytics.Param.ITEMS, "onQuerySuccess", "(Ljava/util/List;)V", "onPostcodeComplete", "postCode", "onAutoPostcodeSelected", "onQueryError", "message", "onPostCodeError", "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment$OnSuccessCallback;", "callback", "setCallback", "(Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment$OnSuccessCallback;)V", "Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", "exception", "onPostcodeNotFound", "(Lth/co/dtac/android/dtacone/model/error/ServerErrorException;)V", "onDestroy", "showLoading", "dismissLoading", "Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;", "viewPager", "Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;", "getViewPager", "()Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;", "setViewPager", "(Lth/co/dtac/android/dtacone/widget/view/WrapContentViewPager;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "Landroid/widget/TextView;", "tvToolbarTitle", "Landroid/widget/TextView;", "getTvToolbarTitle", "()Landroid/widget/TextView;", "setTvToolbarTitle", "(Landroid/widget/TextView;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraint", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraint", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setConstraint", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lth/co/dtac/android/dtacone/presenter/address/QueryAddressFromDbPresenter;", "queryDbPresenter", "Lth/co/dtac/android/dtacone/presenter/address/QueryAddressFromDbPresenter;", "getQueryDbPresenter", "()Lth/co/dtac/android/dtacone/presenter/address/QueryAddressFromDbPresenter;", "setQueryDbPresenter", "(Lth/co/dtac/android/dtacone/presenter/address/QueryAddressFromDbPresenter;)V", "Lth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter;", "queryAddressApiPresenter", "Lth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter;", "getQueryAddressApiPresenter", "()Lth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter;", "setQueryAddressApiPresenter", "(Lth/co/dtac/android/dtacone/presenter/address/QueryAddressPresenter;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneSearchView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneSearchView;", "searchView", "Landroid/view/MenuItem;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/MenuItem;", "searchItem", "Lth/co/dtac/android/dtacone/adapter/ViewPagerCardAdapter;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/ViewPagerCardAdapter;", "adapter", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment;", "d", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressListFragment;", "provinceListFragment", "e", "districtListFragment", OperatorName.FILL_NON_ZERO, "subDistrictListFragment", OperatorName.NON_STROKING_GRAY, "provinceCodeListFragment", OperatorName.CLOSE_PATH, "Ljava/util/List;", "listAddress", "i", "listProvinceAddressFull", OperatorName.SET_LINE_JOINSTYLE, "listDistrictAddressFull", OperatorName.NON_STROKING_CMYK, "listSubDistrictAddressFull", OperatorName.LINE_TO, "listProvinceCodeAddressFull", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment$OnSuccessCallback;", "Companion", "OnSuccessCallback", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment */
/* loaded from: classes7.dex */
public final class OneAddressInfoDialogFragment extends BaseDialogFragment implements QueryAddressFromDbPresenter.View, SearchView.OnQueryTextListener, QueryAddressPresenter.View {

    /* renamed from: a */
    public OneSearchView f83015a;

    /* renamed from: b */
    public MenuItem f83016b;

    /* renamed from: c */
    public ViewPagerCardAdapter f83017c;
    public ConstraintLayout constraint;

    /* renamed from: d */
    public OneAddressListFragment f83018d;

    /* renamed from: e */
    public OneAddressListFragment f83019e;

    /* renamed from: f */
    public OneAddressListFragment f83020f;

    /* renamed from: g */
    public OneAddressListFragment f83021g;

    /* renamed from: h */
    public List f83022h;

    /* renamed from: i */
    public List f83023i;

    /* renamed from: j */
    public List f83024j;

    /* renamed from: k */
    public List f83025k;

    /* renamed from: l */
    public List f83026l;

    /* renamed from: m */
    public OnSuccessCallback f83027m;
    @Inject
    public QueryAddressPresenter queryAddressApiPresenter;
    @Inject
    public QueryAddressFromDbPresenter queryDbPresenter;
    public Toolbar toolbar;
    public TextView tvToolbarTitle;
    public WrapContentViewPager viewPager;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment$Companion;", "", "()V", "ARGUMENT_DISTRICT", "", "ARGUMENT_POSTCODE", "ARGUMENT_PROVINCE", "ARGUMENT_SHOW_PAGE", "ARGUMENT_SUB_DISTRICT", "DISTRICT", "", "PROVINCE", "PROVINCE_CODE", "SEARCH_MENU", "SUB_DISTRICT", "WITH_ONLINE_METHOD", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment;", "showPage", "province", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "district", "subDistrict", "withOnlineMethod", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ OneAddressInfoDialogFragment newInstance$default(Companion companion, int i, AddressItemData addressItemData, AddressItemData addressItemData2, AddressItemData addressItemData3, boolean z, int i2, Object obj) {
            boolean z2;
            if ((i2 & 16) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            return companion.newInstance(i, addressItemData, addressItemData2, addressItemData3, z2);
        }

        @NotNull
        public final OneAddressInfoDialogFragment newInstance(int i, @Nullable AddressItemData addressItemData, @Nullable AddressItemData addressItemData2, @Nullable AddressItemData addressItemData3, boolean z) {
            Bundle bundle = new Bundle();
            OneAddressInfoDialogFragment oneAddressInfoDialogFragment = new OneAddressInfoDialogFragment();
            bundle.putInt("ARGUMENT_SHOW_PAGE", i);
            bundle.putParcelable("ARGUMENT_PROVINCE", addressItemData);
            bundle.putParcelable("ARGUMENT_DISTRICT", addressItemData2);
            bundle.putParcelable("ARGUMENT_SUB_DISTRICT", addressItemData3);
            bundle.putBoolean("WITH_ONLINE_METHOD", z);
            oneAddressInfoDialogFragment.setArguments(bundle);
            return oneAddressInfoDialogFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment$OnSuccessCallback;", "", "onSuccessSelectAddress", "", "province", "Lth/co/dtac/android/dtacone/model/address/AddressItemData;", "districtList", "subDistrict", "postCode", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment$OnSuccessCallback */
    /* loaded from: classes7.dex */
    public interface OnSuccessCallback {
        void onSuccessSelectAddress(@Nullable AddressItemData addressItemData, @Nullable AddressItemData addressItemData2, @Nullable AddressItemData addressItemData3, @Nullable AddressItemData addressItemData4);
    }

    public static final /* synthetic */ ViewPagerCardAdapter access$getAdapter$p(OneAddressInfoDialogFragment oneAddressInfoDialogFragment) {
        return oneAddressInfoDialogFragment.f83017c;
    }

    public static final /* synthetic */ void access$getAllAddressFromApi(OneAddressInfoDialogFragment oneAddressInfoDialogFragment, int i) {
        oneAddressInfoDialogFragment.m19694q(i);
    }

    public static final /* synthetic */ void access$getAllAddressFromDb(OneAddressInfoDialogFragment oneAddressInfoDialogFragment, int i) {
        oneAddressInfoDialogFragment.m19693r(i);
    }

    public static final /* synthetic */ OneSearchView access$getSearchView$p(OneAddressInfoDialogFragment oneAddressInfoDialogFragment) {
        return oneAddressInfoDialogFragment.f83015a;
    }

    public static final /* synthetic */ boolean access$isRtrProfile(OneAddressInfoDialogFragment oneAddressInfoDialogFragment) {
        return oneAddressInfoDialogFragment.m19691t();
    }

    private final void bindView(View view) {
        View findViewById = view.findViewById(R.id.viewPager);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.viewPager)");
        setViewPager((WrapContentViewPager) findViewById);
        View findViewById2 = view.findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.toolbar)");
        setToolbar((Toolbar) findViewById2);
        View findViewById3 = view.findViewById(R.id.tv_toolbar_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.tv_toolbar_title)");
        setTvToolbarTitle((TextView) findViewById3);
        View findViewById4 = view.findViewById(R.id.constraint);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.constraint)");
        setConstraint((ConstraintLayout) findViewById4);
    }

    /* renamed from: o */
    private final void m19696o() {
        ViewPagerCardAdapter viewPagerCardAdapter = new ViewPagerCardAdapter(getChildFragmentManager());
        this.f83017c = viewPagerCardAdapter;
        viewPagerCardAdapter.addFragmentCard(this.f83018d, "เลือกจังหวัด");
        viewPagerCardAdapter.addFragmentCard(this.f83019e, "เลือกเขต/อำเภอ");
        viewPagerCardAdapter.addFragmentCard(this.f83020f, "เลือกแขวง/ตำบล");
        viewPagerCardAdapter.addFragmentCard(this.f83021g, "เลือกรหัสไปรษณีย์");
        getViewPager().setAllowedSwipeDirection(WrapContentViewPager.SwipeDirection.LEFT);
        getViewPager().setAdapter(this.f83017c);
        getViewPager().addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment$configurationViewPager$2
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                CharSequence charSequence;
                TextView tvToolbarTitle = OneAddressInfoDialogFragment.this.getTvToolbarTitle();
                ViewPagerCardAdapter access$getAdapter$p = OneAddressInfoDialogFragment.access$getAdapter$p(OneAddressInfoDialogFragment.this);
                if (access$getAdapter$p != null) {
                    charSequence = access$getAdapter$p.getPageTitle(i);
                } else {
                    charSequence = null;
                }
                tvToolbarTitle.setText(charSequence);
                if (OneAddressInfoDialogFragment.access$isRtrProfile(OneAddressInfoDialogFragment.this)) {
                    OneAddressInfoDialogFragment.access$getAllAddressFromApi(OneAddressInfoDialogFragment.this, i);
                } else {
                    OneAddressInfoDialogFragment.access$getAllAddressFromDb(OneAddressInfoDialogFragment.this, i);
                }
                OneSearchView access$getSearchView$p = OneAddressInfoDialogFragment.access$getSearchView$p(OneAddressInfoDialogFragment.this);
                if (access$getSearchView$p != null) {
                    access$getSearchView$p.clearEditText();
                }
            }
        });
    }

    /* renamed from: A */
    public final AddressItemData m19698A() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (AddressItemData) arguments.getParcelable("ARGUMENT_SUB_DISTRICT");
        }
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.ILoadingViewable
    public void dismissLoading() {
        DtacProgressDialog.cancel(getContext());
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
    public final QueryAddressPresenter getQueryAddressApiPresenter() {
        QueryAddressPresenter queryAddressPresenter = this.queryAddressApiPresenter;
        if (queryAddressPresenter != null) {
            return queryAddressPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queryAddressApiPresenter");
        return null;
    }

    @NotNull
    public final QueryAddressFromDbPresenter getQueryDbPresenter() {
        QueryAddressFromDbPresenter queryAddressFromDbPresenter = this.queryDbPresenter;
        if (queryAddressFromDbPresenter != null) {
            return queryAddressFromDbPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queryDbPresenter");
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

    /* renamed from: n */
    public final void m19697n() {
        OneAddressListFragment.Companion companion = OneAddressListFragment.Companion;
        this.f83018d = companion.newInstance(0);
        this.f83019e = companion.newInstance(1);
        this.f83020f = companion.newInstance(2);
        this.f83021g = companion.newInstance(3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        m19697n();
        m19696o();
        m19686y();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof OnePostpaidRegistrationActivity) {
            ((OnePostpaidRegistrationComponent) ComponentUtil.getActivityComponent(getActivity(), OnePostpaidRegistrationComponent.class)).inject(this);
        } else if (activity instanceof OnePre2PostActivity) {
            ((OnePre2PostComponent) ComponentUtil.getActivityComponent(getActivity(), OnePre2PostComponent.class)).inject(this);
        } else if (activity instanceof OneMnpActivity) {
            ((OneMnpComponent) ComponentUtil.getActivityComponent(getActivity(), OneMnpComponent.class)).inject(this);
        } else {
            ((OnePostpaidRegistrationComponent) ComponentUtil.getActivityComponent(getActivity(), OnePostpaidRegistrationComponent.class)).inject(this);
        }
        getQueryDbPresenter().attachView(this);
        getQueryAddressApiPresenter().attachView(this);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter.View, th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onAutoPostcodeSelected(@Nullable List<AddressItemData> list) {
        AddressItemData addressItemData;
        if (list != null) {
            addressItemData = (AddressItemData) CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
        } else {
            addressItemData = null;
        }
        m19689v(addressItemData);
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
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
        bindView(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getQueryDbPresenter().onDestroy();
        super.onDestroy();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onGetPostCodeListSuccess() {
        QueryAddressPresenter.View.DefaultImpls.onGetPostCodeListSuccess(this);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter.View, th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onPostCodeError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        DtacSnackbar.snackbar(getConstraint(), message, getContext(), 0).show();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter.View, th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onPostcodeComplete() {
        getViewPager().setCurrentItem(3);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onPostcodeNotFound(@NotNull ServerErrorException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onQueryAddressSuccess(@Nullable AddressItem addressItem) {
        QueryAddressPresenter.View.DefaultImpls.onQueryAddressSuccess(this, addressItem);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter.View, th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onQueryError() {
        ConstraintLayout constraint = getConstraint();
        String string = getString(R.string.server_error_try_again);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_error_try_again)");
        DtacSnackbar.snackbar(constraint, string, getContext(), 0).show();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter.View, th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter.View
    public void onQuerySuccess(@Nullable List<AddressItemData> list) {
        int currentItem = getViewPager().getCurrentItem();
        if (currentItem != 0) {
            if (currentItem != 1) {
                if (currentItem != 2) {
                    if (currentItem == 3) {
                        List list2 = this.f83026l;
                        if (list2 == null || list2.isEmpty()) {
                            this.f83026l = list;
                        }
                        OneAddressListFragment oneAddressListFragment = this.f83021g;
                        if (oneAddressListFragment != null) {
                            oneAddressListFragment.setItems(list);
                        }
                    }
                } else {
                    List list3 = this.f83025k;
                    if (list3 == null || list3.isEmpty()) {
                        this.f83025k = list;
                    }
                    OneAddressListFragment oneAddressListFragment2 = this.f83020f;
                    if (oneAddressListFragment2 != null) {
                        oneAddressListFragment2.setItems(list);
                    }
                }
            } else {
                List list4 = this.f83024j;
                if (list4 == null || list4.isEmpty()) {
                    this.f83024j = list;
                }
                OneAddressListFragment oneAddressListFragment3 = this.f83019e;
                if (oneAddressListFragment3 != null) {
                    oneAddressListFragment3.setItems(list);
                }
            }
        } else {
            List list5 = this.f83023i;
            if (list5 == null || list5.isEmpty()) {
                this.f83023i = list;
            }
            OneAddressListFragment oneAddressListFragment4 = this.f83018d;
            if (oneAddressListFragment4 != null) {
                oneAddressListFragment4.setItems(list);
            }
        }
        this.f83022h = list;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(@NotNull String newText) {
        List<AddressItemData> list;
        String str;
        String str2;
        AddressItemData selectedItem;
        AddressItemData selectedItem2;
        AddressItemData selectedItem3;
        AddressItemData selectedItem4;
        boolean z;
        Intrinsics.checkNotNullParameter(newText, "newText");
        int currentItem = getViewPager().getCurrentItem();
        OneSearchView oneSearchView = this.f83015a;
        if (oneSearchView != null && oneSearchView != null) {
            if (currentItem != 3) {
                z = true;
            } else {
                z = false;
            }
            oneSearchView.setEnabled(z);
        }
        int currentItem2 = getViewPager().getCurrentItem();
        if (currentItem2 != 0) {
            if (currentItem2 != 1) {
                if (currentItem2 != 2) {
                    if (currentItem2 != 3) {
                        list = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        list = this.f83026l;
                    }
                } else {
                    list = this.f83025k;
                }
            } else {
                list = this.f83024j;
            }
        } else {
            list = this.f83023i;
        }
        Long l = null;
        if (m19691t()) {
            if (m19690u(newText)) {
                m19694q(currentItem);
            } else {
                getQueryAddressApiPresenter().getAddressFilter(newText, list);
            }
            if (m19690u(newText) && currentItem == 3) {
                QueryAddressPresenter queryAddressApiPresenter = getQueryAddressApiPresenter();
                OneAddressListFragment oneAddressListFragment = this.f83019e;
                if (oneAddressListFragment != null && (selectedItem4 = oneAddressListFragment.getSelectedItem()) != null) {
                    l = selectedItem4.getId();
                }
                Intrinsics.checkNotNull(l);
                queryAddressApiPresenter.getPostcodeFromEdms(l.longValue());
            }
        } else {
            if (m19690u(newText)) {
                m19693r(currentItem);
            } else {
                onQuerySuccess(getQueryDbPresenter().searchAddress(newText, list));
            }
            if (m19690u(newText) && currentItem == 3) {
                OneAddressListFragment oneAddressListFragment2 = this.f83019e;
                if (oneAddressListFragment2 != null && (selectedItem3 = oneAddressListFragment2.getSelectedItem()) != null) {
                    str = selectedItem3.getValue();
                } else {
                    str = null;
                }
                OneAddressListFragment oneAddressListFragment3 = this.f83018d;
                if (oneAddressListFragment3 != null && (selectedItem2 = oneAddressListFragment3.getSelectedItem()) != null) {
                    str2 = selectedItem2.getValue();
                } else {
                    str2 = null;
                }
                PostcodeRequestCollection postcodeRequestCollection = new PostcodeRequestCollection(str, str2);
                QueryAddressPresenter queryAddressApiPresenter2 = getQueryAddressApiPresenter();
                OneAddressListFragment oneAddressListFragment4 = this.f83020f;
                if (oneAddressListFragment4 != null && (selectedItem = oneAddressListFragment4.getSelectedItem()) != null) {
                    l = selectedItem.getId();
                }
                queryAddressApiPresenter2.getMrtrPostcodeWithCache(l, postcodeRequestCollection);
            }
        }
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
        m19687x();
    }

    /* renamed from: p */
    public final AddressItemData m19695p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (AddressItemData) arguments.getParcelable("ARGUMENT_DISTRICT");
        }
        return null;
    }

    /* renamed from: q */
    public final void m19694q(int i) {
        AddressItemData selectedItem;
        AddressItemData selectedItem2;
        if (i != 0) {
            Long l = null;
            if (i != 1) {
                if (i == 2) {
                    QueryAddressPresenter queryAddressApiPresenter = getQueryAddressApiPresenter();
                    OneAddressListFragment oneAddressListFragment = this.f83019e;
                    if (oneAddressListFragment != null && (selectedItem2 = oneAddressListFragment.getSelectedItem()) != null) {
                        l = selectedItem2.getId();
                    }
                    Intrinsics.checkNotNull(l);
                    queryAddressApiPresenter.getSubDistrictFromEdms(l.longValue());
                    return;
                }
                return;
            }
            QueryAddressPresenter queryAddressApiPresenter2 = getQueryAddressApiPresenter();
            OneAddressListFragment oneAddressListFragment2 = this.f83018d;
            if (oneAddressListFragment2 != null && (selectedItem = oneAddressListFragment2.getSelectedItem()) != null) {
                l = selectedItem.getId();
            }
            Intrinsics.checkNotNull(l);
            queryAddressApiPresenter2.getDistrictFromEdms(l.longValue());
            return;
        }
        getQueryAddressApiPresenter().getProvinceFromEdms();
    }

    /* renamed from: r */
    public final void m19693r(int i) {
        AddressItemData selectedItem;
        AddressItemData selectedItem2;
        if (i != 0) {
            Long l = null;
            if (i != 1) {
                if (i == 2) {
                    QueryAddressFromDbPresenter queryDbPresenter = getQueryDbPresenter();
                    OneAddressListFragment oneAddressListFragment = this.f83019e;
                    if (oneAddressListFragment != null && (selectedItem2 = oneAddressListFragment.getSelectedItem()) != null) {
                        l = selectedItem2.getId();
                    }
                    queryDbPresenter.getSubDistrict(l);
                    return;
                }
                return;
            }
            QueryAddressFromDbPresenter queryDbPresenter2 = getQueryDbPresenter();
            OneAddressListFragment oneAddressListFragment2 = this.f83018d;
            if (oneAddressListFragment2 != null && (selectedItem = oneAddressListFragment2.getSelectedItem()) != null) {
                l = selectedItem.getId();
            }
            queryDbPresenter2.getDistrict(l);
            return;
        }
        getQueryDbPresenter().getProvince();
    }

    /* renamed from: s */
    public final void m19692s() {
        String str;
        String str2;
        String str3;
        String str4;
        AddressItemData selectedItem;
        AddressItemData selectedItem2;
        AddressItemData selectedItem3;
        AddressItemData selectedItem4;
        AddressItemData selectedItem5;
        AddressItemData selectedItem6;
        OneAddressListFragment oneAddressListFragment = this.f83019e;
        Long l = null;
        if (oneAddressListFragment != null && (selectedItem6 = oneAddressListFragment.getSelectedItem()) != null) {
            str = selectedItem6.getValue();
        } else {
            str = null;
        }
        if (str != null) {
            OneAddressListFragment oneAddressListFragment2 = this.f83018d;
            if (oneAddressListFragment2 != null && (selectedItem5 = oneAddressListFragment2.getSelectedItem()) != null) {
                str2 = selectedItem5.getValue();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                OneAddressListFragment oneAddressListFragment3 = this.f83019e;
                if (oneAddressListFragment3 != null && (selectedItem4 = oneAddressListFragment3.getSelectedItem()) != null) {
                    str3 = selectedItem4.getValue();
                } else {
                    str3 = null;
                }
                OneAddressListFragment oneAddressListFragment4 = this.f83018d;
                if (oneAddressListFragment4 != null && (selectedItem3 = oneAddressListFragment4.getSelectedItem()) != null) {
                    str4 = selectedItem3.getValue();
                } else {
                    str4 = null;
                }
                PostcodeRequestCollection postcodeRequestCollection = new PostcodeRequestCollection(str3, str4);
                if (m19691t()) {
                    QueryAddressPresenter queryAddressApiPresenter = getQueryAddressApiPresenter();
                    OneAddressListFragment oneAddressListFragment5 = this.f83019e;
                    if (oneAddressListFragment5 != null && (selectedItem2 = oneAddressListFragment5.getSelectedItem()) != null) {
                        l = selectedItem2.getId();
                    }
                    Intrinsics.checkNotNull(l);
                    queryAddressApiPresenter.getPostcodeFromEdms(l.longValue());
                    return;
                }
                QueryAddressPresenter queryAddressApiPresenter2 = getQueryAddressApiPresenter();
                OneAddressListFragment oneAddressListFragment6 = this.f83019e;
                if (oneAddressListFragment6 != null && (selectedItem = oneAddressListFragment6.getSelectedItem()) != null) {
                    l = selectedItem.getId();
                }
                queryAddressApiPresenter2.getMrtrPostcodeWithCache(l, postcodeRequestCollection);
            }
        }
    }

    public final void setCallback(@NotNull OnSuccessCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f83027m = callback;
    }

    public final void setConstraint(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.constraint = constraintLayout;
    }

    public final void setMailAddressPage(int i) {
        if (i == 3) {
            m19692s();
            return;
        }
        MenuItem menuItem = this.f83016b;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
        getViewPager().setCurrentItem(i);
        CharSequence charSequence = null;
        if (i != 0) {
            if (i == 4) {
                m19689v(null);
                return;
            }
            return;
        }
        if (m19691t()) {
            getQueryAddressApiPresenter().getProvinceFromEdms();
        } else {
            getQueryDbPresenter().getProvince();
        }
        TextView tvToolbarTitle = getTvToolbarTitle();
        ViewPagerCardAdapter viewPagerCardAdapter = this.f83017c;
        if (viewPagerCardAdapter != null) {
            charSequence = viewPagerCardAdapter.getPageTitle(i);
        }
        tvToolbarTitle.setText(charSequence);
    }

    public final void setQueryAddressApiPresenter(@NotNull QueryAddressPresenter queryAddressPresenter) {
        Intrinsics.checkNotNullParameter(queryAddressPresenter, "<set-?>");
        this.queryAddressApiPresenter = queryAddressPresenter;
    }

    public final void setQueryDbPresenter(@NotNull QueryAddressFromDbPresenter queryAddressFromDbPresenter) {
        Intrinsics.checkNotNullParameter(queryAddressFromDbPresenter, "<set-?>");
        this.queryDbPresenter = queryAddressFromDbPresenter;
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

    @Override // th.p047co.dtac.android.dtacone.presenter.ILoadingViewable
    public void showLoading() {
        DtacProgressDialog.show(getContext());
    }

    /* renamed from: t */
    public final boolean m19691t() {
        return getActivity() instanceof RtrProfileActivity;
    }

    /* renamed from: u */
    public final boolean m19690u(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void m19689v(AddressItemData addressItemData) {
        AddressItemData addressItemData2;
        AddressItemData addressItemData3;
        AddressItemData addressItemData4;
        dismiss();
        OnSuccessCallback onSuccessCallback = this.f83027m;
        if (onSuccessCallback != null) {
            OneAddressListFragment oneAddressListFragment = this.f83018d;
            if (oneAddressListFragment != null) {
                addressItemData2 = oneAddressListFragment.getSelectedItem();
            } else {
                addressItemData2 = null;
            }
            OneAddressListFragment oneAddressListFragment2 = this.f83019e;
            if (oneAddressListFragment2 != null) {
                addressItemData3 = oneAddressListFragment2.getSelectedItem();
            } else {
                addressItemData3 = null;
            }
            OneAddressListFragment oneAddressListFragment3 = this.f83020f;
            if (oneAddressListFragment3 != null) {
                addressItemData4 = oneAddressListFragment3.getSelectedItem();
            } else {
                addressItemData4 = null;
            }
            if (addressItemData == null) {
                OneAddressListFragment oneAddressListFragment4 = this.f83021g;
                if (oneAddressListFragment4 != null) {
                    addressItemData = oneAddressListFragment4.getSelectedItem();
                } else {
                    addressItemData = null;
                }
            }
            onSuccessCallback.onSuccessSelectAddress(addressItemData2, addressItemData3, addressItemData4, addressItemData);
        }
    }

    /* renamed from: w */
    public final AddressItemData m19688w() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (AddressItemData) arguments.getParcelable("ARGUMENT_PROVINCE");
        }
        return null;
    }

    /* renamed from: x */
    public final void m19687x() {
        Integer m19685z;
        Integer m19685z2;
        Integer m19685z3;
        if (m19688w() != null && ((m19685z = m19685z()) == null || m19685z.intValue() != 0)) {
            OneAddressListFragment oneAddressListFragment = this.f83018d;
            if (oneAddressListFragment != null) {
                oneAddressListFragment.setSelectedItem(m19688w());
            }
            if (m19695p() != null && ((m19685z2 = m19685z()) == null || m19685z2.intValue() != 1)) {
                OneAddressListFragment oneAddressListFragment2 = this.f83019e;
                if (oneAddressListFragment2 != null) {
                    oneAddressListFragment2.setSelectedItem(m19695p());
                }
                if (m19698A() != null && ((m19685z3 = m19685z()) == null || m19685z3.intValue() != 2)) {
                    OneAddressListFragment oneAddressListFragment3 = this.f83020f;
                    if (oneAddressListFragment3 != null) {
                        oneAddressListFragment3.setSelectedItem(m19698A());
                    }
                    m19692s();
                    return;
                }
                setMailAddressPage(2);
                return;
            }
            setMailAddressPage(1);
            return;
        }
        setMailAddressPage(0);
    }

    /* renamed from: y */
    public final void m19686y() {
        View view;
        ImageView clearButton;
        TextView tvSearchText;
        TextView tvSearchText2;
        getToolbar().inflateMenu(R.menu.one_mailing_search_menu);
        getToolbar().setLayoutTransition(new LayoutTransition());
        MenuItem findItem = getToolbar().getMenu().findItem(R.id.searchView);
        this.f83016b = findItem;
        OneSearchView oneSearchView = null;
        if (findItem != null) {
            view = findItem.getActionView();
        } else {
            view = null;
        }
        if (view instanceof OneSearchView) {
            oneSearchView = (OneSearchView) view;
        }
        this.f83015a = oneSearchView;
        if (oneSearchView != null) {
            oneSearchView.setBackgroundResource(R.drawable.background_one_button_gray);
        }
        OneSearchView oneSearchView2 = this.f83015a;
        if (oneSearchView2 != null && (tvSearchText2 = oneSearchView2.getTvSearchText()) != null) {
            tvSearchText2.setTextColor(ContextCompat.getColor(requireContext(), R.color.jet_back));
        }
        OneSearchView oneSearchView3 = this.f83015a;
        if (oneSearchView3 != null && (tvSearchText = oneSearchView3.getTvSearchText()) != null) {
            tvSearchText.setHintTextColor(ContextCompat.getColor(requireContext(), R.color.colorGray));
        }
        OneSearchView oneSearchView4 = this.f83015a;
        if (oneSearchView4 != null && (clearButton = oneSearchView4.getClearButton()) != null) {
            clearButton.setImageResource(R.drawable.ic_clear_text);
        }
        OneSearchView oneSearchView5 = this.f83015a;
        if (oneSearchView5 != null) {
            oneSearchView5.setOnQueryTextListener(this);
        }
    }

    /* renamed from: z */
    public final Integer m19685z() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("ARGUMENT_SHOW_PAGE"));
        }
        return null;
    }
}
