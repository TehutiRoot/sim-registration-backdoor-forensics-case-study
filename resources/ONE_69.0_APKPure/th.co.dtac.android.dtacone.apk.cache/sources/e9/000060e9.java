package androidx.compose.p003ui.input.key;

import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0006\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m29142d2 = {"nativeKeyCode", "", "Landroidx/compose/ui/input/key/Key;", "getNativeKeyCode-YVgTNJs", "(J)I", PDAnnotationText.NAME_KEY, "(I)J", "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nKey.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Key.android.kt\nandroidx/compose/ui/input/key/Key_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1422:1\n55#2:1423\n48#2:1424\n*S KotlinDebug\n*F\n+ 1 Key.android.kt\nandroidx/compose/ui/input/key/Key_androidKt\n*L\n1419#1:1423\n1421#1:1424\n*E\n"})
/* renamed from: androidx.compose.ui.input.key.Key_androidKt */
/* loaded from: classes2.dex */
public final class Key_androidKt {
    public static final long Key(int i) {
        return Key.m72478constructorimpl((i << 32) | (0 & BodyPartID.bodyIdMax));
    }

    /* renamed from: getNativeKeyCode-YVgTNJs  reason: not valid java name */
    public static final int m72795getNativeKeyCodeYVgTNJs(long j) {
        return (int) (j >> 32);
    }
}