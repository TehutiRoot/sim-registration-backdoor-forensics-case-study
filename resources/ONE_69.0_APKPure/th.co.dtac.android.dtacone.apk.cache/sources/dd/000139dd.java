package th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.databinding.ItemOneSummaryBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneSummaryHeaderBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneSummaryPackageBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneSummaryPackageTrueBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneSummaryReferenceDocBinding;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostThemeModel;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryHeaderItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryImageItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryItems;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryPackageItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryPackageTrueCompanyItem;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewHolder.SummaryHeaderViewHolder;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewHolder.SummaryItemViewHolder;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewHolder.SummaryPackageItemViewHolder;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewHolder.SummaryPackageTrueCompanyItemViewHolder;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewHolder.SummaryReferenceDocItemViewHolder;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B'\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/model/SummaryItems;", "Lkotlin/collections/ArrayList;", "summaryList", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", "theme", "<init>", "(Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "(I)I", "", "refCount", "updateRefCount", "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OnePre2PostThemeModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter$OnClickListener;", "onClickListener", "Companion", "OnClickListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnePre2PostSummaryListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePre2PostSummaryListAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n1864#2,3:165\n*S KotlinDebug\n*F\n+ 1 OnePre2PostSummaryListAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter\n*L\n147#1:165,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostSummaryListAdapter */
/* loaded from: classes10.dex */
public final class OnePre2PostSummaryListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_HEADER_ITEM = 0;
    public static final int VIEW_TYPE_PACKAGE_ITEM = 3;
    public static final int VIEW_TYPE_PACKAGE_TRUE_COMPANY_ITEM = 4;
    public static final int VIEW_TYPE_SUMMARY_ITEM = 1;
    public static final int VIEW_TYPE_SUMMARY_REFERENCE_DOC_ITEM = 2;

    /* renamed from: a */
    public final ArrayList f94839a;

    /* renamed from: b */
    public final OnePre2PostThemeModel f94840b;

    /* renamed from: c */
    public OnClickListener f94841c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter$Companion;", "", "()V", "VIEW_TYPE_HEADER_ITEM", "", "VIEW_TYPE_PACKAGE_ITEM", "VIEW_TYPE_PACKAGE_TRUE_COMPANY_ITEM", "VIEW_TYPE_SUMMARY_ITEM", "VIEW_TYPE_SUMMARY_REFERENCE_DOC_ITEM", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostSummaryListAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostSummaryListAdapter$OnClickListener;", "", "onReferenceDocItemClick", "", "position", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostSummaryListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onReferenceDocItemClick(int i);
    }

    public OnePre2PostSummaryListAdapter(@NotNull ArrayList<SummaryItems> summaryList, @NotNull OnePre2PostThemeModel theme) {
        Intrinsics.checkNotNullParameter(summaryList, "summaryList");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f94839a = summaryList;
        this.f94840b = theme;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94839a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        SummaryItems summaryItems = (SummaryItems) this.f94839a.get(i);
        if (summaryItems instanceof SummaryHeaderItem) {
            return 0;
        }
        if (summaryItems instanceof SummaryItem) {
            return 1;
        }
        if (summaryItems instanceof SummaryImageItem) {
            return 2;
        }
        if (summaryItems instanceof SummaryPackageItem) {
            return 3;
        }
        if (summaryItems instanceof SummaryPackageTrueCompanyItem) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof SummaryHeaderViewHolder) {
            Object obj = this.f94839a.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryHeaderItem");
            ((SummaryHeaderViewHolder) holder).bind((SummaryHeaderItem) obj, this.f94840b);
        } else if (holder instanceof SummaryItemViewHolder) {
            Object obj2 = this.f94839a.get(i);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryItem");
            ((SummaryItemViewHolder) holder).bind((SummaryItem) obj2, this.f94840b);
        } else if (holder instanceof SummaryReferenceDocItemViewHolder) {
            Object obj3 = this.f94839a.get(i);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryImageItem");
            ((SummaryReferenceDocItemViewHolder) holder).bind((SummaryImageItem) obj3, this.f94840b, this.f94841c);
        } else if (holder instanceof SummaryPackageItemViewHolder) {
            Object obj4 = this.f94839a.get(i);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryPackageItem");
            ((SummaryPackageItemViewHolder) holder).bind((SummaryPackageItem) obj4, this.f94840b);
        } else if (holder instanceof SummaryPackageTrueCompanyItemViewHolder) {
            Object obj5 = this.f94839a.get(i);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryPackageTrueCompanyItem");
            ((SummaryPackageTrueCompanyItemViewHolder) holder).bind((SummaryPackageTrueCompanyItem) obj5, this.f94840b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ItemOneSummaryPackageTrueBinding inflate = ItemOneSummaryPackageTrueBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …lse\n                    )");
                            return new SummaryPackageTrueCompanyItemViewHolder(inflate);
                        }
                        throw new IllegalArgumentException("Invalid view type");
                    }
                    ItemOneSummaryPackageBinding inflate2 = ItemOneSummaryPackageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …lse\n                    )");
                    return new SummaryPackageItemViewHolder(inflate2);
                }
                ItemOneSummaryReferenceDocBinding inflate3 = ItemOneSummaryReferenceDocBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(\n               …lse\n                    )");
                return new SummaryReferenceDocItemViewHolder(inflate3);
            }
            ItemOneSummaryBinding inflate4 = ItemOneSummaryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(\n               …lse\n                    )");
            return new SummaryItemViewHolder(inflate4);
        }
        ItemOneSummaryHeaderBinding inflate5 = ItemOneSummaryHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(\n               …lse\n                    )");
        return new SummaryHeaderViewHolder(inflate5);
    }

    public final void setOnClickListener(@NotNull OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94841c = listener;
    }

    public final void updateRefCount(@NotNull String refCount) {
        Intrinsics.checkNotNullParameter(refCount, "refCount");
        int i = 0;
        for (Object obj : this.f94839a) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SummaryItems summaryItems = (SummaryItems) obj;
            if (summaryItems instanceof SummaryImageItem) {
                ((SummaryImageItem) summaryItems).setSummaryValue(refCount);
                notifyItemChanged(i);
            }
            i = i2;
        }
    }
}