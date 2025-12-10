package th.p047co.dtac.android.dtacone.app_one.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u000bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputSaveState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcel;", "source", "<init>", "(Landroid/os/Parcel;)V", "Ljava/lang/ClassLoader;", "loader", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "Landroid/os/Parcelable;", "superState", "(Landroid/os/Parcelable;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "getTag", "()Ljava/lang/Object;", "tag", "setTag", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", TextBundle.TEXT_ENTRY, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getHint", "setHint", "hint", OperatorName.CURVE_TO, "Landroid/os/Parcelable;", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputSaveState */
/* loaded from: classes7.dex */
public final class OneTextInputSaveState extends View.BaseSavedState {

    /* renamed from: a */
    public String f82970a;

    /* renamed from: b */
    public String f82971b;

    /* renamed from: c */
    public Parcelable f82972c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<?> CREATOR = new Parcelable.Creator<Object>() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneTextInputSaveState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @Nullable
        public Object createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OneTextInputSaveState(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Object[] newArray(int i) {
            return new Object[]{new OneTextInputSaveState[i]};
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputSaveState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputSaveState$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputSaveState(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f82970a = source.readString();
        this.f82971b = source.readString();
        this.f82972c = source.readBundle(OneTextInputSaveState.class.getClassLoader());
    }

    @Nullable
    public final String getHint() {
        return this.f82971b;
    }

    @Nullable
    public final Object getTag() {
        return this.f82972c;
    }

    @Nullable
    public final String getText() {
        return this.f82970a;
    }

    public final void setHint(@Nullable String str) {
        this.f82971b = str;
    }

    public final void setTag(@Nullable Parcelable parcelable) {
        this.f82972c = parcelable;
    }

    public final void setText(@Nullable String str) {
        this.f82970a = str;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.f82970a);
        out.writeString(this.f82971b);
        out.writeParcelable(this.f82972c, 0);
    }

    @RequiresApi(api = 24)
    public OneTextInputSaveState(@Nullable Parcel parcel, @Nullable ClassLoader classLoader) {
        super(parcel, classLoader);
    }

    public OneTextInputSaveState(@Nullable Parcelable parcelable) {
        super(parcelable);
    }
}