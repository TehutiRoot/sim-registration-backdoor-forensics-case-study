package androidx.compose.animation.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m28851d1 = {"\u0000J\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\\\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00010\nH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0002\b\u0016H\u0080\bø\u0001\u0000\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0012H\u0000\u001a\f\u0010\u0019\u001a\u00020\u0012*\u00020\u0012H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, m28850d2 = {"attrs", "T", "Landroid/util/AttributeSet;", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "styleable", "", "body", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ParameterName;", "name", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/util/AttributeSet;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;[ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "forEachChildOf", "", "Lorg/xmlpull/v1/XmlPullParser;", "tag", "", "action", "Lkotlin/ExtensionFunctionType;", "isAtEnd", "", "seekToStartTag", "animation-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class XmlPullParserUtils_androidKt {
    public static final <T> T attrs(@NotNull AttributeSet attributeSet, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull int[] styleable, @NotNull Function1<? super TypedArray, ? extends T> body) {
        TypedArray a;
        Intrinsics.checkNotNullParameter(attributeSet, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(styleable, "styleable");
        Intrinsics.checkNotNullParameter(body, "body");
        if (theme == null || (a = theme.obtainStyledAttributes(attributeSet, styleable, 0, 0)) == null) {
            a = res.obtainAttributes(attributeSet, styleable);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(a, "a");
            return body.invoke(a);
        } finally {
            InlineMarker.finallyStart(1);
            a.recycle();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void forEachChildOf(@NotNull XmlPullParser xmlPullParser, @NotNull String tag, @NotNull Function1<? super XmlPullParser, Unit> action) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(action, "action");
        xmlPullParser.next();
        while (!isAtEnd(xmlPullParser)) {
            if (xmlPullParser.getEventType() != 3 || !Intrinsics.areEqual(xmlPullParser.getName(), tag)) {
                action.invoke(xmlPullParser);
                xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    public static final boolean isAtEnd(@NotNull XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final XmlPullParser seekToStartTag(@NotNull XmlPullParser xmlPullParser) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
