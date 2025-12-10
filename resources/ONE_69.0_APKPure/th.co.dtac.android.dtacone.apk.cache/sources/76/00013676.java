package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidPropositionAdapter;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\u0006J)\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u00106\"\u0004\b=\u00108¨\u0006@"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter$OnePostpaidCampaignViewHolder;", "", "searchQuery", "<init>", "(Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "", "updateSearchQuery", "Lkotlin/Function0;", "end", "updateActionSearchQuery", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;", CollectionUtils.LIST_TYPE, "update", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter$OnePostpaidCampaignViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter$OnePostpaidCampaignViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "Landroid/os/Handler;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", OperatorName.CURVE_TO, "Ljava/lang/Runnable;", "searchRunnable", "", "d", OperatorName.SET_LINE_CAPSTYLE, "searchDelay", "e", "Ljava/util/List;", "itemList", OperatorName.FILL_NON_ZERO, "filteredList", "Lkotlin/Function1;", OperatorName.NON_STROKING_GRAY, "Lkotlin/jvm/functions/Function1;", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function1;)V", "onItemSelected", "", OperatorName.CLOSE_PATH, "getOnShowWarningMessage", "setOnShowWarningMessage", "onShowWarningMessage", "OnePostpaidCampaignViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnePostpaidPropositionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidPropositionAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1#2:123\n766#3:124\n857#3,2:125\n*S KotlinDebug\n*F\n+ 1 OnePostpaidPropositionAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter\n*L\n49#1:124\n49#1:125,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidPropositionAdapter */
/* loaded from: classes10.dex */
public final class OnePostpaidPropositionAdapter extends RecyclerView.Adapter<OnePostpaidCampaignViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f93304a;

    /* renamed from: b */
    public final Handler f93305b;

    /* renamed from: c */
    public Runnable f93306c;

    /* renamed from: d */
    public final long f93307d;

    /* renamed from: e */
    public List f93308e;

    /* renamed from: f */
    public List f93309f;

    /* renamed from: g */
    public Function1 f93310g;

    /* renamed from: h */
    public Function1 f93311h;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/adapter/OnePostpaidPropositionAdapter$OnePostpaidCampaignViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvCampaignName", "", "itemText", "searchQuery", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;Ljava/lang/String;Ljava/lang/String;)V", "item", "bind", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidPropositionAdapter$OnePostpaidCampaignViewHolder */
    /* loaded from: classes10.dex */
    public static final class OnePostpaidCampaignViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public OneFontTextView f93312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnePostpaidCampaignViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* renamed from: b */
        private final void m12689b(Context context, OneFontTextView oneFontTextView, String str, String str2) {
            SpannableString spannableString = new SpannableString(str);
            int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, true, 2, (Object) null);
            if (indexOf$default != -1) {
                int length = str2.length() + indexOf$default;
                int color = ContextCompat.getColor(context, R.color.red5);
                spannableString.setSpan(new StyleSpan(1), indexOf$default, length, 33);
                spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, length, 33);
            }
            oneFontTextView.setText(spannableString);
        }

        public static /* synthetic */ void bind$default(OnePostpaidCampaignViewHolder onePostpaidCampaignViewHolder, View view, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            onePostpaidCampaignViewHolder.bind(view, str, str2);
        }

        public final void bind(@NotNull View itemView, @NotNull String item, @NotNull String searchQuery) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            View findViewById = itemView.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvCampaignName)");
            this.f93312a = (OneFontTextView) findViewById;
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            OneFontTextView oneFontTextView = this.f93312a;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvCampaignName");
                oneFontTextView = null;
            }
            m12689b(context, oneFontTextView, item, searchQuery);
        }
    }

    public OnePostpaidPropositionAdapter() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m12691a(OnePostpaidPropositionAdapter onePostpaidPropositionAdapter, String str) {
        m12690b(onePostpaidPropositionAdapter, str);
    }

    /* renamed from: b */
    public static final void m12690b(OnePostpaidPropositionAdapter this$0, String query) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        updateActionSearchQuery$default(this$0, query, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateActionSearchQuery$default(OnePostpaidPropositionAdapter onePostpaidPropositionAdapter, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        onePostpaidPropositionAdapter.updateActionSearchQuery(str, function0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f93309f.size();
    }

    @Nullable
    public final Function1<DataItem, Unit> getOnItemSelected() {
        return this.f93310g;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnShowWarningMessage() {
        return this.f93311h;
    }

    public final void setOnItemSelected(@Nullable Function1<? super DataItem, Unit> function1) {
        this.f93310g = function1;
    }

    public final void setOnShowWarningMessage(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f93311h = function1;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void update(@NotNull List<DataItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f93308e = list;
        this.f93309f = list;
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateActionSearchQuery(@NotNull String query, @Nullable Function0<Unit> function0) {
        List list;
        boolean z;
        Intrinsics.checkNotNullParameter(query, "query");
        this.f93304a = query;
        if (query.length() == 0) {
            list = this.f93308e;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f93308e) {
                String propositionInfo = ((DataItem) obj).getPropositionInfo();
                if (propositionInfo != null) {
                    z = StringsKt__StringsKt.contains((CharSequence) propositionInfo, (CharSequence) query, true);
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.f93309f = list;
        notifyDataSetChanged();
        if (this.f93309f.isEmpty()) {
            Function1 function1 = this.f93311h;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } else {
            Function1 function12 = this.f93311h;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateSearchQuery(@NotNull final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Runnable runnable = this.f93306c;
        if (runnable != null) {
            this.f93305b.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: F31
            @Override // java.lang.Runnable
            public final void run() {
                OnePostpaidPropositionAdapter.m12691a(OnePostpaidPropositionAdapter.this, query);
            }
        };
        this.f93306c = runnable2;
        Handler handler = this.f93305b;
        Intrinsics.checkNotNull(runnable2);
        handler.postDelayed(runnable2, this.f93307d);
    }

    public /* synthetic */ OnePostpaidPropositionAdapter(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OnePostpaidCampaignViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String propositionInfo = ((DataItem) this.f93309f.get(i)).getPropositionInfo();
        if (propositionInfo != null) {
            View view = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            holder.bind(view, propositionInfo, this.f93304a);
        }
        View view2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
        OnSingleClickListenerKt.setOnSingleClickListener(view2, new OnePostpaidPropositionAdapter$onBindViewHolder$2(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OnePostpaidCampaignViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_campaign_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OnePostpaidCampaignViewHolder(view);
    }

    public OnePostpaidPropositionAdapter(@NotNull String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f93304a = searchQuery;
        this.f93305b = new Handler(Looper.getMainLooper());
        this.f93307d = 1000L;
        List emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f93308e = emptyList;
        this.f93309f = emptyList;
    }
}