package androidx.compose.p003ui.text;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/SpanStyle;", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n55#2,2:428\n70#2:431\n70#2:433\n70#2:435\n55#2,2:437\n55#2,2:440\n55#2,2:443\n55#2,2:446\n55#2,2:449\n55#2,2:452\n55#2,2:455\n1#3:424\n1#3:427\n1#3:430\n1#3:432\n1#3:434\n1#3:436\n1#3:439\n1#3:442\n1#3:445\n1#3:448\n1#3:451\n1#3:454\n1#3:457\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n243#1:422,2\n244#1:425,2\n245#1:428,2\n246#1:431\n247#1:433\n249#1:435\n250#1:437,2\n251#1:440,2\n252#1:443,2\n253#1:446,2\n254#1:449,2\n255#1:452,2\n256#1:455,2\n243#1:424\n244#1:427\n245#1:430\n246#1:432\n247#1:434\n249#1:436\n250#1:439\n251#1:442\n252#1:445\n253#1:448\n254#1:451\n255#1:454\n256#1:457\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2 */
/* loaded from: classes2.dex */
public final class SaversKt$SpanStyleSaver$2 extends Lambda implements Function1<Object, SpanStyle> {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    public SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SpanStyle invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Color.Companion companion = Color.Companion;
        Saver<Color, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        Color restore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
        Intrinsics.checkNotNull(restore);
        long m71745unboximpl = restore.m71745unboximpl();
        Object obj2 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.Companion;
        TextUnit restore2 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(companion2).restore(obj2);
        Intrinsics.checkNotNull(restore2);
        long m73848unboximpl = restore2.m73848unboximpl();
        Object obj3 = list.get(2);
        FontWeight restore3 = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(FontWeight.Companion).restore(obj3);
        Object obj4 = list.get(3);
        FontStyle fontStyle = obj4 != null ? (FontStyle) obj4 : null;
        Object obj5 = list.get(4);
        FontSynthesis fontSynthesis = obj5 != null ? (FontSynthesis) obj5 : null;
        Object obj6 = list.get(6);
        String str = obj6 != null ? (String) obj6 : null;
        Object obj7 = list.get(7);
        TextUnit restore4 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : SaversKt.getSaver(companion2).restore(obj7);
        Intrinsics.checkNotNull(restore4);
        long m73848unboximpl2 = restore4.m73848unboximpl();
        Object obj8 = list.get(8);
        BaselineShift restore5 = (Intrinsics.areEqual(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(BaselineShift.Companion).restore(obj8);
        Object obj9 = list.get(9);
        TextGeometricTransform restore6 = (Intrinsics.areEqual(obj9, bool) || obj9 == null) ? null : SaversKt.getSaver(TextGeometricTransform.Companion).restore(obj9);
        Object obj10 = list.get(10);
        LocaleList restore7 = (Intrinsics.areEqual(obj10, bool) || obj10 == null) ? null : SaversKt.getSaver(LocaleList.Companion).restore(obj10);
        Object obj11 = list.get(11);
        Color restore8 = (Intrinsics.areEqual(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(companion).restore(obj11);
        Intrinsics.checkNotNull(restore8);
        long m71745unboximpl2 = restore8.m71745unboximpl();
        Object obj12 = list.get(12);
        TextDecoration restore9 = (Intrinsics.areEqual(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(TextDecoration.Companion).restore(obj12);
        Object obj13 = list.get(13);
        return new SpanStyle(m71745unboximpl, m73848unboximpl, restore3, fontStyle, fontSynthesis, (FontFamily) null, str, m73848unboximpl2, restore5, restore6, restore7, m71745unboximpl2, restore9, (Intrinsics.areEqual(obj13, bool) || obj13 == null) ? null : SaversKt.getSaver(Shadow.Companion).restore(obj13), (PlatformSpanStyle) null, (DrawStyle) null, 49184, (DefaultConstructorMarker) null);
    }
}
