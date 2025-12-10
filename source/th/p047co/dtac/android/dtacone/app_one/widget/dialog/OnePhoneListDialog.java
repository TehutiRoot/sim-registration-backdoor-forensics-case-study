package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.adapter.OnePhoneNumberAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J-\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00042\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0019j\b\u0012\u0004\u0012\u00020\n`\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R2\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePhoneListDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", "", OperatorName.CLOSE_AND_STROKE, "setLastSelectedItem", "(Ljava/lang/String;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", UriUtil.LOCAL_RESOURCE_SCHEME, "setData", "(Ljava/util/ArrayList;)V", "Landroidx/recyclerview/widget/RecyclerView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", MessageBundle.TITLE_ENTRY, "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "close", "Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter;", "d", "Lkotlin/Lazy;", "o", "()Lth/co/dtac/android/dtacone/app_one/adapter/OnePhoneNumberAdapter;", "phoneNumberAdapter", "e", "Ljava/lang/String;", "selectItem", "Lkotlin/Function1;", OperatorName.FILL_NON_ZERO, "Lkotlin/jvm/functions/Function1;", "getOnButtonClick", "()Lkotlin/jvm/functions/Function1;", "setOnButtonClick", "(Lkotlin/jvm/functions/Function1;)V", "onButtonClick", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog */
/* loaded from: classes7.dex */
public final class OnePhoneListDialog extends DialogFragment {

    /* renamed from: a */
    public RecyclerView f82992a;

    /* renamed from: b */
    public OneFontTextView f82993b;

    /* renamed from: c */
    public ImageView f82994c;

    /* renamed from: d */
    public final Lazy f82995d = LazyKt__LazyJVMKt.lazy(OnePhoneListDialog$phoneNumberAdapter$2.INSTANCE);

    /* renamed from: e */
    public String f82996e;

    /* renamed from: f */
    public Function1 f82997f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePhoneListDialog$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePhoneListDialog;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnePhoneListDialog newInstance() {
            OnePhoneListDialog onePhoneListDialog = new OnePhoneListDialog();
            onePhoneListDialog.setArguments(new Bundle());
            return onePhoneListDialog;
        }

        public Companion() {
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.rvPhone);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.rvPhone)");
        this.f82992a = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.title)");
        this.f82993b = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.close);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.close)");
        this.f82994c = (ImageView) findViewById3;
    }

    private final void initView() {
        RecyclerView recyclerView = this.f82992a;
        ImageView imageView = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m19729o());
        OnePhoneNumberAdapter m19729o = m19729o();
        m19729o.setOnSelectItem(new OnePhoneListDialog$initView$2$1(this));
        m19729o.setLastSelected(this.f82996e);
        ImageView imageView2 = this.f82994c;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("close");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: j01
            {
                OnePhoneListDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnePhoneListDialog.m19730n(OnePhoneListDialog.this, view);
            }
        });
    }

    /* renamed from: n */
    public static /* synthetic */ void m19730n(OnePhoneListDialog onePhoneListDialog, View view) {
        m19728p(onePhoneListDialog, view);
    }

    /* renamed from: p */
    public static final void m19728p(OnePhoneListDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Nullable
    public final Function1<String, Unit> getOnButtonClick() {
        return this.f82997f;
    }

    /* renamed from: o */
    public final OnePhoneNumberAdapter m19729o() {
        return (OnePhoneNumberAdapter) this.f82995d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.one_dialog_phone_number_list, viewGroup, false);
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
            window.setGravity(80);
        }
        if (window != null) {
            window.setLayout(-1, -2);
        }
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.background_dialog_white_rounded);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.DialogFragment;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        binding(view);
        initView();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull ArrayList<String> res) {
        Intrinsics.checkNotNullParameter(res, "res");
        if (this.f82996e == null) {
            this.f82996e = (String) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) res);
        }
        m19729o().setData(CollectionsKt___CollectionsKt.toList(res));
        m19729o().notifyDataSetChanged();
    }

    public final void setLastSelectedItem(@Nullable String str) {
        this.f82996e = str;
    }

    public final void setOnButtonClick(@Nullable Function1<? super String, Unit> function1) {
        this.f82997f = function1;
    }
}
