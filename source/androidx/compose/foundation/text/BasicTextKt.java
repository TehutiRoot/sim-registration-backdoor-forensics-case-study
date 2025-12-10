package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorProducer;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0093\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ag\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a}\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aq\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010 \u001a\u0087\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010!\u001a¯\u0001\u0010,\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0014\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0018\u00010$2\u001c\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0$\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, m28850d2 = {"", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", TypedValues.Custom.S_COLOR, "BasicText-VhcvRP8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,436:1\n76#2:437\n76#2:438\n76#2:447\n76#2:448\n76#2:477\n76#2:478\n76#2:487\n76#2:523\n50#3:439\n49#3:440\n286#3,8:454\n294#3,2:474\n50#3:479\n49#3:480\n286#3,8:493\n294#3,2:513\n25#3:516\n36#3:524\n36#3:531\n456#3,8:549\n464#3,6:563\n1097#4,6:441\n1097#4,6:481\n1097#4,6:517\n1097#4,6:525\n1097#4,6:532\n123#5,5:449\n129#5,5:462\n134#5:473\n136#5:476\n123#5,5:488\n129#5,5:501\n134#5:512\n136#5:515\n78#5,11:538\n91#5:569\n4144#6,6:467\n4144#6,6:506\n4144#6,6:557\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n95#1:437\n97#1:438\n119#1:447\n131#1:448\n184#1:477\n186#1:478\n210#1:487\n239#1:523\n98#1:439\n98#1:440\n139#1:454,8\n139#1:474,2\n187#1:479\n187#1:480\n198#1:493,8\n198#1:513,2\n223#1:516\n241#1:524\n245#1:531\n226#1:549,8\n226#1:563,6\n98#1:441,6\n187#1:481,6\n223#1:517,6\n241#1:525,6\n245#1:532,6\n139#1:449,5\n139#1:462,5\n139#1:473\n139#1:476\n198#1:488,5\n198#1:501,5\n198#1:512\n198#1:515\n226#1:538,11\n226#1:569\n139#1:467,6\n198#1:506,6\n226#1:557,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:148:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m69715BasicText4YKlhWE(androidx.compose.p003ui.text.AnnotatedString r26, androidx.compose.p003ui.Modifier r27, androidx.compose.p003ui.text.TextStyle r28, kotlin.jvm.functions.Function1 r29, int r30, boolean r31, int r32, java.util.Map r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m69715BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-BpD7jsM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m69717BasicTextBpD7jsM(java.lang.String r23, androidx.compose.p003ui.Modifier r24, androidx.compose.p003ui.text.TextStyle r25, kotlin.jvm.functions.Function1 r26, int r27, boolean r28, int r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m69717BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-RWo7tUw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m69718BasicTextRWo7tUw(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.AnnotatedString r51, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r52, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.text.TextLayoutResult, kotlin.Unit> r54, int r55, boolean r56, int r57, int r58, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r59, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.ColorProducer r60, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m69718BasicTextRWo7tUw(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m69720BasicTextVhcvRP8(@org.jetbrains.annotations.NotNull java.lang.String r47, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r48, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r49, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.text.TextLayoutResult, kotlin.Unit> r50, int r51, boolean r52, int r53, int r54, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.ColorProducer r55, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m69720BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final Modifier m61079a(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m69716BasicText4YKlhWE(java.lang.String r24, androidx.compose.p003ui.Modifier r25, androidx.compose.p003ui.text.TextStyle r26, kotlin.jvm.functions.Function1 r27, int r28, boolean r29, int r30, int r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m69716BasicText4YKlhWE(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m69719BasicTextVhcvRP8(androidx.compose.p003ui.text.AnnotatedString r28, androidx.compose.p003ui.Modifier r29, androidx.compose.p003ui.text.TextStyle r30, kotlin.jvm.functions.Function1 r31, int r32, boolean r33, int r34, int r35, java.util.Map r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m69719BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }
}
