package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "", "filter", "Landroidx/compose/ui/text/input/TransformedText;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/AnnotatedString;", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.input.VisualTransformation */
/* loaded from: classes2.dex */
public interface VisualTransformation {
    @NotNull
    public static final Companion Companion = Companion.f31463a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/text/input/VisualTransformation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/VisualTransformation;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/input/VisualTransformation;", "getNone", "()Landroidx/compose/ui/text/input/VisualTransformation;", "getNone$annotations", "None", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.input.VisualTransformation$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f31463a = new Companion();

        /* renamed from: b */
        public static final VisualTransformation f31464b = C3625a.f31465a;

        /* renamed from: androidx.compose.ui.text.input.VisualTransformation$Companion$a */
        /* loaded from: classes2.dex */
        public static final class C3625a implements VisualTransformation {

            /* renamed from: a */
            public static final C3625a f31465a = new C3625a();

            @Override // androidx.compose.p003ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new TransformedText(text, OffsetMapping.Companion.getIdentity());
            }
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @NotNull
        public final VisualTransformation getNone() {
            return f31464b;
        }
    }

    @NotNull
    TransformedText filter(@NotNull AnnotatedString annotatedString);
}
