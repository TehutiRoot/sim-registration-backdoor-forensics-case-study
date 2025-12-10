package th.p047co.dtac.android.dtacone.adapter.settings;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.settings.OtherMenuAdapter;
import th.p047co.dtac.android.dtacone.adapter.settings.view_holder.SectionViewHolder;
import th.p047co.dtac.android.dtacone.adapter.settings.view_holder.SettingViewHolder;
import th.p047co.dtac.android.dtacone.databinding.ZOtherMenuItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZSettingSectionItemBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.OtherMenuCollection;
import th.p047co.dtac.android.dtacone.util.VersionUtil;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010%\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020#2\u0006\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020'2\u0006\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020'2\u0006\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00104¨\u00067"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/settings/OtherMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "Lth/co/dtac/android/dtacone/model/OtherMenuCollection;", "listSetting", "", "setListSetting", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Lth/co/dtac/android/dtacone/adapter/settings/OtherMenuAdapter$OnClickSetting;", "listen", "setClickListener", "(Lth/co/dtac/android/dtacone/adapter/settings/OtherMenuAdapter$OnClickSetting;)V", OperatorName.FILL_NON_ZERO, "e", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "d", "Lth/co/dtac/android/dtacone/adapter/settings/view_holder/SectionViewHolder;", "menu", OperatorName.CLOSE_PATH, "(Lth/co/dtac/android/dtacone/adapter/settings/view_holder/SectionViewHolder;Lth/co/dtac/android/dtacone/model/OtherMenuCollection;)V", "Lth/co/dtac/android/dtacone/adapter/settings/view_holder/SettingViewHolder;", "settings", OperatorName.SET_LINE_JOINSTYLE, "(Lth/co/dtac/android/dtacone/adapter/settings/view_holder/SettingViewHolder;Lth/co/dtac/android/dtacone/model/OtherMenuCollection;)V", "", OperatorName.NON_STROKING_GRAY, "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "otherMenuList", "Lth/co/dtac/android/dtacone/adapter/settings/OtherMenuAdapter$OnClickSetting;", "Companion", "OnClickSetting", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.settings.OtherMenuAdapter */
/* loaded from: classes7.dex */
public final class OtherMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81518a;

    /* renamed from: b */
    public List f81519b;

    /* renamed from: c */
    public OnClickSetting f81520c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/settings/OtherMenuAdapter$Companion;", "", "()V", "SECTION", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.settings.OtherMenuAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/settings/OtherMenuAdapter$OnClickSetting;", "", "onClickSettingItem", "", "menu", "Lth/co/dtac/android/dtacone/model/OtherMenuCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.settings.OtherMenuAdapter$OnClickSetting */
    /* loaded from: classes7.dex */
    public interface OnClickSetting {
        void onClickSettingItem(@NotNull OtherMenuCollection otherMenuCollection);
    }

    @Inject
    public OtherMenuAdapter(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81518a = activity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20241a(OtherMenuAdapter otherMenuAdapter, OtherMenuCollection otherMenuCollection, View view) {
        m20231k(otherMenuAdapter, otherMenuCollection, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20240b(OtherMenuAdapter otherMenuAdapter, OtherMenuCollection otherMenuCollection, View view) {
        m20233i(otherMenuAdapter, otherMenuCollection, view);
    }

    /* renamed from: i */
    public static final void m20233i(OtherMenuAdapter this$0, OtherMenuCollection menu, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menu, "$menu");
        OnClickSetting onClickSetting = this$0.f81520c;
        if (onClickSetting != null) {
            onClickSetting.onClickSettingItem(menu);
        }
    }

    /* renamed from: k */
    public static final void m20231k(OtherMenuAdapter this$0, OtherMenuCollection settings, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        OnClickSetting onClickSetting = this$0.f81520c;
        if (onClickSetting != null) {
            onClickSetting.onClickSettingItem(settings);
        }
    }

    /* renamed from: c */
    public final void m20239c(SettingViewHolder settingViewHolder, OtherMenuCollection otherMenuCollection) {
        if (otherMenuCollection.getSubTitle() != null) {
            ViewVisibleExtKt.toVisible(settingViewHolder.getTvSubTitle());
            settingViewHolder.getTvSubTitle().setText(otherMenuCollection.getSubTitle());
        } else if (otherMenuCollection.getIconRight() != 0) {
            ViewVisibleExtKt.toVisible(settingViewHolder.getIvIconRight());
            settingViewHolder.getIvIconRight().setImageResource(otherMenuCollection.getIconRight());
        }
    }

    /* renamed from: d */
    public final RecyclerView.ViewHolder m20238d(ViewGroup viewGroup) {
        ZSettingSectionItemBinding inflate = ZSettingSectionItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SectionViewHolder(inflate);
    }

    /* renamed from: e */
    public final RecyclerView.ViewHolder m20237e(ViewGroup viewGroup) {
        ZOtherMenuItemRowBinding inflate = ZOtherMenuItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        DtacCardView root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        ((DtacFontTextView) root.findViewById(R.id.sub_setting_title)).setText(VersionUtil.Companion.getAppVersion(this.f81518a));
        return new SettingViewHolder(inflate);
    }

    /* renamed from: f */
    public final RecyclerView.ViewHolder m20236f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return m20238d(viewGroup);
        }
        return m20237e(viewGroup);
    }

    /* renamed from: g */
    public final boolean m20235g(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof SettingViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81519b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        OtherMenuCollection otherMenuCollection;
        String section;
        List list = this.f81519b;
        int i2 = 0;
        if (list != null && (otherMenuCollection = (OtherMenuCollection) list.get(i)) != null && (section = otherMenuCollection.getSection()) != null && section.length() > 0) {
            i2 = 1;
        }
        return i2 ^ 1;
    }

    /* renamed from: h */
    public final void m20234h(SectionViewHolder sectionViewHolder, final OtherMenuCollection otherMenuCollection) {
        sectionViewHolder.getTvSection().setText(otherMenuCollection.getSection());
        sectionViewHolder.getFrameLayout().setOnClickListener(new View.OnClickListener() { // from class: pg1
            {
                OtherMenuAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherMenuAdapter.m20240b(OtherMenuAdapter.this, otherMenuCollection, view);
            }
        });
    }

    /* renamed from: j */
    public final void m20232j(SettingViewHolder settingViewHolder, final OtherMenuCollection otherMenuCollection) {
        settingViewHolder.getIvIcon().setImageResource(otherMenuCollection.getIconLeft());
        if (otherMenuCollection.getIconLeft() != R.mipmap.ic_app) {
            settingViewHolder.getIvIcon().setImageResource(otherMenuCollection.getIconLeft());
            settingViewHolder.getIvIcon().getDrawable().setColorFilter(ContextCompat.getColor(this.f81518a, R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
        }
        settingViewHolder.getTvTitle().setText(otherMenuCollection.getTitleSetting());
        settingViewHolder.getCardView().setOnClickListener(new View.OnClickListener() { // from class: og1
            {
                OtherMenuAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherMenuAdapter.m20241a(OtherMenuAdapter.this, otherMenuCollection, view);
            }
        });
        m20239c(settingViewHolder, otherMenuCollection);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        OtherMenuCollection otherMenuCollection;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f81519b;
        if (list != null) {
            otherMenuCollection = (OtherMenuCollection) list.get(i);
        } else {
            otherMenuCollection = null;
        }
        if (otherMenuCollection != null) {
            if (m20235g(holder)) {
                m20232j((SettingViewHolder) holder, otherMenuCollection);
            } else {
                m20234h((SectionViewHolder) holder, otherMenuCollection);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return m20236f(parent, i);
    }

    public final void setClickListener(@NotNull OnClickSetting listen) {
        Intrinsics.checkNotNullParameter(listen, "listen");
        this.f81520c = listen;
    }

    public final void setListSetting(@NotNull List<? extends OtherMenuCollection> listSetting) {
        Intrinsics.checkNotNullParameter(listSetting, "listSetting");
        this.f81519b = listSetting;
    }
}
