package th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.pre_to_post.OnePre2PostPackageGroupViewHolder;
import th.p047co.dtac.android.dtacone.databinding.OnePre2postPackageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OnePre2postPackageSetGroupBinding;
import th.p047co.dtac.android.dtacone.decorator.DynamicVerticalItemDecorator;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageSetAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "", "", "packageList", "", "setPackageList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageSetAdapter$OnClickPackage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageSetAdapter$OnClickPackage;)V", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageViewHolder;", "viewHolder", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "p", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageViewHolder;Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "I", "GROUP_VIEW", "d", "PACKAGE_VIEW", "e", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageSetAdapter$OnClickPackage;", "OnClickPackage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageSetAdapter */
/* loaded from: classes10.dex */
public final class OnePre2PostPackageSetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f94790a;

    /* renamed from: b */
    public List f94791b;

    /* renamed from: c */
    public final int f94792c;

    /* renamed from: d */
    public final int f94793d;

    /* renamed from: e */
    public OnClickPackage f94794e;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageSetAdapter$OnClickPackage;", "", "onClickPackageItem", "", "packageSet", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageSetAdapter$OnClickPackage */
    /* loaded from: classes10.dex */
    public interface OnClickPackage {
        void onClickPackageItem(@NotNull PackageSet packageSet);
    }

    public OnePre2PostPackageSetAdapter(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f94790a = mContext;
        this.f94792c = 1;
        this.f94793d = 2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m11457a(OnePre2PostPackageSetAdapter onePre2PostPackageSetAdapter, PackageSet packageSet, View view) {
        m11456b(onePre2PostPackageSetAdapter, packageSet, view);
    }

    /* renamed from: b */
    public static final void m11456b(OnePre2PostPackageSetAdapter this$0, PackageSet packageSet, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packageSet, "$packageSet");
        OnClickPackage onClickPackage = this$0.f94794e;
        Intrinsics.checkNotNull(onClickPackage);
        onClickPackage.onClickPackageItem(packageSet);
    }

    /* renamed from: c */
    public final void m11455c(OnePre2PostPackageViewHolder onePre2PostPackageViewHolder, PackageSet packageSet) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Unit unit;
        TextView tvPackageName = onePre2PostPackageViewHolder.getTvPackageName();
        String packageName = packageSet.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        tvPackageName.setText(packageName);
        TextView tvPackageName2 = onePre2PostPackageViewHolder.getTvPackageName();
        int i6 = 8;
        if (StringUtil.hasText(packageSet.getPackageName())) {
            i = 0;
        } else {
            i = 8;
        }
        tvPackageName2.setVisibility(i);
        TextView tvPrice = onePre2PostPackageViewHolder.getTvPrice();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s.-", Arrays.copyOf(new Object[]{packageSet.getMarketPrice()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        tvPrice.setText(format);
        onePre2PostPackageViewHolder.getTvVoice().setText(packageSet.getVoice());
        onePre2PostPackageViewHolder.getTvVoiceUnit().setText(packageSet.getVoiceUnit());
        LinearLayout voiceBox = onePre2PostPackageViewHolder.getVoiceBox();
        if (StringUtil.hasText(packageSet.getVoice())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        voiceBox.setVisibility(i2);
        onePre2PostPackageViewHolder.getTvWifi().setText(packageSet.getWifi());
        onePre2PostPackageViewHolder.getTvWifiUnit().setText(packageSet.getWifiUnit());
        LinearLayout wifiBox = onePre2PostPackageViewHolder.getWifiBox();
        if (StringUtil.hasText(packageSet.getWifi())) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        wifiBox.setVisibility(i3);
        onePre2PostPackageViewHolder.getTvData().setText(packageSet.getData());
        onePre2PostPackageViewHolder.getTvDataUnit().setText(packageSet.getDataUnit());
        LinearLayout callBox = onePre2PostPackageViewHolder.getCallBox();
        if (StringUtil.hasText(packageSet.getData())) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        callBox.setVisibility(i4);
        onePre2PostPackageViewHolder.getTvStorage().setText(packageSet.getStorage());
        onePre2PostPackageViewHolder.getTvStorageUnit().setText(packageSet.getStorageUnit());
        LinearLayout storeBox = onePre2PostPackageViewHolder.getStoreBox();
        if (StringUtil.hasText(packageSet.getStorage())) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        storeBox.setVisibility(i5);
        onePre2PostPackageViewHolder.getTvBillCycle().setText(packageSet.getBillCycle());
        onePre2PostPackageViewHolder.getTvBillCycleUnit().setText(packageSet.getBillCycleUnit());
        LinearLayout billBox = onePre2PostPackageViewHolder.getBillBox();
        if (StringUtil.hasText(packageSet.getBillCycle())) {
            i6 = 0;
        }
        billBox.setVisibility(i6);
        List<String> packageDescription = packageSet.getPackageDescription();
        if (packageDescription != null) {
            ViewVisibleExtKt.toVisible(onePre2PostPackageViewHolder.getRvDescList());
            OnePre2PostPackageDescAdapter onePre2PostPackageDescAdapter = new OnePre2PostPackageDescAdapter(packageDescription);
            onePre2PostPackageViewHolder.getRvDescList().setLayoutManager(new LinearLayoutManager(this.f94790a, 1, false));
            onePre2PostPackageViewHolder.getRvDescList().addItemDecoration(new DynamicVerticalItemDecorator(this.f94790a, 0, 4, 2));
            onePre2PostPackageViewHolder.getRvDescList().setAdapter(onePre2PostPackageDescAdapter);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ViewVisibleExtKt.toGone(onePre2PostPackageViewHolder.getRvDescList());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f94791b;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List list = this.f94791b;
        Intrinsics.checkNotNull(list);
        if (list.get(i) instanceof String) {
            return this.f94792c;
        }
        return this.f94793d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f94791b;
        Intrinsics.checkNotNull(list);
        Object obj = list.get(i);
        if (holder instanceof OnePre2PostPackageGroupViewHolder) {
            ((OnePre2PostPackageGroupViewHolder) holder).getTvGroup().setText(obj.toString());
            return;
        }
        OnePre2PostPackageViewHolder onePre2PostPackageViewHolder = (OnePre2PostPackageViewHolder) holder;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.postpaid.PackageSet");
        final PackageSet packageSet = (PackageSet) obj;
        m11455c(onePre2PostPackageViewHolder, packageSet);
        if (this.f94794e != null) {
            onePre2PostPackageViewHolder.getRelativeLayoutPackageBox().setOnClickListener(new View.OnClickListener() { // from class: U61
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnePre2PostPackageSetAdapter.m11457a(OnePre2PostPackageSetAdapter.this, packageSet, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == this.f94792c) {
            OnePre2postPackageSetGroupBinding inflate = OnePre2postPackageSetGroupBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new OnePre2PostPackageGroupViewHolder(inflate);
        }
        OnePre2postPackageItemRowBinding inflate2 = OnePre2postPackageItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
        return new OnePre2PostPackageViewHolder(inflate2);
    }

    public final void setListener(@Nullable OnClickPackage onClickPackage) {
        this.f94794e = onClickPackage;
    }

    public final void setPackageList(@NotNull List<? extends Object> packageList) {
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        this.f94791b = packageList;
    }
}