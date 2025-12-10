package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.Data;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.ListStaffResponse;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.OneManageStaffThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.StaffsItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/ListStaffResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$initViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneStaffListFragment$initViewModel$1$1 extends Lambda implements Function1<Resource<? extends ListStaffResponse>, Unit> {
    final /* synthetic */ OneStaffListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$initViewModel$1$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffListFragment$initViewModel$1$1(OneStaffListFragment oneStaffListFragment) {
        super(1);
        this.this$0 = oneStaffListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ListStaffResponse> resource) {
        invoke2((Resource<ListStaffResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ListStaffResponse> resource) {
        List<StaffsItem> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TextView textView;
        LinearLayoutCompat linearLayoutCompat;
        OneHomeActivity m9915s;
        LinearLayoutCompat linearLayoutCompat2;
        AppCompatImageView appCompatImageView;
        TextView textView2;
        OneStaffAdapter oneStaffAdapter;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        AppCompatImageView appCompatImageView2;
        TextView textView3;
        Data data;
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            this.this$0.showSecondaryLoading();
        } else if (i != 2) {
            this.this$0.dismissSecondaryLoading();
        } else {
            this.this$0.dismissSecondaryLoading();
            ListStaffResponse data2 = resource.getData();
            if (data2 == null || (data = data2.getData()) == null || (arrayList = data.getStaffs()) == null) {
                arrayList = new ArrayList<>();
            }
            arrayList2 = this.this$0.f97333q;
            arrayList2.clear();
            arrayList3 = this.this$0.f97333q;
            arrayList3.addAll(arrayList);
            textView = this.this$0.f97328l;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvListStaffNumber");
                textView = null;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.this$0.getString(R.string.one_add_new_staff_list_number);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.one_add_new_staff_list_number)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
            if (arrayList.size() >= 20) {
                linearLayoutCompat3 = this.this$0.f97325i;
                if (linearLayoutCompat3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnAddNewStaff");
                    linearLayoutCompat3 = null;
                }
                linearLayoutCompat3.setEnabled(false);
                linearLayoutCompat4 = this.this$0.f97325i;
                if (linearLayoutCompat4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnAddNewStaff");
                    linearLayoutCompat4 = null;
                }
                linearLayoutCompat4.setBackgroundResource(R.drawable.one_bg_white_button_disable);
                appCompatImageView2 = this.this$0.f97330n;
                if (appCompatImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivAddNewStaff");
                    appCompatImageView2 = null;
                }
                appCompatImageView2.setImageResource(R.drawable.ic_one_add_disable);
                textView3 = this.this$0.f97331o;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvAddNewStaff");
                    textView3 = null;
                }
                textView3.setTextColor(ResourcesCompat.getColor(this.this$0.getResources(), R.color.warmGray, null));
            } else {
                linearLayoutCompat = this.this$0.f97325i;
                if (linearLayoutCompat == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnAddNewStaff");
                    linearLayoutCompat = null;
                }
                linearLayoutCompat.setEnabled(true);
                m9915s = this.this$0.m9915s();
                OneManageStaffThemeColorModel oneManageStaffThemeColorModel = m9915s.getOneManageStaffThemeColorModel();
                OneStaffListFragment oneStaffListFragment = this.this$0;
                linearLayoutCompat2 = oneStaffListFragment.f97325i;
                if (linearLayoutCompat2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnAddNewStaff");
                    linearLayoutCompat2 = null;
                }
                linearLayoutCompat2.setBackgroundResource(oneManageStaffThemeColorModel.getButtonDeleteBackground());
                appCompatImageView = oneStaffListFragment.f97330n;
                if (appCompatImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivAddNewStaff");
                    appCompatImageView = null;
                }
                appCompatImageView.setImageResource(oneManageStaffThemeColorModel.getIconAddNewStaff());
                textView2 = oneStaffListFragment.f97331o;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvAddNewStaff");
                    textView2 = null;
                }
                textView2.setTextColor(ResourcesCompat.getColor(oneStaffListFragment.getResources(), oneManageStaffThemeColorModel.getFontAddNewStaffColor(), null));
            }
            oneStaffAdapter = this.this$0.f97334r;
            if (oneStaffAdapter != null) {
                oneStaffAdapter.notifyDataSetChanged();
            }
        }
    }
}