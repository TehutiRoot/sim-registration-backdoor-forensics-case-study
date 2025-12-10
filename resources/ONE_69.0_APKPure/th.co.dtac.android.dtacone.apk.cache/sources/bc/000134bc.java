package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationAmphoeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationGetAddressFromPostcodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationTambonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAddressListAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003:9;BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "mContext", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "data", "", "dataType", "", "selectedAmphurPos", "fontSelectedColor", "priceSelectedColor", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationAmphoeResponse;", "selectedAmphur", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "selectedTumbon", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;Ljava/lang/String;IIILth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationAmphoeResponse;Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter$OnClickData;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter$OnClickData;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationGetAddressFromPostcodeResponse;", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "I", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationAmphoeResponse;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "i", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter$OnClickData;", "Companion", "AddressItemViewHolder", "OnClickData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneAddressListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneAddressListAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAddressListAdapter */
/* loaded from: classes10.dex */
public final class OneAddressListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull
    public static final String AMPHUR = "AMPHUR";
    @NotNull
    public static final String TUMBON = "TUMBON";

    /* renamed from: a */
    public final Context f92535a;

    /* renamed from: b */
    public final OneOnlineRegistrationGetAddressFromPostcodeResponse f92536b;

    /* renamed from: c */
    public final String f92537c;

    /* renamed from: d */
    public final int f92538d;

    /* renamed from: e */
    public final int f92539e;

    /* renamed from: f */
    public final int f92540f;

    /* renamed from: g */
    public final OneOnlineRegistrationAmphoeResponse f92541g;

    /* renamed from: h */
    public final OneOnlineRegistrationTambonResponse f92542h;

    /* renamed from: i */
    public OnClickData f92543i;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter$AddressItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter;Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutDataString", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutDataString", "Landroidx/appcompat/widget/LinearLayoutCompat;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLayoutText", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutText", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvDataString", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvDataString", "d", "Landroid/view/View;", "getVSeparateLineItem", "()Landroid/view/View;", "vSeparateLineItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAddressListAdapter$AddressItemViewHolder */
    /* loaded from: classes10.dex */
    public final class AddressItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ConstraintLayout f92544a;

        /* renamed from: b */
        public final LinearLayoutCompat f92545b;

        /* renamed from: c */
        public final OneFontTextView f92546c;

        /* renamed from: d */
        public final View f92547d;

        /* renamed from: e */
        public final /* synthetic */ OneAddressListAdapter f92548e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressItemViewHolder(@NotNull OneAddressListAdapter oneAddressListAdapter, View v) {
            super(v);
            Intrinsics.checkNotNullParameter(v, "v");
            this.f92548e = oneAddressListAdapter;
            View findViewById = v.findViewById(R.id.layoutDataString);
            Intrinsics.checkNotNullExpressionValue(findViewById, "v.findViewById(R.id.layoutDataString)");
            this.f92544a = (ConstraintLayout) findViewById;
            View findViewById2 = v.findViewById(R.id.layoutText);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "v.findViewById(R.id.layoutText)");
            this.f92545b = (LinearLayoutCompat) findViewById2;
            View findViewById3 = v.findViewById(R.id.tvDataString);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "v.findViewById(R.id.tvDataString)");
            this.f92546c = (OneFontTextView) findViewById3;
            View findViewById4 = v.findViewById(R.id.vSeparateLineItem);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "v.findViewById(R.id.vSeparateLineItem)");
            this.f92547d = findViewById4;
        }

        @NotNull
        public final ConstraintLayout getLayoutDataString() {
            return this.f92544a;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutText() {
            return this.f92545b;
        }

        @NotNull
        public final OneFontTextView getTvDataString() {
            return this.f92546c;
        }

        @NotNull
        public final View getVSeparateLineItem() {
            return this.f92547d;
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter$Companion;", "", "()V", "AMPHUR", "", "TUMBON", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAddressListAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/adapter/OneAddressListAdapter$OnClickData;", "", "onClickAmphoe", "", "data", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationAmphoeResponse;", "pos", "", "onClicktambon", "Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationTambonResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAddressListAdapter$OnClickData */
    /* loaded from: classes10.dex */
    public interface OnClickData {
        void onClickAmphoe(@NotNull OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse, int i);

        void onClicktambon(@NotNull OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse, int i);
    }

    public OneAddressListAdapter(@NotNull Context mContext, @NotNull OneOnlineRegistrationGetAddressFromPostcodeResponse data, @NotNull String dataType, int i, int i2, int i3, @Nullable OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse, @Nullable OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        this.f92535a = mContext;
        this.f92536b = data;
        this.f92537c = dataType;
        this.f92538d = i;
        this.f92539e = i2;
        this.f92540f = i3;
        this.f92541g = oneOnlineRegistrationAmphoeResponse;
        this.f92542h = oneOnlineRegistrationTambonResponse;
    }

    /* renamed from: a */
    public static /* synthetic */ void m13182a(OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse, OneAddressListAdapter oneAddressListAdapter, int i, View view) {
        m13180c(oneOnlineRegistrationAmphoeResponse, oneAddressListAdapter, i, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m13181b(OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse, OneAddressListAdapter oneAddressListAdapter, int i, View view) {
        m13179d(oneOnlineRegistrationTambonResponse, oneAddressListAdapter, i, view);
    }

    /* renamed from: c */
    public static final void m13180c(OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse, OneAddressListAdapter this$0, int i, View view) {
        OnClickData onClickData;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (oneOnlineRegistrationAmphoeResponse != null && (onClickData = this$0.f92543i) != null) {
            onClickData.onClickAmphoe(oneOnlineRegistrationAmphoeResponse, i);
        }
    }

    /* renamed from: d */
    public static final void m13179d(OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse, OneAddressListAdapter this$0, int i, View view) {
        OnClickData onClickData;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (oneOnlineRegistrationTambonResponse != null && (onClickData = this$0.f92543i) != null) {
            onClickData.onClicktambon(oneOnlineRegistrationTambonResponse, i);
        }
    }

    @NotNull
    public final OneOnlineRegistrationGetAddressFromPostcodeResponse getData() {
        return this.f92536b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse;
        List<OneOnlineRegistrationTambonResponse> tumbonList;
        if (Intrinsics.areEqual(this.f92537c, "AMPHUR")) {
            List<OneOnlineRegistrationAmphoeResponse> amphoeList = this.f92536b.getAmphoeList();
            if (amphoeList == null) {
                return 0;
            }
            return amphoeList.size();
        }
        List<OneOnlineRegistrationAmphoeResponse> amphoeList2 = this.f92536b.getAmphoeList();
        if (amphoeList2 == null || (oneOnlineRegistrationAmphoeResponse = amphoeList2.get(this.f92538d)) == null || (tumbonList = oneOnlineRegistrationAmphoeResponse.getTumbonList()) == null) {
            return 0;
        }
        return tumbonList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @NotNull
    public final Context getMContext() {
        return this.f92535a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int i) {
        final OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse;
        OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse;
        List<OneOnlineRegistrationTambonResponse> tumbonList;
        final OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = null;
        if (Intrinsics.areEqual(this.f92537c, "AMPHUR")) {
            List<OneOnlineRegistrationAmphoeResponse> amphoeList = this.f92536b.getAmphoeList();
            if (amphoeList != null) {
                oneOnlineRegistrationAmphoeResponse2 = amphoeList.get(i);
            } else {
                oneOnlineRegistrationAmphoeResponse2 = null;
            }
            if (holder instanceof AddressItemViewHolder) {
                AddressItemViewHolder addressItemViewHolder = (AddressItemViewHolder) holder;
                OneFontTextView tvDataString = addressItemViewHolder.getTvDataString();
                if (oneOnlineRegistrationAmphoeResponse2 != null) {
                    str = oneOnlineRegistrationAmphoeResponse2.getAmphoeName();
                }
                tvDataString.setText(str);
                addressItemViewHolder.getLayoutDataString().setOnClickListener(new View.OnClickListener() { // from class: RK0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneAddressListAdapter.m13182a(OneOnlineRegistrationAmphoeResponse.this, this, i, view);
                    }
                });
                OneOnlineRegistrationAmphoeResponse oneOnlineRegistrationAmphoeResponse3 = this.f92541g;
                if (oneOnlineRegistrationAmphoeResponse3 != null && Intrinsics.areEqual(oneOnlineRegistrationAmphoeResponse3, oneOnlineRegistrationAmphoeResponse2)) {
                    addressItemViewHolder.getTvDataString().setTextColor(ContextCompat.getColor(this.f92535a, this.f92539e));
                    addressItemViewHolder.getLayoutText().setBackgroundResource(this.f92540f);
                    return;
                }
                addressItemViewHolder.getTvDataString().setTextColor(ContextCompat.getColor(this.f92535a, R.color.jet_back));
                addressItemViewHolder.getLayoutText().setBackgroundResource(R.color.white);
                return;
            }
            return;
        }
        List<OneOnlineRegistrationAmphoeResponse> amphoeList2 = this.f92536b.getAmphoeList();
        if (amphoeList2 != null && (oneOnlineRegistrationAmphoeResponse = amphoeList2.get(this.f92538d)) != null && (tumbonList = oneOnlineRegistrationAmphoeResponse.getTumbonList()) != null) {
            oneOnlineRegistrationTambonResponse = tumbonList.get(i);
        } else {
            oneOnlineRegistrationTambonResponse = null;
        }
        if (holder instanceof AddressItemViewHolder) {
            AddressItemViewHolder addressItemViewHolder2 = (AddressItemViewHolder) holder;
            OneFontTextView tvDataString2 = addressItemViewHolder2.getTvDataString();
            if (oneOnlineRegistrationTambonResponse != null) {
                str = oneOnlineRegistrationTambonResponse.getTambonName();
            }
            tvDataString2.setText(str);
            addressItemViewHolder2.getLayoutDataString().setOnClickListener(new View.OnClickListener() { // from class: SK0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneAddressListAdapter.m13181b(OneOnlineRegistrationTambonResponse.this, this, i, view);
                }
            });
            OneOnlineRegistrationTambonResponse oneOnlineRegistrationTambonResponse2 = this.f92542h;
            if (oneOnlineRegistrationTambonResponse2 != null && Intrinsics.areEqual(oneOnlineRegistrationTambonResponse2, oneOnlineRegistrationTambonResponse)) {
                addressItemViewHolder2.getTvDataString().setTextColor(ContextCompat.getColor(this.f92535a, this.f92539e));
                addressItemViewHolder2.getLayoutText().setBackgroundResource(this.f92540f);
                return;
            }
            addressItemViewHolder2.getTvDataString().setTextColor(ContextCompat.getColor(this.f92535a, R.color.jet_back));
            addressItemViewHolder2.getLayoutText().setBackgroundResource(R.color.white);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f92535a).inflate(R.layout.item_list_string, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new AddressItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickData listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f92543i = listener;
    }
}