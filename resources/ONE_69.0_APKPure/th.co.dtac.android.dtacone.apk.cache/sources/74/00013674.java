package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.postpaid_package.OnePostpaidPackageGroupViewHolder;
import th.p047co.dtac.android.dtacone.databinding.OnePostpaidPackageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OnePostpaidPackageSetGroupBinding;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSet;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidPackageSetAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.viewholder.OnePackageViewHolder;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010,\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPackageSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "", "", "packageList", "", "setPackageList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPackageSetAdapter$OnClickPackage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPackageSetAdapter$OnClickPackage;)V", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/viewholder/OnePackageViewHolder;", "viewHolder", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "p", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/viewholder/OnePackageViewHolder;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "I", "GROUP_VIEW", "d", "PACKAGE_VIEW", "e", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPackageSetAdapter$OnClickPackage;", "OnClickPackage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidPackageSetAdapter */
/* loaded from: classes10.dex */
public final class OnePostpaidPackageSetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f93299a;

    /* renamed from: b */
    public List f93300b;

    /* renamed from: c */
    public final int f93301c;

    /* renamed from: d */
    public final int f93302d;

    /* renamed from: e */
    public OnClickPackage f93303e;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPackageSetAdapter$OnClickPackage;", "", "onClickPackageItem", "", "packageSet", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidPackageSetAdapter$OnClickPackage */
    /* loaded from: classes10.dex */
    public interface OnClickPackage {
        void onClickPackageItem(@NotNull OnePostpaidPackageSet onePostpaidPackageSet);
    }

    public OnePostpaidPackageSetAdapter(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f93299a = mContext;
        this.f93301c = 1;
        this.f93302d = 2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m12694a(OnePostpaidPackageSetAdapter onePostpaidPackageSetAdapter, OnePostpaidPackageSet onePostpaidPackageSet, View view) {
        m12693b(onePostpaidPackageSetAdapter, onePostpaidPackageSet, view);
    }

    /* renamed from: b */
    public static final void m12693b(OnePostpaidPackageSetAdapter this$0, OnePostpaidPackageSet packageSet, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packageSet, "$packageSet");
        OnClickPackage onClickPackage = this$0.f93303e;
        if (onClickPackage != null) {
            onClickPackage.onClickPackageItem(packageSet);
        }
    }

    /* renamed from: c */
    public final void m12692c(OnePackageViewHolder onePackageViewHolder, OnePostpaidPackageSet onePostpaidPackageSet) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TextView tvPackageName = onePackageViewHolder.getTvPackageName();
        String packageName = onePostpaidPackageSet.getPackageName();
        String str = "";
        if (packageName == null) {
            packageName = "";
        }
        tvPackageName.setText(packageName);
        onePackageViewHolder.getTvPrice().setText(onePostpaidPackageSet.getMarketPrice() + ".-");
        onePackageViewHolder.getTvVoice().setText(onePostpaidPackageSet.getVoice());
        onePackageViewHolder.getTvVoiceUnit().setText(onePostpaidPackageSet.getVoiceUnit());
        LinearLayout voiceBox = onePackageViewHolder.getVoiceBox();
        if (StringUtil.hasText(onePostpaidPackageSet.getVoice())) {
            i = 0;
        } else {
            i = 8;
        }
        voiceBox.setVisibility(i);
        onePackageViewHolder.getTvWifi().setText(onePostpaidPackageSet.getWifi());
        onePackageViewHolder.getTvWifiUnit().setText(onePostpaidPackageSet.getWifiUnit());
        LinearLayout wifiBox = onePackageViewHolder.getWifiBox();
        if (StringUtil.hasText(onePostpaidPackageSet.getWifi())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        wifiBox.setVisibility(i2);
        onePackageViewHolder.getTvData().setText(onePostpaidPackageSet.getData());
        onePackageViewHolder.getTvDataUnit().setText(onePostpaidPackageSet.getDataUnit());
        LinearLayout callBox = onePackageViewHolder.getCallBox();
        if (StringUtil.hasText(onePostpaidPackageSet.getData())) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        callBox.setVisibility(i3);
        onePackageViewHolder.getTvStorage().setText(onePostpaidPackageSet.getStorage());
        onePackageViewHolder.getTvStorageUnit().setText(onePostpaidPackageSet.getStorageUnit());
        LinearLayout storeBox = onePackageViewHolder.getStoreBox();
        if (StringUtil.hasText(onePostpaidPackageSet.getStorage())) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        storeBox.setVisibility(i4);
        onePackageViewHolder.getTvBillCycle().setText(onePostpaidPackageSet.getBillCycle());
        onePackageViewHolder.getTvBillCycleUnit().setText(onePostpaidPackageSet.getBillCycleUnit());
        LinearLayout billBox = onePackageViewHolder.getBillBox();
        if (StringUtil.hasText(onePostpaidPackageSet.getBillCycle())) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        billBox.setVisibility(i5);
        List<String> packageDescription = onePostpaidPackageSet.getPackageDescription();
        List<String> list = packageDescription;
        if (list != null && !list.isEmpty()) {
            onePackageViewHolder.getTvDescription().setVisibility(0);
            int i6 = 0;
            for (String str2 : packageDescription) {
                i6++;
                if (StringUtil.hasText(str2)) {
                    str = str + this.f93299a.getString(R.string.dot) + "      " + str2;
                    if (packageDescription.size() != i6) {
                        str = str + "\n";
                    }
                }
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(Z21.m65266a(32), 0, str.length(), 33);
            onePackageViewHolder.getTvDescription().setText(spannableString);
            return;
        }
        onePackageViewHolder.getTvDescription().setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f93300b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Object obj;
        List list = this.f93300b;
        if (list != null) {
            obj = list.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            return this.f93301c;
        }
        return this.f93302d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @RequiresApi(29)
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f93300b;
        if (list != null) {
            obj = list.get(i);
        } else {
            obj = null;
        }
        if (holder instanceof OnePostpaidPackageGroupViewHolder) {
            ((OnePostpaidPackageGroupViewHolder) holder).getTvGroup().setText(String.valueOf(obj));
        } else if (holder instanceof OnePackageViewHolder) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSet");
            final OnePostpaidPackageSet onePostpaidPackageSet = (OnePostpaidPackageSet) obj;
            OnePackageViewHolder onePackageViewHolder = (OnePackageViewHolder) holder;
            m12692c(onePackageViewHolder, onePostpaidPackageSet);
            onePackageViewHolder.getRelativeLayoutPackageBox().setOnClickListener(new View.OnClickListener() { // from class: a31
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnePostpaidPackageSetAdapter.m12694a(OnePostpaidPackageSetAdapter.this, onePostpaidPackageSet, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == this.f93301c) {
            OnePostpaidPackageSetGroupBinding inflate = OnePostpaidPackageSetGroupBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new OnePostpaidPackageGroupViewHolder(inflate);
        }
        OnePostpaidPackageItemRowBinding inflate2 = OnePostpaidPackageItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
        return new OnePackageViewHolder(inflate2);
    }

    public final void setListener(@NotNull OnClickPackage listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f93303e = listener;
    }

    public final void setPackageList(@NotNull List<? extends Object> packageList) {
        Intrinsics.checkNotNullParameter(packageList, "packageList");
        this.f93300b = packageList;
    }
}