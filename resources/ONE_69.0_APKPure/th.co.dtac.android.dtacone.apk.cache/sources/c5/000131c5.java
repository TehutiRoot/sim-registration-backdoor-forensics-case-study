package th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
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
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.PricePlanListItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B9\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPackageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPackageAdapter$OneMnpPackageViewHolder;", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanListItem;", "itemList", "Lkotlin/Function0;", "", "getSearchText", "Lkotlin/Function1;", "", "onClickItem", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, TextBundle.TEXT_ENTRY, SearchIntents.EXTRA_QUERY, "Landroid/text/SpannableString;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPackageAdapter$OneMnpPackageViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPackageAdapter$OneMnpPackageViewHolder;I)V", "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function0;", "getGetSearchText", "()Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "getOnClickItem", "()Lkotlin/jvm/functions/Function1;", "d", "Landroid/content/Context;", "OneMnpPackageViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneMnpPackageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMnpPackageAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPackageAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPackageAdapter */
/* loaded from: classes10.dex */
public final class OneMnpPackageAdapter extends RecyclerView.Adapter<OneMnpPackageViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f91371a;

    /* renamed from: b */
    public final Function0 f91372b;

    /* renamed from: c */
    public final Function1 f91373c;

    /* renamed from: d */
    public Context f91374d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001f\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001f\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001f\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u001f\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001f\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00190\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010'\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001f\u0010*\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001f\u0010-\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u001f\u00100\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001f\u00103\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#R\u001f\u00106\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u001f\u00109\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#R\u001f\u0010<\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u001f\u0010?\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b=\u0010!\u001a\u0004\b>\u0010#R\u001f\u0010B\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b@\u0010!\u001a\u0004\bA\u0010#R\u001f\u0010E\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\bC\u0010!\u001a\u0004\bD\u0010#R\u001f\u0010K\u001a\n \u0007*\u0004\u0018\u00010F0F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006L"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/adapter/OneMnpPackageAdapter$OneMnpPackageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroidx/appcompat/widget/LinearLayoutCompat;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/appcompat/widget/LinearLayoutCompat;", "getVoiceBox", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "voiceBox", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDataBox", "dataBox", OperatorName.CURVE_TO, "getWifiBox", "wifiBox", "d", "getStorageBox", "storageBox", "e", "getBillCycleBox", "billCycleBox", "Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", "getCvPackageList", "()Lth/co/dtac/android/dtacone/widget/view/DtacCardView;", "cvPackageList", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getPackageName", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, OperatorName.CLOSE_PATH, "getTvPrice", "tvPrice", "i", "getTvWifi", "tvWifi", OperatorName.SET_LINE_JOINSTYLE, "getTvWifiUnit", "tvWifiUnit", OperatorName.NON_STROKING_CMYK, "getTvStorage", "tvStorage", OperatorName.LINE_TO, "getTvStorageUnit", "tvStorageUnit", OperatorName.MOVE_TO, "getTvBillCycle", "tvBillCycle", OperatorName.ENDPATH, "getTvBillCycleUnit", "tvBillCycleUnit", "o", "getTvData", "tvData", "p", "getTvDataUnit", "tvDataUnit", OperatorName.SAVE, "getTvVoice", "tvVoice", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTvVoiceUnit", "tvVoiceUnit", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.CLOSE_AND_STROKE, "Landroidx/recyclerview/widget/RecyclerView;", "getRvDescList", "()Landroidx/recyclerview/widget/RecyclerView;", "rvDescList", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPackageAdapter$OneMnpPackageViewHolder */
    /* loaded from: classes10.dex */
    public static final class OneMnpPackageViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final LinearLayoutCompat f91375a;

        /* renamed from: b */
        public final LinearLayoutCompat f91376b;

        /* renamed from: c */
        public final LinearLayoutCompat f91377c;

        /* renamed from: d */
        public final LinearLayoutCompat f91378d;

        /* renamed from: e */
        public final LinearLayoutCompat f91379e;

        /* renamed from: f */
        public final DtacCardView f91380f;

        /* renamed from: g */
        public final OneFontTextView f91381g;

        /* renamed from: h */
        public final OneFontTextView f91382h;

        /* renamed from: i */
        public final OneFontTextView f91383i;

        /* renamed from: j */
        public final OneFontTextView f91384j;

        /* renamed from: k */
        public final OneFontTextView f91385k;

        /* renamed from: l */
        public final OneFontTextView f91386l;

        /* renamed from: m */
        public final OneFontTextView f91387m;

        /* renamed from: n */
        public final OneFontTextView f91388n;

        /* renamed from: o */
        public final OneFontTextView f91389o;

        /* renamed from: p */
        public final OneFontTextView f91390p;

        /* renamed from: q */
        public final OneFontTextView f91391q;

        /* renamed from: r */
        public final OneFontTextView f91392r;

        /* renamed from: s */
        public final RecyclerView f91393s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OneMnpPackageViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f91375a = (LinearLayoutCompat) view.findViewById(R.id.voiceBoxTrue);
            this.f91376b = (LinearLayoutCompat) view.findViewById(R.id.dataBoxTrue);
            this.f91377c = (LinearLayoutCompat) view.findViewById(R.id.wifiBoxTrue);
            this.f91378d = (LinearLayoutCompat) view.findViewById(R.id.storageBoxTrue);
            this.f91379e = (LinearLayoutCompat) view.findViewById(R.id.billCycleBoxTrue);
            this.f91380f = (DtacCardView) view.findViewById(R.id.cvPackageList);
            this.f91381g = (OneFontTextView) view.findViewById(R.id.packageNameTrue);
            this.f91382h = (OneFontTextView) view.findViewById(R.id.tvPriceTrue);
            this.f91383i = (OneFontTextView) view.findViewById(R.id.tvWifiTrue);
            this.f91384j = (OneFontTextView) view.findViewById(R.id.tvWifiUnitTrue);
            this.f91385k = (OneFontTextView) view.findViewById(R.id.tvStorageTrue);
            this.f91386l = (OneFontTextView) view.findViewById(R.id.tvStorageUnitTrue);
            this.f91387m = (OneFontTextView) view.findViewById(R.id.tvBillCycleTrue);
            this.f91388n = (OneFontTextView) view.findViewById(R.id.tvBillCycleUnitTrue);
            this.f91389o = (OneFontTextView) view.findViewById(R.id.tvDataTrue);
            this.f91390p = (OneFontTextView) view.findViewById(R.id.tvDataUnitTrue);
            this.f91391q = (OneFontTextView) view.findViewById(R.id.tvVoiceTrue);
            this.f91392r = (OneFontTextView) view.findViewById(R.id.tvVoiceUnitTrue);
            this.f91393s = (RecyclerView) view.findViewById(R.id.rvDescListTrue);
        }

        public final LinearLayoutCompat getBillCycleBox() {
            return this.f91379e;
        }

        public final DtacCardView getCvPackageList() {
            return this.f91380f;
        }

        public final LinearLayoutCompat getDataBox() {
            return this.f91376b;
        }

        public final OneFontTextView getPackageName() {
            return this.f91381g;
        }

        public final RecyclerView getRvDescList() {
            return this.f91393s;
        }

        public final LinearLayoutCompat getStorageBox() {
            return this.f91378d;
        }

        public final OneFontTextView getTvBillCycle() {
            return this.f91387m;
        }

        public final OneFontTextView getTvBillCycleUnit() {
            return this.f91388n;
        }

        public final OneFontTextView getTvData() {
            return this.f91389o;
        }

        public final OneFontTextView getTvDataUnit() {
            return this.f91390p;
        }

        public final OneFontTextView getTvPrice() {
            return this.f91382h;
        }

        public final OneFontTextView getTvStorage() {
            return this.f91385k;
        }

        public final OneFontTextView getTvStorageUnit() {
            return this.f91386l;
        }

        public final OneFontTextView getTvVoice() {
            return this.f91391q;
        }

        public final OneFontTextView getTvVoiceUnit() {
            return this.f91392r;
        }

        public final OneFontTextView getTvWifi() {
            return this.f91383i;
        }

        public final OneFontTextView getTvWifiUnit() {
            return this.f91384j;
        }

        public final LinearLayoutCompat getVoiceBox() {
            return this.f91375a;
        }

        public final LinearLayoutCompat getWifiBox() {
            return this.f91377c;
        }
    }

    public /* synthetic */ OneMnpPackageAdapter(List list, Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, function0, function1);
    }

    /* renamed from: a */
    private final SpannableString m13982a(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int color = ContextCompat.getColor(context, R.color.red5);
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, true, 2, (Object) null);
        if (indexOf$default != -1) {
            spannableString.setSpan(new ForegroundColorSpan(color), indexOf$default, str2.length() + indexOf$default, 33);
        }
        return spannableString;
    }

    @NotNull
    public final Function0<String> getGetSearchText() {
        return this.f91372b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91371a.size();
    }

    @NotNull
    public final Function1<PricePlanListItem, Unit> getOnClickItem() {
        return this.f91373c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (r1 != null) goto L14;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPackageAdapter.OneMnpPackageViewHolder r9, int r10) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPackageAdapter.onBindViewHolder(th.co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPackageAdapter$OneMnpPackageViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OneMnpPackageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_mnp_true_package_item, parent, false);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        this.f91374d = context;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new OneMnpPackageViewHolder(view);
    }

    public OneMnpPackageAdapter(@NotNull List<PricePlanListItem> itemList, @NotNull Function0<String> getSearchText, @NotNull Function1<? super PricePlanListItem, Unit> onClickItem) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        Intrinsics.checkNotNullParameter(getSearchText, "getSearchText");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        this.f91371a = itemList;
        this.f91372b = getSearchText;
        this.f91373c = onClickItem;
    }
}