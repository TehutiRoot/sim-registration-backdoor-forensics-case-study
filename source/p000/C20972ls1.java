package p000;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import ch.qos.logback.core.CoreConstants;
import coil.compose.AsyncImagePainter;
import coil.compose.SubcomposeAsyncImageScope;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ls1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20972ls1 implements SubcomposeAsyncImageScope, BoxScope {

    /* renamed from: a */
    public final BoxScope f71741a;

    /* renamed from: b */
    public final AsyncImagePainter f71742b;

    /* renamed from: c */
    public final String f71743c;

    /* renamed from: d */
    public final Alignment f71744d;

    /* renamed from: e */
    public final ContentScale f71745e;

    /* renamed from: f */
    public final float f71746f;

    /* renamed from: g */
    public final ColorFilter f71747g;

    public C20972ls1(BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.f71741a = boxScope;
        this.f71742b = asyncImagePainter;
        this.f71743c = str;
        this.f71744d = alignment;
        this.f71745e = contentScale;
        this.f71746f = f;
        this.f71747g = colorFilter;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.f71741a.align(modifier, alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20972ls1)) {
            return false;
        }
        C20972ls1 c20972ls1 = (C20972ls1) obj;
        if (Intrinsics.areEqual(this.f71741a, c20972ls1.f71741a) && Intrinsics.areEqual(this.f71742b, c20972ls1.f71742b) && Intrinsics.areEqual(this.f71743c, c20972ls1.f71743c) && Intrinsics.areEqual(this.f71744d, c20972ls1.f71744d) && Intrinsics.areEqual(this.f71745e, c20972ls1.f71745e) && Float.compare(this.f71746f, c20972ls1.f71746f) == 0 && Intrinsics.areEqual(this.f71747g, c20972ls1.f71747g)) {
            return true;
        }
        return false;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public Alignment getAlignment() {
        return this.f71744d;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public float getAlpha() {
        return this.f71746f;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public ColorFilter getColorFilter() {
        return this.f71747g;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public String getContentDescription() {
        return this.f71743c;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public ContentScale getContentScale() {
        return this.f71745e;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public AsyncImagePainter getPainter() {
        return this.f71742b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f71741a.hashCode() * 31) + this.f71742b.hashCode()) * 31;
        String str = this.f71743c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.f71744d.hashCode()) * 31) + this.f71745e.hashCode()) * 31) + Float.floatToIntBits(this.f71746f)) * 31;
        ColorFilter colorFilter = this.f71747g;
        if (colorFilter != null) {
            i = colorFilter.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return this.f71741a.matchParentSize(modifier);
    }

    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f71741a + ", painter=" + this.f71742b + ", contentDescription=" + this.f71743c + ", alignment=" + this.f71744d + ", contentScale=" + this.f71745e + ", alpha=" + this.f71746f + ", colorFilter=" + this.f71747g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
