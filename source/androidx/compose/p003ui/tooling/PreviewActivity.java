package androidx.compose.p003ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.compose.ComposeNavigator;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "composableFqn", "i", "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", OperatorName.SET_LINE_JOINSTYLE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "TAG", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.kt\nandroidx/compose/ui/tooling/PreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.PreviewActivity */
/* loaded from: classes2.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f31617a = "PreviewActivity";

    /* renamed from: i */
    public final void m58943i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("PreviewActivity has composable ");
        sb.append(str);
        String substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(str, '.', (String) null, 2, (Object) null);
        String substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            m58942j(substringBeforeLast$default, substringAfterLast$default, stringExtra);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Previewing '");
        sb2.append(substringAfterLast$default);
        sb2.append("' without a parameter provider.");
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-161032931, true, new PreviewActivity$setComposableContent$2(substringBeforeLast$default, substringAfterLast$default)), 1, null);
    }

    /* renamed from: j */
    public final void m58942j(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Previewing '");
        sb.append(str2);
        sb.append("' with parameter provider: '");
        sb.append(str3);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] previewProviderParameters = PreviewUtilsKt.getPreviewProviderParameters(PreviewUtilsKt.asPreviewProviderClass(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1735847170, true, new PreviewActivity$setParameterizedContent$1(previewProviderParameters, str, str2)), 1, null);
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1507674311, true, new PreviewActivity$setParameterizedContent$2(str, str2, previewProviderParameters)), 1, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(ComposeNavigator.NAME)) != null) {
            m58943i(stringExtra);
        }
    }
}
