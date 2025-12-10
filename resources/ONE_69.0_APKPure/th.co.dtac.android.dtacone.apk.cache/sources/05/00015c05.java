package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\n¨\u0006\f"}, m29142d2 = {"ConsentText", "", "consent", "", "modifier", "Landroidx/compose/ui/Modifier;", "isTrueThemes", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ConsentTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextPreview", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nCensentText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CensentText.kt\nth/co/dtac/android/dtacone/widget/compose/consent/CensentTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,108:1\n76#2:109\n1098#3:110\n1313#4,2:111\n*S KotlinDebug\n*F\n+ 1 CensentText.kt\nth/co/dtac/android/dtacone/widget/compose/consent/CensentTextKt\n*L\n26#1:109\n27#1:110\n30#1:111,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.CensentTextKt */
/* loaded from: classes9.dex */
public final class CensentTextKt {
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ConsentText(@org.jetbrains.annotations.NotNull java.lang.String r51, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.Modifier r52, boolean r53, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.widget.compose.consent.CensentTextKt.ConsentText(java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void ConsentTextPreview(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1919305779);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919305779, i, -1, "th.co.dtac.android.dtacone.widget.compose.consent.ConsentTextPreview (CensentText.kt:82)");
            }
            ConsentText("ที่ทรู เราใส่ใจเรื่องข้อมูลส่วนบุคคลของคุณ\r\nการปกป้องข้อมูลส่วนบุคคลเป็นเรื่องสำคัญมากสำหรับเรา ที่ทรู เราใส่ใจในการจัดการข้อมูลส่วนบุคคลของคุณ เราอยากให้คุณมั่นใจว่าการเก็บรวบรวมข้อมูลส่วนบุคคล การวิเคราะห์ และการนำไปใช้เป็นไปโดยคำนึงถึงผลประโยชน์สูงสุดของคุณ\r\nคุณยินยอมให้ บริษัท ทรู มูฟ เอช ยูนิเวอร์แซล คอมมิวนิเคชั่น จำกัด เก็บรวบรวม ใช้ และ/หรือ เปิดเผยข้อมูลส่วนบุคคลของฉันจากการใช้บริการของคุณให้กับบริษัทในกลุ่มทรู ที่ปรากฏอยู่ในประกาศความเป็นส่วนตัว และ/หรือพันธมิตรทางธุรกิจ (เช่น บริษัทรับส่งข้อความ SMS) เพื่อให้ ทรู หรือพันธมิตรฯ นำรายละเอียดดังกล่าวไปวิเคราะห์พฤติกรรมการใช้งานของฉัน เพื่อการเสนอสินค้า การให้บริการ หรือสิทธิประโยชน์ โปรโมชั่นที่เหมาะสมกับความต้องการของฉัน\r\nคุณสามารถศึกษารายละเอียดเพิ่มเติมเกี่ยวกับประกาศความเป็นส่วนตัวของข้อมูลส่วนบุคคลฉบับเต็มของกลุ่มทรูได้ที่ https://www.true.th/true-corporation/site/privacy-policy\r\nหากคุณมีข้อสงสัยเกี่ยวกับการเปลี่ยนแปลงนโยบายของคุณสามารถใช้ช่องทางนี้ โปรดติดต่อศูนย์บริการของทรู โทร. 1242", Modifier.Companion, true, startRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CensentTextKt$ConsentTextPreview$1(i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void TextPreview(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(904069547);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(904069547, i, -1, "th.co.dtac.android.dtacone.widget.compose.consent.TextPreview (CensentText.kt:94)");
            }
            long sp = TextUnitKt.getSp(14);
            long sp2 = TextUnitKt.getSp(24);
            FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
            composer2 = startRestartGroup;
            TextKt.m70882Text4IGK_g("ที่ทรู เราใส่ใจเรื่องข้อมูลส่วนบุคคลของคุณ\r\nการปกป้องข้อมูลส่วนบุคคลเป็นเรื่องสำคัญมากสำหรับเรา ที่ทรู เราใส่ใจในการจัดการข้อมูลส่วนบุคคลของคุณ เราอยากให้คุณมั่นใจว่าการเก็บรวบรวมข้อมูลส่วนบุคคล การวิเคราะห์ และการนำไปใช้เป็นไปโดยคำนึงถึงผลประโยชน์สูงสุดของคุณ\r\nคุณยินยอมให้ บริษัท ทรู มูฟ เอช ยูนิเวอร์แซล คอมมิวนิเคชั่น จำกัด เก็บรวบรวม ใช้ และ/หรือ เปิดเผยข้อมูลส่วนบุคคลของฉันจากการใช้บริการของคุณให้กับบริษัทในกลุ่มทรู ที่ปรากฏอยู่ในประกาศความเป็นส่วนตัว และ/หรือพันธมิตรทางธุรกิจ (เช่น บริษัทรับส่งข้อความ SMS) เพื่อให้ ทรู หรือพันธมิตรฯ นำรายละเอียดดังกล่าวไปวิเคราะห์พฤติกรรมการใช้งานของฉัน เพื่อการเสนอสินค้า การให้บริการ หรือสิทธิประโยชน์ โปรโมชั่นที่เหมาะสมกับความต้องการของฉัน\r\nคุณสามารถศึกษารายละเอียดเพิ่มเติมเกี่ยวกับประกาศความเป็นส่วนตัวของข้อมูลส่วนบุคคลฉบับเต็มของกลุ่มทรูได้ที่ https://www.true.th/true-corporation/site/privacy-policy\r\nหากคุณมีข้อสงสัยเกี่ยวกับการเปลี่ยนแปลงนโยบายของคุณสามารถใช้ช่องทางนี้ โปรดติดต่อศูนย์บริการของทรู โทร. 1242", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, startRestartGroup, 0), sp, FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m73725boximpl(TextAlign.Companion.m73737getStarte0LSkKk()), (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), composer2, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CensentTextKt$TextPreview$1(i));
        }
    }
}