package kotlinx.serialization.json.internal;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m28850d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "", "pushDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", FirebaseAnalytics.Param.INDEX, "updateDescriptorIndex", "(I)V", Action.KEY_ATTRIBUTE, "updateCurrentMapKey", "(Ljava/lang/Object;)V", "resetCurrentMapKey", "popDescriptor", "", "getPath", "()Ljava/lang/String;", "toString", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "[Ljava/lang/Object;", "currentObjectPath", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[I", "indicies", OperatorName.CURVE_TO, "I", "currentDepth", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class JsonPath {

    /* renamed from: a */
    public Object[] f71388a = new Object[8];

    /* renamed from: b */
    public int[] f71389b;

    /* renamed from: c */
    public int f71390c;

    /* renamed from: kotlinx.serialization.json.internal.JsonPath$a */
    /* loaded from: classes6.dex */
    public static final class C12172a {

        /* renamed from: a */
        public static final C12172a f71391a = new C12172a();
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f71389b = iArr;
        this.f71390c = -1;
    }

    /* renamed from: a */
    public final void m26634a() {
        int i = this.f71390c * 2;
        Object[] copyOf = Arrays.copyOf(this.f71388a, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.f71388a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f71389b, i);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        this.f71389b = copyOf2;
    }

    @NotNull
    public final String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.f71390c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f71388a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE)) {
                    if (this.f71389b[i2] != -1) {
                        sb.append("[");
                        sb.append(this.f71389b[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = this.f71389b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i3));
                    }
                }
            } else if (obj != C12172a.f71391a) {
                sb.append("[");
                sb.append(OperatorName.SHOW_TEXT_LINE);
                sb.append(obj);
                sb.append(OperatorName.SHOW_TEXT_LINE);
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final void popDescriptor() {
        int i = this.f71390c;
        int[] iArr = this.f71389b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f71390c = i - 1;
        }
        int i2 = this.f71390c;
        if (i2 != -1) {
            this.f71390c = i2 - 1;
        }
    }

    public final void pushDescriptor(@NotNull SerialDescriptor sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i = this.f71390c + 1;
        this.f71390c = i;
        if (i == this.f71388a.length) {
            m26634a();
        }
        this.f71388a[i] = sd;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.f71389b;
        int i = this.f71390c;
        if (iArr[i] == -2) {
            this.f71388a[i] = C12172a.f71391a;
        }
    }

    @NotNull
    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(@Nullable Object obj) {
        int[] iArr = this.f71389b;
        int i = this.f71390c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f71390c = i2;
            if (i2 == this.f71388a.length) {
                m26634a();
            }
        }
        Object[] objArr = this.f71388a;
        int i3 = this.f71390c;
        objArr[i3] = obj;
        this.f71389b[i3] = -2;
    }

    public final void updateDescriptorIndex(int i) {
        this.f71389b[this.f71390c] = i;
    }
}
