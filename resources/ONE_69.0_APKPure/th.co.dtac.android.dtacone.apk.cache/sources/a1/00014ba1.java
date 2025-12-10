package th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.device_sale.InputField;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign.InputFieldAdapter;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldAdapter$InputFieldViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", FirebaseAnalytics.Param.ITEMS, "<init>", "(ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldAdapter$InputFieldViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldAdapter$InputFieldViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "InputFieldViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.campaign.InputFieldAdapter */
/* loaded from: classes9.dex */
public final class InputFieldAdapter extends RecyclerView.Adapter<InputFieldViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f100107a;

    /* renamed from: b */
    public List f100108b;

    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldAdapter$InputFieldViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldAdapter;Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", "item", "", "bindView", "(Lth/co/dtac/android/dtacone/model/device_sale/InputField;)Lkotlin/Unit;", "Lth/co/dtac/android/dtacone/widget/view/DtacEditText;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacEditText;", "inputEditText", "Lcom/google/android/material/textfield/TextInputLayout;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/android/material/textfield/TextInputLayout;", "inputLayout", "Landroid/widget/ImageButton;", OperatorName.CURVE_TO, "Landroid/widget/ImageButton;", "btnClearText", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.campaign.InputFieldAdapter$InputFieldViewHolder */
    /* loaded from: classes9.dex */
    public final class InputFieldViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public DtacEditText f100109a;

        /* renamed from: b */
        public TextInputLayout f100110b;

        /* renamed from: c */
        public ImageButton f100111c;

        /* renamed from: d */
        public final /* synthetic */ InputFieldAdapter f100112d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputFieldViewHolder(@NotNull InputFieldAdapter inputFieldAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f100112d = inputFieldAdapter;
        }

        /* renamed from: c */
        public static final void m8021c(InputFieldViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            DtacEditText dtacEditText = this$0.f100109a;
            if (dtacEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                dtacEditText = null;
            }
            dtacEditText.setText("");
        }

        @Nullable
        public final Unit bindView(@NotNull final InputField item) {
            Intrinsics.checkNotNullParameter(item, "item");
            View view = this.itemView;
            View findViewById = view.findViewById(R.id.inputEditText);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.inputEditText)");
            this.f100109a = (DtacEditText) findViewById;
            View findViewById2 = view.findViewById(R.id.inputLayout);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.inputLayout)");
            this.f100110b = (TextInputLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.btnClearText);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.btnClearText)");
            ImageButton imageButton = (ImageButton) findViewById3;
            this.f100111c = imageButton;
            DtacEditText dtacEditText = null;
            if (imageButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnClearText");
                imageButton = null;
            }
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: Se0
                {
                    InputFieldAdapter.InputFieldViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InputFieldAdapter.InputFieldViewHolder.m8021c(InputFieldAdapter.InputFieldViewHolder.this, view2);
                }
            });
            TextInputLayout textInputLayout = this.f100110b;
            if (textInputLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputLayout");
                textInputLayout = null;
            }
            textInputLayout.setHint(item.getLabel());
            DtacEditText dtacEditText2 = this.f100109a;
            if (dtacEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
                dtacEditText2 = null;
            }
            dtacEditText2.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.view.fragment.device_sale.campaign.InputFieldAdapter$InputFieldViewHolder$bindView$1$2
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
                    ImageButton imageButton2;
                    ImageButton imageButton3;
                    InputField.this.setValue((charSequence == null || (r3 = charSequence.toString()) == null) ? "" : "");
                    ImageButton imageButton4 = null;
                    if (charSequence == null || charSequence.length() == 0) {
                        imageButton2 = this.f100111c;
                        if (imageButton2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("btnClearText");
                        } else {
                            imageButton4 = imageButton2;
                        }
                        imageButton4.setVisibility(4);
                        return;
                    }
                    imageButton3 = this.f100111c;
                    if (imageButton3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("btnClearText");
                    } else {
                        imageButton4 = imageButton3;
                    }
                    imageButton4.setVisibility(0);
                }
            });
            String str = item.getDefault();
            if (str == null) {
                return null;
            }
            DtacEditText dtacEditText3 = this.f100109a;
            if (dtacEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputEditText");
            } else {
                dtacEditText = dtacEditText3;
            }
            dtacEditText.setText(str);
            return Unit.INSTANCE;
        }
    }

    public InputFieldAdapter(@LayoutRes int i, @NotNull List<InputField> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f100107a = i;
        this.f100108b = items;
    }

    public final int getIdLayout() {
        return this.f100107a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f100108b.size();
    }

    @NotNull
    public final List<InputField> getItems() {
        return this.f100108b;
    }

    public final void setItems(@NotNull List<InputField> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f100108b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull InputFieldViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((InputField) this.f100108b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public InputFieldViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f100107a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new InputFieldViewHolder(this, view);
    }
}