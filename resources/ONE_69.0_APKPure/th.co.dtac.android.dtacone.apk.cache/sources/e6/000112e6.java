package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonBlue;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogRemainingPackages;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OneRemainingPackagesAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.model.ThemeColorModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J-\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010'\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\"j\n\u0012\u0004\u0012\u00020#\u0018\u0001`$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogRemainingPackages;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "initView", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/recyclerview/widget/RecyclerView;", "rvPackage", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonBlue;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonBlue;", "btnOk", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/model/ThemeColorModel;", "p", "()Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/model/ThemeColorModel;", "theme", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse$DataItem;", "Lkotlin/collections/ArrayList;", "o", "()Ljava/util/ArrayList;", CollectionUtils.LIST_TYPE, "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDialogRemainingPackages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialogRemainingPackages.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogRemainingPackages\n+ 2 BundleExtension.kt\nth/co/dtac/android/dtacone/app_one/extension/BundleExtensionKt\n*L\n1#1,96:1\n14#2,4:97\n19#2,4:101\n*S KotlinDebug\n*F\n+ 1 OneDialogRemainingPackages.kt\nth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogRemainingPackages\n*L\n70#1:97,4\n71#1:101,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogRemainingPackages */
/* loaded from: classes7.dex */
public final class OneDialogRemainingPackages extends DialogFragment {

    /* renamed from: a */
    public RecyclerView f83057a;

    /* renamed from: b */
    public OneButtonBlue f83058b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogRemainingPackages$Companion;", "", "()V", "COMPANY", "", "DATA_LIST", "THEME", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogRemainingPackages;", "company", "theme", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/model/ThemeColorModel;", CollectionUtils.LIST_TYPE, "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse$DataItem;", "Lkotlin/collections/ArrayList;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogRemainingPackages$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneDialogRemainingPackages newInstance(@NotNull String company, @NotNull ThemeColorModel theme, @Nullable ArrayList<OneCurrentPackagesResponse.DataItem> arrayList) {
            Intrinsics.checkNotNullParameter(company, "company");
            Intrinsics.checkNotNullParameter(theme, "theme");
            OneDialogRemainingPackages oneDialogRemainingPackages = new OneDialogRemainingPackages();
            Bundle bundle = new Bundle();
            bundle.putString("COMPANY", company);
            bundle.putParcelable("THEME", theme);
            bundle.putParcelableArrayList("DATA_LIST", arrayList);
            oneDialogRemainingPackages.setArguments(bundle);
            return oneDialogRemainingPackages;
        }

        public Companion() {
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.rvPackage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.rvPackage)");
        this.f83057a = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.btnOk)");
        this.f83058b = (OneButtonBlue) findViewById2;
    }

    private final void initView() {
        ThemeColorModel m19926p = m19926p();
        OneButtonBlue oneButtonBlue = null;
        if (m19926p != null) {
            OneButtonBlue oneButtonBlue2 = this.f83058b;
            if (oneButtonBlue2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnOk");
                oneButtonBlue2 = null;
            }
            oneButtonBlue2.setButtonBackground(m19926p.getButtonBackground());
        }
        OneButtonBlue oneButtonBlue3 = this.f83058b;
        if (oneButtonBlue3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
        } else {
            oneButtonBlue = oneButtonBlue3;
        }
        oneButtonBlue.setOnClickListener(new View.OnClickListener() { // from class: GS0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneDialogRemainingPackages.m19928n(OneDialogRemainingPackages.this, view);
            }
        });
    }

    /* renamed from: n */
    public static /* synthetic */ void m19928n(OneDialogRemainingPackages oneDialogRemainingPackages, View view) {
        m19925q(oneDialogRemainingPackages, view);
    }

    /* renamed from: q */
    public static final void m19925q(OneDialogRemainingPackages this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: r */
    private final void m19924r() {
        RecyclerView recyclerView = this.f83057a;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvPackage");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        recyclerView.setAdapter(new OneRemainingPackagesAdapter(context, m19926p(), m19927o()));
    }

    /* renamed from: o */
    public final ArrayList m19927o() {
        ArrayList parcelableArrayList;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArrayList = arguments.getParcelableArrayList("DATA_LIST", OneCurrentPackagesResponse.DataItem.class);
                return parcelableArrayList;
            }
            return arguments.getParcelableArrayList("DATA_LIST");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.one_dialog_remaining_packages, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        int i = (int) (getResources().getDisplayMetrics().widthPixels * 0.9d);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(i, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        binding(view);
        m19924r();
        initView();
    }

    /* renamed from: p */
    public final ThemeColorModel m19926p() {
        Object obj;
        Object parcelable;
        Bundle arguments = getArguments();
        Parcelable parcelable2 = null;
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("THEME", ThemeColorModel.class);
            obj = (Parcelable) parcelable;
        } else {
            Parcelable parcelable3 = arguments.getParcelable("THEME");
            if (parcelable3 instanceof ThemeColorModel) {
                parcelable2 = parcelable3;
            }
            obj = (ThemeColorModel) parcelable2;
        }
        return (ThemeColorModel) obj;
    }
}