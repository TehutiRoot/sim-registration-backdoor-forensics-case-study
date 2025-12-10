package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001:\u0002CDB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J)\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010)J)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b+\u0010)J+\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0004\b-\u0010)J\u001a\u0010.\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00103R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R*\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010:R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0014\u0010B\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, m28850d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", TextBundle.TEXT_ENTRY, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStylesOrNull", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", FirebaseAnalytics.Param.INDEX, "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "range", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "plus", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", "start", "end", "getStringAnnotations", "(Ljava/lang/String;II)Ljava/util/List;", "", "hasStringAnnotations", "(Ljava/lang/String;II)Z", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotations", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getText", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getSpanStylesOrNull$ui_text_release", "()Ljava/util/List;", OperatorName.CURVE_TO, "getParagraphStylesOrNull$ui_text_release", "d", "getAnnotations$ui_text_release", "getSpanStyles", "getParagraphStyles", "getLength", "length", "Builder", "Range", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,1126:1\n1045#2:1127\n33#3,6:1128\n33#3,4:1138\n38#3:1144\n101#3,2:1146\n33#3,6:1148\n103#3:1154\n33#3,4:1158\n38#3:1164\n33#3,4:1169\n38#3:1175\n33#3,4:1180\n38#3:1186\n1#4:1134\n35#5,3:1135\n38#5,2:1142\n40#5:1145\n35#5,3:1155\n38#5,2:1162\n40#5:1165\n35#5,3:1166\n38#5,2:1173\n40#5:1176\n35#5,3:1177\n38#5,2:1184\n40#5:1187\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n86#1:1127\n86#1:1128,6\n159#1:1138,4\n159#1:1144\n167#1:1146,2\n167#1:1148,6\n167#1:1154\n182#1:1158,4\n182#1:1164\n197#1:1169,4\n197#1:1175\n213#1:1180,4\n213#1:1186\n159#1:1135,3\n159#1:1142,2\n159#1:1145\n182#1:1155,3\n182#1:1162,2\n182#1:1165\n197#1:1166,3\n197#1:1173,2\n197#1:1176\n213#1:1177,3\n213#1:1184,2\n213#1:1187\n*E\n"})
/* renamed from: androidx.compose.ui.text.AnnotatedString */
/* loaded from: classes2.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f30965a;

    /* renamed from: b */
    public final List f30966b;

    /* renamed from: c */
    public final List f30967c;

    /* renamed from: d */
    public final List f30968d;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001;B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\r\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0013J)\u0010\r\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0017J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0018J%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001eJ-\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u0015\u0010+\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001d¢\u0006\u0004\b+\u0010-J\u001d\u0010.\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u0015\u00104\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0003¢\u0006\u0004\b4\u0010\u0006J\r\u00107\u001a\u00020\n¢\u0006\u0004\b7\u00108R\u0018\u0010\b\u001a\u000609j\u0002`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\"\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020D0>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010@R\"\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020D0>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010@R\u0011\u0010K\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, m28850d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "", TextBundle.TEXT_ENTRY, "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "append", "", "char", "(C)V", "deprecated_append_returning_void", "", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$Builder;", "start", "end", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(C)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/SpanStyle;", "style", "addStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;II)V", "tag", "annotation", "addStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "addTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;II)V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "addUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;II)V", "pushStyle", "(Landroidx/compose/ui/text/SpanStyle;)I", "(Landroidx/compose/ui/text/ParagraphStyle;)I", "pushStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;)I", "pushTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;)I", "pushUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;)I", "pop", "()V", FirebaseAnalytics.Param.INDEX, "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$a;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "spanStyles", OperatorName.CURVE_TO, "paragraphStyles", "", "d", "annotations", "e", "styleStack", "getLength", "()I", "length", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,6:1133\n33#2,6:1139\n33#2,6:1145\n33#2,6:1151\n33#2,6:1157\n151#2,3:1164\n33#2,4:1167\n154#2,2:1171\n38#2:1173\n156#2:1174\n151#2,3:1175\n33#2,4:1178\n154#2,2:1182\n38#2:1184\n156#2:1185\n151#2,3:1186\n33#2,4:1189\n154#2,2:1193\n38#2:1195\n156#2:1196\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n396#1:1127,6\n399#1:1133,6\n403#1:1139,6\n423#1:1145,6\n426#1:1151,6\n430#1:1157,6\n640#1:1164,3\n640#1:1167,4\n640#1:1171,2\n640#1:1173\n640#1:1174\n643#1:1175,3\n643#1:1178,4\n643#1:1182,2\n643#1:1184\n643#1:1185\n646#1:1186,3\n646#1:1189,4\n646#1:1193,2\n646#1:1195\n646#1:1196\n*E\n"})
    /* renamed from: androidx.compose.ui.text.AnnotatedString$Builder */
    /* loaded from: classes2.dex */
    public static final class Builder implements Appendable {
        public static final int $stable = 8;

        /* renamed from: a */
        public final StringBuilder f30969a;

        /* renamed from: b */
        public final List f30970b;

        /* renamed from: c */
        public final List f30971c;

        /* renamed from: d */
        public final List f30972d;

        /* renamed from: e */
        public final List f30973e;

        public Builder() {
            this(0, 1, null);
        }

        public final void addStringAnnotation(@NotNull String tag, @NotNull String annotation, int i, int i2) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.f30972d.add(new C3605a(annotation, i, i2, tag));
        }

        public final void addStyle(@NotNull SpanStyle style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f30970b.add(new C3605a(style, i, i2, null, 8, null));
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation, int i, int i2) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            this.f30972d.add(new C3605a(ttsAnnotation, i, i2, null, 8, null));
        }

        @ExperimentalTextApi
        public final void addUrlAnnotation(@NotNull UrlAnnotation urlAnnotation, int i, int i2) {
            Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
            this.f30972d.add(new C3605a(urlAnnotation, i, i2, null, 8, null));
        }

        public final int getLength() {
            return this.f30969a.length();
        }

        public final void pop() {
            if (!this.f30973e.isEmpty()) {
                List list = this.f30973e;
                ((C3605a) list.remove(list.size() - 1)).m59119a(this.f30969a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final int pushStringAnnotation(@NotNull String tag, @NotNull String annotation) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            C3605a c3605a = new C3605a(annotation, this.f30969a.length(), 0, tag, 4, null);
            this.f30973e.add(c3605a);
            this.f30972d.add(c3605a);
            return this.f30973e.size() - 1;
        }

        public final int pushStyle(@NotNull SpanStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            C3605a c3605a = new C3605a(style, this.f30969a.length(), 0, null, 12, null);
            this.f30973e.add(c3605a);
            this.f30970b.add(c3605a);
            return this.f30973e.size() - 1;
        }

        public final int pushTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            C3605a c3605a = new C3605a(ttsAnnotation, this.f30969a.length(), 0, null, 12, null);
            this.f30973e.add(c3605a);
            this.f30972d.add(c3605a);
            return this.f30973e.size() - 1;
        }

        @ExperimentalTextApi
        public final int pushUrlAnnotation(@NotNull UrlAnnotation urlAnnotation) {
            Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
            C3605a c3605a = new C3605a(urlAnnotation, this.f30969a.length(), 0, null, 12, null);
            this.f30973e.add(c3605a);
            this.f30972d.add(c3605a);
            return this.f30973e.size() - 1;
        }

        @NotNull
        public final AnnotatedString toAnnotatedString() {
            String sb = this.f30969a.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "text.toString()");
            List list = this.f30970b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C3605a) list.get(i)).m59118b(this.f30969a.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List list2 = this.f30971c;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList3.add(((C3605a) list2.get(i2)).m59118b(this.f30969a.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List list3 = this.f30972d;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList4.add(((C3605a) list3.get(i3)).m59118b(this.f30969a.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new AnnotatedString(sb, arrayList, arrayList3, arrayList2);
        }

        public Builder(int i) {
            this.f30969a = new StringBuilder(i);
            this.f30970b = new ArrayList();
            this.f30971c = new ArrayList();
            this.f30972d = new ArrayList();
            this.f30973e = new ArrayList();
        }

        public final void addStyle(@NotNull ParagraphStyle style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f30971c.add(new C3605a(style, i, i2, null, 8, null));
        }

        public final void append(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f30969a.append(text);
        }

        /* renamed from: androidx.compose.ui.text.AnnotatedString$Builder$a */
        /* loaded from: classes2.dex */
        public static final class C3605a {

            /* renamed from: a */
            public final Object f30974a;

            /* renamed from: b */
            public final int f30975b;

            /* renamed from: c */
            public int f30976c;

            /* renamed from: d */
            public final String f30977d;

            public C3605a(Object obj, int i, int i2, String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.f30974a = obj;
                this.f30975b = i;
                this.f30976c = i2;
                this.f30977d = tag;
            }

            /* renamed from: a */
            public final void m59119a(int i) {
                this.f30976c = i;
            }

            /* renamed from: b */
            public final Range m59118b(int i) {
                int i2 = this.f30976c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new Range(this.f30974a, this.f30975b, i, this.f30977d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C3605a) {
                    C3605a c3605a = (C3605a) obj;
                    return Intrinsics.areEqual(this.f30974a, c3605a.f30974a) && this.f30975b == c3605a.f30975b && this.f30976c == c3605a.f30976c && Intrinsics.areEqual(this.f30977d, c3605a.f30977d);
                }
                return false;
            }

            public int hashCode() {
                Object obj = this.f30974a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f30975b) * 31) + this.f30976c) * 31) + this.f30977d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f30974a + ", start=" + this.f30975b + ", end=" + this.f30976c + ", tag=" + this.f30977d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public /* synthetic */ C3605a(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public final void pop(int i) {
            if (i < this.f30973e.size()) {
                while (this.f30973e.size() - 1 >= i) {
                    pop();
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + this.f30973e.size()).toString());
        }

        public final int pushStyle(@NotNull ParagraphStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            C3605a c3605a = new C3605a(style, this.f30969a.length(), 0, null, 12, null);
            this.f30973e.add(c3605a);
            this.f30971c.add(c3605a);
            return this.f30973e.size() - 1;
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
            } else {
                this.f30969a.append(charSequence);
            }
            return this;
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i, i2);
            } else {
                this.f30969a.append(charSequence, i, i2);
            }
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull AnnotatedString text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(char c) {
            this.f30969a.append(c);
            return this;
        }

        public final void append(@NotNull AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.f30969a.length();
            this.f30969a.append(text.getText());
            List<Range<SpanStyle>> spanStylesOrNull$ui_text_release = text.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i = 0; i < size; i++) {
                    Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i);
                    addStyle(range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List<Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = text.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i2);
                    addStyle(range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List<Range<? extends Object>> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Range<? extends Object> range3 = annotations$ui_text_release.get(i3);
                    this.f30972d.add(new C3605a(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void append(@NotNull AnnotatedString text, int i, int i2) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.f30969a.length();
            this.f30969a.append((CharSequence) text.getText(), i, i2);
            List access$getLocalSpanStyles = AnnotatedStringKt.access$getLocalSpanStyles(text, i, i2);
            if (access$getLocalSpanStyles != null) {
                int size = access$getLocalSpanStyles.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Range range = (Range) access$getLocalSpanStyles.get(i3);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List access$getLocalParagraphStyles = AnnotatedStringKt.access$getLocalParagraphStyles(text, i, i2);
            if (access$getLocalParagraphStyles != null) {
                int size2 = access$getLocalParagraphStyles.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Range range2 = (Range) access$getLocalParagraphStyles.get(i4);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List access$getLocalAnnotations = AnnotatedStringKt.access$getLocalAnnotations(text, i, i2);
            if (access$getLocalAnnotations != null) {
                int size3 = access$getLocalAnnotations.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Range range3 = (Range) access$getLocalAnnotations.get(i5);
                    this.f30972d.add(new C3605a(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }
    }

    public AnnotatedString(@NotNull String text, @Nullable List<Range<SpanStyle>> list, @Nullable List<Range<ParagraphStyle>> list2, @Nullable List<? extends Range<? extends Object>> list3) {
        List sortedWith;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30965a = text;
        this.f30966b = list;
        this.f30967c = list2;
        this.f30968d = list3;
        if (list2 == null || (sortedWith = CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC16857uu.compareValues(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        })) == null) {
            return;
        }
        int size = sortedWith.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Range range = (Range) sortedWith.get(i2);
            if (range.getStart() >= i) {
                if (range.getEnd() <= this.f30965a.length()) {
                    i = range.getEnd();
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        if (Intrinsics.areEqual(this.f30965a, annotatedString.f30965a) && Intrinsics.areEqual(this.f30966b, annotatedString.f30966b) && Intrinsics.areEqual(this.f30967c, annotatedString.f30967c) && Intrinsics.areEqual(this.f30968d, annotatedString.f30968d)) {
            return true;
        }
        return false;
    }

    public char get(int i) {
        return this.f30965a.charAt(i);
    }

    @Nullable
    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.f30968d;
    }

    public int getLength() {
        return this.f30965a.length();
    }

    @NotNull
    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.f30967c;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    @Nullable
    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.f30967c;
    }

    @NotNull
    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.f30966b;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    @Nullable
    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.f30966b;
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(@NotNull String tag, int i, int i2) {
        List emptyList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        List list = this.f30968d;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                Range range = (Range) obj;
                if ((range.getItem() instanceof String) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return emptyList;
    }

    @NotNull
    public final String getText() {
        return this.f30965a;
    }

    @NotNull
    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i, int i2) {
        List emptyList;
        List list = this.f30968d;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                Range range = (Range) obj;
                if ((range.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return emptyList;
    }

    @ExperimentalTextApi
    @NotNull
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i, int i2) {
        List emptyList;
        List list = this.f30968d;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                Range range = (Range) obj;
                if ((range.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return emptyList;
    }

    public final boolean hasStringAnnotations(@NotNull String tag, int i, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List list = this.f30968d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range range = (Range) list.get(i3);
            if ((range.getItem() instanceof String) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f30965a.hashCode() * 31;
        List list = this.f30966b;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List list2 = this.f30967c;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List list3 = this.f30968d;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Stable
    @NotNull
    public final AnnotatedString plus(@NotNull AnnotatedString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    @NotNull
    /* renamed from: subSequence-5zc-tL8  reason: not valid java name */
    public final AnnotatedString m73096subSequence5zctL8(long j) {
        return subSequence(TextRange.m73214getMinimpl(j), TextRange.m73213getMaximpl(j));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.f30965a;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public AnnotatedString subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.f30965a.length()) {
                return this;
            }
            String substring = this.f30965a.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(substring, AnnotatedStringKt.access$filterRanges(this.f30966b, i, i2), AnnotatedStringKt.access$filterRanges(this.f30967c, i, i2), AnnotatedStringKt.access$filterRanges(this.f30968d, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getItem", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getStart", OperatorName.CURVE_TO, "getEnd", "d", "Ljava/lang/String;", "getTag", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
    /* renamed from: androidx.compose.ui.text.AnnotatedString$Range */
    /* loaded from: classes2.dex */
    public static final class Range<T> {
        public static final int $stable = 0;

        /* renamed from: a */
        public final Object f30978a;

        /* renamed from: b */
        public final int f30979b;

        /* renamed from: c */
        public final int f30980c;

        /* renamed from: d */
        public final String f30981d;

        public Range(T t, int i, int i2, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f30978a = t;
            this.f30979b = i;
            this.f30980c = i2;
            this.f30981d = tag;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.f30978a;
            }
            if ((i3 & 2) != 0) {
                i = range.f30979b;
            }
            if ((i3 & 4) != 0) {
                i2 = range.f30980c;
            }
            if ((i3 & 8) != 0) {
                str = range.f30981d;
            }
            return range.copy(obj, i, i2, str);
        }

        public final T component1() {
            return (T) this.f30978a;
        }

        public final int component2() {
            return this.f30979b;
        }

        public final int component3() {
            return this.f30980c;
        }

        @NotNull
        public final String component4() {
            return this.f30981d;
        }

        @NotNull
        public final Range<T> copy(T t, int i, int i2, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Range<>(t, i, i2, tag);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Range) {
                Range range = (Range) obj;
                return Intrinsics.areEqual(this.f30978a, range.f30978a) && this.f30979b == range.f30979b && this.f30980c == range.f30980c && Intrinsics.areEqual(this.f30981d, range.f30981d);
            }
            return false;
        }

        public final int getEnd() {
            return this.f30980c;
        }

        public final T getItem() {
            return (T) this.f30978a;
        }

        public final int getStart() {
            return this.f30979b;
        }

        @NotNull
        public final String getTag() {
            return this.f30981d;
        }

        public int hashCode() {
            Object obj = this.f30978a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f30979b) * 31) + this.f30980c) * 31) + this.f30981d.hashCode();
        }

        @NotNull
        public String toString() {
            return "Range(item=" + this.f30978a + ", start=" + this.f30979b + ", end=" + this.f30980c + ", tag=" + this.f30981d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(int i, int i2) {
        List emptyList;
        List list = this.f30968d;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                Range range = (Range) obj;
                if ((range.getItem() instanceof String) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return emptyList;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotatedString(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.p003ui.text.AnnotatedString.Range<androidx.compose.p003ui.text.SpanStyle>> r4, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.p003ui.text.AnnotatedString.Range<androidx.compose.p003ui.text.ParagraphStyle>> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L19
            r4 = r1
        L19:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L24
            r5 = r1
        L24:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
